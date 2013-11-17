import java.nio.ByteBuffer;

class bzn extends cCH
{
  private aof cQb;

  bzn(bMQ parambMQ)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    this.cQb.g(paramByteBuffer);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    dhJ localdhJ = (dhJ)this.gnj.bke();
    this.cQb = new aof();
    this.cQb.h(paramByteBuffer);

    if (localdhJ.auK() == null)
      this.gnj.gRi = Pg.abf().Sm();
    else {
      this.gnj.gRi = Pg.abf().a((short)100, localdhJ.auK().ajw(), localdhJ.auK().ajz(), false, false, false);
    }

    this.gnj.gRi.b(this.cQb);
  }

  public int cc()
  {
    this.cQb = new aof();
    this.gnj.gRi.a(this.cQb);
    return this.cQb.O();
  }
}