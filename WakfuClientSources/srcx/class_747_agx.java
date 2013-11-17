import java.nio.ByteBuffer;

class agx extends cCH
{
  agx(aqM paramaqM)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.dao.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedRemoteGuildInfo");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedRemoteGuildInfo", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.dao.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedRemoteGuildInfo");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedRemoteGuildInfo", localException);
    }
  }

  public int cc()
  {
    return this.dao.O();
  }
}