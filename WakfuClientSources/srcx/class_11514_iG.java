import org.apache.log4j.Logger;

public class iG
  implements aZa
{
  private static final Logger K = Logger.getLogger(iG.class);
  private boolean Rb;
  private long[] aIB;
  private byte[] aIC;

  public iG()
  {
  }

  public iG(aYQ paramaYQ)
  {
    d(paramaYQ);
  }

  public iG(boolean paramBoolean, long[] paramArrayOfLong, byte[] paramArrayOfByte) {
    this.Rb = paramBoolean;
    this.aIB = paramArrayOfLong;
    this.aIC = paramArrayOfByte;
  }

  public void b(bjC parambjC) {
    int i = bCO.sf(this.aIB.length);
    long l = this.aIB[i];

    if (!bWY.c(parambjC, l)) {
      return;
    }
    if (!bWY.hd(l)) {
      return;
    }
    bWY.a(parambjC, l, this.aIC[i], (short)1, this.Rb);
  }

  public int getType() {
    return 4;
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    this.aIB = new long[i];
    this.aIC = new byte[i];
    for (int j = 0; j < i; j++) {
      this.aIB[j] = paramaYQ.readLong();
      this.aIC[j] = paramaYQ.readByte();
    }
    this.Rb = paramaYQ.bnT();
  }

  public void b(dSw paramdSw) {
    int i = this.aIB != null ? this.aIB.length : 0;
    paramdSw.writeInt(i);
    for (int j = 0; j < i; j++) {
      paramdSw.writeLong(this.aIB[j]);
      paramdSw.writeByte(this.aIC[j]);
    }
    paramdSw.lu(this.Rb);
  }

  public void i(boolean paramBoolean) {
    this.Rb = paramBoolean;
  }

  public void a(long[] paramArrayOfLong) {
    this.aIB = paramArrayOfLong;
  }

  public void d(byte[] paramArrayOfByte) {
    this.aIC = paramArrayOfByte;
  }

  public void a(cbQ paramcbQ) {
    paramcbQ.o(this.aIB);
  }
}