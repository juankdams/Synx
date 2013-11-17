import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class akk
{
  private static final Logger K = Logger.getLogger(akk.class);
  private final ArrayList aBf = new ArrayList(2);
  private final double dkQ;
  private int dkR;
  private long dkS;
  private int dkT;
  private int dkU;

  protected akk(double paramDouble)
  {
    this.dkQ = paramDouble;
  }

  public void axx() {
    this.dkS = System.currentTimeMillis();
    this.dkT = getValue();
    this.dkU = 0;
  }

  public void bc(int paramInt1, int paramInt2) {
    iV(paramInt1);
    this.dkR = paramInt2;
    this.dkS = System.currentTimeMillis();
    this.dkT = paramInt1;
    this.dkU = 0;
  }

  public void a(cDL paramcDL) {
    this.aBf.add(paramcDL);
  }

  public void b(cDL paramcDL) {
    this.aBf.remove(paramcDL);
  }

  public void iU(int paramInt) {
    this.dkR = paramInt;
  }

  public void cU(long paramLong) {
    double d = paramLong - this.dkS;

    int i = (int)Math.round(this.dkR * d / this.dkQ);

    if (i > this.dkU) {
      int j = i - this.dkU;
      iW(j);
      this.dkU = i;
    }
  }

  protected abstract void iV(int paramInt);

  protected void iW(int paramInt) {
    for (int i = this.aBf.size() - 1; i >= 0; i--)
      ((cDL)this.aBf.get(i)).iW(paramInt);
  }

  protected abstract int getValue();
}