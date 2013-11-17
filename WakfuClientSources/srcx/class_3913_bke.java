import java.nio.ByteBuffer;

class bke extends cCH
{
  bke(aEh paramaEh)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.fAv.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedId");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedId", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.fAv.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedId");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedId", localException);
    }
  }

  public int cc()
  {
    return this.fAv.O();
  }
}