import java.nio.ByteBuffer;

class cbX extends cCH
{
  cbX(Ks paramKs)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.goy.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedRunningEffects");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedRunningEffects", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.goy.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedRunningEffects");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedRunningEffects", localException);
    }
  }

  public int cc()
  {
    return this.goy.O();
  }
}