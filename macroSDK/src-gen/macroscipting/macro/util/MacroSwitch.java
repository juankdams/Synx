/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro.util;

import java.util.List;

import macroscipting.macro.Bloc;
import macroscipting.macro.Directive;
import macroscipting.macro.Domain;
import macroscipting.macro.MacroPackage;
import macroscipting.macro.conditionnalDirective;
import macroscipting.macro.ifDirective;
import macroscipting.macro.intDirective;
import macroscipting.macro.lockDirective;
import macroscipting.macro.onLoadBloc;
import macroscipting.macro.strDirective;
import macroscipting.macro.varDirective;
import macroscipting.macro.waitDirective;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see macroscipting.macro.MacroPackage
 * @generated
 */
public class MacroSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MacroPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MacroPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MacroPackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.CLASS:
      {
        macroscipting.macro.Class class_ = (macroscipting.macro.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.ON_LOAD_BLOC:
      {
        onLoadBloc onLoadBloc = (onLoadBloc)theEObject;
        T result = caseonLoadBloc(onLoadBloc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.BLOC:
      {
        Bloc bloc = (Bloc)theEObject;
        T result = caseBloc(bloc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.DIRECTIVE:
      {
        Directive directive = (Directive)theEObject;
        T result = caseDirective(directive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.CONDITIONNAL_DIRECTIVE:
      {
        conditionnalDirective conditionnalDirective = (conditionnalDirective)theEObject;
        T result = caseconditionnalDirective(conditionnalDirective);
        if (result == null) result = caseDirective(conditionnalDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.STR_DIRECTIVE:
      {
        strDirective strDirective = (strDirective)theEObject;
        T result = casestrDirective(strDirective);
        if (result == null) result = caseDirective(strDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.INT_DIRECTIVE:
      {
        intDirective intDirective = (intDirective)theEObject;
        T result = caseintDirective(intDirective);
        if (result == null) result = caseDirective(intDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.VAR_DIRECTIVE:
      {
        varDirective varDirective = (varDirective)theEObject;
        T result = casevarDirective(varDirective);
        if (result == null) result = caseDirective(varDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.IF_DIRECTIVE:
      {
        ifDirective ifDirective = (ifDirective)theEObject;
        T result = caseifDirective(ifDirective);
        if (result == null) result = caseconditionnalDirective(ifDirective);
        if (result == null) result = caseDirective(ifDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.WAIT_DIRECTIVE:
      {
        waitDirective waitDirective = (waitDirective)theEObject;
        T result = casewaitDirective(waitDirective);
        if (result == null) result = caseconditionnalDirective(waitDirective);
        if (result == null) result = caseDirective(waitDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MacroPackage.LOCK_DIRECTIVE:
      {
        lockDirective lockDirective = (lockDirective)theEObject;
        T result = caselockDirective(lockDirective);
        if (result == null) result = caseconditionnalDirective(lockDirective);
        if (result == null) result = caseDirective(lockDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(macroscipting.macro.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>on Load Bloc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>on Load Bloc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseonLoadBloc(onLoadBloc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bloc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bloc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBloc(Bloc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirective(Directive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>conditionnal Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>conditionnal Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconditionnalDirective(conditionnalDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>str Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>str Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestrDirective(strDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>int Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>int Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseintDirective(intDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevarDirective(varDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>if Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>if Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseifDirective(ifDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>wait Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>wait Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewaitDirective(waitDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>lock Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>lock Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselockDirective(lockDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MacroSwitch
