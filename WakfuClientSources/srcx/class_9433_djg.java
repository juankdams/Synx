import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

public class djg
  implements doR
{
  protected static final Logger K = Logger.getLogger(djg.class);
  private static final int CHUNK_SIZE = 8500;
  private static final int lfj = 0;
  private static final int lfk = 1;
  private static final int lfl = -1;
  private static final int lfm = -2;
  private static final int lfn = -128;
  private static final int lfo = -129;
  private static final int lfp = -130;
  private int lfq;
  private boolean lfr = true;

  private final AtomicInteger gPg = new AtomicInteger(0);

  private int lfs = 8500;

  private boolean lft = false;

  private static final boolean lfu = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
  private qb lfv;
  private bNy lfw;
  private Iw lfx;
  private cAE lfy;
  private dPO lfz;
  private cPr lfA;
  private int lfB = 0;
  private long lfC;
  private long[] lfD;
  private long[] lfE;
  private int[] lfF;
  private long[] lfG;
  private apK[] lfH;
  private aI[] lfI;
  private long lfJ;
  private boolean lfK = false;
  private int lfL;
  private int lfM;
  private blq lfN;
  private float lfO;
  private static final int lfP = 8192;
  private final byte[] lfQ = new byte[8192];
  private final float[][][] lfR = new float[1][][];

  private final int[] lfS = new int[2];

  public String getDescription()
  {
    return this.lfN.getDescription();
  }

  public String als() {
    return this.lfN.als();
  }

  private boolean cRK() {
    apK localapK = new apK();
    aI localaI = new aI();

    this.lfs = Math.min(8500, (int)c(this.lfN));

    Iw localIw = new Iw();
    int[] arrayOfInt = new int[1];
    int i = a(localapK, localaI, arrayOfInt, null);
    int j = arrayOfInt[0];
    int k = (int)this.lfC;

    this.lfw.clear();

    if (i < 0) {
      return false;
    }

    a(this.lfN, 0L, 1);
    this.lfC = d(this.lfN);

    long l = d(localIw);

    if (localIw.RQ() != j) {
      if (a(0L, 0L, l + 1L, j, 0) < 0) {
        return false;
      }
    }
    else if (a(0L, l, l + 1L, j, 0) < 0) {
      return false;
    }

    a(localapK, localaI, k);

    ct(this.lfE[0]);
    return true;
  }

  private boolean cRL() {
    this.lfB = 1;
    this.lfH = new apK[] { new apK() };
    this.lfI = new aI[] { new aI() };

    int[] arrayOfInt = new int[1];
    if (a(this.lfH[0], this.lfI[0], arrayOfInt, null) == -1) {
      return false;
    }

    this.lfL = arrayOfInt[0];

    cRM();

    return true;
  }

  private int getData() {
    int i = this.lfv.ce(this.lfs);
    if (i == -1) {
      K.debug("Stream corrompu : " + getDescription());
      return -128;
    }

    byte[] arrayOfByte = this.lfv.getData();
    int j;
    try {
      j = this.lfN.read(arrayOfByte, i, this.lfs);
    } catch (Exception localException) {
      return -128;
    }

    this.lfv.cf(j);

    if (j == -1) {
      j = 0;
    }
    return j;
  }

  private void cRM() {
    this.lfz.a(this.lfH[0]);
    this.lfA.a(this.lfz);
    this.lfK = true;
  }

  private void cRN() {
    this.lfw.clear();
    this.lfz.clear();
    this.lfA.xn();
    this.lfK = false;
  }

  private int a(Iw paramIw, long paramLong) {
    if (paramLong > 0L) {
      paramLong += this.lfC;
    }
    while (true)
    {
      if ((paramLong > 0L) && (this.lfC >= paramLong)) {
        return -1;
      }
      int i = this.lfv.a(paramIw);
      if (i < 0) {
        this.lfC -= i;
      }
      else
      {
        int j;
        if (i == 0) {
          if (paramLong == 0L)
            return -1;
          j = getData();
          if (j == 0) {
            return -2;
          }
          if (j < 0)
            return -128;
        }
        else {
          j = (int)this.lfC;
          this.lfC += i;
          return j;
        }
      }
    }
  }

  private int d(Iw paramIw) { long l = this.lfC;

    int j = -1;

    while (j == -1) {
      l -= this.lfs;
      if (l < 0L) {
        l = 0L;
      }

      jH(l);

      while (this.lfC < l + this.lfs) {
        i = a(paramIw, l + this.lfs - this.lfC);
        if (i == -128) {
          return -128;
        }

        if (i < 0) {
          if (j == -1)
            return -1;
        }
        else {
          j = i;
        }
      }
    }

    jH(j);
    int i = a(paramIw, this.lfs);
    if (i < 0) {
      return -129;
    }

    return j; }

  private void jH(long paramLong)
  {
    a(this.lfN, paramLong, 0);
    this.lfC = paramLong;
    this.lfv.xp();
  }

  private int a(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2) {
    long l1 = paramLong3;
    long l2 = paramLong3;
    Iw localIw = new Iw();

    while (paramLong2 < l1)
    {
      long l3;
      if (l1 - paramLong2 < this.lfs)
        l3 = paramLong2;
      else {
        l3 = (paramLong2 + l1) / 2L;
      }

      jH(l3);
      i = a(localIw, -1L);
      if (i == -128) {
        return -128;
      }
      if ((i < 0) || (localIw.RQ() != paramInt1)) {
        l1 = l3;
        if (i >= 0)
          l2 = i;
      }
      else {
        paramLong2 = i + localIw.bRk + localIw.bRn;
      }
    }
    jH(l2);
    int i = a(localIw, -1L);
    if (i == -128) {
      return -128;
    }

    if ((paramLong2 >= paramLong3) || (i == -1)) {
      this.lfB = (paramInt2 + 1);
      this.lfD = new long[paramInt2 + 2];
      this.lfD[(paramInt2 + 1)] = paramLong2;
    } else {
      i = a(l2, this.lfC, paramLong3, localIw.RQ(), paramInt2 + 1);
      if (i == -128) {
        return -128;
      }
    }
    this.lfD[paramInt2] = paramLong1;
    return 0;
  }

  public int a(apK paramapK, aI paramaI, int[] paramArrayOfInt, Iw paramIw)
  {
    if (paramIw == null) {
      paramIw = new Iw();
      int i = a(paramIw, this.lfs);

      if (i == -128) {
        return -128;
      }

      if (i < 0) {
        return -130;
      }
    }

    if (paramArrayOfInt != null) {
      paramArrayOfInt[0] = paramIw.RQ();
    }

    this.lfw.init(paramIw.RQ());

    paramapK.init();
    paramaI.init();

    cAE localcAE = new cAE();
    int j = 0;
    while (j < 3) {
      this.lfw.c(paramIw);
      while (j < 3) {
        int k = this.lfw.a(localcAE);
        if (k == 0)
          break;
        if (k == -1) {
          paramapK.clear();
          this.lfw.clear();
          return -1;
        }
        if (paramapK.a(paramaI, localcAE) != 0) {
          paramapK.clear();
          this.lfw.clear();
          return -1;
        }
        j++;
      }

      if ((j < 3) && 
        (a(paramIw, 1L) < 0)) {
        paramapK.clear();
        this.lfw.clear();
        return -1;
      }

    }

    return 0;
  }

  public apK[] cRO() {
    return this.lfH;
  }

  private void a(apK paramapK, aI paramaI, int paramInt) {
    Iw localIw = new Iw();

    this.lfH = new apK[this.lfB];
    this.lfI = new aI[this.lfB];
    this.lfE = new long[this.lfB];
    this.lfG = new long[this.lfB];
    this.lfF = new int[this.lfB];

    for (int i = 0; i < this.lfB; i++) {
      if ((paramapK != null) && (paramaI != null) && (i == 0)) {
        this.lfH[i] = paramapK;
        this.lfI[i] = paramaI;
        this.lfE[i] = paramInt;
      }
      else {
        jH(this.lfD[i]);
        this.lfH[i] = new apK();
        this.lfI[i] = new aI();
        if (a(this.lfH[i], this.lfI[i], null, null) == -1) {
          this.lfE[i] = -1L;
        } else {
          this.lfE[i] = this.lfC;
          this.lfw.clear();
        }

      }

      long l = this.lfD[(i + 1)];
      jH(l);
      while (true)
      {
        int j = d(localIw);
        if (j == -1)
        {
          this.lfH[i].clear();
          break;
        }
        if (localIw.RP() != -1L) {
          this.lfF[i] = localIw.RQ();
          this.lfG[i] = localIw.RP();
          break;
        }
      }
    }
  }

  public boolean bTq()
  {
    return b(this.lfN);
  }

  public boolean b(blq paramblq) {
    this.lfN = paramblq;
    try
    {
      this.lfN.aPF();
    } catch (IOException localIOException1) {
      K.info("Problème à l'ouverture du stream " + paramblq.getDescription());
      try {
        this.lfN.close();
      } catch (IOException localIOException2) {
        K.info("Problème au nettoyage du stream " + paramblq.getDescription());
      }
      return false;
    }

    this.lfC = 0L;

    int i = this.lfx != null ? 1 : 0;
    if (i != 0) {
      if ((!bB) && ((this.lfy == null) || (this.lfv == null) || (this.lfw == null) || (this.lfz == null) || (this.lfA == null))) throw new AssertionError();

      this.lfx.xo();
      this.lfy.xo();
      this.lfv.xo();
      this.lfw.xo();
      this.lfz = new dPO();
      this.lfA.a(this.lfz);
    }
    else {
      if ((!bB) && ((this.lfy != null) || (this.lfv != null) || (this.lfw != null) || (this.lfz != null) || (this.lfA != null))) throw new AssertionError();

      this.lfx = new Iw();
      this.lfy = new cAE();
      this.lfv = new qb();
      this.lfw = new bNy();
      this.lfz = new dPO();
      this.lfA = new cPr(this.lfz);
    }

    if (paramblq.aPG()) {
      return cRK();
    }
    return cRL();
  }

  private int js(boolean paramBoolean)
  {
    while (true)
    {
      int i;
      if (this.lfK) {
        i = this.lfw.a(this.lfy);

        if (i > 0) {
          long l = this.lfy.iqy;

          if (this.lfA.b(this.lfy) == 0)
          {
            this.lfz.a(this.lfA);

            if (l != -1L) {
              int k = this.lfN.aPG() ? this.lfM : 0;

              int m = this.lfz.a((float[][][])null, null);
              l = Math.max(0L, l - m);
              for (int n = 0; n < k; n++) {
                l += this.lfG[n];
              }
              this.lfJ = l;
            }
            return 1;
          }
        }
      }

      if (!paramBoolean) {
        return 0;
      }
      if (a(this.lfx, -1L) < 0) {
        return 0;
      }

      if ((this.lfK) && 
        (this.lfL != this.lfx.RQ())) {
        cRN();
      }

      if (!this.lfK) {
        if (this.lfN.aPG()) {
          this.lfL = this.lfx.RQ();

          for (i = 0; (i < this.lfB) && 
            (this.lfF[i] != this.lfL); i++);
          if (i == this.lfB)
          {
            return -1;
          }

          this.lfM = i;

          this.lfw.init(this.lfL);
          this.lfw.xp();
        } else {
          int[] arrayOfInt = new int[1];
          int j = a(this.lfH[0], this.lfI[0], arrayOfInt, this.lfx);
          this.lfL = arrayOfInt[0];

          if (j != 0) {
            return j;
          }

          this.lfM += 1;
        }

        cRM();
      }
      this.lfw.c(this.lfx);
    }
  }

  public long Al(int paramInt)
  {
    if ((!this.lfN.aPG()) || (paramInt >= this.lfB)) {
      return -1L;
    }

    if (paramInt < 0) {
      long l = 0L;
      for (int i = 0; i < this.lfB; i++) {
        l += Al(i);
      }
      return l;
    }
    return this.lfD[(paramInt + 1)] - this.lfD[paramInt];
  }

  public long Am(int paramInt)
  {
    if ((!this.lfN.aPG()) || (paramInt >= this.lfB)) {
      return -1L;
    }

    if (paramInt < 0) {
      long l = 0L;
      for (int i = 0; i < this.lfB; i++) {
        l += Am(i);
      }
      return l;
    }
    return this.lfG[paramInt];
  }

  public long cRP()
  {
    if (!this.lfN.aPG()) {
      return -1L;
    }

    long l = 0L;

    for (int i = 0; i < this.lfB; i++) {
      l += this.lfG[i] * this.lfH[i].dvV * 2L;
    }

    return l;
  }

  public float An(int paramInt)
  {
    if ((!this.lfN.aPG()) || (paramInt >= this.lfB)) {
      return -1.0F;
    }
    if (paramInt < 0) {
      if (this.lfO == 0.0F) {
        for (int i = 0; i < this.lfB; i++) {
          this.lfO += An(i);
        }
      }
      return this.lfO;
    }
    return (float)this.lfG[paramInt] / this.lfH[paramInt].dvW;
  }

  public int ct(long paramLong)
  {
    if (!this.lfN.aPG()) {
      return -1;
    }

    this.lfJ = -1L;
    cRN();

    if ((paramLong < 0L) || (paramLong > this.lfD[this.lfB])) {
      return -1;
    }

    jH(paramLong);

    switch (js(true))
    {
    case 0:
      this.lfJ = Am(-1);
      return 0;
    case -1:
      this.lfJ = -1L;
      cRN();
      return -1;
    }

    while (true)
    {
      switch (js(false))
      {
      case 0:
        return 0;
      case -1:
        this.lfJ = -1L;
        cRN();
        return -1;
      }
    }
  }

  public int cu(long paramLong)
  {
    if (!this.lfN.aPG()) {
      return -1;
    }
    long l1 = Am(-1);

    if ((paramLong < 0L) || (paramLong > l1)) {
      this.lfJ = -1L;
      cRN();
      return -1;
    }

    for (int i = this.lfB - 1; i >= 0; i--) {
      l1 -= this.lfG[i];
      if (paramLong >= l1)
      {
        break;
      }
    }

    long l2 = paramLong - l1;
    long l3 = this.lfD[(i + 1)];
    long l4 = this.lfD[i];
    int m = (int)l4;

    Iw localIw = new Iw();
    while (l4 < l3)
    {
      long l5;
      if (l3 - l4 < this.lfs)
        l5 = l4;
      else {
        l5 = (l3 + l4) / 2L;
      }

      jH(l5);
      int n = a(localIw, l3 - l5);

      if (n == -1) {
        l3 = l5;
      } else {
        long l6 = localIw.RP();
        if (l6 < l2) {
          m = n;
          l4 = this.lfC;
        } else {
          l3 = l5;
        }
      }

    }

    if (ct(m) != 0) {
      this.lfJ = -1L;
      cRN();
      return -1;
    }

    if (this.lfJ >= paramLong) {
      this.lfJ = -1L;
      cRN();
      return -1;
    }

    if (paramLong > Am(-1)) {
      this.lfJ = -1L;
      cRN();
      return -1;
    }

    while (this.lfJ < paramLong) {
      int j = (int)(paramLong - this.lfJ);
      int[] arrayOfInt = new int[this.lfH[this.lfM].dvV];
      int k = this.lfz.a(this.lfR, arrayOfInt);

      if (k > j) {
        k = j;
      }

      this.lfz.Dm(k);
      this.lfJ += k;

      if ((k < j) && 
        (js(true) == 0)) {
        this.lfJ = Am(-1);
      }
    }

    return 0;
  }

  public int am(float paramFloat)
  {
    if (!this.lfN.aPG()) {
      return -1;
    }
    long l1 = Am(-1);
    float f = An(-1);

    if ((paramFloat < 0.0F) || (paramFloat > f)) {
      this.lfJ = -1L;
      cRN();
      return -1;
    }

    for (int i = this.lfB - 1; i >= 0; i--) {
      l1 -= this.lfG[i];
      f -= An(i);
      if (paramFloat >= f) {
        break;
      }
    }
    long l2 = ()((float)l1 + (paramFloat - f) * this.lfH[i].dvW);
    return cu(l2);
  }

  public long all()
  {
    return this.lfC;
  }

  public long alm() {
    return this.lfJ;
  }

  public float aln()
  {
    if (this.lfB < 1) {
      return 0.0F;
    }

    float f = 0.0F;
    long l = 0L;
    int i = -1;
    if (this.lfN.aPG()) {
      l = Am(-1);
      f = An(-1);

      for (i = this.lfB - 1; i >= 0; i--) {
        l -= this.lfG[i];
        f -= An(i);
        if (this.lfJ >= l)
        {
          break;
        }
      }
    }
    return f + (float)(this.lfJ - l) / this.lfH[i].dvW;
  }

  public int j(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.lfr = false;

    paramByteBuffer.position(paramInt);

    while (paramByteBuffer.remaining() > 0) {
      int i = 1;
      if (this.lfK) {
        apK localapK = this.lfH[this.lfM];
        int j = this.lfz.a(this.lfR, this.lfS);
        float[][] arrayOfFloat = this.lfR[0];

        if (j > 0) {
          int k = localapK.dvV;
          int m = k * 2;
          int n = Math.min(j, paramByteBuffer.remaining() / m);
          n = Math.min(n, 8192 / m);
          i = n == j ? 1 : 0;
          for (int i1 = 0; i1 < k; i1++) {
            int i2 = i1 * 2;
            int i3 = this.lfS[i1];
            for (int i4 = 0; i4 < n; i4++) {
              int i5 = (int)(arrayOfFloat[i1][(i3 + i4)] * 32767.0F);

              if (i5 > 32767) {
                i5 = 32767;
              }
              if (i5 < -32768) {
                i5 = -32768;
              }
              if (i5 < 0) {
                i5 |= 32768;
              }
              if (lfu) {
                this.lfQ[i2] = ((byte)(i5 >>> 8 & 0xFF));
                this.lfQ[(i2 + 1)] = ((byte)(i5 & 0xFF));
              } else {
                this.lfQ[i2] = ((byte)(i5 & 0xFF));
                this.lfQ[(i2 + 1)] = ((byte)(i5 >>> 8 & 0xFF));
              }
              i2 += 2 * k;
            }
          }

          i1 = n * m;
          paramByteBuffer.put(this.lfQ, 0, i1);
          this.lfz.Dm(n);
          this.lfJ += n;
        }
      }

      if (i != 0) {
        switch (js(true)) {
        case 0:
          return -(paramByteBuffer.position() - paramInt);
        case -1:
          return -(paramByteBuffer.position() - paramInt);
        }

      }

    }

    return paramByteBuffer.position() - paramInt;
  }

  public int bTt()
  {
    return this.lfH[this.lfM].dvV * 2;
  }

  public int bTr() {
    return this.lfH[0].dvV;
  }

  public int bTs() {
    return this.lfH[0].dvW;
  }

  public void gk(boolean paramBoolean) {
    this.lft = paramBoolean;
  }

  public int alg() {
    return (int)(An(-1) * 1000.0F);
  }

  public void loop()
  {
    if (this.lfN.aPG())
      ct(this.lfE[0]);
    else
      reset();
  }

  public void close()
  {
    if (this.lfN != null)
      try {
        this.lfN.close();
      } catch (IOException localIOException) {
        K.error("Impossible de fermer le flux pour le stream " + this.lfN.getDescription());
      }
  }

  public void reset()
  {
    if (!this.lfr)
    {
      if (this.lfN.aPG()) {
        ct(this.lfE[0]);
      } else {
        this.lfw.clear();
        this.lfA.xn();
        this.lfz.clear();
        if (this.lfH != null) {
          for (apK localapK : this.lfH) {
            localapK.clear();
          }
        }
        this.lfv.xn();
        try
        {
          if (this.lfN != null)
            this.lfN.reset();
        } catch (Exception localException) {
          K.error("Exception", localException);
        }

        this.lfB = 0;
        this.lfC = 0L;

        this.lfD = null;
        this.lfE = null;
        this.lfF = null;
        this.lfG = null;

        this.lfH = null;
        this.lfI = null;

        this.lfJ = 0L;
        this.lfK = false;

        this.lfL = 0;
        this.lfM = 0;

        b(this.lfN);
      }
      this.lfr = true;
    }
  }

  public int ayf() {
    return this.lfq;
  }

  public void th(int paramInt) {
    this.lfq = paramInt;
  }

  public int bTu() {
    return this.gPg.get();
  }

  public void bTv() {
    this.gPg.incrementAndGet();
  }

  public void bTw() {
    this.gPg.decrementAndGet();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(getClass().getSimpleName());
    localStringBuffer.append(" : url=").append(this.lfN.getDescription());
    return localStringBuffer.toString();
  }

  private static long c(blq paramblq) {
    if (!paramblq.aPG()) {
      return -1L;
    }
    try
    {
      return paramblq.length();
    } catch (IOException localIOException) {
      K.debug("Problème lors du length() sur le stream !", localIOException);
    }return -1L;
  }

  private static int a(blq paramblq, long paramLong, int paramInt)
  {
    if (!paramblq.aPG()) {
      return -1;
    }
    try
    {
      if (paramInt == 0)
        paramblq.seek(paramLong);
      else if (paramInt == 1) {
        paramblq.seek(paramblq.length() - paramLong);
      }
      return 0;
    } catch (IOException localIOException) {
      K.debug("Problème lors du seek sur le stream !", localIOException);
    }return -1;
  }

  private static long d(blq paramblq)
  {
    if (!paramblq.aPG()) {
      return 0L;
    }
    try
    {
      return paramblq.tell();
    } catch (IOException localIOException) {
      K.debug("Problème lors du tell sur le stream !", localIOException);
    }return 0L;
  }

  public aI cRQ()
  {
    if ((this.lfI == null) || (this.lfI.length == 0)) {
      return null;
    }
    return this.lfI[0];
  }
}