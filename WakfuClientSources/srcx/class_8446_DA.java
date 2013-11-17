public class DA
{
  public static final DA bIr = new DA();

  private final Xg bIs = new Xg();
  private final Xg bIt = new Xg();

  public void a(deT paramdeT) {
    int i = paramdeT.getId();
    this.bIt.put(i, paramdeT);

    if (paramdeT.cMu())
      this.bIs.put(i, new bqU(i));
  }

  public deT eD(int paramInt) {
    return (deT)this.bIt.get(paramInt);
  }

  public bqU eE(int paramInt) {
    return (bqU)this.bIs.get(paramInt);
  }

  public void g(dGy paramdGy) {
    int i = 0; for (int j = this.bIt.size(); i < j; i++) {
      deT localdeT = (deT)this.bIt.hc(i);
      if (localdeT.Wk())
      {
        if (!paramdGy.d(localdeT))
          return; 
      }
    }
  }

  public void h(dGy paramdGy) { int i = 0; for (int j = this.bIt.size(); i < j; i++) {
      deT localdeT = (deT)this.bIt.hc(i);
      if (!paramdGy.d(localdeT))
        return;
    } }

  public boolean i(int[] paramArrayOfInt)
  {
    int i = 0; for (int j = this.bIt.size(); i < j; i++) {
      deT localdeT = (deT)this.bIt.hc(i);
      for (int k = 0; k < paramArrayOfInt.length; k++) {
        int m = paramArrayOfInt[k];
        if (localdeT.zR(m)) {
          return true;
        }
      }
    }
    return false;
  }
}