import org.apache.log4j.Logger;

public final class dTI
{
  private static Logger flN = Logger.getLogger("ParticleScripts");

  private static dTI mqD = new dTI();
  private static final String mqE = "particles/";

  public static dTI dtC()
  {
    return mqD;
  }

  public String Ea(int paramInt) {
    if ((!bB) && (dlD.cTt().getPath() == null)) throw new AssertionError();
    return String.format("%s%d%s", new Object[] { "particles/", Integer.valueOf(paramInt), dlD.cTt().getExtension() });
  }

  private bXf AE(int paramInt)
  {
    return dlD.cTt().a(Ea(paramInt), null, true);
  }

  public boolean n(int paramInt, int[] paramArrayOfInt) {
    bFB[] arrayOfbFB = a(paramInt, paramArrayOfInt, "playAps");

    if (arrayOfbFB == null) {
      return false;
    }

    if (arrayOfbFB.length == 0) {
      return false;
    }

    bFB localbFB = arrayOfbFB[0];
    if (localbFB.bNs() != bxT.gjc) {
      return false;
    }

    return ((Boolean)arrayOfbFB[0].getValue()).booleanValue();
  }

  private bFB[] a(int paramInt, int[] paramArrayOfInt, String paramString) {
    bXf localbXf = AE(paramInt);
    if (localbXf == null) {
      return null;
    }

    bFB[] arrayOfbFB1 = new bFB[paramArrayOfInt.length];
    for (int i = 0; i < arrayOfbFB1.length; i++) {
      arrayOfbFB1[i] = new bFB(Integer.valueOf(paramArrayOfInt[i]));
    }
    bFB[] arrayOfbFB2 = localbXf.a(paramString, arrayOfbFB1, new cIG[0]);
    localbXf.ccs();
    return arrayOfbFB2;
  }

  public void clear()
  {
  }
}