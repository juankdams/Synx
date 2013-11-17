public class Gi extends bxH
{
  private ark bOw;

  public Gi(ayn paramayn, ccY paramccY)
  {
    super(paramayn, paramccY, null);
    a(a(paramayn));
  }

  public ark a(ayn paramayn) {
    if (this.bOw == null) {
      this.bOw = new ark(paramayn, this);
    }

    return this.bOw;
  }
}