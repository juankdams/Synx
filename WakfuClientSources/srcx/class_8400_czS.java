import java.nio.ByteBuffer;

public final class czS
{
  private pq ipQ;

  public void a(pq parampq)
  {
    this.ipQ = parampq;
  }

  public pq cwP() {
    return this.ipQ;
  }

  public int O() {
    return 10 + dzp.qC(this.ipQ.getName()).length + 1 + 1 + 2 + 8 + 8 + 2 + this.ipQ.wE().size() * 6 + 2 + this.ipQ.wF().size() * 6 + 2 + cwQ();
  }

  public void write(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.ipQ.eq());
    byte[] arrayOfByte = dzp.qC(this.ipQ.getName());
    paramByteBuffer.putShort((short)arrayOfByte.length);
    paramByteBuffer.put(arrayOfByte);
    paramByteBuffer.put((byte)(this.ipQ.wD() ? 1 : 0));
    paramByteBuffer.put((byte)(this.ipQ.wL() ? 1 : 0));
    paramByteBuffer.putShort(this.ipQ.wB());
    paramByteBuffer.putLong(this.ipQ.wC());
    paramByteBuffer.putLong(this.ipQ.wH());
    a(paramByteBuffer, this.ipQ.wE());
    a(paramByteBuffer, this.ipQ.wF());
    a(paramByteBuffer, this.ipQ.wK());
  }

  public void aE(ByteBuffer paramByteBuffer) {
    long l = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort();
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);

    this.ipQ = new pq(l, arrayOfByte);

    read(paramByteBuffer);
  }

  private void read(ByteBuffer paramByteBuffer) {
    this.ipQ.N(paramByteBuffer.get() == 1);
    this.ipQ.O(paramByteBuffer.get() == 1);
    short s = paramByteBuffer.getShort();
    long l = paramByteBuffer.getLong();
    this.ipQ.a(l, s);
    this.ipQ.R(paramByteBuffer.getLong());

    b(paramByteBuffer, this.ipQ.wE());
    b(paramByteBuffer, this.ipQ.wF());
    b(paramByteBuffer, this.ipQ.wK());
  }

  private void a(ByteBuffer paramByteBuffer, il paramil) {
    paramByteBuffer.putShort((short)paramil.size());
    paramil.a(new aEs(this, paramByteBuffer));
  }

  private void b(ByteBuffer paramByteBuffer, il paramil)
  {
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      int k = paramByteBuffer.getInt();
      short s = paramByteBuffer.getShort();
      paramil.a(k, s);
    }
  }

  private int cwQ() {
    return this.ipQ.wK().size() * 11;
  }

  private void a(ByteBuffer paramByteBuffer, aoL paramaoL) {
    paramByteBuffer.putShort((short)paramaoL.size());
    cHu localcHu = paramaoL.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      bgl localbgl = (bgl)localcHu.value();
      paramByteBuffer.put(localbgl.VH());
      paramByteBuffer.putLong(localbgl.bsW());
      paramByteBuffer.putShort(localbgl.bsX());
    }
  }

  private void b(ByteBuffer paramByteBuffer, aoL paramaoL) {
    int i = paramByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      byte b = paramByteBuffer.get();
      long l = paramByteBuffer.getLong();
      short s = paramByteBuffer.getShort();
      paramaoL.put(b, new bgl(b, l, s));
    }
  }
}