import java.nio.ByteBuffer;

public class dpE extends bgr
  implements cSs
{
  private final int ie;
  private final Yp btC;
  private final bkr lqp;

  public dpE(Yp paramYp, int paramInt1, long paramLong1, String paramString1, short paramShort, byte paramByte, long paramLong2, String paramString2, int paramInt2, float paramFloat, cvN paramcvN, bkr parambkr)
  {
    super(paramLong1, paramString1, paramShort, paramByte, paramLong2, paramString2, paramInt2, paramFloat, paramcvN);
    this.btC = paramYp;
    this.ie = paramInt1;
    this.lqp = parambkr;
  }

  public dpE(Qy paramQy, Yp paramYp, int paramInt, bkr parambkr) {
    this(paramYp, paramInt, paramQy.getId(), paramQy.getName(), paramQy.uO(), paramQy.xK(), paramQy.CD(), paramQy.uo(), paramQy.bsZ(), paramQy.bta(), paramQy.dqu(), parambkr);
  }

  public dpE(dpE paramdpE, Yp paramYp, bkr parambkr)
  {
    super(paramdpE.aTz, paramdpE.m_name, paramdpE.aSi, paramdpE.aHn, paramdpE.aT, paramdpE.aQZ, paramdpE.fui, paramdpE.fuj, paramdpE.mgL);
    this.ie = paramdpE.ie;
    this.btC = paramYp;
    this.lqp = parambkr;
  }

  public void ue(int paramInt) {
    this.fui = paramInt;
  }

  public void dc(float paramFloat) {
    this.fuj = paramFloat;
  }

  public Yp HK() {
    return this.btC;
  }

  public int bP() {
    return this.ie;
  }

  public bkr cXe() {
    return this.lqp;
  }

  public String toString()
  {
    return "{Government " + this.aTz + ' ' + this.m_name + '}';
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.btC.getId());
    paramByteBuffer.putInt(this.ie);
    paramByteBuffer.putLong(this.aTz);
    byte[] arrayOfByte1 = dzp.qC(this.m_name);
    paramByteBuffer.putShort((short)arrayOfByte1.length);
    paramByteBuffer.put(arrayOfByte1);

    paramByteBuffer.putShort(this.aSi);
    paramByteBuffer.put(this.aHn);

    paramByteBuffer.putLong(this.aT);
    byte[] arrayOfByte2 = dzp.qC(uo());
    paramByteBuffer.putShort((short)arrayOfByte2.length);
    paramByteBuffer.put(arrayOfByte2);

    paramByteBuffer.putInt(this.fui);

    paramByteBuffer.putFloat(this.fuj);

    this.mgL.b(paramByteBuffer);

    abv localabv = new abv();
    this.lqp.a(localabv);
    localabv.g(paramByteBuffer);
  }

  public static dpE aL(ByteBuffer paramByteBuffer)
  {
    Yp localYp = Yp.cj(paramByteBuffer.getLong());
    int i = paramByteBuffer.getInt();
    long l1 = paramByteBuffer.getLong();
    byte[] arrayOfByte1 = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte1);

    short s = paramByteBuffer.getShort();
    byte b = paramByteBuffer.get();

    long l2 = paramByteBuffer.getLong();
    byte[] arrayOfByte2 = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte2);

    int j = paramByteBuffer.getInt();

    float f = paramByteBuffer.getFloat();

    cvN localcvN = cvN.aC(paramByteBuffer);

    abv localabv = new abv();
    localabv.h(paramByteBuffer);
    bkr localbkr = bkr.l(localYp);
    localbkr.b(localabv);
    return new dpE(localYp, i, l1, dzp.aJ(arrayOfByte1), s, b, l2, dzp.aJ(arrayOfByte2), j, f, localcvN, localbkr);
  }

  public int O()
  {
    byte[] arrayOfByte1 = dzp.qC(getName());
    byte[] arrayOfByte2 = dzp.qC(uo());
    abv localabv = new abv();
    this.lqp.a(localabv);
    return 22 + arrayOfByte1.length + 2 + 1 + 8 + 2 + arrayOfByte2.length + 4 + 4 + this.mgL.O() + localabv.O();
  }
}