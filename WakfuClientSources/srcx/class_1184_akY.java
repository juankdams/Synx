public class akY
{
  private final int dlN = 2;

  private final ciL[] dlO = new ciL[2];

  private static final akY dlP = new akY();

  public static akY axI()
  {
    return dlP;
  }

  private akY()
  {
    for (int i = 0; i < 2; i++) {
      this.dlO[i] = dbL.cNv().b(ja(i), dn.Tq);
      this.dlO[i].g(clP.hPc[i]);
    }
  }

  public void d(arl paramarl)
  {
    for (int i = 0; i < 2; i++) {
      this.dlO[i].clear();
    }
    UG localUG = paramarl.LB();
    int j = localUG.getMinX();
    int k = localUG.getMinY();
    int m = localUG.getWidth();
    int n = j + m;
    int i1 = k + localUG.getHeight();

    for (int i2 = j; i2 < n; i2++)
      for (int i3 = k; i3 < i1; i3++) {
        int i4 = localUG.ax(i2, i3);
        if (i4 != -1)
        {
          short s = localUG.aw(i2, i3);
          this.dlO[i4].Q(i2, i3, s);
        }
      }
  }

  public void clear()
  {
    for (int i = 0; i < 2; i++)
      this.dlO[i].clear();
  }

  protected String ja(int paramInt)
  {
    return "startPoint" + paramInt;
  }
}