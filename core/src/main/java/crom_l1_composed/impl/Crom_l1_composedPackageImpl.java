/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.AbstractRole;
import crom_l1_composed.AbstractRoleRef;
import crom_l1_composed.Acyclic;
import crom_l1_composed.AntiRigidType;
import crom_l1_composed.Attribute;
import crom_l1_composed.CompartmentInheritance;
import crom_l1_composed.CompartmentType;
import crom_l1_composed.ComplexConstraint;
import crom_l1_composed.Constraint;
import crom_l1_composed.Crom_l1_composedFactory;
import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.Cyclic;
import crom_l1_composed.DataInheritance;
import crom_l1_composed.DataType;
import crom_l1_composed.Direction;
import crom_l1_composed.Fulfillment;
import crom_l1_composed.Group;
import crom_l1_composed.Inheritance;
import crom_l1_composed.InterRelationshipConstraint;
import crom_l1_composed.IntraRelationshipConstraint;
import crom_l1_composed.Irreflexive;
import crom_l1_composed.Model;
import crom_l1_composed.ModelElement;
import crom_l1_composed.NamedElement;
import crom_l1_composed.NaturalInheritance;
import crom_l1_composed.NaturalType;
import crom_l1_composed.Operation;
import crom_l1_composed.Parameter;
import crom_l1_composed.Part;
import crom_l1_composed.Parthood;
import crom_l1_composed.ParthoodConstraint;
import crom_l1_composed.Place;
import crom_l1_composed.Reflexive;
import crom_l1_composed.Relation;
import crom_l1_composed.RelationTarget;
import crom_l1_composed.Relationship;
import crom_l1_composed.RelationshipConstraint;
import crom_l1_composed.RelationshipExclusion;
import crom_l1_composed.RelationshipImplication;
import crom_l1_composed.RigidType;
import crom_l1_composed.RoleConstraint;
import crom_l1_composed.RoleEquivalence;
import crom_l1_composed.RoleGroup;
import crom_l1_composed.RoleGroupElement;
import crom_l1_composed.RoleImplication;
import crom_l1_composed.RoleInheritance;
import crom_l1_composed.RoleProhibition;
import crom_l1_composed.RoleType;
import crom_l1_composed.Total;
import crom_l1_composed.Type;
import crom_l1_composed.TypedElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Crom_l1_composedPackageImpl extends EPackageImpl implements Crom_l1_composedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rigidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antiRigidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intraRelationshipConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interRelationshipConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipImplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipExclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irreflexiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acyclicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleImplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEquivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleProhibitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parthoodConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleGroupElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRoleRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parthoodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see crom_l1_composed.Crom_l1_composedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Crom_l1_composedPackageImpl() {
		super(eNS_URI, Crom_l1_composedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Crom_l1_composedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Crom_l1_composedPackage init() {
		if (isInited) return (Crom_l1_composedPackage)EPackage.Registry.INSTANCE.getEPackage(Crom_l1_composedPackage.eNS_URI);

		// Obtain or create and register package
		Crom_l1_composedPackageImpl theCrom_l1_composedPackage = (Crom_l1_composedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Crom_l1_composedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Crom_l1_composedPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCrom_l1_composedPackage.createPackageContents();

		// Initialize created meta-data
		theCrom_l1_composedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCrom_l1_composedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Crom_l1_composedPackage.eNS_URI, theCrom_l1_composedPackage);
		return theCrom_l1_composedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Relations() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRigidType() {
		return rigidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelation__GetSource() {
		return relationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelation__GetTarget() {
		return relationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Params() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Operation() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Owner() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Owner() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Attributes() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Operations() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Serializable() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Tr_extends() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalType() {
		return naturalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaturalType_Tr_extends() {
		return (EReference)naturalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentType() {
		return compartmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentType_Parts() {
		return (EReference)compartmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentType_Relationships() {
		return (EReference)compartmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentType_Constraints() {
		return (EReference)compartmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentType_Tr_extends() {
		return (EReference)compartmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntiRigidType() {
		return antiRigidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleType_Tr_extends() {
		return (EReference)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_First() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Second() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Direction() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Tr_constraints() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillment() {
		return fulfillmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillment_Filled() {
		return (EReference)fulfillmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillment_Filler() {
		return (EReference)fulfillmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleConstraint() {
		return roleConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConstraint_First() {
		return (EReference)roleConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConstraint_Second() {
		return (EReference)roleConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipConstraint() {
		return relationshipConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntraRelationshipConstraint() {
		return intraRelationshipConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntraRelationshipConstraint_Relation() {
		return (EReference)intraRelationshipConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterRelationshipConstraint() {
		return interRelationshipConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterRelationshipConstraint_First() {
		return (EReference)interRelationshipConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterRelationshipConstraint_Second() {
		return (EReference)interRelationshipConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexConstraint() {
		return complexConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexConstraint_Targets() {
		return (EReference)complexConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexConstraint_Expression() {
		return (EAttribute)complexConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInheritance() {
		return dataInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInheritance_Super() {
		return (EReference)dataInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInheritance_Sub() {
		return (EReference)dataInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalInheritance() {
		return naturalInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaturalInheritance_Super() {
		return (EReference)naturalInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaturalInheritance_Sub() {
		return (EReference)naturalInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentInheritance() {
		return compartmentInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentInheritance_Super() {
		return (EReference)compartmentInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentInheritance_Sub() {
		return (EReference)compartmentInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInheritance() {
		return roleInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInheritance_Super() {
		return (EReference)roleInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInheritance_Sub() {
		return (EReference)roleInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Lower() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Upper() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Holder() {
		return (EReference)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipImplication() {
		return relationshipImplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipExclusion() {
		return relationshipExclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationTarget() {
		return relationTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationTarget_Incoming() {
		return (EReference)relationTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationTarget_Outgoing() {
		return (EReference)relationTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrreflexive() {
		return irreflexiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclic() {
		return cyclicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotal() {
		return totalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcyclic() {
		return acyclicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflexive() {
		return reflexiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRole() {
		return abstractRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleGroup() {
		return roleGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleGroup_Lower() {
		return (EAttribute)roleGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleGroup_Upper() {
		return (EAttribute)roleGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleGroup_Elements() {
		return (EReference)roleGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleImplication() {
		return roleImplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleEquivalence() {
		return roleEquivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleProhibition() {
		return roleProhibitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_Whole() {
		return (EReference)partEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_Lower() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_Upper() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_Role() {
		return (EReference)partEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParthoodConstraint() {
		return parthoodConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParthoodConstraint_Kind() {
		return (EAttribute)parthoodConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleGroupElement() {
		return roleGroupElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRoleRef() {
		return abstractRoleRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRoleRef_Ref() {
		return (EReference)abstractRoleRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParthood() {
		return parthoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crom_l1_composedFactory getCrom_l1_composedFactory() {
		return (Crom_l1_composedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		modelElementEClass = createEClass(MODEL_ELEMENT);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ELEMENTS);
		createEReference(modelEClass, MODEL__RELATIONS);

		rigidTypeEClass = createEClass(RIGID_TYPE);

		groupEClass = createEClass(GROUP);

		relationEClass = createEClass(RELATION);
		createEOperation(relationEClass, RELATION___GET_SOURCE);
		createEOperation(relationEClass, RELATION___GET_TARGET);

		parameterEClass = createEClass(PARAMETER);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__PARAMS);
		createEAttribute(operationEClass, OPERATION__OPERATION);
		createEReference(operationEClass, OPERATION__OWNER);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__OWNER);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__ATTRIBUTES);
		createEReference(typeEClass, TYPE__OPERATIONS);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__SERIALIZABLE);
		createEReference(dataTypeEClass, DATA_TYPE__TR_EXTENDS);

		naturalTypeEClass = createEClass(NATURAL_TYPE);
		createEReference(naturalTypeEClass, NATURAL_TYPE__TR_EXTENDS);

		compartmentTypeEClass = createEClass(COMPARTMENT_TYPE);
		createEReference(compartmentTypeEClass, COMPARTMENT_TYPE__PARTS);
		createEReference(compartmentTypeEClass, COMPARTMENT_TYPE__RELATIONSHIPS);
		createEReference(compartmentTypeEClass, COMPARTMENT_TYPE__CONSTRAINTS);
		createEReference(compartmentTypeEClass, COMPARTMENT_TYPE__TR_EXTENDS);

		antiRigidTypeEClass = createEClass(ANTI_RIGID_TYPE);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEReference(roleTypeEClass, ROLE_TYPE__TR_EXTENDS);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__FIRST);
		createEReference(relationshipEClass, RELATIONSHIP__SECOND);
		createEAttribute(relationshipEClass, RELATIONSHIP__DIRECTION);
		createEReference(relationshipEClass, RELATIONSHIP__TR_CONSTRAINTS);

		fulfillmentEClass = createEClass(FULFILLMENT);
		createEReference(fulfillmentEClass, FULFILLMENT__FILLED);
		createEReference(fulfillmentEClass, FULFILLMENT__FILLER);

		inheritanceEClass = createEClass(INHERITANCE);

		constraintEClass = createEClass(CONSTRAINT);

		roleConstraintEClass = createEClass(ROLE_CONSTRAINT);
		createEReference(roleConstraintEClass, ROLE_CONSTRAINT__FIRST);
		createEReference(roleConstraintEClass, ROLE_CONSTRAINT__SECOND);

		relationshipConstraintEClass = createEClass(RELATIONSHIP_CONSTRAINT);

		intraRelationshipConstraintEClass = createEClass(INTRA_RELATIONSHIP_CONSTRAINT);
		createEReference(intraRelationshipConstraintEClass, INTRA_RELATIONSHIP_CONSTRAINT__RELATION);

		interRelationshipConstraintEClass = createEClass(INTER_RELATIONSHIP_CONSTRAINT);
		createEReference(interRelationshipConstraintEClass, INTER_RELATIONSHIP_CONSTRAINT__FIRST);
		createEReference(interRelationshipConstraintEClass, INTER_RELATIONSHIP_CONSTRAINT__SECOND);

		complexConstraintEClass = createEClass(COMPLEX_CONSTRAINT);
		createEReference(complexConstraintEClass, COMPLEX_CONSTRAINT__TARGETS);
		createEAttribute(complexConstraintEClass, COMPLEX_CONSTRAINT__EXPRESSION);

		dataInheritanceEClass = createEClass(DATA_INHERITANCE);
		createEReference(dataInheritanceEClass, DATA_INHERITANCE__SUPER);
		createEReference(dataInheritanceEClass, DATA_INHERITANCE__SUB);

		naturalInheritanceEClass = createEClass(NATURAL_INHERITANCE);
		createEReference(naturalInheritanceEClass, NATURAL_INHERITANCE__SUPER);
		createEReference(naturalInheritanceEClass, NATURAL_INHERITANCE__SUB);

		compartmentInheritanceEClass = createEClass(COMPARTMENT_INHERITANCE);
		createEReference(compartmentInheritanceEClass, COMPARTMENT_INHERITANCE__SUPER);
		createEReference(compartmentInheritanceEClass, COMPARTMENT_INHERITANCE__SUB);

		roleInheritanceEClass = createEClass(ROLE_INHERITANCE);
		createEReference(roleInheritanceEClass, ROLE_INHERITANCE__SUPER);
		createEReference(roleInheritanceEClass, ROLE_INHERITANCE__SUB);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__LOWER);
		createEAttribute(placeEClass, PLACE__UPPER);
		createEReference(placeEClass, PLACE__HOLDER);

		relationshipImplicationEClass = createEClass(RELATIONSHIP_IMPLICATION);

		relationshipExclusionEClass = createEClass(RELATIONSHIP_EXCLUSION);

		relationTargetEClass = createEClass(RELATION_TARGET);
		createEReference(relationTargetEClass, RELATION_TARGET__INCOMING);
		createEReference(relationTargetEClass, RELATION_TARGET__OUTGOING);

		irreflexiveEClass = createEClass(IRREFLEXIVE);

		cyclicEClass = createEClass(CYCLIC);

		totalEClass = createEClass(TOTAL);

		acyclicEClass = createEClass(ACYCLIC);

		reflexiveEClass = createEClass(REFLEXIVE);

		abstractRoleEClass = createEClass(ABSTRACT_ROLE);

		roleGroupEClass = createEClass(ROLE_GROUP);
		createEAttribute(roleGroupEClass, ROLE_GROUP__LOWER);
		createEAttribute(roleGroupEClass, ROLE_GROUP__UPPER);
		createEReference(roleGroupEClass, ROLE_GROUP__ELEMENTS);

		roleImplicationEClass = createEClass(ROLE_IMPLICATION);

		roleEquivalenceEClass = createEClass(ROLE_EQUIVALENCE);

		roleProhibitionEClass = createEClass(ROLE_PROHIBITION);

		partEClass = createEClass(PART);
		createEReference(partEClass, PART__WHOLE);
		createEAttribute(partEClass, PART__LOWER);
		createEAttribute(partEClass, PART__UPPER);
		createEReference(partEClass, PART__ROLE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		parthoodConstraintEClass = createEClass(PARTHOOD_CONSTRAINT);
		createEAttribute(parthoodConstraintEClass, PARTHOOD_CONSTRAINT__KIND);

		roleGroupElementEClass = createEClass(ROLE_GROUP_ELEMENT);

		abstractRoleRefEClass = createEClass(ABSTRACT_ROLE_REF);
		createEReference(abstractRoleRefEClass, ABSTRACT_ROLE_REF__REF);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
		parthoodEEnum = createEEnum(PARTHOOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelElementEClass.getESuperTypes().add(this.getNamedElement());
		rigidTypeEClass.getESuperTypes().add(this.getType());
		rigidTypeEClass.getESuperTypes().add(this.getModelElement());
		groupEClass.getESuperTypes().add(this.getModelElement());
		groupEClass.getESuperTypes().add(this.getModel());
		parameterEClass.getESuperTypes().add(this.getTypedElement());
		operationEClass.getESuperTypes().add(this.getTypedElement());
		attributeEClass.getESuperTypes().add(this.getTypedElement());
		typeEClass.getESuperTypes().add(this.getRelationTarget());
		dataTypeEClass.getESuperTypes().add(this.getRigidType());
		naturalTypeEClass.getESuperTypes().add(this.getRigidType());
		compartmentTypeEClass.getESuperTypes().add(this.getRigidType());
		antiRigidTypeEClass.getESuperTypes().add(this.getType());
		roleTypeEClass.getESuperTypes().add(this.getAntiRigidType());
		roleTypeEClass.getESuperTypes().add(this.getAbstractRole());
		relationshipEClass.getESuperTypes().add(this.getRelation());
		relationshipEClass.getESuperTypes().add(this.getNamedElement());
		fulfillmentEClass.getESuperTypes().add(this.getRelation());
		inheritanceEClass.getESuperTypes().add(this.getRelation());
		constraintEClass.getESuperTypes().add(this.getRelation());
		roleConstraintEClass.getESuperTypes().add(this.getConstraint());
		relationshipConstraintEClass.getESuperTypes().add(this.getConstraint());
		intraRelationshipConstraintEClass.getESuperTypes().add(this.getRelationshipConstraint());
		interRelationshipConstraintEClass.getESuperTypes().add(this.getRelationshipConstraint());
		complexConstraintEClass.getESuperTypes().add(this.getConstraint());
		dataInheritanceEClass.getESuperTypes().add(this.getInheritance());
		naturalInheritanceEClass.getESuperTypes().add(this.getInheritance());
		compartmentInheritanceEClass.getESuperTypes().add(this.getInheritance());
		roleInheritanceEClass.getESuperTypes().add(this.getInheritance());
		relationshipImplicationEClass.getESuperTypes().add(this.getInterRelationshipConstraint());
		relationshipExclusionEClass.getESuperTypes().add(this.getInterRelationshipConstraint());
		relationTargetEClass.getESuperTypes().add(this.getNamedElement());
		irreflexiveEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
		cyclicEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
		totalEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
		acyclicEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
		reflexiveEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
		abstractRoleEClass.getESuperTypes().add(this.getRoleGroupElement());
		roleGroupEClass.getESuperTypes().add(this.getAbstractRole());
		roleGroupEClass.getESuperTypes().add(this.getRelationTarget());
		roleImplicationEClass.getESuperTypes().add(this.getRoleConstraint());
		roleEquivalenceEClass.getESuperTypes().add(this.getRoleConstraint());
		roleProhibitionEClass.getESuperTypes().add(this.getRoleConstraint());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		parthoodConstraintEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
		abstractRoleRefEClass.getESuperTypes().add(this.getRoleGroupElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Relations(), this.getRelation(), null, "relations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rigidTypeEClass, RigidType.class, "RigidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRelation__GetSource(), this.getRelationTarget(), "getSource", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRelation__GetTarget(), this.getRelationTarget(), "getTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Params(), this.getParameter(), null, "params", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Owner(), this.getType(), this.getType_Operations(), "owner", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Owner(), this.getType(), this.getType_Attributes(), "owner", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Attributes(), this.getAttribute(), this.getAttribute_Owner(), "attributes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Operations(), this.getOperation(), this.getOperation_Owner(), "operations", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Serializable(), ecorePackage.getEBoolean(), "serializable", null, 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Tr_extends(), this.getDataType(), null, "tr_extends", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naturalTypeEClass, NaturalType.class, "NaturalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNaturalType_Tr_extends(), this.getNaturalType(), null, "tr_extends", null, 0, 1, NaturalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentTypeEClass, CompartmentType.class, "CompartmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompartmentType_Parts(), this.getPart(), this.getPart_Whole(), "parts", null, 0, -1, CompartmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompartmentType_Relationships(), this.getRelationship(), null, "relationships", null, 0, -1, CompartmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentType_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, CompartmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentType_Tr_extends(), this.getCompartmentType(), null, "tr_extends", null, 0, 1, CompartmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antiRigidTypeEClass, AntiRigidType.class, "AntiRigidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleType_Tr_extends(), this.getRoleType(), null, "tr_extends", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_First(), this.getPlace(), null, "first", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Second(), this.getPlace(), null, "second", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Direction(), this.getDirection(), "direction", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Tr_constraints(), this.getIntraRelationshipConstraint(), null, "tr_constraints", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fulfillmentEClass, Fulfillment.class, "Fulfillment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFulfillment_Filled(), this.getAbstractRole(), null, "filled", null, 1, 1, Fulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFulfillment_Filler(), this.getRigidType(), null, "filler", null, 1, 1, Fulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleConstraintEClass, RoleConstraint.class, "RoleConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleConstraint_First(), this.getAbstractRole(), null, "first", null, 1, 1, RoleConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleConstraint_Second(), this.getAbstractRole(), null, "second", null, 1, 1, RoleConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipConstraintEClass, RelationshipConstraint.class, "RelationshipConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intraRelationshipConstraintEClass, IntraRelationshipConstraint.class, "IntraRelationshipConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntraRelationshipConstraint_Relation(), this.getRelationship(), null, "relation", null, 0, 1, IntraRelationshipConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interRelationshipConstraintEClass, InterRelationshipConstraint.class, "InterRelationshipConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterRelationshipConstraint_First(), this.getRelationship(), null, "first", null, 1, 1, InterRelationshipConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterRelationshipConstraint_Second(), this.getRelationship(), null, "second", null, 1, 1, InterRelationshipConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexConstraintEClass, ComplexConstraint.class, "ComplexConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexConstraint_Targets(), this.getAbstractRole(), null, "targets", null, 1, -1, ComplexConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComplexConstraint_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, ComplexConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataInheritanceEClass, DataInheritance.class, "DataInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataInheritance_Super(), this.getDataType(), null, "super", null, 1, 1, DataInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataInheritance_Sub(), this.getDataType(), null, "sub", null, 1, 1, DataInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naturalInheritanceEClass, NaturalInheritance.class, "NaturalInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNaturalInheritance_Super(), this.getNaturalType(), null, "super", null, 1, 1, NaturalInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNaturalInheritance_Sub(), this.getNaturalType(), null, "sub", null, 1, 1, NaturalInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentInheritanceEClass, CompartmentInheritance.class, "CompartmentInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompartmentInheritance_Super(), this.getCompartmentType(), null, "super", null, 1, 1, CompartmentInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentInheritance_Sub(), this.getCompartmentType(), null, "sub", null, 1, 1, CompartmentInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleInheritanceEClass, RoleInheritance.class, "RoleInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleInheritance_Super(), this.getRoleType(), null, "super", null, 1, 1, RoleInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleInheritance_Sub(), this.getRoleType(), null, "sub", null, 1, 1, RoleInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Upper(), ecorePackage.getEInt(), "upper", "-1", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Holder(), this.getRoleType(), null, "holder", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipImplicationEClass, RelationshipImplication.class, "RelationshipImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipExclusionEClass, RelationshipExclusion.class, "RelationshipExclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationTargetEClass, RelationTarget.class, "RelationTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationTarget_Incoming(), this.getRelation(), null, "incoming", null, 0, -1, RelationTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationTarget_Outgoing(), this.getRelation(), null, "outgoing", null, 0, -1, RelationTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(irreflexiveEClass, Irreflexive.class, "Irreflexive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cyclicEClass, Cyclic.class, "Cyclic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(totalEClass, Total.class, "Total", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acyclicEClass, Acyclic.class, "Acyclic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reflexiveEClass, Reflexive.class, "Reflexive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractRoleEClass, AbstractRole.class, "AbstractRole", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleGroupEClass, RoleGroup.class, "RoleGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleGroup_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1, RoleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleGroup_Upper(), ecorePackage.getEInt(), "upper", "-1", 1, 1, RoleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleGroup_Elements(), this.getRoleGroupElement(), null, "elements", null, 1, -1, RoleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleImplicationEClass, RoleImplication.class, "RoleImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEquivalenceEClass, RoleEquivalence.class, "RoleEquivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleProhibitionEClass, RoleProhibition.class, "RoleProhibition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPart_Whole(), this.getCompartmentType(), this.getCompartmentType_Parts(), "whole", null, 1, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_Upper(), ecorePackage.getEInt(), "upper", "-1", 1, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPart_Role(), this.getAbstractRole(), null, "role", null, 1, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getRigidType(), null, "type", null, 1, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parthoodConstraintEClass, ParthoodConstraint.class, "ParthoodConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParthoodConstraint_Kind(), this.getParthood(), "kind", null, 1, 1, ParthoodConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleGroupElementEClass, RoleGroupElement.class, "RoleGroupElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractRoleRefEClass, AbstractRoleRef.class, "AbstractRoleRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRoleRef_Ref(), this.getAbstractRole(), null, "ref", null, 1, 1, AbstractRoleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.UNDIRECTED);
		addEEnumLiteral(directionEEnum, Direction.FIRST_TO_SECOND);
		addEEnumLiteral(directionEEnum, Direction.SECOND_TO_FIRST);

		initEEnum(parthoodEEnum, Parthood.class, "Parthood");
		addEEnumLiteral(parthoodEEnum, Parthood.UNCONSTRAINED);
		addEEnumLiteral(parthoodEEnum, Parthood.EXCLUSIVE_PART);
		addEEnumLiteral(parthoodEEnum, Parthood.SHARABLE_PART);
		addEEnumLiteral(parthoodEEnum, Parthood.ESSENTIAL_PART);
		addEEnumLiteral(parthoodEEnum, Parthood.MANDATORY_PART);
		addEEnumLiteral(parthoodEEnum, Parthood.INSEPARABLE_PART);

		// Create resource
		createResource(eNS_URI);
	}

} //Crom_l1_composedPackageImpl
