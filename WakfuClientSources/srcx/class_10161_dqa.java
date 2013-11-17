public class dqa extends dRq
{
  public static final String TAG = "WindowMovePoint";
  public static final String cwM = "WMP";
  private bpn cGL;
  private boolean lqP = false;
  private boolean lqQ = false;
  private int lqR;
  private int lqS;
  private dhh lqT;
  private doN cGQ;
  private boolean bY = true;

  private boolean aKX = true;

  public static final int ct = "horizontal".hashCode();
  public static final int aLc = "vertical".hashCode();

  public String getTag()
  {
    return "WindowMovePoint";
  }

  public void setHorizontal(boolean paramBoolean)
  {
    this.bY = paramBoolean;
  }

  public boolean isHorizontal()
  {
    return this.bY;
  }

  public boolean isVertical() {
    return this.aKX;
  }

  public void setVertical(boolean paramBoolean) {
    this.aKX = paramBoolean;
  }

  public bpn getWindow() {
    return this.cGL;
  }

  public void setDragMousePosition(int paramInt1, int paramInt2) {
    this.lqP = true;
    this.lqR = (paramInt1 - this.cGL.getDisplayX());
    this.lqS = (paramInt2 - this.cGL.getDisplayY());
  }

  public void aji()
  {
    this.cGQ = new atl(this);

    bsP.getInstance().a(CH.bGv, this.cGQ, false);

    a(CH.bGq, new atk(this), false);
  }

  public void ajj()
  {
    super.ajj();
    this.cGL = ((bpn)getWidgetParentOfType(bpn.class));
    if (this.cGL != null) {
      this.lqT = ((dhh)this.cGL.getWidgetParentOfType(dhh.class));
      this.cGL.a(this);
    }
  }

  public void bc()
  {
    super.bc();

    bsP.getInstance().b(CH.bGv, this.cGQ, false);
    this.cGL = null;
  }

  public void aJ()
  {
    super.aJ();
    aji();
    setCursorType(duv.lyn);
    this.meQ = false;

    this.bY = true;
    this.aKX = true;
  }

  public void c(bdj parambdj)
  {
    dqa localdqa = (dqa)parambdj;
    super.c(parambdj);
    localdqa.setHorizontal(this.bY);
    localdqa.setVertical(this.aKX);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == aLc)
      setVertical(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramObject));
    else if (paramInt == aLc)
      setVertical(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    return bsP.getInstance().isMovePointMode() ? this : super.getWidget(paramInt1, paramInt2);
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
      setCursorType(duv.lyn);
    else
      setCursorType(duv.lyl);
  }
}