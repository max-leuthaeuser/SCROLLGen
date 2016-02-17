/**
 */
package crom_l1_composed;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crom_l1_composed.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link crom_l1_composed.Model#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getModel_Elements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getElements();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getModel_Relations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Relation> getRelations();

} // Model
