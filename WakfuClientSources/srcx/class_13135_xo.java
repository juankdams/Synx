import java.nio.ByteBuffer;

class xo extends cCH
{
  xo(dpb paramdpb)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.bpW.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de NPCSerializedGroup");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de NPCSerializedGroup", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.bpW.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de NPCSerializedGroup");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de NPCSerializedGroup", localException);
    }
  }

  public int cc()
  {
    return this.bpW.O();
  }
}