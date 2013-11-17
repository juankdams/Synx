public class cOq extends dRq
  implements Qe, dKW, dbR
{
  public static final String TAG = "progressText";
  public static final String kwK = " / ";
  public static final String kwL = "¯";
  public static final String beH = "%";
  private caF eun;
  private caF kwM;
  private caF kwN;
  private Pw fyR;
  private bNa bPo;
  private P dQn;
  private boolean bY;
  private dwA kwO;
  private boolean kwP;
  public static final float dmR = 0.0F;
  public static final float dmS = 1.0F;
  private float dmT;
  private float dmU;
  private float dmV;
  public static final int kwQ = "displayValue".hashCode();
  public static final int fyX = "font".hashCode();
  public static final int ct = "horizontal".hashCode();
  public static final int dnk = "maxBound".hashCode();
  public static final int dnl = "minBound".hashCode();
  public static final int kwR = "splitText".hashCode();
  public static final int fyY = "textOrientation".hashCode();
  public static final int crX = "value".hashCode();

  public cOq()
  {
    this.fyR = Pw.chX;
    this.bPo = null;
    this.dQn = null;

    this.bY = true;
    this.kwO = dwA.lCb;
    this.kwP = true;

    this.dmT = 0.0F;
    this.dmU = 1.0F;

    this.dmV = 0.0F;
  }

  public String getTag()
  {
    return "progressText";
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof cwJ;
  }

  public cwJ getAppearance()
  {
    return (cwJ)this.czl;
  }

  public void setTextOrientation(Pw paramPw)
  {
    this.fyR = paramPw;
    if (this.eun != null) {
      this.eun.setOrientation(paramPw);
    }
    if (this.kwM != null) {
      this.kwM.setOrientation(paramPw);
    }
    if (this.kwN != null)
      this.kwN.setOrientation(paramPw);
  }

  public void setFont(P paramP)
  {
    if (this.eun != null) {
      this.eun.setFont(paramP);
    }
    if (this.kwM != null) {
      this.kwM.setFont(paramP);
    }
    if (this.kwN != null) {
      this.kwN.setFont(paramP);
    }
    this.dQn = paramP;
  }

  public void setModulationColor(bNa parambNa) {
    if (this.eun != null) {
      this.eun.setModulationColor(parambNa);
    }

    if (this.kwM != null) {
      this.kwM.setModulationColor(parambNa);
    }

    if (this.kwN != null)
      this.kwN.setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    if (this.eun != null) {
      return this.eun.getModulationColor();
    }
    return null;
  }

  public void setColor(bNa parambNa, String paramString) {
    if ((paramString == null) || (paramString.equalsIgnoreCase("text"))) {
      if (this.bPo == parambNa) {
        return;
      }
      this.bPo = parambNa;

      if (this.eun != null) {
        this.eun.setColor(this.bPo, null);
      }
      if (this.kwM != null) {
        this.kwM.setColor(this.bPo, null);
      }
      if (this.kwN != null)
        this.kwN.setColor(this.bPo, null);
    }
  }

  private void setText(String paramString)
  {
    setText(paramString, null);
  }

  private void setText(String paramString1, String paramString2)
  {
    if ((!this.kwP) && (paramString1 != null) && (!paramString1.equals("")) && (paramString2 != null) && (!paramString2.equals("")))
    {
      paramString1 = paramString1 + " / " + paramString2;
      if (this.kwM != null) {
        i(this.kwM);
        this.kwM = null;
      }
      if (this.kwN != null) {
        i(this.kwN);
        this.kwN = null;
      }
    }

    if ((paramString1 == null) || (paramString1.equals(""))) {
      if (this.eun != null) {
        i(this.eun);
        this.eun = null;
      }
      if (this.kwM != null) {
        i(this.kwM);
        this.kwM = null;
      }
      if (this.kwN != null) {
        i(this.kwN);
        this.kwN = null;
      }
      return;
    }
    if (this.eun == null) {
      this.eun = new caF();
      this.eun.aJ();
      a(this.eun);
      a(this.eun);
    }
    this.eun.setText(paramString1);
    if (!this.kwP) {
      return;
    }

    if ((paramString2 != null) && (!paramString2.equals(""))) {
      if (this.kwM == null) {
        this.kwM = new caF();
        this.kwM.aJ();
        a(this.kwM);
        a(this.kwM);
        this.kwM.setText("¯");
      }
      if (this.kwN == null) {
        this.kwN = new caF();
        this.kwN.aJ();
        a(this.kwN);
        a(this.kwN);
      }
      this.kwN.setText(paramString2);
    } else {
      if (this.kwM != null) {
        i(this.kwM);
        this.kwM = null;
      }
      if (this.kwN != null) {
        i(this.kwN);
        this.kwN = null;
      }
    }
  }

  private String getText()
  {
    if (this.eun != null) {
      return this.eun.getText();
    }
    return "";
  }

  public float getMinBound()
  {
    return this.dmT;
  }

  public void setMinBound(float paramFloat)
  {
    this.dmT = paramFloat;
    if (this.dmV < this.dmT) {
      this.dmV = this.dmT;
    }
    cGl();
  }

  public float getMaxBound()
  {
    return this.dmU;
  }

  public void setMaxBound(float paramFloat)
  {
    this.dmU = paramFloat;
    if (this.dmV > this.dmU) {
      this.dmV = this.dmU;
    }
    cGl();
  }

  public float getPercentage()
  {
    return (this.dmV - this.dmT) / (this.dmU - this.dmT);
  }

  public float getValue()
  {
    return this.dmV;
  }

  public void setValue(float paramFloat)
  {
    if (paramFloat < this.dmT)
      paramFloat = this.dmT;
    if (paramFloat > this.dmU) {
      paramFloat = this.dmU;
    }
    this.dmV = paramFloat;

    cGl();
  }

  public boolean isHorizontal()
  {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean)
  {
    if (this.bY != paramBoolean) {
      this.bY = paramBoolean;
    }
    cfM();
  }

  public boolean getSplitText()
  {
    return this.kwP;
  }

  public void setSplitText(boolean paramBoolean)
  {
    this.kwP = paramBoolean;
  }

  public dwA getDisplayValue()
  {
    return this.kwO;
  }

  public void setDisplayValue(dwA paramdwA)
  {
    this.kwO = paramdwA;
    cGl();
  }

  private void a(caF paramcaF)
  {
    paramcaF.setExpandable(false);
    paramcaF.setAlign(aFG.eck);
    paramcaF.setFont(this.dQn);
    paramcaF.setOrientation(this.fyR);
    paramcaF.setColor(this.bPo, null);
  }

  public void validate()
  {
    super.validate();
  }

  private void cGl()
  {
    switch (den.kYn[this.kwO.ordinal()]) {
    case 1:
      if (this.dmV - Math.floor(this.dmV) != 0.0D)
        setText(Float.toString(this.dmV));
      else {
        setText(Integer.toString((int)this.dmV));
      }
      break;
    case 2:
      setText(Integer.toString((int)(getPercentage() * 100.0F)) + "%");
      break;
    case 3:
      String str1;
      if (this.dmV - Math.floor(this.dmV) != 0.0D)
        str1 = Float.toString(this.dmV);
      else
        str1 = Integer.toString((int)this.dmV);
      String str2;
      if (this.dmU - Math.floor(this.dmU) != 0.0D)
        str2 = Float.toString(this.dmU);
      else {
        str2 = Integer.toString((int)this.dmU);
      }
      setText(str1, str2);
      break;
    case 4:
    default:
      setText("");
    }
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    cOq localcOq = (cOq)parambdj;
    localcOq.setHorizontal(this.bY);
    localcOq.setValue(this.dmV);
    localcOq.setMaxBound(this.dmU);
    localcOq.setMinBound(this.dmT);
    localcOq.setSplitText(this.kwP);
    localcOq.setTextOrientation(this.fyR);
    localcOq.setText(getText(), this.kwN != null ? this.kwN.getText() : "");
  }

  public void bc()
  {
    super.bc();

    this.fyR = null;
    this.dQn = null;

    this.eun = null;
    this.kwM = null;
    this.kwN = null;

    this.bPo = null;
  }

  public void aJ() {
    super.aJ();

    cwJ localcwJ = cwJ.checkOut();
    localcwJ.setWidget(this);
    a(localcwJ);

    dcs localdcs = new dcs(this);
    localdcs.aJ();
    a(localdcs);

    setNonBlocking(false);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == kwQ)
      setDisplayValue(dwA.qy(paramString));
    else if (paramInt == dnk)
      setMaxBound(bUD.getFloat(paramString));
    else if (paramInt == dnl)
      setMinBound(bUD.getFloat(paramString));
    else if (paramInt == fyX)
      setFont(paramaKN.gO(paramString));
    else if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == kwR)
      setSplitText(bUD.getBoolean(paramString));
    else if (paramInt == fyY)
      setTextOrientation(Pw.df(paramString));
    else if (paramInt == crX)
      setValue(bUD.getFloat(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == kwQ)
      setDisplayValue((dwA)paramObject);
    else if (paramInt == dnk)
      setMaxBound(bUD.getFloat(paramObject));
    else if (paramInt == dnl)
      setMinBound(bUD.getFloat(paramObject));
    else if (paramInt == fyX)
      setFont((bMR)paramObject);
    else if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramObject));
    else if (paramInt == kwR)
      setSplitText(bUD.getBoolean(paramObject));
    else if (paramInt == fyY)
      setTextOrientation((Pw)paramObject);
    else if (paramInt == crX)
      setValue(bUD.getFloat(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}