import java.util.Iterator;
import java.util.Map.Entry;

public class ceE extends dBX
{
  protected ceE(akR paramakR)
  {
    super(paramakR, null);
  }

  public Iterator iterator()
  {
    return new dGO(this, this.cVT);
  }

  public boolean a(Map.Entry paramEntry)
  {
    Object localObject2 = d(paramEntry);
    int i = this.cVT.index(localObject2);
    if (i >= 0) {
      Object localObject1 = c(paramEntry);
      if ((localObject1 == this.cVT.dlG[i]) || ((null != localObject1) && (localObject1.equals(this.cVT.dlG[i]))))
      {
        this.cVT.aQ(i);
        return true;
      }
    }
    return false;
  }

  public boolean b(Map.Entry paramEntry) {
    Object localObject1 = this.cVT.get(d(paramEntry));
    Object localObject2 = paramEntry.getValue();
    return (localObject2 == localObject1) || ((null != localObject1) && (localObject1.equals(localObject2)));
  }

  protected Object c(Map.Entry paramEntry)
  {
    return paramEntry.getValue();
  }

  protected Object d(Map.Entry paramEntry) {
    return paramEntry.getKey();
  }
}