class cvV extends bGg
{
  private cZv ihs;
  private String eWF = "<unknow>";

  private cvV(aJl paramaJl) {
    super(paramaJl);
  }

  public final void aMH()
  {
  }

  public final void stop()
  {
    this.ihs.reset();
    this.ihs.clear();
    Pb.aaU().b(this.ihs);
    this.ihs = null;
  }

  public final void start()
  {
    this.ihs = new cZv();
    this.eWF = "<unknow>";
    this.ihs.initialize(2000);
    this.ihs.a(this.cHC);
    this.ihs.a(new czT(-18.0F, 18.0F, -18.0F, 18.0F, -18.0F, 18.0F));
    this.ihs.L(true);
    Pb.aaU().a(this.ihs);
  }
}