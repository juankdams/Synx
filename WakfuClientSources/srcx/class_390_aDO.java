public class aDO
{
  public static final String dYT = "Anim";
  public static final String dYU = "-Debut";
  public static final String dYV = "-Fin";
  public static final String dYW = "AnimStatique";
  public static final String dYX = "AnimSaut";
  public static final String dYY = "AnimSaut-Marche";
  public static final String dYZ = "AnimCourse";
  public static final String dZa = "AnimCourse-Fin";
  public static final String dZb = "AnimMarche";
  public static final String dZc = "AnimHit";
  public static final String dZd = "AnimHamecon";
  public static final String dZe = "Accessoire";
  public static final String dZf = "blason";
  public static final String dZg = "blason_bg";

  public static String v(String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    int i = localStringBuilder.lastIndexOf("-");
    if (i == -1) {
      if (paramBoolean)
        localStringBuilder.append("-Fin");
    }
    else {
      localStringBuilder.replace(i, localStringBuilder.length(), "-Fin");
    }
    return localStringBuilder.toString();
  }
}