public class boi
{
  private final int aw;
  private final String Ta;
  private final String fHw;
  private final cYq aHo;
  private final boolean fHx;
  private final bNa bPo;
  private final boolean eOn;
  private final String fHy;
  private final String m_name;
  private final String fHz;
  private final String fHA;
  private final String fHB;
  private final String fHC;
  private final String fHD;
  private final boolean fHE;
  private final String fHF;
  private final int dmf;

  public boi(int paramInt1, String paramString1, String paramString2, cYq paramcYq, boolean paramBoolean1, bNa parambNa, boolean paramBoolean2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, boolean paramBoolean3, String paramString10, int paramInt2)
  {
    this.aw = paramInt1;
    this.Ta = paramString1;
    this.fHw = paramString2;
    this.aHo = paramcYq;
    this.fHx = paramBoolean1;
    this.bPo = parambNa;
    this.eOn = paramBoolean2;
    this.fHy = paramString3;
    this.m_name = paramString4;
    this.fHz = paramString5;
    this.fHA = paramString6;
    this.fHB = paramString7;
    this.fHC = paramString8;
    this.fHD = paramString9;
    this.fHE = paramBoolean3;
    this.fHF = paramString10;
    this.dmf = paramInt2;
  }

  public static boi a(ds paramds) {
    int i = paramds.g("id");
    String str1 = paramds.h("type");
    String str2 = paramds.h("mobileinfo");

    cYq localcYq = cPp.iX(bUD.getLong(paramds.h("date")) * 1000L);

    boolean bool1 = paramds.i("recurring");
    bjf localbjf1 = paramds.e("color");
    bNa localbNa = null;
    if ((localbjf1 != null) && (localbjf1.hm() != clq.hNe));
    boolean bool2 = paramds.i("background");
    String str3 = paramds.h("backgroundurl");
    String str4 = dzp.qM(paramds.h("name"));
    String str5 = dzp.qM(paramds.h("bossname"));
    String str6 = dzp.qM(paramds.h("bosstext"));

    bjf localbjf2 = paramds.e("bossimageurl");
    String str7 = localbjf2.hm() == clq.hNf ? null : paramds.h("bossimageurl");

    String str8 = dzp.qM(paramds.h("ephemeris"));
    String str9 = dzp.qM(paramds.h("rubrikabrax"));
    boolean bool3 = bUD.aR(paramds.h("showfest")) != 0;
    String str10 = dzp.qM(paramds.h("festtext"));

    int j = paramds.g("weight");

    return new boi(i, str1, str2, localcYq, bool1, localbNa, bool2, str3, str4, str5, str6, str7, str8, str9, bool3, str10, j);
  }

  public int getId() {
    return this.aw;
  }

  public String getType() {
    return this.Ta;
  }

  public String bxQ() {
    return this.fHw;
  }

  public cYq azV() {
    return this.aHo;
  }

  public boolean bxR() {
    return this.fHx;
  }

  public bNa getColor() {
    return this.bPo;
  }

  public boolean bhG() {
    return this.eOn;
  }

  public String bxS() {
    return this.fHy;
  }

  public String getName() {
    return this.m_name;
  }

  public String bxT() {
    return this.fHA;
  }

  public String bxU() {
    return this.fHC;
  }

  public String bxV() {
    return this.fHD;
  }

  public boolean bxW() {
    return this.fHE;
  }

  public String bxX() {
    return this.fHF;
  }

  public int ayf() {
    return this.dmf;
  }

  public String bxY() {
    return this.fHz;
  }

  public String bxZ() {
    return this.fHB;
  }
}