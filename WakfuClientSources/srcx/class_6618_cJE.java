public class cJE extends dte
{
  private short iHL;

  public cJE(short paramShort)
  {
    this.iHL = paramShort;
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

    byz localbyz = byv.bFN().bFO();
    try {
      dLB localdLB = bCc.bKN().cm(this.iHL);
      if (localdLB == null) {
        cth.cqP().err("L'id " + this.iHL + " ne correspond à aucun set.");
      } else {
        for (bVw localbVw : localdLB)
        {
          short s = 1;
          gA localgA = new gA(-1L);
          localgA.b(localbVw);
          localgA.l(s);

          aIG localaIG = new aIG();
          localaIG.bM((byte)3);
          localaIG.bf((short)14);

          localaIG.mH(localbVw.getId());
          localaIG.bg(s);
          localcyx.d(localaIG);
        }
        dLE.doY().a(localbyz, new String[] { "bags" });
      }
    } catch (Exception localException) {
      cth.cqP().err("Problème pour l'ajout d'un set dans le sac courant : " + localException);
    }
  }
}