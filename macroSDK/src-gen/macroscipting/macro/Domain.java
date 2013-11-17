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
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link macroscipting.macro.Domain#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see macroscipting.macro.MacroPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see macroscipting.macro.MacroPackage#getDomain_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElements();

} // Domain
