import java.nio.ByteBuffer;

class aTv extends cCH
{
  aTv(dhk paramdhk)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.eRA.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedScenarioManager");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedScenarioManager", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.eRA.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedScenarioManager");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedScenarioManager", localException);
    }
  }

  public int cc()
  {
    return this.eRA.O();
  }
}