import java.nio.ByteBuffer;

class aNW extends cCH
{
  aNW(le paramle)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.euh.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedNationId");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedNationId", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.euh.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedNationId");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedNationId", localException);
    }
  }

  public int cc()
  {
    return this.euh.O();
  }
}