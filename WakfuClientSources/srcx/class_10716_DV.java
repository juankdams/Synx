public final class DV extends dte
{
  private final long bIG;

  public DV(long paramLong)
  {
    this.bIG = paramLong;
  }

  public boolean isValid() {
    return this.bIG > 0L;
  }

  public void execute() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)117);
    localaIG.dU(this.bIG);
    localcyx.d(localaIG);

    dLE.doY().a(byv.bFN().bFO(), byv.bFN().bFO().getFields());
  }
}