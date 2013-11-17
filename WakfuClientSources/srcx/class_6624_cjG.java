import java.nio.ByteBuffer;

class cjG extends cCH
{
  cjG(ddL paramddL)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.fsM.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedProperties");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedProperties", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.fsM.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedProperties");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedProperties", localException);
    }
  }

  public int cc()
  {
    return this.fsM.O();
  }
}