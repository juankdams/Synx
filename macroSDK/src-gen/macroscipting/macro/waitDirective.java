/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>wait Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link macroscipting.macro.waitDirective#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see macroscipting.macro.MacroPackage#getwaitDirective()
 * @model
 * @generated
 */
public interface waitDirective extends conditionnalDirective
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see macroscipting.macro.MacroPackage#getwaitDirective_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link macroscipting.macro.waitDirective#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

} // waitDirective
