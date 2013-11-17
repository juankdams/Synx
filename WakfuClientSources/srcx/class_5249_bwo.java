import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

final class bwo extends Mo
{
  private final chg ggN;

  private bwo(byz parambyz, chg paramchg)
  {
    this.ggN = paramchg;
    this.ggN.ao().a(this);
  }

  public void aS() {
    byz.bHu().error("Les breed specifics ne devraient pas ?tre s?rialis?s par le client.");
  }

  public void aT() {
    if (this.ggN.aE != null) {
      QT localQT = new QT();
      this.iZ.a(localQT);
      Object localObject;
      Iterator localIterator;
      if (localQT.b(this.ggN.aE.ffF))
      {
        for (byte b = 0; b < localQT.aad(); b = (byte)(b + 1)) {
          localObject = ((QT)byz.n(this.iZ).awq()).aj(b);

          if ((localObject != null) && ((((csi)localObject).getName() == null) || (((csi)localObject).getName().length() == 0))) {
            String str = bU.fH().b(7, ((csi)localObject).Rw(), new Object[0]);

            ((csi)localObject).setName(str);
            alc localalc = new alc();
            localalc.bc(b);
            localalc.eK(str);
            byv.bFN().aJK().d(localalc);
          }
        }
        dLE.doY().a(ceR.chM(), ceR.bF);

        for (localIterator = byz.o(this.iZ).iterator(); localIterator.hasNext(); ) { localObject = (azg)localIterator.next();
          ((azg)localObject).D(this.iZ); }
      }
      else {
        byz.bHv().error("Erreur lors de la r?cup?ration du symbiote d?s?rialis?");
      }
    }
  }
}