import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import org.apache.log4j.Logger;

public class cwO
{
  private static boolean iji = false;
  private static boolean ijj = false;
  private static int bQo;
  private static String gPM;
  private static final bep[] beo = bep.brZ();
  private static final caW eUu = new caW(-1, (byte)0, -1);
  private static final Logger K = Logger.getLogger(cwO.class);
  private static final aoL ijk = new aoL();
  private static final aoL ijl = new aoL();
  private static final Object ijm = new Object();
  private static ckD gPK;

  public static void L(short paramShort1, short paramShort2)
  {
    if ((!bB) && (gPK == null)) throw new AssertionError(" Appelé enableAsyncLoading lors de l'initialisation de l'appli");
    long l = a(bQo, paramShort1, paramShort2, 0);
    gPK.a(l, new bJk(paramShort1, paramShort2));
  }

  public static void cuh()
  {
    iji = true;
  }

  public static void cui() {
    if ((!bB) && (!iji)) throw new AssertionError();
    gPK = new ckD("topology loader");
  }

  public static void hJ(boolean paramBoolean)
  {
    ijj = paramBoolean;
  }

  public static boolean cuj() {
    return iji;
  }

  public static void setPath(String paramString) {
    try {
      gPM = dtb.getURL(paramString).toString();
      if (!gPM.endsWith("/"))
        gPM += "/";
    } catch (IOException localIOException) {
      K.error("Invalid path : " + paramString, localIOException);
    }
  }

  public static void sH(int paramInt)
  {
    if ((!bB) && (!iji)) throw new AssertionError("Can't set worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    bQo = paramInt;
  }

  public static int anM() {
    if ((!bB) && (!iji)) throw new AssertionError("Can't get worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return bQo;
  }

  private static String a(String paramString, int paramInt, short paramShort1, short paramShort2) {
    if ((!bB) && ((paramString == null) || (!paramString.contains("%d")) || (!paramString.endsWith("/")))) throw new AssertionError();
    return String.format(gPM, new Object[] { Integer.valueOf(paramInt) }) + paramShort1 + '_' + paramShort2;
  }

  public static void c(int paramInt, short paramShort1, short paramShort2)
  {
    K.debug("START getHashCode " + bQo);
    long l = a(paramInt, paramShort1, paramShort2, 0);

    K.debug("START m_mapsSynchronizer " + bQo);
    synchronized (ijm) {
      K.debug("START contains " + bQo);
      if (ijl.N(l)) {
        return;
      }

      K.debug("START createMapPath " + bQo);
      String str = a(gPM, paramInt, paramShort1, paramShort2);
      K.debug("START wrap " + bQo);
      aYQ localaYQ = aYQ.V(dtb.readFile(str));

      K.debug("START readByte " + bQo);
      byte b = localaYQ.readByte();
      K.debug("START createTopologyMap " + bQo);
      dNg localdNg = Nz.ah(b);
      if (localdNg == null) {
        K.error("Unable to create map (" + paramShort1 + "; " + paramShort2 + ";" + paramInt + ")");
        return;
      }
      K.debug("START load " + bQo);
      localdNg.d(localaYQ);
      if ((!bB) && ((asc.jT(localdNg.hY) != paramShort1) || (asc.jU(localdNg.hZ) != paramShort2))) throw new AssertionError();
      ijl.put(l, localdNg);
      K.debug("END loadMap " + bQo);
    }
  }

  public static void J(short paramShort1, short paramShort2) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't loadMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    K.debug("START loadMap " + bQo);
    c(bQo, paramShort1, paramShort2);
    K.debug("START addTopologyMapInstance " + bQo);
    b(bQo, paramShort1, paramShort2, (short)0);
    K.debug("END loadMap " + bQo);
  }

  public static void S(short paramShort1, short paramShort2) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't loadMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    long l = a(bQo, paramShort1, paramShort2, 0);
    if (gPK != null)
      gPK.fD(l);
    synchronized (ijm) {
      ijl.remove(l);
      ijk.remove(l);
    }
  }

  public static tF a(int paramInt, short paramShort1, short paramShort2, short paramShort3)
  {
    long l = a(paramInt, paramShort1, paramShort2, paramShort3);
    if (gPK != null) {
      gPK.hy(l);
    }
    synchronized (ijm) {
      return (tF)ijk.get(l);
    }
  }

