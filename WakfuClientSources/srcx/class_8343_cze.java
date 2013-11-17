import org.apache.log4j.Logger;

public class cze
{
  public static final String inR = "id";
  private static final Logger K = Logger.getLogger(cze.class);

  private String SK = "";

  private static final cze inS = new cze();
  private final akR inT = new akR();

  public static cze cwb() {
    return inS;
  }

  public void setPath(String paramString)
  {
    this.SK = paramString;
  }

  public static String xi(int paramInt) {
    return paramInt + ".bin";
  }

  private dTU d(drN paramdrN) {
    return new dTU(e(paramdrN), paramdrN.gE());
  }

  private String e(drN paramdrN) {
    int i = paramdrN.gE();
    return String.format(this.SK, new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
  }

  public dTU f(drN paramdrN) {
    String str = e(paramdrN);
    dTU localdTU = (dTU)this.inT.get(str);
    if (localdTU == null) {
      localdTU = d(paramdrN);
      this.inT.put(localdTU.getFileName(), localdTU);
      if ((!bB) && (!localdTU.getFileName().equals(str))) throw new AssertionError();
    }
    return localdTU;
  }

  public void a(dTU paramdTU) {
    this.inT.remove(paramdTU.getFileName());
  }

  public void cwc() {
    this.inT.clear();
  }

  public void a(drN paramdrN, gd paramgd)
  {
    dTU localdTU = f(paramdrN);
    K.trace(paramdrN.getClass().getSimpleName() + ": " + localdTU.dtX() + " entrées");
    localdTU.a(paramdrN, paramgd);
    a(localdTU);
  }

  public boolean a(int paramInt, drN paramdrN) {
    dTU localdTU = f(paramdrN);
    return localdTU.a(paramInt, paramdrN);
  }

  public boolean a(int paramInt, drN paramdrN, gd paramgd) {
    if (a(paramInt, paramdrN)) {
      paramgd.a(paramdrN);
      return true;
    }
    K.error("Object inconnu d'id=" + paramInt);
    return false;
  }

  public void a(drN paramdrN, String paramString, int paramInt, gd paramgd) {
    dTU localdTU = f(paramdrN);
    localdTU.a(paramdrN, paramString, paramInt, paramgd);
  }

  public void a(drN paramdrN, String paramString1, String paramString2, gd paramgd) {
    a(paramdrN, paramString1, paramString2.hashCode(), paramgd);
  }
}