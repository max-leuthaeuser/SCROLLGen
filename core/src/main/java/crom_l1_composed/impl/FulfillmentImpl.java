/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.AbstractRole;
import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.Fulfillment;
import crom_l1_composed.RigidType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crom_l1_composed.impl.FulfillmentImpl#getFilled <em>Filled</em>}</li>
 *   <li>{@link crom_l1_composed.impl.FulfillmentImpl#getFiller <em>Filler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FulfillmentImpl extends RelationImpl implements Fulfillment {
	/**
	 * The cached value of the '{@link #getFilled() <em>Filled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilled()
	 * @generated
	 * @ordered
	 */
	protected AbstractRole filled;

	/**
	 * The cached value of the '{@link #getFiller() <em>Filler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiller()
	 * @generated
	 * @ordered
	 */
	protected RigidType filler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.FULFILLMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRole getFilled() {
		if (filled != null && filled.eIsProxy()) {
			InternalEObject oldFilled = (InternalEObject)filled;
			filled = (AbstractRole)eResolveProxy(oldFilled);
			if (filled != oldFilled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.FULFILLMENT__FILLED, oldFilled, filled));
			}
		}
		return filled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRole basicGetFilled() {
		return filled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilled(AbstractRole newFilled) {
		AbstractRole oldFilled = filled;
		filled = newFilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.FULFILLMENT__FILLED, oldFilled, filled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidType getFiller() {
		if (filler != null && filler.eIsProxy()) {
			InternalEObject oldFiller = (InternalEObject)filler;
			filler = (RigidType)eResolveProxy(oldFiller);
			if (filler != oldFiller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.FULFILLMENT__FILLER, oldFiller, filler));
			}
		}
		return filler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidType basicGetFiller() {
		return filler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiller(RigidType newFiller) {
		RigidType oldFiller = filler;
		filler = newFiller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.FULFILLMENT__FILLER, oldFiller, filler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Crom_l1_composedPackage.FULFILLMENT__FILLED:
				if (resolve) return getFilled();
				return basicGetFilled();
			case Crom_l1_composedPackage.FULFILLMENT__FILLER:
				if (resolve) return getFiller();
				return basicGetFiller();
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
			case Crom_l1_composedPackage.FULFILLMENT__FILLED:
				setFilled((AbstractRole)newValue);
				return;
			case Crom_l1_composedPackage.FULFILLMENT__FILLER:
				setFiller((RigidType)newValue);
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
			case Crom_l1_composedPackage.FULFILLMENT__FILLED:
				setFilled((AbstractRole)null);
				return;
			case Crom_l1_composedPackage.FULFILLMENT__FILLER:
				setFiller((RigidType)null);
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
			case Crom_l1_composedPackage.FULFILLMENT__FILLED:
				return filled != null;
			case Crom_l1_composedPackage.FULFILLMENT__FILLER:
				return filler != null;
		}
		return super.eIsSet(featureID);
	}

} //FulfillmentImpl
