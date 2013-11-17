class aSm
{
  private String ePA;
  private byte ePB;
  private String Tl;

  private aSm(String paramString1, byte paramByte, String paramString2)
  {
    this.ePA = paramString1;
    this.ePB = paramByte;
    this.Tl = paramString2;
  }

  public String bib() {
    return this.ePA;
  }

  public byte bcI() {
    return this.ePB;
  }

  public String getMessage() {
    return this.Tl;
  }
}