import java.io.PrintStream;
import org.apache.log4j.Logger;

public class dqg
  implements bBz
{
  private static final Logger K = Logger.getLogger(dqg.class);
  private static final boolean lrg = false;
  private static final Logger cyP = Logger.getLogger("debug");
  public static final int lrh = -1;
  public static final int cUE = 128;
  public static int lri = 1024;
  public static final int lrj = 3;
  public static int lrk = lri * 3;
  private static final float lrl = 1.4F;
  private static final float[] lrm = { 0.0F, 0.0F, 0.5F, 2.5F, 3.5F };
  private static final float lrn = 0.9F;
  private static final float lro = 10.0F;
  public static final cuB lrp = cuB.ifk;

  private static final int[][] lrq = { { 1, 0, 1 }, { -1, 0, 4 }, { 0, 1, 2 }, { 0, -1, 8 }, { 1, 1, 3 }, { -1, 1, 6 }, { -1, -1, 12 }, { 1, -1, 9 } };

  private static final int[][] lrr = { { 0, 1, 2 }, { 0, -1, 8 }, { 1, 0, 1 }, { -1, 0, 4 }, { 1, 1, 3 }, { -1, 1, 6 }, { -1, -1, 12 }, { 1, -1, 9 } };
  private int hrO;
  private short lrs;
  protected byte hrQ;
  protected final cbQ lrt = new cbQ();
  protected long lru;
  private cGw fmo;
  private Nm lrv;
  private final caW eUu = new caW();
  protected short lrw;
  protected long[] lrx = new long[''];
  private final dHk[] lry;
  private short lrz;
  private final bep[] beo;
  private short lrA;
  private final dHk[] lrB = new dHk[lri];

  private short lrC = -1;

  private short lrD = -1;

  private final dUy lrE = new dUy();

  private final aPF lrF = new aPF();

  private final dli lrG = new dli();

  private static final aee bx = new bOO(new cm());

  protected dqg()
  {
    this.lry = new dHk[lri];
    for (int i = 0; i < lri; i++) {
      this.lry[i] = new dHk();
    }

    this.beo = new bep[lrk];
    for (i = 0; i < lrk; i++)
      this.beo[i] = new bep();
  }

  public static dqg Ba(int paramInt)
  {
    lri = paramInt;
    lrk = lri * 3;

    return cXq();
  }

  public static dqg cXq() {
    try {
      return (dqg)bx.Mm();
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
    return null;
  }

  public void release() {
    try {
      bx.y(this);
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }

  public void aJ() {
  }

  public void bc() {
    this.hrO = 0;
    this.lrs = 0;
    this.hrQ = 0;

    this.lrz = 0;
    this.lrA = 0;

    this.lrC = -1;
    this.lrD = -1;

    this.lrE.clear();
    this.lrF.clear();
    this.lrG.clear();
    this.lrt.reset();
    this.fmo = null;
    this.lrw = -1;
    this.lru = -1L;
    this.eUu.b(0, (byte)-1, -1);
    this.lrv = null;
  }

  public final void a(cGw paramcGw) {
    this.fmo = paramcGw;
  }

  public void a(Nm paramNm) {
    this.lrv = paramNm;
  }

  public void a(int paramInt, byte paramByte, short paramShort) {
    this.hrO = paramInt;
    this.lrs = paramShort;
    this.hrQ = paramByte;
    this.eUu.b(paramInt, paramByte, paramShort);
  }

  public void cXr() {
    this.lrt.reset();
  }

  public void ae(int paramInt1, int paramInt2, short paramShort) {
    this.lrt.add(ag(paramInt1, paramInt2, paramShort));
  }

  public void ak(cYk paramcYk) {
    this.lrt.add(ag(paramcYk.getX(), paramcYk.getY(), paramcYk.IB()));
  }

  public void af(int paramInt1, int paramInt2, short paramShort) {
    this.lru = ag(paramInt1, paramInt2, paramShort);
  }

  public void al(cYk paramcYk) {
    if ((!bB) && (paramcYk == null)) throw new AssertionError("can't define a null cell as the destination");
    this.lru = ag(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public short cXs()
  {
    return this.lrw;
  }

  public long[] cXt() {
    return this.lrx;
  }

  public final cuB coK()
  {
    if (this.lrw == -1) {
      return lrp;
    }
    cuB localcuB = new cuB(this.lrw);
    for (int i = 0; i < this.lrw; i++) {
      long l = this.lrx[(this.lrw - 1 - i)];
      int j = jT(l);
      int k = jU(l);
      short s = jV(l);
      localcuB.a(i, j, k, s);
    }
    return localcuB;
  }

  public final cuB cXu()
  {
    if (this.lrw == -1) {
      return lrp;
    }
    cuB localcuB = new cuB(this.lrw);
    for (int i = 0; i < this.lrw; i++) {
      long l = this.lrx[i];
      int j = jT(l);
      int k = jU(l);
      short s = jV(l);
      localcuB.a(i, j, k, s);
    }
    return localcuB;
  }

  public int cXv()
  {
    if ((!bB) && (this.fmo == null)) throw new AssertionError("no TopologyMapInstanceSet defined");
    if ((!bB) && (this.hrO <= 0)) throw new AssertionError("invalid m_moverHeight");
    if ((!bB) && (this.lrs < 0)) throw new AssertionError("invalid m_moverJumpCapacity");
    if ((!bB) && (this.hrQ < 0)) throw new AssertionError("invalid m_moverPhysicalRadius : " + this.hrQ);
    if ((!bB) && (this.lrv == null)) throw new AssertionError("no PathFinderParameters defined");
    if ((!bB) && (this.lru == -1L)) throw new AssertionError("stop cell not defined");
    if ((!bB) && (this.lrt.isEmpty())) throw new AssertionError("start cells not defined");
    if ((!bB) && (this.lrv.caB <= 0)) throw new AssertionError("search limit not defined in the path find parameters");

    if ((!bB) && (!this.lrv.caE) && (this.lrv.caF)) throw new AssertionError("stopping before the end and asking for the end cell to be removed assumes the last cell of the path will be known");

    this.lrG.clear();
    this.lrz = 0;
    this.lrE.clear();
    this.lrA = 0;

    this.lrC = -1;
    this.lrD = -1;

    dHk localdHk1 = jW(this.lru);

    if (localdHk1 == null)
    {
      return -1;
    }
    if (!cTI.a(localdHk1.lSe + localdHk1.lSf, localdHk1.lSe, localdHk1.lSd, this.beo, this.hrO))
    {
      return -1;
    }

    int i = jT(this.lru);
    int j = jU(this.lru);
    short s1 = jV(this.lru);

    if ((!this.lrv.caF) && (S(i, j, s1)))
    {
      return -1;
    }

    if (this.hrQ > 0) {
      for (k = -this.hrQ; k <= this.hrQ; k++) {
        for (int m = -this.hrQ; m <= this.hrQ; m++) {
          if (S(i + k, j + m, s1))
          {
            return -1;
          }
        }
      }
    }
    for (int k = this.lrt.size() - 1; k >= 0; k--) {
      long l = this.lrt.get(k);

      if (l == this.lru) {
        this.lrw = 0;
        return this.lrw;
      }

      dHk localdHk2 = jW(l);

      if (localdHk2 == null) {
        K.info("Invalid start cell for pathfind search : doesn't exist. HASHCODE : " + l);
      }
      else
      {
        int i1 = jT(l);
        int i2 = jU(l);
        short s2 = jV(l);

        if ((this.hrQ > 0) && (s1 != s2)) {
          if (this.lrv.caI) {
            s2 = s1;
          }

        }
        else
        {
          if (!cTI.a(localdHk2.lSe + localdHk2.lSf, localdHk2.lSe, localdHk2.lSd, this.beo, this.hrO))
          {
            if (this.lrv.caI) {
              s2 = cTI.a(localdHk2.lSe, localdHk2.lSd, this.beo, (short)(s2 + this.lrs), this.hrO);

              if (s2 == -32768)
                continue;
            } else {
              K.info("Invalid start cell (" + i1 + ", " + i2 + ", " + s2 + ") for pathfind search : not a suitable position for the mover. ");

              continue;
            }
          }

          localdHk2.cJE = G(i1, i2, i, j);
          if ((this.lrv.caC <= 0) || (this.lrv.caC >= localdHk2.cJE))
          {
            localdHk2.cxy = 0.0F;
            localdHk2.cJD = localdHk2.cJE;
            localdHk2.aGX = true;
            localdHk2.lSh = -1;
            b(localdHk2);
          }
        }
      }
    }
    if (this.lrC == -1)
    {
      return -1;
    }

    boolean bool = this.lrv.caA;
    if ((this.hrQ > 0) && (!this.lrv.caA))
    {
      this.lrv.caA = true;
    }
    int n;
    if (this.hrQ == 0)
      n = a(i, j, localdHk1);
    else {
      n = a(i, j, jV(this.lru), localdHk1);
    }

    this.lrv.caA = bool;

    return n;
  }

  public boolean d(cYk paramcYk1, cYk paramcYk2)
  {
    if (paramcYk1.ac(paramcYk2) != 1) {
      K.error("Unable to checkMovementOnNextCell if cells are not adjacent :" + paramcYk1 + ", " + paramcYk2);
      return false;
    }

    int i = paramcYk1.getX();
    int j = paramcYk1.getY();
    int k = paramcYk2.getX();
    int m = paramcYk2.getY();
    short s = paramcYk2.IB();
    int i1;
    if (this.hrQ == 0)
    {
      if (S(k, m, s)) {
        return false;
      }

      n = eP(i, j);
      if (n == 0)
        return false;
      i1 = Bb(n);
      int i2 = Bc(n);
      int i3 = cTI.a(i1, i2, this.beo, paramcYk1.IB());
      if (i3 == -32768) {
        return false;
      }

      int i4 = eP(k, m);
      if (i4 == 0)
        return false;
      int i5 = Bb(i4);
      int i6 = Bc(i4);
      int i7 = cTI.a(i5, i6, this.beo, paramcYk2.IB());
      if (i7 == -32768) {
        return false;
      }
      return this.eUu.a(i1 + i3, i1, i2, this.beo, i5 + i7, i5, i6, this.beo);
    }

    for (int n = -this.hrQ; n <= this.hrQ; n++) {
      for (i1 = -this.hrQ; i1 <= this.hrQ; i1++)
      {
        if (!this.fmo.p(k + n, m + i1))
          return false;
        if (S(k + n, m + i1, s))
          return false;
        boolean bool = a(i + n, j + i1, paramcYk2.IB(), k + n, m + i1);
        if (!bool)
          return false;
      }
    }
    return true;
  }

  private int a(int paramInt1, int paramInt2, dHk paramdHk)
  {
    int i = 0;
    dHk localdHk1;
    while ((localdHk1 = cXx()) != null) {
      i++;
      if (this.lrv.caB < i) {
        return -1;
      }

      if (localdHk1 == paramdHk) {
        return c(localdHk1);
      }

      bep localbep1 = this.beo[(localdHk1.lSe + localdHk1.lSf)];

      int[][] arrayOfInt = a(localbep1, paramInt1, paramInt2);

      int j = 0;
      int k = cXw();
      for (byte b = 0; b < k; b = (byte)(b + 1))
      {
        int m = b > 3 ? 1 : 0;
        int[] arrayOfInt1 = arrayOfInt[b];

        if ((m == 0) || ((j & arrayOfInt1[2]) == arrayOfInt1[2]))
        {
          int n = localbep1.hY + arrayOfInt1[0];
          int i1 = localbep1.hZ + arrayOfInt1[1];
          short s = localbep1.aOl;

          if ((this.lrv.caF) && (!this.lrv.caG) && (n == paramInt1) && (i1 == paramInt2))
          {
            return c(localdHk1);
          }

          int i2 = eP(n, i1);

          if (i2 != 0)
          {
            int i3 = Bb(i2);
            int i4 = Bc(i2);

            if (S(n, i1, s)) {
              if (this.lrv.caF)
              {
                if ((n != paramInt1) || (i1 != paramInt2));
              }
            }
            else
            {
              int i5 = this.eUu.a(localdHk1.lSe + localdHk1.lSf, localdHk1.lSe, localdHk1.lSd, this.beo, i3, i4, this.beo);

              if (i5 != 0)
              {
                tF localtF = this.fmo.ej(n, i1);
                if (localtF != null)
                {
                  for (int i6 = 0; i6 < i5; i6++)
                  {
                    bep localbep2 = this.beo[this.eUu.hrR[i6]];

                    if ((!bB) && ((localbep2.hY != n) || (localbep2.hZ != i1))) throw new AssertionError("Pathchecker.getValidIndexes returned a CellPathData not corresponding to the given bounds");

                    if (localtF.i(n, i1, localbep2.aOl)) {
                      if (this.lrv.caF)
                      {
                        if ((n != paramInt1) || (i1 != paramInt2));
                      }
                    }
                    else
                    {
                      dHk localdHk2 = ah(n, i1, localbep2.aOl);

                      if (localdHk2 == null) {
                        System.out.println("Node inexistant ou trop de nodes. nodes testes : " + i + "/" + this.lrv.caB);
                      }
                      else if (localdHk2 != localdHk1.lSg)
                      {
                        if ((this.lrv.caL) || (!localbep2.bsf()))
                        {
                          if ((this.lrv.caF) && (localdHk2 == paramdHk)) {
                            return c(localdHk1);
                          }
                          if (m != 0) {
                            if (!a(localdHk2, n, localbep1.hZ))
                              continue;
                            if (!a(localdHk2, localbep1.hY, i1))
                              continue;
                          } else {
                            j = (byte)(j | arrayOfInt[b][2]);
                          }

                          float f = localdHk1.cxy + a(localdHk1, localbep1, localdHk2, localbep2, b);
                          int i7 = (byte)(localdHk1.lSi + 1);

                          if (localdHk2.cxy >= f)
                          {
                            if ((localdHk2.cxy != f) || 
                              (localdHk2.lSh >= b))
                            {
                              if ((this.lrv.caC <= 0) || (i7 <= this.lrv.caC))
                              {
                                localdHk2.cxy = f;

                                if (localdHk2.cJE == 0.0F) {
                                  localdHk2.cJE = H(n, i1, paramInt1, paramInt2);
                                }

                                localdHk2.cJD = (localdHk2.cxy + localdHk2.cJE);
                                localdHk2.lSg = localdHk1;
                                localdHk2.lSh = b;
                                localdHk2.lSi = i7;

                                if (localdHk2.aGX) {
                                  a(localdHk2);
                                }

                                b(localdHk2);
                                localdHk2.aGX = true;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      localdHk1.aGX = false;
    }

    return -1;
  }

  private boolean a(dHk paramdHk, int paramInt1, int paramInt2) {
    int i = eP(paramInt1, paramInt2);
    if (i == 0)
      return false;
    int j = Bb(i);
    int k = Bc(i);
    int m = this.eUu.a(paramdHk.lSe + paramdHk.lSf, paramdHk.lSe, paramdHk.lSd, this.beo, j, k, this.beo);

    return m != 0;
  }

  private int[][] a(bep parambep, int paramInt1, int paramInt2)
  {
    if (this.lrv.caK) {
      int i = Math.abs(paramInt1 - parambep.hY);
      int j = Math.abs(paramInt2 - parambep.hZ);
      if (i >= j) {
        return lrq;
      }
      return lrr;
    }
    return lrq;
  }

  private int a(int paramInt1, int paramInt2, short paramShort, dHk paramdHk)
  {
    this.lrF.clear();

    int i = 0;
    dHk localdHk1;
    while ((localdHk1 = cXx()) != null) {
      i++;
      if (this.lrv.caB < i) {
        return -1;
      }

      if (localdHk1 == paramdHk) {
        return c(localdHk1);
      }

      bep localbep = this.beo[(localdHk1.lSe + localdHk1.lSf)];

      int[][] arrayOfInt = a(localbep, paramInt1, paramInt2);

      int j = cXw();

      label610: for (byte b = 0; b < j; b = (byte)(b + 1))
      {
        int[] arrayOfInt1 = arrayOfInt[b];

        int k = localbep.hY + arrayOfInt1[0];
        int m = localbep.hZ + arrayOfInt1[1];
        short s = localbep.aOl;

        if ((this.lrv.caF) && (!this.lrv.caG) && (k == paramInt1) && (m == paramInt2))
        {
          return c(localdHk1);
        }

        for (int n = -this.hrQ; n <= this.hrQ; n++) {
          for (int i1 = -this.hrQ; i1 <= this.hrQ; i1++)
          {
            if (!this.fmo.p(k + n, m + i1))
              break label610;
            if (S(k + n, m + i1, s)) {
              if (this.lrv.caF)
              {
                if ((k + n != paramInt1) || (m + i1 != paramInt2));
              }
            }
            else
            {
              boolean bool = a(localbep.hY + n, localbep.hZ + i1, paramShort, k + n, m + i1);

              if (!bool);
            }
          }
        }
        dHk localdHk2 = ah(k, m, paramShort);

        if (localdHk2 == null) {
          System.out.println("Node inexistant ou trop de nodes. nodes testes : " + i + "/" + this.lrv.caB);
        }
        else if (localdHk2 != localdHk1.lSg)
        {
          if ((this.lrv.caF) && (localdHk2 == paramdHk)) {
            return c(localdHk1);
          }

          float f = localdHk1.cxy + a(localdHk1, localbep, localdHk2, this.beo[(localdHk1.lSe + localdHk1.lSf)], b);
          int i2 = (byte)(localdHk1.lSi + 1);

          if (localdHk2.cxy > f)
          {
            if ((this.lrv.caC <= 0) || (i2 <= this.lrv.caC))
            {
              localdHk2.cxy = f;

              if (localdHk2.cJE == 0.0F) {
                localdHk2.cJE = H(k, m, paramInt1, paramInt2);
              }
              localdHk2.cJD = (localdHk2.cxy + localdHk2.cJE);
              localdHk2.lSg = localdHk1;
              localdHk2.lSh = b;
              localdHk2.lSi = i2;

              if (localdHk2.aGX) {
                a(localdHk2);
              }
              b(localdHk2);
              localdHk2.aGX = true;
            }
          }
        }
      }
      localdHk1.aGX = false;
    }

    return -1;
  }

  private boolean a(int paramInt1, int paramInt2, short paramShort, int paramInt3, int paramInt4)
  {
    int i = eP(paramInt1, paramInt2);

    if (i == 0)
      return false;
    int j = Bb(i);
    int k = Bc(i);
    int m = cTI.a(j, k, this.beo, paramShort);
    if (m == -32768) {
      return false;
    }

    int n = eP(paramInt3, paramInt4);

    if (n == 0)
      return false;
    int i1 = Bb(n);

    long l = eM(j, i1);

    int i2 = this.lrF.er(l);
    if (i2 != 0) {
      return i2 > 0;
    }

    int i3 = Bc(n);
    int i4 = this.eUu.a(j + m, j, k, this.beo, i1, i3, this.beo);

    if (i4 == 0) {
      this.lrF.c(l, (byte)-1);
      return false;
    }

    for (int i5 = 0; i5 < i4; i5++) {
      bep localbep = this.beo[this.eUu.hrR[i5]];

      if (localbep.aOl == paramShort)
      {
        this.lrF.c(l, (byte)1);
        return true;
      }
    }

    this.lrF.c(l, (byte)-1);
    return false;
  }

  private long eM(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      return paramInt1 << 32 & 0x0 | paramInt2 & 0xFFFFFFFF;
    }
    return paramInt2 << 32 & 0x0 | paramInt1 & 0xFFFFFFFF;
  }

  private byte cXw() {
    return this.lrv.caA ? 4 : 8;
  }

  protected boolean S(int paramInt1, int paramInt2, short paramShort) {
    return this.fmo.s(paramInt1, paramInt2, paramShort);
  }

  protected float a(dHk paramdHk1, bep parambep1, dHk paramdHk2, bep parambep2, byte paramByte)
  {
    float f;
    if (paramByte >= 4)
      f = 1.4F;
    else {
      f = 1.0F;
    }

    if (this.lrv.caJ) {
      i = Math.abs(parambep1.aOl - parambep2.aOl);
      if (i >= lrm.length)
        f += lrm[(lrm.length - 1)];
      else
        f += lrm[i];
    }
    int i = (paramdHk1.lSh != -1) && (paramdHk1.lSh != paramByte) ? 1 : 0;
    if (i != 0) {
      if (!this.lrv.caA)
        f += 0.9F;
      else if (this.lrv.caH)
        f += 10.0F;
    }
    return f;
  }

  private float G(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Math.abs(paramInt1 - paramInt3);
    int j = Math.abs(paramInt2 - paramInt4);
    if (this.lrv.caA) {
      return i + j;
    }
    if (i < j) {
      return i * 1.4F + Math.abs(i - j);
    }
    return j * 1.4F + Math.abs(i - j);
  }

  private float H(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.abs(paramInt1 - paramInt3);
    int j = Math.abs(paramInt2 - paramInt4);

    if (this.lrv.caA) {
      if ((i == 0) && (j == 0))
        return 0.0F;
      float f = cEl.af(i, j) * 0.01F;
      return i + j + f;
    }
    if (i < j) {
      return i * 1.4F + Math.abs(i - j);
    }
    return j * 1.4F + Math.abs(i - j);
  }

  private static int eN(int paramInt1, int paramInt2)
  {
    return (paramInt1 & 0xFFFF) << 16 | paramInt2 & 0xFFFF;
  }

  private static int Bb(int paramInt) {
    return paramInt >>> 16 & 0xFFFF;
  }

  private static int Bc(int paramInt) {
    return paramInt & 0xFFFF;
  }

  protected static long eO(int paramInt1, int paramInt2) {
    return (paramInt1 + 131071 & 0x3FFFF) << 18 | paramInt2 + 131071 & 0x3FFFF;
  }

  private static long ag(int paramInt1, int paramInt2, short paramShort) {
    return (paramInt1 + 131071 & 0x3FFFF) << 34 | (paramInt2 + 131071 & 0x3FFFF) << 16 | paramShort + 32767 & 0xFFFF;
  }

  public static int jT(long paramLong) {
    return (int)((paramLong >>> 34 & 0x3FFFF) - 131071L);
  }

  public static int jU(long paramLong) {
    return (int)((paramLong >>> 16 & 0x3FFFF) - 131071L);
  }

  public static short jV(long paramLong) {
    return (short)(int)((paramLong & 0xFFFF) - 32767L);
  }

  private dHk cXx() {
    if (this.lrC < 0)
      return null;
    dHk localdHk = this.lrB[this.lrC];
    this.lrC = ((short)(this.lrC + 1));
    if (this.lrC > this.lrD) {
      this.lrC = (this.lrD = -1);
    }
    return localdHk;
  }

  private void a(dHk paramdHk) {
    if (paramdHk == null)
      return;
    if (this.lrC == -1) {
      return;
    }
    int i = this.lrC;
    int j = this.lrD;

    if (this.lrB[i] == paramdHk) {
      this.lrC = ((short)(this.lrC + 1));
      if (this.lrC > this.lrD) {
        this.lrC = (this.lrD = -1);
      }
      return;
    }

    if (this.lrB[j] == paramdHk) {
      this.lrD = ((short)(this.lrD - 1));
      if (this.lrD < this.lrC) {
        this.lrC = (this.lrD = -1);
      }
      return;
    }

    while (i < j) {
      int k = (i + j) / 2;
      if (this.lrB[k] == paramdHk) {
        System.arraycopy(this.lrB, k + 1, this.lrB, k, this.lrD - k);
        this.lrD = ((short)(this.lrD - 1));
        return;
      }
      if (paramdHk.cJD >= this.lrB[k].cJD)
        i = k + 1;
      else
        j = k - 1;
    }
  }

  private void b(dHk paramdHk)
  {
    if ((!bB) && (paramdHk == null)) throw new AssertionError("'can't insert a null PathFinderNode");

    if (this.lrC == -1) {
      this.lrB[0] = paramdHk;
      this.lrC = (this.lrD = 0);
      return;
    }

    for (int i = this.lrC; i <= this.lrD; i++) {
      if (paramdHk.cJD < this.lrB[i].cJD)
      {
        if (this.lrC > 0)
        {
          if (i == this.lrC) {
            this.lrC = ((short)(this.lrC - 1));
            this.lrB[this.lrC] = paramdHk;
            return;
          }

          System.arraycopy(this.lrB, this.lrC, this.lrB, this.lrC - 1, i - this.lrC);
          this.lrC = ((short)(this.lrC - 1));
          this.lrB[(i - 1)] = paramdHk;
          return;
        }

        System.arraycopy(this.lrB, i, this.lrB, i + 1, this.lrD - i + 1);
        this.lrB[i] = paramdHk;
        this.lrD = ((short)(this.lrD + 1));
        return;
      }

    }

    this.lrD = ((short)(this.lrD + 1));
    this.lrB[this.lrD] = paramdHk;
  }

  private dHk jW(long paramLong) {
    return ah(jT(paramLong), jU(paramLong), jV(paramLong));
  }

  private dHk ah(int paramInt1, int paramInt2, short paramShort) {
    long l = ag(paramInt1, paramInt2, paramShort);
    int i = this.lrG.jK(l);
    if (i != 0) {
      return this.lry[i];
    }

    if (this.lrz >= lri - 1) {
      K.error("No more free nodes. Ceel can't be added to open nodes. Think about increasing PathFinder.MAX_NODES");
      return null;
    }

    int j = eP(paramInt1, paramInt2);
    if (j == 0) {
      return null;
    }

    int k = Bb(j);
    int m = Bc(j);

    for (int n = k; n < k + m; n++) {
      if (this.beo[n].aOl == paramShort)
      {
        dHk localdHk = this.lry[(this.lrz + 1)];
        localdHk.lSe = ((short)k);
        localdHk.lSf = ((byte)(n - k));
        localdHk.lSd = ((byte)m);
        localdHk.lSg = null;
        localdHk.lSi = 0;
        localdHk.aGX = false;
        localdHk.cJD = 0.0F;
        localdHk.cxy = 3.4028235E+38F;
        localdHk.cJE = 0.0F;
        this.lrz = ((short)(this.lrz + 1));
        this.lrG.r(l, this.lrz);
        return localdHk;
      }
    }

    return null;
  }

  private int eP(int paramInt1, int paramInt2)
  {
    long l = eO(paramInt1, paramInt2);

    int i = this.lrE.kZ(l);

    if (i != 0) {
      return i;
    }

    dNg localdNg = this.fmo.ei(paramInt1, paramInt2);
    if (localdNg == null)
      return 0;
    if (!localdNg.p(paramInt1, paramInt2)) {
      K.error("Map pas présente pour ces coordonnées... Problème de topologyMapInstanceSet mal chargé/initialisé ?");
      return 0;
    }
    int j = localdNg.a(paramInt1, paramInt2, this.beo, this.lrA);
    if ((!bB) && (j == 0)) throw new AssertionError("no data for a specific cell " + paramInt1 + "," + paramInt2 + "@?");
    i = eN(this.lrA, j);
    this.lrE.G(l, i);
    this.lrA = ((short)(this.lrA + j));
    return i;
  }

  private int c(dHk paramdHk)
  {
    if ((!bB) && (paramdHk == null)) throw new AssertionError("can't compute a path with a null end node");

    this.lrw = 0;
    dHk localdHk = paramdHk;

    if (!this.lrv.caE)
    {
      if (localdHk.lSg != null)
        localdHk = localdHk.lSg;
    }
    bep localbep;
    if (!this.lrv.caD) {
      while ((localdHk.lSg != null) && (this.lrw < 128)) {
        localbep = this.beo[(localdHk.lSe + localdHk.lSf)];
        this.lrx[(this.lrw++)] = ag(localbep.hY, localbep.hZ, localbep.aOl);
        localdHk = localdHk.lSg;
      }
      if (localdHk.lSg == null)
        return this.lrw;
    } else {
      while ((localdHk != null) && (this.lrw < 128)) {
        localbep = this.beo[(localdHk.lSe + localdHk.lSf)];
        this.lrx[(this.lrw++)] = ag(localbep.hY, localbep.hZ, localbep.aOl);
        localdHk = localdHk.lSg;
      }

      if (localdHk == null) {
        return this.lrw;
      }

    }

    return -1;
  }

  public boolean e(cYk paramcYk1, cYk paramcYk2)
  {
    if ((paramcYk1 == null) || (paramcYk2 == null)) {
      K.error("IMpossible de savoir si un chemin en ligne droite existe: " + paramcYk1 + "/" + paramcYk2);
      return false;
    }

    if (paramcYk2.equals(paramcYk1)) {
      return true;
    }
    if ((paramcYk1.getX() != paramcYk2.getX()) && (paramcYk1.getY() != paramcYk2.getY())) {
      K.info("Cellules non alignées : impossible d'avoir un chemin en ligne droite");
      return false;
    }

    int i = paramcYk1.getX();
    int j = paramcYk2.getX();
    int k = paramcYk1.getY();
    int m = paramcYk2.getY();
    int n;
    int i1;
    int i2;
    if (i == j) {
      n = 0;
      i1 = m > k ? 1 : -1;
      i2 = Math.abs(m - k);
    } else {
      n = j > i ? 1 : -1;
      i1 = 0;
      i2 = Math.abs(j - i);
    }

    int i3 = i;
    int i4 = k;
    int i5 = eP(i3, i4);
    if (i5 == 0) {
      K.info("IMpossible de récupérer les informations de la cellule " + i3 + ", " + i4);
      return false;
    }
    int i6 = Bb(i5);
    int i7 = Bc(i5);
    int i8 = cTI.a(i6, i7, this.beo, paramcYk1.IB());
    if (i8 == -32768) {
      K.error("Position en z non valide pour cette cellule : " + paramcYk1);
      return false;
    }
    try
    {
      for (int i9 = 0; i9 < i2; i9++) {
        int i10 = i3 + n;
        int i11 = i4 + i1;
        int i12 = eP(i10, i11);
        if (i12 == 0) {
          K.debug("Une cellule du mouvement en ligne droite n'existe pas : " + i10 + ", " + i11);
          return false;
        }
        int i13 = Bb(i12);
        int i14 = Bc(i12);

        int i15 = this.eUu.a(i8 + i6, i6, i7, this.beo, i13, i14, this.beo);

        if (i15 == 0) {
          K.debug("Cellule " + i10 + ", " + i11 + " empêche le mouvement");
          return false;
        }

        i3 = i10;
        i4 = i11;
        i6 = i13;
        i7 = i14;
        i8 = this.eUu.hrR[0] - i6;
      }
    } catch (Throwable localThrowable) {
      K.error("Exception pendant le check pour savoir s'il y a un chemin en ligne droite : ", localThrowable);
      return false;
    }
    return true;
  }
}