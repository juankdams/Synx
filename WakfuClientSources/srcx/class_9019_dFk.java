public class dFk
  implements cvW
{
  private static final dFk lPa = new dFk();
  private static final bnm lPb = new aOM();

  public static dFk dgK()
  {
    return lPa;
  }

  public boolean a(cWG paramcWG)
  {
    czW localczW;
    dwN localdwN;
    byte b1;
    switch (paramcWG.getId()) {
    case 17007:
      localczW = (czW)paramcWG;

      localdwN = byv.bFN().bFO().bHa();
      b1 = localczW.af();
      gA localgA = localczW.getItem();

      boolean bool1 = localczW.getBooleanValue();

      byte b3 = (byte)localczW.getIntValue();
      long l2 = bool1 ? 0L : localczW.getSourceUniqueId();
      bKk localbKk;
      if (bool1)
      {
        if (b3 == b1)
        {
          return false;
        }

        boolean bool2 = localdwN.a(b3, false) == null;
        boolean bool3 = localdwN.a(b1, true) == null;

        localbKk = localdwN.a(b3, bool2, b1, bool3);
        if (localbKk == bKk.gLV)
          if (a(localdwN, b3)) {
            cKX localcKX2 = cBQ.cxL().a(bU.fH().getString("dimensionalBag.warn.resources"), Cn.et(0), 2073L, 102, 1);

            localcKX2.a(new aOK(this, localdwN, b3, bool2, b1, bool3));
          }
          else
          {
            localdwN.b(b3, bool2, b1, bool3, false);
          }
      }
      else {
        localbKk = localdwN.a(b1, localgA, l2, true, false);
        if (localbKk == bKk.gLW) {
          localbKk = localdwN.a(b1, localgA, l2, false, false);
        }
      }
      if (localbKk != bKk.gLV) {
        cBQ.cxL().a(dwN.a(localbKk), Cn.et(7), 2L, 102, 3);
      }

      localdwN.fB(b1);

      return false;
    case 17008:
      localczW = (czW)paramcWG;

      localdwN = byv.bFN().bFO().bHa();
      b1 = localczW.af();

      long l1 = localczW.getDestinationUniqueId();
      byte b2 = localczW.getDestinationPosition();

      if (a(localdwN, b1)) {
        cKX localcKX1 = cBQ.cxL().a(bU.fH().getString("dimensionalBag.warn.resources"), Cn.et(0), 2073L, 102, 1);

        localcKX1.a(new aOL(this, localdwN, b1, l1, b2));
      }
      else
      {
        return a(localdwN, b1, l1, b2);
      }
      break;
    }
    return true;
  }

  private static boolean a(dwN paramdwN, byte paramByte1, long paramLong, byte paramByte2) {
    bKk localbKk = paramdwN.a(paramByte1, paramLong, paramByte2, false, false);
    if (localbKk == bKk.gLY) {
      localbKk = paramdwN.a(paramByte1, paramLong, paramByte2, true, false);
    }
    if (localbKk != bKk.gLV) {
      cBQ.cxL().a(dwN.a(localbKk), Cn.et(7), 2L, 102, 3);

      return false;
    }

    paramdwN.fB(paramByte1);
    return false;
  }

  private static boolean a(dwN paramdwN, byte paramByte) {
    dQC localdQC = paramdwN.fC(paramByte);
    int i = localdQC.aCK();
    int j = localdQC.aCL();

    int k = localdQC.So();
    int m = localdQC.bY();

    for (int n = i; n < i + k; n++) {
      for (int i1 = j; i1 < j + m; i1++) {
        if (acL.apd().aP(n, i1) != null) {
          return true;
        }
      }
    }
    return false;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (paramBoolean) {
      return;
    }
    cBQ.cxL().a(lPb);

    cBQ.cxL().a("dimensionalBagRoomManagerDialog", VV.dJ("dimensionalBagRoomManagerDialog"), 32769L, (short)10000);

    if (byv.bFN().bFO().bHa() != null) {
      dLE.doY().t("editableDimensionalBag", byv.bFN().bFO().bHa());
    }

    cBQ.cxL().j("wakfu.roomManager", coy.class);

    aWc.blo().blC();
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (paramBoolean) {
      return;
    }
    cBQ.cxL().b(lPb);

    dLE.doY().removeProperty("editableDimensionalBag");

    cBQ.cxL().mW("dimensionalBagRoomManagerDialog");

    cBQ.cxL().mN("wakfu.roomManager");

    aWc.blo().blD();
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public String toString() {
    return "UIDimensionalBagRoomManagerFrame{m_dialogUnloadListener=" + lPb + '}';
  }
}