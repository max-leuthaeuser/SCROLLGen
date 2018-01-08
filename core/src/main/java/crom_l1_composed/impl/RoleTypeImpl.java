/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.RoleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.impl.RoleTypeImpl#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleTypeImpl extends AntiRigidTypeImpl implements RoleType {
	/**
	 * The cached value of the '{@link #getTr_extends() <em>Tr extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr_extends()
	 * @generated
	 * @ordered
	 */
	protected RoleType tr_extends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.ROLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getTr_extends() {
		if (tr_extends != null && tr_extends.eIsProxy()) {
			InternalEObject oldTr_extends = (InternalEObject)tr_extends;
			tr_extends = (RoleType)eResolveProxy(oldTr_extends);
			if (tr_extends != oldTr_extends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.ROLE_TYPE__TR_EXTENDS, oldTr_extends, tr_extends));
			}
		}
		return tr_extends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetTr_extends() {
		return tr_extends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTr_extends(RoleType newTr_extends) {
		RoleType oldTr_extends = tr_extends;
		tr_extends = newTr_extends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.ROLE_TYPE__TR_EXTENDS, oldTr_extends, tr_extends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1_composedPackage.ROLE_TYPE__TR_EXTENDS:
				if (resolve) return getTr_extends();
				return basicGetTr_extends();
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
			case Crom_l1_composedPackage.ROLE_TYPE__TR_EXTENDS:
				setTr_extends((RoleType)newValue);
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
			case Crom_l1_composedPackage.ROLE_TYPE__TR_EXTENDS:
				setTr_extends((RoleType)null);
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
			case Crom_l1_composedPackage.ROLE_TYPE__TR_EXTENDS:
				return tr_extends != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleTypeImpl
