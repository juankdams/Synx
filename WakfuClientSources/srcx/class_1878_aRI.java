import java.util.HashMap;
import java.util.Map;

final class aRI extends ThreadLocal
{
  protected Map initialValue()
  {
    return new HashMap();
  }
}