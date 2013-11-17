public class cwP extends dgQ
{
  public static final String TAG = "StaticLayoutData";
  public static final String cwM = "sld";
  private Or hda;
  private ajb ijn;
  private int hY = 0; private int hZ = 0;
  private cwC ijo;
  private cwC ijp;
  private int bjr = 0; private int bjs = 0;
  private boolean ijq = false; private boolean ijr = false;
  private boolean ijs = false; private boolean ijt = false;
  private boolean iju = false;

  private boolean dgA = true;

  private dOc ijv = null;
  private String ijw = null;
  private boolean ijx = false;

  public static final int drs = "align".hashCode();
  public static final int hqW = "alignment".hashCode();
  public static final int ijy = "cascadeMethodEnabled".hashCode();
  public static final int ijz = "resizeOnce".hashCode();
  public static final int ijA = "initValue".hashCode();
  public static final int ijB = "size".hashCode();
  public static final int ijC = "usable".hashCode();
  public static final int dTX = "x".hashCode();
  public static final int drv = "xOffset".hashCode();
  public static final int ijD = "xPerc".hashCode();
  public static final int dTY = "y".hashCode();
  public static final int drw = "yOffset".hashCode();
  public static final int ijE = "yPerc".hashCode();

  public String getTag()
  {
    return "StaticLayoutData";
  }

  public boolean isInitValue() {
    return this.iju;
  }

  public void setInitValue(boolean paramBoolean) {
    this.iju = paramBoolean;
    this.dgA = true;
  }

  public void setResizeOnce(boolean paramBoolean)
  {
    setInitValue(paramBoolean);
  }

  public boolean isAutoPositionable() {
    return this.ijv != null;
  }

  public boolean isCascadePositionable() {
    return this.ijx;
  }

  public dOc getReferentWidget()
  {
    return this.ijv;
  }

  public void setReferentWidget(dOc paramdOc)
  {
    this.ijv = paramdOc;
  }

  public void setCascadeMethodEnabled(boolean paramBoolean) {
    this.ijx = paramBoolean;
  }

  public String getControlGroup() {
    return this.ijw;
  }

  public void setControlGroup(String paramString) {
    this.ijw = paramString;
  }

  public int getX()
  {
    return this.hY;
  }

  public cwC getXPerc() {
    return this.ijo;
  }

  public void setXPerc(cwC paramcwC) {
    this.ijo = paramcwC;
  }

  public cwC getYPerc() {
    return this.ijp;
  }

  public void setYPerc(cwC paramcwC) {
    this.ijp = paramcwC;
  }

  public void setX(int paramInt)
  {
    this.ijq = true;
    this.hY = paramInt;
  }

  public boolean isXInit() {
    return this.ijq;
  }

  public int getY()
  {
    return this.hZ;
  }

  public void setY(int paramInt)
  {
    this.ijr = true;
    this.hZ = paramInt;
  }

  public boolean isYInit() {
    return this.ijr;
  }

  public int getXOffset()
  {
    return this.bjr;
  }

  public void setXOffset(int paramInt)
  {
    this.ijs = true;
    this.bjr = paramInt;
  }

  public int getYOffset()
  {
    return this.bjs;
  }

  public void setYOffset(int paramInt)
  {
    this.ijt = true;
    this.bjs = paramInt;
  }

  public boolean isXOffsetInit()
  {
    return this.ijs;
  }

  public boolean isYOffsetInit()
  {
    return this.ijt;
  }

  public Or getSize()
  {
    return this.hda;
  }

  public void setSize(Or paramOr)
  {
    this.hda = paramOr;
  }

  public ajb getAlignment()
  {
    return this.ijn;
  }

  public void setAlignment(ajb paramajb)
  {
    this.ijn = paramajb;
  }

  public void setAlign(ajb paramajb)
  {
    this.ijn = paramajb;
  }

  public void setUsable(boolean paramBoolean) {
    this.dgA = paramBoolean;
  }

  public boolean isUsable() {
    return (!this.iju) || (this.dgA);
  }

  public void aJ()
  {
    super.aJ();

    this.hY = 0;
    this.hZ = 0;
    this.bjr = 0;
    this.bjs = 0;
    this.ijq = false;
    this.ijr = false;
    this.ijs = false;
    this.ijt = false;

    this.iju = false;
    this.ijx = false;
    this.dgA = true;
  }

  public void bc()
  {
    super.bc();

    this.ijv = null;
    this.hda = null;
    this.ijn = null;
    this.ijw = null;
    this.ijo = null;
    this.ijp = null;
  }

  public void c(bdj parambdj)
  {
    cwP localcwP = (cwP)parambdj;
    super.c(localcwP);
    localcwP.ijn = this.ijn;
    if (this.hda != null) {
      localcwP.hda = ((Or)this.hda.clone());
    }
    if (this.ijq) {
      localcwP.setX(this.hY);
    }
    if (this.ijr) {
      localcwP.setY(this.hZ);
    }
    if (this.ijs) {
      localcwP.setXOffset(this.bjr);
    }
    if (this.ijt) {
      localcwP.setYOffset(this.bjs);
    }
    if (this.ijo != null) {
      localcwP.setXPerc((cwC)this.ijo.clone());
    }
    if (this.ijp != null)
      localcwP.setYPerc((cwC)this.ijp.clone());
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if ((paramInt == drs) || (paramInt == hqW))
      setAlign(ajb.eB(paramString));
    else if (paramInt == ijy) {
      setCascadeMethodEnabled(bUD.getBoolean(paramString));
    }
    else if ((paramInt == ijz) || (paramInt == ijA))
      setInitValue(bUD.getBoolean(paramString));
    else if (paramInt == ijB)
      setSize(paramaKN.gK(paramString));
    else if (paramInt == ijC)
      setUsable(bUD.getBoolean(paramString));
    else if (paramInt == dTX)
      setX(bUD.aR(paramString));
    else if (paramInt == drv)
      setXOffset(bUD.aR(paramString));
    else if (paramInt == ijD)
      setXPerc(paramaKN.gP(paramString));
    else if (paramInt == dTY)
      setY(bUD.aR(paramString));
    else if (paramInt == drw)
      setYOffset(bUD.aR(paramString));
    else if (paramInt == ijE)
      setYPerc(paramaKN.gP(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == ijD)
      setXPerc((cwC)paramObject);
    else if (paramInt == ijE)
      setYPerc((cwC)paramObject);
    else if (paramInt == ijB)
      setSize((Or)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}