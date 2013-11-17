import java.nio.ByteBuffer;

class bfR extends cCH
{
  bfR(brT parambrT, int paramInt)
  {
    super(paramInt);
  }
  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    brT.a(this.ftP, paramByteBuffer.get() == 1);
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}