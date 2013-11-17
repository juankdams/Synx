class Mv
{
  private String hh;
  private String bFu;

  private Mv(String paramString1, String paramString2)
  {
    this.hh = paramString1;
    this.bFu = paramString2;
  }

  public String getTitle() {
    return this.hh;
  }

  public String getValue() {
    return this.bFu;
  }
}