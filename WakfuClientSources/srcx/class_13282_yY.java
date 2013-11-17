import java.nio.ByteBuffer;

class yY extends cCH
{
  yY(amX paramamX)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.bti.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedPersonalEffects");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedPersonalEffects", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.bti.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedPersonalEffects");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedPersonalEffects", localException);
    }
  }

  public int cc()
  {
    return this.bti.O();
  }
}