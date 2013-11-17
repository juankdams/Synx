import java.nio.ByteBuffer;

class dpS extends cCH
{
  dpS(sm paramsm)
  {
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      sm.a(this.lqO, dpE.aL(paramByteBuffer));
    }

    this.lqO.aEI();
    if (i != 0) {
      fs.a(Yp.cIQ, sm.a(this.lqO).bP(), new H(this));
    }

    this.lqO.aEJ().initialize();
  }

  public void b(ByteBuffer paramByteBuffer) {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}