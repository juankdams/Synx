public class br extends biy
{
  public static final String TAG = "CheckBox";
  public static final String kl = "ToggleButton";
  protected doN km;
  protected boolean kn = true;

  public static final int cu = "selected".hashCode();
  public static final int ko = "overrideClickSound".hashCode();

  public String getTag()
  {
    return "CheckBox";
  }

  public void setSelected(boolean paramBoolean) {
    Cf localCf = getAppearance();
    if ((localCf != null) && (paramBoolean != localCf.isChecked()))
      localCf.Li();
  }

  public boolean getSelected()
  {
    return getAppearance().isChecked();
  }

  public void setOverrideClickSound(boolean paramBoolean) {
    this.kn = paramBoolean;
  }

  public void setClickSoundId(int paramInt) {
    super.setClickSoundId(paramInt);
    this.kn = false;
  }

  public Cf getAppearance()
  {
    return (Cf)this.czl;
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof Cf;
  }

  public void ew()
  {
    super.ew();

    this.km = new cYT(this);

    a(CH.bGw, this.km, true);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    ((br)parambdj).kn = this.kn;

    ((br)parambdj).b(CH.bGw, this.km, true);
  }

  protected void a(cSx paramcSx, boolean paramBoolean) {
    if (this.kn) {
      switch (cYV.cab[paramcSx.mp().ordinal()])
      {
      case 1:
      case 2:
      case 3:
      case 4:
        return;
      }
    }

    super.a(paramcSx, paramBoolean);
  }

  public void bc() {
    super.bc();

    this.km = null;
  }

  public void aJ()
  {
    super.aJ();

    this.kn = true;

    Cf localCf = new Cf();
    localCf.aJ();
    localCf.setWidget(this);
    a(localCf);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cu)
      setSelected(bUD.getBoolean(paramString));
    else if (paramInt == ko)
      setOverrideClickSound(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cu)
      setSelected(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}