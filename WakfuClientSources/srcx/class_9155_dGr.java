import java.util.ArrayList;
import org.apache.log4j.Logger;

class dGr extends dxN
  implements cFC
{
  private static final Logger K = Logger.getLogger(dGr.class);
  private dqb lQW;

  public void a(bnp parambnp1, bnp parambnp2, bnp parambnp3, bnp parambnp4)
  {
    this.lQW = new dqb(parambnp1, parambnp2, parambnp3, parambnp4);
  }

  public void a(aXL[] paramArrayOfaXL) {
    this.lQW.a(paramArrayOfaXL);
    a(this.lQW);
    this.lQW = null;
  }

  private void a(dqb paramdqb) {
    this.bSb = new cCf[this.lQW.Wf() * 324];
    int i = dcC();
    int j = dcD();
    a(paramdqb.lqU, i, j);
    a(paramdqb.lqV, i + 9, j);
    a(paramdqb.lqW, i, j + 9);
    a(paramdqb.lqX, i + 9, j + 9);

    for (aXL localaXL : paramdqb.lqY) {
      bFA localbFA = (bFA)localaXL;
      IW localIW = ((dOW)localbFA.bmZ()).cPJ();
      a(localaXL.bmV(), localaXL.bmW(), localbFA.getLayer(), localIW);
    }
  }

  private void a(dgg paramdgg, int paramInt1, int paramInt2) {
    if (paramdgg == null) {
      return;
    }
    a(paramInt1, paramInt2, 0, paramdgg.cPJ());
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, IW paramIW) {
    ArrayList localArrayList = paramIW.Sp();
    if (localArrayList.isEmpty()) {
      return;
    }

    int i = 0;
    int m;
    for (int j = localArrayList.size(); i < j; i++) {
      cCf localcCf1 = (cCf)localArrayList.get(i);
      m = this.bSc.indexOf(localcCf1);
      if (m == -1) {
        this.bSc.add(localcCf1);
      }
    }

    i = paramIW.Sn();
    for (j = 0; j < paramIW.bY(); j++) {
      int k = j + paramInt2;
      if ((k >= dcD()) && (k < dcD() + 18))
      {
        for (m = 0; m < paramIW.So(); m++) {
          int n = m + paramInt1;
          if ((n >= dcC()) && (n < dcC() + 18))
          {
            for (int i1 = 0; i1 < i; i1++) {
              cCf localcCf2 = paramIW.l(m, j, i1);
              if (localcCf2 != null) {
                int i2 = this.bSc.indexOf(localcCf2);
                if (i2 != -1) {
                  localcCf2 = (cCf)this.bSc.get(i2);
                }
              }
              this.bSb[L(n, k, paramInt3 + i1)] = localcCf2;
            }
          }
        }
      }
    }
  }
}