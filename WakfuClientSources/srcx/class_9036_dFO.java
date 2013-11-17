import java.nio.ByteBuffer;

class dFO extends cCH
{
  dFO(awo paramawo)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.lQl.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de NPCSerializedCollect");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de NPCSerializedCollect", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.lQl.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de NPCSerializedCollect");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de NPCSerializedCollect", localException);
    }
  }

  public int cc()
  {
    return this.lQl.O();
  }
}