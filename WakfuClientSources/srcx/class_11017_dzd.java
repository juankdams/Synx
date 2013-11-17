public final class dzd extends ThreadLocal
{
  protected synchronized Object initialValue()
  {
    return new Integer(0);
  }
}