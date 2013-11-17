import java.nio.ByteBuffer;

class bCh extends bJS
{
  private byte[] gwu;
  private byte[] gwv;

  bCh(aym paramaym1, aym paramaym2)
  {
    super(paramaym2);
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.gww.dOf);
    paramByteBuffer.putLong(this.gww.iI);

    paramByteBuffer.put((byte)this.gwu.length);
    paramByteBuffer.put(this.gwu);

    paramByteBuffer.put((byte)this.gwv.length);
    paramByteBuffer.put(this.gwv);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    this.gww.dOf = paramByteBuffer.getLong();
    this.gww.iI = paramByteBuffer.getLong();

    this.gwu = new byte[paramByteBuffer.get() & 0xFF];
    paramByteBuffer.get(this.gwu);
    this.gww.bax = dzp.aJ(this.gwu);

    this.gwv = new byte[paramByteBuffer.get() & 0xFF];
    paramByteBuffer.get(this.gwv);
    this.gww.bSn = dzp.aJ(this.gwv);
  }

  public int cc() {
    this.gwu = dzp.qC(this.gww.bax);
    this.gwv = dzp.qC(this.gww.bSn);
    return 21 + this.gwu.length + 1 + this.gwv.length;
  }

  public void aT()
  {
    for (bxV localbxV : this.gww.dOe)
      localbxV.a(this);
  }

  public void aS()
  {
  }
}