public class apF
{
  protected Object dvI;

  public apF(Object paramObject)
  {
    this.dvI = paramObject;
  }

  public Object getSource()
  {
    return this.dvI;
  }

  public String toString()
  {
    return getClass().getName() + "[source=" + this.dvI + "]";
  }
}