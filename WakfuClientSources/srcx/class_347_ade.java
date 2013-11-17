import java.nio.ByteBuffer;
import java.util.HashSet;
import org.apache.log4j.Logger;

class ade extends cCH
{
  ade(cMb paramcMb)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("Les éléments interactifs client ne peuvent pas être sérialisés");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    K.trace("Décodage des données spécifiques (len=" + paramByteBuffer.remaining() + ")");
    if (paramByteBuffer.remaining() < 1) {
      K.error("Impossible de désérialiser un élément interactif vide");
      return;
    }

    if (paramByteBuffer.remaining() < 23) {
      K.error("Taille de données restantes dans le buffer invalide : " + paramByteBuffer.remaining());
      return;
    }
    cMb.a(this.cID, paramByteBuffer.getShort());
    cMb.c(this.cID).setX(paramByteBuffer.getInt());
    cMb.d(this.cID).setY(paramByteBuffer.getInt());
    cMb.e(this.cID).dG(paramByteBuffer.getShort());
    cMb.b(this.cID, paramByteBuffer.getShort());
    this.cID.setVisible(paramByteBuffer.get() != 0);
    cMb.a(this.cID, paramByteBuffer.get() != 0);
    this.cID.c(CG.eu(paramByteBuffer.get()));
    cMb.c(this.cID, paramByteBuffer.getShort());

    int i = paramByteBuffer.getShort();
    for (int j = i - 1; j >= 0; j--) {
      cYk localcYk = new cYk();
      localcYk.setX(paramByteBuffer.getInt());
      localcYk.setY(paramByteBuffer.getInt());
      localcYk.dG(paramByteBuffer.getShort());
      cMb.f(this.cID).add(localcYk);
    }

    byte[] arrayOfByte = new byte[paramByteBuffer.getShort() & 0xFFFF];
    paramByteBuffer.get(arrayOfByte);
    cMb.a(this.cID, dzp.aJ(arrayOfByte));

    this.cID.i(dLq.aP(paramByteBuffer));

    paramByteBuffer.getInt();

    this.cID.al();
    this.cID.cFd();

    if (paramByteBuffer.remaining() > 0)
      K.error("Il reste des données non traitées dans le buffer : " + paramByteBuffer.remaining());
  }
}