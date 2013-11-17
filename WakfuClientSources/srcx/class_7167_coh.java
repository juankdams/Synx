import java.nio.ByteBuffer;

class coh extends cCH
{
  coh(eb parameb)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.hVM.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedCharacteristics");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedCharacteristics", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.hVM.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedCharacteristics");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedCharacteristics", localException);
    }
  }

  public int cc()
  {
    return this.hVM.O();
  }
}