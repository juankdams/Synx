import java.nio.ByteBuffer;

class aOk extends cCH
{
  aOk(bdg parambdg)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.euE.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedAchievements");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedAchievements", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.euE.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedAchievements");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedAchievements", localException);
    }
  }

  public int cc()
  {
    return this.euE.O();
  }
}