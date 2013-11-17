import java.nio.ByteBuffer;

class bWZ extends cCH
{
  bWZ(bSf parambSf)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.hlu.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedSpellInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedSpellInventory", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.hlu.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedSpellInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedSpellInventory", localException);
    }
  }

  public int cc()
  {
    return this.hlu.O();
  }
}