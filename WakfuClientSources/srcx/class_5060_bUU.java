import java.nio.ByteBuffer;

class bUU extends cCH
{
  bUU(dFw paramdFw)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.hhb.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedRemoteAccountInformation");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedRemoteAccountInformation", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.hhb.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedRemoteAccountInformation");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedRemoteAccountInformation", localException);
    }
  }

  public int cc()
  {
    return this.hhb.O();
  }
}