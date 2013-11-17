public class oc extends czv
{
  public static final String TAG = "Separator";
  private boolean bY = true;
  private boolean aTp = false;

  public static final int ct = "horizontal".hashCode();

  public String getTag()
  {
    return "Separator";
  }

  public boolean isHorizontal()
  {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean)
  {
    this.bY = paramBoolean;
    this.aTp = true;
    setNeedsToPreProcess();
  }

  public boolean rf()
  {
    boolean bool = super.rf();

    if (this.aKP.getPixmap() != null) {
      if (this.bY)
        setMinSize(new Or(0, this.aKP.getPixmap().getHeight()));
      else {
        setMinSize(new Or(this.aKP.getPixmap().getWidth(), 0));
      }
      bool = true;
    }

    return bool;
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.aTp) {
      if (rf()) {
        this.meE.cfM();
      }

      this.aTp = false;
    }

    return bool;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}