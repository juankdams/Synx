import java.nio.ByteBuffer;

class dnR extends cCH
{
  dnR(PU paramPU)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    int i = paramByteBuffer.getInt();
    int j = paramByteBuffer.getInt();
    short s = paramByteBuffer.getShort();
    PU.a(this.loe).ac(i, j, s);
    this.loe.c(CG.eu(paramByteBuffer.get()));
    PU.a(this.loe, paramByteBuffer.getLong());
    this.loe.R(paramByteBuffer);
  }
}