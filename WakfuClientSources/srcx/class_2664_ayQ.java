import java.nio.ByteBuffer;

class ayQ extends cCH
{
  ayQ(bri parambri)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.dPZ.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedNationSynchro");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedNationSynchro", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.dPZ.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedNationSynchro");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedNationSynchro", localException);
    }
  }

  public int cc()
  {
    return this.dPZ.O();
  }
}