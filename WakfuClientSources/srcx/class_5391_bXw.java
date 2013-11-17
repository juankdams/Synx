public class bXw
{
  private final byte hmp;
  private final byte hmq;
  private final byte hmr;
  private final byte hms;
  private final byte hmt;
  private final alz hmu;
  private final alz hmv;
  private final alz hmw;

  public bXw(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, alz paramalz1, alz paramalz2, alz paramalz3)
  {
    this.hmp = paramByte1;
    this.hmq = paramByte2;
    this.hmr = paramByte3;
    this.hms = paramByte4;
    this.hmt = paramByte5;
    this.hmu = paramalz1;
    this.hmv = paramalz2;
    this.hmw = paramalz3;
  }

  byte ccL() {
    return this.hmp;
  }

  byte ccM() {
    return this.hmq;
  }

  byte ccN() {
    return this.hmr;
  }

  byte ccO() {
    return this.hms;
  }

  byte ccP() {
    return this.hmt;
  }

  aKG dy(byte paramByte) {
    return (aKG)this.hmu.bf(paramByte);
  }

  aKG dz(byte paramByte) {
    return (aKG)this.hmv.bf(paramByte);
  }

  aKG dA(byte paramByte) {
    return (aKG)this.hmw.bf(paramByte);
  }

  private static aKG[] a(alz paramalz) {
    int i = paramalz.size();
    aKG[] arrayOfaKG = new aKG[i];
    int k;
    for (int j = 0; j < i; k = (byte)(j + 1)) {
      arrayOfaKG[j] = ((aKG)paramalz.bf(j));
    }
    return arrayOfaKG;
  }

  aKG[] aey() {
    return a(this.hmu);
  }

  aKG[] aev() {
    return a(this.hmv);
  }

  aKG[] aew() {
    return a(this.hmw);
  }

  public boolean ccQ() {
    return this.hmu.size() != 0;
  }

  public boolean ccR() {
    return this.hmv.size() != 0;
  }

  public boolean ccS() {
    return this.hmw.size() != 0;
  }
}