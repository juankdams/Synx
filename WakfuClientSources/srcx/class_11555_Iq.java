import java.nio.ByteBuffer;

class Iq extends cCH
{
  Iq(chz paramchz, int paramInt)
  {
    super(paramInt);
  }
  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    chz.a(this.bQZ).ac(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
    int i = chz.b(this.bQZ);
    chz.a(this.bQZ, paramByteBuffer.getInt());
    chz.b(this.bQZ, paramByteBuffer.getInt());
    chz.c(this.bQZ, paramByteBuffer.getInt());
    if (chz.c(this.bQZ) == -1)
      this.bQZ.D(false);
    else {
      this.bQZ.D(true);
    }
    if (i != chz.b(this.bQZ)) {
      this.bQZ.initialize();
    }
    this.bQZ.sM();
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}