import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class crO
{
  public static final int ibp = 86;
  public static final int ibq = 43;
  public static final int ibr = 10;
  private static final int ibs = 5;
  private static final int ibt = 7;
  private static final int gaC = 35;
  private static final float ibu = 0.000976563F;
  private static final float ibv = 0.001736111F;
  private static final Logger K = Logger.getLogger(crO.class);

  final Xg gPL = new Xg();

  private final ArrayList ibw = new ArrayList();

  protected final qX ibx = new qX();
  private float ayE;
  private float ayF;
  private final avI iby = new avI(null);

  public void initialize(int paramInt)
  {
    this.gPL.aV(paramInt);
  }

  public void clear() {
    for (gn localgn : this.gPL) {
      if (localgn != null) {
        localgn.clear();
      }
    }
    this.gPL.clear();
    this.ibw.clear();
    this.ibx.clear();
    avI.a(this.iby);
  }

  boolean cqi() {
    return avI.b(this.iby);
  }

  float bjH() {
    return this.ayE;
  }

  float bjI() {
    return this.ayF;
  }

  public int cqj() {
    return this.gPL.size();
  }

  void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDL paramdDL)
  {
    paramInt1 = bCO.aB(paramInt1 * 0.001736111F);
    paramInt3 = bCO.bD(paramInt3 * 0.001736111F);

    paramInt2 = bCO.bD(paramInt2 * 0.000976563F);
    paramInt4 = bCO.aB(paramInt4 * 0.000976563F);

    if (!this.iby.l(paramInt1, paramInt3, paramInt2, paramInt4))
    {
      this.ibx.a(this.ayE, this.ayF, 35, this.ibw);
      return;
    }

    this.ayE = ((paramInt2 + paramInt4) / 2.0F);
    this.ayF = ((paramInt1 + paramInt3) / 2.0F);
    this.ibw.clear();
    int k;
    if ((paramInt2 <= -32768) || (paramInt4 >= 32767) || (paramInt3 <= -32768) || (paramInt1 >= 32767))
    {
      K.error("on ne devrait pas être là!! chargement de la map: " + paramInt1 + "," + paramInt2);
    }
    else
    {
      i = paramInt4 - paramInt2;
      if (i > 5) {
        j = (i - 5) / 2;
        paramInt4 -= j;
        paramInt2 += j;
      }
      int j = paramInt1 - paramInt3;
      if (j > 7) {
        k = (j - 7) / 2;
        paramInt1 -= k;
        paramInt3 += k;
      }
      for (k = paramInt3; k <= paramInt1; k++)
        for (int m = paramInt2; m <= paramInt4; m++) {
          int n = bCO.cN(m, k);
          if (paramdDL.ff(m, k))
          {
            gn localgn2 = (gn)this.ibx.tB(n);
            if (localgn2 == null) {
              localgn2 = h(paramString, m, k);
              this.ibx.put(n, localgn2);
            }

            this.ibw.add(localgn2);
          }
        }
    }
    this.gPL.clear();

    for (int i = this.ibw.size() - 1; i >= 0; i--) {
      gn localgn1 = (gn)this.ibw.get(i);
      k = bCO.G(localgn1.aEd, localgn1.aEe);
      this.gPL.put(k, localgn1);
    }
  }

  protected gn h(String paramString, int paramInt1, int paramInt2) {
    gn localgn = new gn(paramInt1, paramInt2);
    try
    {
      localgn.load(paramString);
    } catch (FileNotFoundException localFileNotFoundException) {
      K.error("file not found to load map (" + paramInt1 + "; " + paramInt2 + ")");
    } catch (IOException localIOException) {
      K.error("Unable to load map (" + paramInt1 + "; " + paramInt2 + ")", localIOException);
    }
    return localgn;
  }

  public void lT(String paramString) {
    Iterator localIterator = this.gPL.iterator();
    int[] arrayOfInt1 = new int[4];
    int[] arrayOfInt2 = new int[arrayOfInt1.length];
    int[] arrayOfInt3 = new int[arrayOfInt1.length];
    int[] arrayOfInt4 = new int[arrayOfInt1.length];
    Arrays.fill(arrayOfInt4, 2147483647);

    while (localIterator.hasNext()) {
      gn localgn = (gn)localIterator.next();

      arrayOfInt1[3] = localgn.a(paramString, arrayOfInt1);

      arrayOfInt1[0] = localgn.aDd.size();

      for (int i = 0; i < arrayOfInt1.length; i++) {
        arrayOfInt3[i] += arrayOfInt1[i];
        if (arrayOfInt1[i] < arrayOfInt4[i]) {
          arrayOfInt4[i] = arrayOfInt1[i];
        }
        if (arrayOfInt1[i] > arrayOfInt2[i]) {
          arrayOfInt2[i] = arrayOfInt1[i];
        }
      }
    }
    float f = this.gPL.size();
    K.info("exportPath = " + paramString + " mapCount=" + f);
    K.info("Num elements = " + arrayOfInt3[0] + "\tsize= " + arrayOfInt3[3] + "octets");
    K.info("Avg elements by maps = " + arrayOfInt3[0] / f + "\tsize = " + arrayOfInt3[3] / f + "\tNum Groupe = " + arrayOfInt3[1] / f + "\tnumColors = " + arrayOfInt3[2] / f);

    K.info("Max elements by maps = " + arrayOfInt2[0] + "\tsize = " + arrayOfInt2[3] + "\tNum Groupe = " + arrayOfInt2[1] + "\tnumColors = " + arrayOfInt2[2]);
    K.info("Min elements by maps = " + arrayOfInt4[0] + "\tsize = " + arrayOfInt4[3] + "\tNum Groupe = " + arrayOfInt4[1] + "\tnumColors = " + arrayOfInt4[2]);
  }

  public static int dE(int paramInt1, int paramInt2) {
    return (int)((paramInt1 - paramInt2) * 86 * 0.5F);
  }

  public static int R(int paramInt1, int paramInt2, int paramInt3) {
    return (int)(-(paramInt1 + paramInt2) * 21.5F) + paramInt3 * 10;
  }

  public static float dF(int paramInt1, int paramInt2) {
    return bCO.bD((paramInt1 - paramInt2) * 86 * 0.5F);
  }

  public static float S(int paramInt1, int paramInt2, int paramInt3) {
    float f = Math.abs(paramInt1) % 2 == Math.abs(paramInt2) % 2 ? 0.0F : 0.5F;
    return bCO.bD(-(paramInt1 + paramInt2) * 21.5F) + paramInt3 * 10 + f;
  }

  public void a(int paramInt1, int paramInt2, ScreenElement paramScreenElement)
  {
    a(this.gPL, paramInt1, paramInt2, paramScreenElement);
  }

  protected static gn a(Xg paramXg, int paramInt1, int paramInt2, ScreenElement paramScreenElement) {
    int i = bCO.cN(paramInt1, paramInt2);
    gn localgn = (gn)paramXg.get(i);
    if (localgn == null) {
      localgn = new gn(paramInt1, paramInt2);
      paramXg.put(i, localgn);
    }
    localgn.b(paramScreenElement);
    return localgn;
  }
}