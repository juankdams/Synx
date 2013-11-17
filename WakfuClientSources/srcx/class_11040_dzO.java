import java.nio.ByteBuffer;

class dzO extends cCH
{
  dzO(bmT parambmT)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.lGE.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedAccountInformation");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedAccountInformation", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.lGE.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedAccountInformation");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedAccountInformation", localException);
    }
  }

  public int cc()
  {
    return this.lGE.O();
  }
}