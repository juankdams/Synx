import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public final class alf
{
  private static final Logger K = Logger.getLogger(alf.class);
  private final UG iM;

  public alf(UG paramUG)
  {
    this.iM = paramUG;
  }

  public byte[] j() {
    return cp(false);
  }

  public byte[] cp(boolean paramBoolean) {
    cXr localcXr = new cXr();

    localcXr.dT(this.iM.D());
    localcXr.dT(this.iM.Lk());
    localcXr.putInt(this.iM.getMinX());
    localcXr.putInt(this.iM.getMinY());
    localcXr.putInt(this.iM.getWidth());
    localcXr.putInt(this.iM.getHeight());
    localcXr.dT(this.iM.ahP());
    localcXr.dT(this.iM.ahQ());
    localcXr.dT((short)this.iM.ahF());
    short[] arrayOfShort = this.iM.ahE();
    for (int i = 0; i < this.iM.ahF(); i++) {
      localcXr.dT(arrayOfShort[i]);
    }
    localcXr.eL((byte)(this.iM.ahJ() ? 1 : 0));
    if (this.iM.ahJ()) {
      localcXr.aD(this.iM.ahK());
    }

    if (paramBoolean) {
      localcXr.eL((byte)1);
      new aW(this.iM).b(localcXr);
    } else {
      localcXr.eL((byte)0);
    }

    localcXr.eL(this.iM.ahH());
    localcXr.eL(this.iM.ahI());

    byte[] arrayOfByte = this.iM.DY();
    localcXr.eL((byte)arrayOfByte.length);
    for (int j = 0; j < arrayOfByte.length; j++) {
      byte b = arrayOfByte[j];
      localcXr.eL(b);
      localcXr.putInt(this.iM.av(b));
    }

    return localcXr.toArray();
  }

  public void U(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    short s1 = paramByteBuffer.getShort();
    this.iM.h(s1);

    short s2 = paramByteBuffer.getShort();
    this.iM.Y(s2);

    int j = paramByteBuffer.getInt();
    this.iM.gT(j);

    int k = paramByteBuffer.getInt();
    this.iM.gU(k);

    int m = paramByteBuffer.getInt();
    this.iM.setWidth(m);

    int n = paramByteBuffer.getInt();
    this.iM.setHeight(n);

    this.iM.aa(paramByteBuffer.getShort());
    this.iM.Z(paramByteBuffer.getShort());
    int i1 = paramByteBuffer.getShort();
    this.iM.gV(i1);
    if ((!bB) && (paramByteBuffer.remaining() <= i1 * 2)) throw new AssertionError();
    short[] arrayOfShort = new short[i1];
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfShort[i2] = paramByteBuffer.getShort();
    }
    this.iM.c(arrayOfShort);
    i2 = paramByteBuffer.get() == 1 ? 1 : 0;
    this.iM.bx(i2);
    byte[] arrayOfByte = new byte[i1];
    if (i2 != 0) {
      paramByteBuffer.get(arrayOfByte);
    }
    this.iM.s(arrayOfByte);

    Z(paramByteBuffer);

    this.iM.ax(paramByteBuffer.get());
    this.iM.ay(paramByteBuffer.get());

    int i3 = paramByteBuffer.get();
    for (int i4 = 0; i4 < i3; i4++)
      this.iM.f(paramByteBuffer.get(), paramByteBuffer.getInt());
  }

  private static dQx c(UG paramUG)
  {
    return asc.k(paramUG.getMinX(), paramUG.getMinY(), paramUG.getWidth(), paramUG.getHeight());
  }

  private void Z(ByteBuffer paramByteBuffer) {
    dQx localdQx = c(this.iM);
    bhq localbhq = a(this.iM, paramByteBuffer);

    for (int i = localdQx.hqw; i < localdQx.hqx; i++)
      for (int j = localdQx.hqu; j < localdQx.hqv; j++) {
        tF localtF = localbhq.t((short)j, (short)i);
        if (localtF != null)
          this.iM.b(localtF);
      }
  }

  private static bhq a(UG paramUG, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get() != 0 ? 1 : 0;

    if (cwO.cuj()) {
      if ((!bB) && (i != 0)) throw new AssertionError();
      return new aHo();
    }

    short s1 = paramUG.D();
    short s2 = paramUG.Lk();
    if (i != 0) {
      new aW(paramUG).i(paramByteBuffer);
      return new aHp(s1, s2);
    }

    return new aHq(s1, s2);
  }
}