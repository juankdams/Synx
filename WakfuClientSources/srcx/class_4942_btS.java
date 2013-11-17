import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javax.media.opengl.GL;

public class btS
{
  static final double gcO = 1000000.0D;
  static final int esx = 500;
  static final float gcP = 2.0F;
  static final float gcQ = 200.0F;
  static final float gcR = 300.0F;
  static final Comparator gcS = new deD();

  static final Comparator gcT = new deB();

  private static final akR gcU = new akR(10);

  private static final akR gcV = new akR(10);

  private static final aQO gcW = new aQO(null, null, null);
  private static aQO gcX = gcW;
  private static azh gcY;
  private static boolean drG = false;
  static long gcZ = 0L;

  public static boolean apR() {
    return (drG) && (gcY != null);
  }

  public static void cz(boolean paramBoolean) {
    drG = paramBoolean;
    reset();
  }

  public static void g(String paramString, int paramInt1, int paramInt2) {
    gcY = new azh(paramString, paramInt1, paramInt2);
  }

  public static void a(String paramString, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double paramDouble) {
    if (!apR()) {
      return;
    }
    dGz localdGz = (dGz)gcV.get(paramString);
    if (localdGz == null) {
      localdGz = new dGz(null);
      gcV.put(paramString, localdGz);
    }
    localdGz.bRQ[0] = paramFloat1;
    localdGz.bRQ[1] = paramFloat2;
    localdGz.bRQ[2] = paramFloat3;
    localdGz.bRQ[3] = paramFloat4;
    localdGz.lRd = (200.0D / paramDouble);
    localdGz.zO(paramInt);
  }

  public static void a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    c(paramString, new float[] { paramFloat1, paramFloat2, paramFloat3, 0.8F });
  }

  public static void start(String paramString) {
    c(paramString, null);
  }

  private static void c(String paramString, float[] paramArrayOfFloat) {
    if (!apR()) {
      return;
    }
    dVH localdVH = (dVH)gcU.get(paramString);
    if (localdVH == null) {
      localdVH = new dVH(paramString);
      gcU.put(paramString, localdVH);
    }
    localdVH.muB = gcZ;
    localdVH.bRQ = paramArrayOfFloat;
    Object localObject = null;
    int i = 0; for (int j = gcX.bFw.size(); i < j; i++) {
      aQO localaQO = (aQO)gcX.bFw.get(i);
      if (localaQO.eNC == localdVH) {
        localObject = localaQO;
        break;
      }
    }
    if (localObject == null) {
      localObject = new aQO(localdVH, gcX, null);
      gcX.bFw.add(localObject);
    }
    gcX = (aQO)localObject;
    localdVH.start();
  }

  public static void bCd() {
    if (!apR()) {
      return;
    }
    gcX = gcW;
    gcZ += 1L;

    ArrayList localArrayList = new ArrayList();
    gcU.s(new deA(localArrayList));

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dVH localdVH = (dVH)gcU.remove(localArrayList.get(i));
      a(gcW, localdVH);
    }

    gcV.s(new dez());
  }

  private static boolean a(aQO paramaQO, dVH paramdVH)
  {
    for (int i = 0; i < paramaQO.bFw.size(); i++) {
      if (((aQO)paramaQO.bFw.get(i)).eNC == paramdVH) {
        paramaQO.bFw.remove(i);
        return true;
      }
    }
    for (i = 0; i < paramaQO.bFw.size(); i++) {
      if (a((aQO)paramaQO.bFw.get(i), paramdVH)) {
        return true;
      }
    }
    return false;
  }

  private static void reset() {
    gcZ = 0L;
    gcU.clear();
    gcV.clear();
    gcX = gcW;
    gcW.bFw.clear();
  }

  public static void end() {
    if (!apR()) {
      return;
    }
    long l = System.nanoTime();
    ((dVH)gcU.get(gcX.eNC.m_name)).lb(l);
    gcX = gcX.eND;
  }

  public static void a(bSr parambSr) {
    if (!apR()) {
      return;
    }

    s(parambSr);

    gcY.a(parambSr, 8, 0);
    gcY.fT(String.format("%15s|%6s|%6s|%6s|%6s", new Object[] { "", "avg/call", "avg", "min", "max" }));
    aQO[] arrayOfaQO1 = new aQO[gcW.bFw.size()];
    gcW.bFw.toArray(arrayOfaQO1);
    Arrays.sort(arrayOfaQO1, gcS);
    for (aQO localaQO : arrayOfaQO1) {
      a(localaQO, 0);
    }
    gcY.end();
  }

  private static void s(bSr parambSr) {
    GL localGL = (GL)parambSr.bZk();

    dsZ.cZe().ks(false);
    dsZ.cZe().x(parambSr);

    parambSr.f(Matrix44.bFe);
    parambSr.g(Matrix44.bFe);
    parambSr.aJJ();

    float[] arrayOfFloat = { 0.2F, 0.2F, 0.2F, 0.9F };
    localGL.glColor4fv(arrayOfFloat, 0);
    localGL.glBegin(1);
    float f1 = -500.0F;
    float f2 = -300.0F;
    localGL.glVertex2f(-500.0F, -300.0F);
    localGL.glVertex2f(500.0F, -300.0F);

    localGL.glVertex2f(-500.0F, -300.0F);
    localGL.glVertex2f(-500.0F, -100.0F);
    localGL.glEnd();
    gcU.s(new det(localGL));

    gcV.s(new deu(localGL));

    gcY.a(parambSr, 0, (int)(parambSr.bZn() * 0.5F - 200.0F - 16.0F - 300.0F));
    gcY.b("10 ms", arrayOfFloat);
    gcY.end();
  }

  private static void a(aQO paramaQO, int paramInt) {
    String str = "";
    for (int i = 0; i < paramInt; i++) {
      str = str + "_";
    }
    if (paramaQO.eNC.muB != gcZ) {
      str = str + "#";
    }
    if ((paramaQO.eNC.muz.kYv / 1000000.0D > 0.01D) || (paramInt >= 2) || (paramInt == 0)) {
      if ((paramaQO.eNC.muz.kYv / 1000000.0D > 0.01D) || (paramaQO.eNC.m_name.startsWith("*"))) {
        gcY.b(paramaQO.eNC.toString(str), paramaQO.eNC.bRQ);
      }
      aQO[] arrayOfaQO1 = new aQO[paramaQO.bFw.size()];
      paramaQO.bFw.toArray(arrayOfaQO1);
      Arrays.sort(arrayOfaQO1, gcS);
      for (aQO localaQO : arrayOfaQO1)
        a(localaQO, paramInt + 1);
    }
  }
}