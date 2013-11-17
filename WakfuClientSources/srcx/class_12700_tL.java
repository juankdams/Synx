import org.apache.log4j.Logger;

public class tL
  implements auP, cvW
{
  protected static final Logger K = Logger.getLogger(tL.class);

  private static tL beA = new tL();

  private boolean beB = false;
  private bnm N;

  public static tL Ca()
  {
    return beA;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 16431:
      Cb();
      return false;
    case 16825:
      czW localczW = (czW)paramcWG;
      byz localbyz = byv.bFN().bFO();

      gA localgA = localczW.getItem();
      int i = localczW.getDestinationPosition();
      Object localObject2;
      if (localczW.getDestinationUniqueId() == 2L)
      {
        if (localczW.nP() != 1) {
          return false;
        }
        localObject1 = localbyz.ayJ();
        localObject2 = ((bZH)localObject1).ajz();
        if (!((bPr)localObject2).a(localgA, localbyz, localbyz.ayL())) {
          avW.aIb().a(60, 3, new Object[0]);
          return false;
        }

        if (((bPr)localObject2).a((dno)localObject1, localgA, (short)i) != 0) {
          avW.aIb().a(60, 3, new Object[0]);
          return false;
        }

      }
      else if (localczW.getDestinationUniqueId() != -1L)
      {
        localObject1 = localbyz.bGP().iO(localczW.getDestinationUniqueId());
        localObject2 = ((cRs)localObject1).dR((short)i);
        if ((localObject2 != null) && (
          (((gA)localObject2).nR() <= 1) || (!((gA)localObject2).b(localgA)) || (((gA)localObject2).nP() == ((gA)localObject2).nR())))
        {
          return false;
        }
      }

      Object localObject1 = new dEY();
      ((dEY)localObject1).hR(localczW.getDestinationUniqueId());
      ((dEY)localObject1).aC((short)i);
      ((dEY)localObject1).l(localczW.nP());
      ((dEY)localObject1).hQ(localgA.oj());
      byv.bFN().aJK().d((cWG)localObject1);

      return false;
    }

    return true;
  }

  public int x(String paramString) {
    if (paramString.equals("temporaryTransferInventoryDialog")) {
      Cb();
      return 2;
    }

    return 0;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      dLE.doY().t("temporaryInventory.currentDragItemId", Integer.valueOf(-1));

      this.N = new bYr(this);

      cBQ.cxL().a(this.N);

      bBq.bKG().a(this);

      cBQ.cxL().a("temporaryTransferInventoryDialog", VV.dJ("temporaryTransferInventoryDialog"), 32769L, (short)10000);

      cBQ.cxL().j("wakfu.temporaryInventory", agB.class);

      cBQ.cxL().a(bU.fH().getString("temporaryInventory.descr"), Cn.et(7), 514L, 102, 1);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }

      dLE.doY().removeProperty("temporaryInventory.currentDragItemId");

      byz localbyz = byv.bFN().bFO();

      cBQ.cxL().b(this.N);
      bBq.bKG().b(this);

      cBQ.cxL().mW("temporaryTransferInventoryDialog");

      cBQ.cxL().mN("wakfu.temporaryInventory");

      this.beB = false;
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void Cb() {
    if (this.beB) {
      return;
    }

    cKX localcKX = cBQ.cxL().a(bU.fH().getString("temporaryInventory.reallyMove"), Cn.et(7), 4102L, 102, 1);

    localcKX.a(new bYu(this));

    this.beB = true;
  }
}