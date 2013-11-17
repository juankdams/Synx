import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import org.xml.sax.AttributeList;

public class dhB
{
  public static final String lcu = "antlib:org.apache.tools.ant";
  public static final String lcv = "ant:current";
  public static final String lcw = "ant:attribute";
  public static final String lcx = "antlib:";
  public static final String lcy = "ant-type";
  public static final String lcz = "org.apache.tools.ant.ProjectHelper";
  public static final String gHJ = "META-INF/services/org.apache.tools.ant.ProjectHelper";
  public static final String lcA = "ant.projectHelper";
  public static final String lcB = "USE_PROJECT_NAME_AS_TARGET_PREFIX";
  private Vector lcC = new Vector();
  private List lcD = new LinkedList();

  private static final ThreadLocal lcE = new ThreadLocal();

  private static final ThreadLocal lcF = new bgT();

  private static final ThreadLocal lcG = new bgS();

  public static void a(FF paramFF, File paramFile)
  {
    WO localWO = new WO(paramFile);
    dhB localdhB = azA.aLs().c(localWO);
    paramFF.g("ant.projectHelper", localdhB);
    localdhB.a(paramFF, paramFile);
  }

  public Vector cQe()
  {
    return this.lcC;
  }

  public List cQf()
  {
    return this.lcD;
  }

  public static String cQg()
  {
    return (String)lcE.get();
  }

  public static void pb(String paramString)
  {
    lcE.set(paramString);
  }

  public static String cQh()
  {
    return (String)lcF.get();
  }

  public static void pc(String paramString)
  {
    lcF.set(paramString);
  }

  public static boolean cQi()
  {
    return Boolean.TRUE.equals(lcG.get());
  }

  public static void jd(boolean paramBoolean)
  {
    lcG.set(Boolean.valueOf(paramBoolean));
  }

  public void a(FF paramFF, Object paramObject)
  {
    throw new cJ("ProjectHelper.parse() must be implemented in a helper plugin " + getClass().getName());
  }

  public static dhB cQj()
  {
    return (dhB)azA.aLs().aLv().next();
  }

  public static ClassLoader getContextClassLoader()
  {
    return cRj.cHL() ? cRj.getContextClassLoader() : null;
  }

  public static void a(Object paramObject, AttributeList paramAttributeList, FF paramFF)
  {
    if ((paramObject instanceof bew)) {
      paramObject = ((bew)paramObject).bsm();
    }
    wE localwE = wE.a(paramFF, paramObject.getClass());

    int i = 0; for (int j = paramAttributeList.getLength(); i < j; i++)
    {
      String str = a(paramFF, paramAttributeList.getValue(i), paramFF.Pz());
      try {
        localwE.a(paramFF, paramObject, paramAttributeList.getName(i).toLowerCase(Locale.ENGLISH), str);
      }
      catch (cJ localcJ) {
        if (!paramAttributeList.getName(i).equals("id"))
          throw localcJ;
      }
    }
  }

  public static void a(FF paramFF, Object paramObject, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    a(paramFF, paramObject, new String(paramArrayOfChar, paramInt1, paramInt2));
  }

  public static void a(FF paramFF, Object paramObject, String paramString)
  {
    if (paramString == null) {
      return;
    }
    if ((paramObject instanceof bew)) {
      paramObject = ((bew)paramObject).bsm();
    }
    wE.a(paramFF, paramObject.getClass()).a(paramFF, paramObject, paramString);
  }

  public static void b(FF paramFF, Object paramObject1, Object paramObject2, String paramString)
  {
    wE localwE = wE.a(paramFF, paramObject1.getClass());
    localwE.a(paramFF, paramObject1, paramObject2, paramString);
  }

  public static String d(FF paramFF, String paramString)
  {
    return paramFF.bH(paramString);
  }

  public static String a(FF paramFF, String paramString, Hashtable paramHashtable)
  {
    afR localafR = afR.t(paramFF);
    return localafR.a(null, paramString, paramHashtable);
  }

  public static void a(String paramString, Vector paramVector1, Vector paramVector2)
  {
    afR.b(paramString, paramVector1, paramVector2);
  }

  public static String bg(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.equals("")) || (paramString1.equals("antlib:org.apache.tools.ant"))) {
      return paramString2;
    }
    return paramString1 + ":" + paramString2;
  }

  public static String pd(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    int i = paramString.lastIndexOf(':');
    if (i == -1) {
      return "";
    }
    return paramString.substring(0, i);
  }

  public static String pe(String paramString)
  {
    int i = paramString.lastIndexOf(':');
    if (i == -1) {
      return paramString;
    }
    return paramString.substring(i + 1);
  }

  public static String pf(String paramString)
  {
    return "attribute namespace:" + paramString;
  }

  public static cJ a(cJ paramcJ, aaA paramaaA)
  {
    if ((paramcJ.gu() == null) || (paramcJ.getMessage() == null)) {
      return paramcJ;
    }
    String str = "The following error occurred while executing this line:" + System.getProperty("line.separator") + paramcJ.gu().toString() + paramcJ.getMessage();

    if (paramaaA == null) {
      return new cJ(str, paramcJ);
    }
    return new cJ(str, paramcJ, paramaaA);
  }

  public boolean j(bFe parambFe)
  {
    return false;
  }

  public aQS a(FF paramFF, bFe parambFe)
  {
    throw new cJ("can't parse antlib descriptors");
  }

  public boolean k(bFe parambFe)
  {
    return true;
  }

  public String cQk()
  {
    return "build.xml";
  }

  public void aa(FF paramFF)
  {
    for (String[] arrayOfString : cQf()) {
      String str1 = arrayOfString[0];
      String str2 = arrayOfString[1];
      wi localwi = wi.aX(arrayOfString[2]);

      String str3 = arrayOfString.length > 3 ? arrayOfString[3] : null;

      Hashtable localHashtable = paramFF.PN();
      wZ localwZ1 = null;
      if (str3 == null)
      {
        localwZ1 = (wZ)localHashtable.get(str1);
      }
      else
      {
        localwZ1 = (wZ)localHashtable.get(str3 + str1);
        if (localwZ1 == null) {
          localwZ1 = (wZ)localHashtable.get(str1);
        }

      }

      if (localwZ1 == null) {
        String str4 = "can't add target " + str2 + " to extension-point " + str1 + " because the extension-point is unknown.";

        if (localwi == wi.blv)
          throw new cJ(str4);
        if (localwi == wi.blw) {
          wZ localwZ2 = (wZ)localHashtable.get(str2);
          paramFF.a(localwZ2, "Warning: " + str4, 1);
        }
      } else {
        if (!(localwZ1 instanceof aB)) {
          throw new cJ("referenced target " + str1 + " is not an extension-point");
        }

        localwZ1.bh(str2);
      }
    }
  }
}