  public static tF t(short paramShort1, short paramShort2) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return a(bQo, paramShort1, paramShort2, (short)0);
  }

  public static tF b(int paramInt1, int paramInt2, int paramInt3, short paramShort) {
    short s1 = (short)asc.jT(paramInt2);
    short s2 = (short)asc.jU(paramInt3);

    return a(paramInt1, s1, s2, paramShort);
  }

  public static tF dV(int paramInt1, int paramInt2) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getMapFromCell without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return b(bQo, paramInt1, paramInt2, (short)0);
  }

  public static void reset() {
    if (gPK != null)
      gPK.clear();
    synchronized (ijm) {
      ijl.clear();
      ijk.clear();
    }
  }

  public static tF b(int paramInt, short paramShort1, short paramShort2, short paramShort3)
  {
    long l1 = a(paramInt, paramShort1, paramShort2, paramShort3);
    synchronized (ijm) {
      tF localtF = (tF)ijk.get(l1);
      if (localtF != null) {
        return localtF;
      }
      long l2 = l1 & 0xFFFF0000;
      dNg localdNg = (dNg)ijl.get(l2);
      if ((!bB) && (localdNg == null)) throw new AssertionError("The cell (" + paramShort1 + "; " + paramShort2 + ") in world " + paramInt + " belongs to a map not loaded");
      localtF = new tF(localdNg);
      ijk.put(l1, localtF);
      return localtF;
    }
  }

  public static void c(int paramInt1, int paramInt2, int paramInt3, short paramShort) {
    long l = a(paramInt1, paramInt2, paramInt3, paramShort);
    synchronized (ijm) {
      ijk.remove(l);
    }
  }

  public static void a(int paramInt1, short paramShort, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, cGw paramcGw)
  {
    paramcGw.reset();

    if (paramInt2 > paramInt4) {
      i = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = i;
    }
    if (paramInt3 > paramInt5) {
      i = paramInt3;
      paramInt3 = paramInt5;
      paramInt5 = i;
    }

    paramInt2 -= paramInt6;
    paramInt3 -= paramInt6;
    paramInt4 += paramInt6;
    paramInt5 += paramInt6;

    int i = asc.jT(paramInt2);
    int j = asc.jU(paramInt3);

    int k = asc.jT(paramInt4);
    int m = asc.jU(paramInt5);

    for (int n = j; n <= m; n++)
      for (int i1 = i; i1 <= k; i1++) {
        tF localtF = a(paramInt1, (short)i1, (short)n, paramShort);

        paramcGw.c(localtF, i1, n);
      }
  }

  public static void a(int paramInt1, short paramShort, int paramInt2, int paramInt3, int paramInt4, cGw paramcGw)
  {
    a(paramInt1, paramShort, paramInt2, paramInt3, paramInt2, paramInt3, paramInt4, paramcGw);
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, cGw paramcGw) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    a(bQo, (short)0, paramInt1, paramInt2, paramInt3, paramInt4, 9, paramcGw);
  }

  public static void a(short paramShort1, byte paramByte, short paramShort2)
  {
    eUu.b(paramShort1, paramByte, paramShort2);
  }

  public static short T(int paramInt1, int paramInt2, short paramShort)
  {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    if ((!bB) && (ijj)) throw new AssertionError("Can't call getPossibleNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = dV(paramInt1, paramInt2);
    if ((localtF == null) || (localtF.I(paramInt1, paramInt2)))
      return -32768;
    try {
      int i = localtF.BV().a(paramInt1, paramInt2, beo, 0);
      b(localtF, 0, i);
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      K.error("", localArrayIndexOutOfBoundsException);
    }
    int j = localtF.BV().a(paramInt1, paramInt2, beo, 0);
    b(localtF, 0, j);
    return cTI.a(0, j, beo, (short)(paramShort + eUu.ceU()), eUu.ceT());
  }

  public static short dW(int paramInt1, int paramInt2)
  {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return d(bQo, paramInt1, paramInt2, (short)0);
  }

  public static short d(int paramInt1, int paramInt2, int paramInt3, short paramShort)
  {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call getHighestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort);
    if (localtF == null) {
      K.error("The cell (" + paramInt2 + "; " + paramInt3 + ", instance " + paramInt1 + ") belongs to a map not loaded");
      return -32768;
    }
    if (localtF.I(paramInt2, paramInt3))
      return -32768;
    try
    {
      int i = localtF.BV().a(paramInt2, paramInt3, beo, 0);
      b(localtF, 0, i);
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      K.error("", localArrayIndexOutOfBoundsException);
    }
    int j = localtF.BV().a(paramInt2, paramInt3, beo, 0);
    b(localtF, 0, j);
    return cTI.a(0, j, beo, (short)32767, eUu.ceT());
  }

  public static short U(int paramInt1, int paramInt2, short paramShort)
  {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return a(bQo, paramInt1, paramInt2, paramShort, (short)0);
  }

  public static short a(int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2)
  {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call getNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort2);

    if (localtF == null) {
      K.error("MapInstance is null for parameters : worldId=" + paramInt1 + ", pos=[" + paramInt2 + ";" + paramInt3 + "], InstanceUid=" + paramShort2);
      return -32768;
    }

    if (localtF.I(paramInt2, paramInt3)) {
      return -32768;
    }
    int i = localtF.BV().a(paramInt2, paramInt3, beo, 0);
    b(localtF, 0, i);
    int j = 32767;
    short s = -32768;
    for (int k = 0; k < i; k++) {
      bep localbep = beo[k];
      if (localbep.flI != -1)
      {
        if (localbep.aOl != -32768)
        {
          if (!localbep.gPY)
          {
            int m = Math.abs(localbep.aOl - paramShort1);
            if (m < j) {
              j = (short)m;
              s = localbep.aOl;
            }
          }
        }
      }
    }
    return s;
  }

  public static cYk a(int paramInt1, short paramShort, cYk paramcYk, int paramInt2)
  {
    return a(paramInt1, paramShort, paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramInt2);
  }

  public static cYk a(int paramInt1, short paramShort1, int paramInt2, int paramInt3, short paramShort2, int paramInt4)
  {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call getNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort1);
    if (localtF == null) {
      return null;
    }

    for (int k = 1; k <= paramInt4; k++)
    {
      int i;
      int j;
      short s;
      for (int m = 0; m < k; m++) {
        i = paramInt2 + k - m;
        j = paramInt3 - m;
        s = a(paramInt1, i, j, paramShort2, paramShort1);
        if (s != -32768)
          return new cYk(i, j, s);
      }
      for (m = 0; m < k; m++) {
        i = paramInt2 - m;
        j = paramInt3 - k + m;
        s = a(paramInt1, i, j, paramShort2, paramShort1);
        if (s != -32768)
          return new cYk(i, j, s);
      }
      for (m = 0; m < k; m++) {
        i = paramInt2 - k + m;
        j = paramInt3 + m;
        s = a(paramInt1, i, j, paramShort2, paramShort1);
        if (s != -32768)
          return new cYk(i, j, s);
      }
      for (m = 0; m < k; m++) {
        i = paramInt2 + m;
        j = paramInt3 + k - m;
        s = a(paramInt1, i, j, paramShort2, paramShort1);
        if (s != -32768) {
          return new cYk(i, j, s);
        }
      }
    }
    return null;
  }

  public static short V(int paramInt1, int paramInt2, short paramShort) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return b(bQo, paramInt1, paramInt2, paramShort, (short)0);
  }

  public static short b(int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2) {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort2);
    if (localtF == null) {
      return -32768;
    }
    int i = localtF.BV().a(paramInt2, paramInt3, beo, 0);
    int j = 32767;
    short s = paramShort1;
    for (int k = 0; k < i; k++) {
      int m = Math.abs(beo[k].aOl - paramShort1);
      if (m < j) {
        j = (short)m;
        s = beo[k].aOl;
      }
    }
    return s;
  }

  public static boolean W(int paramInt1, int paramInt2, short paramShort) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't isIndoor without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return c(bQo, paramInt1, paramInt2, paramShort, (short)0);
  }

  public static boolean c(int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2) {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call isIndoor in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort2);
    if ((!bB) && (localtF == null)) throw new AssertionError("The cell (" + paramInt2 + "; " + paramInt3 + ") belongs to a map not loaded");

    return localtF.f(paramInt2, paramInt3, paramShort1);
  }

  public static boolean X(int paramInt1, int paramInt2, short paramShort) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't isWalkable without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return d(bQo, paramInt1, paramInt2, paramShort, (short)0);
  }

  public static boolean d(int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2) {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call isMoboSterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort2);
    if ((!bB) && (localtF == null)) throw new AssertionError("The cell (" + paramInt2 + "; " + paramInt3 + ") belongs to a map not loaded");

    bep localbep = a(localtF, paramInt2, paramInt3, paramShort1);
    return (localbep == null) || (localbep.bsf());
  }

  public static boolean Y(int paramInt1, int paramInt2, short paramShort) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't isFightoSterile without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return e(bQo, paramInt1, paramInt2, paramShort, (short)0);
  }

  public static boolean e(int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2) {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call isFightoSterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort2);
    if (localtF == null) {
      K.warn("On essaye d'accéder à une cellule dans une map pas chargée : (" + paramInt2 + ", " + paramInt3 + ")@" + paramInt1);
      return false;
    }

    bep localbep = a(localtF, paramInt2, paramInt3, paramShort1);
    return (localbep == null) || (localbep.bse());
  }

  public static boolean Z(int paramInt1, int paramInt2, short paramShort) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't isFightoSterile without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return f(bQo, paramInt1, paramInt2, paramShort, (short)0);
  }

  public static boolean f(int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2) {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call isIESterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort2);
    if (localtF == null) {
      K.warn("On essaye d'accéder à une cellule dans une map pas chargée : (" + paramInt2 + ", " + paramInt3 + ")@" + paramInt1);
      return false;
    }

    bep localbep = a(localtF, paramInt2, paramInt3, paramShort1);
    return (localbep == null) || (localbep.bsg());
  }

  public static boolean v(int paramInt1, int paramInt2, short paramShort) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't isWalkable without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return g(bQo, paramInt1, paramInt2, paramShort, (short)0);
  }

  public static boolean g(int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2) {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call isWalkable in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort2);
    if ((!bB) && (localtF == null)) throw new AssertionError("The cell (" + paramInt2 + "; " + paramInt3 + ") belongs to a map not loaded");
    if (localtF.i(paramInt2, paramInt3, paramShort1)) {
      return false;
    }
    return a(localtF, paramInt2, paramInt3, paramShort1) != null;
  }

  public static short[] dX(int paramInt1, int paramInt2) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getWalkableZ without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return e(bQo, paramInt1, paramInt2, (short)0);
  }

  public static short[] e(int paramInt1, int paramInt2, int paramInt3, short paramShort)
  {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort);
    if ((localtF == null) || (localtF.I(paramInt2, paramInt3)))
      return bPR.eWl;
    int i = localtF.BV().a(paramInt2, paramInt3, beo, 0);
    bHu localbHu = new bHu();
    for (int j = 0; j < i; j++)
      if (beo[j].flI != -1)
      {
        if (!beo[j].gPY)
        {
          if (!localtF.i(paramInt2, paramInt3, beo[j].aOl))
          {
            localbHu.add(beo[j].aOl);
          }
        }
      }
    localbHu.reverse();
    return localbHu.bOU();
  }

  public static short[] dY(int paramInt1, int paramInt2) {
    if ((!bB) && (!iji)) throw new AssertionError("Can't getWalkableZ without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations");
    return f(bQo, paramInt1, paramInt2, (short)0);
  }

  public static short[] f(int paramInt1, int paramInt2, int paramInt3, short paramShort)
  {
    if ((!bB) && (ijj)) throw new AssertionError("Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations");

    tF localtF = b(paramInt1, paramInt2, paramInt3, paramShort);
    if (localtF == null)
      return bPR.eWl;
    int i = localtF.BV().a(paramInt2, paramInt3, beo, 0);
    short[] arrayOfShort = new short[i];
    for (int j = 0; j < i; j++)
    {
      arrayOfShort[j] = beo[j].aOl;
    }
    return arrayOfShort;
  }

  public static boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i = Math.abs(paramInt3 - paramInt1);
    if (i > 1) {
      return false;
    }
    int j = Math.abs(paramInt4 - paramInt2);
    if (j > 1) {
      return false;
    }
    if ((i == j) && (
      (!paramBoolean) || (i == 0))) {
      return false;
    }
    return true;
  }

  public static void a(int paramInt, short paramShort1, short paramShort2, short paramShort3, dNg paramdNg) {
    long l = a(paramInt, paramShort1, paramShort2, paramShort3);
    synchronized (ijm) {
      ijl.put(l, paramdNg);
      ijk.put(l, new tF(paramdNg));
    }
  }

  private static long a(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    paramLong1 += 32767L;
    paramLong2 += 32767L;
    return paramLong1 << 48 | paramLong2 << 32 | (paramInt1 & 0xFFFF) << 16 | paramInt2 & 0xFFFF;
  }

  private static bep a(tF paramtF, int paramInt1, int paramInt2, short paramShort) {
    if (paramtF.i(paramInt1, paramInt2, paramShort)) {
      return null;
    }
    int i = paramtF.BV().a(paramInt1, paramInt2, beo, 0);
    for (int j = 0; j < i; j++)
      if (beo[j].aOl == paramShort)
      {
        return beo[j].flI == -1 ? null : beo[j];
      }
    return null;
  }

  private static void b(tF paramtF, int paramInt1, int paramInt2) {
    for (int i = 0; i < paramInt2; i++) {
      bep localbep = beo[(paramInt1 + i)];
      if (paramtF.i(localbep.hY, localbep.hZ, localbep.aOl))
        localbep.flI = -1;
    }
  }

  public static void main(String[] paramArrayOfString)
  {
    try
    {
      int i = 332;
      gPM = "jar:file:/F:/Work/Code/Wakfu_export_data/data/wakfu/client/contents/maps/tplg/%d.jar!/";
      c(332, (short)0, (short)0);
      tF localtF = b(332, (short)0, (short)0, (short)0);
      System.out.println("");
    } catch (IOException localIOException) {
      K.error("", localIOException);
    }
  }
}