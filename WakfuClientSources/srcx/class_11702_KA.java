public abstract class KA
{
  public final String m_name;
  protected final aBq bXd;

  protected KA(bUT parambUT)
  {
    this.m_name = parambUT.caP().intern();
    int i = parambUT.getInt();
    this.bXd = fE(i);
    for (int j = 0; j < i; j++) {
      long l = parambUT.getLong();
      a(l, parambUT);
    }
  }

  public static KA b(bUT parambUT) {
    int i = parambUT.get() != 0 ? 1 : 0;
    if (i != 0) {
      return new dwi(parambUT, null);
    }
    return new dUv(parambUT);
  }

  protected abstract aBq fE(int paramInt);

  protected abstract void a(long paramLong, bUT parambUT);

  public abstract int bJ(long paramLong);

  public abstract int e(long paramLong, int paramInt);
}