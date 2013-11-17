public class Cs
{
  private Object bEY;
  private Object bEZ;

  public Cs()
  {
  }

  public Cs(Object paramObject1, Object paramObject2)
  {
    this.bEY = paramObject1;
    this.bEZ = paramObject2;
  }

  public Object getFirst() {
    return this.bEY;
  }

  public void w(Object paramObject) {
    this.bEY = paramObject;
  }

  public Object Lp() {
    return this.bEZ;
  }

  public void x(Object paramObject) {
    this.bEZ = paramObject;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof Cs)) {
      return false;
    }
    Cs localCs = (Cs)paramObject;

    if (this.bEY != null ? !this.bEY.equals(localCs.bEY) : localCs.bEY != null)
      return false;
    if (this.bEZ != null ? !this.bEZ.equals(localCs.bEZ) : localCs.bEZ != null) {
      return false;
    }
    return true;
  }

  public int hashCode()
  {
    int i = this.bEY != null ? this.bEY.hashCode() : 0;
    i = 31 * i + (this.bEZ != null ? this.bEZ.hashCode() : 0);
    return i;
  }

  public String toString() {
    return "ObjectPair{m_first=" + this.bEY + ", m_second=" + this.bEZ + '}';
  }
}