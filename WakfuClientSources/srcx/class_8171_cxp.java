final class cxp extends ajt
{
  public void a(dwn paramdwn)
  {
    if (!ajt.c(paramdwn)) {
      paramdwn.setVisible(false);
      return;
    }

    boolean bool = false;

    if ((paramdwn.getValue() instanceof brS)) {
      brS localbrS = (brS)paramdwn.getValue();
      Object localObject;
      CU localCU;
      switch (localbrS.dYr) {
      case 16:
        localObject = byv.bFN().bFO().bGG();
        bool = !((am)localObject).isSelected((int)localbrS.aTz);
        break;
      case 47:
        localObject = aot.dtv.a(dFN.lQf, localbrS.aTz);
        a(paramdwn, ((CU)localObject).Md());
        break;
      case 26:
        localObject = byv.bFN().bFO().bGF();
        localCU = aot.dtv.a(dFN.lQe, localbrS.aTz);
        bool = !((awT)localObject).kQ((int)localbrS.aTz);
        a(paramdwn, localCU.Md());
        break;
      case 49:
        localObject = byv.bFN().bFO().bGF();
        localCU = aot.dtv.a(dFN.lQg, localbrS.aTz);
        bool = !((awT)localObject).kS((int)localbrS.aTz);
        a(paramdwn, localCU.Md());
        break;
      case 48:
        localObject = aot.dtv.a(dFN.lQh, localbrS.aTz);
        a(paramdwn, ((CU)localObject).Md());
        break;
      }

    }

    paramdwn.setVisible(true);
    paramdwn.kJ(false);
    paramdwn.kK(bool);
  }
}