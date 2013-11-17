import org.apache.log4j.Logger;

public class alm
{
  private static final Logger K = Logger.getLogger(alm.class);
  private static final boolean DEBUG = true;
  private static final String dlW = "scenario/";
  private final dFu dlX = new dFu();

  private final cSR dlY = new cSR();

  private static final alm dlZ = new alm();

  public static alm axU()
  {
    return dlZ;
  }

  public String jb(int paramInt) {
    if ((!bB) && (dlD.cTt().getPath() == null)) throw new AssertionError();
    return String.format("%s%d%s", new Object[] { "scenario/", Integer.valueOf(paramInt), dlD.cTt().getExtension() });
  }

  public bXf l(int paramInt, boolean paramBoolean)
  {
    bXf localbXf = null;
    int i = this.dlX.get(paramInt);
    if (i > 0) {
      localbXf = dlD.cTt().AE(i);
      if (localbXf != null)
        return localbXf;
    }
    if (paramBoolean) {
      localbXf = dlD.cTt().a(jb(paramInt), null, false);
      if (localbXf != null) {
        this.dlX.fg(paramInt, localbXf.getId());
        return localbXf;
      }
      K.trace("On a pas trouvé le script du scénario " + paramInt);
    }

    return localbXf;
  }

  public void a(int paramInt1, int paramInt2, long[] paramArrayOfLong, boolean paramBoolean)
  {
    bXf localbXf = l(paramInt1, true);
    if (localbXf == null) {
      K.error("runEvent : impossible de trouver un script d'id de scénario " + paramInt1);
      return;
    }
    bFB[] arrayOfbFB = new bFB[paramArrayOfLong.length];
    for (int i = 0; i < arrayOfbFB.length; i++) {
      arrayOfbFB[i] = new bFB(Long.valueOf(paramArrayOfLong[i]));
    }
    String str = null;
    if (paramBoolean)
      str = "reward_" + paramInt1 + "_" + paramInt2;
    else
      str = "event_" + paramInt1 + "_" + paramInt2;
    localbXf.a(str.replaceAll("-", "_"), arrayOfbFB, new cIG[0]);
  }

  public void b(int paramInt, String paramString1, String paramString2) {
    this.dlY.put(paramInt, new btd(this, paramString1, paramString2));
  }

  public void clear() {
    this.dlY.clear();
    this.dlX.clear();
  }
}