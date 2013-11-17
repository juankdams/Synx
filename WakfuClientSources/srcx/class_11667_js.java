import java.nio.ByteBuffer;

class js extends cCH
{
  js(all paramall)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.aLg.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedNationCitizenScore");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedNationCitizenScore", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.aLg.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedNationCitizenScore");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedNationCitizenScore", localException);
    }
  }

  public int cc()
  {
    return this.aLg.O();
  }
}