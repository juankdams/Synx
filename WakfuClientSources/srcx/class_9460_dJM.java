import java.util.Iterator;

class dJM
  implements dFU
{
  public boolean a(aaT paramaaT)
  {
    long l = paramaaT.anE();
    byz localbyz = byv.bFN().bFO();
    gA localgA = localbyz.gk(l);

    aCu localaCu = new aCu(localgA);
    for (Iterator localIterator = paramaaT.anF(); localIterator.hasNext(); ) {
      ((dMx)localIterator.next()).a(localaCu);
    }
    return false;
  }

  public int vN() {
    return 15982;
  }
}