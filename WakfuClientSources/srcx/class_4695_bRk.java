import java.nio.ByteBuffer;

class bRk extends cCH
{
  private aof haY;
  private fV gco;

  bRk(bJT parambJT)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(bJT.b(this.haZ) ? 1 : 0));
    this.haY.g(paramByteBuffer);
    this.gco.g(paramByteBuffer);
    paramByteBuffer.put(bJT.c(this.haZ));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bJT.a(this.haZ, paramByteBuffer.get() == 1);
    this.haY = new aof();
    this.haY.h(paramByteBuffer);
    this.gco = new fV();
    this.gco.h(paramByteBuffer);
    bJT.a(this.haZ, new csi());
    bJT.d(this.haZ).b(this.haY);
    bJT.a(this.haZ, new aZx());
    bJT.e(this.haZ).b(this.gco);
    bJT.d(this.haZ).as(paramByteBuffer.get());
  }

  public int cc()
  {
    this.haY = new aof();
    bJT.d(this.haZ).a(this.haY);
    this.gco = new fV();
    bJT.e(this.haZ).a(this.gco);
    return 1 + this.haY.O() + this.gco.O() + 1;
  }
}