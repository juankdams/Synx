import java.nio.ByteBuffer;

class cFM extends cCH
{
  cFM(cvw paramcvw, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(cvw.a(this.iAL));
    paramByteBuffer.putInt(cvw.b(this.iAL));
    paramByteBuffer.put(cvw.c(this.iAL));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cvw.a(this.iAL, paramByteBuffer.getLong());
    cvw.a(this.iAL, paramByteBuffer.getInt());
    cvw.a(this.iAL, paramByteBuffer.get());
    cvw.a(this.iAL, null);
  }
}