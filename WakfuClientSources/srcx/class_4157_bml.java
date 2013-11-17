import java.nio.ByteBuffer;

class bml extends cCH
{
  bml(yc paramyc)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.fDP.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedEquipmentAppearance");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedEquipmentAppearance", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.fDP.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedEquipmentAppearance");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedEquipmentAppearance", localException);
    }
  }

  public int cc()
  {
    return this.fDP.O();
  }
}