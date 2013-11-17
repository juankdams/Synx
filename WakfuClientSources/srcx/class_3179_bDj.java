public final class bDj
  implements eN
{
  public static bDj gyk = new bDj();

  public void a(cWT paramcWT)
  {
    aAA localaAA = aAA.ly(paramcWT.getId());
    switch (bld.fBY[localaAA.ordinal()]) {
    case 1:
      b(paramcWT);
    }
  }

  private void b(cWT paramcWT)
  {
    ayn localayn = (ayn)paramcWT.boT();
    byz localbyz = byv.bFN().bFO();

    if (localbyz.aeQ() != null) {
      return;
    }
    if (localbyz.cJf().bP() != localayn.avc()) {
      return;
    }
    if (!localbyz.cJf().c(dLC.mbN)) {
      return;
    }
    String str = bU.fH().getString("attacked.protector.joinInFight", new Object[] { String.format("<b>%s</b>", new Object[] { localayn.getName() }) });

    cKX localcKX = cBQ.cxL().a(str, Cn.et(5), 2073L, 102, 1);

    localcKX.a(new blr(this, localayn));
  }
}