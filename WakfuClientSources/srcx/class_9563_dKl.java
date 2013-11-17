import java.awt.Insets;

public abstract class dKl extends bxE
{
  private final Insets ivy = new Insets(0, 0, 0, 0);

  public static final int aMq = "spacing".hashCode();
  public static final int aMr = "insets".hashCode();

  public void setSpacing(Insets paramInsets)
  {
    setInsets(paramInsets);
  }

  public Insets getSpacing()
  {
    return getInsets();
  }

  public void setInsets(Insets paramInsets) {
    if (paramInsets == null)
      return;
    this.ivy.top = paramInsets.top;
    this.ivy.bottom = paramInsets.bottom;
    this.ivy.left = paramInsets.left;
    this.ivy.right = paramInsets.right;

    aSK localaSK = (aSK)getParentOfType(aSK.class);
    if (localaSK != null)
      localaSK.setSpacing(this);
  }

  public Insets getInsets()
  {
    return this.ivy;
  }

  public void c(bdj parambdj)
  {
    dKl localdKl = (dKl)parambdj;
    super.c(localdKl);
    localdKl.setInsets(this.ivy);
  }

  public void aJ()
  {
    super.aJ();
    this.ivy.set(0, 0, 0, 0);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if ((paramInt == aMq) || (paramInt == aMr))
      setInsets(paramaKN.gM(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if ((paramInt == aMq) || (paramInt == aMr))
      setInsets((Insets)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}