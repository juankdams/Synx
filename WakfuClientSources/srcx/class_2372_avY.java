import java.util.Iterator;

public class avY
  implements Iterable
{
  private final cSR dKZ = new cSR();

  public void a(aWT paramaWT) {
    this.dKZ.put(paramaWT.getId(), paramaWT);
  }

  public final aWT kC(int paramInt) {
    return (aWT)this.dKZ.get(paramInt);
  }

  public final Object kD(int paramInt)
  {
    aWT localaWT = (aWT)this.dKZ.get(paramInt);
    if (localaWT != null)
      return localaWT.getObject();
    return null;
  }

  public Iterator iterator() {
    return new aOg(this.dKZ);
  }
}