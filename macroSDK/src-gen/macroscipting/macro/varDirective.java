/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link macroscipting.macro.varDirective#getLeft <em>Left</em>}</li>
 *   <li>{@link macroscipting.macro.varDirective#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see macroscipting.macro.MacroPackage#getvarDirective()
 * @model
 * @generated
 */
public interface varDirective extends Directive
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' attribute.
   * @see #setLeft(String)
   * @see macroscipting.macro.MacroPackage#getvarDirective_Left()
   * @model
   * @generated
   */
  String getLeft();

  /**
   * Sets the value of the '{@link macroscipting.macro.varDirective#getLeft <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' attribute.
   * @see #getLeft()
   * @generated
   */
  void setLeft(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(String)
   * @see macroscipting.macro.MacroPackage#getvarDirective_Right()
   * @model
   * @generated
   */
  String getRight();

  /**
   * Sets the value of the '{@link macroscipting.macro.varDirective#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(String value);

} // varDirective
