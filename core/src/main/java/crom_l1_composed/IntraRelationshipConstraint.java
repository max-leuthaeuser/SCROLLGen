/**
 */
package crom_l1_composed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intra Relationship Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.IntraRelationshipConstraint#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getIntraRelationshipConstraint()
 * @model
 * @generated
 */
public interface IntraRelationshipConstraint extends RelationshipConstraint {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relationship)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getIntraRelationshipConstraint_Relation()
	 * @model
	 * @generated
	 */
	Relationship getRelation();

	/**
	 * Sets the value of the '{@link crom_l1_composed.IntraRelationshipConstraint#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relationship value);

} // IntraRelationshipConstraint
