import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class cAg extends sT
{
  private boolean iqe = false;

  private boolean iqf = false;
  protected String[] iqg;
  private Class iqh = null;

  public static String toString(Object paramObject)
  {
    return a(paramObject, null, false, false, null);
  }

  public static String b(Object paramObject, Jo paramJo)
  {
    return a(paramObject, paramJo, false, false, null);
  }

  public static String b(Object paramObject, Jo paramJo, boolean paramBoolean)
  {
    return a(paramObject, paramJo, paramBoolean, false, null);
  }

  public static String a(Object paramObject, Jo paramJo, boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(paramObject, paramJo, paramBoolean1, paramBoolean2, null);
  }

  public static String a(Object paramObject, Jo paramJo, boolean paramBoolean1, boolean paramBoolean2, Class paramClass)
  {
    return new cAg(paramObject, paramJo, null, paramClass, paramBoolean1, paramBoolean2).toString();
  }

  public static String a(Object paramObject, Collection paramCollection)
  {
    return a(paramObject, u(paramCollection));
  }

  static String[] u(Collection paramCollection)
  {
    if (paramCollection == null) {
      return aUP.EMPTY_STRING_ARRAY;
    }
    return B(paramCollection.toArray());
  }

  static String[] B(Object[] paramArrayOfObject)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfObject.length);
    for (Object localObject : paramArrayOfObject) {
      if (localObject != null) {
        localArrayList.add(localObject.toString());
      }
    }
    return (String[])localArrayList.toArray(aUP.EMPTY_STRING_ARRAY);
  }

  public static String a(Object paramObject, String[] paramArrayOfString)
  {
    return new cAg(paramObject).F(paramArrayOfString).toString();
  }

  public cAg(Object paramObject)
  {
    super(paramObject);
  }

  public cAg(Object paramObject, Jo paramJo)
  {
    super(paramObject, paramJo);
  }

  public cAg(Object paramObject, Jo paramJo, StringBuffer paramStringBuffer)
  {
    super(paramObject, paramJo, paramStringBuffer);
  }

  public cAg(Object paramObject, Jo paramJo, StringBuffer paramStringBuffer, Class paramClass, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramObject, paramJo, paramStringBuffer);
    aj(paramClass);
    hQ(paramBoolean1);
    hP(paramBoolean2);
  }

  protected boolean b(Field paramField)
  {
    if (paramField.getName().indexOf('$') != -1)
    {
      return false;
    }
    if ((Modifier.isTransient(paramField.getModifiers())) && (!cxe()))
    {
      return false;
    }
    if ((Modifier.isStatic(paramField.getModifiers())) && (!cxd()))
    {
      return false;
    }
    if ((this.iqg != null) && (Arrays.binarySearch(this.iqg, paramField.getName()) >= 0))
    {
      return false;
    }
    return true;
  }

  protected void ai(Class paramClass)
  {
    if (paramClass.isArray()) {
      aZ(getObject());
      return;
    }
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    AccessibleObject.setAccessible(arrayOfField1, true);
    for (Field localField : arrayOfField1) {
      String str = localField.getName();
      if (b(localField))
      {
        try
        {
          Object localObject = c(localField);
          e(str, localObject);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          throw new InternalError("Unexpected IllegalAccessException: " + localIllegalAccessException.getMessage());
        }
      }
    }
  }

  public String[] cxb()
  {
    return (String[])this.iqg.clone();
  }

  public Class cxc()
  {
    return this.iqh;
  }

  protected Object c(Field paramField)
  {
    return paramField.get(getObject());
  }

  public boolean cxd()
  {
    return this.iqe;
  }

  public boolean cxe()
  {
    return this.iqf;
  }

  public cAg aZ(Object paramObject)
  {
    Av().d(Au(), null, paramObject);
    return this;
  }

  public void hP(boolean paramBoolean)
  {
    this.iqe = paramBoolean;
  }

  public void hQ(boolean paramBoolean)
  {
    this.iqf = paramBoolean;
  }

  public cAg F(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null) {
      this.iqg = null;
    }
    else {
      this.iqg = B(paramArrayOfString);
      Arrays.sort(this.iqg);
    }
    return this;
  }

  public void aj(Class paramClass)
  {
    if (paramClass != null) {
      Object localObject = getObject();
      if ((localObject != null) && (!paramClass.isInstance(localObject))) {
        throw new IllegalArgumentException("Specified class is not a superclass of the object");
      }
    }
    this.iqh = paramClass;
  }

  public String toString()
  {
    if (getObject() == null) {
      return Av().Tu();
    }
    Class localClass = getObject().getClass();
    ai(localClass);
    while ((localClass.getSuperclass() != null) && (localClass != cxc())) {
      localClass = localClass.getSuperclass();
      ai(localClass);
    }
    return super.toString();
  }
}