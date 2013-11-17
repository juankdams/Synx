import org.apache.log4j.Logger;

public class atY
  implements cVH
{
  private static final Logger K = Logger.getLogger(atY.class);
  public static final atY dFW = new atY();

  public float a(cVE paramcVE)
  {
    return paramcVE.kIb;
  }

  public void a(cVE paramcVE, float paramFloat) {
  }

  public int c(dkl paramdkl, cVE paramcVE, int paramInt) {
    return bCO.bC(paramInt * a(paramcVE));
  }

  public void a(cVE paramcVE, int paramInt) {
    K.info("[TAX] Récupération de " + paramInt + " kamas pour le context " + paramcVE);
  }

  public boolean a(dkl paramdkl) {
    if (!(paramdkl instanceof byz)) {
      return false;
    }
    short s = ((byz)paramdkl).Lk();
    if (ars.dzL.aL(s) != null) {
      return false;
    }
    return (bWW.ccf().FB() == null) && (bWW.ccf().cch() == null);
  }
}