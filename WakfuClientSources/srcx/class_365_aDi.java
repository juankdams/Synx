final class aDi extends ThreadLocal
{
  protected synchronized Object initialValue()
  {
    return new dVi(this);
  }
}