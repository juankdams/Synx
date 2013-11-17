public class dSe
{
  private final Xg mok = new Xg();

  void e(int paramInt, bNa parambNa) {
    this.mok.put(paramInt, parambNa);
  }

  public void e(bPA parambPA) {
    int i = 0; for (int j = this.mok.size(); i < j; i++)
      if (!parambPA.c(this.mok.uM(i), this.mok.hc(i)))
        return;
  }

  public String toString()
  {
    return "PetDefinitionColor{m_colorParts=" + this.mok.size() + '}';
  }
}