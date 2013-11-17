import java.nio.ByteBuffer;

class wl extends cCH
{
  wl(dNV paramdNV)
  {
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;

    if (i != 0)
      dNV.a(this.bmb, dQa.aV(paramByteBuffer));
    else {
      dNV.a(this.bmb, null);
    }
    this.bmb.aEJ().initialize();
  }

  public void b(ByteBuffer paramByteBuffer) {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de sérialisation");
  }
}