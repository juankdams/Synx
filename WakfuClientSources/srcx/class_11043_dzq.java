import java.lang.ref.WeakReference;

class dzq extends WeakReference
{
  int hash;
  private final blN beV;

  dzq(blN paramblN, Object paramObject)
  {
    super(paramObject, blN.a(paramblN));
    this.hash = System.identityHashCode(paramObject);
  }

  public int hashCode() {
    return this.hash;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject) {
      return true;
    }
    dzq localdzq = (dzq)paramObject;
    if (get() == localdzq.get()) {
      return true;
    }
    return false;
  }
}