public class ada extends cWE
{
  private final int cTl;

  public ada(int paramInt1, int paramInt2)
  {
    super(paramInt1);
    this.cTl = paramInt2;
  }

  public boolean apm() {
    return this.cTl != 0;
  }

  public int apn() {
    return this.cTl;
  }
}