import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

class aMH extends cCH
{
  aMH(aSu paramaSu)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de sérialisation");
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    byz localbyz = byv.bFN().bFO();

    aSu.a(this.esc).setX(paramByteBuffer.getInt());
    aSu.b(this.esc).setY(paramByteBuffer.getInt());
    aSu.c(this.esc).dG(paramByteBuffer.getShort());

    int i = 0;
    Object localObject1;
    Object localObject2;
    for (int j = paramByteBuffer.get() - 1; j >= 0; j--) {
      int k = paramByteBuffer.getInt();
      byte[] arrayOfByte = new byte[k];
      paramByteBuffer.get(arrayOfByte);
      localObject1 = new bls();
      ((bls)localObject1).C(arrayOfByte);
      if (!aSu.d(this.esc).contains(Long.valueOf(((bls)localObject1).getId())))
      {
        ((bls)localObject1).f(this.esc);

        dLf.djM().f((bls)localObject1);
        aSu.e(this.esc).add(localObject1);
        aSu.d(this.esc).add(Long.valueOf(((bls)localObject1).getId()));
        localObject2 = localbyz.bGv();
        i = (i != 0) || ((((bls)localObject1).aeR() != -1) && (localObject2 != null) && (((arl)localObject2).getId() == ((bls)localObject1).aeR())) ? 1 : 0;

        if (i != 0) {
          ((bls)localObject1).setVisible(false);
          localArrayList.add(localObject1);
          this.esc.wk(((arl)localObject2).getId());
        } else {
          this.esc.wk(-1);
        }
      }
    }
    for (j = paramByteBuffer.get() - 1; j >= 0; j--) {
      long l = paramByteBuffer.getLong();
      localObject1 = aSu.e(this.esc).iterator();
      while (((Iterator)localObject1).hasNext()) {
        localObject2 = (bls)((Iterator)localObject1).next();
        if (((bls)localObject2).getId() == l) {
          ((Iterator)localObject1).remove();
          aSu.d(this.esc).remove(Long.valueOf(((bls)localObject2).getId()));
        }
      }
    }

    this.esc.initialize();

    if (!localArrayList.isEmpty()) {
      j = dPD.mhq.bJ();
      if (i != 0) {
        aOY localaOY = new aOY(dqt.cXz(), j, 0, localbyz.bGv().getId(), localArrayList);
        bnc.bxw().a(localbyz.bGv(), localaOY);
      }
    }

    if (aSu.e(this.esc).size() <= 0)
      ayg.aJQ().e(this.esc);
  }
}