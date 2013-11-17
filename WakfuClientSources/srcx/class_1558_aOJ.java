public class aOJ extends dte
{
  private final int cGS;
  private final short aFe;

  public aOJ(int paramInt, short paramShort)
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

    Object localObject1 = null;
    try {
      Object localObject2 = null;
      bBn localbBn = Hh.QM().dh(this.cGS);

      if (localbBn != null) {
        aIG localaIG = new aIG();
        localaIG.bM((byte)3);
        localaIG.bf((short)159);
        localaIG.mH(this.cGS);
        localaIG.bg(this.aFe);
        localcyx.d(localaIG);
      } else {
        cth.cqP().err("ReferenceItem d'Id " + this.cGS + " non trouvée. Peut-être un problème d'export ?");
      }
    } catch (Exception localException) {
      cth.cqP().err("Problème pour la suppression d'un item : " + localException);
    }
  }
}