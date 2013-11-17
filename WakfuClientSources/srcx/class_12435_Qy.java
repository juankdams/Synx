import java.nio.ByteBuffer;

public class Qy extends bgr
{
  private final String cpu;
  private short cpv = 0;
  private boolean cpw = false;

  public Qy(long paramLong1, String paramString1, String paramString2, short paramShort1, short paramShort2, byte paramByte1, boolean paramBoolean, long paramLong2, String paramString3, int paramInt1, float paramFloat, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, int paramInt2, int paramInt3, int paramInt4) {
    super(paramLong1, paramString1, paramShort2, paramByte1, paramLong2, paramString3, paramInt1, paramFloat, new cvN(paramByte2, paramByte3, paramByte4, paramByte5, paramByte6, paramByte7, paramByte8, paramInt2, paramInt3, paramInt4));
    this.cpu = paramString2;
    this.cpv = paramShort1;
    this.cpw = paramBoolean;
  }

  public Qy(long paramLong1, String paramString1, String paramString2, short paramShort1, short paramShort2, byte paramByte, boolean paramBoolean, long paramLong2, String paramString3, int paramInt, float paramFloat, cvN paramcvN) {
    super(paramLong1, paramString1, paramShort2, paramByte, paramLong2, paramString3, paramInt, paramFloat, paramcvN);
    this.cpu = paramString2;
    this.cpv = paramShort1;
    this.cpw = paramBoolean;
  }

  public String acf() {
    return this.cpu;
  }

  public short acg() {
    return this.cpv;
  }

  public void V(short paramShort) {
    this.cpv = paramShort;
  }

  public void bh(boolean paramBoolean) {
    this.cpw = paramBoolean;
  }

  public boolean ach() {
    return this.cpw;
  }

  public String toString() {
    return "{Candidate " + this.aTz + ' ' + this.m_name + '}';
  }

  public void S(ByteBuffer paramByteBuffer)
  {
    a(paramByteBuffer, false);
  }

  public void b(ByteBuffer paramByteBuffer) {
    a(paramByteBuffer, true);
  }

  public void a(ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    paramByteBuffer.putLong(this.aTz);
    byte[] arrayOfByte1 = dzp.qC(this.m_name);
    paramByteBuffer.putShort((short)arrayOfByte1.length);
    paramByteBuffer.put(arrayOfByte1);

    byte[] arrayOfByte2 = dzp.qC(this.cpu);
    paramByteBuffer.putShort((short)arrayOfByte2.length);
    paramByteBuffer.put(arrayOfByte2);
    paramByteBuffer.putShort((short)(paramBoolean ? this.cpv : 0));

    paramByteBuffer.putShort(this.aSi);
    paramByteBuffer.put(this.aHn);

    paramByteBuffer.put((byte)(this.cpw ? 1 : 0));

    paramByteBuffer.putLong(this.aT);
    byte[] arrayOfByte3 = dzp.qC(uo());
    paramByteBuffer.putShort((short)arrayOfByte3.length);
    paramByteBuffer.put(arrayOfByte3);

    paramByteBuffer.putInt(this.fui);

    paramByteBuffer.putFloat(this.fuj);

    this.mgL.b(paramByteBuffer);
  }

  public static Qy T(ByteBuffer paramByteBuffer)
  {
    long l1 = paramByteBuffer.getLong();
    byte[] arrayOfByte1 = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte1);

    byte[] arrayOfByte2 = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte2);
    short s1 = paramByteBuffer.getShort();

    short s2 = paramByteBuffer.getShort();
    byte b = paramByteBuffer.get();

    boolean bool = paramByteBuffer.get() == 1;

    long l2 = paramByteBuffer.getLong();
    byte[] arrayOfByte3 = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte3);

    int i = paramByteBuffer.getInt();

    float f = paramByteBuffer.getFloat();
    return new Qy(l1, dzp.aJ(arrayOfByte1), dzp.aJ(arrayOfByte2), s1, s2, b, bool, l2, dzp.aJ(arrayOfByte3), i, f, cvN.aC(paramByteBuffer));
  }

  public int O()
  {
    byte[] arrayOfByte1 = dzp.qC(acf());
    byte[] arrayOfByte2 = dzp.qC(getName());
    byte[] arrayOfByte3 = dzp.qC(uo());
    return 10 + arrayOfByte2.length + 2 + arrayOfByte1.length + 2 + arrayOfByte3.length + 8 + 2 + 2 + 1 + 1 + 4 + 4 + this.mgL.O();
  }
}