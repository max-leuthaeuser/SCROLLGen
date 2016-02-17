/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.DataInheritance;
import crom_l1_composed.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crom_l1_composed.impl.DataInheritanceImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link crom_l1_composed.impl.DataInheritanceImpl#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataInheritanceImpl extends InheritanceImpl implements DataInheritance {
	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected DataType super_;

	/**
	 * The cached value of the '{@link #getSub() <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub()
	 * @generated
	 * @ordered
	 */
	protected DataType sub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataInheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.DATA_INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (DataType)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.DATA_INHERITANCE__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(DataType newSuper) {
		DataType oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.DATA_INHERITANCE__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSub() {
		if (sub != null && sub.eIsProxy()) {
			InternalEObject oldSub = (InternalEObject)sub;
			sub = (DataType)eResolveProxy(oldSub);
			if (sub != oldSub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.DATA_INHERITANCE__SUB, oldSub, sub));
			}
		}
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetSub() {
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSub(DataType newSub) {
		DataType oldSub = sub;
		sub = newSub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.DATA_INHERITANCE__SUB, oldSub, sub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1_composedPackage.DATA_INHERITANCE__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case Crom_l1_composedPackage.DATA_INHERITANCE__SUB:
				if (resolve) return getSub();
				return basicGetSub();
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
			case Crom_l1_composedPackage.DATA_INHERITANCE__SUPER:
				setSuper((DataType)newValue);
				return;
			case Crom_l1_composedPackage.DATA_INHERITANCE__SUB:
				setSub((DataType)newValue);
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
			case Crom_l1_composedPackage.DATA_INHERITANCE__SUPER:
				setSuper((DataType)null);
				return;
			case Crom_l1_composedPackage.DATA_INHERITANCE__SUB:
				setSub((DataType)null);
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
			case Crom_l1_composedPackage.DATA_INHERITANCE__SUPER:
				return super_ != null;
			case Crom_l1_composedPackage.DATA_INHERITANCE__SUB:
				return sub != null;
		}
		return super.eIsSet(featureID);
	}

} //DataInheritanceImpl
