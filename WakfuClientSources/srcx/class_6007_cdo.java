public class cdo extends bBb
{
  public static final String hwB = "RUN_IN_FIGHT";
  private static final cdo hwC = new cdo();

  public static cdo cgl() {
    return hwC;
  }

  public void a(bUv parambUv, int paramInt)
  {
    if (parambUv.J("AnimCourse02"))
      parambUv.eq("AnimCourse02");
    else
      parambUv.eq("AnimCourse");
  }

  public String aY()
  {
    return "RUN_IN_FIGHT";
  }
}