public class aEj
  implements hf
{
  private short dZC;
  private short dZD;
  private short dZE;
  private short dZF;
  private short dZG;
  private short dZH;
  private short dZI;
  private String m_name;
  private uz UI;
  private bPu dZJ;

  public aEj()
  {
    this.dZH = 0;
    this.dZI = 0;
  }

  public hf a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    String str = adF.getType(this.m_name);
    return adF.c(str, paramInt, (int)paramFloat);
  }

  public float getSize() {
    return adF.ed(this.m_name);
  }

  public int getStyle() {
    return adF.ec(this.m_name);
  }

  public void load(String paramString1, String paramString2) {
    this.m_name = paramString1;
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString2 + paramString1 + ".tab"));

    boolean bool = paramString1.contains("bordered");

    localaYQ.setOffset(10);
    if (bool) {
      this.dZC = 2;
    }
    int i = localaYQ.readShort();
    this.dZD = localaYQ.readShort();
    this.dZE = localaYQ.readShort();
    this.dZF = localaYQ.readShort();
    this.dZG = ((short)(localaYQ.readShort() + this.dZC));

    this.dZJ = new bPu(i);
    for (int j = 0; j < i; j++) {
      daa localdaa = new daa(this);
      localdaa.kNR = localaYQ.readShort();
      localaYQ.readShort();

      localdaa.aEd = ((short)(localaYQ.readShort() - this.dZC));
      localdaa.aEe = ((short)(localaYQ.readShort() - this.dZC));
      localdaa.gKt = ((short)(localaYQ.readShort() + 2 * this.dZC));
      localdaa.bdV = ((short)(localaYQ.readShort() + 2 * this.dZC));
      localdaa.kNS = localaYQ.readShort();

      localdaa.kNT = localaYQ.readShort();

      this.dZJ.c(localdaa.kNR, localdaa);

      if (localdaa.gKt > this.dZH) {
        this.dZH = localdaa.gKt;
      }
      if (localdaa.bdV > this.dZI) {
        this.dZI = localdaa.bdV;
      }
    }

    aQq();

    localaYQ.close();

    long l = -6196766170285080576L + byn.jp(paramString1);

    String str = paramString2 + paramString1 + "000.DDS";
    if (!bAy.jy(str)) {
      str = paramString2 + paramString1 + "000.tga";
    }
    this.UI = tq.Bg().a(dHL.lSB.dhZ(), l, str, false);
    this.UI.gQ();
  }

  private void aQq() {
    this.dZJ.c((short)160, this.dZJ.cx((short)32));
  }

  public final String getName() {
    return this.m_name;
  }

  public final daa bc(short paramShort) {
    if ((paramShort < this.dZE) || (paramShort > (this.dZF & 0xFFFF))) {
      return null;
    }
    return (daa)this.dZJ.cx(paramShort);
  }

  public final uz hN() {
    return this.UI;
  }

  public final int getCellHeight() {
    return this.dZG;
  }

  public short aQr() {
    return this.dZH;
  }

  public short aQs() {
    return this.dZI;
  }

  public short ph() {
    return this.dZC;
  }
}