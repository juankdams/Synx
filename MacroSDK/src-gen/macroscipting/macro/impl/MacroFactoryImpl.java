/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro.impl;

import macroscipting.macro.Bloc;
import macroscipting.macro.Directive;
import macroscipting.macro.Domain;
import macroscipting.macro.MacroFactory;
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
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MacroFactoryImpl extends EFactoryImpl implements MacroFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MacroFactory init()
  {
    try
    {
      MacroFactory theMacroFactory = (MacroFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.Macro"); 
      if (theMacroFactory != null)
      {
        return theMacroFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MacroFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MacroPackage.DOMAIN: return createDomain();
      case MacroPackage.CLASS: return createClass();
      case MacroPackage.ON_LOAD_BLOC: return createonLoadBloc();
      case MacroPackage.BLOC: return createBloc();
      case MacroPackage.DIRECTIVE: return createDirective();
      case MacroPackage.CONDITIONNAL_DIRECTIVE: return createconditionnalDirective();
      case MacroPackage.STR_DIRECTIVE: return createstrDirective();
      case MacroPackage.INT_DIRECTIVE: return createintDirective();
      case MacroPackage.VAR_DIRECTIVE: return createvarDirective();
      case MacroPackage.IF_DIRECTIVE: return createifDirective();
      case MacroPackage.WAIT_DIRECTIVE: return createwaitDirective();
      case MacroPackage.LOCK_DIRECTIVE: return createlockDirective();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public macroscipting.macro.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public onLoadBloc createonLoadBloc()
  {
    onLoadBlocImpl onLoadBloc = new onLoadBlocImpl();
    return onLoadBloc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bloc createBloc()
  {
    BlocImpl bloc = new BlocImpl();
    return bloc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directive createDirective()
  {
    DirectiveImpl directive = new DirectiveImpl();
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditionnalDirective createconditionnalDirective()
  {
    conditionnalDirectiveImpl conditionnalDirective = new conditionnalDirectiveImpl();
    return conditionnalDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public strDirective createstrDirective()
  {
    strDirectiveImpl strDirective = new strDirectiveImpl();
    return strDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public intDirective createintDirective()
  {
    intDirectiveImpl intDirective = new intDirectiveImpl();
    return intDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varDirective createvarDirective()
  {
    varDirectiveImpl varDirective = new varDirectiveImpl();
    return varDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ifDirective createifDirective()
  {
    ifDirectiveImpl ifDirective = new ifDirectiveImpl();
    return ifDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public waitDirective createwaitDirective()
  {
    waitDirectiveImpl waitDirective = new waitDirectiveImpl();
    return waitDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lockDirective createlockDirective()
  {
    lockDirectiveImpl lockDirective = new lockDirectiveImpl();
    return lockDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroPackage getMacroPackage()
  {
    return (MacroPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MacroPackage getPackage()
  {
    return MacroPackage.eINSTANCE;
  }

} //MacroFactoryImpl
