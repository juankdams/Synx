import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class cHn
  implements vN
{
  private final Map map;

  public cHn(Map paramMap)
  {
    this.map = new HashMap(paramMap);
  }
  public String a(bMB parambMB, Method paramMethod) {
    String str = paramMethod.getName();
    if (this.map.containsKey(str)) {
      return (String)this.map.get(str);
    }
    return str;
  }
}