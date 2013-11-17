import java.nio.ByteBuffer;

class cla extends cCH
{
  cla(aNE paramaNE)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.hMJ.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de NPCSerializedAppearance");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de NPCSerializedAppearance", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.hMJ.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de NPCSerializedAppearance");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de NPCSerializedAppearance", localException);
    }
  }

  public int cc()
  {
    return this.hMJ.O();
  }
}