package importer

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.{EObject, EPackage}

/**
  * Trait providing functionality for importing ecore models.
  * Remember to set the <code>path</code>, <code>extention</code> and <code>packageInstance</code> variable!
  */
trait ECoreImporter[E <: EObject] {
  var path: String = _
  var extention: String = _
  var packageInstance: EPackage = _

  /**
    * Load and imports an ecore model.
    * Remember to set the <code>path</code> variable!
    *
    * @return the imported model
    */
  def loadModel(): E = {
    require(null != path && path.nonEmpty)
    require(null != extention && extention.nonEmpty)
    require(null != packageInstance)

    // Initialize the model
    packageInstance.eClass()

    // Register the XMI resource factory for the .website extension
    val reg = Resource.Factory.Registry.INSTANCE
    val m = reg.getExtensionToFactoryMap
    m.put(extention, new XMIResourceFactoryImpl())
    // Obtain a new resource set
    val resSet = new ResourceSetImpl()
    // Get the resource
    val resource = resSet.getResource(URI.createURI(path), true)
    // Get the first model element and cast it to the right type
    resource.getContents.get(0).asInstanceOf[E]
  }
}