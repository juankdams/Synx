class aUV extends bGg
{
  private Ud eWE;
  private String eWF = "<unknow>";

  private aUV(vA paramvA) {
    super(paramvA);
  }

  public final void aMH()
  {
  }

  public final void stop()
  {
    Pb.aaU().b(this.eWE);
    this.eWE.reset();
    this.eWE.clear();
  }

  public final void start()
  {
    this.eWE = new Ud();
    this.eWF = "<unknow>";
    this.eWE.initialize(2000);
    this.eWE.a(this.cHC);
    this.eWE.L(true);
    this.eWE.a(new czT(-18.0F, 18.0F, -18.0F, 18.0F, -18.0F, 18.0F));
    Pb.aaU().a(this.eWE);
  }
}