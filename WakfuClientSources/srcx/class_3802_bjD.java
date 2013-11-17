import java.nio.ByteBuffer;
import java.util.ArrayList;

class bjD extends cCH
{
  bjD(aEq paramaEq)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    aWJ localaWJ = new aWJ();
    localaWJ.h(paramByteBuffer);

    ArrayList localArrayList = localaWJ.fbM;
    aEq.a(this.fAb, new int[localArrayList.size()]);

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      aEq.a(this.fAb)[i] = ((azt)localArrayList.get(i)).dQG;
    }

    this.fAb.aQB();
  }
}