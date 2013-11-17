class aSN
{
  private String ePA;
  private String eQh;
  private String eQi;

  private aSN(String paramString1, String paramString2, String paramString3)
  {
    this.ePA = paramString1;
    this.eQh = paramString2;
    this.eQi = paramString3;
  }

  public String bib() {
    return this.ePA;
  }

  public String bip() {
    return this.eQh;
  }

  public String biq() {
    return this.eQi;
  }
}