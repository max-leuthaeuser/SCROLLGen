/**
 */
package crom_l1_composed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crom_l1_composed.Relationship#getFirst <em>First</em>}</li>
 *   <li>{@link crom_l1_composed.Relationship#getSecond <em>Second</em>}</li>
 *   <li>{@link crom_l1_composed.Relationship#getDirection <em>Direction</em>}</li>
 *   <li>{@link crom_l1_composed.Relationship#getTr_constraints <em>Tr constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Relation, NamedElement {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(Place)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRelationship_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Place getFirst();

	/**
	 * Sets the value of the '{@link crom_l1_composed.Relationship#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Place value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(Place)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRelationship_Second()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Place getSecond();

	/**
	 * Sets the value of the '{@link crom_l1_composed.Relationship#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Place value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link crom_l1_composed.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see crom_l1_composed.Direction
	 * @see #setDirection(Direction)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRelationship_Direction()
	 * @model required="true"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link crom_l1_composed.Relationship#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see crom_l1_composed.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Tr constraints</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.IntraRelationshipConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr constraints</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRelationship_Tr_constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IntraRelationshipConstraint> getTr_constraints();

} // Relationship
