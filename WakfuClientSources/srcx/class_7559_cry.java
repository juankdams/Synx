public class cry extends acS
  implements ZF
{
  private static final String fwK = "MovementInformationRangeEffect";

  public cry()
  {
    super("MovementInformationRangeEffect", clP.hPb, null, null, null, null, null, null, null, null);
  }

  public boolean aT(Su paramSu) {
    if ((paramSu != null) && (!paramSu.afk()) && (!paramSu.i(cfY.hCt))) {
      E(paramSu);
      cjh localcjh = paramSu.afh();
      if (localcjh != null)
        localcjh.a(paramSu, this.cTf, this.cTh, this.cTg);
      return true;
    }
    return false;
  }

  protected dif a(cYk paramcYk, Su paramSu)
  {
    if (paramSu == null) {
      return dif.ldO;
    }
    cYk localcYk = paramSu.ML();
    int i = Math.abs(localcYk.getX() - paramcYk.getX()) + Math.abs(localcYk.getY() - paramcYk.getY());

    if (paramSu.c(cfY.hCg)) {
      paramSu = paramSu.adL();
      if (paramSu == null) {
        return dif.ldO;
      }
    }
    if ((paramSu.c(cfY.hBd)) || (paramSu.c(cfY.hCI))) {
      return dif.ldO;
    }
    int j = paramSu.e(eu.ayO);

    if (paramSu.c(cfY.hBI))
      j /= 2;
    if (paramSu.c(cfY.hBH)) {
      j /= 2;
    }
    if (i > j) {
      return dif.ldO;
    }

    if (Math.abs(localcYk.IB() - paramcYk.IB()) > paramSu.arG()) {
      return dif.ldK;
    }
    return dif.ldK;
  }

  public void update()
  {
  }
}