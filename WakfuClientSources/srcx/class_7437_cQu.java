import java.nio.ByteBuffer;

class cQu extends cCH
{
  cQu(dMD paramdMD)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.kBs.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedGroup");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedGroup", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.kBs.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedGroup");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedGroup", localException);
    }
  }

  public int cc()
  {
    return this.kBs.O();
  }
}