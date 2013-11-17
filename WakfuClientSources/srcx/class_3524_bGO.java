import java.util.Arrays;

public class bGO
{
  public static final int MAX_VALUE = 16;
  private final short dkX;
  private final short[] gDu;
  private final byte[] gck;

  public bGO(bGO parambGO)
  {
    this.dkX = parambGO.dkX;

    if (parambGO.gDu != null) {
      this.gDu = new short[parambGO.gDu.length];
      System.arraycopy(parambGO.gDu, 0, this.gDu, 0, parambGO.gDu.length);
    } else {
      this.gDu = null;
    }
    if (parambGO.gck != null) {
      this.gck = new byte[parambGO.gck.length];
      System.arraycopy(parambGO.gck, 0, this.gck, 0, parambGO.gck.length);
    } else {
      this.gck = null;
    }
  }

  public bGO(short paramShort, short[] paramArrayOfShort, byte[] paramArrayOfByte) { this.dkX = paramShort;
    this.gDu = paramArrayOfShort;
    this.gck = paramArrayOfByte; }

  final int getValueCount()
  {
    return this.gDu.length;
  }

  short sP(int paramInt) {
    return this.gDu[paramInt];
  }

  public short sQ(int paramInt) {
    int i = this.gDu.length;
    if (i == 1) {
      return this.gDu[0];
    }

    if (i > 16) {
      if (!bB) throw new AssertionError("ne devrait pas arriver, export foireux(?)");
      return this.dkX;
    }

    int j = 2;
    int k = 15;

    if (i <= 4) {
      j = 4;
      k = 3;
    }
    if (i <= 2) {
      j = 8;
      k = 1;
    }

    int m = paramInt % j * (8 / j);
    int n = (this.gck[(paramInt / j)] & 0xFF) >>> m & k;
    return this.gDu[n];
  }

  public static bGO a(bHu parambHu, short[] paramArrayOfShort, short paramShort) {
    int i = parambHu.size();

    if (i == 1) {
      return new bGO(paramShort, parambHu.bOU(), null);
    }

    int j = 2;
    if (i <= 4)
      j *= 2;
    if (i == 2) {
      j *= 2;
    }
    int k = (paramArrayOfShort.length + (j - 1)) / j;

    byte[] arrayOfByte = new byte[k];
    int m = 8 / j;
    for (int n = 0; n < paramArrayOfShort.length; n++) {
      int i1 = (byte)parambHu.cA(paramArrayOfShort[n]);
      int i2 = n % j * m;
      int i3 = n / j;
      int tmp116_114 = i3;
      byte[] tmp116_112 = arrayOfByte; tmp116_112[tmp116_114] = ((byte)(tmp116_112[tmp116_114] | (i1 & 0xF) << i2));
    }
    return new bGO(paramShort, parambHu.bOU(), arrayOfByte);
  }

  public void d(dSw paramdSw) {
    int i = this.gDu.length;
    if ((!bB) && (i >= 255)) throw new AssertionError();
    paramdSw.writeByte((byte)(i & 0xFF));
    for (int j = 0; j < i; j++) {
      paramdSw.writeShort(this.gDu[j]);
    }

    if (i != 1) {
      paramdSw.writeByte((byte)(this.gck.length & 0xFF));
      paramdSw.writeBytes(this.gck);
    }
  }

  public static bGO a(aYQ paramaYQ, short paramShort) {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0)
      return null;
    short[] arrayOfShort = paramaYQ.ou(i);
    byte[] arrayOfByte;
    if (i != 1) {
      int j = paramaYQ.readByte() & 0xFF;
      arrayOfByte = paramaYQ.ot(j);
    } else {
      arrayOfByte = null;
    }
    return new bGO(paramShort, arrayOfShort, arrayOfByte);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof bGO)))
      return false;
    bGO localbGO = (bGO)paramObject;
    return (this.gDu == null ? localbGO.gDu == null : Arrays.equals(this.gDu, localbGO.gDu)) && (this.gck == null ? localbGO.gck == null : Arrays.equals(this.gck, localbGO.gck));
  }
}