import java.nio.ByteBuffer;

class cyy extends cCH
{
  cyy(bIL parambIL, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.imT.aDR);
    paramByteBuffer.putShort(this.imT.gIY);
    paramByteBuffer.put((byte)(this.imT.gIZ ? 1 : 0));
    if (this.imT.gJc != null)
      paramByteBuffer.putInt(this.imT.gJc.getIndex());
    else
      paramByteBuffer.putInt(-1);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.imT.aDR = paramByteBuffer.getLong();
    this.imT.gIY = paramByteBuffer.getShort();
    this.imT.gIZ = (paramByteBuffer.get() == 1);

    int i = paramByteBuffer.getInt();
    if (i == -1)
      this.imT.gJc = null;
    else
      this.imT.gJc = CG.eu(i);
  }
}