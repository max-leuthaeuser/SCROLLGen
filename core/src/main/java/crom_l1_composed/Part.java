/**
 */
package crom_l1_composed;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crom_l1_composed.Part#getWhole <em>Whole</em>}</li>
 *   <li>{@link crom_l1_composed.Part#getLower <em>Lower</em>}</li>
 *   <li>{@link crom_l1_composed.Part#getUpper <em>Upper</em>}</li>
 *   <li>{@link crom_l1_composed.Part#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject {
	/**
	 * Returns the value of the '<em><b>Whole</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link crom_l1_composed.CompartmentType#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whole</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole</em>' container reference.
	 * @see #setWhole(CompartmentType)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getPart_Whole()
	 * @see crom_l1_composed.CompartmentType#getParts
	 * @model opposite="parts" required="true" transient="false"
	 * @generated
	 */
	CompartmentType getWhole();

	/**
	 * Sets the value of the '{@link crom_l1_composed.Part#getWhole <em>Whole</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole</em>' container reference.
	 * @see #getWhole()
	 * @generated
	 */
	void setWhole(CompartmentType value);

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
	 * @see crom_l1_composed.Crom_l1_composedPackage#getPart_Lower()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link crom_l1_composed.Part#getLower <em>Lower</em>}' attribute.
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
	 * @see crom_l1_composed.Crom_l1_composedPackage#getPart_Upper()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link crom_l1_composed.Part#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(AbstractRole)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getPart_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractRole getRole();

	/**
	 * Sets the value of the '{@link crom_l1_composed.Part#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(AbstractRole value);

} // Part
