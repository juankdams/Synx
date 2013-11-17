import org.apache.log4j.Logger;

final class cQq
{
  private static final Logger K = Logger.getLogger(cQq.class);

  private final PX kBo = new PX();
  private int kBp = 0;

  public int eB(byte paramByte) {
    return this.kBo.ap(paramByte);
  }

  public int cHm() {
    return this.kBp;
  }

  public void eC(byte paramByte) {
    this.kBo.b(paramByte, 1, 1);
  }

  public void aak() {
    this.kBp += 1;
  }

  public cgl jd(long paramLong) {
    cgl localcgl = new cgl();
    if (this.kBp == 0) {
      K.warn("[SYMBIOT] On cherche a recuperer l'xp des creatures d'un symbiote, mais le summoner a joué 0 tour");
      return localcgl;
    }
    jR localjR = this.kBo.abM();
    while (localjR.hasNext()) {
      localjR.fl();
      localcgl.j(localjR.rC(), paramLong * localjR.value() / this.kBp);
    }
    return localcgl;
  }

  public void reset() {
    this.kBo.clear();
    this.kBp = 0;
  }
}