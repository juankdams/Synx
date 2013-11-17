import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

final class aAW
  implements btE
{
  private static Logger K = Logger.getLogger(aAW.class);

  public void J(Su paramSu) {
    paramSu.aeL().cc(true);
  }

  public void ag(Su paramSu) {
    dAn.bD(paramSu);
  }

  public void a(ckT paramckT, cjK paramcjK) {
    dAn.d(paramckT, paramcjK);
  }

  public void b(ckT paramckT, cjK paramcjK) {
    bOX.bVM().r(paramcjK);
    bOX.bVM().o(paramcjK);
  }

  public void c(ckT paramckT, cjK paramcjK) {
    dAn.v(paramcjK);
  }

  public boolean aMI() {
    return true;
  }

  public boolean aMJ() {
    return true;
  }

  public void d(czN paramczN) {
    K.error("[Fight][View] On ne doit pas demander de regles de visualisation pour un combat externe en train d'etre créer");
  }

  public void c(ckT paramckT) {
    dAn.x(paramckT);
    dAn.v(paramckT);
    dAn.ddD();
    Collection localCollection = paramckT.bgG();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      localObject = (Su)localIterator.next();
      if (((Su)localObject).afk()) {
        ((Su)localObject).aeL().setVisible(false);
      } else {
        dAn.bD((Su)localObject);
        ((Su)localObject).aeL().dI(((Su)localObject).Fx());
        ((Su)localObject).aeL().j(((Su)localObject).E());
        ((Su)localObject).aeL().cc(true);
      }
    }
    Object localObject;
    for (localIterator = bVl.caZ().cbb(); localIterator.hasNext(); ) {
      localObject = (ob)localIterator.next();
      ((ob)localObject).setVisible((((ob)localObject).isVisible()) && (((ob)localObject).vK().isVisible()));
    }
    dAn.y(paramckT);
    if ((paramckT instanceof arl))
      ((arl)paramckT).cL(true);
  }
}