import java.nio.ByteBuffer;

class atV extends cCH
{
  atV(aAP paramaAP)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.dFM.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedPreviousPosition");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedPreviousPosition", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.dFM.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedPreviousPosition");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedPreviousPosition", localException);
    }
  }

  public int cc()
  {
    return this.dFM.O();
  }
}