/**
 */
package crom_l1_composed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.CompartmentInheritance#getSuper <em>Super</em>}</li>
 *   <li>{@link crom_l1_composed.CompartmentInheritance#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentInheritance()
 * @model
 * @generated
 */
public interface CompartmentInheritance extends Inheritance {
	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(CompartmentType)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentInheritance_Super()
	 * @model required="true"
	 * @generated
	 */
	CompartmentType getSuper();

	/**
	 * Sets the value of the '{@link crom_l1_composed.CompartmentInheritance#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(CompartmentType value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' reference.
	 * @see #setSub(CompartmentType)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getCompartmentInheritance_Sub()
	 * @model required="true"
	 * @generated
	 */
	CompartmentType getSub();

	/**
	 * Sets the value of the '{@link crom_l1_composed.CompartmentInheritance#getSub <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(CompartmentType value);

} // CompartmentInheritance
