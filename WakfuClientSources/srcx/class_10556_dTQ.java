public class dTQ extends bNh
{
  public static byte hGy = 1;
  public static final int mqV = 19067;
  private final HA gaT;

  public dTQ(HA paramHA)
  {
    super(new aea());

    this.gaT = paramHA;
  }

  public final void clear()
  {
    for (int i = 0; i < this.gRX.size(); i++) {
      ((Kn)this.gRX.hc(i)).a(this.gaT);
    }
    super.clear();
  }

  protected void a(Kn paramKn)
  {
    paramKn.a(this.gaT);
  }
}