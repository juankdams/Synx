import org.apache.log4j.Logger;

public class NB
{
  private static final Logger K = Logger.getLogger(NB.class);
  public static final NB cdZ = new NB();

  private cSR bal = new cSR();

  public void a(bFp parambFp) {
    this.bal.put(parambFp.getId(), parambFp);
  }

  public void a(se paramse) {
    for (dmn localdmn = this.bal.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      paramse.a(new cjD((bFp)localdmn.value()));
    }
  }

  public void a(djv paramdjv, int paramInt) {
    paramdjv.bFZ().cK(paramInt);
  }

  public void b(djv paramdjv, int paramInt) {
    paramdjv.bFZ().cL(paramInt);
  }

  public boolean cF(int paramInt) {
    bFp localbFp = (bFp)this.bal.get(paramInt);
    if (localbFp == null) {
      K.warn("[LOCK] On essaye de récupérer l'état d'un verrou inexistant id=" + paramInt, new Exception());
      return false;
    }

    if (localbFp.tw().avJ()) {
      return false;
    }

    dxL localdxL = dDE.dft().VN();
    return localdxL.Q(localbFp.tw());
  }

  public int fZ(int paramInt) {
    for (dmn localdmn = this.bal.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      bFp localbFp = (bFp)localdmn.value();
      if (localbFp.ts() == paramInt) {
        return localbFp.getId();
      }
    }

    return -1;
  }
}