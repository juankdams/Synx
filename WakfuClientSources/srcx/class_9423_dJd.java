import java.nio.ByteBuffer;

class dJd extends cCH
{
  dJd(dBl paramdBl)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.lUE.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedGuild");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedGuild", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.lUE.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedGuild");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedGuild", localException);
    }
  }

  public int cc()
  {
    return this.lUE.O();
  }
}