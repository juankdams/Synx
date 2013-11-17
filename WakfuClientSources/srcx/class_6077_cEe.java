import java.nio.ByteBuffer;

class cEe extends cCH
{
  cEe(bWr parambWr)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.ixB.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedDimensionalBagForClient");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedDimensionalBagForClient", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.ixB.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedDimensionalBagForClient");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedDimensionalBagForClient", localException);
    }
  }

  public int cc()
  {
    return this.ixB.O();
  }
}