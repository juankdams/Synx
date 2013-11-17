import java.nio.ByteBuffer;

public class aVL extends hk
{
  protected aVL(bzv parambzv)
  {
  }

  public void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    bzv.a(this.eXR, paramByteBuffer.getShort());
    bzv.a(this.eXR, paramByteBuffer.getInt());
    bzv.b(this.eXR, paramByteBuffer.getInt());
    bzv.b(this.eXR, paramByteBuffer.getShort());
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(bzv.a(this.eXR));
    paramByteBuffer.putInt(bzv.b(this.eXR));
    paramByteBuffer.putInt(bzv.c(this.eXR));
    paramByteBuffer.putShort(bzv.d(this.eXR));
  }

  public int O()
  {
    return 12;
  }
}