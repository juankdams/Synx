import java.nio.ByteBuffer;

class cBE extends cCH
{
  cBE(Xf paramXf)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.isF.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedIdentity");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedIdentity", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.isF.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedIdentity");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedIdentity", localException);
    }
  }

  public int cc()
  {
    return this.isF.O();
  }
}