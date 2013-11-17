import java.awt.Point;

public class dxn extends dRq
  implements bUe, cSV, doN
{
  public static final String TAG = "WatcherContainer";
  protected agn af;
  protected boolean lDr;
  private aFG aWn;
  private int bjr;
  private int bjs;
  private boolean lDs;
  protected wk lDt;
  public static final int drs = "align".hashCode();
  public static final int lDu = "target".hashCode();
  public static final int lDv = "useTargetPositionning".hashCode();
  public static final int drv = "xOffset".hashCode();
  public static final int drw = "yOffset".hashCode();

  public dxn()
  {
    this.lDr = true;

    this.aWn = null;
    this.bjr = 0;
    this.bjs = 0;

    this.lDs = true;
  }

  public wk getWatcherContainerAdviser()
  {
    return this.lDt;
  }

  protected void k(int paramInt, float paramFloat)
  {
  }

  public int cIP()
  {
    return dbI.cNt().a(this.lDt);
  }

  public void cxB()
  {
  }

  public float getWorldX()
  {
    if (this.af != null) {
      return this.af.getWorldX();
    }
    return 0.0F;
  }

  public float getWorldY()
  {
    if (this.af != null) {
      return this.af.getWorldY();
    }
    return 0.0F;
  }

  public float getAltitude() {
    if (this.af != null) {
      return this.af.getAltitude();
    }
    return 0.0F;
  }

  public String getTag() {
    return "WatcherContainer";
  }

  public aFG getAlign()
  {
    return this.aWn;
  }

  public void setAlign(aFG paramaFG)
  {
    this.aWn = paramaFG;
  }

  public agn getTarget()
  {
    return this.af;
  }

  public void setTarget(agn paramagn)
  {
    if (this.af != paramagn) {
      if (this.af != null) {
        this.af.b(this);
      }

      this.af = paramagn;

      if (this.af != null) {
        this.af.a(this);
      }
    }

    if (this.af != null)
      a(null, this.af.getScreenX(), this.af.getScreenY(), this.af.eY());
  }

  public void setTarget(agn paramagn, int paramInt1, int paramInt2)
  {
    this.bjr = paramInt1;
    this.bjs = paramInt2;

    if ((this.af != null) && (this.af != paramagn)) {
      this.af.b(this);
    }
    this.af = paramagn;
    if (this.af != null) {
      this.af.a(this);
      a(null, this.af.getScreenX(), this.af.getScreenY(), this.af.eY());
    }
  }

  public boolean isUseTargetPositionning()
  {
    return this.lDs;
  }

  public void setUseTargetPositionning(boolean paramBoolean)
  {
    this.lDs = paramBoolean;
  }

  public int getXOffset()
  {
    return this.bjr;
  }

  public void setXOffset(int paramInt)
  {
    this.bjr = paramInt;
    if (this.af != null)
      a(null, this.af.getScreenX(), this.af.getScreenY(), this.af.eY());
  }

  public int getYOffset()
  {
    return this.bjs;
  }

  public void setYOffset(int paramInt)
  {
    this.bjs = paramInt;
    if (this.af != null)
      a(null, this.af.getScreenX(), this.af.getScreenY(), this.af.eY());
  }

  public void setOffset(int paramInt1, int paramInt2)
  {
    this.bjr = paramInt1;
    this.bjs = paramInt2;
    if ((this.af != null) && (this.af.eZ()))
      a(null, this.af.getScreenX(), this.af.getScreenY(), this.af.eY());
  }

  public void setPosition(int paramInt1, int paramInt2)
  {
    if (!this.lDs)
      super.setPosition(paramInt1, paramInt2);
  }

  public void setPosition(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (!this.lDs)
      super.setPosition(paramInt1, paramInt2, paramBoolean);
  }

  public void setPosition(Point paramPoint)
  {
    if (!this.lDs)
      super.setPosition(paramPoint);
  }

  public void setX(int paramInt)
  {
    if (!this.lDs)
      super.setX(paramInt);
  }

  public void setY(int paramInt)
  {
    if (!this.lDs)
      super.setY(paramInt);
  }

  public void setTargetIsVisible(boolean paramBoolean)
  {
    this.lDr = paramBoolean;
  }

  protected void atG() {
    setVisible(this.lDr);
  }

  public void ccT()
  {
    super.ccT();
    if (this.af != null)
      this.af.b(this);
  }

  public void a(agn paramagn, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.lDs) {
      MD localMD = getComputedPosition(paramInt1, paramInt2, paramInt3);
      super.setPosition(localMD.getX(), localMD.getY(), false);
    }
  }

  protected final int getHalfDisplayWidth() {
    return bsP.getInstance().getWidth() / 2;
  }

  protected final int getHalfDisplayHeight() {
    return bsP.getInstance().getHeight() / 2;
  }

  public MD getComputedPosition(int paramInt1, int paramInt2, int paramInt3) {
    return new MD(paramInt1 + getHalfDisplayWidth() + (int)(this.bjr * this.lDt.getZoomFactor()) - this.aWn.iO(getWidth()), paramInt2 + getHalfDisplayHeight() + (int)(this.bjs * this.lDt.getZoomFactor()) + this.aWn.iP(paramInt3));
  }

  public void validate()
  {
    super.validate();
    if (this.af != null)
      a(null, this.af.getScreenX(), this.af.getScreenY(), this.af.eY());
  }

  public boolean a(cSx paramcSx)
  {
    if (paramcSx.mp() != CH.bGJ) {
      return false;
    }
    if (this.af != null) {
      a(null, this.af.getScreenX(), this.af.getScreenY(), this.af.eY());
    }

    return false;
  }

  public void bc()
  {
    super.bc();
    dbI.cNt().b(this.lDt);
    this.aWn = null;
    this.af = null;

    this.lDt = null;

    bsP.getInstance().b(CH.bGJ, this, false);
  }

  public void aJ()
  {
    super.aJ();
    setVisible(true);

    this.lDs = true;

    this.aWn = aFG.ech;

    this.lDt = new wk(this, null);

    bsP.getInstance().a(CH.bGJ, this, false);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    dxn localdxn = (dxn)parambdj;
    localdxn.setUseTargetPositionning(isUseTargetPositionning());
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else if (paramInt == lDv)
      setUseTargetPositionning(bUD.getBoolean(paramString));
    else if (paramInt == drv)
      setXOffset(bUD.aR(paramString));
    else if (paramInt == drw)
      setYOffset(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == drs)
      setAlign((aFG)paramObject);
    else if (paramInt == lDv)
      setUseTargetPositionning(bUD.getBoolean(paramObject));
    else if (paramInt == drv)
      setXOffset(bUD.aR(paramObject));
    else if (paramInt == drw)
      setYOffset(bUD.aR(paramObject));
    else if (paramInt == lDu)
      setTarget((agn)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}