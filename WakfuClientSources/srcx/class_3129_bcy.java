import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class bcy
  implements bBz
{
  private static final Logger K;
  private static final Logger cyP;
  private static final boolean fmn = false;
  private cGw fmo;
  private int aVc;
  private int aVd;
  private short fmp;
  private int fmq;
  private int fmr;
  private short fms;
  private int fmt;
  private int fmu;
  private short fmv;
  private short fmw;
  private boolean fmx = false;

  private final cZc[] bQa = new cZc[32];

  private static final aee bx = new bOO(new cxm());

  private dWs fmy = null;

  private bcy()
  {
    for (int i = 0; i < this.bQa.length; i++)
      this.bQa[i] = new cZc();
  }

  public static bcy bqD() {
    try {
      return (bcy)bx.Mm();
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
    return null;
  }

  public final void release() {
    try {
      bx.y(this);
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }

  public final void aJ() {
  }

  public final void bc() {
    this.fmo = null;
  }

  public final void a(cGw paramcGw) {
    this.fmo = paramcGw;
  }

  public final void F(int paramInt1, int paramInt2, short paramShort) {
    this.aVc = paramInt1;
    this.aVd = paramInt2;
    this.fmp = paramShort;
  }

  public final void z(cYk paramcYk) {
    this.aVc = paramcYk.getX();
    this.aVd = paramcYk.getY();
    this.fmp = paramcYk.IB();
  }

  public final void G(int paramInt1, int paramInt2, short paramShort) {
    this.fmq = paramInt1;
    this.fmr = paramInt2;
    this.fms = paramShort;
  }

  public final void A(cYk paramcYk) {
    this.fmq = paramcYk.getX();
    this.fmr = paramcYk.getY();
    this.fms = paramcYk.IB();
  }

  private boolean bqE()
  {
    dNg localdNg = this.fmo.ei(this.fmt, this.fmu);
    if (localdNg == null)
    {
      return false;
    }

    int i = ((!this.fmx) && (this.fmt == this.fmq) && (this.fmu == this.fmr)) || ((this.fmt == this.aVc) && (this.fmu == this.aVd)) ? 1 : 0;

    if ((i == 0) && (bqF()))
    {
      return false;
    }

    int j = localdNg.a(this.fmt, this.fmu, this.bQa, 0);
    if (j <= 0)
    {
      return false;
    }

    for (int k = 0; k < j; k++) {
      cZc localcZc = this.bQa[k];

      if (localcZc.aOl > this.fmv)
      {
        if (localcZc.aOl - localcZc.io >= this.fmw)
        {
          return k > 0;
        }

        if ((this.fmw > localcZc.aOl - localcZc.io) && (this.fmv < localcZc.aOl) && 
          (!localcZc.gPY))
        {
          return false;
        }
      }
    }
    return true;
  }

  private boolean bqF() {
    return (this.fmo.t(this.fmt, this.fmu, this.fmv)) || (this.fmo.t(this.fmt, this.fmu, this.fmw));
  }

  private boolean H(int paramInt1, int paramInt2, short paramShort)
  {
    if (this.fmt == 2147483647) {
      this.fmt = paramInt1;
      this.fmu = paramInt2;
      this.fmv = paramShort;
      this.fmw = paramShort;
      return true;
    }

    if ((paramInt1 == this.fmt) && (paramInt2 == this.fmu)) {
      if (paramShort < this.fmv)
        this.fmv = paramShort;
      if (paramShort > this.fmw)
        this.fmw = paramShort;
      return true;
    }

    if (!bqE()) {
      return false;
    }

    this.fmt = paramInt1;
    this.fmu = paramInt2;
    this.fmv = paramShort;
    this.fmw = paramShort;

    return true;
  }

  public final boolean bqG()
  {
    if ((!bB) && (this.fmo == null)) throw new AssertionError("No TopologyMapInstanceSet defined for this LOS Check");

    this.fmt = 2147483647;
    this.fmu = 2147483647;
    this.fmv = 32767;
    this.fmw = -32768;

    int i = this.aVc;
    int j = this.aVd;
    short s1 = this.fmp;

    int k = this.fmq - this.aVc;
    int m = this.fmr - this.aVd;
    int n = (short)(this.fms - this.fmp);
    int i1;
    int i3;
    if (k < 0) {
      i1 = -1;
      i3 = -k;
    } else {
      i1 = 1;
      i3 = k;
    }
    int i2;
    int i4;
    if (m < 0) {
      i2 = -1;
      i4 = -m;
    } else {
      i2 = 1;
      i4 = m;
    }
    short s2;
    int i5;
    if (n < 0) {
      s2 = -1;
      i5 = -n;
    } else {
      s2 = 1;
      i5 = n;
    }

    int i8 = i3 << 2;
    int i9 = i4 << 2;
    int i10 = i5 << 2;
    int i6;
    int i7;
    int i11;
    int i12;
    int i13;
    if ((i3 >= i4) && (i3 >= i5))
    {
      i6 = (i9 >>> 1) - 2 * i3;
      i7 = (i10 >>> 1) - 2 * i3;
      for (i11 = 0; i11 < i3; i11++)
      {
        i += i1;

        if (i6 < 0) {
          if (i7 < 0) {
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            i7 -= i8;
            s1 = (short)(s1 + s2);
            if (!H(i, j, s1))
              return false;
          } else {
            i7 -= i8;
            s1 = (short)(s1 + s2);
            if (!H(i - i1, j, s1))
              return false;
            if (!H(i, j, s1))
              return false;
          }
        } else if (i6 == 0) {
          i6 -= i8;
          j += i2;

          if (i7 < 0) {
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            i7 -= i8;
            s1 = (short)(s1 + s2);
            if (!H(i, j, s1))
              return false;
          } else {
            i7 -= i8;
            s1 = (short)(s1 + s2);
            if (!H(i - i1, j - i2, s1))
              return false;
            if (!H(i, j, s1))
              return false;
          }
        } else {
          i6 -= i8;
          j += i2;

          if (i7 < 0) {
            if (!H(i - i1, j, s1))
              return false;
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            if (!H(i - i1, j, s1))
              return false;
            i7 -= i8;
            s1 = (short)(s1 + s2);
            if (!H(i, j, s1)) {
              return false;
            }

          }
          else
          {
            i7 -= i8;
            s1 = (short)(s1 + s2);

            i12 = i6 + i6 - i9;
            i13 = i7 + i7 - i10;
            if (i12 > i13) {
              if (!H(i - i1, j, (short)(s1 - s2)))
                return false;
            } else if ((i13 > i12) && 
              (!H(i - i1, j - i2, s1))) {
              return false;
            }

            if (!H(i - i1, j, s1))
              return false;
            if (!H(i, j, s1)) {
              return false;
            }
          }
        }
        i6 += i9;
        i7 += i10;
      }
    }
    else if ((i4 >= i3) && (i4 >= i5))
    {
      i6 = (i8 >>> 1) - 2 * i4;
      i7 = (i10 >>> 1) - 2 * i4;

      for (i11 = 0; i11 < i4; i11++)
      {
        j += i2;

        if (i6 < 0) {
          if (i7 < 0) {
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            i7 -= i9;
            s1 = (short)(s1 + s2);
            if (!H(i, j, s1))
              return false;
          } else {
            i7 -= i9;
            s1 = (short)(s1 + s2);
            if (!H(i, j - i2, s1))
              return false;
            if (!H(i, j, s1))
              return false;
          }
        } else if (i6 == 0) {
          i6 -= i9;
          i += i1;

          if (i7 < 0) {
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            i7 -= i9;
            s1 = (short)(s1 + s2);
            if (!H(i, j, s1))
              return false;
          } else {
            i7 -= i9;
            s1 = (short)(s1 + s2);
            if (!H(i - i1, j - i2, s1))
              return false;
            if (!H(i, j, s1))
              return false;
          }
        } else {
          i6 -= i9;
          i += i1;

          if (i7 < 0) {
            if (!H(i, j - i2, s1))
              return false;
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            if (!H(i, j - i2, s1))
              return false;
            i7 -= i9;
            s1 = (short)(s1 + s2);
            if (!H(i, j, s1))
              return false;
          } else {
            i7 -= i9;
            s1 = (short)(s1 + s2);

            i12 = i6 + i6 - i8;
            i13 = i7 + i7 - i10;
            if (i12 > i13) {
              if (!H(i, j - i2, (short)(s1 - s2)))
                return false;
            } else if ((i13 > i12) && 
              (!H(i - i1, j - i2, s1))) {
              return false;
            }

            if (!H(i, j - i2, s1))
              return false;
            if (!H(i, j, s1)) {
              return false;
            }
          }
        }
        i6 += i8;
        i7 += i10;
      }
    }
    else
    {
      i6 = (i8 >>> 1) - 2 * i5;
      i7 = (i9 >>> 1) - 2 * i5;

      for (i11 = 0; i11 < i5; i11++)
      {
        s1 = (short)(s1 + s2);

        if (i6 < 0) {
          if (i7 < 0) {
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            i7 -= i10;
            j += i2;
            if (!H(i, j, s1))
              return false;
          } else {
            i7 -= i10;
            j += i2;
            if (!H(i, j, (short)(s1 - s2)))
              return false;
            if (!H(i, j, s1))
              return false;
          }
        } else if (i6 == 0) {
          i6 -= i10;
          i += i1;

          if (i7 < 0) {
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            i7 -= i10;
            j += i2;
            if (!H(i, j, s1))
              return false;
          } else {
            i7 -= i10;
            j += i2;
            if (!H(i - i1, j, (short)(s1 - s2)))
              return false;
            if (!H(i, j, s1))
              return false;
          }
        } else {
          i6 -= i10;
          i += i1;

          if (i7 < 0) {
            if (!H(i, j, (short)(s1 - s2)))
              return false;
            if (!H(i, j, s1))
              return false;
          } else if (i7 == 0) {
            if (!H(i, j, (short)(s1 - s2)))
              return false;
            i7 -= i10;
            j += i2;
            if (!H(i, j, s1))
              return false;
          } else {
            i7 -= i10;
            j += i2;

            i12 = i6 + i6 - i8;
            i13 = i7 + i7 - i9;
            if (i12 > i13) {
              if (!H(i, j - i2, (short)(s1 - s2)))
                return false;
            } else if ((i13 > i12) && 
              (!H(i - i1, j, (short)(s1 - s2)))) {
              return false;
            }

            if (!H(i, j, (short)(s1 - s2)))
              return false;
            if (!H(i, j, s1)) {
              return false;
            }
          }
        }
        i6 += i8;
        i7 += i9;
      }

    }

    return bqE();
  }

  public void a(dWs paramdWs)
  {
    this.fmy = paramdWs;
  }

  static
  {
    K = Logger.getLogger(bcy.class);
    cyP = Logger.getLogger("debug");

    cyP.setLevel(Level.ALL);
  }
}