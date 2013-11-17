import java.nio.ByteBuffer;

class bCM extends cCH
{
  bCM(dl paramdl)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.dCq.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedBags");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedBags", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.dCq.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedBags");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedBags", localException);
    }
  }

  public int cc()
  {
    return this.dCq.O();
  }
}