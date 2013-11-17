final class dld
{
  private final Object value;
  private final int id;

  public dld(Object paramObject)
  {
    this.id = System.identityHashCode(paramObject);

    this.value = paramObject;
  }

  public int hashCode()
  {
    return this.id;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dld)) {
      return false;
    }
    dld localdld = (dld)paramObject;
    if (this.id != localdld.id) {
      return false;
    }

    return this.value == localdld.value;
  }
}