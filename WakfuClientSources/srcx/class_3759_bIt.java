import java.nio.ByteBuffer;

class bIt extends cCH
{
  bIt(qF paramqF)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.gHB.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedSocialStates");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedSocialStates", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.gHB.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedSocialStates");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedSocialStates", localException);
    }
  }

  public int cc()
  {
    return this.gHB.O();
  }
}