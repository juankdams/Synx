public class bvb extends dte
{
  private final int cGS;
  private final short aFe;

  public bvb(int paramInt, short paramShort)
  {
    this.cGS = paramInt;
    this.aFe = paramShort;
  }

  public boolean isValid()
  {
    return this.aFe > 0;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    byz localbyz = byv.bFN().bFO();

    cRs localcRs = null;
    try {
      gA localgA = null;
      bBn localbBn = Hh.QM().dh(this.cGS);

      if (localbBn != null) {
        localgA = new gA(-1L);
        localgA.b(localbBn);
        localgA.l(this.aFe);
        localcRs = localbyz.bGP().ao(localgA);
        aIG localaIG = new aIG();
        localaIG.bM((byte)3);
        localaIG.bf((short)14);

        localaIG.mH(this.cGS);
        localaIG.bg(this.aFe);
        localcyx.d(localaIG);
      } else {
        cth.cqP().err("ReferenceItem d'Id " + this.cGS + " non trouvée. Peut-être un problème d'export ?");
      }
    } catch (Exception localException) {
      cth.cqP().err("Problème pour l'ajout d'un item dans le sac courant : " + localException);
    }
  }
}