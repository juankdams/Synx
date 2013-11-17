import java.util.HashMap;

final class aDj extends ThreadLocal
{
  protected synchronized Object initialValue()
  {
    return new HashMap();
  }
}