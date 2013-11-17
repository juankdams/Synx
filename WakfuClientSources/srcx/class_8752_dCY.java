import java.nio.ByteBuffer;

class dCY extends cCH
{
  dCY(dWa paramdWa)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    try
    {
      boolean bool = this.ekg.g(paramByteBuffer);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la sérialisation de CraftCounter");
    }
    catch (Exception localException) {
      a("Exception levée lors de la sérialisation de CraftCounter", localException);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    try {
      boolean bool = this.ekg.b(paramByteBuffer, paramInt);
      if (bool)
        cyQ();
      else
        nc("Erreur lors de la désérialisation de CraftCounter");
    }
    catch (Exception localException) {
      a("Exception levée lors de la désérialisation de CraftCounter", localException);
    }
  }

  public int cc()
  {
    return this.ekg.O();
  }
}