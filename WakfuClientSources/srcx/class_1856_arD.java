import org.apache.log4j.Logger;

public class arD
  implements cvW
{
  private static final arD dAf = new arD();

  protected static final Logger K = Logger.getLogger(arD.class);

  public static arD aDU() {
    return dAf;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public boolean a(cWG paramcWG)
  {
    byz localbyz = byv.bFN().bFO();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    switch (paramcWG.getId())
    {
    case 6002:
      localObject1 = (atx)paramcWG;

      localObject2 = (bKm)CA.Lv().bj(((atx)localObject1).aFM());

      if (localObject2 == null)
        return false;
      localObject3 = new cPO((bKm)localObject2);
      localObject4 = new cPO(localbyz);
      localObject5 = new aqa((cPO)localObject3, (cPO)localObject4);

      localObject6 = new bUx((aqa)localObject5);
      ((cPO)localObject3).a((czw)localObject6);
      ((cPO)localObject4).a((czw)localObject6);

      if (dmY.cUs().cUv().ky(((bKm)localObject2).sN()) != null) {
        ((aqa)localObject5).a((dqD)localObject3, cVF.kIl);
        return false;
      }

      ((aqa)localObject5).start();

      if (((aqa)localObject5).bPg() != dTl.mpM) {
        aYP.feK.b((aqa)localObject5);
      }

      return false;
    case 6004:
      localObject1 = (cxM)paramcWG;

      switch (((cxM)localObject1).cva()) {
      case 0:
        localObject2 = (bKm)CA.Lv().bj(((cxM)localObject1).cuZ());

        localObject3 = new cPO(localbyz);
        localObject4 = new cPO((bKm)localObject2);
        localObject5 = new aqa((cPO)localObject3, (cPO)localObject4);

        localObject6 = new bUx((aqa)localObject5);
        ((cPO)localObject3).a((czw)localObject6);
        ((cPO)localObject4).a((czw)localObject6);

        ((aqa)localObject5).start();

        if (((aqa)localObject5).bPg() != dTl.mpM)
          aYP.feK.b((aqa)localObject5); break;
      case 3:
        localObject2 = aYP.feK.bnR();

        if (localObject2 != null) {
          localObject3 = (bKm)CA.Lv().bj(((cxM)localObject1).cuZ());
          ((bHF)localObject2).gJ(((bKm)localObject3).getId());
        }break;
      case 1:
        localObject2 = (bKm)CA.Lv().bj(((cxM)localObject1).cuZ());
        localObject3 = bU.fH().getString("exchange.canceledUserBusy", new Object[] { localObject2 == null ? "" : ((bKm)localObject2).getName() });

        cBQ.cxL().a((String)localObject3, Cn.et(1), 4099L, 102, 1);

        localObject4 = aYP.feK.bnR();
        if (localObject4 != null)
          if (localObject2 != null) {
            ((aqa)localObject4).gK(((bKm)localObject2).getId());
          } else {
            ((aqa)localObject4).aBW().cEo();

            byv.bFN().b(dxP.dcE());
            aFa.aRA().b((bHF)localObject4); }  break;
      case 2:
        localObject2 = aYP.feK.bnR();

        if (localObject2 != null)
        {
          ((bHF)localObject2).a(((bHF)localObject2).gI(((cxM)localObject1).cvb()), cVF.kIh); } break;
      case 4:
        localObject2 = (bKm)CA.Lv().bj(((cxM)localObject1).cuZ());
        localObject3 = bU.fH().getString("error.chat.userIgnoreYou", new Object[] { ((bKm)localObject2).getName() });

        localObject4 = new aEe((String)localObject3);
        ((aEe)localObject4).mm(3);

        localObject5 = CM.LV();
        ((CM)localObject5).a((aEe)localObject4);

        localObject6 = aYP.feK.bnR();

        if (localObject6 != null)
          ((bHF)localObject6).cancel(localbyz.getId()); break;
      }

      return false;
    }

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}