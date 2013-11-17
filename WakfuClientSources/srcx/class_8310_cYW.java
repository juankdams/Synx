import java.nio.ByteBuffer;

class cYW extends cCH
{
  cYW(Ff paramFf, int paramInt)
  {
    super(paramInt);
  }
  public void a(ByteBuffer paramByteBuffer, int paramInt) { Ff.a(this.kMP).ac(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
    this.kMP.aSg = paramByteBuffer.getInt();
    this.kMP.bMx = paramByteBuffer.getInt();
    this.kMP.bMw = paramByteBuffer.getInt();
    this.kMP.initialize(); }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}