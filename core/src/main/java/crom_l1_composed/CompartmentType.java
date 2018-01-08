/**
 */
package crom_l1_composed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.CompartmentType#getParts <em>Parts</em>}</li>
 *   <li>{@link crom_l1_composed.CompartmentType#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link crom_l1_composed.CompartmentType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link crom_l1_composed.CompartmentType#getTr_extends <em>Tr extends</em>}</li>
 *   <li>{@link crom_l1_composed.CompartmentType#getContains <em>Contains</em>}</li>
 *   <li>{@link crom_l1_composed.CompartmentType#getFulfillments <em>Fulfillments</em>}</li>
 * </ul>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentType()
 * @model
 * @generated
 */
public interface CompartmentType extends RigidType {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.Part}.
	 * It is bidirectional and its opposite is '{@link crom_l1_composed.Part#getWhole <em>Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentType_Parts()
	 * @see crom_l1_composed.Part#getWhole
	 * @model opposite="whole" containment="true" ordered="false"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentType_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Tr extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr extends</em>' reference.
	 * @see #setTr_extends(CompartmentType)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentType_Tr_extends()
	 * @model
	 * @generated
	 */
	CompartmentType getTr_extends();

	/**
	 * Sets the value of the '{@link crom_l1_composed.CompartmentType#getTr_extends <em>Tr extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr extends</em>' reference.
	 * @see #getTr_extends()
	 * @generated
	 */
	void setTr_extends(CompartmentType value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.CompartmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentType_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompartmentType> getContains();

	/**
	 * Returns the value of the '<em><b>Fulfillments</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.Fulfillment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillments</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentType_Fulfillments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fulfillment> getFulfillments();

} // CompartmentType
