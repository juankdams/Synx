import java.nio.ByteBuffer;

class abH extends cCH
{
  abH(aQB paramaQB)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.cQg.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedXp");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedXp", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.cQg.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedXp");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedXp", localException);
    }
  }

  public int cc()
  {
    return this.cQg.O();
  }
}