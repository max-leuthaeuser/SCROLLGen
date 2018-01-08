/**
 */
package crom_l1_composed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.RoleConstraint#getFirst <em>First</em>}</li>
 *   <li>{@link crom_l1_composed.RoleConstraint#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleConstraint()
 * @model
 * @generated
 */
public interface RoleConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(AbstractRole)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleConstraint_First()
	 * @model required="true"
	 * @generated
	 */
	AbstractRole getFirst();

	/**
	 * Sets the value of the '{@link crom_l1_composed.RoleConstraint#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(AbstractRole value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(AbstractRole)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleConstraint_Second()
	 * @model required="true"
	 * @generated
	 */
	AbstractRole getSecond();

	/**
	 * Sets the value of the '{@link crom_l1_composed.RoleConstraint#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(AbstractRole value);

} // RoleConstraint
