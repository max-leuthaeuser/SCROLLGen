/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Crom_l1_composedFactoryImpl extends EFactoryImpl implements Crom_l1_composedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Crom_l1_composedFactory init() {
		try {
			Crom_l1_composedFactory theCrom_l1_composedFactory = (Crom_l1_composedFactory)EPackage.Registry.INSTANCE.getEFactory(Crom_l1_composedPackage.eNS_URI);
			if (theCrom_l1_composedFactory != null) {
				return theCrom_l1_composedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Crom_l1_composedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crom_l1_composedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Crom_l1_composedPackage.MODEL: return createModel();
			case Crom_l1_composedPackage.RIGID_TYPE: return createRigidType();
			case Crom_l1_composedPackage.GROUP: return createGroup();
			case Crom_l1_composedPackage.PARAMETER: return createParameter();
			case Crom_l1_composedPackage.OPERATION: return createOperation();
			case Crom_l1_composedPackage.ATTRIBUTE: return createAttribute();
			case Crom_l1_composedPackage.TYPE: return createType();
			case Crom_l1_composedPackage.DATA_TYPE: return createDataType();
			case Crom_l1_composedPackage.NATURAL_TYPE: return createNaturalType();
			case Crom_l1_composedPackage.COMPARTMENT_TYPE: return createCompartmentType();
			case Crom_l1_composedPackage.ANTI_RIGID_TYPE: return createAntiRigidType();
			case Crom_l1_composedPackage.ROLE_TYPE: return createRoleType();
			case Crom_l1_composedPackage.RELATIONSHIP: return createRelationship();
			case Crom_l1_composedPackage.FULFILLMENT: return createFulfillment();
			case Crom_l1_composedPackage.INHERITANCE: return createInheritance();
			case Crom_l1_composedPackage.CONSTRAINT: return createConstraint();
			case Crom_l1_composedPackage.ROLE_CONSTRAINT: return createRoleConstraint();
			case Crom_l1_composedPackage.RELATIONSHIP_CONSTRAINT: return createRelationshipConstraint();
			case Crom_l1_composedPackage.INTRA_RELATIONSHIP_CONSTRAINT: return createIntraRelationshipConstraint();
			case Crom_l1_composedPackage.INTER_RELATIONSHIP_CONSTRAINT: return createInterRelationshipConstraint();
			case Crom_l1_composedPackage.COMPLEX_CONSTRAINT: return createComplexConstraint();
			case Crom_l1_composedPackage.DATA_INHERITANCE: return createDataInheritance();
			case Crom_l1_composedPackage.NATURAL_INHERITANCE: return createNaturalInheritance();
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE: return createCompartmentInheritance();
			case Crom_l1_composedPackage.ROLE_INHERITANCE: return createRoleInheritance();
			case Crom_l1_composedPackage.PLACE: return createPlace();
			case Crom_l1_composedPackage.RELATIONSHIP_IMPLICATION: return createRelationshipImplication();
			case Crom_l1_composedPackage.RELATIONSHIP_EXCLUSION: return createRelationshipExclusion();
			case Crom_l1_composedPackage.IRREFLEXIVE: return createIrreflexive();
			case Crom_l1_composedPackage.CYCLIC: return createCyclic();
			case Crom_l1_composedPackage.TOTAL: return createTotal();
			case Crom_l1_composedPackage.ACYCLIC: return createAcyclic();
			case Crom_l1_composedPackage.REFLEXIVE: return createReflexive();
			case Crom_l1_composedPackage.ROLE_GROUP: return createRoleGroup();
			case Crom_l1_composedPackage.ROLE_IMPLICATION: return createRoleImplication();
			case Crom_l1_composedPackage.ROLE_EQUIVALENCE: return createRoleEquivalence();
			case Crom_l1_composedPackage.ROLE_PROHIBITION: return createRoleProhibition();
			case Crom_l1_composedPackage.PART: return createPart();
			case Crom_l1_composedPackage.PARTHOOD_CONSTRAINT: return createParthoodConstraint();
			case Crom_l1_composedPackage.ABSTRACT_ROLE_REF: return createAbstractRoleRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Crom_l1_composedPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case Crom_l1_composedPackage.PARTHOOD:
				return createParthoodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Crom_l1_composedPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case Crom_l1_composedPackage.PARTHOOD:
				return convertParthoodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidType createRigidType() {
		RigidTypeImpl rigidType = new RigidTypeImpl();
		return rigidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalType createNaturalType() {
		NaturalTypeImpl naturalType = new NaturalTypeImpl();
		return naturalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType createCompartmentType() {
		CompartmentTypeImpl compartmentType = new CompartmentTypeImpl();
		return compartmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntiRigidType createAntiRigidType() {
		AntiRigidTypeImpl antiRigidType = new AntiRigidTypeImpl();
		return antiRigidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fulfillment createFulfillment() {
		FulfillmentImpl fulfillment = new FulfillmentImpl();
		return fulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConstraint createRoleConstraint() {
		RoleConstraintImpl roleConstraint = new RoleConstraintImpl();
		return roleConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConstraint createRelationshipConstraint() {
		RelationshipConstraintImpl relationshipConstraint = new RelationshipConstraintImpl();
		return relationshipConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntraRelationshipConstraint createIntraRelationshipConstraint() {
		IntraRelationshipConstraintImpl intraRelationshipConstraint = new IntraRelationshipConstraintImpl();
		return intraRelationshipConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterRelationshipConstraint createInterRelationshipConstraint() {
		InterRelationshipConstraintImpl interRelationshipConstraint = new InterRelationshipConstraintImpl();
		return interRelationshipConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexConstraint createComplexConstraint() {
		ComplexConstraintImpl complexConstraint = new ComplexConstraintImpl();
		return complexConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInheritance createDataInheritance() {
		DataInheritanceImpl dataInheritance = new DataInheritanceImpl();
		return dataInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalInheritance createNaturalInheritance() {
		NaturalInheritanceImpl naturalInheritance = new NaturalInheritanceImpl();
		return naturalInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentInheritance createCompartmentInheritance() {
		CompartmentInheritanceImpl compartmentInheritance = new CompartmentInheritanceImpl();
		return compartmentInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInheritance createRoleInheritance() {
		RoleInheritanceImpl roleInheritance = new RoleInheritanceImpl();
		return roleInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipImplication createRelationshipImplication() {
		RelationshipImplicationImpl relationshipImplication = new RelationshipImplicationImpl();
		return relationshipImplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipExclusion createRelationshipExclusion() {
		RelationshipExclusionImpl relationshipExclusion = new RelationshipExclusionImpl();
		return relationshipExclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Irreflexive createIrreflexive() {
		IrreflexiveImpl irreflexive = new IrreflexiveImpl();
		return irreflexive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cyclic createCyclic() {
		CyclicImpl cyclic = new CyclicImpl();
		return cyclic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Total createTotal() {
		TotalImpl total = new TotalImpl();
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Acyclic createAcyclic() {
		AcyclicImpl acyclic = new AcyclicImpl();
		return acyclic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reflexive createReflexive() {
		ReflexiveImpl reflexive = new ReflexiveImpl();
		return reflexive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleGroup createRoleGroup() {
		RoleGroupImpl roleGroup = new RoleGroupImpl();
		return roleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleImplication createRoleImplication() {
		RoleImplicationImpl roleImplication = new RoleImplicationImpl();
		return roleImplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleEquivalence createRoleEquivalence() {
		RoleEquivalenceImpl roleEquivalence = new RoleEquivalenceImpl();
		return roleEquivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProhibition createRoleProhibition() {
		RoleProhibitionImpl roleProhibition = new RoleProhibitionImpl();
		return roleProhibition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParthoodConstraint createParthoodConstraint() {
		ParthoodConstraintImpl parthoodConstraint = new ParthoodConstraintImpl();
		return parthoodConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRoleRef createAbstractRoleRef() {
		AbstractRoleRefImpl abstractRoleRef = new AbstractRoleRefImpl();
		return abstractRoleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parthood createParthoodFromString(EDataType eDataType, String initialValue) {
		Parthood result = Parthood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParthoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crom_l1_composedPackage getCrom_l1_composedPackage() {
		return (Crom_l1_composedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Crom_l1_composedPackage getPackage() {
		return Crom_l1_composedPackage.eINSTANCE;
	}

} //Crom_l1_composedFactoryImpl
