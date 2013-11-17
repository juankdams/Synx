import java.nio.ByteBuffer;

class asR extends cCH
{
  asR(bvj parambvj)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("Pas de serialization dans le client");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.getInt();
    for (int j = 0; j < i; j++)
      bvj.c(this.dCU).a(bvj.b(this.dCU).gM(paramByteBuffer.getInt()));
  }

  public int cc()
  {
    return 4 + bvj.c(this.dCU).size() * 4;
  }
}