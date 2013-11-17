public class bvn
{
  private long[] aIB;
  private byte[] aIC;
  private boolean cLW;
  private int gfh;
  private int gfi;
  private boolean gfj;
  private int aGf;

  public bvn()
  {
  }

  public bvn(aYQ paramaYQ)
  {
    d(paramaYQ);
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    this.aIB = new long[i];
    this.aIC = new byte[i];
    for (int j = 0; j < i; j++) {
      this.aIB[j] = paramaYQ.readLong();
      this.aIC[j] = paramaYQ.readByte();
    }
    this.cLW = paramaYQ.bnT();
    this.gfh = paramaYQ.readInt();
    this.gfi = paramaYQ.readInt();
    this.gfj = paramaYQ.bnT();
    this.aGf = paramaYQ.readInt();
  }

  public void b(dSw paramdSw) {
    int i = this.aIB != null ? this.aIB.length : 0;
    paramdSw.writeInt(i);
    for (int j = 0; j < i; j++) {
      paramdSw.writeLong(this.aIB[j]);
      paramdSw.writeByte(this.aIC[j]);
    }

    paramdSw.lu(this.cLW);
    paramdSw.writeInt(this.gfh);
    paramdSw.writeInt(this.gfi);
    paramdSw.lu(this.gfj);
    paramdSw.writeInt(this.aGf);
  }

  public long[] bCX() {
    return this.aIB;
  }

  public byte[] bCY() {
    return this.aIC;
  }

  public boolean akR() {
    return this.cLW;
  }

  public int bCZ() {
    return this.gfh;
  }

  public int bDa() {
    return this.gfi;
  }

  public boolean bDb() {
    return this.gfj;
  }

  public int getDelay() {
    return this.aGf;
  }

  public void setDelay(int paramInt) {
    this.aGf = paramInt;
  }

  public void a(long[] paramArrayOfLong) {
    this.aIB = paramArrayOfLong;
  }

  public void d(byte[] paramArrayOfByte) {
    this.aIC = paramArrayOfByte;
  }

  public void bE(boolean paramBoolean) {
    this.cLW = paramBoolean;
  }

  public void rh(int paramInt) {
    this.gfh = paramInt;
  }

  public void ri(int paramInt) {
    this.gfi = paramInt;
  }

  public void ft(boolean paramBoolean) {
    this.gfj = paramBoolean;
  }

  public boolean bDc() {
    if (this.aIB == null) {
      return this.aIC == null;
    }
    return bCY().length == bCX().length;
  }
}