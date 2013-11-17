import java.util.Arrays;

public class Qb extends cih
{
  private final short coT;
  private final boolean coU;
  private final int coV;
  private final dFu coW = new dFu();

  public Qb(int paramInt1, int paramInt2, short paramShort, boolean paramBoolean, int paramInt3) {
    super(paramInt1, paramInt2, aPb.ewn, 0);
    this.coT = paramShort;
    this.coU = paramBoolean;
    this.coV = paramInt3;
  }

  public short abQ()
  {
    return this.coT;
  }

  public boolean isLocked()
  {
    return this.coU;
  }

  public void al(int paramInt1, int paramInt2)
  {
    this.coW.fg(paramInt1, paramInt2);
  }

  public aso abR()
  {
    return this.coW.abR();
  }

  public boolean abS()
  {
    return (this.coV != 0) || (!this.coW.isEmpty());
  }

  public int gn(int paramInt)
  {
    return this.coW.get(paramInt);
  }

  public int abT() {
    return this.coV;
  }

  public String toString() {
    return "IECollectParameter{m_capacity=" + this.coT + ", m_locked=" + this.coU + ", m_items=" + Arrays.toString(this.coW.qe()) + '}';
  }
}