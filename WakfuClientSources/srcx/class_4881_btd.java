class btd
{
  private final String gbd;
  private final String gbe;
  private final int gbf;

  public btd(alm paramalm, String paramString1, String paramString2, int paramInt)
  {
    this.gbe = paramString2;
    this.gbf = paramInt;
    this.gbd = paramString1;
  }

  public btd(alm paramalm, String paramString1, String paramString2) {
    this.gbe = paramString2;
    this.gbf = 0;
    this.gbd = paramString1;
  }

  public String getFunctionName() {
    return this.gbe;
  }

  public int getParamCount() {
    return this.gbf;
  }

  public String bBo() {
    return this.gbd;
  }
}