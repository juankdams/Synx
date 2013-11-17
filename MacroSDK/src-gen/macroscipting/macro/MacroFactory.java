/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see macroscipting.macro.MacroPackage
 * @generated
 */
public interface MacroFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MacroFactory eINSTANCE = macroscipting.macro.impl.MacroFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain</em>'.
   * @generated
   */
  Domain createDomain();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>on Load Bloc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>on Load Bloc</em>'.
   * @generated
   */
  onLoadBloc createonLoadBloc();

  /**
   * Returns a new object of class '<em>Bloc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bloc</em>'.
   * @generated
   */
  Bloc createBloc();

  /**
   * Returns a new object of class '<em>Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directive</em>'.
   * @generated
   */
  Directive createDirective();

  /**
   * Returns a new object of class '<em>conditionnal Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>conditionnal Directive</em>'.
   * @generated
   */
  conditionnalDirective createconditionnalDirective();

  /**
   * Returns a new object of class '<em>str Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>str Directive</em>'.
   * @generated
   */
  strDirective createstrDirective();

  /**
   * Returns a new object of class '<em>int Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>int Directive</em>'.
   * @generated
   */
  intDirective createintDirective();

  /**
   * Returns a new object of class '<em>var Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var Directive</em>'.
   * @generated
   */
  varDirective createvarDirective();

  /**
   * Returns a new object of class '<em>if Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>if Directive</em>'.
   * @generated
   */
  ifDirective createifDirective();

  /**
   * Returns a new object of class '<em>wait Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>wait Directive</em>'.
   * @generated
   */
  waitDirective createwaitDirective();

  /**
   * Returns a new object of class '<em>lock Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>lock Directive</em>'.
   * @generated
   */
  lockDirective createlockDirective();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MacroPackage getMacroPackage();

} //MacroFactory
