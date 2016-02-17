/**
 */
package crom_l1_composed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crom_l1_composed.DataType#isSerializable <em>Serializable</em>}</li>
 *   <li>{@link crom_l1_composed.DataType#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends RigidType {
	/**
	 * Returns the value of the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serializable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializable</em>' attribute.
	 * @see #setSerializable(boolean)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getDataType_Serializable()
	 * @model required="true"
	 * @generated
	 */
	boolean isSerializable();

	/**
	 * Sets the value of the '{@link crom_l1_composed.DataType#isSerializable <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serializable</em>' attribute.
	 * @see #isSerializable()
	 * @generated
	 */
	void setSerializable(boolean value);

	/**
	 * Returns the value of the '<em><b>Tr extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr extends</em>' reference.
	 * @see #setTr_extends(DataType)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getDataType_Tr_extends()
	 * @model
	 * @generated
	 */
	DataType getTr_extends();

	/**
	 * Sets the value of the '{@link crom_l1_composed.DataType#getTr_extends <em>Tr extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr extends</em>' reference.
	 * @see #getTr_extends()
	 * @generated
	 */
	void setTr_extends(DataType value);

} // DataType
