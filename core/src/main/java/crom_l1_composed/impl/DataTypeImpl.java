/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crom_l1_composed.impl.DataTypeImpl#isSerializable <em>Serializable</em>}</li>
 *   <li>{@link crom_l1_composed.impl.DataTypeImpl#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends RigidTypeImpl implements DataType {
	/**
	 * The default value of the '{@link #isSerializable() <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIALIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSerializable() <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializable()
	 * @generated
	 * @ordered
	 */
	protected boolean serializable = SERIALIZABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTr_extends() <em>Tr extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr_extends()
	 * @generated
	 * @ordered
	 */
	protected DataType tr_extends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSerializable() {
		return serializable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializable(boolean newSerializable) {
		boolean oldSerializable = serializable;
		serializable = newSerializable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.DATA_TYPE__SERIALIZABLE, oldSerializable, serializable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTr_extends() {
		if (tr_extends != null && tr_extends.eIsProxy()) {
			InternalEObject oldTr_extends = (InternalEObject)tr_extends;
			tr_extends = (DataType)eResolveProxy(oldTr_extends);
			if (tr_extends != oldTr_extends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.DATA_TYPE__TR_EXTENDS, oldTr_extends, tr_extends));
			}
		}
		return tr_extends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTr_extends() {
		return tr_extends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTr_extends(DataType newTr_extends) {
		DataType oldTr_extends = tr_extends;
		tr_extends = newTr_extends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.DATA_TYPE__TR_EXTENDS, oldTr_extends, tr_extends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1_composedPackage.DATA_TYPE__SERIALIZABLE:
				return isSerializable();
			case Crom_l1_composedPackage.DATA_TYPE__TR_EXTENDS:
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
			case Crom_l1_composedPackage.DATA_TYPE__SERIALIZABLE:
				setSerializable((Boolean)newValue);
				return;
			case Crom_l1_composedPackage.DATA_TYPE__TR_EXTENDS:
				setTr_extends((DataType)newValue);
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
			case Crom_l1_composedPackage.DATA_TYPE__SERIALIZABLE:
				setSerializable(SERIALIZABLE_EDEFAULT);
				return;
			case Crom_l1_composedPackage.DATA_TYPE__TR_EXTENDS:
				setTr_extends((DataType)null);
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
			case Crom_l1_composedPackage.DATA_TYPE__SERIALIZABLE:
				return serializable != SERIALIZABLE_EDEFAULT;
			case Crom_l1_composedPackage.DATA_TYPE__TR_EXTENDS:
				return tr_extends != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (serializable: ");
		result.append(serializable);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
