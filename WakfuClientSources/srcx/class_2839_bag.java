import java.util.Iterator;

public class bag extends dBX
{
  protected bag(akR paramakR)
  {
    super(paramakR, null);
  }
  public Iterator iterator() { return new bXS(this, this.cVT); }


  public boolean az(Object paramObject)
  {
    return this.cVT.containsValue(paramObject);
  }

  public boolean removeElement(Object paramObject) {
    Object[] arrayOfObject1 = this.cVT.dlG;
    Object[] arrayOfObject2 = this.cVT.iuG;

    for (int i = arrayOfObject1.length; i-- > 0; ) {
      if (((arrayOfObject2[i] != cCi.iuJ) && (arrayOfObject2[i] != cCi.iuI) && (paramObject == arrayOfObject1[i])) || ((null != arrayOfObject1[i]) && (arrayOfObject1[i].equals(paramObject))))
      {
        this.cVT.aQ(i);
        return true;
      }
    }

    return false;
  }
}