import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class crX extends bbg
{
  public static final vY ibG;
  public static final vY ibH;
  public static final vY ibI;
  public static final vY ibJ;
  protected CF SN;
  protected boolean Vm = false;
  protected static final cSJ ibK;
  private static final Logger K;
  private bIN ibL;
  private ArrayList ibM;
  private MD ibN;
  private MD ibO;
  private boolean ibP;
  private static final boolean DEBUG = false;

  public crX()
  {
    this(bIN.gJf, ibK);
  }

  private void cqs() {
    if (!this.ibM.isEmpty()) {
      this.ibN = wo(0);
      this.ibO = new MD(this.ibN);
    }
  }

  public crX(bIN parambIN, cSJ[] paramArrayOfcSJ) {
    this.ibL = parambIN;
    this.ibM = new ArrayList(paramArrayOfcSJ.length);
    for (cSJ localcSJ : paramArrayOfcSJ) {
      b(localcSJ);
    }
    cqs();
  }

  public crX(bIN parambIN, cSJ paramcSJ) {
    this.ibL = parambIN;
    this.ibM = new ArrayList(1);
    b(paramcSJ);
    cqs();
  }

  public crX(crX paramcrX) {
    if ((!bB) && (paramcrX.ibL == null)) throw new AssertionError("On copie une image releasée");
    this.ibL = paramcrX.ibL;

    int i = paramcrX.ibM.size();
    this.ibM = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      b(new cSJ(paramcrX.wn(j)));
    }

    cqs();
  }

  public crX(String paramString) {
    lV(paramString);
  }

  public boolean lU(String paramString) {
    try {
      this.ibN = lW(paramString);
      if (this.ibN != null) {
        this.SN = dqc.cXp().k(new URL(paramString));
        this.ibO = new MD(bCO.sj(this.ibN.getX()), bCO.sj(this.ibN.getY()));
      }
      else {
        return false;
      }
    } catch (MalformedURLException localMalformedURLException) {
      return lV(paramString);
    }
    return true;
  }

  public boolean lV(String paramString) {
    return a(lX(paramString));
  }

  private boolean a(crX paramcrX) {
    if ((!bB) && (paramcrX.ibL == null)) throw new AssertionError("On copie une image releasée");
    if (paramcrX == null) {
      return false;
    }
    this.ibL = paramcrX.ibL;
    if (this.ibM != null) {
      for (int i = 0; i < this.ibM.size(); i++) {
        ((cSJ)this.ibM.get(i)).axl();
      }
    }
    this.ibM = paramcrX.ibM;
    cqs();

    paramcrX.ibM = null;
    paramcrX.axl();
    return true;
  }

  public static crX b(byte[] paramArrayOfByte, String paramString) {
    crX localcrX = c(paramArrayOfByte, paramString);
    if (localcrX == null) {
      return null;
    }
    localcrX.cqs();
    return localcrX;
  }

  public boolean A(String[] paramArrayOfString)
  {
    if ((!bB) && (paramArrayOfString.length <= 0)) throw new AssertionError();
    cSJ localcSJ1 = (cSJ)this.ibM.remove(0);
    localcSJ1.axl();

    bIN localbIN = null;
    int i = -1;
    int j = -1;

    for (int k = 0; k < paramArrayOfString.length; k++) {
      crX localcrX = lX(paramArrayOfString[k]);
      if (localcrX == null) {
        return false;
      }

      if ((localbIN != null) && (!localbIN.equals(localcrX.ibL))) {
        localcrX.axl();
        return false;
      }

      localbIN = localcrX.ibL;
      if ((!bB) && (localcrX.ibL == null)) throw new AssertionError("image releasée");
      int m = 0; for (int n = localcrX.cqt(); m < n; m++) {
        cSJ localcSJ2 = localcrX.wn(m);

        if ((i == -1) && (j == -1)) {
          i = localcSJ2.getWidth();
          j = localcSJ2.getHeight();
        } else if ((i != localcSJ2.getWidth()) || (j != localcSJ2.getHeight())) {
          localcrX.axl();
          return false;
        }

        b(localcSJ2);
      }

      localcrX.axl();
    }

    this.ibL = localbIN;

    cqs();

    return true;
  }

  public void a(int paramInt, aWD paramaWD) {
    ((cSJ)this.ibM.get(paramInt)).a(paramaWD);
  }

  public void a(int paramInt, cSJ paramcSJ) {
    paramcSJ.gQ();
    ((cSJ)this.ibM.get(paramInt)).axl();
    this.ibM.set(paramInt, paramcSJ);
  }

  public final void b(cSJ paramcSJ) {
    paramcSJ.gQ();
    this.ibM.add(paramcSJ);
  }

  public final boolean isEmpty() {
    return (this.ibM == null) || (this.ibM.isEmpty()) || (this.ibM.get(0) == ibK);
  }

  public cSJ wn(int paramInt) {
    if ((!bB) && (paramInt >= this.ibM.size())) throw new AssertionError();
    return (cSJ)this.ibM.get(paramInt);
  }

  public final int cqt() {
    if (this.ibM == null)
      return 0;
    return this.ibM.size();
  }

  public final bIN cqu() {
    return this.ibL;
  }

  public final MD wo(int paramInt) {
    return wn(paramInt).cqv();
  }

  public MD cqv() {
    return this.ibN;
  }

  public bNa T(int paramInt1, int paramInt2, int paramInt3) {
    return wn(paramInt3).ez(paramInt1, paramInt2);
  }

  public void ht(boolean paramBoolean) {
    this.ibP = paramBoolean;
  }

  public MD cqw() {
    return this.ibO;
  }

  public final void cqx() {
    int i = 0; for (int j = cqt(); i < j; i++) {
      cSJ localcSJ = c(wn(i));
      a(i, localcSJ);
      localcSJ.axl();
    }
    if (!this.ibM.isEmpty())
      this.ibO = wo(0);
  }

  private static cSJ c(cSJ paramcSJ) {
    cSJ localcSJ = a(paramcSJ.getData(), paramcSJ.getWidth(), paramcSJ.getHeight(), paramcSJ.getBitDepth());
    localcSJ.eF(paramcSJ.cIB());
    localcSJ.W(paramcSJ.cIu(), paramcSJ.cIv());
    return localcSJ;
  }

  public void cqy() {
    this.Vm = true;
  }

  public final void a(float paramFloat1, float paramFloat2, vY paramvY) {
    for (cSJ localcSJ : this.ibM) {
      localcSJ.a(paramFloat1, paramFloat2, paramvY);
    }
    cqs();
  }

  public final void cqz() {
    for (int i = this.ibM.size() - 1; i >= 1; i--) {
      cSJ localcSJ1 = (cSJ)this.ibM.get(i);
      cSJ localcSJ2 = (cSJ)this.ibM.get(i - 1);
      if (localcSJ1.getBitDepth() != 32) {
        a(i - 1, localcSJ1);
      }
      else
      {
        localcSJ2.d(localcSJ1);

        this.ibM.remove(i);
        localcSJ1.axl();
      }
    }
  }

  public static MD lW(String paramString) { aoI localaoI = lY(paramString);
    if (localaoI == null) {
      return null;
    }
    MD localMD = localaoI.fg(paramString);
    if (localMD == null) {
      K.error("Impossible de lire l'image " + paramString);
    }

    return localMD; }

  public static crX lX(String paramString)
  {
    aoI localaoI = lY(paramString);
    if (localaoI == null) {
      return null;
    }
    crX localcrX = localaoI.bU(paramString);
    if (localcrX == null) {
      K.error("Impossible de lire l'image " + paramString);
    }

    return localcrX;
  }

  public static crX c(byte[] paramArrayOfByte, String paramString) {
    if ((!bB) && (paramArrayOfByte == null)) throw new AssertionError();
    aoI localaoI = dCs.dfa().qP(paramString);
    if (localaoI == null) {
      K.error("No ImageReader registered for file ext (." + paramString + ")");
      K.error("Did you forget to call ImageReaderFactory.getInstance().registerReader (\"" + paramString + "\", new " + paramString + "Reader ()); ?");
      return null;
    }

    crX localcrX = localaoI.y(paramArrayOfByte);
    if (localcrX == null) {
      K.error("Impossible de lire les données d'image.");
    }

    return localcrX;
  }

  public static void o(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt / 8;
    int j;
    int k;
    if (paramInt == 16)
    {
      j = 0;
      while (j < paramArrayOfByte.length) {
        k = paramArrayOfByte[j];
        int m = paramArrayOfByte[(j + 1)];

        paramArrayOfByte[(j++)] = ((byte)(m << 3 | k & 0x7));
        paramArrayOfByte[(j++)] = ((byte)(m & 0xE0 | k >> 3));
      }
    } else if ((paramInt == 24) || (paramInt == 32)) {
      j = 0;
      while (j < paramArrayOfByte.length) {
        k = paramArrayOfByte[j];
        paramArrayOfByte[j] = paramArrayOfByte[(j + 2)];
        paramArrayOfByte[(j + 2)] = k;
        j += i;
      }
    }
  }

  public static void p(byte[] paramArrayOfByte, int paramInt)
  {
    if ((!bB) && (paramArrayOfByte.length % paramInt != 0)) throw new AssertionError("Unable to flip the image since the buffer length is not a muptiple of line size");

    byte[] arrayOfByte = new byte[paramInt];
    int i = paramArrayOfByte.length / paramInt;

    int j = paramArrayOfByte.length - paramInt;
    int k = 0;
    for (int m = 0; m < i / 2; m++) {
      System.arraycopy(paramArrayOfByte, k, arrayOfByte, 0, paramInt);
      System.arraycopy(paramArrayOfByte, j, paramArrayOfByte, k, paramInt);
      System.arraycopy(arrayOfByte, 0, paramArrayOfByte, j, paramInt);

      j -= paramInt;
      k += paramInt;
    }
  }

  public static cSJ a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = bCO.sj(paramInt1);
    int j = bCO.sj(paramInt2);

    if ((i == paramInt1) && (j == paramInt2))
    {
      return new cSJ(i, j, (short)paramInt3, null, paramArrayOfByte, 0, paramArrayOfByte.length);
    }

    int k = paramInt3 / 8;
    byte[] arrayOfByte = new byte[i * j * k];
    int m = paramInt1 * k;
    int n = i * k;
    int i1 = paramArrayOfByte.length / m;

    int i2 = 0;
    int i3 = 0;
    for (int i4 = 0; i4 < i1; i4++) {
      System.arraycopy(paramArrayOfByte, i2, arrayOfByte, i3, m);
      i2 += m;
      i3 += n;
    }

    return new cSJ(i, j, (short)paramInt3, null, arrayOfByte);
  }

  public static cSJ a(cSJ paramcSJ, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if ((!bB) && ((paramInt1 < 0) || (paramInt3 <= paramInt1) || (paramInt3 > paramcSJ.getHeight()))) throw new AssertionError();
    if ((!bB) && ((paramInt2 < 0) || (paramInt4 <= paramInt2) || (paramInt4 > paramcSJ.getWidth()))) throw new AssertionError();

    int i = paramcSJ.getBitDepth() / 8;

    int j = paramInt4 - paramInt2;
    int k = paramInt3 - paramInt1;
    byte[] arrayOfByte1 = new byte[j * k * i];
    int m = paramcSJ.getWidth() * i;
    int n = paramInt3 - paramInt1;
    int i1 = j * i;

    byte[] arrayOfByte2 = paramcSJ.getData();

    int i2 = paramInt1 * m + paramInt2 * i;
    int i3 = 0;
    for (int i4 = 0; i4 < n; i4++) {
      System.arraycopy(arrayOfByte2, i2, arrayOfByte1, i3, i1);
      i2 += m;
      i3 += i1;
    }

    cSJ localcSJ = new cSJ(j, k, (short)paramcSJ.getBitDepth(), null, arrayOfByte1);
    localcSJ.eF(paramcSJ.cIB());
    return localcSJ;
  }

  public static void a(cSJ paramcSJ, dQx paramdQx) {
    paramdQx.DC(paramcSJ.getWidth());
    paramdQx.DE(paramcSJ.getHeight());
    paramdQx.DD(0);
    paramdQx.DF(0);
    for (int i = 0; i < paramcSJ.getWidth(); i++) {
      for (int j = 0; j < paramcSJ.getHeight(); j++) {
        if (paramcSJ.getAlpha(i, j) != 0)
        {
          if (i < paramdQx.drw())
            paramdQx.DC(i);
          if (i > paramdQx.drx())
            paramdQx.DD(i);
          if (j < paramdQx.dry())
            paramdQx.DE(j);
          if (j > paramdQx.drz()) {
            paramdQx.DF(j);
          }
        }
      }
    }
    if (paramdQx.dry() > paramdQx.drz()) {
      paramdQx.DC(0);
      paramdQx.DD(0);
      paramdQx.DE(0);
      paramdQx.DF(0);
    }
  }

  public void wp(int paramInt) {
    for (cSJ localcSJ : this.ibM)
      localcSJ.za(paramInt);
  }

  public void cqA()
  {
    String str = this.SN.getURL().getFile();
    aoI localaoI = lY(str);
    if (localaoI == null) {
      return;
    }
    if (!a(localaoI.y(this.SN.getData()))) {
      K.error("Impossible de lire l'image " + str);
      return;
    }

    if (this.ibP) {
      cqx();
    }
    this.SN = null;
    this.Vm = true;
  }

  private static aoI lY(String paramString) {
    String str = dtb.pX(paramString).toUpperCase();
    aoI localaoI = dCs.dfa().qP(str);
    if (localaoI == null) {
      K.error("No ImageReader registered for file ext (." + str + ")");
      K.error("Did you forget to call ImageReaderFactory.getInstance().registerReader (\"" + str + "\", new " + str + "Reader ()); ?");
    }
    return localaoI;
  }

  protected void DL()
  {
    super.DL();

    if (this.ibM != null) {
      for (cSJ localcSJ : this.ibM) {
        localcSJ.axl();
      }
      this.ibM = null;
    }

    this.ibL = null;
    this.ibN = null;
    this.ibO = null;
    this.ibP = false;
  }

  static
  {
    ibG = new vY(new float[] { 1.0F });
    ibH = new vY(3);
    ibI = new vY(3);
    ibJ = new vY(3);

    float f1 = 1.5F;
    float f2 = 4.5F;
    float[] arrayOfFloat2 = new float[ibH.getSize() * ibH.getSize()];
    int m = ibH.getSize() / 2;
    float f4 = 0.0F;
    int i1 = -1;
    for (int i2 = -m; i2 < m + 1; i2++) {
      for (int i3 = -m; i3 < m + 1; i3++) {
        float f6 = (float)(0.0707355302630646D * Math.exp(-(i2 * i2 + i3 * i3) / 4.5F));
        f4 += f6;
        arrayOfFloat2[(++i1)] = f6;
      }

    }

    for (i1 = 0; i1 < arrayOfFloat2.length; i1++)
      arrayOfFloat2[i1] /= f4;
    ibH.c(arrayOfFloat2);

    int i = ibI.getSize();
    float[] arrayOfFloat1 = new float[i * i];
    int k = i / 2;
    float f3 = 0.0F;
    int n = -1;
    float f5;
    for (i1 = -k; i1 < k + 1; i1++) {
      for (i2 = -k; i2 < k + 1; i2++) {
        f5 = i + i * i1 * i1 + i2 * i2;
        f3 += f5;
        arrayOfFloat1[(++n)] = f5;
      }

    }

    for (n = 0; n < arrayOfFloat1.length; n++)
      arrayOfFloat1[n] /= f3;
    ibI.c(arrayOfFloat1);

    i = ibJ.getSize();
    arrayOfFloat1 = new float[i * i];
    k = i / 2;
    f3 = 0.0F;
    n = -1;
    for (i1 = -k; i1 < k + 1; i1++) {
      for (i2 = -k; i2 < k + 1; i2++) {
        f5 = 1.0F;
        f3 += 1.0F;
        arrayOfFloat1[(++n)] = 1.0F;
      }

    }

    for (n = 0; n < arrayOfFloat1.length; n++)
      arrayOfFloat1[n] /= f3;
    ibJ.c(arrayOfFloat1);

    K = Logger.getLogger(crX.class);

    i = 128;
    int j = 64;
    byte[] arrayOfByte = new byte[32768];

    ibK = new cSJ(128, 64, (short)32, null, arrayOfByte);
    ibK.za(255);
    ibK.gQ();
  }
}