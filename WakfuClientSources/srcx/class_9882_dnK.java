class dnK extends UT
{
  private Zp lnP;

  private dnK(Jd paramJd)
  {
    super(null);
    this.lnP = new aav(this);
  }

  public String[] getFields()
  {
    return Zp.bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("breedInfo")) {
      return this.lnP;
    }

    return super.getFieldValue(paramString);
  }
}