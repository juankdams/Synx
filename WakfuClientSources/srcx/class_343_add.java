import java.nio.ByteBuffer;

class add extends cCH
{
  add(cMb paramcMb)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.cID.x(paramByteBuffer.getShort());
    this.cID.setVisible(paramByteBuffer.get() == 1);
    this.cID.setUsable(paramByteBuffer.get() == 1);
    this.cID.ev(paramByteBuffer.get() == 1);
    this.cID.eu(paramByteBuffer.get() == 1);
    this.cID.cA(paramByteBuffer.get());
    int i = paramByteBuffer.getInt();
    for (int j = 0; j < i; j++)
      this.cID.a(dLq.fO(paramByteBuffer.get()));
  }
}