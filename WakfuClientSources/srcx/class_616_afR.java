import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class afR
  implements Yb
{
  private static final BB cZa = new djU();

  private static final ce cZb = new djT();

  private static final ce cZc = new djX();

  private static final BB cZd = new djW();
  private FF aIn;
  private afR cZe;
  private final Hashtable cZf = new Hashtable();

  private Hashtable cZg = new Hashtable();

  private Hashtable cZh = new Hashtable();

  private Hashtable cZi = new Hashtable();

  protected afR()
  {
    a(cZd);
    a(cZa);
    a(cZc);
    a(cZb);
  }

  public static Object a(FF paramFF, String paramString)
  {
    return t(paramFF).getProperty(paramString);
  }

  public static void a(FF paramFF, String paramString, Object paramObject)
  {
    t(paramFF).b(paramString, paramObject, true);
  }

  public static void b(FF paramFF, String paramString, Object paramObject)
  {
    t(paramFF).j(paramString, paramObject);
  }

  public void b(FF paramFF)
  {
    this.aIn = paramFF;
  }

  public FF Ga()
  {
    return this.aIn;
  }

  public void a(afR paramafR)
  {
    this.cZe = paramafR;
  }

  public afR ari()
  {
    return this.cZe;
  }

  public static synchronized afR t(FF paramFF)
  {
    afR localafR = null;
    if (paramFF != null) {
      localafR = (afR)paramFF.bR("ant.PropertyHelper");
    }

    if (localafR != null) {
      return localafR;
    }

    localafR = new afR();
    localafR.b(paramFF);

    if (paramFF != null) {
      paramFF.g("ant.PropertyHelper", localafR);
    }

    return localafR;
  }

  public Collection arj()
  {
    return B(ce.class);
  }

  public boolean a(String paramString1, String paramString2, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (ari() != null) {
      boolean bool = ari().a(paramString1, paramString2, paramObject, paramBoolean1, paramBoolean2, paramBoolean3);

      if (bool) {
        return true;
      }
    }
    return false;
  }

  public Object c(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject;
    if (ari() != null) {
      localObject = ari().c(paramString1, paramString2, paramBoolean);
      if (localObject != null) {
        return localObject;
      }
    }

    if ((this.aIn != null) && (paramString2.startsWith("toString:"))) {
      paramString2 = paramString2.substring("toString:".length());
      localObject = this.aIn.bR(paramString2);
      return localObject == null ? null : localObject.toString();
    }
    return null;
  }

  public void a(String paramString, Vector paramVector1, Vector paramVector2)
  {
    b(paramString, paramVector1, paramVector2);
  }

  public String a(String paramString1, String paramString2, Hashtable paramHashtable)
  {
    return bH(paramString2);
  }

  public String bH(String paramString)
  {
    Object localObject = ei(paramString);
    return (localObject == null) || ((localObject instanceof String)) ? (String)localObject : localObject.toString();
  }

  public Object ei(String paramString)
  {
    return new azu(Ga(), arj(), this).ei(paramString);
  }

  public boolean ej(String paramString)
  {
    return new azu(Ga(), arj(), this).ej(paramString);
  }

  public boolean a(String paramString1, String paramString2, Object paramObject, boolean paramBoolean)
  {
    return b(paramString2, paramObject, paramBoolean);
  }

  public boolean b(String paramString, Object paramObject, boolean paramBoolean)
  {
    for (bME localbME : B(bME.class)) {
      if (localbME.b(paramString, paramObject, this)) {
        return true;
      }
    }
    synchronized (this)
    {
      if (this.cZh.containsKey(paramString)) {
        if ((this.aIn != null) && (paramBoolean)) {
          this.aIn.d("Override ignored for user property \"" + paramString + "\"", 3);
        }

        return false;
      }
      if ((this.aIn != null) && (paramBoolean)) {
        if (this.cZg.containsKey(paramString)) {
          this.aIn.d("Overriding previous definition of property \"" + paramString + "\"", 3);
        }

        this.aIn.d("Setting project property: " + paramString + " -> " + paramObject, 4);
      }

      if ((paramString != null) && (paramObject != null)) {
        this.cZg.put(paramString, paramObject);
      }
      return true;
    }
  }

  public void a(String paramString1, String paramString2, Object paramObject)
  {
    j(paramString2, paramObject);
  }

  public void j(String paramString, Object paramObject)
  {
    for (bME localbME : B(bME.class)) {
      if (localbME.a(paramString, paramObject, this)) {
        return;
      }
    }
    synchronized (this) {
      if ((this.aIn != null) && (this.cZg.containsKey(paramString))) {
        this.aIn.d("Override ignored for property \"" + paramString + "\"", 3);

        return;
      }
      if (this.aIn != null) {
        this.aIn.d("Setting project property: " + paramString + " -> " + paramObject, 4);
      }

      if ((paramString != null) && (paramObject != null))
        this.cZg.put(paramString, paramObject);
    }
  }

  public void b(String paramString1, String paramString2, Object paramObject)
  {
    k(paramString2, paramObject);
  }

  public void k(String paramString, Object paramObject)
  {
    if (this.aIn != null) {
      this.aIn.d("Setting ro project property: " + paramString + " -> " + paramObject, 4);
    }

    synchronized (this) {
      this.cZh.put(paramString, paramObject);
      this.cZg.put(paramString, paramObject);
    }
  }

  public void c(String paramString1, String paramString2, Object paramObject)
  {
    l(paramString2, paramObject);
  }

  public void l(String paramString, Object paramObject)
  {
    if (this.aIn != null) {
      this.aIn.d("Setting ro project property: " + paramString + " -> " + paramObject, 4);
    }

    synchronized (this) {
      this.cZi.put(paramString, paramObject);
      this.cZh.put(paramString, paramObject);
      this.cZg.put(paramString, paramObject);
    }
  }

  public Object getProperty(String paramString1, String paramString2)
  {
    return getProperty(paramString2);
  }

  public Object getProperty(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    for (BB localBB : B(BB.class)) {
      Object localObject = localBB.a(paramString, this);
      if (localObject != null)
      {
        return (localObject instanceof bYq) ? null : localObject;
      }
    }
    return this.cZg.get(paramString);
  }

  public Object C(String paramString1, String paramString2)
  {
    return ek(paramString2);
  }

  public Object ek(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return this.cZh.get(paramString);
  }

  public Hashtable Pz()
  {
    synchronized (this.cZg) {
      return new Hashtable(this.cZg);
    }
  }

  public Hashtable PA()
  {
    synchronized (this.cZh) {
      return new Hashtable(this.cZh);
    }
  }

  public Hashtable PB()
  {
    synchronized (this.cZi) {
      return new Hashtable(this.cZi);
    }
  }

  protected Hashtable ark()
  {
    return this.cZg;
  }

  protected Hashtable arl()
  {
    return this.cZh;
  }

  protected Hashtable arm()
  {
    return this.cZi;
  }

  public void m(FF paramFF)
  {
    synchronized (this.cZi) {
      Enumeration localEnumeration = this.cZi.keys();
      while (localEnumeration.hasMoreElements()) {
        String str = ((String)localEnumeration.nextElement()).toString();
        if (paramFF.bI(str) == null)
        {
          Object localObject1 = this.cZi.get(str);
          paramFF.r(str, localObject1.toString());
        }
      }
    }
  }

  public void l(FF paramFF)
  {
    synchronized (this.cZh) {
      Enumeration localEnumeration = this.cZh.keys();
      while (localEnumeration.hasMoreElements()) {
        Object localObject1 = localEnumeration.nextElement();
        if (!this.cZi.containsKey(localObject1))
        {
          Object localObject2 = this.cZh.get(localObject1);
          paramFF.q(localObject1.toString(), localObject2.toString());
        }
      }
    }
  }

  static void b(String paramString, Vector paramVector1, Vector paramVector2)
  {
    int i = 0;
    int j;
    while ((j = paramString.indexOf("$", i)) >= 0)
    {
      if (j > 0) {
        paramVector1.addElement(paramString.substring(i, j));
      }

      if (j == paramString.length() - 1) {
        paramVector1.addElement("$");
        i = j + 1;
      } else if (paramString.charAt(j + 1) != '{')
      {
        if (paramString.charAt(j + 1) == '$')
        {
          paramVector1.addElement("$");
          i = j + 2;
        }
        else {
          paramVector1.addElement(paramString.substring(j, j + 2));
          i = j + 2;
        }
      }
      else {
        int k = paramString.indexOf('}', j);
        if (k < 0) {
          throw new cJ("Syntax error in property: " + paramString);
        }
        String str = paramString.substring(j + 2, k);
        paramVector1.addElement(null);
        paramVector2.addElement(str);
        i = k + 1;
      }

    }

    if (i < paramString.length())
      paramVector1.addElement(paramString.substring(i));
  }

  public void a(azJ paramazJ)
  {
    synchronized (this.cZf) {
      for (Class localClass : b(paramazJ)) {
        Object localObject1 = (List)this.cZf.get(localClass);
        if (localObject1 == null) {
          localObject1 = new ArrayList();
        }
        else {
          localObject1 = new ArrayList((Collection)localObject1);
          ((List)localObject1).remove(paramazJ);
        }
        ((List)localObject1).add(0, paramazJ);
        this.cZf.put(localClass, Collections.unmodifiableList((List)localObject1));
      }
    }
  }

  protected List B(Class paramClass)
  {
    List localList = (List)this.cZf.get(paramClass);
    return localList == null ? Collections.emptyList() : localList;
  }

  protected static Set b(azJ paramazJ)
  {
    HashSet localHashSet = new HashSet();
    Class localClass1 = paramazJ.getClass();
    while (localClass1 != null) {
      Class[] arrayOfClass = localClass1.getInterfaces();
      for (int i = 0; i < arrayOfClass.length; i++) {
        if (azJ.class.isAssignableFrom(arrayOfClass[i]))
        {
          Class localClass2 = arrayOfClass[i];
          localHashSet.add(localClass2);
        }
      }
      localClass1 = localClass1.getSuperclass();
    }
    localHashSet.remove(azJ.class);
    return localHashSet;
  }

  public static Boolean R(Object paramObject)
  {
    if ((paramObject instanceof Boolean)) {
      return (Boolean)paramObject;
    }
    if ((paramObject instanceof String)) {
      String str = (String)paramObject;
      if (FF.bP(str)) {
        return Boolean.TRUE;
      }
      if (("off".equalsIgnoreCase(str)) || ("false".equalsIgnoreCase(str)) || ("no".equalsIgnoreCase(str)))
      {
        return Boolean.FALSE;
      }
    }
    return null;
  }

  private static boolean S(Object paramObject)
  {
    return (paramObject == null) || ("".equals(paramObject));
  }

  private boolean T(Object paramObject)
  {
    Boolean localBoolean = R(paramObject);
    if (localBoolean != null) {
      return localBoolean.booleanValue();
    }
    return getProperty(String.valueOf(paramObject)) != null;
  }

  public boolean U(Object paramObject)
  {
    return (S(paramObject)) || (T(paramObject));
  }

  public boolean V(Object paramObject)
  {
    return (S(paramObject)) || (!T(paramObject));
  }
}