import java.nio.ByteBuffer;

class Yd extends cCH
{
  Yd(cMb paramcMb)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    wW localwW = new wW();
    localwW.h(paramByteBuffer);
    this.cID.xN().a(localwW);
  }
}