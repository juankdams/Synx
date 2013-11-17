import java.util.ArrayList;
import java.util.List;

public class AL
{
  private int bwB;
  private float bwC;
  private final List aEZ = new ArrayList();

  public AL() {
    this(0);
  }

  public AL(int paramInt) {
    dX(paramInt);
  }

  public int JW() {
    return this.bwB;
  }

  public float JX() {
    return this.bwC;
  }

  static double dW(int paramInt) {
    return -Integer.signum(paramInt) * StrictMath.expm1(-Math.abs(paramInt) / clM.hNQ);
  }

  public static AL O(float paramFloat) {
    int i = (int)(Math.signum(paramFloat) * clM.hNQ * StrictMath.log1p(-Math.abs(paramFloat)));

    return new AL(i);
  }

  private void dX(int paramInt) {
    setValue(this.bwB + paramInt);
  }

  public void setValue(int paramInt) {
    this.bwB = dY(paramInt);
    this.bwC = ((float)dW(this.bwB));
    for (int i = 0; i < this.aEZ.size(); i++)
      ((cOy)this.aEZ.get(i)).cGp();
  }

  private static int dY(int paramInt) {
    return bCO.J(paramInt, -10000, 10000);
  }

  public void dZ(int paramInt) {
    int i = (int)(a(this.bwC, Integer.signum(paramInt)) * paramInt);
    dX(i);
  }

  static double a(float paramFloat, int paramInt) {
    if (paramInt * paramFloat > 0.0F)
      return 1.0D;
    return 1.0D + Math.max(0.0D, 4.0D * (Math.abs(paramFloat) - 0.5D));
  }

  public boolean a(cOy paramcOy) {
    return (!this.aEZ.contains(paramcOy)) && (this.aEZ.add(paramcOy));
  }

  public boolean b(cOy paramcOy) {
    return this.aEZ.remove(paramcOy);
  }

  public String toString()
  {
    return "WakfuGauge{m_actionValue=" + this.bwB + ", m_userFriendlyValue=" + this.bwC + '}';
  }
}