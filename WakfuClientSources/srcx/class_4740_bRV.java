import java.nio.ByteBuffer;

class bRV extends cCH
{
  bRV(dlO paramdlO)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.hbP.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedOccupation");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedOccupation", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.hbP.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedOccupation");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedOccupation", localException);
    }
  }

  public int cc()
  {
    return this.hbP.O();
  }
}