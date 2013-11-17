import java.nio.ByteBuffer;

class aAg extends cCH
{
  aAg(bOz parambOz)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.dSL.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedPosition");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedPosition", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.dSL.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedPosition");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedPosition", localException);
    }
  }

  public int cc()
  {
    return this.dSL.O();
  }
}