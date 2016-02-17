/**
 */
package crom_l1_composed.impl;

import crom_l1_composed.CompartmentType;
import crom_l1_composed.Constraint;
import crom_l1_composed.Crom_l1_composedPackage;
import crom_l1_composed.Part;
import crom_l1_composed.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crom_l1_composed.impl.CompartmentTypeImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link crom_l1_composed.impl.CompartmentTypeImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link crom_l1_composed.impl.CompartmentTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link crom_l1_composed.impl.CompartmentTypeImpl#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentTypeImpl extends RigidTypeImpl implements CompartmentType {
	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getTr_extends() <em>Tr extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr_extends()
	 * @generated
	 * @ordered
	 */
	protected CompartmentType tr_extends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Crom_l1_composedPackage.Literals.COMPARTMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentWithInverseEList<Part>(Part.class, this, Crom_l1_composedPackage.COMPARTMENT_TYPE__PARTS, Crom_l1_composedPackage.PART__WHOLE);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, Crom_l1_composedPackage.COMPARTMENT_TYPE__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, Crom_l1_composedPackage.COMPARTMENT_TYPE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType getTr_extends() {
		if (tr_extends != null && tr_extends.eIsProxy()) {
			InternalEObject oldTr_extends = (InternalEObject)tr_extends;
			tr_extends = (CompartmentType)eResolveProxy(oldTr_extends);
			if (tr_extends != oldTr_extends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Crom_l1_composedPackage.COMPARTMENT_TYPE__TR_EXTENDS, oldTr_extends, tr_extends));
			}
		}
		return tr_extends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType basicGetTr_extends() {
		return tr_extends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTr_extends(CompartmentType newTr_extends) {
		CompartmentType oldTr_extends = tr_extends;
		tr_extends = newTr_extends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Crom_l1_composedPackage.COMPARTMENT_TYPE__TR_EXTENDS, oldTr_extends, tr_extends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__PARTS:
				return getParts();
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__RELATIONSHIPS:
				return getRelationships();
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__CONSTRAINTS:
				return getConstraints();
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__TR_EXTENDS:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__TR_EXTENDS:
				setTr_extends((CompartmentType)newValue);
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
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__PARTS:
				getParts().clear();
				return;
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__TR_EXTENDS:
				setTr_extends((CompartmentType)null);
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
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__PARTS:
				return parts != null && !parts.isEmpty();
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case Crom_l1_composedPackage.COMPARTMENT_TYPE__TR_EXTENDS:
				return tr_extends != null;
		}
		return super.eIsSet(featureID);
	}

} //CompartmentTypeImpl
