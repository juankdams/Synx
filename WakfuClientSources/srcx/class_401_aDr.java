import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class aDr
  implements Cloneable
{
  private static final boolean dXZ = aCt.gd("win9x");

  private List dYa = new ArrayList();

  private String dYb = null;

  protected static final String dYc = bof.LINE_SEP + "The ' characters around the executable and arguments are" + bof.LINE_SEP + "not part of the command." + bof.LINE_SEP;

  public aDr(String paramString)
  {
    String[] arrayOfString = gl(paramString);
    if ((arrayOfString != null) && (arrayOfString.length > 0)) {
      gj(arrayOfString[0]);
      for (int i = 1; i < arrayOfString.length; i++)
        aPr().setValue(arrayOfString[i]);
    }
  }

  public aDr()
  {
  }

  public daB aPr()
  {
    return dk(false);
  }

  public daB dk(boolean paramBoolean)
  {
    daB localdaB = new daB();
    if (paramBoolean)
      this.dYa.add(0, localdaB);
    else {
      this.dYa.add(localdaB);
    }
    return localdaB;
  }

  public void gj(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    this.dYb = paramString.replace('/', File.separatorChar).replace('\\', File.separatorChar);
  }

  public String aPs()
  {
    return this.dYb;
  }

  public void h(String[] paramArrayOfString)
  {
    for (int i = 0; i < paramArrayOfString.length; i++)
      aPr().setValue(paramArrayOfString[i]);
  }

  public String[] aPt()
  {
    LinkedList localLinkedList = new LinkedList();
    a(localLinkedList.listIterator());
    return (String[])localLinkedList.toArray(new String[localLinkedList.size()]);
  }

  public void a(ListIterator paramListIterator)
  {
    if (this.dYb != null) {
      paramListIterator.add(this.dYb);
    }
    b(paramListIterator);
  }

  public String[] aPu()
  {
    ArrayList localArrayList = new ArrayList(this.dYa.size() * 2);
    b(localArrayList.listIterator());
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public void b(ListIterator paramListIterator)
  {
    int i = this.dYa.size();
    for (int j = 0; j < i; j++) {
      daB localdaB = (daB)this.dYa.get(j);
      String[] arrayOfString = localdaB.bEZ();
      if (arrayOfString != null)
        for (int k = 0; k < arrayOfString.length; k++)
          paramListIterator.add(arrayOfString[k]);
    }
  }

  public String toString()
  {
    return toString(aPt());
  }

  public static String gk(String paramString)
  {
    if (paramString.indexOf("\"") > -1) {
      if (paramString.indexOf("'") > -1) {
        throw new cJ("Can't handle single and double quotes in same argument");
      }

      return '\'' + paramString + '\'';
    }
    if ((paramString.indexOf("'") > -1) || (paramString.indexOf(" ") > -1) || ((dXZ) && (paramString.indexOf(';') != -1)))
    {
      return '"' + paramString + '"';
    }
    return paramString;
  }

  public static String toString(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return "";
    }

    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfString.length; i++) {
      if (i > 0) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(gk(paramArrayOfString[i]));
    }
    return localStringBuilder.toString();
  }

  public static String[] gl(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      return new String[0];
    }

    int i = 0;
    int j = 1;
    int k = 2;
    int m = 0;
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, "\"' ", true);
    ArrayList localArrayList = new ArrayList();
    StringBuilder localStringBuilder = new StringBuilder();
    int n = 0;

    while (localStringTokenizer.hasMoreTokens()) {
      String str = localStringTokenizer.nextToken();
      switch (m) {
      case 1:
        if ("'".equals(str)) {
          n = 1;
          m = 0;
        } else {
          localStringBuilder.append(str);
        }
        break;
      case 2:
        if ("\"".equals(str)) {
          n = 1;
          m = 0;
        } else {
          localStringBuilder.append(str);
        }
        break;
      default:
        if ("'".equals(str))
          m = 1;
        else if ("\"".equals(str))
          m = 2;
        else if (" ".equals(str)) {
          if ((n != 0) || (localStringBuilder.length() != 0)) {
            localArrayList.add(localStringBuilder.toString());
            localStringBuilder.setLength(0);
          }
        }
        else localStringBuilder.append(str);

        n = 0;
      }
    }

    if ((n != 0) || (localStringBuilder.length() != 0)) {
      localArrayList.add(localStringBuilder.toString());
    }
    if ((m == 1) || (m == 2)) {
      throw new cJ("unbalanced quotes in " + paramString);
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public int size()
  {
    return aPt().length;
  }

  public Object clone()
  {
    try
    {
      aDr localaDr = (aDr)super.clone();
      localaDr.dYa = new ArrayList(this.dYa);
      return localaDr;
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new cJ(localCloneNotSupportedException);
    }
  }

  public void clear()
  {
    this.dYb = null;
    this.dYa.clear();
  }

  public void aPv()
  {
    this.dYa.clear();
  }

  public bKE aPw()
  {
    return new bKE(this, this.dYa.size());
  }

  public String aPx()
  {
    return a(this);
  }

  public String aPy()
  {
    return b(this);
  }

  public static String a(aDr paramaDr)
  {
    return i(paramaDr.aPt());
  }

  public static String b(aDr paramaDr)
  {
    return j(paramaDr.aPu());
  }

  public static String i(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer("Executing '");
    localStringBuffer.append(paramArrayOfString[0]);
    localStringBuffer.append("'");
    if (paramArrayOfString.length > 1) {
      localStringBuffer.append(" with ");
      localStringBuffer.append(a(paramArrayOfString, 1));
    } else {
      localStringBuffer.append(dYc);
    }
    return localStringBuffer.toString();
  }

  public static String j(String[] paramArrayOfString)
  {
    return a(paramArrayOfString, 0);
  }

  protected static String a(String[] paramArrayOfString, int paramInt)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= paramInt)) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer("argument");
    if (paramArrayOfString.length > paramInt) {
      localStringBuffer.append("s");
    }
    localStringBuffer.append(":").append(bof.LINE_SEP);
    for (int i = paramInt; i < paramArrayOfString.length; i++) {
      localStringBuffer.append("'").append(paramArrayOfString[i]).append("'").append(bof.LINE_SEP);
    }

    localStringBuffer.append(dYc);
    return localStringBuffer.toString();
  }

  public Iterator iterator()
  {
    return this.dYa.iterator();
  }
}