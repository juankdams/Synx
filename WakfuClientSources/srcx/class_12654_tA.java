import org.apache.log4j.Logger;

public class tA
  implements aZa
{
  private static final Logger K = Logger.getLogger(tA.class);
  private int Ra;
  private boolean Rb;
  private long[] aIB;
  private byte[] aIC;

  public tA(aYQ paramaYQ)
  {
    d(paramaYQ);
  }

  public tA(int paramInt, boolean paramBoolean, long[] paramArrayOfLong, byte[] paramArrayOfByte) {
    this.Ra = paramInt;
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
    bWY.a(parambjC, l, this.aIC[i], (short)1, this.Ra, this.Rb);
  }

  public int getType() {
    return 6;
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    this.aIB = new long[i];
    this.aIC = new byte[i];
    for (int j = 0; j < i; j++) {
      this.aIB[j] = paramaYQ.readLong();
      this.aIC[j] = paramaYQ.readByte();
    }
    this.Ra = paramaYQ.readInt();
    this.Rb = paramaYQ.bnT();
  }

  public void b(dSw paramdSw) {
    int i = this.aIB != null ? this.aIB.length : 0;
    paramdSw.writeInt(i);
    for (int j = 0; j < i; j++) {
      paramdSw.writeLong(this.aIB[j]);
      paramdSw.writeByte(this.aIC[j]);
    }
    paramdSw.writeInt(this.Ra);
    paramdSw.lu(this.Rb);
  }

  public void V(int paramInt) {
    this.Ra = paramInt;
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