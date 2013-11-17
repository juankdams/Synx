import java.util.ArrayList;

public class bRS
{
  private final ArrayList aBf = new ArrayList();
  private final ArrayList hbM = new ArrayList();
  private final cXD hbN;

  public bRS(cXD paramcXD)
  {
    this.hbN = paramcXD;
  }

  public void notifyListeners() {
    this.aBf.removeAll(this.hbM);
    this.hbM.clear();

    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      this.hbN.n(this.aBf.get(i));
  }

  public boolean aP(Object paramObject)
  {
    this.hbM.remove(paramObject);
    return (!this.aBf.contains(paramObject)) && (this.aBf.add(paramObject));
  }

  public boolean aQ(Object paramObject) {
    return (!this.hbM.contains(paramObject)) && (this.hbM.add(paramObject));
  }

  public boolean contains(Object paramObject) {
    return (this.aBf.contains(paramObject)) && (!this.hbM.contains(paramObject));
  }

  public void clear() {
    this.aBf.clear();
    this.hbM.clear();
  }

  public String toString()
  {
    return "ListenerHandler{m_listeners=" + this.aBf.size() + ", m_listenerToRemove=" + this.hbM.size() + ", m_notifier=" + this.hbN + '}';
  }
}