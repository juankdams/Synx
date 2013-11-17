import java.nio.ByteBuffer;

class cso extends cCH
{
  cso(bvL parambvL)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.icn.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedAppearance");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedAppearance", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.icn.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedAppearance");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedAppearance", localException);
    }
  }

  public int cc()
  {
    return this.icn.O();
  }
}