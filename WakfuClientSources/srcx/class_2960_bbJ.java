import java.nio.ByteBuffer;

class bbJ extends cCH
{
  bbJ(chg paramchg)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.aF.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedBreedSpecific");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedBreedSpecific", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.aF.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedBreedSpecific");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedBreedSpecific", localException);
    }
  }

  public int cc()
  {
    return this.aF.O();
  }
}