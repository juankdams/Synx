import org.apache.log4j.Logger;

final class cUj extends dcW
{
  private static Logger K = Logger.getLogger(cUj.class);

  public boolean a(aWm paramaWm) {
    Su localSu = (Su)((arl)this.kLP).eu(paramaWm.AD());
    if (localSu == null) {
      K.error(paramaWm.getClass().getSimpleName() + " pour le fighter " + paramaWm.AD() + " qui n'est pas dans le combat");

      return false;
    }

    localSu.d(eu.azq).set(paramaWm.bmg());
    localSu.d(eu.ayM).set(paramaWm.bmf());
    localSu.d(eu.ayM).setMax(paramaWm.bmh());

    ((arl)this.kLP).aDp().AT();
    return false;
  }
}