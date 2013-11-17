import org.apache.log4j.Logger;

public class byd extends cGj
{
  private static final Logger K = Logger.getLogger(byd.class);
  public static final String gjB = "nation";
  public static final String gjC = "totalCash";
  public static final String gjD = "populationSize";
  public static final String gjE = "governorName";
  public static final String gjF = "territoriesCount";
  public static final String gjG = "nationAlignments";
  public static final String gjH = "selectionIcon";
  public static final String gjI = "backgroundImage";
  public static final String[] bF = { "nation", "totalCash", "populationSize", "governorName", "territoriesCount", "nationAlignments", "selectionIcon", "backgroundImage" };
  private final int ie;
  private final int aMH;
  private final float aMI;
  private final String aMJ;
  private final int aMK;
  private final bjI aML;

  public byd(int paramInt1, int paramInt2, float paramFloat, String paramString, int paramInt3, bjI parambjI)
  {
    this.ie = paramInt1;
    this.aMH = paramInt2;
    this.aMI = paramFloat;
    this.aMJ = paramString;
    this.aMK = paramInt3;
    this.aML = parambjI;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("nation")) {
      return new beJ(this.ie);
    }
    if (paramString.equals("totalCash")) {
      return bU.fH().getString("kama.shortGain", new Object[] { Integer.valueOf(this.aMH) });
    }
    if (paramString.equals("populationSize")) {
      return (int)(this.aMI * 100.0F) + " %";
    }
    if (paramString.equals("governorName")) {
      return (this.aMJ == null) || (this.aMJ.length() == 0) ? bU.fH().getString("nation.noGovernorDesc") : this.aMJ;
    }
    if (paramString.equals("territoriesCount")) {
      return Integer.valueOf(this.aMK);
    }
    if (paramString.equals("nationAlignments")) {
      lZ locallZ = new lZ();
      for (bjJ localbjJ = this.aML.buW(); localbjJ.hasNext(); ) {
        localbjJ.fl();
        locallZ.a(bU.fH().b(39, localbjJ.zY(), new Object[0]));
        locallZ.a(" - ");
        locallZ.a(bU.fH().getString("nation.alignmentName" + dqU.fx(localbjJ.Gh()).name()));
        if (localbjJ.hasNext())
          locallZ.tH();
      }
      return locallZ.tP();
    }
    if (paramString.equals("selectionIcon")) {
      return ay.bd().D(this.ie);
    }
    if (paramString.equals("backgroundImage")) {
      return ay.bd().M(bdD.fpu.getId());
    }
    return null;
  }

  public int bP() {
    return this.ie;
  }
}