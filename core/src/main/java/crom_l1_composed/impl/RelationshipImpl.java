/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.Direction;
import crom_l1_composed.IntraRelationshipConstraint;
import crom_l1_composed.NamedElement;
import crom_l1_composed.Place;
import crom_l1_composed.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crom_l1_composed.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RelationshipImpl#getFirst <em>First</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RelationshipImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RelationshipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RelationshipImpl#getTr_constraints <em>Tr constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends RelationImpl implements Relationship {
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
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Place first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected Place second;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.UNDIRECTED;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTr_constraints() <em>Tr constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr_constraints()
	 * @generated
	 * @ordered
	 */
	protected EList<IntraRelationshipConstraint> tr_constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.RELATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(Place newFirst, NotificationChain msgs) {
		Place oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.RELATIONSHIP__FIRST, oldFirst, newFirst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(Place newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Crom_l1_composedPackage.RELATIONSHIP__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Crom_l1_composedPackage.RELATIONSHIP__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.RELATIONSHIP__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond(Place newSecond, NotificationChain msgs) {
		Place oldSecond = second;
		second = newSecond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.RELATIONSHIP__SECOND, oldSecond, newSecond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(Place newSecond) {
		if (newSecond != second) {
			NotificationChain msgs = null;
			if (second != null)
				msgs = ((InternalEObject)second).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Crom_l1_composedPackage.RELATIONSHIP__SECOND, null, msgs);
			if (newSecond != null)
				msgs = ((InternalEObject)newSecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Crom_l1_composedPackage.RELATIONSHIP__SECOND, null, msgs);
			msgs = basicSetSecond(newSecond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.RELATIONSHIP__SECOND, newSecond, newSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.RELATIONSHIP__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntraRelationshipConstraint> getTr_constraints() {
		if (tr_constraints == null) {
			tr_constraints = new EObjectContainmentEList<IntraRelationshipConstraint>(IntraRelationshipConstraint.class, this, Crom_l1_composedPackage.RELATIONSHIP__TR_CONSTRAINTS);
		}
		return tr_constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Crom_l1_composedPackage.RELATIONSHIP__FIRST:
				return basicSetFirst(null, msgs);
			case Crom_l1_composedPackage.RELATIONSHIP__SECOND:
				return basicSetSecond(null, msgs);
			case Crom_l1_composedPackage.RELATIONSHIP__TR_CONSTRAINTS:
				return ((InternalEList<?>)getTr_constraints()).basicRemove(otherEnd, msgs);
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
			case Crom_l1_composedPackage.RELATIONSHIP__NAME:
				return getName();
			case Crom_l1_composedPackage.RELATIONSHIP__FIRST:
				return getFirst();
			case Crom_l1_composedPackage.RELATIONSHIP__SECOND:
				return getSecond();
			case Crom_l1_composedPackage.RELATIONSHIP__DIRECTION:
				return getDirection();
			case Crom_l1_composedPackage.RELATIONSHIP__TR_CONSTRAINTS:
				return getTr_constraints();
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
			case Crom_l1_composedPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Crom_l1_composedPackage.RELATIONSHIP__FIRST:
				setFirst((Place)newValue);
				return;
			case Crom_l1_composedPackage.RELATIONSHIP__SECOND:
				setSecond((Place)newValue);
				return;
			case Crom_l1_composedPackage.RELATIONSHIP__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case Crom_l1_composedPackage.RELATIONSHIP__TR_CONSTRAINTS:
				getTr_constraints().clear();
				getTr_constraints().addAll((Collection<? extends IntraRelationshipConstraint>)newValue);
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
			case Crom_l1_composedPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Crom_l1_composedPackage.RELATIONSHIP__FIRST:
				setFirst((Place)null);
				return;
			case Crom_l1_composedPackage.RELATIONSHIP__SECOND:
				setSecond((Place)null);
				return;
			case Crom_l1_composedPackage.RELATIONSHIP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case Crom_l1_composedPackage.RELATIONSHIP__TR_CONSTRAINTS:
				getTr_constraints().clear();
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
			case Crom_l1_composedPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Crom_l1_composedPackage.RELATIONSHIP__FIRST:
				return first != null;
			case Crom_l1_composedPackage.RELATIONSHIP__SECOND:
				return second != null;
			case Crom_l1_composedPackage.RELATIONSHIP__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case Crom_l1_composedPackage.RELATIONSHIP__TR_CONSTRAINTS:
				return tr_constraints != null && !tr_constraints.isEmpty();
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
				case Crom_l1_composedPackage.RELATIONSHIP__NAME: return Crom_l1_composedPackage.NAMED_ELEMENT__NAME;
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
				case Crom_l1_composedPackage.NAMED_ELEMENT__NAME: return Crom_l1_composedPackage.RELATIONSHIP__NAME;
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
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
