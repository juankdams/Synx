import java.nio.ByteBuffer;

class Cp extends cCH
{
  Cp(gG paramgG)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.bEV.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedNationStorage");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedNationStorage", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.bEV.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedNationStorage");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedNationStorage", localException);
    }
  }

  public int cc()
  {
    return this.bEV.O();
  }
}