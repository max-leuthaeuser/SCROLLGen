/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.NamedElement;
import crom_l1_composed.Relation;
import crom_l1_composed.RelationTarget;
import crom_l1_composed.RoleGroup;
import crom_l1_composed.RoleGroupElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crom_l1_composed.impl.RoleGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RoleGroupImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RoleGroupImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RoleGroupImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RoleGroupImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RoleGroupImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleGroupImpl extends MinimalEObjectImpl.Container implements RoleGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> outgoing;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleGroupElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.ROLE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.ROLE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<Relation>(Relation.class, this, Crom_l1_composedPackage.ROLE_GROUP__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<Relation>(Relation.class, this, Crom_l1_composedPackage.ROLE_GROUP__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.ROLE_GROUP__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.ROLE_GROUP__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleGroupElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<RoleGroupElement>(RoleGroupElement.class, this, Crom_l1_composedPackage.ROLE_GROUP__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Crom_l1_composedPackage.ROLE_GROUP__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1_composedPackage.ROLE_GROUP__NAME:
				return getName();
			case Crom_l1_composedPackage.ROLE_GROUP__INCOMING:
				return getIncoming();
			case Crom_l1_composedPackage.ROLE_GROUP__OUTGOING:
				return getOutgoing();
			case Crom_l1_composedPackage.ROLE_GROUP__LOWER:
				return getLower();
			case Crom_l1_composedPackage.ROLE_GROUP__UPPER:
				return getUpper();
			case Crom_l1_composedPackage.ROLE_GROUP__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Crom_l1_composedPackage.ROLE_GROUP__NAME:
				setName((String)newValue);
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Relation>)newValue);
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Relation>)newValue);
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__LOWER:
				setLower((Integer)newValue);
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__UPPER:
				setUpper((Integer)newValue);
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends RoleGroupElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Crom_l1_composedPackage.ROLE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__INCOMING:
				getIncoming().clear();
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__OUTGOING:
				getOutgoing().clear();
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case Crom_l1_composedPackage.ROLE_GROUP__ELEMENTS:
				getElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Crom_l1_composedPackage.ROLE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Crom_l1_composedPackage.ROLE_GROUP__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case Crom_l1_composedPackage.ROLE_GROUP__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case Crom_l1_composedPackage.ROLE_GROUP__LOWER:
				return lower != LOWER_EDEFAULT;
			case Crom_l1_composedPackage.ROLE_GROUP__UPPER:
				return upper != UPPER_EDEFAULT;
			case Crom_l1_composedPackage.ROLE_GROUP__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case Crom_l1_composedPackage.ROLE_GROUP__NAME: return Crom_l1_composedPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == RelationTarget.class) {
			switch (derivedFeatureID) {
				case Crom_l1_composedPackage.ROLE_GROUP__INCOMING: return Crom_l1_composedPackage.RELATION_TARGET__INCOMING;
				case Crom_l1_composedPackage.ROLE_GROUP__OUTGOING: return Crom_l1_composedPackage.RELATION_TARGET__OUTGOING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case Crom_l1_composedPackage.NAMED_ELEMENT__NAME: return Crom_l1_composedPackage.ROLE_GROUP__NAME;
				default: return -1;
			}
		}
		if (baseClass == RelationTarget.class) {
			switch (baseFeatureID) {
				case Crom_l1_composedPackage.RELATION_TARGET__INCOMING: return Crom_l1_composedPackage.ROLE_GROUP__INCOMING;
				case Crom_l1_composedPackage.RELATION_TARGET__OUTGOING: return Crom_l1_composedPackage.ROLE_GROUP__OUTGOING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(')');
		return result.toString();
	}

} //RoleGroupImpl
