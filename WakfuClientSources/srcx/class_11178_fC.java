import java.io.PrintStream;

class fC
{
  private final long aCL;
  private final byte[] aCM = new byte[bfn.fsF * bfn.fsF];

  private fC(long paramLong) {
    this.aCL = paramLong;
    mE();
  }

  private void mE()
  {
    for (int i = 0; i < bfn.fsE; i++)
      for (int j = 0; j < bfn.fsE; j++) {
        int k = bfn.C(j, i, bfn.fsE);
        int m = bfn.C(bfn.pq(j), bfn.pq(i), bfn.fsF);
        if (bCO.x(this.aCL, k))
        {
          int tmp60_58 = m;
          byte[] tmp60_55 = this.aCM; tmp60_55[tmp60_58] = ((byte)(tmp60_55[tmp60_58] + 1));
        }
      }
  }

  public byte m(int paramInt1, int paramInt2)
  {
    if (this.aCL == 0L) {
      return 0;
    }

    paramInt1 = (paramInt1 % bfn.fsF + bfn.fsF) % bfn.fsF;
    paramInt2 = (paramInt2 % bfn.fsF + bfn.fsF) % bfn.fsF;

    int i = bfn.C(paramInt2, paramInt1, bfn.fsF);
    return this.aCM[i];
  }

  public byte n(int paramInt1, int paramInt2) {
    if (this.aCL == 0L) {
      return 0;
    }

    int i = bfn.C(bfn.pr(paramInt2), bfn.pr(paramInt1), bfn.fsF);
    return this.aCM[i];
  }

  public boolean o(int paramInt1, int paramInt2) {
    if (this.aCL == 0L) {
      return false;
    }

    paramInt1 = (paramInt1 % bfn.fsE + bfn.fsE) % bfn.fsE;
    paramInt2 = (paramInt2 % bfn.fsE + bfn.fsE) % bfn.fsE;

    int i = bfn.C(paramInt2, paramInt1, bfn.fsE);

    return bCO.x(this.aCL, i);
  }

  public boolean mF() {
    return this.aCL != 0L;
  }

  public void mG() {
    for (int i = 0; i < bfn.fsE; i++) {
      for (int j = 0; j < bfn.fsE; j++) {
        int k = bfn.C(j, i, bfn.fsE);
        System.out.print(bCO.x(this.aCL, k) ? "R " : "x ");
      }
      System.out.println("");
    }
  }
}