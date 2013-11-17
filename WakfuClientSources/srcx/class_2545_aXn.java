import java.nio.ByteBuffer;

class aXn extends cCH
{
  aXn(aHR paramaHR)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    aoL localaoL = this.fcs.aIX.EW();
    paramByteBuffer.put(this.fcs.aIX.EU());
    paramByteBuffer.put((byte)localaoL.size());
    for (cHu localcHu = localaoL.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      paramByteBuffer.putLong(localcHu.bic());
      byte[] arrayOfByte = dzp.qC((String)localcHu.value());
      if (arrayOfByte.length > 127)
        return;
      paramByteBuffer.put((byte)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.fcs.aIX.l(paramByteBuffer.get());
    int i = paramByteBuffer.get();
    for (int j = 0; j < i; j++) {
      long l = paramByteBuffer.getLong();
      byte[] arrayOfByte = new byte[paramByteBuffer.get()];
      paramByteBuffer.get(arrayOfByte);
      this.fcs.aIX.a(l, dzp.aJ(arrayOfByte));
    }
  }

  public int cc()
  {
    int i = 2;
    aoL localaoL = this.fcs.aIX.EW();
    for (cHu localcHu = localaoL.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      byte[] arrayOfByte = dzp.qC((String)localcHu.value());
      if (arrayOfByte.length > 127)
        return i;
      i += 9 + arrayOfByte.length;
    }
    return i;
  }
}