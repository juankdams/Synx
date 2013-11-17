import java.nio.ByteBuffer;

class aHz extends cCH
{
  aHz(cVI paramcVI)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.efq.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedTitle");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedTitle", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.efq.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedTitle");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedTitle", localException);
    }
  }

  public int cc()
  {
    return this.efq.O();
  }
}