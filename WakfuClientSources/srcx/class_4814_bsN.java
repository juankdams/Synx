import org.apache.log4j.Logger;

public class bsN
{
  protected static Logger K = Logger.getLogger(bsN.class);
  public static final String PACKAGE = "wakfu.merchant.tax";

  public static void priceChanged(cSx paramcSx)
  {
    aTp localaTp = (aTp)paramcSx.cIl();
    Object localObject = localaTp.getText();
    if (((String)localObject).length() == 0)
      return;
    long l = Long.parseLong((String)localObject);
    if (l > 2147483647L) {
      String str = String.valueOf(2147483647);
      localaTp.setText(str);
      localObject = str;
    }

    int i = Integer.parseInt((String)localObject);
    bzu localbzu = new bzu();
    localbzu.d(17300);
    localbzu.e(i);
    cjO.clE().j(localbzu);
  }

  public static void packChanged(arS paramarS) {
    if (paramarS.getSelected()) {
      aPU localaPU = (aPU)paramarS.getValue();
      cLw localcLw = new cLw();
      localcLw.b(localaPU.Hy());
      localcLw.d(17302);
      cjO.clE().j(localcLw);
    }
  }

  public static void durationChanged(arS paramarS) {
    if (paramarS.getSelected()) {
      bUF localbUF = (bUF)paramarS.getValue();
      cga localcga = new cga();
      localcga.b(localbUF.bdK());
      localcga.d(17311);
      cjO.clE().j(localcga);
    }
  }

  public static void valid(cSx paramcSx) {
    if (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() != 10))
      return;
    bzu.cf((short)17308);
  }

  public static void cancel(cSx paramcSx) {
    bzu.cf((short)17309);
  }
}