import java.nio.ByteBuffer;

class cQ extends cCH
{
  cQ(aAO paramaAO)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("Ne devrait pas passer par ici");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.get() == 0 ? 1 : 0;
    if (i != 0) {
      aAO.a(this.Sb, null);
      return;
    }

    if (aAO.b(this.Sb) == null) {
      return;
    }

    Vr.loadLibraries();

    int j = paramByteBuffer.getInt();
    byte[] arrayOfByte1 = new byte[j];
    paramByteBuffer.get(arrayOfByte1);

    int k = paramByteBuffer.getInt();
    byte[] arrayOfByte2 = new byte[k];
    paramByteBuffer.get(arrayOfByte2);

    aAO.a(this.Sb, aIJ.b(arrayOfByte1, arrayOfByte2));
    int m = paramByteBuffer.get() == 1 ? 1 : 0;
    if (m != 0) {
      aAO.a(this.Sb, cYq.jq(paramByteBuffer.getLong()));
    }
    aAO.a(this.Sb, bpu.av(paramByteBuffer));

    aAO.c(this.Sb);
  }
}