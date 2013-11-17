public class ary
{
  private static final ary dAa = new ary();

  private final aoL dAb = new aoL();

  public static ary aDT()
  {
    return dAa;
  }

  public void a(long paramLong, awH paramawH)
  {
    this.dAb.put(paramLong, paramawH);
  }

  public awH dh(long paramLong)
  {
    return (awH)this.dAb.get(paramLong);
  }

  public void di(long paramLong) {
    this.dAb.remove(paramLong);
  }

  public void removeAll() {
    this.dAb.clear();
  }
}