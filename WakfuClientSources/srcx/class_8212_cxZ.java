import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

final class cxZ
  implements bZ
{
  private final List aEZ = new ArrayList();

  private final EnumMap imi = new EnumMap(aAc.class);

  public boolean d(dGy paramdGy) {
    aAc[] arrayOfaAc = aAc.values();
    int i = 0; for (int j = arrayOfaAc.length; i < j; i++) {
      dJi localdJi = (dJi)this.imi.get(arrayOfaAc[i]);
      if (localdJi != null)
      {
        if (!paramdGy.d(localdJi))
          return false;
      }
    }
    return true;
  }

  public dJi a(aAc paramaAc) {
    return (dJi)this.imi.get(paramaAc);
  }

  void a(aAc paramaAc, dJi paramdJi) {
    this.imi.put(paramaAc, paramdJi);
    c(paramdJi);
  }

  void b(aAc paramaAc) {
    dJi localdJi = (dJi)this.imi.remove(paramaAc);
    d(localdJi);
  }

  void clear() {
    this.imi.clear();
  }

  private void c(dJi paramdJi)
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((bWi)this.aEZ.get(i)).a(paramdJi);
  }

  private void d(dJi paramdJi)
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((bWi)this.aEZ.get(i)).b(paramdJi);
  }

  public boolean a(bWi parambWi)
  {
    return (!this.aEZ.contains(parambWi)) && (this.aEZ.add(parambWi));
  }

  public boolean b(bWi parambWi) {
    return this.aEZ.remove(parambWi);
  }

  public String toString()
  {
    return "EquipmentModel{m_items=" + this.imi.size() + '}';
  }
}