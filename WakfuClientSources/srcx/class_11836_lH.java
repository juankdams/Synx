import java.nio.ByteBuffer;

class lH extends cCH
{
  lH(cqg paramcqg)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.aPl.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedCreationData");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedCreationData", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.aPl.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedCreationData");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedCreationData", localException);
    }
  }

  public int cc()
  {
    return this.aPl.O();
  }
}