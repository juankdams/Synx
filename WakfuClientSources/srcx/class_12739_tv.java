import java.nio.ByteBuffer;

class tv extends cCH
{
  tv(cXW paramcXW)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.beb.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedLandMarkInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedLandMarkInventory", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.beb.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedLandMarkInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedLandMarkInventory", localException);
    }
  }

  public int cc()
  {
    return this.beb.O();
  }
}