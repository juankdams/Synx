import java.nio.ByteBuffer;

class bAf extends cCH
{
  bAf(bgx parambgx)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.cfL.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedCurrentMovementPath");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedCurrentMovementPath", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.cfL.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedCurrentMovementPath");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedCurrentMovementPath", localException);
    }
  }

  public int cc()
  {
    return this.cfL.O();
  }
}