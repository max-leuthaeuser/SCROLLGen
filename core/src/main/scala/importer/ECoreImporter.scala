package importer

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.{EObject, EPackage}

/**
  * Trait providing functionality for importing ecore models.
  * Remember to set the <code>path</code>, <code>extension</code> and <code>packageInstance</code> variable!
  */
trait ECoreImporter[E <: EObject] {
  var path: String = _
  var extension: String = _
  var packageInstance: EPackage = _

  /**
    * Load and imports an ecore model.
    * Remember to set the <code>path</code> variable!
    *
    * @return the imported model
    */
  def loadModel(): E = {
    require(null != path && path.nonEmpty, "Invalid model path!")
    require(null != extension && extension.nonEmpty, "Invalid model file extension!")
    require(null != packageInstance)

    // Initialize the model
    packageInstance.eClass()

    // Register the XMI resource factory for the .website extension
    val reg = Resource.Factory.Registry.INSTANCE
    val m = reg.getExtensionToFactoryMap
    m.put(extension, new XMIResourceFactoryImpl())
    // Obtain a new resource set
    val resSet = new ResourceSetImpl()
    // Get the resource
    val resource = resSet.getResource(URI.createURI(path), true)
    // Get the first model element and cast it to the right type
    resource.getContents.get(0).asInstanceOf[E]
  }
}