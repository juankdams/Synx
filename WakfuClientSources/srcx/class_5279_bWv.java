import java.util.ArrayList;
import java.util.HashMap;

class bWv extends oe
{
  private ArrayList ca;
  private int[] hiD;
  private int[] hiE;
  private int[] hiF;
  private int[] hiG;
  private boolean hiH = true;

  private bWv(kd paramkd, ArrayList paramArrayList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, ddp paramddp) {
    setDelay(250);
    setDuration(250);
    yc(1);
    setTweenFunction(paramddp);

    this.ca = paramArrayList;
    this.hiD = paramArrayOfInt1;
    this.hiE = paramArrayOfInt2;
    this.hiF = paramArrayOfInt3;
    this.hiG = paramArrayOfInt4;

    int i = 0; for (int j = this.ca.size(); i < j; i++) {
      axU localaxU = (axU)this.ca.get(i);

      int k = ((Integer)kd.a(paramkd).get(localaxU)).intValue();
      kd.a(paramkd).put(localaxU, Integer.valueOf(k + 1));
    }
  }

  private int cby() {
    return this.ca.size();
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null) {
      int i = this.aAW.getAppearance().getContentWidth();
      int j = this.aKS - kd.rW();
      int k;
      int m;
      int i1;
      if (this.bmM < j) {
        k = 0; for (m = this.ca.size(); k < m; k++) {
          axU localaxU1 = (axU)this.ca.get(k);

          if (this.hiH)
          {
            this.hiH = false;
          }

          i1 = (int)this.dRn.a(this.hiD[(k * 2)], this.hiE[(k * 2)], this.bmM, j);
          int i2 = (int)this.dRn.a(this.hiD[(k * 2 + 1)], this.hiE[(k * 2 + 1)], this.bmM, j);
          int i3 = (int)this.dRn.a(this.hiF[(k * 2)], this.hiG[(k * 2)], this.bmM, j);
          int i4 = (int)this.dRn.a(this.hiF[(k * 2 + 1)], this.hiG[(k * 2 + 1)], this.bmM, j);

          localaxU1.setPosition(i1 + i, i2);
          localaxU1.setSize(i3, i4);
        }
      } else {
        k = this.bmM - j;
        m = 0;
        if (k < 40)
          m = (int)this.dRn.a(0.0F, 10.0F, k, 40);
        else if (k < 80)
          m = (int)this.dRn.a(10.0F, 0.0F, k - 40, 40);
        else if (k < 90)
          m = (int)this.dRn.a(0.0F, 4.0F, k - 80, 10);
        else if (k < kd.rW()) {
          m = (int)this.dRn.a(4.0F, 0.0F, k - 90, 10);
        }

        int n = 0; for (i1 = this.ca.size(); (n < i1) && 
          (n < this.hiE.length * 2); n++)
        {
          axU localaxU2 = (axU)this.ca.get(n);

          localaxU2.setY(this.hiE[(n * 2 + 1)] + m);
        }
      }

      this.hiH = false;
    }

    return true;
  }

  public void nv() {
    int i = this.aAW.getAppearance().getContentWidth();

    int j = 0; for (int k = this.ca.size(); j < k; j++) {
      axU localaxU = (axU)this.ca.get(j);
      if (j >= this.hiE.length * 2)
      {
        break;
      }
      localaxU.setPosition(this.hiE[(j * 2)] + i, this.hiE[(j * 2 + 1)]);
      localaxU.setSize(this.hiG[(j * 2)], this.hiG[(j * 2 + 1)]);

      int m = ((Integer)kd.a(this.aAW).get(localaxU)).intValue();
      if (m == 1) {
        kd.a(this.aAW).remove(localaxU);
        localaxU.beH();
      } else {
        kd.a(this.aAW).put(localaxU, Integer.valueOf(m - 1));
      }
    }

    if (kd.c(this.aAW).size() > 0) {
      this.aAW.a((cKq)kd.c(this.aAW).remove(0));
    }
    if (kd.d(this.aAW).size() > 0) {
      this.aAW.a((cKq)kd.d(this.aAW).remove(0));
    }

    super.nv();
  }
}