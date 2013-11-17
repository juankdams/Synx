import java.nio.ByteBuffer;

class dyE extends cCH
{
  dyE(aEF paramaEF)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.lFj.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedHp");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedHp", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.lFj.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedHp");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedHp", localException);
    }
  }

  public int cc()
  {
    return this.lFj.O();
  }
}