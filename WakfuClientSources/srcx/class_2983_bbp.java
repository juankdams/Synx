import java.awt.Point;

public class bbp extends dRq
{
  public static final String TAG = "ScrollContainer";
  public static final String fjQ = "horizontalScrollBar";
  public static final String fjR = "verticalScrollBar";
  private dRR fjS;
  private dRR fjT;
  private dOf fjU;
  private dOf fjV;
  private boolean fjW;
  private boolean fjX;
  private aFG fjY;
  private boolean fjZ;
  private float fka;
  private boolean fkb;
  private boolean fkc;
  private aqK fkd;
  private boolean fke;
  private float fkf;
  private float fkg;
  private aFD fkh;
  private aFD fki;
  private boolean fkj;
  private dOc fkk;
  private float fkl;
  private bDI fkm;
  public static final int fkn = "enableScrollBar".hashCode();
  public static final int fko = "horizontalScrollBarBehaviour".hashCode();
  public static final int fkp = "verticalScrollBarBehaviour".hashCode();
  public static final int fkq = "horizontalScrollBarPosition".hashCode();
  public static final int fkr = "verticalScrollBarPosition".hashCode();
  public static final int fks = "horizontalScrollBarAlignment".hashCode();
  public static final int fkt = "verticalScrollBarAlignment".hashCode();
  public static final int fku = "autoScrollHorizontal".hashCode();
  public static final int fkv = "autoScrollVertical".hashCode();
  public static final int fkw = "innerWidgetAlign".hashCode();
  public static final int fkx = "pageJumpRatio".hashCode();

  public bbp()
  {
    this.fjU = dOf.mfI;
    this.fjV = dOf.mfI;

    this.fjW = false;
    this.fjX = false;

    this.fjY = null;

    this.fjZ = true;

    this.fka = 1.0F;
    this.fkb = false;
    this.fkc = false;

    this.fkh = aFD.ebX;
    this.fki = aFD.ebW;

    this.fkj = false;
  }

  public void i(dOc paramdOc)
  {
    if ((paramdOc != this.fjS) && (paramdOc != this.fjT))
    {
      if (this.fkk != null) {
        i(this.fkk);
      }

      this.fkk = paramdOc;

      this.fkk.setSize(this.fkk.getPrefSize());
    }

    super.i(paramdOc);
  }

  public String getTag()
  {
    return "ScrollContainer";
  }

  public aFD getVerticalScrollBarAlignment() {
    return this.fkh;
  }

  public void setVerticalScrollBarAlignment(aFD paramaFD) {
    this.fkh = paramaFD;
  }

  public aFD getHorizontalScrollBarAlignment() {
    return this.fki;
  }

  public void setHorizontalScrollBarAlignment(aFD paramaFD) {
    this.fki = paramaFD;
  }

  public dOf getVerticalScrollBarBehaviour() {
    return this.fjU;
  }

  public void setVerticalScrollBarBehaviour(dOf paramdOf)
  {
    if ((this.fjU == null) || (!this.fjU.equals(paramdOf))) {
      this.fjU = paramdOf;
      this.fkj = true;
      setNeedsToPreProcess();
    }
  }

  public void setVerticalScrollBarPosition(float paramFloat) {
    this.fjS.setValue(paramFloat);
  }

  public dOf getHorizontalScrollBarBehaviour() {
    return this.fjV;
  }

  public void setHorizontalScrollBarBehaviour(dOf paramdOf)
  {
    if ((this.fjV == null) || (!this.fjV.equals(paramdOf))) {
      this.fjV = paramdOf;
      this.fkj = true;
      setNeedsToPreProcess();
    }
  }

  public void setHorizontalScrollBarPosition(float paramFloat) {
    this.fjT.setValue(paramFloat);
  }

  public boolean isEnableScrollBar() {
    return this.fjZ;
  }

  public void setEnableScrollBar(boolean paramBoolean) {
    this.fjZ = paramBoolean;
    this.fkj = true;
    setNeedsToPreProcess();
  }

  public aFG getInnerWidgetAlign() {
    return this.fjY;
  }

  public void setInnerWidgetAlign(aFG paramaFG)
  {
    this.fjY = paramaFG;
  }

  public dRR getVerticalScrollBar() {
    return this.fjS;
  }

  public dRR getHorizontalScrollBar() {
    return this.fjT;
  }

  public float getPageJumpRatio() {
    return this.fkl;
  }

  public void setAutoScrollVertical(boolean paramBoolean) {
    this.fkb = paramBoolean;
  }

