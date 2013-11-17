class dgB
  implements dsn
{
  private final bej lbC;

  dgB(bej parambej)
  {
  }

  public Object a(Object paramObject, qd paramqd)
  {
    if (paramObject == null)
      return null;
    if ((paramObject instanceof String[])) {
      return new ayN((String[])paramObject, true);
    }
    return new cFg(paramObject.toString());
  }
  public Object a(Object paramObject, hT paramhT) {
    if (paramObject == null)
      return null;
    return paramObject.toString();
  }
  public Class WJ() {
    return bej.bRs == null ? (bej.bRs = bej.cd("cFg")) : bej.bRs;
  }
}