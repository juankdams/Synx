import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class bkZ
  implements Yb
{
  private final Set fBN = new HashSet();
  private final azu fBO;
  private final Yb fBP;
  private Map map;
  private String prefix;
  private boolean fBQ = false;

  private boolean fBR = true;

  public bkZ(FF paramFF, Yb paramYb, Collection paramCollection)
  {
    this.fBP = paramYb;
    this.fBO = new azu(paramFF, paramCollection, this);
  }

  public Object getProperty(String paramString)
  {
    if (this.fBN.contains(paramString)) {
      throw new cJ("Property " + paramString + " was circularly " + "defined.");
    }

    try
    {
      String str = paramString;
      if ((this.prefix != null) && ((this.fBR) || (this.fBQ))) {
        str = this.prefix + paramString;
      }

      Object localObject1 = this.fBP.getProperty(str);
      Object localObject2;
      if (localObject1 != null)
      {
        return localObject1;
      }

      this.fBN.add(paramString);
      this.fBR = false;

      return this.fBO.ei((String)this.map.get(paramString));
    } finally {
      this.fBN.remove(paramString);
    }
  }

  public void h(Map paramMap)
  {
    a(paramMap, null, false);
  }

  public void a(Map paramMap, String paramString)
  {
    a(paramMap, null, false);
  }

  public void a(Map paramMap, String paramString, boolean paramBoolean)
  {
    this.map = paramMap;
    this.prefix = paramString;
    this.fBQ = paramBoolean;

    for (String str1 : paramMap.keySet()) {
      this.fBR = true;
      Object localObject = getProperty(str1);
      String str2 = localObject == null ? "" : localObject.toString();
      paramMap.put(str1, str2);
    }
  }
}