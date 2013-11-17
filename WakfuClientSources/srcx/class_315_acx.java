public class acx extends dte
{
  private final int cAK;
  private final int RZ;
  private final short cSq;
  private final bBn cSr;

  public acx(int paramInt1, int paramInt2, short paramShort)
  {
    this.cAK = paramInt1;
    this.RZ = paramInt2;
    this.cSq = paramShort;
    this.cSr = vd.QM().dh(this.RZ);
  }

  public boolean isValid()
  {
    return (this.cAK >= 0) && (this.RZ > 0) && (this.cSq >= 1);
  }

  public void execute()
  {
    int i = (2 * this.cAK + 1) * (2 * this.cAK + 1);
    String str = this.cSr != null ? this.cSr.getName() : "!Item Not Found!";
    cKX localcKX = cBQ.cxL().a("<b>Attention !\n\nVous êtes sur le point de distribuer un objet à tous des joueurs se trouvant sur un total d'environ " + i + " partitions, êtes vous sûr ?\n\nObjet distribué :</b>\n" + this.cSq + "x " + str + " [id:" + this.RZ + "]", Cn.et(0), 2073L, 102, 1);

    if (localcKX != null)
      localcKX.a(new cQr(this));
  }

  private void mO()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)55);
    localaIG.mH(this.cAK);
    localaIG.mH(this.RZ);
    localaIG.bg(this.cSq);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}