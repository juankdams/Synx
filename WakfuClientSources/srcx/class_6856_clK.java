public enum clK
{
  private static final clK[] fjm;
  private static final cYq hNG;
  private final String m_name;
  private final dxL[] hNH;
  private final float[] hNI;
  private clK hNJ;
  private clK hNK;

  public static clK N(dxL paramdxL)
  {
    hNG.P(paramdxL);
    hNG.setYear(0);
    hNG.setSeconds(0);
    hNG.setMinutes(0);
    hNG.setHours(0);

    for (clK localclK : fjm) {
      int k = localclK.hNH.length / 2;
      for (int m = 0; m < k; m++) {
        dxL localdxL1 = localclK.hNH[(m * 2)];
        dxL localdxL2 = localclK.hNH[(m * 2 + 1)];

        if (((localdxL1.equals(hNG)) || (localdxL1.Q(hNG))) && ((localdxL2.S(hNG)) || (localdxL2.equals(hNG))))
          return localclK;
      }
    }
    return null;
  }

  private clK(String paramArrayOfFloat, dxL[] arg4, float[] arg5)
  {
    this.m_name = paramArrayOfFloat;
    Object localObject1;
    this.hNH = localObject1;
    Object localObject2;
    this.hNI = localObject2;
  }

  public String getName() {
    return this.m_name;
  }

  public float[] cnb() {
    return this.hNI;
  }

  public static clK[] cnc() {
    return fjm;
  }

  public byte VH() {
    return (byte)(ordinal() + 1);
  }

  public dxL cnd() {
    return this.hNH[0];
  }

  public int O(dxL paramdxL)
  {
    hNG.P(paramdxL);
    hNG.setYear(0);

    int i = this.hNH.length / 2;
    int j = 0;
    for (int k = 0; k < i; k++) {
      dxL localdxL1 = this.hNH[(k * 2)];
      dxL localdxL2 = this.hNH[(k * 2 + 1)];

      if (((localdxL1.equals(hNG)) || (localdxL1.Q(hNG))) && ((localdxL2.S(hNG)) || (localdxL2.equals(hNG)))) {
        j += localdxL1.V(hNG).getDays();
        break;
      }
      j += localdxL1.V(localdxL2).getDays();
    }
    return j;
  }

  private void a(clK paramclK1, clK paramclK2) {
    this.hNJ = paramclK1;
    this.hNK = paramclK2;
  }

  public clK cne() {
    return this.hNJ;
  }

  public clK cnf() {
    return this.hNK;
  }

  public String toString()
  {
    switch (chX.cKc[ordinal()]) {
    case 1:
      return "Printemps";
    case 2:
      return "Eté";
    case 3:
      return "Automne";
    case 4:
      return "Hiver";
    }

    return super.toString();
  }

  static
  {
    fjm = new clK[] { hNC, hND, hNE, hNF };
    hNG = new cYq(0, 0, 0, 0, 0, 0);

    hNC.a(hNF, hND);
    hND.a(hNC, hNE);
    hNE.a(hND, hNF);
    hNF.a(hNE, hNC);
  }
}