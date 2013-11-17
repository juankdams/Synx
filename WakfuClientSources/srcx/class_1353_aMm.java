import java.nio.ByteBuffer;

class aMm extends cCH
{
  aMm(dgp paramdgp, int paramInt)
  {
    super(paramInt);
  }

  public void b(ByteBuffer paramByteBuffer) {
    this.ert.czx.b(paramByteBuffer);
    paramByteBuffer.put((byte)(dgp.a(this.ert) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.ert.czx.a(paramByteBuffer, aUk.eVd);
    dgp.a(this.ert, paramByteBuffer.get() == 1);
  }

  public int cc()
  {
    return this.ert.czx.cc() + 1;
  }
}