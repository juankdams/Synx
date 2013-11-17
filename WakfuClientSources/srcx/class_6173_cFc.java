public class cFc
{
  private Object bEY;
  private Object bEZ;
  private Object ize;

  public cFc()
  {
  }

  public cFc(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    this.bEY = paramObject1;
    this.bEZ = paramObject2;
    this.ize = paramObject3;
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

  public Object cAE() {
    return this.ize;
  }

  public void bd(Object paramObject) {
    this.ize = paramObject;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    cFc localcFc = (cFc)paramObject;

    if (this.bEY != null ? !this.bEY.equals(localcFc.bEY) : localcFc.bEY != null)
      return false;
    if (this.bEZ != null ? !this.bEZ.equals(localcFc.bEZ) : localcFc.bEZ != null)
      return false;
    if (this.ize != null ? !this.ize.equals(localcFc.ize) : localcFc.ize != null) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    int i = this.bEY != null ? this.bEY.hashCode() : 0;
    i = 31 * i + (this.bEZ != null ? this.bEZ.hashCode() : 0);
    i = 31 * i + (this.ize != null ? this.ize.hashCode() : 0);
    return i;
  }
}