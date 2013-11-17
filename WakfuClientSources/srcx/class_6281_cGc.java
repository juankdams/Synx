import java.nio.ByteBuffer;

class cGc extends cCH
{
  cGc(rb paramrb)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    aBi localaBi = new aBi();
    localaBi.h(paramByteBuffer);
    int i = rb.b(this.iBo);
    rb.a(this.iBo, localaBi.dUY);
    this.iBo.G(i, rb.b(this.iBo));
  }
}