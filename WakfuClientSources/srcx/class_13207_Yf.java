import java.nio.ByteBuffer;

class Yf extends cCH
{
  Yf(bYp parambYp)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.cIE.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedDimensionalBagForSave");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedDimensionalBagForSave", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.cIE.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedDimensionalBagForSave");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedDimensionalBagForSave", localException);
    }
  }

  public int cc()
  {
    return this.cIE.O();
  }
}