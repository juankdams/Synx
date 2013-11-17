public class cyX
{
  public static final String PACKAGE = "wakfu.stateDetails";

  public static void setStateLevel(cSx paramcSx)
  {
    if ((paramcSx instanceof bXo)) {
      short s = (short)(int)((bXo)paramcSx).getValue();
      cpa localcpa = paramcSx.cIl().getElementMap();
      if (localcpa == null)
        return;
      b(s, localcpa);
    }
  }

  public static void keyType(cSx paramcSx, aTp paramaTp)
  {
    if (paramaTp.getText().length() == 0) {
      return;
    }
    cpa localcpa = paramcSx.cIl().getElementMap();
    if (localcpa == null) {
      return;
    }
    dxY localdxY = (dxY)dLE.doY().br("describedState", localcpa.getId());
    if (localdxY == null) {
      return;
    }
    short s1 = bUD.getShort(paramaTp.getText());
    short s2 = localdxY.bEt();
    if (s1 > s2) {
      s1 = s2;
    }

    b(s1, localcpa);
  }

  public static void restore(cSx paramcSx)
  {
    cpa localcpa = paramcSx.cIk().getElementMap();
    if (localcpa == null)
      return;
    short s = (short)dLE.doY().bn("describedStateLevel", localcpa.getId());

    b(s, localcpa);
  }

  private static void b(short paramShort, cpa paramcpa) {
    dxY localdxY = (dxY)dLE.doY().br("describedState", paramcpa.getId());
    if (localdxY != null)
      localdxY.cb(paramShort);
  }
}