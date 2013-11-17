import java.nio.ByteBuffer;

class cFv extends cCH
{
  cFv(dmE paramdmE)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.izX.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedStatistics");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedStatistics", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.izX.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedStatistics");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedStatistics", localException);
    }
  }

  public int cc()
  {
    return this.izX.O();
  }
}