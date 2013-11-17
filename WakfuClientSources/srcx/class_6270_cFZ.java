public class cFZ
  implements cvW
{
  private static final cFZ iBm = new cFZ();

  public static cFZ cBs() {
    return iBm;
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

    switch (paramcWG.getId()) {
    case 19992:
    case 19995:
      dKc localdKc = localbyz.bSe();
      if ((localdKc == null) || (localdKc.fU() != 16)) {
        byv.bFN().b(this);
        return false;
      }

      aYR localaYR = (aYR)localdKc;
      if (localaYR.h(localbyz))
      {
        return false;
      }

      if (g((aqQ)paramcWG)) {
        bzu localbzu = l(paramcWG);
        localaYR.c(new dmt(this, localbzu));
      }

      return false;
    }

    return true;
  }

  private static boolean g(aqQ paramaqQ) {
    switch (paramaqQ.getId()) {
    case 19992:
      return paramaqQ.aCU();
    case 19995:
      return aqQ.aCZ();
    }

    return false;
  }

  private static bzu l(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 19992:
      return h((aqQ)paramcWG);
    case 19995:
      return h((aqQ)paramcWG);
    }
    return null;
  }

  private static bzu h(aqQ paramaqQ) {
    return paramaqQ.aCT();
  }

  public void clear() {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc != null) && (localdKc.fU() == 16)) {
      ((aYR)localdKc).a(localbyz.aeL(), null);
      localbyz.a(null);
    }

    byv.bFN().b(this);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}