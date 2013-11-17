import java.nio.ByteBuffer;

class ciX extends cCH
{
  ciX(Kk paramKk)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.hIA.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedBreed");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedBreed", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.hIA.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedBreed");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedBreed", localException);
    }
  }

  public int cc()
  {
    return this.hIA.O();
  }
}