public class bPL extends cyv
  implements dBv, Comparable
{
  public static final String bHJ = "id";
  public static final String bC = "name";
  public static final String bsP = "level";
  public static final String dwE = "levelTextShort";
  public static final String dwF = "xp";
  public static final String dwH = "currentLevelPercentage";
  public static final String dwI = "currentLevelPercentageString";
  public static final String dwG = "currentLevelString";
  public static final String gXX = "skillType";
  public static final String cKD = "smallIconUrl";
  public static final String dwS = "bigIconUrl";
  public static final String gXY = "skillInfo";
  public static final String gXZ = "skillRank";
  public static final String gYa = "skillXpRatio";
  public static final String gYb = "skillEffects";
  public static final String[] bF = { "id", "name", "level", "levelTextShort", "xp", "currentLevelPercentage", "currentLevelPercentageString", "currentLevelString", "skillType", "smallIconUrl", "bigIconUrl", "skillInfo", "skillRank", "skillXpRatio", "skillEffects" };

  public void c(String paramString, Object paramObject)
  {
  }

  public String[] getFields()
  {
    return bF;
  }

  protected cyv bXl() {
    return new bPL();
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equalsIgnoreCase("id"))
      return Integer.valueOf(((Dk)cvw()).getId());
    if (paramString.equalsIgnoreCase("level"))
      return Short.valueOf(cvu());
    if (paramString.equals("levelTextShort"))
      return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(nU()) });
    if (paramString.equalsIgnoreCase("xp"))
      return Long.valueOf(ayX());
    if (paramString.equalsIgnoreCase("currentLevelPercentage"))
      return Float.valueOf(ayY());
    if (paramString.equalsIgnoreCase("currentLevelPercentageString"))
      return String.format("%.2f%%", new Object[] { Float.valueOf(ayY() * 100.0F) });
    if (paramString.equals("currentLevelString"))
      return "xp : " + ayZ();
    if (paramString.equalsIgnoreCase("skillType"))
      return Integer.valueOf(((Dk)cvw()).Wh().xj());
    if (paramString.equalsIgnoreCase("smallIconUrl"))
      return ay.bd().y(ok());
    if (paramString.equalsIgnoreCase("bigIconUrl"))
      return ay.bd().z(((Dk)cvw()).oc());
    if (paramString.equalsIgnoreCase("name")) {
      if (cvw() != null)
        return ((Dk)cvw()).getName();
    }
    else if (paramString.equalsIgnoreCase("skillInfo")) {
      if (cvw() != null)
        return bU.fH().getString("craft.frame.skillInfo", new Object[] { ((Dk)cvw()).getName(), Short.valueOf(cvu()) });
    } else {
      if (paramString.equalsIgnoreCase("skillRank")) {
        int i = (short)cvt();
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("craft.frame.skillRank.").append(i);
        return bU.fH().getString(localStringBuilder2.toString());
      }if (paramString.equalsIgnoreCase("skillXpRatio"))
        return ayZ();
      if ((paramString.equalsIgnoreCase("skillEffects")) && 
        (cvw() != null) && (((Dk)cvw()).Wh() == bcR.fmZ)) {
        StringBuilder localStringBuilder1 = new StringBuilder();

        if (!((Dk)cvw()).Wi().contains(219))
          localStringBuilder1.append(bU.fH().getString("weaponSkill.firstEffect", new Object[] { Short.valueOf(cvu()) })).append("\n\n");
        localStringBuilder1.append(bU.fH().getString("weaponSkill.secondEffect", new Object[] { Short.valueOf(cvu()) }));
        return localStringBuilder1.toString();
      }
    }

    return null;
  }

  public boolean l(String paramString)
  {
    return false;
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public int compareTo(Object paramObject)
  {
    bPL localbPL = (bPL)paramObject;
    return ((Dk)cvw()).getName().compareTo(((Dk)localbPL.cvw()).getName());
  }

  public bpa bXm() {
    return kN.sy();
  }
}