import org.apache.log4j.Logger;

final class Rg extends dcW
{
  private static Logger K = Logger.getLogger(Rg.class);

  public boolean a(KD paramKD) {
    int i = paramKD.ep().bJ();
    uY localuY = (uY)bsj.bAv().kD(paramKD.Vc());
    if (localuY == null) {
      K.error("Impossible d'instancier un runningEffect :" + paramKD.Vc() + " inconnu");
      return false;
    }

    aRo localaRo = new aRo(paramKD.bQX(), i, paramKD.a(), paramKD.eo(), localuY, paramKD.Ve(), paramKD.gA(), paramKD.Vd());
    localaRo.ua(paramKD.czG());
    bnc.bxw().a(paramKD.a(), localaRo);

    return false;
  }
}