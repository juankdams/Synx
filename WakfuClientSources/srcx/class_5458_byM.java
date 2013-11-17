public class byM
{
  public static final byM gml = new byM();

  private final cSR Ul = new cSR();

  public byM() {
    bkH localbkH = new bkH(1);
    this.Ul.put(1, localbkH);
  }

  public void a(bkH parambkH) {
    this.Ul.put(parambkH.getId(), parambkH);
  }

  public bkH rF(int paramInt) {
    return (bkH)this.Ul.get(paramInt);
  }

  public boolean contains(int paramInt) {
    return this.Ul.contains(paramInt);
  }

  public String toString()
  {
    return "PetDefinitionManager{m_definitions=" + this.Ul.size() + '}';
  }
}