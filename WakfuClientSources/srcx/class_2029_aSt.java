import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class aSt
{
  public static final String[] EMPTY_STRING_ARRAY = new String[0];
  private static final Pattern ePF = Pattern.compile("(^([a-zA-Z.]+):)?([a-zA-Z]+){1}(\\((([_a-zA-Z0-9\\-\\.]+([,]?[\\s]*[_a-zA-Z0-9\\-\\.]+)*)*)\\))?");
  public static final String ePG = ";";
  protected static final Logger K = Logger.getLogger(aSt.class);
  protected String[] ePH;
  protected String brS = null;
  protected cpa cUY = null;

  public void hg(String paramString)
  {
    this.brS = paramString;
    this.ePH = dzp.c(paramString, ';');
  }

  public void a(String paramString, cpa paramcpa)
  {
    this.brS = paramString;
    this.ePH = dzp.c(paramString, ';');
    this.cUY = paramcpa;
  }

  public void setElementMap(cpa paramcpa)
  {
    this.cUY = paramcpa;
  }

  public Object bif()
  {
    Object localObject = null;
    for (String str1 : this.ePH) {
      Matcher localMatcher = ePF.matcher(str1);
      if (!localMatcher.matches()) {
        K.error("Erreur de syntaxe : '" + str1 + "' n'est pas du type 'package:method(param1,param2,...)'.");
      }
      else {
        String str2 = localMatcher.group(2);
        String str3 = localMatcher.group(3);
        String str4 = localMatcher.group(5);
        String[] arrayOfString2;
        if (str4 != null)
          arrayOfString2 = dzp.c(str4, ',');
        else {
          arrayOfString2 = EMPTY_STRING_ARRAY;
        }

        localObject = b(str2, str3, arrayOfString2);
      }
    }
    return localObject;
  }

  private Object b(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();

    a(paramArrayOfString, localArrayList1, localArrayList2);

    Class localClass1 = cBQ.cxL().mO(paramString1);
    if (localClass1 == null) {
      K.error("La méthode '" + (paramString1 != null ? paramString1 + ":" : "") + paramString2 + "(" + v(localArrayList1) + ")' est inconnue !");
      return null;
    }

    Method[] arrayOfMethod1 = localClass1.getMethods();
    for (Method localMethod : arrayOfMethod1)
      if (localMethod.getName().equals(paramString2))
      {
        boolean bool = false;
        Class[] arrayOfClass = localMethod.getParameterTypes();
        if (arrayOfClass.length <= localArrayList1.size())
        {
          for (int k = 0; k < arrayOfClass.length; k++) {
            Class localClass2 = arrayOfClass[k];

            if (localArrayList1.size() <= k)
              bool = false;
            else if (localClass2.isArray()) {
              if (localClass2.isAssignableFrom((Class)localArrayList1.get(k))) {
                bool = true;
              } else {
                int m = 0;
                int n = localArrayList1.size();
                for (int i1 = k; (i1 < n) && 
                  (localClass2.getComponentType().isAssignableFrom((Class)localArrayList1.get(i1))); i1++)
                {
                  m++;
                }
                if (m > 0) {
                  Object localObject = Array.newInstance(localClass2.getComponentType(), m);
                  for (int i2 = 0; i2 < m; i2++) {
                    localArrayList1.remove(k);
                    Array.set(localObject, i2, localArrayList2.remove(k));
                  }
                  localArrayList2.add(k, localObject);
                  localArrayList1.add(k, localClass2);
                } else {
                  bool = false;
                }
              }
            }
            else bool = arrayOfClass[k].isAssignableFrom((Class)localArrayList1.get(k));

            if (!bool)
            {
              break;
            }
          }
          if (arrayOfClass.length != localArrayList1.size()) {
            bool = false;
          }

          if (bool)
            try {
              return localMethod.invoke(null, localArrayList2.toArray());
            } catch (Exception localException) {
              K.error("Erreur lors du invokeCallBack sur la méthode " + localMethod.getName() + " de la classe " + localClass1.getName(), localException);
              if (localException.getCause() != null) {
                K.error("Raison : ", localException.getCause());
              }

              return null;
            }
        }
      }
    K.error("La méthode '" + (paramString1 != null ? paramString1 + ":" : "") + paramString2 + "(" + v(localArrayList1) + ")' est inconnue !");
    return null;
  }

  protected void a(String[] paramArrayOfString, List paramList1, List paramList2)
  {
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      aNL localaNL = null;
      if (this.cUY != null) {
        localaNL = this.cUY.fi(paramArrayOfString[i]);
      }
      if (localaNL != null) {
        Object localObject = localaNL.getElementValue();
        if (localObject != null) {
          paramList1.add(localObject.getClass());
          paramList2.add(localObject);
        }
      }
      else if (paramArrayOfString[i].length() != 0)
      {
        paramList1.add(String.class);
        paramList2.add(paramArrayOfString[i]);
      }
    }
  }

  private static String v(List paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (Class localClass : paramList) {
      localStringBuilder.append(',').append(localClass.getName());
    }
    return localStringBuilder.toString().substring(1);
  }
}