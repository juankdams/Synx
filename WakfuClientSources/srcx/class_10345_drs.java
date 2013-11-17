import java.nio.ByteBuffer;

class drs extends cCH
{
  drs(aAf paramaAf)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.ltT.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedRunningEffectsForSave");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedRunningEffectsForSave", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.ltT.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedRunningEffectsForSave");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedRunningEffectsForSave", localException);
    }
  }

  public int cc()
  {
    return this.ltT.O();
  }
}