import java.util.Iterator;
import org.apache.log4j.Logger;

final class cIn
{
  private static final Logger K = Logger.getLogger(cIn.class);
  private final bKm gRm;
  private final bsS iDK = new bsS();

  cIn(bKm parambKm) {
    this.gRm = parambKm;
  }

  void cCq() {
    PX localPX = this.gRm.aeu();
    if (localPX == null) {
      return;
    }

    this.iDK.qK(12);

    int[] arrayOfInt = localPX.Vp();
    dtw localdtw = new dtw();

    this.gRm.ayK().px(12);
    for (int i = 0; i < arrayOfInt.length; i++) {
      a(localdtw, arrayOfInt[i]);
    }

    a(localdtw);
  }

  private void a(dtw paramdtw, int paramInt) {
    bBn localbBn = vd.QM().dh(paramInt);
    if (localbBn == null) {
      K.warn("L'item " + paramInt + " n'existe pas");
      return;
    }
    if (localbBn.bKk() > 0) {
      paramdtw.a(localbBn.bKk(), (byte)1, (byte)1);
    }
    Iterator localIterator = localbBn.bKh();
    if (!localIterator.hasNext()) {
      return;
    }

    a(paramInt, localIterator);
  }

  private void a(dtw paramdtw) {
    this.gRm.ayK().px(14);
    this.iDK.qK(14);
    xd localxd = paramdtw.cZM();
    while (localxd.hasNext()) {
      localxd.fl();
      dLB localdLB = bCc.bKN().cm(localxd.fm());
      if (localdLB != null)
      {
        bog localbog = localdLB.wK(localxd.Gh());
        if (localbog != null)
        {
          Iterator localIterator = localbog.iterator();
          a(localdLB.nc(), localIterator); } 
      }
    }
  }

  private void a(int paramInt, Iterator paramIterator) { this.iDK.ga(paramInt);
    bqk localbqk = this.iDK.bAZ();
    while (paramIterator.hasNext()) {
      dpI localdpI = (dpI)paramIterator.next();
      a(paramInt, localbqk, localdpI);
    } }

  private void a(int paramInt, bqk parambqk, dpI paramdpI)
  {
    if (a(parambqk, paramdpI)) {
      return;
    }

    if (p(paramdpI))
      K.warn("On a un HMI sur autre chose que sur un NullEffect sur un item " + paramInt);
  }

  private boolean a(bqk parambqk, dpI paramdpI)
  {
    bZA localbZA = paramdpI.bew();
    if ((localbZA != null) && (!localbZA.i(this.gRm, this.gRm, paramdpI, this.gRm.ayL()))) {
      return false;
    }

    if (paramdpI.eo() == bsj.fTb.getId()) {
      if (p(paramdpI)) {
        paramdpI.a(parambqk, this.gRm, this.gRm.bEY(), bsj.bAv(), this.gRm.fa(), this.gRm.fb(), this.gRm.fc(), this.gRm, null);
      }

      return true;
    }
    Object localObject;
    Iterator localIterator;
    dpI localdpI;
    if (paramdpI.eo() == bsj.fSd.getId()) {
      localObject = (bXU)cNO.cFX().yF((int)paramdpI.nl(0));
      if (localObject != null)
        for (localIterator = ((bXU)localObject).iterator(); localIterator.hasNext(); ) { localdpI = (dpI)localIterator.next();
          a(parambqk, localdpI);
        }
      else {
        K.error("etat inconnu:" + paramdpI.nl(0));
      }
      return true;
    }

    if (aBn.dVb.contains(paramdpI.eo())) {
      localObject = aww.cMI().zw(paramdpI.yR());
      if (localObject != null)
        for (localIterator = ((aLM)localObject).iterator(); localIterator.hasNext(); ) { localdpI = (dpI)localIterator.next();
          a(parambqk, localdpI);
        }
      else {
        K.error("Group d'effet inconnu:" + paramdpI.yR());
      }
      return true;
    }
    return false;
  }

  private boolean p(dpI paramdpI) {
    return (paramdpI.bey().hasNext()) || (paramdpI.bez().hasNext());
  }
}