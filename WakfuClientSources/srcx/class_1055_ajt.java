public abstract class ajt
{
  public static final bJc diJ = new bJc();

  public static final ajt diK = new cxp();

  public abstract void a(dwn paramdwn);

  private static boolean b(dwn paramdwn)
  {
    Object localObject1;
    Object localObject2;
    if ((paramdwn.getValue() instanceof brS)) {
      localObject1 = (brS)paramdwn.getValue();

      switch (((brS)localObject1).dYr) {
      case 47:
        localObject2 = byv.bFN().bFO().bGF();
        CU localCU = aot.dtv.a(dFN.lQf, ((brS)localObject1).aTz);
        return (localCU.Md() != null) && (((awT)localObject2).kP((int)((brS)localObject1).aTz));
      case 48:
        localObject2 = aot.dtv.a(dFN.lQh, ((brS)localObject1).aTz);
        return ((CU)localObject2).Md() != null;
      }
    }
    else if ((paramdwn.getValue() instanceof avH)) {
      localObject1 = (avH)paramdwn.getValue();
      if (((avH)localObject1).coX != -1) {
        localObject2 = byv.bFN().bFO().bGa();
        return (!((bCP)localObject2).lZ(((avH)localObject1).coX)) || (((bCP)localObject2).ma(((avH)localObject1).coX));
      }
      if (((avH)localObject1).bkM == aYk.fdP.getType()) {
        return (((avH)localObject1).bkN <= 0) || (byv.bFN().bFO().aTn().contains(((avH)localObject1).bkN));
      }
    }

    return true;
  }

  static void a(dwn paramdwn, dFN paramdFN) {
    switch (cxq.dgJ[paramdFN.ordinal()]) {
    case 1:
      paramdwn.a(dSP.moZ);
      break;
    case 2:
      paramdwn.a(dSP.moY);
      break;
    case 3:
      paramdwn.a(dSP.moX);
      break;
    case 4:
      paramdwn.a(dSP.moW);
    }
  }
}