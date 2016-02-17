/**
 */
package crom_l1_composed;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see crom_l1_composed.Crom_l1_composedFactory
 * @model kind="package"
 * @generated
 */
public interface Crom_l1_composedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crom_l1_composed";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.rosi.crom.metamodel/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "crom_l1_composed";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Crom_l1_composedPackage eINSTANCE = crom_l1_composed.impl.Crom_l1_composedPackageImpl.init();

	/**
	 * The meta object id for the '{@link crom_l1_composed.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.NamedElement
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.ModelElement <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.ModelElement
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.ModelImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RELATIONS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RelationTargetImpl <em>Relation Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RelationTargetImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationTarget()
	 * @generated
	 */
	int RELATION_TARGET = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.TypeImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = RELATION_TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INCOMING = RELATION_TARGET__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OUTGOING = RELATION_TARGET__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTES = RELATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OPERATIONS = RELATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = RELATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = RELATION_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RigidTypeImpl <em>Rigid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RigidTypeImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRigidType()
	 * @generated
	 */
	int RIGID_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__INCOMING = TYPE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__OUTGOING = TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__ATTRIBUTES = TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE__OPERATIONS = TYPE__OPERATIONS;

	/**
	 * The number of structural features of the '<em>Rigid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rigid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.GroupImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RELATIONS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RelationImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_SOURCE = 0;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_TARGET = 1;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.TypedElementImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.ParameterImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.OperationImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMS = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNER = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.AttributeImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.DataTypeImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = RIGID_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INCOMING = RIGID_TYPE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OUTGOING = RIGID_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ATTRIBUTES = RIGID_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OPERATIONS = RIGID_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SERIALIZABLE = RIGID_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tr extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TR_EXTENDS = RIGID_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = RIGID_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = RIGID_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.NaturalTypeImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getNaturalType()
	 * @generated
	 */
	int NATURAL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__NAME = RIGID_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__INCOMING = RIGID_TYPE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__OUTGOING = RIGID_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__ATTRIBUTES = RIGID_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__OPERATIONS = RIGID_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Tr extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE__TR_EXTENDS = RIGID_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Natural Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE_FEATURE_COUNT = RIGID_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Natural Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_TYPE_OPERATION_COUNT = RIGID_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.CompartmentTypeImpl <em>Compartment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.CompartmentTypeImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getCompartmentType()
	 * @generated
	 */
	int COMPARTMENT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__NAME = RIGID_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__INCOMING = RIGID_TYPE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__OUTGOING = RIGID_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__ATTRIBUTES = RIGID_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__OPERATIONS = RIGID_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__PARTS = RIGID_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__RELATIONSHIPS = RIGID_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__CONSTRAINTS = RIGID_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tr extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE__TR_EXTENDS = RIGID_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Compartment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE_FEATURE_COUNT = RIGID_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Compartment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_TYPE_OPERATION_COUNT = RIGID_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.AntiRigidTypeImpl <em>Anti Rigid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.AntiRigidTypeImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAntiRigidType()
	 * @generated
	 */
	int ANTI_RIGID_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_TYPE__INCOMING = TYPE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_TYPE__OUTGOING = TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_TYPE__ATTRIBUTES = TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_TYPE__OPERATIONS = TYPE__OPERATIONS;

	/**
	 * The number of structural features of the '<em>Anti Rigid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anti Rigid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RIGID_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RoleTypeImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__NAME = ANTI_RIGID_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__INCOMING = ANTI_RIGID_TYPE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__OUTGOING = ANTI_RIGID_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__ATTRIBUTES = ANTI_RIGID_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__OPERATIONS = ANTI_RIGID_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Tr extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__TR_EXTENDS = ANTI_RIGID_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = ANTI_RIGID_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_OPERATION_COUNT = ANTI_RIGID_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RelationshipImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__FIRST = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SECOND = RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DIRECTION = RELATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tr constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TR_CONSTRAINTS = RELATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___GET_SOURCE = RELATION___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___GET_TARGET = RELATION___GET_TARGET;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.FulfillmentImpl <em>Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.FulfillmentImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getFulfillment()
	 * @generated
	 */
	int FULFILLMENT = 16;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__FILLED = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__FILLER = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT___GET_SOURCE = RELATION___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT___GET_TARGET = RELATION___GET_TARGET;

	/**
	 * The number of operations of the '<em>Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.InheritanceImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 17;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___GET_SOURCE = RELATION___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___GET_TARGET = RELATION___GET_TARGET;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.ConstraintImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 18;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_SOURCE = RELATION___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_TARGET = RELATION___GET_TARGET;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RoleConstraintImpl <em>Role Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RoleConstraintImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleConstraint()
	 * @generated
	 */
	int ROLE_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONSTRAINT__FIRST = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONSTRAINT__SECOND = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONSTRAINT___GET_SOURCE = CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONSTRAINT___GET_TARGET = CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Role Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RelationshipConstraintImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationshipConstraint()
	 * @generated
	 */
	int RELATIONSHIP_CONSTRAINT = 20;

	/**
	 * The number of structural features of the '<em>Relationship Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT___GET_SOURCE = CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT___GET_TARGET = CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Relationship Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.IntraRelationshipConstraintImpl <em>Intra Relationship Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.IntraRelationshipConstraintImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getIntraRelationshipConstraint()
	 * @generated
	 */
	int INTRA_RELATIONSHIP_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_RELATIONSHIP_CONSTRAINT__RELATION = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intra Relationship Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_RELATIONSHIP_CONSTRAINT___GET_SOURCE = RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_RELATIONSHIP_CONSTRAINT___GET_TARGET = RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Intra Relationship Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT = RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.InterRelationshipConstraintImpl <em>Inter Relationship Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.InterRelationshipConstraintImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getInterRelationshipConstraint()
	 * @generated
	 */
	int INTER_RELATIONSHIP_CONSTRAINT = 22;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_RELATIONSHIP_CONSTRAINT__FIRST = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_RELATIONSHIP_CONSTRAINT__SECOND = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inter Relationship Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_RELATIONSHIP_CONSTRAINT___GET_SOURCE = RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_RELATIONSHIP_CONSTRAINT___GET_TARGET = RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Inter Relationship Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT = RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.ComplexConstraintImpl <em>Complex Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.ComplexConstraintImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getComplexConstraint()
	 * @generated
	 */
	int COMPLEX_CONSTRAINT = 23;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONSTRAINT__TARGETS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONSTRAINT__EXPRESSION = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONSTRAINT___GET_SOURCE = CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONSTRAINT___GET_TARGET = CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Complex Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.DataInheritanceImpl <em>Data Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.DataInheritanceImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getDataInheritance()
	 * @generated
	 */
	int DATA_INHERITANCE = 24;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE___GET_SOURCE = INHERITANCE___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE___GET_TARGET = INHERITANCE___GET_TARGET;

	/**
	 * The number of operations of the '<em>Data Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.NaturalInheritanceImpl <em>Natural Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.NaturalInheritanceImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getNaturalInheritance()
	 * @generated
	 */
	int NATURAL_INHERITANCE = 25;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Natural Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE___GET_SOURCE = INHERITANCE___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE___GET_TARGET = INHERITANCE___GET_TARGET;

	/**
	 * The number of operations of the '<em>Natural Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.CompartmentInheritanceImpl <em>Compartment Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.CompartmentInheritanceImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getCompartmentInheritance()
	 * @generated
	 */
	int COMPARTMENT_INHERITANCE = 26;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compartment Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INHERITANCE___GET_SOURCE = INHERITANCE___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INHERITANCE___GET_TARGET = INHERITANCE___GET_TARGET;

	/**
	 * The number of operations of the '<em>Compartment Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RoleInheritanceImpl <em>Role Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RoleInheritanceImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleInheritance()
	 * @generated
	 */
	int ROLE_INHERITANCE = 27;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INHERITANCE___GET_SOURCE = INHERITANCE___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INHERITANCE___GET_TARGET = INHERITANCE___GET_TARGET;

	/**
	 * The number of operations of the '<em>Role Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.PlaceImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 28;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UPPER = 1;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__HOLDER = 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RelationshipImplicationImpl <em>Relationship Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RelationshipImplicationImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationshipImplication()
	 * @generated
	 */
	int RELATIONSHIP_IMPLICATION = 29;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_IMPLICATION__FIRST = INTER_RELATIONSHIP_CONSTRAINT__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_IMPLICATION__SECOND = INTER_RELATIONSHIP_CONSTRAINT__SECOND;

	/**
	 * The number of structural features of the '<em>Relationship Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_IMPLICATION_FEATURE_COUNT = INTER_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_IMPLICATION___GET_SOURCE = INTER_RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_IMPLICATION___GET_TARGET = INTER_RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Relationship Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_IMPLICATION_OPERATION_COUNT = INTER_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RelationshipExclusionImpl <em>Relationship Exclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RelationshipExclusionImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationshipExclusion()
	 * @generated
	 */
	int RELATIONSHIP_EXCLUSION = 30;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXCLUSION__FIRST = INTER_RELATIONSHIP_CONSTRAINT__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXCLUSION__SECOND = INTER_RELATIONSHIP_CONSTRAINT__SECOND;

	/**
	 * The number of structural features of the '<em>Relationship Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXCLUSION_FEATURE_COUNT = INTER_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXCLUSION___GET_SOURCE = INTER_RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXCLUSION___GET_TARGET = INTER_RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Relationship Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXCLUSION_OPERATION_COUNT = INTER_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.IrreflexiveImpl <em>Irreflexive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.IrreflexiveImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getIrreflexive()
	 * @generated
	 */
	int IRREFLEXIVE = 32;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

	/**
	 * The number of structural features of the '<em>Irreflexive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE___GET_SOURCE = INTRA_RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE___GET_TARGET = INTRA_RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Irreflexive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.CyclicImpl <em>Cyclic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.CyclicImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getCyclic()
	 * @generated
	 */
	int CYCLIC = 33;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

	/**
	 * The number of structural features of the '<em>Cyclic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC___GET_SOURCE = INTRA_RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC___GET_TARGET = INTRA_RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Cyclic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.TotalImpl <em>Total</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.TotalImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getTotal()
	 * @generated
	 */
	int TOTAL = 34;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

	/**
	 * The number of structural features of the '<em>Total</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL___GET_SOURCE = INTRA_RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL___GET_TARGET = INTRA_RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Total</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.AcyclicImpl <em>Acyclic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.AcyclicImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAcyclic()
	 * @generated
	 */
	int ACYCLIC = 35;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACYCLIC__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

	/**
	 * The number of structural features of the '<em>Acyclic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACYCLIC_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACYCLIC___GET_SOURCE = INTRA_RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACYCLIC___GET_TARGET = INTRA_RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Acyclic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACYCLIC_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.ReflexiveImpl <em>Reflexive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.ReflexiveImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getReflexive()
	 * @generated
	 */
	int REFLEXIVE = 36;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

	/**
	 * The number of structural features of the '<em>Reflexive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE___GET_SOURCE = INTRA_RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE___GET_TARGET = INTRA_RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Reflexive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.RoleGroupElement <em>Role Group Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.RoleGroupElement
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleGroupElement()
	 * @generated
	 */
	int ROLE_GROUP_ELEMENT = 45;

	/**
	 * The number of structural features of the '<em>Role Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.AbstractRole <em>Abstract Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.AbstractRole
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAbstractRole()
	 * @generated
	 */
	int ABSTRACT_ROLE = 37;

	/**
	 * The number of structural features of the '<em>Abstract Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROLE_FEATURE_COUNT = ROLE_GROUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROLE_OPERATION_COUNT = ROLE_GROUP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RoleGroupImpl <em>Role Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RoleGroupImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleGroup()
	 * @generated
	 */
	int ROLE_GROUP = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP__NAME = ABSTRACT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP__INCOMING = ABSTRACT_ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP__OUTGOING = ABSTRACT_ROLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP__LOWER = ABSTRACT_ROLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP__UPPER = ABSTRACT_ROLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP__ELEMENTS = ABSTRACT_ROLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP_FEATURE_COUNT = ABSTRACT_ROLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Role Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_GROUP_OPERATION_COUNT = ABSTRACT_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RoleImplicationImpl <em>Role Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RoleImplicationImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleImplication()
	 * @generated
	 */
	int ROLE_IMPLICATION = 39;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_IMPLICATION__FIRST = ROLE_CONSTRAINT__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_IMPLICATION__SECOND = ROLE_CONSTRAINT__SECOND;

	/**
	 * The number of structural features of the '<em>Role Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_IMPLICATION_FEATURE_COUNT = ROLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_IMPLICATION___GET_SOURCE = ROLE_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_IMPLICATION___GET_TARGET = ROLE_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Role Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_IMPLICATION_OPERATION_COUNT = ROLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RoleEquivalenceImpl <em>Role Equivalence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RoleEquivalenceImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleEquivalence()
	 * @generated
	 */
	int ROLE_EQUIVALENCE = 40;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_EQUIVALENCE__FIRST = ROLE_CONSTRAINT__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_EQUIVALENCE__SECOND = ROLE_CONSTRAINT__SECOND;

	/**
	 * The number of structural features of the '<em>Role Equivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_EQUIVALENCE_FEATURE_COUNT = ROLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_EQUIVALENCE___GET_SOURCE = ROLE_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_EQUIVALENCE___GET_TARGET = ROLE_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Role Equivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_EQUIVALENCE_OPERATION_COUNT = ROLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.RoleProhibitionImpl <em>Role Prohibition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.RoleProhibitionImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleProhibition()
	 * @generated
	 */
	int ROLE_PROHIBITION = 41;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROHIBITION__FIRST = ROLE_CONSTRAINT__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROHIBITION__SECOND = ROLE_CONSTRAINT__SECOND;

	/**
	 * The number of structural features of the '<em>Role Prohibition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROHIBITION_FEATURE_COUNT = ROLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROHIBITION___GET_SOURCE = ROLE_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROHIBITION___GET_TARGET = ROLE_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Role Prohibition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROHIBITION_OPERATION_COUNT = ROLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.PartImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getPart()
	 * @generated
	 */
	int PART = 42;

	/**
	 * The feature id for the '<em><b>Whole</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__WHOLE = 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__LOWER = 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__UPPER = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ROLE = 3;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.ParthoodConstraintImpl <em>Parthood Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.ParthoodConstraintImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getParthoodConstraint()
	 * @generated
	 */
	int PARTHOOD_CONSTRAINT = 44;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTHOOD_CONSTRAINT__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTHOOD_CONSTRAINT__KIND = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parthood Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTHOOD_CONSTRAINT_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTHOOD_CONSTRAINT___GET_SOURCE = INTRA_RELATIONSHIP_CONSTRAINT___GET_SOURCE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTHOOD_CONSTRAINT___GET_TARGET = INTRA_RELATIONSHIP_CONSTRAINT___GET_TARGET;

	/**
	 * The number of operations of the '<em>Parthood Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTHOOD_CONSTRAINT_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.impl.AbstractRoleRefImpl <em>Abstract Role Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.impl.AbstractRoleRefImpl
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAbstractRoleRef()
	 * @generated
	 */
	int ABSTRACT_ROLE_REF = 46;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROLE_REF__REF = ROLE_GROUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Role Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROLE_REF_FEATURE_COUNT = ROLE_GROUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Role Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROLE_REF_OPERATION_COUNT = ROLE_GROUP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crom_l1_composed.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.Direction
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 47;

	/**
	 * The meta object id for the '{@link crom_l1_composed.Parthood <em>Parthood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crom_l1_composed.Parthood
	 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getParthood()
	 * @generated
	 */
	int PARTHOOD = 48;


	/**
	 * Returns the meta object for class '{@link crom_l1_composed.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see crom_l1_composed.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crom_l1_composed.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see crom_l1_composed.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see crom_l1_composed.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see crom_l1_composed.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.Model#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see crom_l1_composed.Model#getRelations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Relations();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RigidType <em>Rigid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Type</em>'.
	 * @see crom_l1_composed.RigidType
	 * @generated
	 */
	EClass getRigidType();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see crom_l1_composed.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see crom_l1_composed.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the '{@link crom_l1_composed.Relation#getSource() <em>Get Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source</em>' operation.
	 * @see crom_l1_composed.Relation#getSource()
	 * @generated
	 */
	EOperation getRelation__GetSource();

	/**
	 * Returns the meta object for the '{@link crom_l1_composed.Relation#getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target</em>' operation.
	 * @see crom_l1_composed.Relation#getTarget()
	 * @generated
	 */
	EOperation getRelation__GetTarget();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see crom_l1_composed.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see crom_l1_composed.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.Operation#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see crom_l1_composed.Operation#getParams()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Params();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.Operation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see crom_l1_composed.Operation#getOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Operation();

	/**
	 * Returns the meta object for the container reference '{@link crom_l1_composed.Operation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see crom_l1_composed.Operation#getOwner()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Owner();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see crom_l1_composed.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the container reference '{@link crom_l1_composed.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see crom_l1_composed.Attribute#getOwner()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Owner();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see crom_l1_composed.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.Type#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see crom_l1_composed.Type#getAttributes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.Type#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see crom_l1_composed.Type#getOperations()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Operations();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see crom_l1_composed.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.DataType#isSerializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serializable</em>'.
	 * @see crom_l1_composed.DataType#isSerializable()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Serializable();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.DataType#getTr_extends <em>Tr extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr extends</em>'.
	 * @see crom_l1_composed.DataType#getTr_extends()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Tr_extends();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.NaturalType <em>Natural Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Type</em>'.
	 * @see crom_l1_composed.NaturalType
	 * @generated
	 */
	EClass getNaturalType();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.NaturalType#getTr_extends <em>Tr extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr extends</em>'.
	 * @see crom_l1_composed.NaturalType#getTr_extends()
	 * @see #getNaturalType()
	 * @generated
	 */
	EReference getNaturalType_Tr_extends();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.CompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Type</em>'.
	 * @see crom_l1_composed.CompartmentType
	 * @generated
	 */
	EClass getCompartmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.CompartmentType#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see crom_l1_composed.CompartmentType#getParts()
	 * @see #getCompartmentType()
	 * @generated
	 */
	EReference getCompartmentType_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.CompartmentType#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see crom_l1_composed.CompartmentType#getRelationships()
	 * @see #getCompartmentType()
	 * @generated
	 */
	EReference getCompartmentType_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.CompartmentType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see crom_l1_composed.CompartmentType#getConstraints()
	 * @see #getCompartmentType()
	 * @generated
	 */
	EReference getCompartmentType_Constraints();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.CompartmentType#getTr_extends <em>Tr extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr extends</em>'.
	 * @see crom_l1_composed.CompartmentType#getTr_extends()
	 * @see #getCompartmentType()
	 * @generated
	 */
	EReference getCompartmentType_Tr_extends();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.AntiRigidType <em>Anti Rigid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Rigid Type</em>'.
	 * @see crom_l1_composed.AntiRigidType
	 * @generated
	 */
	EClass getAntiRigidType();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see crom_l1_composed.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.RoleType#getTr_extends <em>Tr extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr extends</em>'.
	 * @see crom_l1_composed.RoleType#getTr_extends()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_Tr_extends();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see crom_l1_composed.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link crom_l1_composed.Relationship#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see crom_l1_composed.Relationship#getFirst()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_First();

	/**
	 * Returns the meta object for the containment reference '{@link crom_l1_composed.Relationship#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see crom_l1_composed.Relationship#getSecond()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Second();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.Relationship#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see crom_l1_composed.Relationship#getDirection()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Direction();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.Relationship#getTr_constraints <em>Tr constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr constraints</em>'.
	 * @see crom_l1_composed.Relationship#getTr_constraints()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Tr_constraints();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Fulfillment <em>Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment</em>'.
	 * @see crom_l1_composed.Fulfillment
	 * @generated
	 */
	EClass getFulfillment();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.Fulfillment#getFilled <em>Filled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filled</em>'.
	 * @see crom_l1_composed.Fulfillment#getFilled()
	 * @see #getFulfillment()
	 * @generated
	 */
	EReference getFulfillment_Filled();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.Fulfillment#getFiller <em>Filler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filler</em>'.
	 * @see crom_l1_composed.Fulfillment#getFiller()
	 * @see #getFulfillment()
	 * @generated
	 */
	EReference getFulfillment_Filler();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see crom_l1_composed.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see crom_l1_composed.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RoleConstraint <em>Role Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Constraint</em>'.
	 * @see crom_l1_composed.RoleConstraint
	 * @generated
	 */
	EClass getRoleConstraint();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.RoleConstraint#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see crom_l1_composed.RoleConstraint#getFirst()
	 * @see #getRoleConstraint()
	 * @generated
	 */
	EReference getRoleConstraint_First();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.RoleConstraint#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see crom_l1_composed.RoleConstraint#getSecond()
	 * @see #getRoleConstraint()
	 * @generated
	 */
	EReference getRoleConstraint_Second();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RelationshipConstraint <em>Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Constraint</em>'.
	 * @see crom_l1_composed.RelationshipConstraint
	 * @generated
	 */
	EClass getRelationshipConstraint();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.IntraRelationshipConstraint <em>Intra Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intra Relationship Constraint</em>'.
	 * @see crom_l1_composed.IntraRelationshipConstraint
	 * @generated
	 */
	EClass getIntraRelationshipConstraint();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.IntraRelationshipConstraint#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see crom_l1_composed.IntraRelationshipConstraint#getRelation()
	 * @see #getIntraRelationshipConstraint()
	 * @generated
	 */
	EReference getIntraRelationshipConstraint_Relation();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.InterRelationshipConstraint <em>Inter Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Relationship Constraint</em>'.
	 * @see crom_l1_composed.InterRelationshipConstraint
	 * @generated
	 */
	EClass getInterRelationshipConstraint();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.InterRelationshipConstraint#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see crom_l1_composed.InterRelationshipConstraint#getFirst()
	 * @see #getInterRelationshipConstraint()
	 * @generated
	 */
	EReference getInterRelationshipConstraint_First();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.InterRelationshipConstraint#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see crom_l1_composed.InterRelationshipConstraint#getSecond()
	 * @see #getInterRelationshipConstraint()
	 * @generated
	 */
	EReference getInterRelationshipConstraint_Second();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.ComplexConstraint <em>Complex Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Constraint</em>'.
	 * @see crom_l1_composed.ComplexConstraint
	 * @generated
	 */
	EClass getComplexConstraint();

	/**
	 * Returns the meta object for the reference list '{@link crom_l1_composed.ComplexConstraint#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see crom_l1_composed.ComplexConstraint#getTargets()
	 * @see #getComplexConstraint()
	 * @generated
	 */
	EReference getComplexConstraint_Targets();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.ComplexConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see crom_l1_composed.ComplexConstraint#getExpression()
	 * @see #getComplexConstraint()
	 * @generated
	 */
	EAttribute getComplexConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.DataInheritance <em>Data Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Inheritance</em>'.
	 * @see crom_l1_composed.DataInheritance
	 * @generated
	 */
	EClass getDataInheritance();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.DataInheritance#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see crom_l1_composed.DataInheritance#getSuper()
	 * @see #getDataInheritance()
	 * @generated
	 */
	EReference getDataInheritance_Super();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.DataInheritance#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub</em>'.
	 * @see crom_l1_composed.DataInheritance#getSub()
	 * @see #getDataInheritance()
	 * @generated
	 */
	EReference getDataInheritance_Sub();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.NaturalInheritance <em>Natural Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Inheritance</em>'.
	 * @see crom_l1_composed.NaturalInheritance
	 * @generated
	 */
	EClass getNaturalInheritance();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.NaturalInheritance#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see crom_l1_composed.NaturalInheritance#getSuper()
	 * @see #getNaturalInheritance()
	 * @generated
	 */
	EReference getNaturalInheritance_Super();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.NaturalInheritance#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub</em>'.
	 * @see crom_l1_composed.NaturalInheritance#getSub()
	 * @see #getNaturalInheritance()
	 * @generated
	 */
	EReference getNaturalInheritance_Sub();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.CompartmentInheritance <em>Compartment Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Inheritance</em>'.
	 * @see crom_l1_composed.CompartmentInheritance
	 * @generated
	 */
	EClass getCompartmentInheritance();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.CompartmentInheritance#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see crom_l1_composed.CompartmentInheritance#getSuper()
	 * @see #getCompartmentInheritance()
	 * @generated
	 */
	EReference getCompartmentInheritance_Super();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.CompartmentInheritance#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub</em>'.
	 * @see crom_l1_composed.CompartmentInheritance#getSub()
	 * @see #getCompartmentInheritance()
	 * @generated
	 */
	EReference getCompartmentInheritance_Sub();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RoleInheritance <em>Role Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Inheritance</em>'.
	 * @see crom_l1_composed.RoleInheritance
	 * @generated
	 */
	EClass getRoleInheritance();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.RoleInheritance#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see crom_l1_composed.RoleInheritance#getSuper()
	 * @see #getRoleInheritance()
	 * @generated
	 */
	EReference getRoleInheritance_Super();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.RoleInheritance#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub</em>'.
	 * @see crom_l1_composed.RoleInheritance#getSub()
	 * @see #getRoleInheritance()
	 * @generated
	 */
	EReference getRoleInheritance_Sub();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see crom_l1_composed.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.Place#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see crom_l1_composed.Place#getLower()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Lower();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.Place#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see crom_l1_composed.Place#getUpper()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Upper();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.Place#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see crom_l1_composed.Place#getHolder()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Holder();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RelationshipImplication <em>Relationship Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Implication</em>'.
	 * @see crom_l1_composed.RelationshipImplication
	 * @generated
	 */
	EClass getRelationshipImplication();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RelationshipExclusion <em>Relationship Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Exclusion</em>'.
	 * @see crom_l1_composed.RelationshipExclusion
	 * @generated
	 */
	EClass getRelationshipExclusion();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RelationTarget <em>Relation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Target</em>'.
	 * @see crom_l1_composed.RelationTarget
	 * @generated
	 */
	EClass getRelationTarget();

	/**
	 * Returns the meta object for the reference list '{@link crom_l1_composed.RelationTarget#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see crom_l1_composed.RelationTarget#getIncoming()
	 * @see #getRelationTarget()
	 * @generated
	 */
	EReference getRelationTarget_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link crom_l1_composed.RelationTarget#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see crom_l1_composed.RelationTarget#getOutgoing()
	 * @see #getRelationTarget()
	 * @generated
	 */
	EReference getRelationTarget_Outgoing();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Irreflexive <em>Irreflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irreflexive</em>'.
	 * @see crom_l1_composed.Irreflexive
	 * @generated
	 */
	EClass getIrreflexive();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Cyclic <em>Cyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyclic</em>'.
	 * @see crom_l1_composed.Cyclic
	 * @generated
	 */
	EClass getCyclic();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Total <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total</em>'.
	 * @see crom_l1_composed.Total
	 * @generated
	 */
	EClass getTotal();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Acyclic <em>Acyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acyclic</em>'.
	 * @see crom_l1_composed.Acyclic
	 * @generated
	 */
	EClass getAcyclic();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Reflexive <em>Reflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflexive</em>'.
	 * @see crom_l1_composed.Reflexive
	 * @generated
	 */
	EClass getReflexive();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.AbstractRole <em>Abstract Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Role</em>'.
	 * @see crom_l1_composed.AbstractRole
	 * @generated
	 */
	EClass getAbstractRole();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RoleGroup <em>Role Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Group</em>'.
	 * @see crom_l1_composed.RoleGroup
	 * @generated
	 */
	EClass getRoleGroup();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.RoleGroup#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see crom_l1_composed.RoleGroup#getLower()
	 * @see #getRoleGroup()
	 * @generated
	 */
	EAttribute getRoleGroup_Lower();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.RoleGroup#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see crom_l1_composed.RoleGroup#getUpper()
	 * @see #getRoleGroup()
	 * @generated
	 */
	EAttribute getRoleGroup_Upper();

	/**
	 * Returns the meta object for the containment reference list '{@link crom_l1_composed.RoleGroup#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see crom_l1_composed.RoleGroup#getElements()
	 * @see #getRoleGroup()
	 * @generated
	 */
	EReference getRoleGroup_Elements();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RoleImplication <em>Role Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Implication</em>'.
	 * @see crom_l1_composed.RoleImplication
	 * @generated
	 */
	EClass getRoleImplication();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RoleEquivalence <em>Role Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Equivalence</em>'.
	 * @see crom_l1_composed.RoleEquivalence
	 * @generated
	 */
	EClass getRoleEquivalence();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RoleProhibition <em>Role Prohibition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Prohibition</em>'.
	 * @see crom_l1_composed.RoleProhibition
	 * @generated
	 */
	EClass getRoleProhibition();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see crom_l1_composed.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the container reference '{@link crom_l1_composed.Part#getWhole <em>Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Whole</em>'.
	 * @see crom_l1_composed.Part#getWhole()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Whole();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.Part#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see crom_l1_composed.Part#getLower()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Lower();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.Part#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see crom_l1_composed.Part#getUpper()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link crom_l1_composed.Part#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see crom_l1_composed.Part#getRole()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Role();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see crom_l1_composed.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see crom_l1_composed.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.ParthoodConstraint <em>Parthood Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parthood Constraint</em>'.
	 * @see crom_l1_composed.ParthoodConstraint
	 * @generated
	 */
	EClass getParthoodConstraint();

	/**
	 * Returns the meta object for the attribute '{@link crom_l1_composed.ParthoodConstraint#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see crom_l1_composed.ParthoodConstraint#getKind()
	 * @see #getParthoodConstraint()
	 * @generated
	 */
	EAttribute getParthoodConstraint_Kind();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.RoleGroupElement <em>Role Group Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Group Element</em>'.
	 * @see crom_l1_composed.RoleGroupElement
	 * @generated
	 */
	EClass getRoleGroupElement();

	/**
	 * Returns the meta object for class '{@link crom_l1_composed.AbstractRoleRef <em>Abstract Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Role Ref</em>'.
	 * @see crom_l1_composed.AbstractRoleRef
	 * @generated
	 */
	EClass getAbstractRoleRef();

	/**
	 * Returns the meta object for the reference '{@link crom_l1_composed.AbstractRoleRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see crom_l1_composed.AbstractRoleRef#getRef()
	 * @see #getAbstractRoleRef()
	 * @generated
	 */
	EReference getAbstractRoleRef_Ref();

	/**
	 * Returns the meta object for enum '{@link crom_l1_composed.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see crom_l1_composed.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link crom_l1_composed.Parthood <em>Parthood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parthood</em>'.
	 * @see crom_l1_composed.Parthood
	 * @generated
	 */
	EEnum getParthood();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Crom_l1_composedFactory getCrom_l1_composedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link crom_l1_composed.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.NamedElement
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.ModelElement <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.ModelElement
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.ModelImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RELATIONS = eINSTANCE.getModel_Relations();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RigidTypeImpl <em>Rigid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RigidTypeImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRigidType()
		 * @generated
		 */
		EClass RIGID_TYPE = eINSTANCE.getRigidType();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.GroupImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RelationImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Get Source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___GET_SOURCE = eINSTANCE.getRelation__GetSource();

		/**
		 * The meta object literal for the '<em><b>Get Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___GET_TARGET = eINSTANCE.getRelation__GetTarget();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.ParameterImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.OperationImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMS = eINSTANCE.getOperation_Params();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION = eINSTANCE.getOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OWNER = eINSTANCE.getOperation_Owner();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.AttributeImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNER = eINSTANCE.getAttribute_Owner();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.TypeImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ATTRIBUTES = eINSTANCE.getType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__OPERATIONS = eINSTANCE.getType_Operations();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.DataTypeImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SERIALIZABLE = eINSTANCE.getDataType_Serializable();

		/**
		 * The meta object literal for the '<em><b>Tr extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__TR_EXTENDS = eINSTANCE.getDataType_Tr_extends();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.NaturalTypeImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getNaturalType()
		 * @generated
		 */
		EClass NATURAL_TYPE = eINSTANCE.getNaturalType();

		/**
		 * The meta object literal for the '<em><b>Tr extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_TYPE__TR_EXTENDS = eINSTANCE.getNaturalType_Tr_extends();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.CompartmentTypeImpl <em>Compartment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.CompartmentTypeImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getCompartmentType()
		 * @generated
		 */
		EClass COMPARTMENT_TYPE = eINSTANCE.getCompartmentType();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_TYPE__PARTS = eINSTANCE.getCompartmentType_Parts();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_TYPE__RELATIONSHIPS = eINSTANCE.getCompartmentType_Relationships();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_TYPE__CONSTRAINTS = eINSTANCE.getCompartmentType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Tr extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_TYPE__TR_EXTENDS = eINSTANCE.getCompartmentType_Tr_extends();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.AntiRigidTypeImpl <em>Anti Rigid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.AntiRigidTypeImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAntiRigidType()
		 * @generated
		 */
		EClass ANTI_RIGID_TYPE = eINSTANCE.getAntiRigidType();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RoleTypeImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Tr extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__TR_EXTENDS = eINSTANCE.getRoleType_Tr_extends();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RelationshipImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__FIRST = eINSTANCE.getRelationship_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SECOND = eINSTANCE.getRelationship_Second();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__DIRECTION = eINSTANCE.getRelationship_Direction();

		/**
		 * The meta object literal for the '<em><b>Tr constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TR_CONSTRAINTS = eINSTANCE.getRelationship_Tr_constraints();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.FulfillmentImpl <em>Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.FulfillmentImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getFulfillment()
		 * @generated
		 */
		EClass FULFILLMENT = eINSTANCE.getFulfillment();

		/**
		 * The meta object literal for the '<em><b>Filled</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT__FILLED = eINSTANCE.getFulfillment_Filled();

		/**
		 * The meta object literal for the '<em><b>Filler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT__FILLER = eINSTANCE.getFulfillment_Filler();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.InheritanceImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.ConstraintImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RoleConstraintImpl <em>Role Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RoleConstraintImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleConstraint()
		 * @generated
		 */
		EClass ROLE_CONSTRAINT = eINSTANCE.getRoleConstraint();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONSTRAINT__FIRST = eINSTANCE.getRoleConstraint_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONSTRAINT__SECOND = eINSTANCE.getRoleConstraint_Second();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RelationshipConstraintImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationshipConstraint()
		 * @generated
		 */
		EClass RELATIONSHIP_CONSTRAINT = eINSTANCE.getRelationshipConstraint();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.IntraRelationshipConstraintImpl <em>Intra Relationship Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.IntraRelationshipConstraintImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getIntraRelationshipConstraint()
		 * @generated
		 */
		EClass INTRA_RELATIONSHIP_CONSTRAINT = eINSTANCE.getIntraRelationshipConstraint();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTRA_RELATIONSHIP_CONSTRAINT__RELATION = eINSTANCE.getIntraRelationshipConstraint_Relation();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.InterRelationshipConstraintImpl <em>Inter Relationship Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.InterRelationshipConstraintImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getInterRelationshipConstraint()
		 * @generated
		 */
		EClass INTER_RELATIONSHIP_CONSTRAINT = eINSTANCE.getInterRelationshipConstraint();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_RELATIONSHIP_CONSTRAINT__FIRST = eINSTANCE.getInterRelationshipConstraint_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_RELATIONSHIP_CONSTRAINT__SECOND = eINSTANCE.getInterRelationshipConstraint_Second();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.ComplexConstraintImpl <em>Complex Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.ComplexConstraintImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getComplexConstraint()
		 * @generated
		 */
		EClass COMPLEX_CONSTRAINT = eINSTANCE.getComplexConstraint();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_CONSTRAINT__TARGETS = eINSTANCE.getComplexConstraint_Targets();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_CONSTRAINT__EXPRESSION = eINSTANCE.getComplexConstraint_Expression();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.DataInheritanceImpl <em>Data Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.DataInheritanceImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getDataInheritance()
		 * @generated
		 */
		EClass DATA_INHERITANCE = eINSTANCE.getDataInheritance();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INHERITANCE__SUPER = eINSTANCE.getDataInheritance_Super();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INHERITANCE__SUB = eINSTANCE.getDataInheritance_Sub();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.NaturalInheritanceImpl <em>Natural Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.NaturalInheritanceImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getNaturalInheritance()
		 * @generated
		 */
		EClass NATURAL_INHERITANCE = eINSTANCE.getNaturalInheritance();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_INHERITANCE__SUPER = eINSTANCE.getNaturalInheritance_Super();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_INHERITANCE__SUB = eINSTANCE.getNaturalInheritance_Sub();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.CompartmentInheritanceImpl <em>Compartment Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.CompartmentInheritanceImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getCompartmentInheritance()
		 * @generated
		 */
		EClass COMPARTMENT_INHERITANCE = eINSTANCE.getCompartmentInheritance();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_INHERITANCE__SUPER = eINSTANCE.getCompartmentInheritance_Super();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_INHERITANCE__SUB = eINSTANCE.getCompartmentInheritance_Sub();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RoleInheritanceImpl <em>Role Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RoleInheritanceImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleInheritance()
		 * @generated
		 */
		EClass ROLE_INHERITANCE = eINSTANCE.getRoleInheritance();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INHERITANCE__SUPER = eINSTANCE.getRoleInheritance_Super();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INHERITANCE__SUB = eINSTANCE.getRoleInheritance_Sub();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.PlaceImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__LOWER = eINSTANCE.getPlace_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__UPPER = eINSTANCE.getPlace_Upper();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__HOLDER = eINSTANCE.getPlace_Holder();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RelationshipImplicationImpl <em>Relationship Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RelationshipImplicationImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationshipImplication()
		 * @generated
		 */
		EClass RELATIONSHIP_IMPLICATION = eINSTANCE.getRelationshipImplication();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RelationshipExclusionImpl <em>Relationship Exclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RelationshipExclusionImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationshipExclusion()
		 * @generated
		 */
		EClass RELATIONSHIP_EXCLUSION = eINSTANCE.getRelationshipExclusion();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RelationTargetImpl <em>Relation Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RelationTargetImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRelationTarget()
		 * @generated
		 */
		EClass RELATION_TARGET = eINSTANCE.getRelationTarget();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TARGET__INCOMING = eINSTANCE.getRelationTarget_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TARGET__OUTGOING = eINSTANCE.getRelationTarget_Outgoing();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.IrreflexiveImpl <em>Irreflexive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.IrreflexiveImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getIrreflexive()
		 * @generated
		 */
		EClass IRREFLEXIVE = eINSTANCE.getIrreflexive();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.CyclicImpl <em>Cyclic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.CyclicImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getCyclic()
		 * @generated
		 */
		EClass CYCLIC = eINSTANCE.getCyclic();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.TotalImpl <em>Total</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.TotalImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getTotal()
		 * @generated
		 */
		EClass TOTAL = eINSTANCE.getTotal();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.AcyclicImpl <em>Acyclic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.AcyclicImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAcyclic()
		 * @generated
		 */
		EClass ACYCLIC = eINSTANCE.getAcyclic();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.ReflexiveImpl <em>Reflexive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.ReflexiveImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getReflexive()
		 * @generated
		 */
		EClass REFLEXIVE = eINSTANCE.getReflexive();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.AbstractRole <em>Abstract Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.AbstractRole
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAbstractRole()
		 * @generated
		 */
		EClass ABSTRACT_ROLE = eINSTANCE.getAbstractRole();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RoleGroupImpl <em>Role Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RoleGroupImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleGroup()
		 * @generated
		 */
		EClass ROLE_GROUP = eINSTANCE.getRoleGroup();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_GROUP__LOWER = eINSTANCE.getRoleGroup_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_GROUP__UPPER = eINSTANCE.getRoleGroup_Upper();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_GROUP__ELEMENTS = eINSTANCE.getRoleGroup_Elements();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RoleImplicationImpl <em>Role Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RoleImplicationImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleImplication()
		 * @generated
		 */
		EClass ROLE_IMPLICATION = eINSTANCE.getRoleImplication();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RoleEquivalenceImpl <em>Role Equivalence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RoleEquivalenceImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleEquivalence()
		 * @generated
		 */
		EClass ROLE_EQUIVALENCE = eINSTANCE.getRoleEquivalence();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.RoleProhibitionImpl <em>Role Prohibition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.RoleProhibitionImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleProhibition()
		 * @generated
		 */
		EClass ROLE_PROHIBITION = eINSTANCE.getRoleProhibition();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.PartImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Whole</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__WHOLE = eINSTANCE.getPart_Whole();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__LOWER = eINSTANCE.getPart_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__UPPER = eINSTANCE.getPart_Upper();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__ROLE = eINSTANCE.getPart_Role();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.TypedElementImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.ParthoodConstraintImpl <em>Parthood Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.ParthoodConstraintImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getParthoodConstraint()
		 * @generated
		 */
		EClass PARTHOOD_CONSTRAINT = eINSTANCE.getParthoodConstraint();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTHOOD_CONSTRAINT__KIND = eINSTANCE.getParthoodConstraint_Kind();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.RoleGroupElement <em>Role Group Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.RoleGroupElement
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getRoleGroupElement()
		 * @generated
		 */
		EClass ROLE_GROUP_ELEMENT = eINSTANCE.getRoleGroupElement();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.impl.AbstractRoleRefImpl <em>Abstract Role Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.impl.AbstractRoleRefImpl
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getAbstractRoleRef()
		 * @generated
		 */
		EClass ABSTRACT_ROLE_REF = eINSTANCE.getAbstractRoleRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ROLE_REF__REF = eINSTANCE.getAbstractRoleRef_Ref();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.Direction
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link crom_l1_composed.Parthood <em>Parthood</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crom_l1_composed.Parthood
		 * @see crom_l1_composed.impl.Crom_l1_composedPackageImpl#getParthood()
		 * @generated
		 */
		EEnum PARTHOOD = eINSTANCE.getParthood();

	}

} //Crom_l1_composedPackage
