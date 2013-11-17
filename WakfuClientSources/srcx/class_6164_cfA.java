public class cfA
{
  public static final cfA hAC = new cfA();

  private final aoL hAD = new aoL();

  public dCI hp(long paramLong)
  {
    return (dCI)this.hAD.get(paramLong);
  }

  public void r(bKm parambKm) {
    if (this.hAD.N(parambKm.getId())) {
      return;
    }
    dCI localdCI = new dCI(parambKm);
    this.hAD.put(parambKm.getId(), localdCI);
    parambKm.a(localdCI);
  }

  public void a(ctb paramctb) {
    this.hAD.remove(paramctb.getId());
  }

  public void clear() {
    this.hAD.clear();
  }

  public String toString()
  {
    return "XelorFightListenerManager{m_listeners=" + this.hAD + '}';
  }
}