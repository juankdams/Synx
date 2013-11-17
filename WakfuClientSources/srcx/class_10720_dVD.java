import java.nio.ByteBuffer;

class dVD extends cCH
{
  dVD(cBY paramcBY)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.fcz.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedDimensionalBagViewInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedDimensionalBagViewInventory", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.fcz.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedDimensionalBagViewInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedDimensionalBagViewInventory", localException);
    }
  }

  public int cc()
  {
    return this.fcz.O();
  }
}