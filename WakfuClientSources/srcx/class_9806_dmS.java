import java.util.HashSet;
import org.apache.log4j.Logger;

public class dmS
{
  private static final Logger K = Logger.getLogger(dmS.class);

  private static final aoL llv = new aoL();
  private static final int llw = 2000;

  public static void cUp()
  {
    cHu localcHu = llv.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      cBx localcBx = (cBx)localcHu.value();
      if ((localcBx != null) && (localcBx.getElementMap() != null)) {
        localcBx.cxD();
      }
    }

    llv.clear();
  }

  public static void jM(long paramLong) {
    cBx localcBx = (cBx)llv.remove(paramLong);
    if (localcBx != null)
      localcBx.cxD();
  }

  public static boolean b(int paramInt, Su paramSu)
  {
    String str = aYU.ox(paramInt).ata();
    cBx localcBx = b(paramSu, str);
    if (localcBx == null) {
      return false;
    }
    a(paramSu, localcBx);
    return true;
  }

  private static cBx b(Su paramSu, String paramString) {
    long l = paramSu.getId();
    cBx localcBx = (cBx)llv.get(l);
    if (localcBx != null) {
      if ((!bB) && (l != ((cUo)localcBx.getTarget()).getId())) throw new AssertionError("Le mobile de " + paramSu.getName() + " ne correspond pas à l'ancien"); try
      {
        localcBx.cxC();
        localcBx.setAnimation(paramString);
      }
      catch (Exception localException1) {
        localcBx.cxD();
        llv.remove(l);
        K.warn(localException1);
        return null;
      }
    } else {
      try {
        String str = cam.cez();
        localcBx = cam.kO(str);
        localcBx.i(str, paramString, false);
        llv.put(l, localcBx);
      }
      catch (Exception localException2) {
        K.warn(localException2);
        return null;
      }
    }
    return localcBx;
  }

  private static void a(Su paramSu, cBx paramcBx) {
    bVf localbVf = paramSu.JT();
    if ((!bB) && (!(paramSu.aJp() instanceof bdi))) throw new AssertionError();
    a(paramSu, localbVf.aty());

    paramcBx.setDuration(2000);
    paramcBx.setTarget(paramSu.aeL());
    paramcBx.cIP();

    paramcBx.setYOffset((int)(paramSu.aeL().ats() * 10.0F) + 10);
    paramcBx.setSmileyIsVisible(true);
    paramcBx.cIP();

    auC localauC = paramcBx.getAnimatedElementViewer();
    localauC.setAnimatedElement(localbVf);
    localauC.getAnimatedElement().a(new drB(paramSu));
  }

  public static boolean a(int paramInt1, long paramLong, int paramInt2, Su paramSu)
  {
    if ((!bB) && (paramSu == null)) throw new AssertionError(); bhh localbhh = paramSu.aJp();
    String str;
    try {
      int i = c(paramInt2, paramSu);

      str = ay.bd().G(aYU.ce(paramInt1, localbhh.uO()));
      if (str == null) {
        str = eK(paramInt1, i);
      }

    }
    catch (Exception localException)
    {
      K.error("Exception", localException);
      return false;
    }

    if (str == null)
      return false;
    return a(paramLong, localbhh, str);
  }

  public static boolean c(int paramInt1, long paramLong, int paramInt2) {
    if (paramInt2 == 1) {
      K.error("character inconnu " + paramLong);
      return false;
    }
    String str = eK(paramInt1, paramInt2);
    return a(paramLong, null, str);
  }

  private static boolean a(long paramLong, bhh parambhh, String paramString) {
    cUo localcUo = bQK.bXG().gY(paramLong);
    if ((localcUo == null) || (!localcUo.isVisible())) {
      return false;
    }

    HashSet localHashSet = dbI.cNt().b(localcUo);
    int i = parambhh == null ? (byte)localcUo.BC() : parambhh.bY();

    doc localdoc = new doc(paramString, 32, 32, new KB(), 2000);
    localdoc.a(localcUo);
    localdoc.setYOffset((int)(i * 10.0F + localdoc.getYOffset() + 10.0F));
    localdoc.pu(Math.max(1, localHashSet != null ? localHashSet.size() * 2000 / 2 : 0));

    dbI.cNt().a(localdoc);
    return true;
  }

  private static int c(int paramInt, Su paramSu) {
    if (paramInt != -1) {
      return paramInt;
    }
    ciJ localciJ = bRu.bYI().tP(paramSu.aJp().nn());
    return paramSu.c(dKm.lXg) ? 0 : localciJ.ckB();
  }

  private static String eK(int paramInt1, int paramInt2) {
    return ay.bd().F(aYU.ce(paramInt1, paramInt2));
  }

  public static void a(Su paramSu, dR paramdR) {
    cew localcew = paramSu.aeL();

    a(paramdR, localcew, 1);
    a(paramdR, localcew, 2);
    a(paramdR, localcew, 8);
    paramdR.ie();
  }

  private static void a(dR paramdR, cew paramcew, int paramInt) {
    float[] arrayOfFloat = paramcew.aw(paramInt);
    paramdR.a(paramInt, arrayOfFloat);
  }
}