import java.nio.ByteBuffer;

class cUD extends cCH
{
  cUD(aix paramaix)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.kHn.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de NPCSerializedCharacteristics");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de NPCSerializedCharacteristics", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.kHn.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de NPCSerializedCharacteristics");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de NPCSerializedCharacteristics", localException);
    }
  }

  public int cc()
  {
    return this.kHn.O();
  }
}