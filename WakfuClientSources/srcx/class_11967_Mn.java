import java.nio.ByteBuffer;

class Mn extends cCH
{
  Mn(Fo paramFo)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.btv.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedFight");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedFight", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.btv.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedFight");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedFight", localException);
    }
  }

  public int cc()
  {
    return this.btv.O();
  }
}