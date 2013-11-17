import java.nio.ByteBuffer;

class bMx extends cCH
{
  bMx(dCG paramdCG)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.gQd.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedGuildId");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedGuildId", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.gQd.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedGuildId");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedGuildId", localException);
    }
  }

  public int cc()
  {
    return this.gQd.O();
  }
}