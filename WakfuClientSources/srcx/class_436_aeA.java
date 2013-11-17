final class aeA
  implements bZs
{
  private int cJZ = 0;

  private aeA(akR paramakR) {  } 
  public int akt() { return this.cJZ; }

  public final boolean f(Object paramObject1, Object paramObject2)
  {
    this.cJZ += (this.cVT.iuH.ba(paramObject1) ^ (paramObject2 == null ? 0 : paramObject2.hashCode()));
    return true;
  }
}