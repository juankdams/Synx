public class dSI extends cRD
{
  public static final String hwB = "WALK_SPELL";
  private static final dSI moP = new dSI();

  public static dSI dtd() {
    return moP;
  }

  public void a(bUv parambUv, int paramInt)
  {
    parambUv.eq("AnimMarche02");
  }

  public String aY()
  {
    return "WALK_SPELL";
  }
}