public class biy extends dRq
  implements Qe, aWM, dbR, doT
{
  public static final String TAG = "Button";
  protected czv fyP;
  protected caF eun;
  protected aFG aWn;
  protected aFD fyQ;
  protected Pw fyR;
  protected P dQn;
  protected boolean aQS = true;
  protected doN fyS;
  protected doN cGQ;
  protected doN fvF;
  protected doN fyT;
  protected doN fyU;
  protected doN fyV;
  protected int cj = -1;

  public static final int fyW = "text".hashCode();
  public static final int drs = "align".hashCode();
  public static final int fyX = "font".hashCode();
  public static final int bFb = "modulationColor".hashCode();
  public static final int fyY = "textOrientation".hashCode();
  public static final int dTZ = "texture".hashCode();
  public static final int fyZ = "pixmapAlign".hashCode();
  public static final int cq = "clickSoundId".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR))
      setPixmap((aAR)paramaNL);
    else if ((paramaNL instanceof caF)) {
      setLabel((caF)paramaNL);
    }
    super.a(paramaNL);
  }

  public void b(aNL paramaNL) {
    if ((paramaNL instanceof czv)) {
      if ((this.fyP != null) && (this.fyP != paramaNL)) {
        this.fyP.beH();
      }
      this.fyP = ((czv)paramaNL);
    }
    super.b(paramaNL);
  }

  public String getTag()
  {
    return "Button";
  }

  public aFD getPixmapAlign()
  {
    return this.fyQ;
  }

  public void setPixmapAlign(aFD paramaFD)
  {
    this.fyQ = paramaFD;
    cfM();
  }

  public Pw getTextOrientation()
  {
    return this.fyR;
  }

  public void setTextOrientation(Pw paramPw)
  {
    this.fyR = paramPw;
    if (this.eun != null)
      this.eun.setOrientation(paramPw);
  }

  public void setAlign(aFG paramaFG)
  {
    this.aWn = paramaFG;
    this.aQS = true;
    setNeedsToPreProcess();
  }

  public void setLabel(caF paramcaF)
  {
    if ((paramcaF != this.eun) && (this.eun != null)) {
      this.eun.beH();
      this.eun = paramcaF;
    } else if (this.eun == null) {
      this.eun = paramcaF;
    }

    if (this.eun != null) {
      this.eun.setOrientation(this.fyR);
      this.eun.setColor(getAppearance().getTextColor(), null);
      this.eun.setFont(getAppearance().getFont());
      this.eun.setAlign(aFG.eck);
    }
  }

  public void setText(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      if (this.eun != null) {
        i(this.eun);
      }
      return;
    }
    if (this.eun == null) {
      this.eun = new caF();
      this.eun.aJ();
      a(this.eun);
    }
    this.eun.setText(paramString);
  }

  public String getText()
  {
    if (this.eun != null) {
      return this.eun.getText();
    }
    return "";
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    ajk();
  }

  public void setNetEnabled(boolean paramBoolean) {
    super.setNetEnabled(paramBoolean);
    ajk();
  }

  private void ajk() {
    if (isEnabledFull())
      getAppearance().dgX();
    else
      getAppearance().dgW();
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if (this.fnH) {
      return null;
    }

    if ((this.aYZ) && (!this.meQ) && (getAppearance().bQ(paramInt1, paramInt2)) && (!bsP.getInstance().isMovePointMode())) {
      return this;
    }
    return null;
  }

  public dFr getAppearance()
  {
    return (dFr)this.czl;
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof dFr;
  }

  public void setTexture(uz paramuz)
  {
    aAR localaAR = null;
    if (paramuz != null) {
      localaAR = aAR.checkOut();
      localaAR.setTexture(paramuz);
    }

    setPixmap(localaAR);
  }

  public void setModulationColor(bNa parambNa) {
    if (this.fyP != null)
      this.fyP.setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    if (this.fyP != null) {
      return this.fyP.getModulationColor();
    }
    return null;
  }

  public void setPixmap(aAR paramaAR)
  {
    if (paramaAR != null) {
      if (this.fyP == null) {
        this.fyP = new czv();
        this.fyP.aJ();
        a(this.fyP);
      }

      this.fyP.setPixmap(paramaAR);
    }
    else if (this.fyP != null) {
      this.fyP.beH();
      this.fyP = null;
    }
  }

  public void setFocusable(boolean paramBoolean)
  {
    super.setFocusable(paramBoolean);

    if ((this.meU) && (this.fyS == null)) {
      this.fyS = new OB(this);

      a(CH.bGh, this.fyS, false);
    } else if ((!this.meU) && (this.fyS != null)) {
      b(CH.bGh, this.fyS, false);
      this.fyS = null;
    }
  }

  public void setFont(P paramP)
  {
    if (this.eun != null) {
      this.eun.setFont(paramP);
    }
    this.dQn = paramP;
  }

  public void setColor(bNa parambNa, String paramString)
  {
    if ((this.eun != null) && ((paramString == null) || (paramString.equalsIgnoreCase("text"))))
      this.eun.setColor(parambNa, null);
  }

  public void setClickSoundId(int paramInt)
  {
    this.cj = paramInt;
  }

  public int getClickSoundId() {
    return this.cj;
  }

  protected void a(cSx paramcSx, boolean paramBoolean)
  {
    if (!paramcSx.cIn())
      switch (OE.cab[paramcSx.mp().ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
        paramcSx.iH(true);
        switch (this.cj) {
        case -1:
          MQ.WK().click();
          break;
        case -2:
          MQ.WK().WO();
          break;
        default:
          MQ.WK().fN(this.cj);
        }break;
      case 5:
        MQ.WK().rollOver();
        paramcSx.iH(true);
      }
  }

  public void buz()
  {
    D(1, 1, 0);
  }

  public void D(int paramInt1, int paramInt2, int paramInt3)
  {
    getAppearance().dgU();
    cAo.cxf().a(new GR(this, paramInt1, paramInt2, paramInt3, getScreenX() + this.haN.width / 2, getScreenY() + this.haN.height / 2), 200L, 0, 1);
  }

  public void ajj()
  {
    super.ajj();
  }

  public void ew()
  {
    this.cGQ = new Ox(this);

    bsP.getInstance().a(CH.bGv, this.cGQ, false);

    this.fvF = new Oz(this);

    a(CH.bGu, this.fvF, false);

    this.fyT = new OG(this);

    a(CH.bGs, this.fyT, false);

    this.fyU = new OF(this);

    a(CH.bGt, this.fyU, false);
  }

  public void bc()
  {
    super.bc();

    this.fyP = null;
    this.eun = null;

    bsP.getInstance().b(CH.bGv, this.cGQ, false);

    this.fyT = null;
    this.fyU = null;
    this.fvF = null;
    this.cGQ = null;
    this.fyS = null;
  }

  public void aJ()
  {
    super.aJ();

    dFr localdFr = dFr.checkOut();
    localdFr.setWidget(this);
    a(localdFr);

    aFV localaFV = new aFV(this);
    localaFV.aJ();
    a(localaFV);

    this.meQ = false;
    this.aWn = aFG.eck;
    this.fyQ = aFD.ebY;
    this.fyR = Pw.chX;
    this.cj = -1;

    ew();
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);
    if (this.aQS) {
      invalidate();
      this.aQS = false;
    }
    return bool;
  }

  public void c(bdj parambdj)
  {
    biy localbiy = (biy)parambdj;
    super.c(localbiy);
    localbiy.aWn = this.aWn;
    localbiy.fyQ = this.fyQ;
    localbiy.fyR = this.fyR;
    localbiy.cj = this.cj;

    localbiy.b(CH.bGu, this.fvF, false);
    localbiy.b(CH.bGs, this.fyT, false);
    localbiy.b(CH.bGt, this.fyU, false);
    if (this.fyS != null)
      localbiy.b(CH.bGh, this.fyS, false);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fyW)
      setText(paramaKN.gL(paramString));
    else if (paramInt == drs)
      setAlign((aFG)paramaKN.b(aFG.class, paramString));
    else if (paramInt == bFb)
      setModulationColor(paramaKN.gJ(paramString));
    else if (paramInt == fyX)
      setFont(paramaKN.gO(paramString));
    else if (paramInt == fyY)
      setTextOrientation((Pw)paramaKN.b(Pw.class, paramString));
    else if (paramInt == dTZ)
      setTexture(paramaKN.gN(paramString));
    else if (paramInt == fyZ)
      setPixmapAlign((aFD)paramaKN.b(aFD.class, paramString));
    else if (paramInt == cq)
      setClickSoundId(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == fyW) {
      if (paramObject == null)
        setText(null);
      else
        setText(String.valueOf(paramObject));
    }
    else if (paramInt == drs)
      setAlign((aFG)paramObject);
    else if (paramInt == bFb)
      setModulationColor((bNa)paramObject);
    else if (paramInt == fyX)
      setFont((P)paramObject);
    else if (paramInt == fyY)
      setTextOrientation((Pw)paramObject);
    else if (paramInt == dTZ)
      setTexture((uz)paramObject);
    else if (paramInt == fyZ)
      setPixmapAlign((aFD)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }

  public duv getCursorType()
  {
    return duv.lym;
  }
}