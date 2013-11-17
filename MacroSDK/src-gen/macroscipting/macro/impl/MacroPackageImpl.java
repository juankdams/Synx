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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MacroPackageImpl extends EPackageImpl implements MacroPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onLoadBlocEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blocEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionnalDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass waitDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lockDirectiveEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see macroscipting.macro.MacroPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MacroPackageImpl()
  {
    super(eNS_URI, MacroFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MacroPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MacroPackage init()
  {
    if (isInited) return (MacroPackage)EPackage.Registry.INSTANCE.getEPackage(MacroPackage.eNS_URI);

    // Obtain or create and register package
    MacroPackageImpl theMacroPackage = (MacroPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MacroPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MacroPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMacroPackage.createPackageContents();

    // Initialize created meta-data
    theMacroPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMacroPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MacroPackage.eNS_URI, theMacroPackage);
    return theMacroPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomain()
  {
    return domainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_Elements()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Name()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_SuperType()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getonLoadBloc()
  {
    return onLoadBlocEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getonLoadBloc_FilePath()
  {
    return (EAttribute)onLoadBlocEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getonLoadBloc_FileName()
  {
    return (EAttribute)onLoadBlocEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getonLoadBloc_CharacterID()
  {
    return (EAttribute)onLoadBlocEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getonLoadBloc_Scope()
  {
    return (EAttribute)onLoadBlocEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getonLoadBloc_CompactMicro()
  {
    return (EAttribute)onLoadBlocEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBloc()
  {
    return blocEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBloc_Name()
  {
    return (EAttribute)blocEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBloc_Directives()
  {
    return (EReference)blocEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirective()
  {
    return directiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirective_Name()
  {
    return (EAttribute)directiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconditionnalDirective()
  {
    return conditionnalDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstrDirective()
  {
    return strDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstrDirective_Value()
  {
    return (EAttribute)strDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getintDirective()
  {
    return intDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getintDirective_Value()
  {
    return (EAttribute)intDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvarDirective()
  {
    return varDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvarDirective_Left()
  {
    return (EAttribute)varDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvarDirective_Right()
  {
    return (EAttribute)varDirectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getifDirective()
  {
    return ifDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getifDirective_Left()
  {
    return (EAttribute)ifDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getifDirective_Operator()
  {
    return (EAttribute)ifDirectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getifDirective_Right()
  {
    return (EAttribute)ifDirectiveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getifDirective_Directives()
  {
    return (EReference)ifDirectiveEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwaitDirective()
  {
    return waitDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwaitDirective_Time()
  {
    return (EAttribute)waitDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlockDirective()
  {
    return lockDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlockDirective_Variable()
  {
    return (EAttribute)lockDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroFactory getMacroFactory()
  {
    return (MacroFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainEClass = createEClass(DOMAIN);
    createEReference(domainEClass, DOMAIN__ELEMENTS);

    classEClass = createEClass(CLASS);
    createEAttribute(classEClass, CLASS__NAME);
    createEReference(classEClass, CLASS__SUPER_TYPE);

    onLoadBlocEClass = createEClass(ON_LOAD_BLOC);
    createEAttribute(onLoadBlocEClass, ON_LOAD_BLOC__FILE_PATH);
    createEAttribute(onLoadBlocEClass, ON_LOAD_BLOC__FILE_NAME);
    createEAttribute(onLoadBlocEClass, ON_LOAD_BLOC__CHARACTER_ID);
    createEAttribute(onLoadBlocEClass, ON_LOAD_BLOC__SCOPE);
    createEAttribute(onLoadBlocEClass, ON_LOAD_BLOC__COMPACT_MICRO);

    blocEClass = createEClass(BLOC);
    createEAttribute(blocEClass, BLOC__NAME);
    createEReference(blocEClass, BLOC__DIRECTIVES);

    directiveEClass = createEClass(DIRECTIVE);
    createEAttribute(directiveEClass, DIRECTIVE__NAME);

    conditionnalDirectiveEClass = createEClass(CONDITIONNAL_DIRECTIVE);

    strDirectiveEClass = createEClass(STR_DIRECTIVE);
    createEAttribute(strDirectiveEClass, STR_DIRECTIVE__VALUE);

    intDirectiveEClass = createEClass(INT_DIRECTIVE);
    createEAttribute(intDirectiveEClass, INT_DIRECTIVE__VALUE);

    varDirectiveEClass = createEClass(VAR_DIRECTIVE);
    createEAttribute(varDirectiveEClass, VAR_DIRECTIVE__LEFT);
    createEAttribute(varDirectiveEClass, VAR_DIRECTIVE__RIGHT);

    ifDirectiveEClass = createEClass(IF_DIRECTIVE);
    createEAttribute(ifDirectiveEClass, IF_DIRECTIVE__LEFT);
    createEAttribute(ifDirectiveEClass, IF_DIRECTIVE__OPERATOR);
    createEAttribute(ifDirectiveEClass, IF_DIRECTIVE__RIGHT);
    createEReference(ifDirectiveEClass, IF_DIRECTIVE__DIRECTIVES);

    waitDirectiveEClass = createEClass(WAIT_DIRECTIVE);
    createEAttribute(waitDirectiveEClass, WAIT_DIRECTIVE__TIME);

    lockDirectiveEClass = createEClass(LOCK_DIRECTIVE);
    createEAttribute(lockDirectiveEClass, LOCK_DIRECTIVE__VARIABLE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    conditionnalDirectiveEClass.getESuperTypes().add(this.getDirective());
    strDirectiveEClass.getESuperTypes().add(this.getDirective());
    intDirectiveEClass.getESuperTypes().add(this.getDirective());
    varDirectiveEClass.getESuperTypes().add(this.getDirective());
    ifDirectiveEClass.getESuperTypes().add(this.getconditionnalDirective());
    waitDirectiveEClass.getESuperTypes().add(this.getconditionnalDirective());
    lockDirectiveEClass.getESuperTypes().add(this.getconditionnalDirective());

    // Initialize classes and features; add operations and parameters
    initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomain_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classEClass, macroscipting.macro.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, macroscipting.macro.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_SuperType(), this.getClass_(), null, "superType", null, 0, 1, macroscipting.macro.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onLoadBlocEClass, onLoadBloc.class, "onLoadBloc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getonLoadBloc_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, onLoadBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getonLoadBloc_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, onLoadBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getonLoadBloc_CharacterID(), ecorePackage.getEInt(), "characterID", null, 0, 1, onLoadBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getonLoadBloc_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, onLoadBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getonLoadBloc_CompactMicro(), ecorePackage.getEString(), "compactMicro", null, 0, 1, onLoadBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blocEClass, Bloc.class, "Bloc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBloc_Name(), ecorePackage.getEInt(), "name", null, 0, 1, Bloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBloc_Directives(), this.getDirective(), null, "directives", null, 0, -1, Bloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directiveEClass, Directive.class, "Directive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirective_Name(), ecorePackage.getEString(), "name", null, 0, 1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionnalDirectiveEClass, conditionnalDirective.class, "conditionnalDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(strDirectiveEClass, strDirective.class, "strDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstrDirective_Value(), ecorePackage.getEString(), "value", null, 0, 1, strDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intDirectiveEClass, intDirective.class, "intDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getintDirective_Value(), ecorePackage.getEInt(), "value", null, 0, 1, intDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varDirectiveEClass, varDirective.class, "varDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvarDirective_Left(), ecorePackage.getEString(), "left", null, 0, 1, varDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvarDirective_Right(), ecorePackage.getEString(), "right", null, 0, 1, varDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifDirectiveEClass, ifDirective.class, "ifDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getifDirective_Left(), ecorePackage.getEString(), "left", null, 0, 1, ifDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getifDirective_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, ifDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getifDirective_Right(), ecorePackage.getEString(), "right", null, 0, 1, ifDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getifDirective_Directives(), this.getDirective(), null, "directives", null, 0, -1, ifDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(waitDirectiveEClass, waitDirective.class, "waitDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getwaitDirective_Time(), ecorePackage.getEInt(), "time", null, 0, 1, waitDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lockDirectiveEClass, lockDirective.class, "lockDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlockDirective_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, lockDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MacroPackageImpl
