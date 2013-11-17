import java.nio.ByteBuffer;

class cGr extends cCH
{
  cGr(PC paramPC)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.iBy.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de NPCSerializedUserTemplate");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de NPCSerializedUserTemplate", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.iBy.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de NPCSerializedUserTemplate");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de NPCSerializedUserTemplate", localException);
    }
  }

  public int cc()
  {
    return this.iBy.O();
  }
}