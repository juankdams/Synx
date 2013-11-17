import java.util.ArrayList;
import java.util.List;

final class dHi
  implements Vu, bmN
{
  private final List aEZ = new ArrayList();

  private final cSR hdq = new cSR();

  public boolean d(dGy paramdGy)
  {
    return this.hdq.s(paramdGy);
  }

  public cEG ha(int paramInt) {
    return (cEG)this.hdq.get(paramInt);
  }

  void f(cEG paramcEG) {
    this.hdq.put(paramcEG.tc(), paramcEG);
    paramcEG.a(this);
    h(paramcEG);
  }

  void g(cEG paramcEG) {
    this.hdq.remove(paramcEG.tc());
    paramcEG.b(this);
    i(paramcEG);
  }

  void clear() {
    this.hdq.clear();
  }

  private void h(cEG paramcEG)
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((aZh)this.aEZ.get(i)).b(paramcEG);
  }

  private void i(cEG paramcEG) {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((aZh)this.aEZ.get(i)).c(paramcEG);
  }

  public void b(cEG paramcEG, int paramInt) {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((aZh)this.aEZ.get(i)).a(paramcEG, paramInt);
  }

  public boolean a(aZh paramaZh) {
    return (!this.aEZ.contains(paramaZh)) && (this.aEZ.add(paramaZh));
  }

  public boolean b(aZh paramaZh) {
    return this.aEZ.remove(paramaZh);
  }

  public String toString()
  {
    return "QuestItemInventory{m_items=" + this.hdq.size() + '}';
  }
}