import java.nio.ByteBuffer;

class azT extends cCH
{
  azT(aVI paramaVI)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.dSf.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedGameServer");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedGameServer", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.dSf.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedGameServer");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedGameServer", localException);
    }
  }

  public int cc()
  {
    return this.dSf.O();
  }
}