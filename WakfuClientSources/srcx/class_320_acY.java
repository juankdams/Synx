class acY extends dte
{
  private final long Tj;

  acY(long paramLong)
  {
    this.Tj = paramLong;
  }

  public boolean isValid()
  {
    return this.Tj > 0L;
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
    localaIG.bf((short)85);
    localaIG.mH((int)this.Tj);
    localcyx.d(localaIG);
  }

  public String toString()
  {
    return "Activate{m_groupId=" + this.Tj + '}';
  }
}