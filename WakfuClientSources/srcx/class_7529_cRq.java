import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class cRq extends cCH
{
  cRq(czr paramczr)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    czr.a(this.kDF, paramByteBuffer.getShort());
    int i = paramByteBuffer.getInt();
    int j = paramByteBuffer.getInt();
    short s = paramByteBuffer.getShort();
    czr.a(this.kDF).ac(i, j, s);
    czr.a(this.kDF, paramByteBuffer.get() == 1);
    bsQ localbsQ = new bsQ();
    if (localbsQ.h(paramByteBuffer)) {
      czr.a(this.kDF, new dwN());
      if (!czr.b(this.kDF).a(localbsQ))
        K.error("Impossible de récupérer les données du RawDimensionalBag pour le sac id=" + this.kDF.getId());
    } else {
      K.error("Impossible de désérialiser le RawDimensionalBag pour le sac id=" + this.kDF.getId());
    }

    if (((czr.c(this.kDF) == 2) || (czr.d(this.kDF) == 1)) && (this.kDF.kqX == 0)) {
      czr.e(this.kDF);
    }

    this.kDF.kqX = czr.f(this.kDF);

    czr.g(this.kDF);
  }
}