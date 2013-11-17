import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.List;

public final class bwX
{
  public static dzC k(bKm parambKm)
  {
    SB localSB = parambKm.aii();
    cYk localcYk = bYZ.a(WakfuClientInstance.awy().Dg(), axB.dyx, axB.dyy, false);
    if ((localSB == SB.ctE) && (a(parambKm, parambKm.ML())) && (a(parambKm, localcYk))) {
      return dzC.lGp;
    }
    return dzC.lGo;
  }

  private static boolean a(bKm parambKm, cYk paramcYk) {
    arl localarl = parambKm.aeQ();
    if (localarl == null) {
      return false;
    }
    aJD localaJD = localarl.LC();
    List localList = localaJD.w(paramcYk);
    for (cjK localcjK : localList) {
      if (localcjK.axG() == parambKm)
      {
        if (localcjK.getType() == xj.bpk.xj())
          return true;
      }
    }
    return false;
  }
}