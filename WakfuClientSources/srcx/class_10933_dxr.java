import java.util.ConcurrentModificationException;
import java.util.Map.Entry;

final class dxr
  implements Map.Entry
{
  private Object key;
  private Object lDy;
  private final int index;

  dxr(akR paramakR, Object paramObject1, Object paramObject2, int paramInt)
  {
    this.key = paramObject1;
    this.lDy = paramObject2;
    this.index = paramInt;
  }

  void bw(Object paramObject) {
    this.key = paramObject;
  }

  void bx(Object paramObject) {
    this.lDy = paramObject;
  }

  public Object getKey() {
    return this.key;
  }

  public Object getValue() {
    return this.lDy;
  }

  public Object setValue(Object paramObject) {
    if (this.cVT.dlG[this.index] != this.lDy) {
      throw new ConcurrentModificationException();
    }
    this.cVT.dlG[this.index] = paramObject;
    paramObject = this.lDy;
    this.lDy = paramObject;

    return paramObject;
  }

  public boolean equals(Object paramObject) {
    if ((paramObject instanceof Map.Entry)) {
      dxr localdxr = this;
      Map.Entry localEntry = (Map.Entry)paramObject;
      return (localdxr.getKey() == null ? localEntry.getKey() == null : localdxr.getKey().equals(localEntry.getKey())) && (localdxr.getValue() == null ? localEntry.getValue() == null : localdxr.getValue().equals(localEntry.getValue()));
    }

    return false;
  }

  public int hashCode() {
    return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() == null ? 0 : getValue().hashCode());
  }
}