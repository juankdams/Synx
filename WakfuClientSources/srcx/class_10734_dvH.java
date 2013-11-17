import java.nio.ByteBuffer;

class dvH extends cCH
{
  dvH(aTU paramaTU, int paramInt)
  {
    super(paramInt);
  }
  public void a(ByteBuffer paramByteBuffer, int paramInt) { aTU.a(this.lAV, new cYq(paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.getShort()));

    aTU.b(this.lAV, new cYq(paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.get(), paramByteBuffer.getShort()));

    aTU.a(this.lAV, paramByteBuffer.get() == 0); }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}