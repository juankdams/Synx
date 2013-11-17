import java.util.Arrays;
import java.util.Collections;

public class adR
  implements Qh, bwe, bye
{
  private static final Nm cUD = new Nm();
  private static final int cUE = 25;
  private static final int cUF = 400;
  private static final int cUG = 300;
  private static final cGw cUH = new cGw();
  private final bAF cUI;

  public adR(bAF parambAF)
  {
    this.cUI = parambAF;
  }

  public void a(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    cuB localcuB = paramdMM.dpz();
    if (localcuB != null) {
      return;
    }
    a(paramdMM, localcuB, paramInt1, paramInt2, paramShort);
  }

  public void a(dMM paramdMM, cuB paramcuB) {
    if (paramcuB == null) {
      return;
    }
    int[] arrayOfInt = paramcuB.csZ();
    if (arrayOfInt == null) {
      return;
    }
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    short s = (short)arrayOfInt[2];

    a(paramdMM, paramcuB, i, j, s);
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    a(paramdMM, paramdMM.dpz(), paramInt1, paramInt2, paramShort);
  }

  private void a(dMM paramdMM, cuB paramcuB, int paramInt1, int paramInt2, short paramShort) {
    int i = this.cUI.fa();
    int j = this.cUI.fb();
    int k = i - paramInt1;
    int m = j - paramInt2;

    cYk localcYk = w(paramInt1, paramInt2, paramShort);

    if (k * k + m * m > 300) {
      this.cUI.k(localcYk.getX(), localcYk.getY(), localcYk.IB());
      return;
    }

    cUH.reset();
    dqg localdqg = dqg.cXq();
    cUD.caA = false;
    localdqg.a(cUD);
    localdqg.a(this.cUI.BC(), this.cUI.afD(), this.cUI.arG());
    localdqg.a(cUH);
    localdqg.ae(this.cUI.fa(), this.cUI.fb(), this.cUI.fc());

    cwO.a(i, j, localcYk.getX(), localcYk.getY(), cUH);
    localdqg.af(localcYk.getX(), localcYk.getY(), localcYk.IB());
    localdqg.cXv();
    cuB localcuB = localdqg.coK();
    localdqg.release();

    if (localcuB.csX())
      dka.cSF().a(new dda(localcuB, this.cUI), this.cUI.cat().a(this.cUI) / 2, 1);
    else if (paramcuB != null)
      paramdMM.b(this);
    else
      this.cUI.k(localcYk.getX(), localcYk.getY(), localcYk.IB());
  }

  public static cYk w(int paramInt1, int paramInt2, short paramShort)
  {
    CG[] arrayOfCG = CG.LR();
    Collections.shuffle(Arrays.asList(arrayOfCG));

    int i = paramInt1;
    int j = paramInt2;
    short s = paramShort;

    int k = 1;
    int m = 0; for (int n = arrayOfCG.length; (m < n) && (k != 0); m++) {
      CG localCG = arrayOfCG[m];
      i = paramInt1 + localCG.hY;
      j = paramInt2 + localCG.hZ;
      if (cwO.dV(i, j) != null) {
        s = cwO.U(i, j, paramShort);
        if ((s != -32768) && (Math.abs(paramShort - s) <= 6)) {
          k = 0;
        }
      }
    }
    if (k != 0) {
      i = paramInt1;
      j = paramInt2;
      s = paramShort;
    }

    return new cYk(i, j, s);
  }

  static
  {
    cUD.caA = true;
    cUD.caC = 25;
    cUD.caB = 400;
    cUD.caF = false;
    cUD.caH = true;
  }
}