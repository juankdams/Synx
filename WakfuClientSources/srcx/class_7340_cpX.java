public class cpX
{
  public static final cpX hZN = new cpX();

  private final aoL hAD = new aoL();

  public ckc hG(long paramLong)
  {
    return (ckc)this.hAD.get(paramLong);
  }

  public void r(bKm parambKm) {
    if (this.hAD.N(parambKm.getId())) {
      return;
    }
    ckc localckc = new ckc(parambKm);
    this.hAD.put(parambKm.getId(), localckc);
    parambKm.a(localckc);
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
    localStringBuilder.append("EcaflipFightListenerManager");
    localStringBuilder.append("{}");
    return localStringBuilder.toString();
  }
}