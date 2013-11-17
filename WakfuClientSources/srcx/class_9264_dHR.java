import java.nio.ByteBuffer;

class dHR extends cCH
{
  dHR(bC parambC, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => client par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bC.a(this.lSH, paramByteBuffer.getShort());
    boolean bool = paramByteBuffer.get() == 1;
    this.lSH.setVisible(bool);
    this.lSH.ev(bool);
  }
}