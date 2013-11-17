import org.apache.log4j.Logger;

public class dvk extends aSv
{
  private static final Logger K = Logger.getLogger(dvk.class);

  private static final cSi lAD = new cSi(32);
  private static final Object aNy = new Object();
  private static final byte flt = 1;
  private static final byte flu = 2;
  public static final int lAE = 1;
  private byte[] flv;
  private byte[] flw;
  private byte[] flx;
  private byte[] flA;
  private short[] fly;
  private byte[] flz;
  private long[] luC;
  private int[] lAF;

  public final boolean eX(int paramInt1, int paramInt2)
  {
    int i = ch(paramInt1, paramInt2);
    if (i == 0) {
      return false;
    }
    return (this.flA[(i - 1)] & 0x1) == 1;
  }

  public final int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfbep))) throw new AssertionError();

    int i = ch(paramInt1, paramInt2);
    if (i != 0) {
      bep localbep1 = paramArrayOfbep[paramInt3];
      localbep1.hY = paramInt1;
      localbep1.hZ = paramInt2;
      a(localbep1, i - 1);
      return 1;
    }

    synchronized (aNy) {
      cSi localcSi = a(paramInt1 - this.hY, paramInt2 - this.hZ, lAD);
      int j = localcSi.size();
      for (int k = 0; k < j; k++) {
        bep localbep2 = paramArrayOfbep[(paramInt3 + k)];
        localbep2.hY = paramInt1;
        localbep2.hZ = paramInt2;
        a(localbep2, localcSi.wm(k));
      }
      return j;
    }
  }

  private void a(bep parambep, int paramInt) {
    parambep.aOl = this.fly[paramInt];
    parambep.gPY = ((this.flA[paramInt] & 0x1) == 1);
    parambep.io = this.flz[paramInt];
    parambep.flI = this.flv[paramInt];
    parambep.frm = this.flw[paramInt];
    parambep.frn = this.flx[paramInt];
  }

  public int a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfcZc))) throw new AssertionError();

    int i = ch(paramInt1, paramInt2);
    if (i != 0) {
      cZc localcZc1 = paramArrayOfcZc[paramInt3];
      localcZc1.hY = paramInt1;
      localcZc1.hZ = paramInt2;
      a(localcZc1, i - 1);
      return 1;
    }

    synchronized (aNy) {
      cSi localcSi = a(paramInt1 - this.hY, paramInt2 - this.hZ, lAD);
      int j = localcSi.size();
      for (int k = 0; k < j; k++) {
        cZc localcZc2 = paramArrayOfcZc[(paramInt3 + k)];
        localcZc2.hY = paramInt1;
        localcZc2.hZ = paramInt2;
        a(localcZc2, localcSi.wm(k));
      }
      return j;
    }
  }

  private void a(cZc paramcZc, int paramInt) {
    paramcZc.aOl = this.fly[paramInt];
    paramcZc.gPY = ((this.flA[paramInt] & 0x2) == 2);
    paramcZc.io = this.flz[paramInt];
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    int i = paramaYQ.readByte() & 0xFF;
    this.flv = new byte[i];
    this.flw = new byte[i];
    this.flx = new byte[i];
    this.fly = new short[i];
    this.flz = new byte[i];
    this.flA = new byte[i];

    for (int j = 0; j < i; j++) {
      this.flv[j] = paramaYQ.readByte();
      this.flw[j] = paramaYQ.readByte();
      this.flx[j] = paramaYQ.readByte();
      this.fly[j] = paramaYQ.readShort();
      this.flz[j] = paramaYQ.readByte();
      this.flA[j] = paramaYQ.readByte();
    }

    j = paramaYQ.readByte() & 0xFF;
    this.luC = Jv.a(this.luC, j, paramaYQ);

    int k = paramaYQ.readShort() & 0xFFFF;
    this.lAF = paramaYQ.ov(k);
  }

  private int ch(int paramInt1, int paramInt2) {
    int i = paramInt1 - this.hY;
    int j = paramInt2 - this.hZ;
    int k = j * app() + i;

    return Jv.a(this.luC, k, this.flv.length + 1);
  }

  private cSi a(int paramInt1, int paramInt2, cSi paramcSi) {
    paramcSi.reset();
    int i = this.lAF.length;
    for (int j = 0; j < i; j++) {
      int k = this.lAF[j];
      int m = k >> 8 & 0xFF;
      if (m >= paramInt2)
      {
        if (m > paramInt2) {
          break;
        }
        int n = k & 0xFF;
        if (n >= paramInt1)
        {
          if (n > paramInt1) {
            break;
          }
          int i1 = k >> 16 & 0xFFFF;
          paramcSi.add(i1);
        }
      }
    }
    if ((!bB) && (paramcSi.size() == 1)) throw new AssertionError("nombre de z incorrect");
    return paramcSi;
  }
}