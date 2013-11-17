import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cwJ extends Jg
{
  public static final String TAG = "TextWidgetAppearance";
  public static final String iiS = "TextViewAppearance";
  public static final String iiT = "TextEditorAppearance";
  public static final String iiU = "LabelAppearance";
  public static final String iiV = "text";
  private static final aee aOr = new bOO(new dJU());
  private aFG aWn;
  private P iiW;
  private bNa aDi;
  private boolean dEM;
  private boolean iiX;
  private boolean haz;
  private boolean iiY;
  public static final int drs = "align".hashCode();
  public static final int hqW = "alignment".hashCode();
  public static final int iiZ = "justify".hashCode();
  public static final int fyX = "font".hashCode();
  public static final int ija = "textColor".hashCode();
  public static final int ijb = "useHighContrast".hashCode();

  public static cwJ checkOut()
  {
    cwJ localcwJ;
    try
    {
      localcwJ = (cwJ)aOr.Mm();
      localcwJ.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localcwJ = new cwJ();
      localcwJ.aJ();
    }
    return localcwJ;
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
  }

  public String getTag()
  {
    return "TextWidgetAppearance";
  }

  public void setWidget(dOc paramdOc)
  {
    if ((this.aWn != null) && ((paramdOc instanceof aWM))) {
      ((aWM)paramdOc).setAlign(this.aWn);
    }
    if ((this.iiW != null) && ((paramdOc instanceof dbR))) {
      ((dbR)paramdOc).setFont(this.iiW);
    }
    if ((this.aDi != null) && ((paramdOc instanceof Qe))) {
      ((Qe)paramdOc).setColor(this.aDi, null);
    }
    if ((this.iiX) && ((this.aPS instanceof duS))) {
      ((duS)this.aPS).setUseHighContrast(this.dEM);
    }
    if ((this.iiY) && ((this.aPS instanceof duS))) {
      ((duS)this.aPS).setJustify(this.haz);
    }
    super.setWidget(paramdOc);
  }

  public void setUseHighContrast(boolean paramBoolean)
  {
    this.dEM = paramBoolean;
    this.iiX = true;
    if ((this.aPS != null) && ((this.aPS instanceof duS)))
      ((duS)this.aPS).setUseHighContrast(this.dEM);
  }

  public boolean getUseHighContrast()
  {
    return this.dEM;
  }

  public boolean getJustify() {
    return this.haz;
  }

  public void setJustify(boolean paramBoolean) {
    this.haz = paramBoolean;
    this.iiY = true;
    if ((this.aPS != null) && ((this.aPS instanceof duS)))
      ((duS)this.aPS).setJustify(paramBoolean);
  }

  public void setAlign(aFG paramaFG)
  {
    this.aWn = paramaFG;
    if ((this.aWn != null) && (this.aPS != null) && ((this.aPS instanceof aWM)))
      ((aWM)this.aPS).setAlign(paramaFG);
  }

  public aFG getAlign()
  {
    return this.aWn;
  }

  public void setAlignment(aFG paramaFG)
  {
    setAlign(paramaFG);
  }

  public aFG getAlignment()
  {
    int i = 0;
    cfd localcfd;
    for (int j = this.bSQ.size(); i < j; i++) {
      localcfd = (cfd)this.bSQ.get(i);
      if (((localcfd instanceof pI)) && (localcfd.getState().equalsIgnoreCase(this.bST))) {
        return ((pI)localcfd).getAlignment();
      }
    }
    i = 0; for (j = this.bSQ.size(); i < j; i++) {
      localcfd = (cfd)this.bSQ.get(i);
      if (((localcfd instanceof pI)) && (localcfd.getState().equalsIgnoreCase("DEFAULT"))) {
        return ((pI)localcfd).getAlignment();
      }
    }
    return this.aWn;
  }

  public void setFont(P paramP) {
    this.iiW = paramP;
    if ((this.aPS instanceof dbR))
      ((dbR)this.aPS).setFont(paramP);
  }

  public P getFont()
  {
    int i = 0;
    cfd localcfd;
    for (int j = this.bSQ.size(); i < j; i++) {
      localcfd = (cfd)this.bSQ.get(i);
      if (((localcfd instanceof bJA)) && (localcfd.getState().equalsIgnoreCase(this.bST))) {
        return ((bJA)localcfd).getRenderer();
      }
    }

    i = 0; for (j = this.bSQ.size(); i < j; i++) {
      localcfd = (cfd)this.bSQ.get(i);
      if (((localcfd instanceof bJA)) && (localcfd.getState().equalsIgnoreCase("DEFAULT"))) {
        return ((bJA)localcfd).getRenderer();
      }

    }

    return this.iiW;
  }

  public void setColor(bNa parambNa, String paramString)
  {
    if ((paramString == null) || ("text".equals(paramString)))
      setTextColor(parambNa);
    else
      super.setColor(parambNa, paramString);
  }

  public void setTextColor(bNa parambNa)
  {
    if (this.aDi == parambNa) {
      return;
    }

    this.aDi = parambNa;

    if ((this.aPS instanceof Qe))
      ((Qe)this.aPS).setColor(parambNa, null);
  }

  public bNa getTextColor()
  {
    int i = 0;
    cfd localcfd;
    for (int j = this.bSQ.size(); i < j; i++) {
      localcfd = (cfd)this.bSQ.get(i);
      if (((localcfd instanceof cAf)) && (localcfd.getState().equalsIgnoreCase(this.bST))) {
        return ((cAf)localcfd).getColor();
      }
    }

    i = 0; for (j = this.bSQ.size(); i < j; i++) {
      localcfd = (cfd)this.bSQ.get(i);
      if (((localcfd instanceof cAf)) && (localcfd.getState().equalsIgnoreCase("DEFAULT"))) {
        return ((cAf)localcfd).getColor();
      }
    }
    return this.aDi;
  }

  public void bc()
  {
    super.bc();

    this.aWn = null;
    this.iiW = null;

    this.aDi = null;
  }

  public void aJ()
  {
    super.aJ();

    this.dEM = false;
    this.iiX = false;
  }

  public void c(bdj parambdj)
  {
    if ((this.etK != null) && ("rollingText".equals(this.etK.getId()))) {
      K.info("coucou");
    }
    cwJ localcwJ = (cwJ)parambdj;
    super.c(localcwJ);
    if (this.aWn != null) {
      localcwJ.setAlign(this.aWn);
    }
    if (this.iiW != null) {
      localcwJ.setFont(this.iiW);
    }
    if (this.aDi != null) {
      localcwJ.setTextColor(this.aDi);
    }
    if (this.iiX)
      localcwJ.setUseHighContrast(this.dEM);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if ((paramInt == drs) || (paramInt == hqW))
      setAlign(aFG.gr(paramString));
    else if (paramInt == iiZ)
      setJustify(bUD.getBoolean(paramString));
    else if (paramInt == fyX)
      setFont(paramaKN.gO(paramString));
    else if (paramInt == ija)
      setTextColor(paramaKN.gJ(paramString));
    else if (paramInt == ijb)
      setUseHighContrast(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == ija)
      setTextColor((bNa)paramObject);
    else if ((paramInt == drs) || (paramInt == hqW))
      setAlign((aFG)paramObject);
    else if (paramInt == iiZ)
      setJustify(bUD.getBoolean(paramObject));
    else if (paramInt == fyX)
      setFont((bMR)paramObject);
    else if (paramInt == ijb)
      setUseHighContrast(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}