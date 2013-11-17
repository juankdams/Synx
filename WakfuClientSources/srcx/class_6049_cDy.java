import java.nio.ByteBuffer;

class cDy extends cCH
{
  cDy(dcr paramdcr)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(dcr.a(this.iwO));
    paramByteBuffer.put((byte)(dcr.b(this.iwO) ? 1 : 0));
    paramByteBuffer.putLong(dcr.c(this.iwO));
    for (int k : dcr.d(this.iwO)) {
      paramByteBuffer.putInt(k);
    }
    ??? = dzp.qC(dcr.e(this.iwO));
    paramByteBuffer.put((byte)???.length);
    paramByteBuffer.put((byte[])???);

    byte[] arrayOfByte = dzp.qC(dcr.f(this.iwO));
    paramByteBuffer.put((byte)arrayOfByte.length);
    paramByteBuffer.put(arrayOfByte);

    dcr.g(this.iwO).b(paramByteBuffer);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    dcr.a(this.iwO, paramByteBuffer.getLong());
    dcr.a(this.iwO, paramByteBuffer.get() == 1);
    dcr.b(this.iwO, paramByteBuffer.getLong());
    for (int i = 0; i < bBc.bJN(); i++) {
      dcr.d(this.iwO)[i] = paramByteBuffer.getInt();
    }
    byte[] arrayOfByte1 = new byte[paramByteBuffer.get() & 0xFF];
    paramByteBuffer.get(arrayOfByte1);
    dcr.a(this.iwO, dzp.aJ(arrayOfByte1));

    byte[] arrayOfByte2 = new byte[paramByteBuffer.get() & 0xFF];
    paramByteBuffer.get(arrayOfByte2);
    dcr.b(this.iwO, dzp.aJ(arrayOfByte2));

    dcr.g(this.iwO).U(paramByteBuffer);
  }

  public int cc() {
    int i = 0;

    i += 17 + 4 * bBc.bJN();

    byte[] arrayOfByte1 = dzp.qC(dcr.e(this.iwO));
    i += 1 + arrayOfByte1.length;

    byte[] arrayOfByte2 = dzp.qC(dcr.f(this.iwO));
    i += 1 + arrayOfByte2.length;

    i += dcr.g(this.iwO).O();

    return i;
  }
}