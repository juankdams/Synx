import org.apache.log4j.Logger;

final class qp extends dcW
{
  private static Logger K = Logger.getLogger(qp.class);

  public boolean a(dNu paramdNu) {
    int i = paramdNu.ep().bJ();

    uY localuY = (uY)bsj.bAv().kD(paramdNu.Vc());
    if (localuY == null) {
      K.error("Impossible d'instancier un runningEffect :" + paramdNu.Vc() + " inconnu");
      return false;
    }

    afF localafF = new afF(paramdNu.bQX(), i, paramdNu.a(), paramdNu.eo(), localuY, paramdNu.Vd());
    localafF.ua(paramdNu.czG());
    bnc.bxw().a(paramdNu.a(), localafF);

    return false;
  }
}