import java.util.ArrayList;

public class cvx extends dRq
  implements doT
{
  public static final String TAG = "Slider";
  public static final String igy = "horizontalButton";
  public static final String igz = "verticalButton";
  public static final String igA = "horizontalSeparator";
  public static final String igB = "verticalSeparator";
  private float dmV;
  private float igC;
  private int gfQ;
  private int gfR;
  private boolean igD;
  private boolean igE;
  private boolean igF;
  private int igG;
  private boolean igH;
  private boolean igI;
  private boolean bY;
  private float igJ;
  private float igK;
  private biy igL;
  private int igM;
  private int igN;
  private doN fvF;
  private doN fvG;
  private ArrayList igO;
  private aAR dnf;
  private bNa bPm;
  private boolean eaR;
  private boolean igP;
  public static final int igQ = "readOnly".hashCode();
  public static final int igR = "useTween".hashCode();
  public static final int ct = "horizontal".hashCode();
  public static final int dnk = "maxBound".hashCode();
  public static final int dnl = "minBound".hashCode();
  public static final int igS = "jump".hashCode();
  public static final int igT = "sliderSize".hashCode();
  public static final int crX = "value".hashCode();
  public static final int igU = "numFixedValues".hashCode();

  public cvx()
  {
    this.dmV = 0.0F;

    this.igC = 0.0F;

    this.gfQ = 0;
    this.gfR = 1;

    this.igD = true;
    this.igE = true;

    this.igF = false;
    this.igG = 0;

    this.igH = false;
    this.igI = false;

    this.bY = true;

    this.igJ = 0.15F;

    this.igK = 0.05F;

    this.fvF = null;
    this.fvG = null;

    this.igO = new ArrayList();
    this.dnf = null;
    this.bPm = null;

    this.eaR = false;
    this.igP = false;
  }

  public void a(aNL paramaNL)
  {
    if (((paramaNL instanceof biy)) && (this.igL != paramaNL)) {
      if (this.igL != null) {
        i(this.igL);
      }
      this.igL = ((biy)paramaNL);
      this.igL.setUsePositionTween((this.igH) && (this.igI));
    } else if ((paramaNL instanceof aAR)) {
      setPixmap((aAR)paramaNL);
    }

    super.a(paramaNL);
  }

  public String getTag()
  {
    return "Slider";
  }

  public float getValue() {
    return cl(this.dmV);
  }

  public void setValue(float paramFloat) {
    if (paramFloat == this.dmV) {
      return;
    }

    int i = this.igF ? 0 : this.gfQ;
    int j = this.igF ? this.igG - 1 : this.gfR;

    this.igC = paramFloat;

    if (paramFloat < i)
      paramFloat = i;
    else if (paramFloat > j) {
      paramFloat = j;
    }

    this.dmV = paramFloat;

    bXo localbXo = new bXo(this);
    localbXo.setValue(paramFloat);
    g(localbXo);

    this.igD = true;
    setNeedsToMiddleProcess();
  }

  public void setNumFixedValues(int paramInt) {
    if ((!bB) && (paramInt < 0)) throw new AssertionError("Invalid value. numFixedValues must be >= 0");
    if (paramInt == this.igG) {
      return;
    }

    this.igG = paramInt;

    this.igF = (this.igG != 0);
    this.igP = true;
    if (this.igF)
      setValue(this.igC);
  }

  public int getMinBound() {
    return this.gfQ;
  }

  public void setMinBound(int paramInt) {
    this.gfQ = paramInt;
  }

  public int getMaxBound() {
    return this.gfR;
  }

  public void setMaxBound(int paramInt) {
    this.gfR = paramInt;
  }

  public double getJump() {
    return this.igK;
  }

  public void setJump(float paramFloat) {
    if (paramFloat < 0.0F)
      paramFloat = 0.0F;
    else if (paramFloat > 1.0F) {
      paramFloat = 1.0F;
    }
    this.igK = paramFloat;
  }

  public boolean isHorizontal() {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean) {
    this.bY = paramBoolean;
  }

  public double getSliderSize() {
    return this.igJ;
  }

  public void setSliderSize(float paramFloat) {
    paramFloat = Math.min(1.0F, Math.max(paramFloat, 0.01F));

    this.igJ = paramFloat;
    this.igE = true;
    setNeedsToMiddleProcess();
  }

  public biy getButton() {
    return this.igL;
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if (((this.bY) || (paramBoolean)) && ("horizontalButton".equalsIgnoreCase(paramString))) {
      return this.igL;
    }
    if (((!this.bY) || (paramBoolean)) && ("verticalButton".equalsIgnoreCase(paramString))) {
      return this.igL;
    }
    return null;
  }

  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.igL.setEnabled(paramBoolean);
  }

  public void setNetEnabled(boolean paramBoolean) {
    super.setNetEnabled(paramBoolean);
    this.igL.setNetEnabled(paramBoolean);
  }

  public boolean getReadOnly() {
    return this.igH;
  }

  public void setReadOnly(boolean paramBoolean) {
    this.igH = paramBoolean;
    this.igL.setUsePositionTween((this.igH) && (this.igI));
  }

  public void setUseTween(boolean paramBoolean) {
    this.igI = paramBoolean;
    this.igL.setUsePositionTween((this.igH) && (this.igI));
  }

  public void setPixmap(aAR paramaAR) {
    if (paramaAR != this.dnf) {
      this.dnf = paramaAR;
      this.eaR = true;
      setNeedsToPreProcess();
    }
  }

  public void setModulationColor(bNa parambNa) {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;

    for (int i = this.igO.size() - 1; i >= 0; i--)
      ((czv)this.igO.get(i)).setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    return this.bPm;
  }

  private void ctk()
  {
    if ((this.igG <= 1) || (!this.igF) || (this.igO.size() <= 0))
      return;
    int i;
    int j;
    float f;
    int k;
    czv localczv;
    if (this.bY) {
      i = ((czv)this.igO.get(0)).getWidth();
      j = this.igL.getWidth() / 2 - i / 2;
      f = (getAppearance().getContentWidth() - this.igL.getWidth()) / (this.igG - 1);
      for (k = 0; k < this.igO.size(); k++) {
        localczv = (czv)this.igO.get(k);
        localczv.setPosition((int)(f * k + j), 0);
      }
    } else {
      i = ((czv)this.igO.get(0)).getHeight();
      j = this.igL.getHeight() / 2 - i / 2;
      f = (getAppearance().getContentHeight() - this.igL.getHeight()) / (this.igG - 1);
      for (k = 0; k < this.igO.size(); k++) {
        localczv = (czv)this.igO.get(k);
        localczv.setPosition(0, (int)(f * k + j));
      }
    }

    this.igP = false;
    setNeedsToMiddleProcess();
  }

  public void invalidate()
  {
    this.igE = true;
    this.igD = true;
    this.igP = true;
    setNeedsToMiddleProcess();
    super.invalidate();
  }

  private float cl(float paramFloat) {
    int i = this.igF ? 0 : this.gfQ;
    int j = this.igF ? this.igG - 1 : this.gfR;

    float f = paramFloat * (j - i) + i;

    if (this.igF) {
      f = Math.round(f);
    }

    return f;
  }

  private float cm(float paramFloat) {
    int i = this.igF ? 0 : this.gfQ;
    int j = this.igF ? this.igG - 1 : this.gfR;
    return (paramFloat - i) / (j - i);
  }

  public void ctl()
  {
    Or localOr1 = this.igL.getPrefSize();
    int i;
    int j;
    if (this.bY) {
      i = getAppearance().getContentHeight();
      j = Math.max((int)(getAppearance().getContentWidth() * this.igJ), localOr1.width);
    } else {
      j = getAppearance().getContentWidth();
      i = Math.max((int)(getAppearance().getContentHeight() * this.igJ), localOr1.height);
    }

    this.igL.setSize(j, i);
    int k;
    int m;
    if ((this.igO != null) && (this.igO.size() > 0)) {
      Or localOr2 = ((czv)this.igO.get(0)).getPrefSize();
      k = this.bY ? localOr2.width : j;
      m = this.bY ? i : localOr2.height;
      for (czv localczv : this.igO) {
        localczv.setSize(k, m);
      }
    }
    this.igE = false;
    setNeedsToMiddleProcess();
  }

  public void ctm()
  {
    int j;
    int i;
    if (this.bY) {
      j = 0;
      i = (int)(cm(this.dmV) * Math.max(0, getAppearance().getContentWidth() - this.igL.getWidth()));
    } else {
      i = 0;
      j = (int)(cm(this.dmV) * Math.max(0, getAppearance().getContentHeight() - this.igL.getHeight()));
    }

    this.igL.setPosition(i, j);

    this.igD = false;
    setNeedsToMiddleProcess();
  }

  public void ctn()
  {
    this.fvF = new dAM(this);

    a(CH.bGu, this.fvF, false);

    this.fvG = new dAQ(this);

    a(CH.bGq, this.fvG, true);
  }

  public void bc()
  {
    super.bc();

    this.igL = null;
    this.igO.clear();
    this.igE = false;
    this.dnf = null;
    this.igP = false;
  }

  public void aJ()
  {
    super.aJ();

    cNN localcNN = new cNN(this, null);
    localcNN.aJ();
    a(localcNN);

    this.igL = new biy();
    this.igL.aJ();
    this.igL.setCanBeCloned(false);
    a(this.igL);

    this.igM = 0;
    this.igN = 0;

    this.meQ = false;

    ctn();
  }

  public boolean je(int paramInt)
  {
    boolean bool = super.je(paramInt);

    if ((this.igE) || (this.igD)) {
      invalidate();
    }

    return bool;
  }

  public void c(bdj parambdj)
  {
    cvx localcvx = (cvx)parambdj;
    super.c(localcvx);
    localcvx.dmV = this.dmV;
    localcvx.gfQ = this.gfQ;
    localcvx.gfR = this.gfR;
    localcvx.igF = this.igF;
    localcvx.igG = this.igG;
    localcvx.igC = this.igC;
    localcvx.bY = this.bY;
    localcvx.igK = this.igK;
    localcvx.igJ = this.igJ;
    localcvx.igO = this.igO;
    localcvx.setReadOnly(this.igH);
    localcvx.setUseTween(this.igI);
    localcvx.setModulationColor(this.bPm);

    localcvx.b(CH.bGu, this.fvF, true);
    localcvx.b(CH.bGq, this.fvG, true);

    localcvx.meW = true;
    localcvx.setNeedsToPreProcess();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == igQ)
      setReadOnly(bUD.getBoolean(paramString));
    else if (paramInt == igR)
      setUseTween(bUD.getBoolean(paramString));
    else if (paramInt == dnk)
      setMaxBound(bUD.aR(paramString));
    else if (paramInt == dnl)
      setMinBound(bUD.aR(paramString));
    else if (paramInt == igS)
      setJump(bUD.getFloat(paramString));
    else if (paramInt == igT)
      setSliderSize(bUD.getFloat(paramString));
    else if (paramInt == crX)
      setValue(bUD.getFloat(paramString));
    else if (paramInt == igU)
      setNumFixedValues(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramObject));
    else if (paramInt == igQ)
      setReadOnly(bUD.getBoolean(paramObject));
    else if (paramInt == igR)
      setUseTween(bUD.getBoolean(paramObject));
    else if (paramInt == dnk)
      setMaxBound(bUD.aR(paramObject));
    else if (paramInt == dnl)
      setMinBound(bUD.aR(paramObject));
    else if (paramInt == igS)
      setJump(bUD.getFloat(paramObject));
    else if (paramInt == igT)
      setSliderSize(bUD.getFloat(paramObject));
    else if (paramInt == crX)
      setValue(bUD.getFloat(paramObject));
    else if (paramInt == igU)
      setNumFixedValues(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}