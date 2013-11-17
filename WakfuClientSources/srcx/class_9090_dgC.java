class dgC
  implements dsn
{
  private final bej lbC;

  dgC(bej parambej)
  {
  }

  public Object a(Object paramObject, qd paramqd)
  {
    return new Integer(Boolean.TRUE.equals(paramObject) ? 1 : 0);
  }
  public Object a(Object paramObject, hT paramhT) {
    return ((Integer)paramObject).intValue() != 0 ? Boolean.TRUE : Boolean.FALSE;
  }

  public Class WJ() {
    return bej.cvK == null ? (bej.cvK = bej.cd("java.lang.Integer")) : bej.cvK;
  }
}