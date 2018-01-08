/**
 */
package crom_l1_composed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.RoleGroup#getLower <em>Lower</em>}</li>
 *   <li>{@link crom_l1_composed.RoleGroup#getUpper <em>Upper</em>}</li>
 *   <li>{@link crom_l1_composed.RoleGroup#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleGroup()
 * @model
 * @generated
 */
public interface RoleGroup extends AbstractRole, RelationTarget {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleGroup_Lower()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link crom_l1_composed.RoleGroup#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleGroup_Upper()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link crom_l1_composed.RoleGroup#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link crom_l1_composed.RoleGroupElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRoleGroup_Elements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<RoleGroupElement> getElements();

} // RoleGroup
