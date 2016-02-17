/**
 */
package crom_l1_composed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crom_l1_composed.Type#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link crom_l1_composed.Type#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getType()
 * @model
 * @generated
 */
public interface Type extends RelationTarget {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.Attribute}.
	 * It is bidirectional and its opposite is '{@link crom_l1_composed.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getType_Attributes()
	 * @see crom_l1_composed.Attribute#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.Operation}.
	 * It is bidirectional and its opposite is '{@link crom_l1_composed.Operation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getType_Operations()
	 * @see crom_l1_composed.Operation#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Type
