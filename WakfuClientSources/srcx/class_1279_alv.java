import java.util.ArrayList;

public class alv
{
  public static final int dme = 10;
  private short aKJ;
  private int dmf;
  private int hY;
  private int hZ;
  private ArrayList bxs = new ArrayList();

  public boolean i(azX paramazX) {
    if (this.dmf == 0) {
      return true;
    }
    int i = paramazX.fa();
    int j = paramazX.fb();

    for (int k = this.bxs.size() - 1; k >= 0; k--) {
      azX localazX = (azX)this.bxs.get(k);
      float f = cEl.ag(i - localazX.fa(), j - localazX.fb());
      if (f <= 10.0F) {
        return true;
      }
    }

    return false;
  }

  public void j(azX paramazX) {
    this.dmf += 1;
    this.bxs.add(paramazX);
    int i = paramazX.fa();
    int j = paramazX.fb();

    if (this.dmf == 1) {
      this.hY = i;
      this.hZ = j;
      this.aKJ = paramazX.aLV().bqt();
      return;
    }

    int k = i - this.hY;
    int m = i - this.hZ;

    this.hY += k / this.dmf;
    this.hZ += m / this.dmf;
  }

  public int aye() {
    return this.aKJ;
  }

  public int ayf() {
    return this.dmf;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public ArrayList KA() {
    return this.bxs;
  }
}