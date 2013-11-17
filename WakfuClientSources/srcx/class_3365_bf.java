import java.nio.ByteBuffer;

class bf extends cCH
{
  bf(OQ paramOQ)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.ja.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedSkillInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedSkillInventory", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.ja.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedSkillInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedSkillInventory", localException);
    }
  }

  public int cc()
  {
    return this.ja.O();
  }
}