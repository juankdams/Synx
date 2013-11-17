import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cZQ
{
  protected static final Logger K = Logger.getLogger(cZQ.class);
  private static final String kNA = "messageBoxTitle";
  private static final String kNB = "messageBoxImage";
  private static final String kNC = "messageBoxTextView";
  private static final String kND = "messageBoxTextEditor";
  private static final String kNE = "messageBoxButtonsContainer";
  private static final String kNF = "messageBoxButton";

  public static void a(bpn parambpn, cKX paramcKX, String paramString1, String paramString2, String paramString3, long paramLong, ArrayList paramArrayList)
  {
    cpa localcpa = parambpn.getElementMap();

    if (localcpa.lF("messageBoxTitle")) {
      caF localcaF = (caF)localcpa.fi("messageBoxTitle");
      localcaF.setText(paramString2);
    }
    Object localObject1;
    Object localObject2;
    if (localcpa.lF("messageBoxImage")) {
      czv localczv = (czv)localcpa.fi("messageBoxImage");

      localObject1 = cBQ.cxL().bSM();
      if (localObject1 != null)
      {
        localObject2 = null;
        if ((paramString3 != null) && (paramString3.length() > 0)) {
          localObject2 = tq.Bg().b(dHL.lSB.dhZ(), byn.jp(paramString3), paramString3, false);
        }
        else if ((paramLong & 0x200) == 512L)
          localObject2 = ((uk)localObject1).aH("messageBoxInfoIcon");
        else if ((paramLong & 0x400) == 1024L)
          localObject2 = ((uk)localObject1).aH("messageBoxErrorIcon");
        else if ((paramLong & 0x800) == 2048L)
          localObject2 = ((uk)localObject1).aH("messageBoxQuestionIcon");
        else if ((paramLong & 0x1000) == 4096L) {
          localObject2 = ((uk)localObject1).aH("messageBoxCautionIcon");
        }

        if (localObject2 != null)
          localczv.setPixmap(new dDq((uz)localObject2));
      }
    }
    else
    {
      throw new Exception("Aucun Label n'est référencé sous l'id : messageBoxImage");
    }

    if (localcpa.lF("messageBoxTextView")) {
      localObject1 = (cWk)localcpa.fi("messageBoxTextView");
      ((cWk)localObject1).setText(paramString1);
      if ((paramLong & 0x2000) == 8192L) {
        ((cWk)localObject1).setSelectable(true);
        ((cWk)localObject1).setEnableShrinking(false);
      }
    } else {
      throw new Exception("Aucun textView n'est référencé sous l'id : messageBoxTextView");
    }

    if (localcpa.lF("messageBoxTextEditor")) {
      localObject2 = (aTp)localcpa.fi("messageBoxTextEditor");
      boolean bool = (paramLong & 0x10000) == 65536L;
      ((aTp)localObject2).setVisible(bool);
    } else {
      throw new Exception("Aucun textView n'est référencé sous l'id : messageBoxTextView");
    }

    if (!localcpa.lF("messageBoxButtonsContainer")) {
      throw new Exception("Aucun container n'est référencé sous l'id : messageBoxButtonsContainer");
    }

    if (!localcpa.lF("messageBoxButton")) {
      throw new Exception("Aucun button n'est référencé sous l'id : messageBoxButton");
    }

    dRq localdRq = (dRq)localcpa.fi("messageBoxButtonsContainer");
    biy localbiy = (biy)localcpa.fi("messageBoxButton");

    localdRq.j(localbiy);

    a(2, paramLong, paramArrayList, localbiy, paramcKX, localdRq, (aTp)localObject2);
    a(4, paramLong, paramArrayList, localbiy, paramcKX, localdRq, (aTp)localObject2);
    a(8, paramLong, paramArrayList, localbiy, paramcKX, localdRq, (aTp)localObject2);
    a(16, paramLong, paramArrayList, localbiy, paramcKX, localdRq, (aTp)localObject2);
    a(32, paramLong, paramArrayList, localbiy, paramcKX, localdRq, (aTp)localObject2);
    a(64, paramLong, paramArrayList, localbiy, paramcKX, localdRq, (aTp)localObject2);
    a(128, paramLong, paramArrayList, localbiy, paramcKX, localdRq, (aTp)localObject2);
    a(256, paramLong, paramArrayList, localbiy, paramcKX, localdRq, (aTp)localObject2);

    localbiy.beH();
  }

  private static void a(int paramInt, long paramLong, ArrayList paramArrayList, biy parambiy, cKX paramcKX, dRq paramdRq, aTp paramaTp) {
    if ((paramLong & paramInt) == paramInt)
      a(parambiy, paramcKX, paramdRq, paramInt, d(paramInt, paramArrayList), paramaTp);
  }

  private static biy a(biy parambiy, cKX paramcKX, dRq paramdRq, int paramInt, String paramString, aTp paramaTp)
  {
    biy localbiy = null;
    try
    {
      localbiy = (biy)parambiy.getClass().newInstance();
      localbiy.aJ();
      parambiy.c(localbiy);
      localbiy.setText(paramString);

      localbiy.setOnClick(new cvf(paramcKX, paramInt, paramaTp));

      localbiy.setElementMap(parambiy.getElementMap());
      localbiy.rV();

      switch (paramInt) {
      case 2:
      case 8:
        localbiy.setClickSoundId(MQ.WK().WV());
        localbiy.setFocusable(true);
        localbiy.setFocused(true);
        break;
      case 4:
      case 16:
        localbiy.setClickSoundId(MQ.WK().WW());
      }

      paramdRq.a(localbiy);
    }
    catch (Exception localException) {
      K.error("Exception", localException);
    }
    return localbiy;
  }

  private static String d(int paramInt, ArrayList paramArrayList)
  {
    switch (paramInt)
    {
    case 2:
      return cBQ.cxL().mL("ok");
    case 4:
      return cBQ.cxL().mL("cancel");
    case 8:
      return cBQ.cxL().mL("yes");
    case 16:
      return cBQ.cxL().mL("no");
    case 32:
      if ((paramArrayList == null) || (paramArrayList.size() < 1)) {
        return "";
      }
      return (String)paramArrayList.get(0);
    case 64:
      if ((paramArrayList == null) || (paramArrayList.size() < 2)) {
        return "";
      }
      return (String)paramArrayList.get(1);
    case 128:
      if ((paramArrayList == null) || (paramArrayList.size() < 3)) {
        return "";
      }
      return (String)paramArrayList.get(2);
    case 256:
      if ((paramArrayList == null) || (paramArrayList.size() < 4)) {
        return "";
      }
      return (String)paramArrayList.get(3);
    }

    return "";
  }
}