import java.nio.ByteBuffer;

class sU extends cCH
{
  sU(cpx paramcpx)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.bcE.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedName");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedName", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.bcE.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedName");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedName", localException);
    }
  }

  public int cc()
  {
    return this.bcE.O();
  }
}