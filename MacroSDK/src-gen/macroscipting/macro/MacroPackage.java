/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see macroscipting.macro.MacroFactory
 * @model kind="package"
 * @generated
 */
public interface MacroPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "macro";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Macro";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "macro";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MacroPackage eINSTANCE = macroscipting.macro.impl.MacroPackageImpl.init();

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.DomainImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.ClassImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPER_TYPE = 1;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.onLoadBlocImpl <em>on Load Bloc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.onLoadBlocImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getonLoadBloc()
   * @generated
   */
  int ON_LOAD_BLOC = 2;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_LOAD_BLOC__FILE_PATH = 0;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_LOAD_BLOC__FILE_NAME = 1;

  /**
   * The feature id for the '<em><b>Character ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_LOAD_BLOC__CHARACTER_ID = 2;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_LOAD_BLOC__SCOPE = 3;

  /**
   * The feature id for the '<em><b>Compact Micro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_LOAD_BLOC__COMPACT_MICRO = 4;

  /**
   * The number of structural features of the '<em>on Load Bloc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_LOAD_BLOC_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.BlocImpl <em>Bloc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.BlocImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getBloc()
   * @generated
   */
  int BLOC = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC__NAME = 0;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC__DIRECTIVES = 1;

  /**
   * The number of structural features of the '<em>Bloc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.DirectiveImpl <em>Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.DirectiveImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getDirective()
   * @generated
   */
  int DIRECTIVE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__NAME = 0;

  /**
   * The number of structural features of the '<em>Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.conditionnalDirectiveImpl <em>conditionnal Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.conditionnalDirectiveImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getconditionnalDirective()
   * @generated
   */
  int CONDITIONNAL_DIRECTIVE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONNAL_DIRECTIVE__NAME = DIRECTIVE__NAME;

  /**
   * The number of structural features of the '<em>conditionnal Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONNAL_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.strDirectiveImpl <em>str Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.strDirectiveImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getstrDirective()
   * @generated
   */
  int STR_DIRECTIVE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_DIRECTIVE__NAME = DIRECTIVE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_DIRECTIVE__VALUE = DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>str Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.intDirectiveImpl <em>int Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.intDirectiveImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getintDirective()
   * @generated
   */
  int INT_DIRECTIVE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_DIRECTIVE__NAME = DIRECTIVE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_DIRECTIVE__VALUE = DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>int Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.varDirectiveImpl <em>var Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.varDirectiveImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getvarDirective()
   * @generated
   */
  int VAR_DIRECTIVE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DIRECTIVE__NAME = DIRECTIVE__NAME;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DIRECTIVE__LEFT = DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DIRECTIVE__RIGHT = DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>var Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.ifDirectiveImpl <em>if Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.ifDirectiveImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getifDirective()
   * @generated
   */
  int IF_DIRECTIVE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_DIRECTIVE__NAME = CONDITIONNAL_DIRECTIVE__NAME;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_DIRECTIVE__LEFT = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_DIRECTIVE__OPERATOR = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_DIRECTIVE__RIGHT = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_DIRECTIVE__DIRECTIVES = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>if Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_DIRECTIVE_FEATURE_COUNT = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.waitDirectiveImpl <em>wait Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.waitDirectiveImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getwaitDirective()
   * @generated
   */
  int WAIT_DIRECTIVE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_DIRECTIVE__NAME = CONDITIONNAL_DIRECTIVE__NAME;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_DIRECTIVE__TIME = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>wait Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_DIRECTIVE_FEATURE_COUNT = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link macroscipting.macro.impl.lockDirectiveImpl <em>lock Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see macroscipting.macro.impl.lockDirectiveImpl
   * @see macroscipting.macro.impl.MacroPackageImpl#getlockDirective()
   * @generated
   */
  int LOCK_DIRECTIVE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCK_DIRECTIVE__NAME = CONDITIONNAL_DIRECTIVE__NAME;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCK_DIRECTIVE__VARIABLE = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>lock Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCK_DIRECTIVE_FEATURE_COUNT = CONDITIONNAL_DIRECTIVE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link macroscipting.macro.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see macroscipting.macro.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the containment reference list '{@link macroscipting.macro.Domain#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see macroscipting.macro.Domain#getElements()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Elements();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see macroscipting.macro.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see macroscipting.macro.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the containment reference '{@link macroscipting.macro.Class#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see macroscipting.macro.Class#getSuperType()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_SuperType();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.onLoadBloc <em>on Load Bloc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>on Load Bloc</em>'.
   * @see macroscipting.macro.onLoadBloc
   * @generated
   */
  EClass getonLoadBloc();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.onLoadBloc#getFilePath <em>File Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Path</em>'.
   * @see macroscipting.macro.onLoadBloc#getFilePath()
   * @see #getonLoadBloc()
   * @generated
   */
  EAttribute getonLoadBloc_FilePath();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.onLoadBloc#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Name</em>'.
   * @see macroscipting.macro.onLoadBloc#getFileName()
   * @see #getonLoadBloc()
   * @generated
   */
  EAttribute getonLoadBloc_FileName();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.onLoadBloc#getCharacterID <em>Character ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Character ID</em>'.
   * @see macroscipting.macro.onLoadBloc#getCharacterID()
   * @see #getonLoadBloc()
   * @generated
   */
  EAttribute getonLoadBloc_CharacterID();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.onLoadBloc#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see macroscipting.macro.onLoadBloc#getScope()
   * @see #getonLoadBloc()
   * @generated
   */
  EAttribute getonLoadBloc_Scope();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.onLoadBloc#getCompactMicro <em>Compact Micro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Compact Micro</em>'.
   * @see macroscipting.macro.onLoadBloc#getCompactMicro()
   * @see #getonLoadBloc()
   * @generated
   */
  EAttribute getonLoadBloc_CompactMicro();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.Bloc <em>Bloc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bloc</em>'.
   * @see macroscipting.macro.Bloc
   * @generated
   */
  EClass getBloc();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.Bloc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see macroscipting.macro.Bloc#getName()
   * @see #getBloc()
   * @generated
   */
  EAttribute getBloc_Name();

  /**
   * Returns the meta object for the containment reference list '{@link macroscipting.macro.Bloc#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see macroscipting.macro.Bloc#getDirectives()
   * @see #getBloc()
   * @generated
   */
  EReference getBloc_Directives();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.Directive <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directive</em>'.
   * @see macroscipting.macro.Directive
   * @generated
   */
  EClass getDirective();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.Directive#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see macroscipting.macro.Directive#getName()
   * @see #getDirective()
   * @generated
   */
  EAttribute getDirective_Name();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.conditionnalDirective <em>conditionnal Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>conditionnal Directive</em>'.
   * @see macroscipting.macro.conditionnalDirective
   * @generated
   */
  EClass getconditionnalDirective();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.strDirective <em>str Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>str Directive</em>'.
   * @see macroscipting.macro.strDirective
   * @generated
   */
  EClass getstrDirective();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.strDirective#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see macroscipting.macro.strDirective#getValue()
   * @see #getstrDirective()
   * @generated
   */
  EAttribute getstrDirective_Value();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.intDirective <em>int Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>int Directive</em>'.
   * @see macroscipting.macro.intDirective
   * @generated
   */
  EClass getintDirective();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.intDirective#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see macroscipting.macro.intDirective#getValue()
   * @see #getintDirective()
   * @generated
   */
  EAttribute getintDirective_Value();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.varDirective <em>var Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>var Directive</em>'.
   * @see macroscipting.macro.varDirective
   * @generated
   */
  EClass getvarDirective();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.varDirective#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see macroscipting.macro.varDirective#getLeft()
   * @see #getvarDirective()
   * @generated
   */
  EAttribute getvarDirective_Left();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.varDirective#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see macroscipting.macro.varDirective#getRight()
   * @see #getvarDirective()
   * @generated
   */
  EAttribute getvarDirective_Right();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.ifDirective <em>if Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>if Directive</em>'.
   * @see macroscipting.macro.ifDirective
   * @generated
   */
  EClass getifDirective();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.ifDirective#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see macroscipting.macro.ifDirective#getLeft()
   * @see #getifDirective()
   * @generated
   */
  EAttribute getifDirective_Left();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.ifDirective#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see macroscipting.macro.ifDirective#getOperator()
   * @see #getifDirective()
   * @generated
   */
  EAttribute getifDirective_Operator();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.ifDirective#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see macroscipting.macro.ifDirective#getRight()
   * @see #getifDirective()
   * @generated
   */
  EAttribute getifDirective_Right();

  /**
   * Returns the meta object for the containment reference list '{@link macroscipting.macro.ifDirective#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see macroscipting.macro.ifDirective#getDirectives()
   * @see #getifDirective()
   * @generated
   */
  EReference getifDirective_Directives();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.waitDirective <em>wait Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>wait Directive</em>'.
   * @see macroscipting.macro.waitDirective
   * @generated
   */
  EClass getwaitDirective();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.waitDirective#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see macroscipting.macro.waitDirective#getTime()
   * @see #getwaitDirective()
   * @generated
   */
  EAttribute getwaitDirective_Time();

  /**
   * Returns the meta object for class '{@link macroscipting.macro.lockDirective <em>lock Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>lock Directive</em>'.
   * @see macroscipting.macro.lockDirective
   * @generated
   */
  EClass getlockDirective();

  /**
   * Returns the meta object for the attribute '{@link macroscipting.macro.lockDirective#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see macroscipting.macro.lockDirective#getVariable()
   * @see #getlockDirective()
   * @generated
   */
  EAttribute getlockDirective_Variable();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MacroFactory getMacroFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.DomainImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__ELEMENTS = eINSTANCE.getDomain_Elements();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.ClassImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPER_TYPE = eINSTANCE.getClass_SuperType();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.onLoadBlocImpl <em>on Load Bloc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.onLoadBlocImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getonLoadBloc()
     * @generated
     */
    EClass ON_LOAD_BLOC = eINSTANCE.getonLoadBloc();

    /**
     * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ON_LOAD_BLOC__FILE_PATH = eINSTANCE.getonLoadBloc_FilePath();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ON_LOAD_BLOC__FILE_NAME = eINSTANCE.getonLoadBloc_FileName();

    /**
     * The meta object literal for the '<em><b>Character ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ON_LOAD_BLOC__CHARACTER_ID = eINSTANCE.getonLoadBloc_CharacterID();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ON_LOAD_BLOC__SCOPE = eINSTANCE.getonLoadBloc_Scope();

    /**
     * The meta object literal for the '<em><b>Compact Micro</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ON_LOAD_BLOC__COMPACT_MICRO = eINSTANCE.getonLoadBloc_CompactMicro();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.BlocImpl <em>Bloc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.BlocImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getBloc()
     * @generated
     */
    EClass BLOC = eINSTANCE.getBloc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOC__NAME = eINSTANCE.getBloc_Name();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOC__DIRECTIVES = eINSTANCE.getBloc_Directives();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.DirectiveImpl <em>Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.DirectiveImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getDirective()
     * @generated
     */
    EClass DIRECTIVE = eINSTANCE.getDirective();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTIVE__NAME = eINSTANCE.getDirective_Name();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.conditionnalDirectiveImpl <em>conditionnal Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.conditionnalDirectiveImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getconditionnalDirective()
     * @generated
     */
    EClass CONDITIONNAL_DIRECTIVE = eINSTANCE.getconditionnalDirective();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.strDirectiveImpl <em>str Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.strDirectiveImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getstrDirective()
     * @generated
     */
    EClass STR_DIRECTIVE = eINSTANCE.getstrDirective();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STR_DIRECTIVE__VALUE = eINSTANCE.getstrDirective_Value();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.intDirectiveImpl <em>int Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.intDirectiveImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getintDirective()
     * @generated
     */
    EClass INT_DIRECTIVE = eINSTANCE.getintDirective();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_DIRECTIVE__VALUE = eINSTANCE.getintDirective_Value();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.varDirectiveImpl <em>var Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.varDirectiveImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getvarDirective()
     * @generated
     */
    EClass VAR_DIRECTIVE = eINSTANCE.getvarDirective();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DIRECTIVE__LEFT = eINSTANCE.getvarDirective_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DIRECTIVE__RIGHT = eINSTANCE.getvarDirective_Right();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.ifDirectiveImpl <em>if Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.ifDirectiveImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getifDirective()
     * @generated
     */
    EClass IF_DIRECTIVE = eINSTANCE.getifDirective();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_DIRECTIVE__LEFT = eINSTANCE.getifDirective_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_DIRECTIVE__OPERATOR = eINSTANCE.getifDirective_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_DIRECTIVE__RIGHT = eINSTANCE.getifDirective_Right();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_DIRECTIVE__DIRECTIVES = eINSTANCE.getifDirective_Directives();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.waitDirectiveImpl <em>wait Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.waitDirectiveImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getwaitDirective()
     * @generated
     */
    EClass WAIT_DIRECTIVE = eINSTANCE.getwaitDirective();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAIT_DIRECTIVE__TIME = eINSTANCE.getwaitDirective_Time();

    /**
     * The meta object literal for the '{@link macroscipting.macro.impl.lockDirectiveImpl <em>lock Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see macroscipting.macro.impl.lockDirectiveImpl
     * @see macroscipting.macro.impl.MacroPackageImpl#getlockDirective()
     * @generated
     */
    EClass LOCK_DIRECTIVE = eINSTANCE.getlockDirective();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCK_DIRECTIVE__VARIABLE = eINSTANCE.getlockDirective_Variable();

  }

} //MacroPackage
