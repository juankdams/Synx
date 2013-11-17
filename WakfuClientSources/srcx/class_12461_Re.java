import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Re extends djh
{
  private static final String bdh = "@(#) $RCSfile: ProcessingInstruction.java,v $ $Revision: 1.46 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";
  protected String target;
  protected String cqw;
  protected Map cqx;

  protected Re()
  {
  }

  public Re(String paramString1, String paramString2)
  {
    ds(paramString1);
    dr(paramString2);
  }

  public Re(String paramString, Map paramMap)
  {
    ds(paramString);
    a(paramMap);
  }

  public Object clone()
  {
    Re localRe = (Re)super.clone();

    if (this.cqx != null) {
      localRe.cqx = dp(this.cqw);
    }
    return localRe;
  }

  private static int[] dn(String paramString)
  {
    int i = 0;

    int j = 34;

    int k = 0;

    for (int m = 0; m < paramString.length(); m++) {
      int n = paramString.charAt(m);
      if ((n == 34) || (n == 39)) {
        if (i == 0)
        {
          j = n;
          i = 1;
          k = m + 1;
        }
        else if (j == n)
        {
          i = 0;
          return new int[] { k, m };
        }

      }

    }

    return null;
  }

  public String getData()
  {
    return this.cqw;
  }

  public List acE()
  {
    Set localSet = this.cqx.entrySet();
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = localSet.iterator(); localIterator.hasNext(); ) {
      String str1 = localIterator.next().toString();
      String str2 = str1.substring(0, str1.indexOf("="));
      localArrayList.add(str2);
    }
    return localArrayList;
  }

  public String jdMethod_do(String paramString)
  {
    return (String)this.cqx.get(paramString);
  }

  public String getTarget()
  {
    return this.target;
  }

  public String getValue()
  {
    return this.cqw;
  }

  private Map dp(String paramString)
  {
    HashMap localHashMap = new HashMap();

    String str1 = paramString.trim();

    while (!str1.trim().equals(""))
    {
      String str2 = "";
      String str3 = "";
      int i = 0;
      char c1 = str1.charAt(i);
      for (int j = 1; 
        j < str1.length(); j++) {
        char c2 = str1.charAt(j);
        if (c2 == '=') {
          str2 = str1.substring(i, j).trim();

          int[] arrayOfInt = dn(
            str1.substring(j + 1));

          if (arrayOfInt == null) {
            return new HashMap();
          }
          str3 = str1.substring(arrayOfInt[0] + j + 1, 
            arrayOfInt[1] + j + 1);
          j += arrayOfInt[1] + 1;
          break;
        }
        if ((Character.isWhitespace(c1)) && 
          (!Character.isWhitespace(c2))) {
          i = j;
        }

        c1 = c2;
      }

      str1 = str1.substring(j);

      if ((str2.length() > 0) && (str3 != null))
      {
        localHashMap.put(str2, str3);
      }

    }

    return localHashMap;
  }

  public boolean dq(String paramString)
  {
    if (this.cqx.remove(paramString) != null) {
      this.cqw = b(this.cqx);
      return true;
    }

    return false;
  }

  public Re dr(String paramString)
  {
    String str = asE.fA(paramString);
    if (str != null) {
      throw new aim(paramString, str);
    }

    this.cqw = paramString;
    this.cqx = dp(paramString);
    return this;
  }

  public Re a(Map paramMap)
  {
    String str1 = b(paramMap);

    String str2 = asE.fA(str1);
    if (str2 != null) {
      throw new aim(str1, str2);
    }

    this.cqw = str1;
    this.cqx = paramMap;
    return this;
  }

  public Re y(String paramString1, String paramString2)
  {
    String str = asE.fA(paramString1);
    if (str != null) {
      throw new aim(paramString1, str);
    }

    str = asE.fA(paramString2);
    if (str != null) {
      throw new aim(paramString2, str);
    }

    this.cqx.put(paramString1, paramString2);
    this.cqw = b(this.cqx);
    return this;
  }

  public Re ds(String paramString)
  {
    String str;
    if ((str = asE.fB(paramString)) != null)
    {
      throw new anD(paramString, str);
    }

    this.target = paramString;
    return this;
  }

  public String toString()
  {
    return 
      "[ProcessingInstruction: " + 
      new cpV().a(this) + 
      "]";
  }

  private String b(Map paramMap)
  {
    StringBuffer localStringBuffer = new StringBuffer();

    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext()) {
      String str1 = (String)localIterator.next();
      String str2 = (String)paramMap.get(str1);
      localStringBuffer.append(str1)
        .append("=\"")
        .append(str2)
        .append("\" ");
    }

    if (localStringBuffer.length() > 0) {
      localStringBuffer.setLength(localStringBuffer.length() - 1);
    }

    return localStringBuffer.toString();
  }
}