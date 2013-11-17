import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class dVL
{
  public static void b(aKm paramaKm)
  {
    byz localbyz = byv.bFN().bFO();
    localbyz.q(false, false);
    cjS.clP().vA(paramaKm.a());

    arl localarl = c(paramaKm);

    localbyz.i(localarl);

    dmM.cUe().AL(localarl.getId());
    dmM.cUe().cUl();

    cDr();

    localarl.aDq();
    localarl.start();

    n(localarl);

    aMN.bdO().f(localarl);
    cDq();

    aWc.blo().g(localarl);
    aWc.blo().blK();
  }

  private static arl c(aKm paramaKm) {
    bWM localbWM = new bWM();
    new alf(localbWM).U(ByteBuffer.wrap(paramaKm.Ro()));
    arl localarl = cjS.clP().a(paramaKm.Rp(), paramaKm.a(), localbWM, paramaKm.Rv(), paramaKm.bbz());
    qv localqv = new qv();
    localqv.a(paramaKm, localarl);
    return localarl;
  }

  private static void cDq() {
    List localList = dvx();
    for (int i = 0; i < localList.size(); i++) {
      cvW localcvW = (cvW)localList.get(i);
      byv.bFN().a(localcvW);
    }
  }

  private static void cDr() {
    byv.bFN().b(aDI.aPQ());
    List localList = dvw();
    for (int i = 0; i < localList.size(); i++) {
      cvW localcvW = (cvW)localList.get(i);
      byv.bFN().b(localcvW);
    }
  }

  private static void n(arl paramarl) {
    dLE.doY().t("fight", paramarl);
    dLE.doY().t("fight.timeline", paramarl.aDp());
    dLE.doY().t("isInFightCreationOrPlacement", Boolean.valueOf(true));
    dLE.doY().t("isFightSpectator", Boolean.valueOf(true));
  }

  public static List dvw() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(dME.dpt());
    return localArrayList;
  }

  public static List dvx() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(aKj.bbx());
    localArrayList.add(aMN.bdO());
    return localArrayList;
  }
}