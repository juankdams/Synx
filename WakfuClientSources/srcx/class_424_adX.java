import java.util.ArrayList;

public class adX extends cHS
{
  public static boolean a(cYk paramcYk, dUx paramdUx)
  {
    if (!paramdUx.mrX) {
      return false;
    }
    dJN localdJN = (dJN)cPV.cGZ().es(paramcYk.getX(), paramcYk.getY());
    if (localdJN == null) {
      return false;
    }
    if (localdJN.ak(paramcYk.getX(), paramcYk.getY(), paramcYk.IB())) {
      return false;
    }
    azX localazX = acL.apd().aP(paramcYk.getX(), paramcYk.getY());
    if ((localazX != null) && (localazX.aLV().aeH())) {
      return false;
    }

    boolean bool = localdJN.bsn();
    ArrayList localArrayList = ayg.aJQ().aJS();
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      if (!a(paramcYk, (aZK)localArrayList.get(i), bool))
        return false;
    }
    return true;
  }
}