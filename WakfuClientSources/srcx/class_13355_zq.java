import java.nio.ByteBuffer;

class zq extends cCH
{
  zq(aPY paramaPY)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.btP.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CharacterSerializedEquipmentInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CharacterSerializedEquipmentInventory", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.btP.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CharacterSerializedEquipmentInventory");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CharacterSerializedEquipmentInventory", localException);
    }
  }

  public int cc()
  {
    return this.btP.O();
  }
}