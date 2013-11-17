import java.util.Iterator;

public class aVU extends dBX
{
  protected aVU(akR paramakR)
  {
    super(paramakR, null);
  }
  public Iterator iterator() { return new cJh(this.cVT); }

  public boolean removeElement(Object paramObject)
  {
    return null != this.cVT.remove(paramObject);
  }

  public boolean az(Object paramObject) {
    return this.cVT.contains(paramObject);
  }
}