import java.nio.ByteBuffer;

class dvs extends cCH
{
  dvs(aZw paramaZw)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(aZw.a(this.lAN));
    paramByteBuffer.putInt(this.lAN.gAG);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    aZw.a(this.lAN, paramByteBuffer.getInt());
    this.lAN.gAG = paramByteBuffer.getInt();
  }

  public int cc()
  {
    return 8;
  }
}