import java.util.ListIterator;

public class aTZ extends dKS
{
  private final bzh eUC;

  protected aTZ(bzh parambzh, ListIterator paramListIterator)
  {
    super(paramListIterator);

    this.eUC = parambzh;
  }

  public void add(Object paramObject)
  {
    paramObject = bzh.a(this.eUC, paramObject);
    this.kED.add(paramObject);
  }

  public void set(Object paramObject) {
    paramObject = bzh.b(this.eUC, paramObject);
    this.kED.set(paramObject);
  }
}