import java.util.ArrayList;

public class aFL
{
  private int aw;
  private final cYk cGk = new cYk();
  private final ArrayList dOs = new ArrayList();
  private int[] dOw;

  public aFL(int paramInt)
  {
    this.aw = paramInt;
  }

  public int getId() {
    return this.aw;
  }

  public void d(int paramInt1, int paramInt2, short paramShort) {
    this.cGk.ac(paramInt1, paramInt2, paramShort);
  }

  public cYk aKb() {
    return this.cGk;
  }

  public void a(deN paramdeN) {
    this.dOs.add(paramdeN);
  }

  public ArrayList aSg() {
    return this.dOs;
  }

  public int[] aKc() {
    return this.dOw;
  }

  public void r(int[] paramArrayOfInt) {
    this.dOw = paramArrayOfInt;
  }
}