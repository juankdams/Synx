public class cqC extends dte
{
  private final int cAK;
  private final String Tl;

  public cqC(int paramInt, String paramString)
  {
    this.cAK = paramInt;
    this.Tl = paramString;
  }

  public boolean isValid()
  {
    return (this.Tl != null) && (this.cAK >= 0);
  }

  public void execute()
  {
    int i = (2 * this.cAK + 1) * (2 * this.cAK + 1);
    cKX localcKX = cBQ.cxL().a("<b>Attention !\n\nVous êtes sur le point d'envoyer un message à tous des joueurs se trouvant sur un total d'environ " + i + " partitions, êtes vous sûr ?\n\nMessage :</b>\n" + this.Tl, Cn.et(0), 2073L, 102, 1);

    if (localcKX != null)
      localcKX.a(new pd(this));
  }

  private void mO()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)54);
    localaIG.mH(this.cAK);
    localaIG.gC(this.Tl);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}