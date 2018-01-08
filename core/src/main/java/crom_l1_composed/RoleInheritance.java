/**
 */
package crom_l1_composed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.RoleInheritance#getSuper <em>Super</em>}</li>
 *   <li>{@link crom_l1_composed.RoleInheritance#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleInheritance()
 * @model
 * @generated
 */
public interface RoleInheritance extends Inheritance {
	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(RoleType)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleInheritance_Super()
	 * @model required="true"
	 * @generated
	 */
	RoleType getSuper();

	/**
	 * Sets the value of the '{@link crom_l1_composed.RoleInheritance#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(RoleType value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' reference.
	 * @see #setSub(RoleType)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleInheritance_Sub()
	 * @model required="true"
	 * @generated
	 */
	RoleType getSub();

	/**
	 * Sets the value of the '{@link crom_l1_composed.RoleInheritance#getSub <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(RoleType value);

} // RoleInheritance
