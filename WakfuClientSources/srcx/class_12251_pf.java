import java.util.ListIterator;

public class pf extends dKS
{
  private final bUn aUV;

  protected pf(bUn parambUn, ListIterator paramListIterator)
  {
    super(paramListIterator);

    this.aUV = parambUn;
  }

  public void add(Object paramObject)
  {
    bUn.a(this.aUV, paramObject);
    this.kED.add(paramObject);
  }

  public void set(Object paramObject) {
    bUn.b(this.aUV, paramObject);
    this.kED.set(paramObject);
  }
}