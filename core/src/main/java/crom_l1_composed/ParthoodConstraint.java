/**
 */
package crom_l1_composed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parthood Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.ParthoodConstraint#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getParthoodConstraint()
 * @model
 * @generated
 */
public interface ParthoodConstraint extends IntraRelationshipConstraint {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link crom_l1_composed.Parthood}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see crom_l1_composed.Parthood
	 * @see #setKind(Parthood)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getParthoodConstraint_Kind()
	 * @model required="true"
	 * @generated
	 */
	Parthood getKind();

	/**
	 * Sets the value of the '{@link crom_l1_composed.ParthoodConstraint#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see crom_l1_composed.Parthood
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Parthood value);

} // ParthoodConstraint
