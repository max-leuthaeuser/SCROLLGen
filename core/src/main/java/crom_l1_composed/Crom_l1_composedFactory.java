/**
 */
package crom_l1_composed;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see crom_l1_composed.Crom_l1_composedPackage
 * @generated
 */
public interface Crom_l1_composedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Crom_l1_composedFactory eINSTANCE = crom_l1_composed.impl.Crom_l1_composedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Rigid Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rigid Type</em>'.
	 * @generated
	 */
	RigidType createRigidType();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Natural Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Type</em>'.
	 * @generated
	 */
	NaturalType createNaturalType();

	/**
	 * Returns a new object of class '<em>Compartment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Type</em>'.
	 * @generated
	 */
	CompartmentType createCompartmentType();

	/**
	 * Returns a new object of class '<em>Anti Rigid Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anti Rigid Type</em>'.
	 * @generated
	 */
	AntiRigidType createAntiRigidType();

	/**
	 * Returns a new object of class '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Type</em>'.
	 * @generated
	 */
	RoleType createRoleType();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fulfillment</em>'.
	 * @generated
	 */
	Fulfillment createFulfillment();

	/**
	 * Returns a new object of class '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance</em>'.
	 * @generated
	 */
	Inheritance createInheritance();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Role Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Constraint</em>'.
	 * @generated
	 */
	RoleConstraint createRoleConstraint();

	/**
	 * Returns a new object of class '<em>Relationship Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Constraint</em>'.
	 * @generated
	 */
	RelationshipConstraint createRelationshipConstraint();

	/**
	 * Returns a new object of class '<em>Intra Relationship Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intra Relationship Constraint</em>'.
	 * @generated
	 */
	IntraRelationshipConstraint createIntraRelationshipConstraint();

	/**
	 * Returns a new object of class '<em>Inter Relationship Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Relationship Constraint</em>'.
	 * @generated
	 */
	InterRelationshipConstraint createInterRelationshipConstraint();

	/**
	 * Returns a new object of class '<em>Complex Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Constraint</em>'.
	 * @generated
	 */
	ComplexConstraint createComplexConstraint();

	/**
	 * Returns a new object of class '<em>Data Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Inheritance</em>'.
	 * @generated
	 */
	DataInheritance createDataInheritance();

	/**
	 * Returns a new object of class '<em>Natural Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Inheritance</em>'.
	 * @generated
	 */
	NaturalInheritance createNaturalInheritance();

	/**
	 * Returns a new object of class '<em>Compartment Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Inheritance</em>'.
	 * @generated
	 */
	CompartmentInheritance createCompartmentInheritance();

	/**
	 * Returns a new object of class '<em>Role Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Inheritance</em>'.
	 * @generated
	 */
	RoleInheritance createRoleInheritance();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Relationship Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Implication</em>'.
	 * @generated
	 */
	RelationshipImplication createRelationshipImplication();

	/**
	 * Returns a new object of class '<em>Relationship Exclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Exclusion</em>'.
	 * @generated
	 */
	RelationshipExclusion createRelationshipExclusion();

	/**
	 * Returns a new object of class '<em>Irreflexive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irreflexive</em>'.
	 * @generated
	 */
	Irreflexive createIrreflexive();

	/**
	 * Returns a new object of class '<em>Cyclic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cyclic</em>'.
	 * @generated
	 */
	Cyclic createCyclic();

	/**
	 * Returns a new object of class '<em>Total</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Total</em>'.
	 * @generated
	 */
	Total createTotal();

	/**
	 * Returns a new object of class '<em>Acyclic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acyclic</em>'.
	 * @generated
	 */
	Acyclic createAcyclic();

	/**
	 * Returns a new object of class '<em>Reflexive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflexive</em>'.
	 * @generated
	 */
	Reflexive createReflexive();

	/**
	 * Returns a new object of class '<em>Role Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Group</em>'.
	 * @generated
	 */
	RoleGroup createRoleGroup();

	/**
	 * Returns a new object of class '<em>Role Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Implication</em>'.
	 * @generated
	 */
	RoleImplication createRoleImplication();

	/**
	 * Returns a new object of class '<em>Role Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Equivalence</em>'.
	 * @generated
	 */
	RoleEquivalence createRoleEquivalence();

	/**
	 * Returns a new object of class '<em>Role Prohibition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Prohibition</em>'.
	 * @generated
	 */
	RoleProhibition createRoleProhibition();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	Part createPart();

	/**
	 * Returns a new object of class '<em>Parthood Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parthood Constraint</em>'.
	 * @generated
	 */
	ParthoodConstraint createParthoodConstraint();

	/**
	 * Returns a new object of class '<em>Abstract Role Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Role Ref</em>'.
	 * @generated
	 */
	AbstractRoleRef createAbstractRoleRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Crom_l1_composedPackage getCrom_l1_composedPackage();

} //Crom_l1_composedFactory
