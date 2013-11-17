import java.nio.ByteBuffer;

class dS extends cCH
{
  dS(dEe paramdEe)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.Vs.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedShortcutInventories");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedShortcutInventories", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.Vs.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedShortcutInventories");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedShortcutInventories", localException);
    }
  }

  public int cc()
  {
    return this.Vs.O();
  }
}