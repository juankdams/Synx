import org.apache.log4j.Logger;

public class DN extends dX
{
  private static final Logger K = Logger.getLogger(DN.class);

  public DN(aYr paramaYr) {
    super(paramaYr);
    a(jF.aMl);
  }

  public void d(cTK paramcTK) {
    f(paramcTK);
  }

  public void p(long paramLong) {
    Su localSu = CA.Lv().bj(paramLong);
    if (localSu == null) {
      K.error("[NATION] On demande l'ajout du character d'id " + paramLong + " à la nation " + UI() + " mais il n'y a aucun personnage avec cet id");
      return;
    }
    f(localSu);
  }
}