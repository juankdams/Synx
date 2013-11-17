import java.nio.ByteBuffer;

class bfN extends cCH
{
  bfN(st paramst)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.ftz.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedPasseportInfo");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedPasseportInfo", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.ftz.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedPasseportInfo");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedPasseportInfo", localException);
    }
  }

  public int cc()
  {
    return this.ftz.O();
  }
}