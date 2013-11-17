/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link macroscipting.macro.Bloc#getName <em>Name</em>}</li>
 *   <li>{@link macroscipting.macro.Bloc#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @see macroscipting.macro.MacroPackage#getBloc()
 * @model
 * @generated
 */
public interface Bloc extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(int)
   * @see macroscipting.macro.MacroPackage#getBloc_Name()
   * @model
   * @generated
   */
  int getName();

  /**
   * Sets the value of the '{@link macroscipting.macro.Bloc#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(int value);

  /**
   * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
   * The list contents are of type {@link macroscipting.macro.Directive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directives</em>' containment reference list.
   * @see macroscipting.macro.MacroPackage#getBloc_Directives()
   * @model containment="true"
   * @generated
   */
  EList<Directive> getDirectives();

} // Bloc
