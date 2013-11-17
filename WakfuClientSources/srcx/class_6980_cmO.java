public class cmO
{
  public static final cmO hSn = new cmO();

  private final aoL hAD = new aoL();

  public void r(bKm parambKm)
  {
    if (this.hAD.N(parambKm.getId())) {
      return;
    }
    eV localeV = new eV(parambKm);
    this.hAD.put(parambKm.getId(), localeV);
    parambKm.a(localeV);
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
    localStringBuilder.append("PandawaFightListenerManager");
    localStringBuilder.append("{}");
    return localStringBuilder.toString();
  }
}