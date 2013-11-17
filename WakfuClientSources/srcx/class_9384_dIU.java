import java.nio.ByteBuffer;

class dIU extends cCH
{
  dIU(cyn paramcyn, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(cyn.a(this.eoj) ? 1 : 0));
    paramByteBuffer.putInt(cyn.b(this.eoj));
    paramByteBuffer.putInt(cyn.c(this.eoj));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cyn.a(this.eoj, paramByteBuffer.get() == 1);
    cyn.a(this.eoj, paramByteBuffer.getInt());
    cyn.b(this.eoj, paramByteBuffer.getInt());
  }
}