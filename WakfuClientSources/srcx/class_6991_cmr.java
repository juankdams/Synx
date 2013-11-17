public class cmr extends dte
{
  private final Short hRj;
  private final byte gmZ;
  private final int bla;

  public cmr()
  {
    this(Short.valueOf((short)-1));
  }

  public cmr(Short paramShort) {
    this.hRj = paramShort;
    this.gmZ = -1;
    this.bla = -1;
  }

  public cmr(Short paramShort, byte paramByte) {
    this.gmZ = paramByte;
    this.hRj = paramShort;
    this.bla = -1;
  }

  public cmr(Short paramShort, int paramInt) {
    this.hRj = paramShort;
    this.bla = paramInt;
    this.gmZ = -1;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)60);
    localaIG.bg(this.hRj.shortValue());
    localaIG.bN(this.gmZ);
    localaIG.mH(this.bla);
    localcyx.d(localaIG);

    dLE.doY().a(byv.bFN().bFO(), byv.bFN().bFO().getFields());
  }
}