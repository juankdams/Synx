public class aiV
  implements bOW, cvW
{
  private static aiV dht = new aiV();
  private bnm N;

  public static aiV avF()
  {
    return dht;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    switch (paramcWG.getId())
    {
    case 19003:
      localObject1 = (aMj)paramcWG;

      localObject2 = ((aMj)localObject1).bdw();

      return false;
    case 19005:
      localObject1 = (aMj)paramcWG;

      localObject2 = ((aMj)localObject1).bdw();
      if (localObject2 != null) {
        ((dbV)localObject2).setNotify(!((dbV)localObject2).cNB());
      }

      return false;
    case 19020:
      localObject1 = (dpR)paramcWG;
      localObject2 = ((dpR)localObject1).cXl();
      switch (((dpR)localObject1).getType())
      {
      case 1:
        if (dmY.cUs().cUu().dfZ() >= 100) {
          cBQ.cxL().a(bU.fH().getString("notification.groupLimitReached"), Cn.et(1), 513L, 102, 1);

          return false;
        }
        if (dmY.cUs().cUu().f((dbV)localObject2) != null) {
          localObject3 = bU.fH().getString("contactList.error.alreadyInFriendList", new Object[] { ((dbV)localObject2).aJm() });
          CM.LV().f((String)localObject3, 3);
          return false;
        }
        if (dmY.cUs().cUv().f((dbV)localObject2) != null) {
          localObject3 = cBQ.cxL().a(bU.fH().getString("contactList.question.friendToIgnored"), Cn.et(0), 25L, 102, 1);

          ((cKX)localObject3).a(new cTQ(this, (dbV)localObject2));
        }
        else
        {
          localObject3 = new dqv();
          ((dqv)localObject3).mA(((dbV)localObject2).aJm());
          byv.bFN().aJK().d((cWG)localObject3);
        }
        break;
      case 2:
        if (dmY.cUs().cUu().dfZ() >= 100) {
          cBQ.cxL().a(bU.fH().getString("notification.groupLimitReached"), Cn.et(1), 513L, 102, 1);

          return false;
        }
        if (dmY.cUs().cUu().f((dbV)localObject2) != null) {
          localObject3 = cBQ.cxL().a(bU.fH().getString("contactList.question.ignoredToFriend"), Cn.et(0), 25L, 102, 1);

          ((cKX)localObject3).a(new cTS(this, (dbV)localObject2));
        }
        else
        {
          localObject3 = new dnu();
          ((dnu)localObject3).pG(((dbV)localObject2).aJm());
          byv.bFN().aJK().d((cWG)localObject3);
        }

        break;
      case 4:
        byv.bFN().bFO().bHj().ch(((dbV)localObject2).aJm());
      case 3:
      }

      return false;
    case 19021:
      localObject1 = (dpR)paramcWG;
      localObject2 = ((dpR)localObject1).cXl();
      switch (((dpR)localObject1).getType()) {
      case 1:
        localObject3 = new cyZ();
        ((cyZ)localObject3).mA(((dbV)localObject2).getName());
        byv.bFN().aJK().d((cWG)localObject3);
        break;
      case 2:
        localObject4 = new dOG();
        ((dOG)localObject4).pG(((dbV)localObject2).getName());
        byv.bFN().aJK().d((cWG)localObject4);
      }

      return false;
    case 19060:
      localObject1 = (aMj)paramcWG;
      localObject2 = ((aMj)localObject1).bdw();
      ((dbV)localObject2).iW(true);
      dLE.doY().a((dBv)localObject2, new String[] { "commentaryEdition" });

      return false;
    case 19028:
      localObject1 = (aMj)paramcWG;
      localObject2 = ((aMj)localObject1).getStringValue();
      localObject3 = ((aMj)localObject1).bdw();
      ((dbV)localObject3).oP((String)localObject2);
      ((dbV)localObject3).iW(false);

      dLE.doY().a((dBv)localObject3, new String[] { "commentaryEdition", "commentary" });

      localObject4 = new drl();
      ((drl)localObject4).mA(((dbV)localObject3).aJm());
      ((drl)localObject4).pM((String)localObject2);
      byv.bFN().aJK().d((cWG)localObject4);

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

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      dmY.cUs().jC(true);

      this.N = new cTN(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("contact.list", dmY.cUs());

      cBQ.cxL().a("contactListDialog", VV.dJ("contactListDialog"), 32768L, (short)10000);

      cBQ.cxL().j("wakfu.contactList", ajM.class);

      aWc.blo().blC();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dmY.cUs().cUu().dga();

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("contactListDialog");

      dLE.doY().removeProperty("contact.list");

      cBQ.cxL().mN("wakfu.contactList");

      aWc.blo().blD();
    }
  }

  public void au(String paramString) {
    if ((paramString != null) && (!paramString.equals("contactListDialog")))
      byv.bFN().b(this);
  }
}