import java.nio.ByteBuffer;

class dhS extends cCH
{
  dhS(cQj paramcQj, int paramInt)
  {
    super(paramInt);
  }
  public void a(ByteBuffer paramByteBuffer, int paramInt) { int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0)
      cQj.b(this.ldG).aq(paramByteBuffer); }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}