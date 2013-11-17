public class dbG extends ciH
{
  public dbG()
  {
    this(new aBJ(0));
  }

  public dbG(aBJ paramaBJ) {
    super(4);
    a(paramaBJ);
  }

  public void a(aBJ paramaBJ) {
    sF().setInt(0L, paramaBJ.intValue());
  }

  public aBJ cNs() {
    return new aBJ(sF().getInt(0L));
  }
}