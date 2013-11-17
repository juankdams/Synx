import java.nio.ByteBuffer;

class bF extends cCH
{
  bF(ddJ paramddJ)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.kF.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedInventories");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedInventories", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.kF.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedInventories");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedInventories", localException);
    }
  }

  public int cc()
  {
    return this.kF.O();
  }
}