public abstract class dqC extends csD
{
  private boolean iov = false;

  public static final int ioC = "scaled".hashCode();

  public boolean isScaled()
  {
    return this.iov;
  }

  public void setScaled(boolean paramBoolean) {
    this.iov = paramBoolean;
  }

  public abstract VJ getMesh();

  public void c(bdj parambdj)
  {
    dqC localdqC = (dqC)parambdj;
    super.c(localdqC);
    localdqC.setScaled(this.iov);
  }

  public void aJ()
  {
    super.aJ();
    this.iov = false;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ioC)
      setScaled(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == ioC)
      setScaled(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}