import org.eclipse.emf.ecore.EObject

trait Generator[E <: EObject] {
  def generate(model: E): String
}
