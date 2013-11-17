import org.apache.log4j.Logger;

public class dqF
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dqF.class);

  private static dqF lti = new dqF();
  private bNs ltj;
  private boolean ltk;
  private bnm N;

  public static dqF cXV()
  {
    return lti;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.N = new dAR(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().j("wakfu.collectMachine", bno.class);

      this.ltk = true;
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().mN("wakfu.collectMachine");

      cBQ.cxL().b(this.N);

      if (byv.bFN().c(dGW.dhM())) {
        dGW.dhM().dhP();
      }

      if (cBQ.cxL().mZ("freeCollectMachineDialog")) {
        cBQ.cxL().mW("freeCollectMachineDialog");
      }
      if (cBQ.cxL().mZ("lockedCollectMachineDialog")) {
        cBQ.cxL().mW("lockedCollectMachineDialog");
      }

      dLE.doY().removeProperty("collectMachine");
    }
  }

  public void a(cUQ paramcUQ) {
    if (paramcUQ == null) {
      K.error("on tent d'afficher une provider null");
      return;
    }
    String str;
    if (paramcUQ.bPi().abS()) {
      this.ltj = new Gx(paramcUQ);
      str = "lockedCollectMachineDialog";
    } else {
      this.ltj = new dhT(paramcUQ);
      str = "freeCollectMachineDialog";
    }
    dLE.doY().t("collectMachine", this.ltj);

    dGW.dhM().dhN();

    if (!cBQ.cxL().mZ(str)) {
      bpn localbpn = (bpn)cBQ.cxL().a(str, VV.dJ(str), 17L, (short)10000);

      if (localbpn == null)
        K.error("Impossible de récupérer la fenêtre de réceptacle !!! loaded=" + cBQ.cxL().mZ(str));
      else {
        dGW.dhM().j(localbpn);
      }

      byv.bFN().a(this);
    }
  }

  public bNs cXW() {
    return this.ltj;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject3;
    Object localObject2;
    int i;
    switch (paramcWG.getId()) {
    case 19322:
      localObject1 = (aie)paramcWG;
      int j = ((aie)localObject1).getIntValue();
      localObject3 = ((aie)localObject1).avf();
      int k = ((cZZ)localObject3).tb();

      if ((j > k) || (j == -1)) {
        j = k;
      }
      ((cZZ)localObject3).ht(j);
      dLE.doY().a((dBv)localObject3, new String[] { "currentPlayerQuantity", "canMax", "valid" });
      return false;
    case 19323:
      localObject1 = (aie)paramcWG;
      localObject2 = ((aie)localObject1).avf();
      localObject3 = new dFu();
      dTW localdTW = (dTW)byv.bFN().bFO().bSe();
      if ((localObject2 instanceof lK)) {
        ((dFu)localObject3).fg(((lK)localObject2).tc(), ((cZZ)localObject2).akG());
        localdTW.a((dFu)localObject3, 0);
      } else {
        localdTW.a((dFu)localObject3, this.ltj.Qt());
      }

      return false;
    case 19320:
      localObject1 = (czW)paramcWG;
      localObject2 = new axb(((czW)localObject1).ah(), ((czW)localObject1).ag());
      b((auY)localObject2);
      return false;
    case 19321:
      localObject1 = (czW)paramcWG;

      long l = ((czW)localObject1).getDestinationUniqueId();
      b(new cjz(((czW)localObject1).getItem().oj(), ((czW)localObject1).nP(), l, ((czW)localObject1).getDestinationPosition()));

      bno.setDraggedItemId(-1L);
      return false;
    case 19324:
      i = ((bzu)paramcWG).getIntValue();
      if (i == 0) {
        return false;
      }
      b(new aln(i));
      return false;
    case 19325:
      i = ((bzu)paramcWG).getIntValue();
      if (i == 0) {
        return false;
      }
      b(new mx(i));
      return false;
    }

    return true;
  }

  private static void b(auY paramauY) {
    VA localVA = new VA(paramauY);
    byv.bFN().aJK().d(localVA);
  }

  public long getId() {
    return 11L;
  }

  public void a(long paramLong)
  {
  }
}