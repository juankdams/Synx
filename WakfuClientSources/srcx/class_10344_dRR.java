import org.apache.log4j.Logger;

public class dRR extends dRq
{
  private static Logger K = Logger.getLogger(dRR.class);
  public static final String TAG = "ScrollBar";
  public static final String mny = "horizontalSlider";
  public static final String mnz = "verticalSlider";
  public static final String mnA = "horizontalIncreaseButton";
  public static final String mnB = "verticalIncreaseButton";
  public static final String mnC = "horizontalDecreaseButton";
  public static final String mnD = "verticalDecreaseButton";
  private static final int NO_SCROLL = 0;
  private static final int SCROLL_UP = 1;
  private static final int SCROLL_DOWN = 2;
  private int mnE;
  private doN mnF;
  private doN hVU;
  private doN mnG;
  private doN mnH;
  private czU mnI;
  private boolean bY;
  private float igK;
  private biy gfO;
  private biy gfP;
  private cvx mnJ;
  public static final int ct = "horizontal".hashCode();
  public static final int mnK = "buttonJump".hashCode();
  public static final int crX = "value".hashCode();

  public dRR()
  {
    this.mnE = 0;

    this.mnI = new czU(this, null);

    this.bY = false;

    this.igK = 0.05F;
  }

  public String getTag()
  {
    return "ScrollBar";
  }

  public float getValue()
  {
    return this.mnJ.getValue();
  }

  public void setValue(float paramFloat)
  {
    this.mnJ.setValue(paramFloat);
  }

  public float getButtonJump()
  {
    return this.igK;
  }

  public void setButtonJump(float paramFloat)
  {
    if (paramFloat < 0.0F)
      paramFloat = 0.0F;
    else if (paramFloat > 1.0F) {
      paramFloat = 1.0F;
    }
    this.igK = paramFloat;
  }

  public boolean isHorizontal()
  {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean)
  {
    this.bY = paramBoolean;
    this.mnJ.setHorizontal(paramBoolean);
  }

  public cvx getSlider()
  {
    return this.mnJ;
  }

  public void setSlider(cvx paramcvx)
  {
    this.mnJ = paramcvx;
  }

  public void setSliderSize(float paramFloat) {
    this.mnJ.setSliderSize(paramFloat);

    boolean bool = paramFloat != 1.0F;
    this.mnJ.getButton().setVisible(bool);
    this.gfO.setEnabled(bool);
    this.gfP.setEnabled(bool);
  }

  public biy getDecreaseButton()
  {
    return this.gfP;
  }

  public void setDecreaseButton(biy parambiy)
  {
    this.gfP = parambiy;
  }

  public void setIncreaseButton(biy parambiy)
  {
    this.gfO = parambiy;
  }

  public biy getIncreaseButton()
  {
    return this.gfO;
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if ((this.bY) || (paramBoolean)) {
      if ("horizontalSlider".equalsIgnoreCase(paramString))
        return this.mnJ;
      if ("horizontalDecreaseButton".equalsIgnoreCase(paramString))
        return this.gfP;
      if ("horizontalIncreaseButton".equalsIgnoreCase(paramString)) {
        return this.gfO;
      }
    }

    if ((!this.bY) || (paramBoolean)) {
      if ("verticalSlider".equalsIgnoreCase(paramString))
        return this.mnJ;
      if ("verticalDecreaseButton".equalsIgnoreCase(paramString))
        return this.gfP;
      if ("verticalIncreaseButton".equalsIgnoreCase(paramString)) {
        return this.gfO;
      }
    }

    return null;
  }

  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.gfO.setEnabled(paramBoolean);
    this.gfP.setEnabled(paramBoolean);
    this.mnJ.setEnabled(paramBoolean);
    this.mnJ.setVisible(this.mnJ.isEnabledFull());
  }

  public void setNetEnabled(boolean paramBoolean) {
    super.setNetEnabled(paramBoolean);
    this.gfO.setNetEnabled(paramBoolean);
    this.gfP.setNetEnabled(paramBoolean);
    this.mnJ.setNetEnabled(paramBoolean);
    this.mnJ.setVisible(isEnabledFull());
  }

  public void dsA() {
    int i = 0; int j = 0;
    if (this.bY) {
      this.gfP.setPosition(i, j);

      this.mnJ.setPosition(i + this.gfP.getWidth(), j);

      i = getAppearance().getContentWidth() - this.gfP.getWidth();
      this.gfO.setPosition(i, j);
    }
    else {
      j = getAppearance().getContentHeight() - this.gfO.getHeight();
      this.gfO.setPosition(i, j);
      j = 0;
      this.gfP.setPosition(i, j);
      this.mnJ.setPosition(i, j + this.gfP.getHeight());
    }
  }

  private void dsB()
  {
    if (this.mnE != 0) {
      cAo.cxf().b(this.mnI);
      cAo.cxf().a(this.mnI, 150L, this.mnE, 1);
    }
  }

  public void dsC()
  {
    this.mnF = new cVV(this);

    this.hVU = new cVT(this);

    this.mnG = new cVU(this);

    this.mnH = new cVM(this);

    bsP.getInstance().a(CH.bGv, this.mnF, false);

    a(CH.bGw, this.hVU, false);

    this.gfO.a(CH.bGt, this.mnF, false);
    this.gfO.a(CH.bGu, this.mnG, false);
    this.gfO.a(CH.bGs, this.mnG, false);

    this.gfP.a(CH.bGt, this.mnF, false);
    this.gfP.a(CH.bGu, this.mnH, false);
    this.gfP.a(CH.bGs, this.mnH, false);
  }

  public void bc()
  {
    super.bc();

    this.gfO = null;
    this.gfP = null;
    this.mnJ = null;

    bsP.getInstance().b(CH.bGv, this.mnF, false);
  }

  public void aJ()
  {
    super.aJ();

    aoG localaoG = new aoG(this, null);
    localaoG.aJ();
    a(localaoG);

    this.gfO = new biy();
    this.gfO.aJ();
    this.gfO.setCanBeCloned(false);
    this.gfO.setClickSoundId(MQ.WK().WT());

    this.gfP = new biy();
    this.gfP.aJ();
    this.gfP.setCanBeCloned(false);
    this.gfP.setClickSoundId(MQ.WK().WU());

    this.mnJ = new cvx();
    this.mnJ.aJ();
    this.mnJ.setCanBeCloned(false);

    this.meQ = false;

    a(this.gfP);
    a(this.gfO);
    a(this.mnJ);

    dsC();
  }

  public void c(bdj parambdj)
  {
    dRR localdRR = (dRR)parambdj;
    super.c(localdRR);
    localdRR.bY = this.bY;
    localdRR.igK = this.igK;

    localdRR.b(CH.bGw, this.hVU, false);

    localdRR.getIncreaseButton().b(CH.bGs, this.mnG, false);
    localdRR.getIncreaseButton().b(CH.bGu, this.mnG, false);
    localdRR.getIncreaseButton().b(CH.bGt, this.mnF, false);
    localdRR.getDecreaseButton().b(CH.bGs, this.mnH, false);
    localdRR.getDecreaseButton().b(CH.bGu, this.mnH, false);
    localdRR.getDecreaseButton().b(CH.bGt, this.mnF, false);

    localdRR.meW = true;
    localdRR.setNeedsToPreProcess();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == mnK)
      setButtonJump(bUD.getFloat(paramString));
    else if (paramInt == crX)
      setValue(bUD.getFloat(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramObject));
    else if (paramInt == mnK)
      setButtonJump(bUD.getFloat(paramObject));
    else if (paramInt == crX)
      setValue(bUD.getFloat(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}