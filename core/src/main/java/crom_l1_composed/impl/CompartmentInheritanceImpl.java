/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.CompartmentInheritance;
import crom_l1_composed.CompartmentType;
import crom_l1_composed.Crom_l1_composedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crom_l1_composed.impl.CompartmentInheritanceImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link crom_l1_composed.impl.CompartmentInheritanceImpl#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentInheritanceImpl extends InheritanceImpl implements CompartmentInheritance {
	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected CompartmentType super_;

	/**
	 * The cached value of the '{@link #getSub() <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub()
	 * @generated
	 * @ordered
	 */
	protected CompartmentType sub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentInheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.COMPARTMENT_INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (CompartmentType)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(CompartmentType newSuper) {
		CompartmentType oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType getSub() {
		if (sub != null && sub.eIsProxy()) {
			InternalEObject oldSub = (InternalEObject)sub;
			sub = (CompartmentType)eResolveProxy(oldSub);
			if (sub != oldSub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUB, oldSub, sub));
			}
		}
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType basicGetSub() {
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSub(CompartmentType newSub) {
		CompartmentType oldSub = sub;
		sub = newSub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUB, oldSub, sub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUB:
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
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUPER:
				setSuper((CompartmentType)newValue);
				return;
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUB:
				setSub((CompartmentType)newValue);
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
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUPER:
				setSuper((CompartmentType)null);
				return;
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUB:
				setSub((CompartmentType)null);
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
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUPER:
				return super_ != null;
			case Crom_l1_composedPackage.COMPARTMENT_INHERITANCE__SUB:
				return sub != null;
		}
		return super.eIsSet(featureID);
	}

} //CompartmentInheritanceImpl
