import java.util.ArrayList;

class aPP
{
  private final ArrayList eMQ = new ArrayList();
  private final ArrayList eMR = new ArrayList();

  public void put(Object paramObject1, Object paramObject2) {
    if (this.eMQ.contains(paramObject1))
      return;
    this.eMQ.add(paramObject1);
    this.eMR.add(paramObject2);
  }

  public Object getValue(Object paramObject) {
    int i = this.eMQ.indexOf(paramObject);
    return i == -1 ? null : this.eMR.get(i);
  }
}