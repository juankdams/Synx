import java.nio.ByteBuffer;

class alR extends cCH
{
  alR(M paramM)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.bId.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedPet");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedPet", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.bId.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedPet");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedPet", localException);
    }
  }

  public int cc()
  {
    return this.bId.O();
  }
}