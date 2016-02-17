/**
 */
package crom_l1_composed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Role Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crom_l1_composed.AbstractRoleRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getAbstractRoleRef()
 * @model
 * @generated
 */
public interface AbstractRoleRef extends RoleGroupElement {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(AbstractRole)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getAbstractRoleRef_Ref()
	 * @model required="true"
	 * @generated
	 */
	AbstractRole getRef();

	/**
	 * Sets the value of the '{@link crom_l1_composed.AbstractRoleRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(AbstractRole value);

} // AbstractRoleRef
