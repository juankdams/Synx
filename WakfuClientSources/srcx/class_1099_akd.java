import java.nio.ByteBuffer;

class akd extends cCH
{
  akd(bil parambil)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.dkN.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedSex");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedSex", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.dkN.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedSex");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedSex", localException);
    }
  }

  public int cc()
  {
    return this.dkN.O();
  }
}