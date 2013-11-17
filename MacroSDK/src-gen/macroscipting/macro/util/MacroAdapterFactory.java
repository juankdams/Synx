/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see macroscipting.macro.MacroPackage
 * @generated
 */
public class MacroAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MacroPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MacroPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MacroSwitch<Adapter> modelSwitch =
    new MacroSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseClass(macroscipting.macro.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseonLoadBloc(onLoadBloc object)
      {
        return createonLoadBlocAdapter();
      }
      @Override
      public Adapter caseBloc(Bloc object)
      {
        return createBlocAdapter();
      }
      @Override
      public Adapter caseDirective(Directive object)
      {
        return createDirectiveAdapter();
      }
      @Override
      public Adapter caseconditionnalDirective(conditionnalDirective object)
      {
        return createconditionnalDirectiveAdapter();
      }
      @Override
      public Adapter casestrDirective(strDirective object)
      {
        return createstrDirectiveAdapter();
      }
      @Override
      public Adapter caseintDirective(intDirective object)
      {
        return createintDirectiveAdapter();
      }
      @Override
      public Adapter casevarDirective(varDirective object)
      {
        return createvarDirectiveAdapter();
      }
      @Override
      public Adapter caseifDirective(ifDirective object)
      {
        return createifDirectiveAdapter();
      }
      @Override
      public Adapter casewaitDirective(waitDirective object)
      {
        return createwaitDirectiveAdapter();
      }
      @Override
      public Adapter caselockDirective(lockDirective object)
      {
        return createlockDirectiveAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.onLoadBloc <em>on Load Bloc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.onLoadBloc
   * @generated
   */
  public Adapter createonLoadBlocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.Bloc <em>Bloc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.Bloc
   * @generated
   */
  public Adapter createBlocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.Directive <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.Directive
   * @generated
   */
  public Adapter createDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.conditionnalDirective <em>conditionnal Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.conditionnalDirective
   * @generated
   */
  public Adapter createconditionnalDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.strDirective <em>str Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.strDirective
   * @generated
   */
  public Adapter createstrDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.intDirective <em>int Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.intDirective
   * @generated
   */
  public Adapter createintDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.varDirective <em>var Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.varDirective
   * @generated
   */
  public Adapter createvarDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.ifDirective <em>if Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.ifDirective
   * @generated
   */
  public Adapter createifDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.waitDirective <em>wait Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.waitDirective
   * @generated
   */
  public Adapter createwaitDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link macroscipting.macro.lockDirective <em>lock Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see macroscipting.macro.lockDirective
   * @generated
   */
  public Adapter createlockDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MacroAdapterFactory
