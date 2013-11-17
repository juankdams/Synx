import java.nio.ByteBuffer;

class eg extends cCH
{
  eg(aNv paramaNv)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.ayq.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedLocksForClient");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedLocksForClient", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.ayq.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedLocksForClient");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedLocksForClient", localException);
    }
  }

  public int cc()
  {
    return this.ayq.O();
  }
}