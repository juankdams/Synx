public class cr extends cRi
{
  private int RC;
  private aAO RD;

  public void a(aAO paramaAO)
  {
    this.RD = paramaAO;
  }

  public int gk() {
    return this.RC;
  }

  public void a(Wj paramWj)
  {
    this.RC = bUD.aR(paramWj.aiV());
    super.a(paramWj);
  }

  protected long gl()
  {
    aAO localaAO = this.RD;
    if (localaAO == null)
      return 0L;
    if (localaAO.aiJ() == null)
      return 0L;
    return localaAO.aiJ().CH();
  }
}