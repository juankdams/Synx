import org.apache.log4j.Logger;

public class cjS
{
  protected static final Logger K = Logger.getLogger(cjS.class);

  private static final cjS hKc = new cjS();

  protected final cSR hKd = new cSR();

  public static cjS clP() {
    return hKc;
  }

  public arl a(int paramInt1, int paramInt2, UG paramUG, cpy paramcpy)
  {
    if (paramInt2 == -1) {
      throw new IllegalArgumentException("fightId = FightConstants.NO_FIGHT_ID - On doit toujours passer l'id du fight sur le client.");
    }
    dTw localdTw = dTw.DY(paramInt1);
    arl localarl = new arl(paramInt2, localdTw, paramUG, paramcpy);
    l(localarl);
    return localarl;
  }

  public arl a(int paramInt1, int paramInt2, UG paramUG, cpy paramcpy, byte paramByte)
  {
    if (paramInt2 == -1) {
      throw new IllegalArgumentException("fightId = FightConstants.NO_FIGHT_ID - On doit toujours passer l'id du fight sur le client.");
    }
    dTw localdTw = dTw.DY(paramInt1);
    dzm localdzm = dzm.fF(paramByte);
    arl localarl = new arl(paramInt2, localdTw, paramUG, paramcpy, localdzm);
    l(localarl);
    return localarl;
  }

  private void l(arl paramarl) {
    g(paramarl);
    paramarl.bgX();
  }

  public void g(ckT paramckT) {
    if (this.hKd.contains(paramckT.getId())) {
      K.error("On ajoute un fight (class=" + paramckT.getClass().getSimpleName() + " id=" + paramckT.getId() + ") alors qu'un fight existe dÃ©jÃ  avec cet id (class=" + ((ckT)this.hKd.get(paramckT.getId())).getClass().getSimpleName() + ") : leaks possibles");
    }

    this.hKd.put(paramckT.getId(), paramckT);
  }

  public void h(ckT paramckT) {
    if (paramckT == null)
      return;
    this.hKd.remove(paramckT.getId());
    if ((paramckT instanceof czN)) {
      czN localczN = (czN)paramckT;
      localczN.cwJ();
    }
  }

  public ckT vz(int paramInt) {
    return (ckT)this.hKd.get(paramInt);
  }

  public dmn clQ() {
    return this.hKd.yF();
  }

  public void clear() {
    this.hKd.clear();
  }

  public void cleanUp()
  {
    dmn localdmn = clQ();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ckT localckT = (ckT)localdmn.value();
      if ((localckT instanceof arl)) {
        ((arl)localckT).aDE();
        localdmn = clQ();
      } else {
        localdmn.remove();
      }
      bnc.bxw().qm(localckT.getId());
    }
  }

  public ckT dy(int paramInt1, int paramInt2)
  {
    dmn localdmn = clQ();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ckT localckT = (ckT)localdmn.value();
      if (localckT.LB().aq(paramInt1, paramInt2)) {
        return localckT;
      }
    }

    return null;
  }

  public boolean dz(int paramInt1, int paramInt2) {
    return dy(paramInt1, paramInt2) != null;
  }

  public void vA(int paramInt) {
    ckT localckT = (ckT)this.hKd.get(paramInt);
    h(localckT);
  }
}