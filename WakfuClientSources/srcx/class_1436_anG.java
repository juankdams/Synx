public class anG extends bxE
{
  public static final String TAG = "popup";
  private aFG drn = aFG.ecg;
  private aFG aWn = aFG.eco;
  private boolean dro = true;
  private dOc drp;
  private int drq;
  private int drr;
  public static final int drs = "align".hashCode();
  public static final int drt = "hotSpotPosition".hashCode();
  public static final int dru = "hideOnClick".hashCode();
  public static final int drv = "xOffset".hashCode();
  public static final int drw = "yOffset".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof dOc)) {
      this.drp = ((dOc)paramaNL);
      this.drp.setIsATemplate(true);
      super.a(paramaNL, false);
    } else {
      super.a(paramaNL);
    }
  }

  public String getTag() {
    return "popup";
  }

  public aFG getHotSpotPosition()
  {
    return this.drn;
  }

  public void setHotSpotPosition(aFG paramaFG)
  {
    this.drn = paramaFG;
  }

  public aFG getAlign()
  {
    return this.aWn;
  }

  public void setAlign(aFG paramaFG)
  {
    this.aWn = paramaFG;
  }

  public boolean getHideOnClick() {
    return this.dro;
  }

  public void setHideOnClick(boolean paramBoolean) {
    this.dro = paramBoolean;
  }

  public void setXOffset(int paramInt) {
    this.drq = paramInt;
  }

  public void setYOffset(int paramInt) {
    this.drr = paramInt;
  }

  public dOc getContent() {
    return this.drp;
  }

  public void c(bdj parambdj)
  {
    anG localanG = (anG)parambdj;
    super.c(parambdj);

    localanG.setAlign(this.aWn);
    localanG.setHotSpotPosition(this.drn);
    localanG.setHideOnClick(this.dro);
  }

  public void a(bqp parambqp) {
    a(parambqp, bsP.getInstance().getPopupContainer());
  }

  public void a(bqp parambqp, dwY paramdwY) {
    if (paramdwY != null)
      if (!paramdwY.getVisible())
        b(parambqp, paramdwY);
      else
        a(paramdwY);
  }

  public void b(bqp parambqp)
  {
    dwY localdwY = bsP.getInstance().getPopupContainer();
    b(parambqp, localdwY);
  }

  public void b(bqp parambqp, dwY paramdwY) {
    if ((paramdwY != null) && (parambqp.getElementMap() != null)) {
      paramdwY.setAlign(this.aWn);
      paramdwY.setHotSpotPosition(this.drn);
      paramdwY.setContent(this.drp);
      paramdwY.setClient(parambqp);
      paramdwY.setHideOnClick(this.dro);
      paramdwY.setXOffset(this.drq);
      paramdwY.setYOffset(this.drr);
      paramdwY.show();
      MQ.WK().WR();
    }
  }

  public void hide()
  {
    a(bsP.getInstance().getPopupContainer());
  }

  public void a(dwY paramdwY) {
    if (paramdwY != null)
      paramdwY.hide();
  }

  public void bc()
  {
    super.bc();

    if (this.drp != null) {
      this.drp = null;
    }

    this.aWn = null;
    this.drn = null;
  }

  public void aJ()
  {
    super.aJ();

    this.dro = true;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else if (paramInt == drt)
      setHotSpotPosition(aFG.gr(paramString));
    else if (paramInt == dru)
      setHideOnClick(bUD.getBoolean(paramString));
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
    if (paramInt == dru)
      setHideOnClick(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}