/**
 */
package crom_l1_composed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crom_l1_composed.RelationTarget#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link crom_l1_composed.RelationTarget#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getRelationTarget()
 * @model abstract="true"
 * @generated
 */
public interface RelationTarget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link crom_l1_composed.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRelationTarget_Incoming()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Relation> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link crom_l1_composed.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getRelationTarget_Outgoing()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Relation> getOutgoing();

} // RelationTarget
