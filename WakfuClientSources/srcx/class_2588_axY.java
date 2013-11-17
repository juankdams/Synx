import java.nio.ByteBuffer;

class axY extends cCH
{
  axY(PB paramPB)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.btx.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedLocks");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedLocks", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.btx.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedLocks");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedLocks", localException);
    }
  }

  public int cc()
  {
    return this.btx.O();
  }
}