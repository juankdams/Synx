import java.util.ArrayList;

class bvq
  implements dGy
{
  public static final bvq gfn = new bvq();
  private ArrayList bxs;
  private boolean gfo = true;
  private boolean gfp = true;
  private boolean gfq = true;

  public void G(ArrayList paramArrayList) {
    this.bxs = paramArrayList;
    fj.mh().b(this);
    this.bxs = null;
  }

  public boolean a(dxy paramdxy)
  {
    bcz localbcz = bcz.bH(paramdxy.bqt());
    if (localbcz == null)
    {
      return true;
    }
    switch (YV.cKb[localbcz.ordinal()]) {
    case 1:
      if (!this.gfo) {
        return true;
      }
      break;
    case 2:
      if (!this.gfp) {
        return true;
      }
      break;
    case 3:
      if (!this.gfq) {
        return true;
      }
      break;
    default:
      return true;
    }

    int i = 2147483647;

    byz localbyz = byv.bFN().bFO();
    int j = 0; for (int k = paramdxy.bqu(); j < k; j++) {
      cRm localcRm = (cRm)paramdxy.oP(j);
      int m = 0; for (int n = localcRm.coe(); m < n; m++) {
        bKi localbKi = (bKi)localcRm.vW(m);

        int i1 = localbKi.bOH();
        if ((localbyz.aTn().contains(localbKi.axX())) && (i1 < i) && (i1 <= localbyz.aTn().getLevel(localbKi.axX())))
        {
          i = i1;
        }
      }
    }

    if (i != 2147483647) {
      this.bxs.add(new aLE(paramdxy, i));
    }

    return true;
  }

  public boolean Am() {
    return this.gfo;
  }

  public void T(boolean paramBoolean) {
    this.gfo = paramBoolean;
  }

  public boolean An() {
    return this.gfp;
  }

  public void U(boolean paramBoolean) {
    this.gfp = paramBoolean;
  }

  public boolean Ao() {
    return this.gfq;
  }

  public void V(boolean paramBoolean) {
    this.gfq = paramBoolean;
  }
}