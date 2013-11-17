import java.util.ArrayList;

public class cRJ
{
  public static final int dme = 40;
  private int aDH;
  private int dmf;
  private int hY;
  private int hZ;
  private ArrayList kDY = new ArrayList();

  public boolean bf(Su paramSu) {
    if (this.dmf == 0) {
      return true;
    }
    cYk localcYk = paramSu.aKb();

    float f = cEl.ag(localcYk.getX() - this.hY, localcYk.getY() - this.hZ);
    return f <= 40.0F;
  }

  public void bg(Su paramSu) {
    this.dmf += 1;
    this.kDY.add(paramSu);
    cYk localcYk = paramSu.aKb();

    if (this.dmf == 1) {
      this.hY = localcYk.getX();
      this.hZ = localcYk.getY();
      this.aDH = paramSu.aJp().nn();
      return;
    }

    int i = localcYk.getX() - this.hY;
    int j = localcYk.getY() - this.hZ;

    this.hY += i / this.dmf;
    this.hZ += j / this.dmf;
  }

  public int nn() {
    return this.aDH;
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

  public ArrayList cId() {
    return this.kDY;
  }
}