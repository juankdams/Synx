import java.nio.ByteBuffer;

public class dQa extends dPl
  implements cSs
{
  private final int ie;
  private final short cZu;
  private final lX mkg;

  public dQa(long paramLong1, String paramString1, short paramShort1, byte paramByte, long paramLong2, String paramString2, cvN paramcvN, int paramInt, short paramShort2, lX paramlX)
  {
    super(paramLong1, paramString1, paramShort1, paramByte, paramLong2, paramString2, paramcvN);

    this.ie = paramInt;
    this.cZu = paramShort2;
    this.mkg = paramlX;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.aTz);
    byte[] arrayOfByte1 = dzp.qC(this.m_name);
    paramByteBuffer.putShort((short)arrayOfByte1.length);
    paramByteBuffer.put(arrayOfByte1);
    paramByteBuffer.putShort(this.aSi);
    paramByteBuffer.put(this.aHn);
    paramByteBuffer.putLong(this.aT);
    byte[] arrayOfByte2 = dzp.qC(this.aQZ);
    paramByteBuffer.putShort((short)arrayOfByte2.length);
    paramByteBuffer.put(arrayOfByte2);
    this.mgL.b(paramByteBuffer);

    paramByteBuffer.putInt(this.ie);
    paramByteBuffer.putShort(this.cZu);
    paramByteBuffer.putInt(this.mkg.ordinal());
  }

  public static dQa aV(ByteBuffer paramByteBuffer) {
    long l1 = paramByteBuffer.getLong();
    byte[] arrayOfByte1 = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte1);
    short s1 = paramByteBuffer.getShort();
    byte b = paramByteBuffer.get();
    long l2 = paramByteBuffer.getLong();
    byte[] arrayOfByte2 = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte2);
    cvN localcvN = cvN.aC(paramByteBuffer);
    int i = paramByteBuffer.getInt();
    short s2 = paramByteBuffer.getShort();
    lX locallX = lX.values()[paramByteBuffer.getInt()];
    return new dQa(l1, dzp.aJ(arrayOfByte1), s1, b, l2, dzp.aJ(arrayOfByte2), localcvN, i, s2, locallX);
  }

  public int O() {
    byte[] arrayOfByte1 = dzp.qC(this.m_name);
    byte[] arrayOfByte2 = dzp.qC(this.aQZ);
    return 10 + arrayOfByte1.length + 2 + 1 + 8 + 2 + arrayOfByte2.length + this.mgL.O() + 4 + 2 + 4;
  }

  public int bP() {
    return this.ie;
  }

  public short nU() {
    return this.cZu;
  }

  public lX cfr() {
    return this.mkg;
  }
}