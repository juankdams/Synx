import org.apache.log4j.Logger;

abstract class pv extends csx
  implements bye
{
  public void run()
  {
    if (!pZ()) {
      return;
    }
    cMb localcMb = (cMb)this.dvI;

    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();

    if (((!localcMb.cFe()) && (localcMb.V(localcew.atB()))) || ((localcMb.cFe()) && (localcew.atB().Z(localcMb.fa(), localcMb.fb(), localcMb.fc()))))
    {
      wR();
    } else {
      cuB localcuB = Rl.a(localcew, localcMb);
      if (localcuB.csX()) {
        localcew.b(this);
        localbyz.a(localcuB, true);
      } else {
        K.warn("Impossible de trouver un chemin jusqu'a l'element interactif " + this.dvI);
      }
    }
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    wR();
  }

  protected abstract void wR();
}