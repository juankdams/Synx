public class dic
{
  private final int aw;
  private final cYq ldH;
  private final cYq ldI;
  private final bNa bPo;
  private final boolean eOn;
  private final String fHy;
  private final String m_name;
  private final String aLm;
  private final String cSZ;

  private dic(int paramInt, cYq paramcYq1, cYq paramcYq2, bNa parambNa, boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.aw = paramInt;
    this.ldH = paramcYq1;
    this.ldI = paramcYq2;
    this.bPo = parambNa;
    this.eOn = paramBoolean;
    this.fHy = paramString1;
    this.m_name = paramString2;
    this.aLm = paramString3;
    this.cSZ = paramString4;
  }

  public int getId() {
    return this.aw;
  }

  public cYq cRx() {
    return this.ldH;
  }

  public cYq cRy() {
    return this.ldI;
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

  public String getDescription() {
    return this.aLm;
  }

  public String apg() {
    return this.cSZ;
  }

  public boolean X(dxL paramdxL) {
    int i = (this.ldH.getMonth() == paramdxL.getMonth()) && (this.ldH.getDay() <= paramdxL.getDay()) ? 1 : 0;
    int j = (this.ldI.getMonth() == paramdxL.getMonth()) && (this.ldI.getDay() >= paramdxL.getDay()) ? 1 : 0;
    return (i != 0) || (j != 0);
  }

  public static dic c(ds paramds) {
    int i = paramds.g("id");

    cYq localcYq1 = cPp.iX(bUD.getLong(paramds.h("begin")) * 1000L);
    cYq localcYq2 = cPp.iX(bUD.getLong(paramds.h("end")) * 1000L);

    bjf localbjf1 = paramds.e("color");
    bNa localbNa = null;
    if ((localbjf1 != null) && (localbjf1.hm() != clq.hNe));
    boolean bool = paramds.i("background");
    String str1 = paramds.h("backgroundurl");
    String str2 = dzp.qM(paramds.h("name"));
    String str3 = dzp.qM(paramds.h("description"));

    bjf localbjf2 = paramds.e("imageurl");
    String str4 = localbjf2.hm() == clq.hNf ? null : paramds.h("imageurl");

    return new dic(i, localcYq1, localcYq2, localbNa, bool, str1, str2, str3, str4);
  }
}