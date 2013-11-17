public abstract class UX extends bxE
  implements OA
{
  protected dOc aPS;
  protected Jg czl;
  protected boolean bur = false;
  protected boolean czm = true;

  public static final int czn = "enabled".hashCode();
  public static final int czo = "removable".hashCode();

  public boolean isEnabled()
  {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean)
  {
    this.bur = paramBoolean;
    if (this.czl != null)
      this.czl.setNeedsToResetMeshes();
  }

  public void setWidget(dOc paramdOc)
  {
    this.aPS = paramdOc;
  }

  public dOc getWidget()
  {
    return this.aPS;
  }

  public void setDecoratorAppearance(Jg paramJg)
  {
    this.czl = paramJg;
  }

  public Jg getDecoratorAppearance()
  {
    return this.czl;
  }

  public boolean isRemovable()
  {
    return this.czm;
  }

  public void setRemovable(boolean paramBoolean)
  {
    this.czm = paramBoolean;
  }

  public void aaJ()
  {
  }

  public void bc()
  {
    super.bc();
    this.aPS = null;
    this.czl = null;
  }

  public void aJ()
  {
    super.aJ();
    this.bur = false;
    this.czm = true;
  }

  public void c(bdj parambdj)
  {
    UX localUX = (UX)parambdj;
    super.c(localUX);
    localUX.bur = this.bur;
    localUX.czm = this.czm;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == czn)
      setEnabled(bUD.getBoolean(paramString));
    else if (paramInt == czo)
      setRemovable(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == czn)
      setEnabled(bUD.getBoolean(paramObject));
    else if (paramInt == czo)
      setRemovable(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}