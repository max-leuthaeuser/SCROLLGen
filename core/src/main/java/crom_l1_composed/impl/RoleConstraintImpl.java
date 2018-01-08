/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.AbstractRole;
import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.RoleConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.impl.RoleConstraintImpl#getFirst <em>First</em>}</li>
 *   <li>{@link crom_l1_composed.impl.RoleConstraintImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleConstraintImpl extends ConstraintImpl implements RoleConstraint {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected AbstractRole first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected AbstractRole second;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.ROLE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRole getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (AbstractRole)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.ROLE_CONSTRAINT__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRole basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(AbstractRole newFirst) {
		AbstractRole oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.ROLE_CONSTRAINT__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRole getSecond() {
		if (second != null && second.eIsProxy()) {
			InternalEObject oldSecond = (InternalEObject)second;
			second = (AbstractRole)eResolveProxy(oldSecond);
			if (second != oldSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.ROLE_CONSTRAINT__SECOND, oldSecond, second));
			}
		}
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRole basicGetSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(AbstractRole newSecond) {
		AbstractRole oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.ROLE_CONSTRAINT__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1_composedPackage.ROLE_CONSTRAINT__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case Crom_l1_composedPackage.ROLE_CONSTRAINT__SECOND:
				if (resolve) return getSecond();
				return basicGetSecond();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Crom_l1_composedPackage.ROLE_CONSTRAINT__FIRST:
				setFirst((AbstractRole)newValue);
				return;
			case Crom_l1_composedPackage.ROLE_CONSTRAINT__SECOND:
				setSecond((AbstractRole)newValue);
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
			case Crom_l1_composedPackage.ROLE_CONSTRAINT__FIRST:
				setFirst((AbstractRole)null);
				return;
			case Crom_l1_composedPackage.ROLE_CONSTRAINT__SECOND:
				setSecond((AbstractRole)null);
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
			case Crom_l1_composedPackage.ROLE_CONSTRAINT__FIRST:
				return first != null;
			case Crom_l1_composedPackage.ROLE_CONSTRAINT__SECOND:
				return second != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleConstraintImpl
