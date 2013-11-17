public class cyV
{
  public static final cyV inA = new cyV();

  private final aoL hAD = new aoL();

  public dMq hU(long paramLong)
  {
    return (dMq)this.hAD.get(paramLong);
  }

  public void r(bKm parambKm) {
    if (this.hAD.N(parambKm.getId())) {
      return;
    }
    dMq localdMq = new dMq();
    this.hAD.put(parambKm.getId(), localdMq);
    parambKm.a(localdMq);
  }

  public void a(ctb paramctb) {
    this.hAD.remove(paramctb.getId());
  }

  public void clear() {
    this.hAD.clear();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RoublardFightListenerManager");
    localStringBuilder.append("{}");
    return localStringBuilder.toString();
  }
}