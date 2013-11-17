import java.nio.ByteBuffer;

class bFX extends cCH
{
  bFX(jx paramjx, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.gBY.aDR);
    paramByteBuffer.putShort(this.gBY.gIY);
    paramByteBuffer.put((byte)(this.gBY.gIZ ? 1 : 0));
    if (this.gBY.gJc != null)
      paramByteBuffer.putInt(this.gBY.gJc.getIndex());
    else
      paramByteBuffer.putInt(-1);
    paramByteBuffer.putInt(jx.a(this.gBY));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.gBY.aDR = paramByteBuffer.getLong();
    this.gBY.gIY = paramByteBuffer.getShort();
    this.gBY.gIZ = (paramByteBuffer.get() == 1);

    int i = paramByteBuffer.getInt();
    if (i == -1)
      this.gBY.gJc = null;
    else {
      this.gBY.gJc = CG.eu(i);
    }
    jx.a(this.gBY, paramByteBuffer.getInt());
  }
}