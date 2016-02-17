/**
 */
package crom_l1_composed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crom_l1_composed.ComplexConstraint#getTargets <em>Targets</em>}</li>
 *   <li>{@link crom_l1_composed.ComplexConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see crom_l1_composed.Crom_l1_composedPackage#getComplexConstraint()
 * @model
 * @generated
 */
public interface ComplexConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link crom_l1_composed.AbstractRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see crom_l1_composed.Crom_l1_composedPackage#getComplexConstraint_Targets()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<AbstractRole> getTargets();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see crom_l1_composed.Crom_l1_composedPackage#getComplexConstraint_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link crom_l1_composed.ComplexConstraint#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // ComplexConstraint
