public class cYh
{
  private final int aw;
  private final int kLD;
  private final bNa bPo;
  private final boolean eOn;
  private final String fHy;
  private final String kLE;
  private final String kLF;
  private final String kLG;

  public cYh(int paramInt1, int paramInt2, bNa parambNa, boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.aw = paramInt1;
    this.kLD = paramInt2;
    this.bPo = parambNa;
    this.eOn = paramBoolean;
    this.fHy = paramString1;
    this.kLE = paramString2;
    this.kLF = paramString3;
    this.kLG = paramString4;
  }

  public int getId() {
    return this.aw;
  }

  public int getMonth() {
    return this.kLD;
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

  public String cLE() {
    return this.kLE;
  }

  public String cLF() {
    return this.kLF;
  }

  public String cLG() {
    return this.kLG;
  }

  public static cYh b(ds paramds) {
    int i = paramds.g("id");
    int j = Integer.parseInt(paramds.h("month"));

    bjf localbjf1 = paramds.e("color");
    bNa localbNa = null;
    if ((localbjf1 != null) && (localbjf1.hm() != clq.hNe));
    boolean bool = paramds.i("background");
    String str1 = paramds.h("backgroundurl");
    String str2 = dzp.qM(paramds.h("protectorname"));
    String str3 = dzp.qM(paramds.h("protectordesc"));

    bjf localbjf2 = paramds.e("protectorimageurl");
    String str4 = localbjf2.hm() == clq.hNf ? null : paramds.h("protectorimageurl");

    return new cYh(i, j, localbNa, bool, str1, str2, str3, str4);
  }
}