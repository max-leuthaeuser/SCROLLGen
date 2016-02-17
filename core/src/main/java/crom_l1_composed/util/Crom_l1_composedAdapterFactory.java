/**
 */
package crom_l1_composed.util;

import crom_l1_composed.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see crom_l1_composed.Crom_l1_composedPackage
 * @generated
 */
public class Crom_l1_composedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Crom_l1_composedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crom_l1_composedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Crom_l1_composedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Crom_l1_composedSwitch<Adapter> modelSwitch =
		new Crom_l1_composedSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseRigidType(RigidType object) {
				return createRigidTypeAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseNaturalType(NaturalType object) {
				return createNaturalTypeAdapter();
			}
			@Override
			public Adapter caseCompartmentType(CompartmentType object) {
				return createCompartmentTypeAdapter();
			}
			@Override
			public Adapter caseAntiRigidType(AntiRigidType object) {
				return createAntiRigidTypeAdapter();
			}
			@Override
			public Adapter caseRoleType(RoleType object) {
				return createRoleTypeAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseFulfillment(Fulfillment object) {
				return createFulfillmentAdapter();
			}
			@Override
			public Adapter caseInheritance(Inheritance object) {
				return createInheritanceAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseRoleConstraint(RoleConstraint object) {
				return createRoleConstraintAdapter();
			}
			@Override
			public Adapter caseRelationshipConstraint(RelationshipConstraint object) {
				return createRelationshipConstraintAdapter();
			}
			@Override
			public Adapter caseIntraRelationshipConstraint(IntraRelationshipConstraint object) {
				return createIntraRelationshipConstraintAdapter();
			}
			@Override
			public Adapter caseInterRelationshipConstraint(InterRelationshipConstraint object) {
				return createInterRelationshipConstraintAdapter();
			}
			@Override
			public Adapter caseComplexConstraint(ComplexConstraint object) {
				return createComplexConstraintAdapter();
			}
			@Override
			public Adapter caseDataInheritance(DataInheritance object) {
				return createDataInheritanceAdapter();
			}
			@Override
			public Adapter caseNaturalInheritance(NaturalInheritance object) {
				return createNaturalInheritanceAdapter();
			}
			@Override
			public Adapter caseCompartmentInheritance(CompartmentInheritance object) {
				return createCompartmentInheritanceAdapter();
			}
			@Override
			public Adapter caseRoleInheritance(RoleInheritance object) {
				return createRoleInheritanceAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseRelationshipImplication(RelationshipImplication object) {
				return createRelationshipImplicationAdapter();
			}
			@Override
			public Adapter caseRelationshipExclusion(RelationshipExclusion object) {
				return createRelationshipExclusionAdapter();
			}
			@Override
			public Adapter caseRelationTarget(RelationTarget object) {
				return createRelationTargetAdapter();
			}
			@Override
			public Adapter caseIrreflexive(Irreflexive object) {
				return createIrreflexiveAdapter();
			}
			@Override
			public Adapter caseCyclic(Cyclic object) {
				return createCyclicAdapter();
			}
			@Override
			public Adapter caseTotal(Total object) {
				return createTotalAdapter();
			}
			@Override
			public Adapter caseAcyclic(Acyclic object) {
				return createAcyclicAdapter();
			}
			@Override
			public Adapter caseReflexive(Reflexive object) {
				return createReflexiveAdapter();
			}
			@Override
			public Adapter caseAbstractRole(AbstractRole object) {
				return createAbstractRoleAdapter();
			}
			@Override
			public Adapter caseRoleGroup(RoleGroup object) {
				return createRoleGroupAdapter();
			}
			@Override
			public Adapter caseRoleImplication(RoleImplication object) {
				return createRoleImplicationAdapter();
			}
			@Override
			public Adapter caseRoleEquivalence(RoleEquivalence object) {
				return createRoleEquivalenceAdapter();
			}
			@Override
			public Adapter caseRoleProhibition(RoleProhibition object) {
				return createRoleProhibitionAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseParthoodConstraint(ParthoodConstraint object) {
				return createParthoodConstraintAdapter();
			}
			@Override
			public Adapter caseRoleGroupElement(RoleGroupElement object) {
				return createRoleGroupElementAdapter();
			}
			@Override
			public Adapter caseAbstractRoleRef(AbstractRoleRef object) {
				return createAbstractRoleRefAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RigidType <em>Rigid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RigidType
	 * @generated
	 */
	public Adapter createRigidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.NaturalType <em>Natural Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.NaturalType
	 * @generated
	 */
	public Adapter createNaturalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.CompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.CompartmentType
	 * @generated
	 */
	public Adapter createCompartmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.AntiRigidType <em>Anti Rigid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.AntiRigidType
	 * @generated
	 */
	public Adapter createAntiRigidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Fulfillment <em>Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Fulfillment
	 * @generated
	 */
	public Adapter createFulfillmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RoleConstraint <em>Role Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RoleConstraint
	 * @generated
	 */
	public Adapter createRoleConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RelationshipConstraint <em>Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RelationshipConstraint
	 * @generated
	 */
	public Adapter createRelationshipConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.IntraRelationshipConstraint <em>Intra Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.IntraRelationshipConstraint
	 * @generated
	 */
	public Adapter createIntraRelationshipConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.InterRelationshipConstraint <em>Inter Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.InterRelationshipConstraint
	 * @generated
	 */
	public Adapter createInterRelationshipConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.ComplexConstraint <em>Complex Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.ComplexConstraint
	 * @generated
	 */
	public Adapter createComplexConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.DataInheritance <em>Data Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.DataInheritance
	 * @generated
	 */
	public Adapter createDataInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.NaturalInheritance <em>Natural Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.NaturalInheritance
	 * @generated
	 */
	public Adapter createNaturalInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.CompartmentInheritance <em>Compartment Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.CompartmentInheritance
	 * @generated
	 */
	public Adapter createCompartmentInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RoleInheritance <em>Role Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RoleInheritance
	 * @generated
	 */
	public Adapter createRoleInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RelationshipImplication <em>Relationship Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RelationshipImplication
	 * @generated
	 */
	public Adapter createRelationshipImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RelationshipExclusion <em>Relationship Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RelationshipExclusion
	 * @generated
	 */
	public Adapter createRelationshipExclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RelationTarget <em>Relation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RelationTarget
	 * @generated
	 */
	public Adapter createRelationTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Irreflexive <em>Irreflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Irreflexive
	 * @generated
	 */
	public Adapter createIrreflexiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Cyclic <em>Cyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Cyclic
	 * @generated
	 */
	public Adapter createCyclicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Total <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Total
	 * @generated
	 */
	public Adapter createTotalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Acyclic <em>Acyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Acyclic
	 * @generated
	 */
	public Adapter createAcyclicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Reflexive <em>Reflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Reflexive
	 * @generated
	 */
	public Adapter createReflexiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.AbstractRole <em>Abstract Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.AbstractRole
	 * @generated
	 */
	public Adapter createAbstractRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RoleGroup <em>Role Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RoleGroup
	 * @generated
	 */
	public Adapter createRoleGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RoleImplication <em>Role Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RoleImplication
	 * @generated
	 */
	public Adapter createRoleImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RoleEquivalence <em>Role Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RoleEquivalence
	 * @generated
	 */
	public Adapter createRoleEquivalenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RoleProhibition <em>Role Prohibition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RoleProhibition
	 * @generated
	 */
	public Adapter createRoleProhibitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.ParthoodConstraint <em>Parthood Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.ParthoodConstraint
	 * @generated
	 */
	public Adapter createParthoodConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.RoleGroupElement <em>Role Group Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.RoleGroupElement
	 * @generated
	 */
	public Adapter createRoleGroupElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crom_l1_composed.AbstractRoleRef <em>Abstract Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crom_l1_composed.AbstractRoleRef
	 * @generated
	 */
	public Adapter createAbstractRoleRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Crom_l1_composedAdapterFactory
