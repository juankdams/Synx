import java.nio.ByteBuffer;

class JV extends cCH
{
  JV(ajO paramajO, int paramInt)
  {
    super(paramInt);
  }
  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    ajO.a(this.bVB, paramByteBuffer.getInt());
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}