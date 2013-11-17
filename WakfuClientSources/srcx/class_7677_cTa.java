import java.nio.ByteBuffer;

class cTa extends cCH
{
  cTa(cPS paramcPS)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.hHS.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedAntiAddiction");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedAntiAddiction", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.hHS.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedAntiAddiction");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedAntiAddiction", localException);
    }
  }

  public int cc()
  {
    return this.hHS.O();
  }
}