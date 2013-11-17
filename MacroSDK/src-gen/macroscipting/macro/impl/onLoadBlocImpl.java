/**
 * <copyright>
 * </copyright>
 *

 */
package macroscipting.macro.impl;

import macroscipting.macro.MacroPackage;
import macroscipting.macro.onLoadBloc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>on Load Bloc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link macroscipting.macro.impl.onLoadBlocImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link macroscipting.macro.impl.onLoadBlocImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link macroscipting.macro.impl.onLoadBlocImpl#getCharacterID <em>Character ID</em>}</li>
 *   <li>{@link macroscipting.macro.impl.onLoadBlocImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link macroscipting.macro.impl.onLoadBlocImpl#getCompactMicro <em>Compact Micro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class onLoadBlocImpl extends MinimalEObjectImpl.Container implements onLoadBloc
{
  /**
   * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilePath()
   * @generated
   * @ordered
   */
  protected static final String FILE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilePath()
   * @generated
   * @ordered
   */
  protected String filePath = FILE_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected static final String FILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected String fileName = FILE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCharacterID() <em>Character ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacterID()
   * @generated
   * @ordered
   */
  protected static final int CHARACTER_ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCharacterID() <em>Character ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacterID()
   * @generated
   * @ordered
   */
  protected int characterID = CHARACTER_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected static final String SCOPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected String scope = SCOPE_EDEFAULT;

  /**
   * The default value of the '{@link #getCompactMicro() <em>Compact Micro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompactMicro()
   * @generated
   * @ordered
   */
  protected static final String COMPACT_MICRO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCompactMicro() <em>Compact Micro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompactMicro()
   * @generated
   * @ordered
   */
  protected String compactMicro = COMPACT_MICRO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected onLoadBlocImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MacroPackage.Literals.ON_LOAD_BLOC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilePath()
  {
    return filePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilePath(String newFilePath)
  {
    String oldFilePath = filePath;
    filePath = newFilePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MacroPackage.ON_LOAD_BLOC__FILE_PATH, oldFilePath, filePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFileName()
  {
    return fileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileName(String newFileName)
  {
    String oldFileName = fileName;
    fileName = newFileName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MacroPackage.ON_LOAD_BLOC__FILE_NAME, oldFileName, fileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCharacterID()
  {
    return characterID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharacterID(int newCharacterID)
  {
    int oldCharacterID = characterID;
    characterID = newCharacterID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MacroPackage.ON_LOAD_BLOC__CHARACTER_ID, oldCharacterID, characterID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(String newScope)
  {
    String oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MacroPackage.ON_LOAD_BLOC__SCOPE, oldScope, scope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCompactMicro()
  {
    return compactMicro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompactMicro(String newCompactMicro)
  {
    String oldCompactMicro = compactMicro;
    compactMicro = newCompactMicro;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MacroPackage.ON_LOAD_BLOC__COMPACT_MICRO, oldCompactMicro, compactMicro));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MacroPackage.ON_LOAD_BLOC__FILE_PATH:
        return getFilePath();
      case MacroPackage.ON_LOAD_BLOC__FILE_NAME:
        return getFileName();
      case MacroPackage.ON_LOAD_BLOC__CHARACTER_ID:
        return getCharacterID();
      case MacroPackage.ON_LOAD_BLOC__SCOPE:
        return getScope();
      case MacroPackage.ON_LOAD_BLOC__COMPACT_MICRO:
        return getCompactMicro();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MacroPackage.ON_LOAD_BLOC__FILE_PATH:
        setFilePath((String)newValue);
        return;
      case MacroPackage.ON_LOAD_BLOC__FILE_NAME:
        setFileName((String)newValue);
        return;
      case MacroPackage.ON_LOAD_BLOC__CHARACTER_ID:
        setCharacterID((Integer)newValue);
        return;
      case MacroPackage.ON_LOAD_BLOC__SCOPE:
        setScope((String)newValue);
        return;
      case MacroPackage.ON_LOAD_BLOC__COMPACT_MICRO:
        setCompactMicro((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MacroPackage.ON_LOAD_BLOC__FILE_PATH:
        setFilePath(FILE_PATH_EDEFAULT);
        return;
      case MacroPackage.ON_LOAD_BLOC__FILE_NAME:
        setFileName(FILE_NAME_EDEFAULT);
        return;
      case MacroPackage.ON_LOAD_BLOC__CHARACTER_ID:
        setCharacterID(CHARACTER_ID_EDEFAULT);
        return;
      case MacroPackage.ON_LOAD_BLOC__SCOPE:
        setScope(SCOPE_EDEFAULT);
        return;
      case MacroPackage.ON_LOAD_BLOC__COMPACT_MICRO:
        setCompactMicro(COMPACT_MICRO_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MacroPackage.ON_LOAD_BLOC__FILE_PATH:
        return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
      case MacroPackage.ON_LOAD_BLOC__FILE_NAME:
        return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
      case MacroPackage.ON_LOAD_BLOC__CHARACTER_ID:
        return characterID != CHARACTER_ID_EDEFAULT;
      case MacroPackage.ON_LOAD_BLOC__SCOPE:
        return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
      case MacroPackage.ON_LOAD_BLOC__COMPACT_MICRO:
        return COMPACT_MICRO_EDEFAULT == null ? compactMicro != null : !COMPACT_MICRO_EDEFAULT.equals(compactMicro);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (filePath: ");
    result.append(filePath);
    result.append(", fileName: ");
    result.append(fileName);
    result.append(", characterID: ");
    result.append(characterID);
    result.append(", scope: ");
    result.append(scope);
    result.append(", compactMicro: ");
    result.append(compactMicro);
    result.append(')');
    return result.toString();
  }

} //onLoadBlocImpl
