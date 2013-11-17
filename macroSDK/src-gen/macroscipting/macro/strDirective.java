/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>str Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link macroscipting.macro.strDirective#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see macroscipting.macro.MacroPackage#getstrDirective()
 * @model
 * @generated
 */
public interface strDirective extends Directive
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see macroscipting.macro.MacroPackage#getstrDirective_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link macroscipting.macro.strDirective#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // strDirective
