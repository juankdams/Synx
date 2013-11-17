import java.util.ArrayList;

public class dek
{
  public static final String PACKAGE = "wakfu.windowStick";
  private static final byte kYk = 0;
  private static final byte kYl = 1;

  public static void stickWindow(dsf paramdsf)
  {
    a(paramdsf, "", (byte)0);
  }

  private static String a(bpn parambpn, aFG paramaFG, byte paramByte) {
    switch (paramByte) {
    case 0:
      switch (bkF.dlz[paramaFG.ordinal()]) {
      case 1:
      case 2:
        return parambpn.getHorizontalDialog();
      case 3:
      case 4:
      }
      return parambpn.getVerticalDialog();
    case 1:
      String str = parambpn.getElementMap().getId();
      switch (bkF.dlz[paramaFG.ordinal()]) {
      case 3:
        return parambpn.getVerticalDialog();
      case 4:
        return parambpn.getHorizontalDialog();
      }
      return str;
    }

    return null;
  }

  private static bpn a(dsf paramdsf, String paramString, byte paramByte) {
    bpn localbpn1 = (bpn)paramdsf.cIl();
    String str1 = localbpn1.getElementMap().getId();
    clA localclA = localbpn1.getStickData();
    aFG localaFG = paramdsf.getAlign();
    int i = bsP.getInstance().getDragButton();

    String str2 = a(localbpn1, localaFG, paramByte);

    if (str1.startsWith(str2)) {
      return localbpn1;
    }

    cBQ.cxL().M(str1, false);

    bpn localbpn2 = (bpn)cBQ.cxL().a(str2 + paramString, VV.dJ(str2), 40976L, (short)10000);

    localbpn2.setHorizontalDialog(localbpn1.getHorizontalDialog());
    localbpn2.setVerticalDialog(localbpn1.getVerticalDialog());

    LJ.Wo().a(localbpn2, localclA.isMainWindow(), false);
    LJ.Wo().e(localbpn2);

    ArrayList localArrayList = localbpn2.getMovePoints();
    if (!localArrayList.isEmpty()) {
      dqa localdqa = (dqa)localArrayList.get(0);
      bkI localbkI = new bkI(localdqa, localbpn2, i);

      localdqa.setEnablePositionEvents(true);
      localdqa.setEnableResizeEvents(true);

      localdqa.a(CH.bGJ, localbkI, false);
      localdqa.a(CH.bGK, localbkI, false);
    }

    return localbpn2;
  }

  public static void stickShortcutBar(dsf paramdsf, bJz parambJz) {
    byte b = (byte)(parambJz.VH() - parambJz.azo().aRP());
    bpn localbpn = a(paramdsf, String.valueOf(b), (byte)0);
    zV.IH().c(b, localbpn.getElementMap().getId().startsWith(localbpn.getVerticalDialog()));
    zV.IH().O(b);
  }

  public static void stickStateBar(dsf paramdsf) {
    bpn localbpn1 = (bpn)paramdsf.cIl();
    bpn localbpn2 = a(paramdsf, "", (byte)0);
    if (localbpn1 != localbpn2)
      localbpn2.a(CH.bGJ, new bkL(localbpn2), false);
  }

  public static void stickFollowAchievements(dsf paramdsf)
  {
    bpn localbpn1 = (bpn)paramdsf.cIl();
    bpn localbpn2 = a(paramdsf, "", (byte)1);
    if (localbpn1 != localbpn2) {
      localbpn2.a(CH.bGJ, new bkK(localbpn2), false);

      localbpn2.setEnableResizeEvents(true);
    }
  }
}