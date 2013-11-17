import org.apache.log4j.Logger;

public class pF extends dte
{
  protected static Logger K = Logger.getLogger(pF.class);

  public boolean isValid() {
    return true;
  }

  public void execute() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    a(localcyx);
  }

  private void a(cyx paramcyx)
  {
    bpS localbpS = new bpS();
    localbpS.g(591892L);
    localbpS.bA(0L);
    paramcyx.d(localbpS);
  }

  private void b(cyx paramcyx) {
    cyP localcyP = new cyP();
    localcyP.dN(0L);
    paramcyx.d(localcyP);
  }

  private void c(cyx paramcyx) {
    aBH localaBH = new aBH();
    localaBH.dN(5L);
    paramcyx.d(localaBH);
  }
}