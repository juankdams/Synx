import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cda
{
  public static final String PACKAGE = "wakfu.notificationPanel";
  private static final Pattern hvL = Pattern.compile("\\#\\#(.*)\\#\\#");

  public static String createLink(String paramString, ana paramana) {
    return createLink(paramString, paramana, null);
  }

  public static String createLink(String paramString1, ana paramana, String paramString2) {
    Matcher localMatcher = hvL.matcher(paramString1);
    if (localMatcher.find()) {
      String str = localMatcher.group(1);
      lZ locallZ = new lZ();
      locallZ.a(paramString1.substring(0, localMatcher.start()));
      locallZ.tI().tF().ao(paramana.name() + (paramString2 == null ? "" : paramString2));
      locallZ.a(str).tG().tJ();
      locallZ.a(paramString1.substring(localMatcher.end()));
      paramString1 = locallZ.tP();
    }

    return paramString1;
  }

  public static void forceCycle(cSx paramcSx) {
    if (((dMr)paramcSx).getButton() != 1)
      return;
    bSc.bYV().bZd();
  }

  public static void gotoNotificationLinkTooltip(cSx paramcSx, anG paramanG) {
    cWk localcWk = (cWk)paramcSx.cIl();
    cDG localcDG = localcWk.getBlockUnderMouse();
    if ((localcDG != null) && (localcDG.czB() == cUE.kHp)) {
      ddB localddB = localcDG.aOi();
      if (localddB == null)
        return;
      if ((localddB.cOJ() == bY.QP) && (((ckA)localddB).isUnderline()))
        ayw.popup(paramanG, localcWk);
    }
  }

  public static void gotoNotificationLink(cSx paramcSx, cbj paramcbj)
  {
    if (((dMr)paramcSx).getButton() != 3) {
      forceCycle(paramcSx);
      return;
    }
    String str1 = null;
    cWk localcWk = (cWk)paramcSx.cIl();
    cDG localcDG = localcWk.getBlockUnderMouse();
    ana localana = paramcbj.bu();
    if ((localcDG != null) && (localcDG.czB() == cUE.kHp)) {
      ddB localddB = localcDG.aOi();
      if (localddB == null)
        return;
      if (localddB.cOJ() == bY.QP) {
        String str2 = ((ckA)localddB).getId();
        if ((str2 != null) && (str2.length() > 0))
          str1 = str2.replaceAll(localana.name(), "");
      }
    }
    int i;
    switch (cwa.ihw[localana.ordinal()]) {
    case 1:
      if (!byv.bFN().c(pY.xl()))
        byv.bFN().a(pY.xl()); break;
    case 2:
      if (!byv.bFN().c(bTX.cah())) {
        dLE.doY().t("nationCurrentPageIndex", Byte.valueOf((byte)2));
        byv.bFN().a(bTX.cah()); } break;
    case 3:
      if (str1 == null)
        return;
      i = Integer.parseInt(str1);
      if (!byv.bFN().c(bTX.cah())) {
        int j = i == byv.bFN().bFO().cJf().bP() ? 1 : 0;
        dLE.doY().t("nationCurrentPageIndex", Byte.valueOf((byte)(j != 0 ? 2 : 3)));
        byv.bFN().a(bTX.cah());
      }break;
    case 4:
      if (str1 == null)
        return;
      i = Integer.parseInt(str1);

      WakfuClientInstance.awy().awB().a(bmz.fEQ, i);
      if (!byv.bFN().c(bcN.bqJ()))
        byv.bFN().a(bcN.bqJ());
      else {
        bcN.bqJ().bqK();
      }
      break;
    case 5:
      break;
    case 6:
      if (str1 == null)
        return;
      if (str1.length() > 0) {
        i = Byte.parseByte(str1);
        dLE.doY().t("nationCurrentPageIndex", Byte.valueOf(i));
      }
      if (!byv.bFN().c(bTX.cah()))
        byv.bFN().a(bTX.cah()); break;
    case 7:
      break;
    case 8:
      break;
    case 9:
      if (!byv.bFN().c(vt.Ek()))
        byv.bFN().a(vt.Ek());
      break;
    }
  }

  public static void selectMessage(cEv paramcEv)
  {
    bSc.bYV().a((cbj)paramcEv.getItemValue());
  }

  public static void overMessage(cSx paramcSx)
  {
    bSc.bYV().gD(true);
  }

  public static void outMessage(cSx paramcSx) {
    bSc.bYV().gD(false);
  }
}