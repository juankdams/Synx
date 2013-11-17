import java.nio.ByteBuffer;

class cXX extends cCH
{
  cXX(ahj paramahj)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.kLm.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedGuildInfoForGame");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedGuildInfoForGame", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.kLm.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedGuildInfoForGame");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedGuildInfoForGame", localException);
    }
  }

  public int cc()
  {
    return this.kLm.O();
  }
}