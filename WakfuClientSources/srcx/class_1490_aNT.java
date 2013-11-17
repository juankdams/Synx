import java.nio.ByteBuffer;

class aNT extends cCH
{
  aNT(bxl parambxl)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.aHs.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedCraft");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedCraft", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.aHs.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedCraft");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedCraft", localException);
    }
  }

  public int cc()
  {
    return this.aHs.O();
  }
}