public final class drf extends Jg
{
  public static final String TAG = "AnimatedElementViewerAppearance";
  private boolean dHj;
  private boolean dHk;
  public static final int dHm = "direction".hashCode();
  public static final int dHn = "filePath".hashCode();
  public static final int dHp = "animName".hashCode();
  public static final int dHq = "offsetX".hashCode();
  public static final int dHr = "offsetY".hashCode();
  public static final int dHs = "scale".hashCode();
  public static final int dHt = "useDefaultMaterial".hashCode();
  public static final int dHu = "blendPremult".hashCode();
  public static final int dHw = "flipHorizontal".hashCode();
  public static final int dHx = "flipVertical".hashCode();
  private String dHa;
  private String UV;
  private float aZs;
  private float aZt;
  private float cas;
  private int dHb;
  private boolean ltE = true;

  public String getTag()
  {
    return "AnimatedElementViewerAppearance";
  }

  public final String getFilePath() {
    return this.dHa;
  }

  public final void setFilePath(String paramString) {
    this.dHa = paramString;
    if (this.aPS != null)
      getAnimatedElementViewer().setFilePath(paramString);
  }

  public String getAnimName() {
    return this.UV;
  }

  public void setAnimName(String paramString) {
    this.UV = paramString;
    if (this.aPS != null)
      getAnimatedElementViewer().setAnimName(this.UV);
  }

  public float getOffsetX() {
    return this.aZs;
  }

  public void setOffsetX(float paramFloat) {
    this.aZs = paramFloat;
    if (this.aPS != null)
      getAnimatedElementViewer().setOffsetX(this.aZs);
  }

  public float getOffsetY() {
    return this.aZt;
  }

  public void setOffsetY(float paramFloat) {
    this.aZt = paramFloat;
    if (this.aPS != null)
      getAnimatedElementViewer().setOffsetY(this.aZt);
  }

  public float getScale() {
    return this.cas;
  }

  public void setScale(float paramFloat) {
    this.cas = paramFloat;
    if (this.aPS != null)
      getAnimatedElementViewer().setScale(this.cas);
  }

  public void setFlipHorizontal(boolean paramBoolean) {
    this.dHj = paramBoolean;
    if (this.aPS != null)
      getAnimatedElementViewer().setFlipHorizontal(this.dHj);
  }

  public void setFlipVertical(boolean paramBoolean) {
    this.dHk = paramBoolean;
    if (this.aPS != null)
      getAnimatedElementViewer().setFlipVertical(this.dHk);
  }

  public int getDirection() {
    return this.dHb;
  }

  public void setDirection(int paramInt) {
    this.dHb = paramInt;
    if (this.aPS != null)
      getAnimatedElementViewer().setDirection(this.dHb);
  }

  public void setUseBlendPremult(boolean paramBoolean) {
    this.ltE = paramBoolean;
    if (this.aPS != null)
      getAnimatedElementViewer().setUseBlendPremult(this.ltE);
  }

  public final auC getAnimatedElementViewer() {
    return (auC)this.aPS;
  }

  public final void setWidget(dOc paramdOc)
  {
    super.setWidget(paramdOc);

    auC localauC = getAnimatedElementViewer();
    localauC.setFilePath(this.dHa);
    localauC.setAnimName(this.UV);
    localauC.setOffsetX(this.aZs);
    localauC.setOffsetY(this.aZt);
    localauC.setScale(this.cas);
    localauC.setFlipHorizontal(this.dHj);
    localauC.setFlipVertical(this.dHk);
    localauC.setDirection(this.dHb);
    localauC.setUseBlendPremult(this.ltE);
  }

  public final void c(bdj parambdj)
  {
    drf localdrf = (drf)parambdj;
    super.c(localdrf);
    if (this.dHa != null) {
      localdrf.setFilePath(this.dHa);
      localdrf.setAnimName(this.UV);
      localdrf.setOffsetX(this.aZs);
      localdrf.setOffsetY(this.aZt);
      localdrf.setScale(this.cas);
      localdrf.setFlipHorizontal(this.dHj);
      localdrf.setFlipVertical(this.dHk);
      localdrf.setDirection(this.dHb);
      localdrf.setUseBlendPremult(this.ltE);
    }
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == dHn)
      setFilePath(paramString);
    else if (paramInt == dHp)
      setAnimName(paramString);
    else if (paramInt == dHm)
      setDirection(bUD.aR(paramString));
    else if (paramInt == dHq)
      setOffsetX(bUD.getFloat(paramString));
    else if (paramInt == dHr)
      setOffsetY(bUD.getFloat(paramString));
    else if (paramInt == dHs)
      setScale(bUD.getFloat(paramString));
    else if (paramInt == dHu)
      setUseBlendPremult(bUD.getBoolean(paramString));
    else if (paramInt == dHw)
      setFlipHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == dHx)
      setFlipVertical(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == dHn)
      setFilePath((String)paramObject);
    else if (paramInt == dHp)
      setAnimName((String)paramObject);
    else if (paramInt == dHm)
      setDirection(bUD.aR(paramObject));
    else if (paramInt == dHq)
      setOffsetX(bUD.getFloat(paramObject));
    else if (paramInt == dHr)
      setOffsetY(bUD.getFloat(paramObject));
    else if (paramInt == dHs)
      setScale(bUD.getFloat(paramObject));
    else if (paramInt == dHu)
      setUseBlendPremult(bUD.getBoolean(paramObject));
    else if (paramInt == dHw)
      setFlipHorizontal(bUD.getBoolean(paramObject));
    else if (paramInt == dHx)
      setFlipVertical(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}