public class brY extends cGj
{
  public static final String bC = "name";
  public static final String fOh = "blazon";
  public static final String eNX = "rank";
  public static final String bsP = "level";
  public static final String fOi = "guildPoints";
  public static final String fOj = "conquestPoints";
  public static final String RI = "description";
  public static final String[] bF = { "name", "blazon", "rank", "level", "guildPoints", "conquestPoints", "description" };
  private aJw fOk;
  private int fOl;

  public brY(aJw paramaJw, int paramInt)
  {
    this.fOk = paramaJw;
    this.fOl = paramInt;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.fOk.getName();
    Object localObject;
    if (paramString.equals("blazon")) {
      localObject = new dbY(this.fOk.CH());
      if (localObject == null) {
        return null;
      }
      dTN localdTN = new dTN(((dbY)localObject).cNJ(), ((dbY)localObject).cNL(), boJ.byr().db(((dbY)localObject).cNM()), boJ.byr().db(((dbY)localObject).cNK()));
      uz localuz = ahL.auH().a(localdTN);
      localdTN.cleanUp();
      return localuz;
    }if (paramString.equals("rank"))
      return Integer.valueOf(this.fOl);
    if (paramString.equals("level"))
      return Short.valueOf(this.fOk.nU());
    if (paramString.equals("guildPoints"))
      return Integer.valueOf(this.fOk.ajD());
    if (paramString.equals("conquestPoints"))
      return Integer.valueOf(this.fOk.bbe());
    if (paramString.equals("description")) {
      localObject = this.fOk.getDescription();
      return ((String)localObject).length() == 0 ? null : localObject;
    }

    return null;
  }
}