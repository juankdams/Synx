public class aUL extends cRD
{
  private final short eWa;

  public aUL(short paramShort)
  {
    this.eWa = paramShort;
  }

  public void a(bUv parambUv, int paramInt)
  {
    parambUv.eq("AnimMarche-" + this.eWa);
  }

  public String aY()
  {
    return "WALK_WEAPON";
  }
}