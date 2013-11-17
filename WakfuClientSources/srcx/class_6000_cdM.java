public class cdM
  implements hf
{
  private byte hxM;
  private short hxN;
  private short dZD;
  private short dZG;
  private short hxO;
  private short dZH;
  private short dZI;
  private String m_name;
  private uz UI;
  private cSR hxP;

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

  private void aQq() {
    this.hxP.put(160, this.hxP.get(32));
  }

  private void t(aYQ paramaYQ) {
    int i = paramaYQ.readByte();
    int j = paramaYQ.readInt();
    int k = paramaYQ.getOffset() + j;

    paramaYQ.setOffset(k);
  }

  private void u(aYQ paramaYQ) {
    int i = paramaYQ.readByte();
    int j = paramaYQ.readInt();
    int k = paramaYQ.getOffset() + j;

    this.dZG = paramaYQ.readShort();
    this.hxO = paramaYQ.readShort();

    paramaYQ.setOffset(k);
  }

  private void v(aYQ paramaYQ) {
    int i = paramaYQ.readByte();
    int j = paramaYQ.readInt();
    int k = paramaYQ.getOffset() + j;

    paramaYQ.setOffset(k);
  }

  private void w(aYQ paramaYQ) {
    int i = paramaYQ.readByte();
    int j = paramaYQ.readInt();

    this.hxN = ((short)(j / 20));
    this.hxP = new cSR(this.hxN, 1.0F);

    for (int k = 0; k < this.hxN; k++) {
      bJu localbJu = new bJu(this);

      char[] arrayOfChar = Character.toChars(paramaYQ.readInt());

      localbJu.gKs = arrayOfChar[0];
      localbJu.aEd = paramaYQ.readShort();
      localbJu.aEe = paramaYQ.readShort();
      localbJu.gKt = paramaYQ.readShort();
      localbJu.bdV = paramaYQ.readShort();
      localbJu.gKu = paramaYQ.readShort();

      localbJu.gKv = paramaYQ.readShort();
      localbJu.gKw = paramaYQ.readShort();

      paramaYQ.readByte();
      paramaYQ.readByte();

      this.hxP.put(localbJu.gKs, localbJu);

      this.dZH = ((short)Math.max(this.dZH, localbJu.gKt));
      this.dZI = ((short)Math.max(this.dZI, localbJu.bdV));
    }
  }

  private void x(aYQ paramaYQ)
  {
    if (paramaYQ.available() <= 0) {
      return;
    }

    int i = paramaYQ.readByte();
    int j = paramaYQ.readInt();
    int k = j / 10;

    for (int m = 0; m < k; m++) {
      char[] arrayOfChar1 = Character.toChars(paramaYQ.readInt());
      char[] arrayOfChar2 = Character.toChars(paramaYQ.readInt());
      short s = paramaYQ.readShort();

      bJu localbJu = (bJu)this.hxP.get(arrayOfChar1[0]);
      if (localbJu != null)
      {
        if (localbJu.gKx == null) {
          localbJu.gKx = new DJ();
        }

        localbJu.gKx.i(arrayOfChar2[0], s);
      }
    }
    cgA();
  }

  private void cgA() {
    this.hxP.s(new HG(this));
  }

  public void load(String paramString1, String paramString2)
  {
    this.m_name = paramString1;
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString2 + paramString1 + ".fnt"));

    if ((localaYQ.readByte() != 66) || (localaYQ.readByte() != 77) || (localaYQ.readByte() != 70))
    {
      return;
    }

    this.hxM = localaYQ.readByte();

    t(localaYQ);

    u(localaYQ);

    v(localaYQ);

    w(localaYQ);

    x(localaYQ);

    aQq();

    localaYQ.close();

    long l = -6196766170285080576L + byn.jp(paramString1);

    String str = paramString2 + paramString1 + "_0.dds";
    if (!bAy.jy(str)) {
      str = paramString2 + paramString1 + "_0.DDS";
    }

    this.UI = tq.Bg().a(dHL.lSB.dhZ(), l, str, false);
    this.UI.gQ();
  }

  public final String getName() {
    return this.m_name;
  }

  public final bJu M(char paramChar) {
    return (bJu)this.hxP.get(paramChar);
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
    return 0;
  }

  public short cgB() {
    return this.hxO;
  }

  public short cgC()
  {
    return (short)(this.dZG - this.hxO);
  }

  public void cgD() {
    this.hxP.s(new HD(this));
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    cdM localcdM = (cdM)paramObject;

    if (!this.m_name.equals(localcdM.m_name)) {
      return false;
    }

    return true;
  }

  public int hashCode() {
    return this.m_name.hashCode();
  }
}