  public void setAutoScrollHorizontal(boolean paramBoolean) {
    this.fkc = paramBoolean;
  }

  public void setDndListenerContentValidator(aqK paramaqK) {
    this.fkd = paramaqK;
    if (this.fkm == null) {
      this.fkm = new aEC(this);

      ajT.axh().a(this.fkm);
    }
  }

  public void setPageJumpRatio(float paramFloat) {
    this.fkl = paramFloat;
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if ("horizontalScrollBar".equalsIgnoreCase(paramString)) {
      return this.fjT;
    }

    if ("verticalScrollBar".equalsIgnoreCase(paramString)) {
      return this.fjS;
    }

    return null;
  }

  public avN getScissor(dOc paramdOc)
  {
    if ((paramdOc == this.fjS) || (paramdOc == this.fjT)) {
      return avN.m(getScreenX() + this.czl.getLeftInset(), getScreenY() + this.czl.getBottomInset(), this.haN.width - this.czl.getLeftInset() - this.czl.getRightInset(), this.haN.height - this.czl.getBottomInset() - this.czl.getTopInset());
    }

    return avN.m(getScreenX() + this.czl.getLeftInset() + ((this.fjW) && (this.fkh.equals(aFD.ebY)) ? this.fjS.getWidth() : 0), getScreenY() + this.czl.getBottomInset() + ((this.fjX) && (this.fki.equals(aFD.ebW)) ? this.fjT.getHeight() : 0), this.haN.width - this.czl.getLeftInset() - this.czl.getRightInset() - (this.fjW ? this.fjS.getWidth() : 0), (int)(this.fka * (this.haN.height - this.czl.getBottomInset() - this.czl.getTopInset() - (this.fjX ? this.fjT.getHeight() : 0))));
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if ((this.fnH) || (!this.aYZ) || (!getAppearance().bQ(paramInt1, paramInt2)) || (bsP.getInstance().isMovePointMode())) {
      return null;
    }

    paramInt1 -= getAppearance().getLeftInset();
    paramInt2 -= getAppearance().getBottomInset();

    dOc localdOc = null;

    if ((this.fjX) && 
      (!this.fjT.isUnloading())) {
      localdOc = this.fjT.getWidget(paramInt1 - this.fjT.meF.x, paramInt2 - this.fjT.meF.y);
      if (localdOc != null) {
        return localdOc;
      }

    }

    if ((this.fjW) && 
      (!this.fjS.isUnloading())) {
      localdOc = this.fjS.getWidget(paramInt1 - this.fjS.meF.x, paramInt2 - this.fjS.meF.y);
      if (localdOc != null) {
        return localdOc;
      }

    }

    if ((this.fjW) && (this.fjX) && (paramInt2 < this.fjS.getY())) {
      return this.meQ ? null : this;
    }

    if ((this.fkk != null) && (!this.fkk.isUnloading())) {
      localdOc = this.fkk.getWidget(paramInt1 - this.fkk.meF.x, paramInt2 - this.fkk.meF.y);
    }
    return this.meQ ? null : localdOc != null ? localdOc : this;
  }

  public void bc(float paramFloat)
  {
    this.fjS.setValue(paramFloat);
  }

  public void bd(float paramFloat)
  {
    this.fjT.setValue(paramFloat);
  }

  public void invalidate() {
    super.invalidate();
  }

  public void bc()
  {
    super.bc();

    this.fjS = null;
    this.fjT = null;
    if (this.fkm != null) {
      ajT.axh().b(this.fkm);
      this.fkm = null;
    }
  }

  public void aJ()
  {
    super.aJ();

    bua localbua = new bua(this, null);
    localbua.aJ();
    a(localbua);

    this.meQ = false;

    a(CH.bGu, false);
    a(CH.bGv, false);
    a(CH.bGw, false);
    a(CH.bGx, false);
    a(CH.bGq, false);
    a(CH.bGp, false);
    a(CH.bGr, false);

    this.fka = 1.0F;
    this.fkl = 0.5F;

    this.fjS = new dRR();
    this.fjS.aJ();
    this.fjS.setCanBeCloned(false);
    this.fjS.setHorizontal(false);
    a(this.fjS);

    this.fjS.a(CH.bGC, new aEz(this), false);

    this.fjT = new dRR();
    this.fjT.aJ();
    this.fjT.setCanBeCloned(false);
    this.fjT.setHorizontal(true);
    a(this.fjT);

    this.fjT.a(CH.bGC, new aEy(this), false);

    a(CH.bGy, new aEx(this), false);

    this.fjZ = true;
    this.mfi = true;
  }

