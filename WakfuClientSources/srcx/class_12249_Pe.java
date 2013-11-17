import org.apache.log4j.Logger;

final class Pe extends dcW
{
  private static final Logger K = Logger.getLogger(Pe.class);

  public boolean a(dBj paramdBj) {
    int i = paramdBj.ep().bJ();
    ckT localckT = cjS.clP().vz(paramdBj.a());

    if (localckT == null) {
      K.warn("On reçoit une fin de combat exterieur sur un combat qu'on ne connait pas");
      return false;
    }
    localckT.LB().j(false, false);

    beC localbeC = new beC(paramdBj.bQX(), i, paramdBj.eo(), paramdBj.a());
    localbeC.l(paramdBj.deB());
    localbeC.m(paramdBj.deA());
    localbeC.n(paramdBj.deC());
    bnc.bxw().a(paramdBj.a(), localbeC);
    bnc.bxw().d(localckT);

    return false;
  }
}