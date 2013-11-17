public abstract class bvy
{
  private final short aDx;
  private final int efE;
  private final short efG;

  protected bvy(short paramShort1, int paramInt, short paramShort2)
  {
    this.aDx = paramShort1;
    this.efE = paramInt;
    this.efG = paramShort2;
  }

  public abstract int ahA();

  public final short nc() {
    return this.aDx;
  }

  public final int aTz() {
    return this.efE;
  }

  public final short aTB() {
    return this.efG;
  }

  public String toString()
  {
    return getClass().getSimpleName() + '{' + "m_id=" + this.aDx + ", m_categoryId=" + this.efE + ", m_maxQuantity=" + this.efG + '}';
  }
}