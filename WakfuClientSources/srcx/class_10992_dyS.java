import java.nio.ByteBuffer;

class dyS extends cCH
{
  dyS(bQV parambQV)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.lFs.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedLocalGuildInfo");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedLocalGuildInfo", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.lFs.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedLocalGuildInfo");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedLocalGuildInfo", localException);
    }
  }

  public int cc()
  {
    return this.lFs.O();
  }
}