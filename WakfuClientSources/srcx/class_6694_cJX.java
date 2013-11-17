import java.lang.reflect.Array;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class cJX
{
  private cSR iIv;
  private ArrayList[] iIw;
  private static final cJX iIx = new cJX();
  private static final Logger K = Logger.getLogger(cJX.class);

  private float[] iIy = null;

  private cJX()
  {
    this.iIv = null;
    this.iIw = null;
  }

  public static cJX cDN()
  {
    return iIx;
  }

  public void aa(ArrayList paramArrayList)
  {
    if ((!bB) && (this.iIv != null)) throw new AssertionError("The DirectBufferPoolManager is already initialised and can't be initialised twice");

    int i = 0;
    for (tw localtw1 : paramArrayList) {
      if ((!bB) && (localtw1.BF() < 0)) throw new AssertionError("bufferCounts can't be less than zero");
      if (localtw1.BF() != 0)
      {
        i++;
      }
    }
    if ((!bB) && (i <= 0)) throw new AssertionError("No group created, all buffer counts are null");

    int j = ayA.values().length;
    this.iIv = new cSR(i * 2);

    this.iIw = ((ArrayList[])Array.newInstance(ArrayList.class, j));
    for (int k = 0; k < j; k++) {
      if (k == ayA.dOJ.ordinal())
        this.iIw[k] = null;
      else {
        this.iIw[k] = new ArrayList(i);
      }
    }
    for (tw localtw2 : paramArrayList) {
      if (localtw2.BF() != 0)
      {
        ayA localayA = localtw2.BG();
        if (localayA == ayA.dOJ) {
          this.iIv.put(localtw2.getBufferSize(), new cgE(localtw2));
        }
        else
        {
          this.iIw[localayA.ordinal()].add(new cgE(localtw2));
        }
      }
    }
    K.info("DirectBufferPoolManager allocates " + ciH() / 1024 + "KB");
  }

  public oC xZ(int paramInt) {
    if ((!bB) && (this.iIv == null)) throw new AssertionError("DirectBufferPoolManager is not initialized");
    cgE localcgE = (cgE)this.iIv.get(paramInt);
    if (localcgE == null) {
      K.error("Creating byte buffer pool of size " + paramInt);
      localObject = new tw();
      ((tw)localObject).cT(1);
      ((tw)localObject).setBufferSize(paramInt);
      ((tw)localObject).a(ayA.dOJ);
      this.iIv.put(((tw)localObject).getBufferSize(), new cgE((tw)localObject));
      localcgE = (cgE)this.iIv.get(paramInt);
    }

    Object localObject = (oC)localcgE.ciF();
    if ((!bB) && (localObject == null)) throw new AssertionError("No more free ByteBuffer pools of size " + paramInt);
    return localObject;
  }

  public ayd ya(int paramInt) {
    if ((!bB) && (this.iIw == null)) throw new AssertionError("DirectBufferPoolManager is not initialized");
    if ((!bB) && (this.iIw[ayA.dOK.ordinal()] == null)) throw new AssertionError("No ShortBufferPool initialized");
    return (ayd)a(ayA.dOK, paramInt);
  }

  public final Jh yb(int paramInt) {
    if ((!bB) && (this.iIw == null)) throw new AssertionError("DirectBufferPoolManager is not initialized");
    if ((!bB) && (this.iIw[ayA.dOL.ordinal()] == null)) throw new AssertionError("No FloatBufferPool initialized");
    return (Jh)a(ayA.dOL, paramInt);
  }

  public final int ciH() {
    if ((!bB) && (this.iIv == null) && (this.iIw == null)) throw new AssertionError("DirectBufferPoolManager is not initialized");

    int i = 0;
    Object localObject1;
    if (this.iIv != null) {
      localObject1 = this.iIv.yF();
      while (((dmn)localObject1).hasNext()) {
        ((dmn)localObject1).fl();
        i += ((cgE)((dmn)localObject1).value()).ciH();
      }
    }

    if (this.iIw != null) {
      for (Object localObject2 : this.iIw) {
        if (localObject2 != null)
        {
          for (cgE localcgE : localObject2) {
            i += localcgE.ciH();
          }
        }
      }
    }
    return i;
  }

  public final void cDO()
  {
  }

  private cCE a(ayA paramayA, int paramInt)
  {
    ArrayList localArrayList = null;
    try {
      localArrayList = this.iIw[paramayA.ordinal()];
    } catch (Exception localException) {
      K.error("DEBUG écran noir au lancement", new Exception("stacktrace"));
      return null;
    }
    int i = localArrayList.size();
    for (int j = 0; j < i; j++) {
      cgE localcgE = (cgE)localArrayList.get(j);
      if (localcgE.getSize() >= paramInt)
      {
        cCE localcCE = localcgE.ciF();
        if (localcCE != null)
          return localcCE;
        K.trace("No enough FloatBuffer pool of size " + paramInt);
      }
    }
    if (!bB) throw new AssertionError("No more free " + paramayA + "pools of size " + paramInt);
    return null;
  }

  public void ciK() {
    K.warn("#######################################################");
    K.warn("##### Pool stats");
    K.warn("#######################################################");
    dmn localdmn = this.iIv.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ((cgE)localdmn.value()).ciK();
    }

    for (int i = 0; i < this.iIw.length; i++)
      if (this.iIw[i] != null)
        for (cgE localcgE : this.iIw[i])
          localcgE.ciK();
  }
}