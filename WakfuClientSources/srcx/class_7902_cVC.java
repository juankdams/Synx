import java.nio.ByteBuffer;

class cVC extends cCH
{
  cVC(Cq paramCq)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.kHX.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedRespawnPoint");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedRespawnPoint", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.kHX.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedRespawnPoint");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedRespawnPoint", localException);
    }
  }

  public int cc()
  {
    return this.kHX.O();
  }
}