  public void bpP() {
    J(rY.class);
    this.fka = 1.0F;
  }

  public void bpQ() {
    a(new rY(this, this.fka, 0.0F, this, 10000, 5000, ddp.kWG));
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.fkj) {
      cfM();
      this.fkj = false;
    }

    if (this.fke) {
      this.fjS.setValue(bCO.t(this.fjS.getValue() + this.fkf, 0.0F, 1.0F));
      this.fjT.setValue(bCO.t(this.fjT.getValue() + this.fkg, 0.0F, 1.0F));
      return true;
    }

    return bool;
  }

  public void c(bdj parambdj)
  {
    bbp localbbp = (bbp)parambdj;
    super.c(localbbp);
    localbbp.fjV = this.fjV;
    localbbp.fjU = this.fjU;
    localbbp.fjY = this.fjY;
    localbbp.fjZ = this.fjZ;
    localbbp.fkl = this.fkl;
    localbbp.fkd = this.fkd;
    localbbp.fkb = this.fkb;
    localbbp.fkc = this.fkc;

    localbbp.meW = true;
    localbbp.setNeedsToPreProcess();
  }

  private void bpR()
  {
    l(this.fjT.getSlider().getValue());
    m(this.fjS.getSlider().getValue());
  }

  private void l(double paramDouble)
  {
    int i = this.fkk.getSize().width;
    int j = this.czl.getContentWidth();
    if (this.fjW)
      j = (int)(j - this.fjS.getSize().getWidth());
    int k;
    if ((this.fjY == null) || (i - j > 0))
      k = -(int)((i - j) * paramDouble);
    else {
      k = this.fjY.ba(i, j);
    }
    if ((this.fjW) && (this.fkh.equals(aFD.ebY))) {
      k = (int)(k + this.fjS.getSize().getWidth());
    }
    this.fkk.setX(k);
  }

  private void m(double paramDouble)
  {
    int i = this.fkk.getSize().height;
    int j = this.czl.getContentHeight();
    if (this.fjX)
      j = (int)(j - this.fjT.getSize().getHeight());
    int k;
    if ((this.fjY == null) || (i - j > 0))
      k = -(int)((i - j) * paramDouble);
    else {
      k = this.fjY.bb(i, j);
    }
    if ((this.fjX) && (this.fki.equals(aFD.ebW))) {
      k = (int)(k + this.fjT.getSize().getHeight());
    }
    this.fkk.setY(k);
  }

  public boolean bpS()
  {
    return getAppearance().getContentHeight() < this.fkk.getPrefSize().getHeight();
  }

  public boolean bpT()
  {
    return getAppearance().getContentWidth() < this.fkk.getPrefSize().getWidth();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fkn)
      setEnableScrollBar(bUD.getBoolean(paramString));
    else if (paramInt == fko)
      setHorizontalScrollBarBehaviour(dOf.rD(paramString));
    else if (paramInt == fkp)
      setVerticalScrollBarBehaviour(dOf.rD(paramString));
    else if (paramInt == fkw)
      setInnerWidgetAlign(aFG.gr(paramString));
    else if (paramInt == fkq)
      setHorizontalScrollBarPosition(bUD.getFloat(paramString));
    else if (paramInt == fkr)
      setVerticalScrollBarPosition(bUD.getFloat(paramString));
    else if (paramInt == fks)
      setHorizontalScrollBarAlignment(aFD.gp(paramString));
    else if (paramInt == fkt)
      setVerticalScrollBarAlignment(aFD.gp(paramString));
    else if (paramInt == fkx)
      setPageJumpRatio(bUD.getFloat(paramString));
    else if (paramInt == fku)
      setAutoScrollHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == fkv)
      setAutoScrollVertical(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == fkn)
      setEnableScrollBar(bUD.getBoolean(paramObject));
    else if (paramInt == fko)
      setHorizontalScrollBarBehaviour((dOf)paramObject);
    else if (paramInt == fkp)
      setVerticalScrollBarBehaviour((dOf)paramObject);
    else if (paramInt == fkq)
      setHorizontalScrollBarPosition(bUD.getFloat(paramObject));
    else if (paramInt == fkr)
      setVerticalScrollBarPosition(bUD.getFloat(paramObject));
    else if (paramInt == fkw)
      setInnerWidgetAlign((aFG)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}