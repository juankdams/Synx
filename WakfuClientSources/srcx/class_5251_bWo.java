import java.nio.ByteBuffer;

class bWo extends cCH
{
  bWo(bXC parambXC)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.hiy.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedChallenges");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedChallenges", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.hiy.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedChallenges");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedChallenges", localException);
    }
  }

  public int cc()
  {
    return this.hiy.O();
  }
}