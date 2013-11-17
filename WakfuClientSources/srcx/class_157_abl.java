import org.apache.log4j.Logger;

public class abl
  implements cvW
{
  private static final Logger K = Logger.getLogger(abl.class);

  private static abl cPH = new abl();
  private fx cPI;
  private bnm N;

  public static abl anK()
  {
    return cPH;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (paramcWG.getId())
    {
    case 17002:
      localObject1 = (cHV)paramcWG;
      localObject2 = this.cPI.mB().b(cuU.ifD);
      if (localObject2 == null) {
        localObject2 = new Xi(cuU.ifD);
        this.cPI.a((Xi)localObject2);
      }
      if (((cHV)localObject1).getBooleanValue())
        ((Xi)localObject2).b(Ka.fv(((cHV)localObject1).getIntValue()));
      else {
        ((Xi)localObject2).c(Ka.fv(((cHV)localObject1).getIntValue()));
      }
      dLE.doY().a(((cHV)localObject1).cCj(), new String[] { "guildPerms" });
      return false;
    case 17004:
      localObject1 = (cHV)paramcWG;
      localObject2 = this.cPI.mB().b(cuU.ifC);
      if (localObject2 == null) {
        localObject2 = new Xi(cuU.ifC);
        this.cPI.a((Xi)localObject2);
      }
      if (((cHV)localObject1).getBooleanValue())
        ((Xi)localObject2).b(Ka.fv(((cHV)localObject1).getIntValue()));
      else {
        ((Xi)localObject2).c(Ka.fv(((cHV)localObject1).getIntValue()));
      }
      dLE.doY().a(((cHV)localObject1).cCj(), new String[] { "anonymousPerms" });
      return false;
    case 17000:
      localObject1 = (bzu)paramcWG;
      localObject2 = ((bzu)localObject1).getStringValue();
      localObject3 = CA.Lv().bs((String)localObject2);
      if (localObject3 == null) {
        CM.LV().f(bU.fH().getString("error.playerUnknownInDimensionalBag", new Object[] { localObject2 }), 3);
        return false;
      }
      this.cPI.a(new dym(((Su)localObject3).getId(), (String)localObject2));
      return false;
    case 17001:
      localObject1 = (bzu)paramcWG;
      this.cPI.C(((bzu)localObject1).ah());
      return false;
    case 17005:
      localObject1 = (cHV)paramcWG;
      localObject2 = this.cPI.mB().hN(((cHV)localObject1).ah());
      localObject3 = Ka.fv(((cHV)localObject1).getIntValue());
      if (((cHV)localObject1).getBooleanValue())
        ((dym)localObject2).b((Ka)localObject3);
      else {
        ((dym)localObject2).c((Ka)localObject3);
      }
      ((cHV)localObject1).cCj().aGu();
      return false;
    case 17003:
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new sf(this);

      cBQ.cxL().a(this.N);

      cub localcub = byv.bFN().bFO().bHa().dce();
      if (localcub != null) {
        this.cPI = new fx(localcub);
        dLE.doY().t("roomPermissions", this.cPI);
      }
      dLE.doY().t("roomViewDisplayed", null);

      cBQ.cxL().a("dimensionalBagRoomAdministrationDialog", VV.dJ("dimensionalBagRoomAdministrationDialog"), 32769L, (short)10000);

      cBQ.cxL().j("wakfu.roomAdministration", bEW.class);

      aWc.blo().blC();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().mW("dimensionalBagRoomAdministrationDialog");
      cBQ.cxL().mW("dimensionalBagRoomIndividualRightsDialog");
      byz localbyz = byv.bFN().bFO();
      dwN localdwN = localbyz.bHa();
      if (localdwN != null)
        localdwN.a(this.cPI.mB());
      this.cPI = null;
      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("roomPermissions");
      dLE.doY().removeProperty("roomViewDisplayed");

      cBQ.cxL().mN("wakfu.roomAdministration");

      aWc.blo().blD();
    }
  }
}