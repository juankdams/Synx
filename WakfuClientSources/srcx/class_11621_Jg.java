import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class Jg extends aSK
  implements Qe, dFD, dKW
{
  protected static Logger K = Logger.getLogger(Jg.class);
  public static final String TAG = "Appearance";
  public static final String bSH = "ScrollContainerAppearance";
  public static final String bSI = "SliderAppearance";
  public static final String bSJ = "ScrollBarAppearance";
  public static final String bSK = "TextEditorAppearance";
  public static final String bSL = "WindowAppearance";
  public static final String bSM = "PopupMenuAppearance";
  public static final String bSN = "DEFAULT";
  public static final String bSO = "modulation";
  protected bNa bPm = null;

  protected final ArrayList bSP = new ArrayList();
  protected final ArrayList bSQ = new ArrayList();
  protected final ArrayList bSR = new ArrayList();

  private String bSS = "default";

  protected String bST = "default";

  protected boolean bSU = true;

  private static final aee aOr = new bOO(new ri());

  public static final int bFb = "modulationColor".hashCode();
  public static final int bSV = "state".hashCode();

  public static Jg checkOut()
  {
    Jg localJg;
    try
    {
      localJg = (Jg)aOr.Mm();
      localJg.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localJg = new Jg();
      localJg.aJ();
    }
    return localJg;
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
    if ((paramaNL instanceof axl)) {
      a((axl)paramaNL);
    }
    if ((paramaNL instanceof cfd)) {
      a((cfd)paramaNL);
    }

    if ((paramaNL instanceof dxR))
      a((dxR)paramaNL);
  }

  public void ST()
  {
    EntityGroup localEntityGroup = this.aPS.getEntity();

    int i = this.bSP.size();
    for (int j = 0; j < i; j++) {
      axl localaxl = (axl)this.bSP.get(j);
      if (localaxl.isEnabled())
      {
        if (localaxl.getEntity() != null)
          localEntityGroup.d(localaxl.getEntity());
      }
    }
    this.bSU = false;
  }

  public void a(dxR paramdxR)
  {
    a(paramdxR, true);
  }

  public void a(dxR paramdxR, boolean paramBoolean) {
    paramdxR.setDecoratorAppearance(this);

    if (paramBoolean) {
      this.bSR.add(paramdxR);
    }

    if (this.aPS != null) {
      this.aPS.a(paramdxR.getTriggerAction(), new rk(this, paramdxR), false);
    }

    if (this.aPS != null)
      this.aPS.setNeedsToResetMeshes();
  }

  protected void a(cfd paramcfd)
  {
    paramcfd.setDecoratorAppearance(this);

    if ((this.bPm != null) && ((paramcfd instanceof dKW))) {
      ((dKW)paramcfd).setModulationColor(this.bPm);
    }

    if (paramcfd.getState() == null) {
      paramcfd.setState(this.bSS);
    }

    if (((paramcfd.getState().equalsIgnoreCase("DEFAULT")) || (paramcfd.getState().equalsIgnoreCase(this.bST))) && (this.aPS != null)) {
      paramcfd.setEnabled(true);
      if (paramcfd.isDecoratorSwitch())
        paramcfd.setup(this);
      else {
        paramcfd.setup(this.aPS);
      }
    }

    this.bSQ.add(paramcfd);

    if (this.aPS != null)
      this.aPS.setNeedsToResetMeshes();
  }

  protected void a(axl paramaxl)
  {
    paramaxl.setDecoratorAppearance(this);

    if (paramaxl.getState() == null) {
      paramaxl.setState(this.bSS);
    }

    if ((this.bPm != null) && ((paramaxl instanceof dKW))) {
      ((dKW)paramaxl).setModulationColor(this.bPm);
    }

    if (((paramaxl.getState().equalsIgnoreCase("DEFAULT")) || (paramaxl.getState().equalsIgnoreCase(this.bST))) && (this.aPS != null)) {
      paramaxl.setEnabled(true);
    }

    if ((paramaxl instanceof jH)) {
      setBorder(((jH)paramaxl).getInsets());
    }

    if (this.aPS != null) {
      paramaxl.b(this.aPS.haN, this.ePX, this.ePY, this.ePZ);
    }

    this.bSP.add(paramaxl);

    if (this.aPS != null)
      this.aPS.setNeedsToResetMeshes();
  }

  protected void a(jH paramjH)
  {
    a(paramjH);
  }

  public void b(axl paramaxl)
  {
    this.bSP.remove(paramaxl);

    if ((paramaxl instanceof jH)) {
      SX();
    }

    ((aNL)paramaxl).beG();
  }

  public void SU()
  {
    for (int i = this.bSP.size() - 1; i >= 0; i--) {
      ((aNL)this.bSP.get(i)).beG();
    }

    this.bSP.clear();

    SX();
  }

  public void c(axl paramaxl)
  {
    this.bSP.remove(paramaxl);

    ((aNL)paramaxl).beH();

    if ((paramaxl instanceof jH))
      SX();
  }

  public void SV()
  {
    for (int i = this.bSP.size() - 1; i >= 0; i--) {
      ((aNL)this.bSP.get(i)).beH();
    }
    this.bSP.clear();

    SX();

    for (i = this.bSQ.size() - 1; i >= 0; i--) {
      ((aNL)this.bSQ.get(i)).beH();
    }
    this.bSQ.clear();
  }

  public void SW()
  {
    Object localObject;
    for (int i = this.bSP.size() - 1; i >= 0; i--) {
      localObject = (axl)this.bSP.get(i);
      if (((axl)localObject).isRemovable()) {
        ((aNL)localObject).beH();
        this.bSP.remove(i);
      }
    }

    SX();

    for (i = this.bSQ.size() - 1; i >= 0; i--) {
      localObject = (cfd)this.bSQ.get(i);
      if (((cfd)localObject).isRemovable()) {
        ((aNL)localObject).beH();
        this.bSQ.remove(i);
      }
    }
  }

  public void setState(String paramString)
  {
    this.bSS = paramString;
  }

  public String getState()
  {
    return this.bSS;
  }

  public String getCurrentState()
  {
    return this.bST;
  }

  public String getTag() {
    return "Appearance";
  }

  public void setEnabled(String paramString, boolean paramBoolean) {
    this.bST = paramString;

    for (int i = 0; i < this.bSP.size(); i++) {
      axl localaxl = (axl)this.bSP.get(i);
      if ((localaxl.getLabel() != null) && (localaxl.getLabel().equals(paramString))) {
        localaxl.setEnabled(paramBoolean);
      }
    }

    ArrayList localArrayList = new ArrayList();
    for (int j = this.bSQ.size() - 1; j >= 0; j--) {
      cfd localcfd = (cfd)this.bSQ.get(j);
      if ((localcfd.getLabel() != null) && (localcfd.getLabel().equals(paramString))) {
        localcfd.setEnabled(paramBoolean);
        if ((!localArrayList.contains(localcfd.getClass())) && (localcfd.isEnabled())) {
          if (localcfd.isDecoratorSwitch())
            localcfd.setup(this);
          else {
            localcfd.setup(getWidget());
          }
          localArrayList.add(localcfd.getClass());
        }
      }
    }
  }

  public void setWidget(dOc paramdOc)
  {
    super.setWidget(paramdOc);
    int i = 0;
    Object localObject;
    for (int j = this.bSP.size(); i < j; i++) {
      localObject = (axl)this.bSP.get(i);
      if ((((axl)localObject).getState().equalsIgnoreCase(this.bST)) && (this.aPS != null)) {
        ((axl)localObject).setEnabled(true);
      }
    }
    i = 0; for (j = this.bSQ.size(); i < j; i++) {
      localObject = (cfd)this.bSQ.get(i);
      if ((((cfd)localObject).getState().equalsIgnoreCase(this.bST)) && (this.aPS != null)) {
        ((cfd)localObject).setEnabled(true);
        if (!((cfd)localObject).isDecoratorSwitch()) {
          ((cfd)localObject).setup(paramdOc);
        }
      }
    }
    i = 0; for (j = this.bSR.size(); i < j; i++) {
      localObject = (dxR)this.bSR.get(i);
      a((dxR)localObject, false);
    }
    if ((this.bPm != null) && ((this.aPS instanceof dKW))) {
      ((dKW)this.aPS).setModulationColor(this.bPm);
    }
    paramdOc.setNeedsToResetMeshes();
  }

  public void setNeedsToResetMeshes() {
    if (this.aPS != null)
      this.aPS.setNeedsToResetMeshes();
  }

  public void setColor(bNa parambNa, String paramString)
  {
    if ((paramString == null) || (paramString.equalsIgnoreCase("modulation")))
      setModulationColor(parambNa);
  }

  public void setModulationColor(bNa parambNa)
  {
    if (this.bPm == parambNa) {
      return;
    }

    this.bPm = parambNa;

    if ((this.aPS instanceof dKW))
      ((dKW)this.aPS).setModulationColor(parambNa);
    Object localObject;
    for (int i = this.bSP.size() - 1; i >= 0; i--) {
      localObject = (axl)this.bSP.get(i);
      if ((localObject instanceof dKW)) {
        ((dKW)localObject).setModulationColor(parambNa);
      }
    }
    for (i = this.bSQ.size() - 1; i >= 0; i--) {
      localObject = (cfd)this.bSQ.get(i);
      if ((localObject instanceof dKW))
        ((dKW)localObject).setModulationColor(parambNa);
    }
  }

  public bNa getModulationColor()
  {
    return this.bPm;
  }

  public void SX()
  {
    Insets localInsets = null;
    for (int i = this.bSP.size() - 1; i >= 0; i--) {
      axl localaxl = (axl)this.bSP.get(i);
      if ((localaxl instanceof jH)) {
        localInsets = ((jH)localaxl).getInsets();
        break;
      }
    }

    if (localInsets == null) {
      localInsets = new Insets(0, 0, 0, 0);
    }

    setBorder(localInsets);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    Jg localJg = (Jg)parambdj;
    if (this.bPm != null)
      localJg.setModulationColor(this.bPm);
  }

  public void SY()
  {
    for (Iterator localIterator = this.bSP.iterator(); localIterator.hasNext(); ) { localObject = (axl)localIterator.next();
      ((axl)localObject).setEnabled(false);
    }
    Object localObject;
    for (localIterator = this.bSQ.iterator(); localIterator.hasNext(); ) { localObject = (cfd)localIterator.next();
      ((cfd)localObject).setEnabled(false);
    }
  }

  public void validate()
  {
    if (this.aPS != null) {
      for (int i = this.bSP.size() - 1; i >= 0; i--) {
        ((axl)this.bSP.get(i)).b(this.aPS.haN, this.ePX, this.ePY, this.ePZ);
      }
    }
    super.validate();
  }

  public void bc()
  {
    super.bc();

    this.bSP.clear();
    this.bSQ.clear();
    this.bSR.clear();

    this.bPm = null;
  }

  public void aJ()
  {
    super.aJ();

    this.bSS = "DEFAULT";
    this.bST = "DEFAULT";
    this.bSU = true;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == bFb)
      setModulationColor(paramaKN.gJ(paramString));
    else if (paramInt == bSV)
      setState(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == bFb)
      setModulationColor((bNa)paramObject);
    else if (paramInt == bSV)
      setState(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}