import java.nio.ByteBuffer;

class nk extends cCH
{
  nk(dmR paramdmR)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.aRL.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedControlledByAI");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedControlledByAI", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.aRL.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedControlledByAI");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedControlledByAI", localException);
    }
  }

  public int cc()
  {
    return this.aRL.O();
  }
}