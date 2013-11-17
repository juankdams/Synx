import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dGI
  implements dUo
{
  private static final Logger K = Logger.getLogger(dGI.class);
  public static final boolean lRm = true;
  public static final String lRn = "checkOut";
  private final aKN lRo;
  private final ArrayList lRp = new ArrayList();
  private final ArrayList lRq = new ArrayList();
  private final ArrayList lRr = new ArrayList();
  private final ArrayList lRs = new ArrayList();
  private final Class lRt;
  private Method lRu = null;

  protected Class[] lRv = { Object.class, String.class, Float.TYPE, Double.TYPE, Boolean.TYPE, Character.TYPE, Long.TYPE, Byte.TYPE, Integer.TYPE };

  public dGI(Class paramClass, aKN paramaKN)
  {
    this.lRo = paramaKN;
    this.lRt = paramClass;
    dhE();
    dhC();
    dhF();
    dhG();
    dhD();
  }

  public dGI(Class paramClass)
  {
    this(paramClass, aKN.bcs());
  }

  protected int ao(Class paramClass)
  {
    for (int i = 0; i < this.lRv.length; i++) {
      if (paramClass.isAssignableFrom(this.lRv[i])) {
        return i;
      }
    }
    return -1;
  }

  protected void dhC()
  {
    Method[] arrayOfMethod = this.lRt.getMethods();
    for (int i = 0; i < arrayOfMethod.length; i++) {
      String str = arrayOfMethod[i].getName();
      if (str.startsWith("get"))
        this.lRq.add(arrayOfMethod[i]);
    }
  }

  protected void dhD()
  {
    try {
      this.lRu = this.lRt.getDeclaredMethod("checkOut", new Class[0]);
    }
    catch (Exception localException)
    {
    }
  }

  protected void dhE()
  {
    d(this.lRp, "set");
  }

  protected void dhF() {
    d(this.lRr, "prepend");
  }

  protected void dhG() {
    d(this.lRs, "append");
  }

  public bdj dhH()
  {
    bdj localbdj;
    if (this.lRu != null) {
      localbdj = (bdj)this.lRu.invoke(null, new Object[0]);
    } else {
      localbdj = (bdj)this.lRt.newInstance();
      localbdj.aJ();
    }
    return localbdj;
  }

  public bdj a(ceK paramceK, String paramString)
  {
    paramceK.al(this.lRt);
    bdj localbdj;
    if (this.lRu != null) {
      localbdj = (bdj)this.lRu.invoke(null, new Object[0]);
      paramceK.a(new cHH(this.lRt, paramString, this.lRt.getSimpleName() + ".checkOut()"));
    } else {
      localbdj = (bdj)this.lRt.newInstance();
      paramceK.a(new cHH(this.lRt, paramString, "new " + this.lRt.getSimpleName() + "()"));
      if ((localbdj instanceof bWU)) {
        paramceK.a(new bol(null, "onCheckOut", paramString));
        localbdj.aJ();
      }
    }
    return localbdj;
  }

  public bdj bA(Object paramObject)
  {
    Class localClass = paramObject.getClass();

    Constructor[] arrayOfConstructor = this.lRt.getConstructors();
    for (int i = 0; i < arrayOfConstructor.length; i++) {
      Class[] arrayOfClass = arrayOfConstructor[i].getParameterTypes();
      if ((0 < arrayOfClass.length) && (arrayOfClass[0].isAssignableFrom(localClass))) {
        return (bdj)arrayOfConstructor[i].newInstance(new Object[] { paramObject });
      }
    }
    return (bdj)this.lRt.newInstance();
  }

  public bdj D(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return (bdj)this.lRt.newInstance();
    }
    Class[] arrayOfClass1 = new Class[paramArrayOfObject.length];
    Constructor[] arrayOfConstructor = this.lRt.getConstructors();
    Constructor localConstructor = null;

    for (int i = 0; i < arrayOfClass1.length; i++) {
      arrayOfClass1[i] = paramArrayOfObject[i].getClass();
    }

    for (i = 0; (localConstructor == null) && (i < arrayOfConstructor.length); i++) {
      Class[] arrayOfClass2 = arrayOfConstructor[i].getParameterTypes();
      if (arrayOfClass2.length == arrayOfClass1.length)
      {
        localConstructor = arrayOfConstructor[i];

        for (int j = 0; (localConstructor != null) && (j < arrayOfClass2.length); j++) {
          if (arrayOfClass2[j].equals(Object.class)) {
            if (!arrayOfClass2[j].equals(arrayOfClass1[j])) {
              localConstructor = null;
            }
          }
          else if (!arrayOfClass2[j].isAssignableFrom(arrayOfClass1[j])) {
            localConstructor = null;
          }

        }

      }

    }

    if (localConstructor != null) {
      return (bdj)localConstructor.newInstance(paramArrayOfObject);
    }
    throw new IllegalArgumentException("Impossible de trouver de constructeur pour les types : " + arrayOfClass1);
  }

  public Class bya()
  {
    return this.lRt;
  }

  public Method ap(Class paramClass) {
    Object localObject = null;
    int i = this.lRp.size();
    for (int j = 0; j < i; j++) {
      Method localMethod = (Method)this.lRp.get(j);
      Class[] arrayOfClass = localMethod.getParameterTypes();
      if ((arrayOfClass != null) && (0 < arrayOfClass.length) && (paramClass.equals(arrayOfClass[0]))) {
        localObject = localMethod;
        break;
      }
    }
    return localObject;
  }

  public Method ra(String paramString) {
    return b(this.lRp, paramString);
  }

  public Method rb(String paramString) {
    return b(this.lRq, paramString);
  }

  public Method rc(String paramString) {
    return a(this.lRp, paramString, "set");
  }

  public Method k(String paramString, Class paramClass) {
    return a(this.lRp, paramString, "set", paramClass);
  }

  public Method rd(String paramString) {
    return a(this.lRq, paramString, "get");
  }

  public Method l(String paramString, Class paramClass) {
    return a(this.lRq, paramString, "get", paramClass);
  }

  public Method re(String paramString) {
    return a(this.lRs, paramString, "append");
  }

  public Method m(String paramString, Class paramClass) {
    return a(this.lRs, paramString, "append", paramClass);
  }

  public Method rf(String paramString) {
    return a(this.lRr, paramString, "prepend");
  }

  public Method n(String paramString, Class paramClass) {
    return a(this.lRr, paramString, "prepend", paramClass);
  }

  private Method b(ArrayList paramArrayList, String paramString)
  {
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      Method localMethod = (Method)paramArrayList.get(j);
      if (localMethod.getName().equals(paramString)) {
        return localMethod;
      }
    }
    return null;
  }

  private ArrayList c(ArrayList paramArrayList, String paramString) {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      Method localMethod = (Method)paramArrayList.get(j);
      if (localMethod.getName().equalsIgnoreCase(paramString)) {
        localArrayList.add(localMethod);
      }
    }
    return localArrayList;
  }

  private Method a(ArrayList paramArrayList, String paramString1, String paramString2)
  {
    Object localObject = null;
    paramString1 = paramString2 + paramString1;
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      Method localMethod = (Method)paramArrayList.get(j);
      if (localMethod.getName().equalsIgnoreCase(paramString1)) {
        localObject = localMethod;
        break;
      }

    }

    return localObject;
  }

  private Method a(ArrayList paramArrayList, String paramString1, String paramString2, Class paramClass)
  {
    Object localObject = null;
    paramString1 = paramString2 + paramString1;
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      Method localMethod = (Method)paramArrayList.get(j);
      if (localMethod.getName().equalsIgnoreCase(paramString1)) {
        localObject = localMethod;

        if (paramClass == null)
        {
          break;
        }
        Class[] arrayOfClass = localMethod.getParameterTypes();
        if ((arrayOfClass.length > 0) && (arrayOfClass[0].isAssignableFrom(paramClass)))
        {
          break;
        }

      }

    }

    return localObject;
  }

  private void d(ArrayList paramArrayList, String paramString)
  {
    Method[] arrayOfMethod = this.lRt.getMethods();
    for (int i = 0; i < arrayOfMethod.length; i++) {
      String str = arrayOfMethod[i].getName();

      if ((str.startsWith(paramString)) && 
        (arrayOfMethod[i].getParameterTypes().length == 1)) {
        int j = paramArrayList.size();
        if (aKN.bcs().H(arrayOfMethod[i].getParameterTypes()[0])) {
          j = 0;
        }
        if (paramArrayList.contains(arrayOfMethod[i])) {
          K.warn("La classe " + this.lRt.getSimpleName() + " possède plusieurs fonctions possédant le nom " + arrayOfMethod[i].getName());
        }
        paramArrayList.add(j, arrayOfMethod[i]);
      }
    }
  }
}