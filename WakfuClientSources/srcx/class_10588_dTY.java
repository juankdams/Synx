import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class dTY
{
  private String name;
  private Class clazz;
  private Class ktV;
  private Class ktW;
  private String className;
  private ClassLoader classLoader;
  private boolean ktQ = false;

  public void iC(boolean paramBoolean)
  {
    this.ktQ = paramBoolean;
  }

  public boolean dub()
  {
    return this.ktQ;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public String getName()
  {
    return this.name;
  }

  public void R(Class paramClass)
  {
    this.clazz = paramClass;
    if (paramClass == null) {
      return;
    }
    this.classLoader = (this.classLoader == null ? paramClass.getClassLoader() : this.classLoader);

    this.className = (this.className == null ? paramClass.getName() : this.className);
  }

  public void setClassName(String paramString)
  {
    this.className = paramString;
  }

  public String getClassName()
  {
    return this.className;
  }

  public void S(Class paramClass)
  {
    this.ktV = paramClass;
  }

  public void T(Class paramClass)
  {
    this.ktW = paramClass;
  }

  public void setClassLoader(ClassLoader paramClassLoader)
  {
    this.classLoader = paramClassLoader;
  }

  public ClassLoader getClassLoader()
  {
    return this.classLoader;
  }

  public Class J(FF paramFF)
  {
    if (this.ktW != null) {
      Class localClass = K(paramFF);
      if ((localClass == null) || (this.ktW.isAssignableFrom(localClass))) {
        return localClass;
      }
    }
    return this.ktV == null ? K(paramFF) : this.ktV;
  }

  public Class K(FF paramFF)
  {
    try
    {
      return duc();
    } catch (NoClassDefFoundError localNoClassDefFoundError) {
      paramFF.d("Could not load a dependent class (" + localNoClassDefFoundError.getMessage() + ") for type " + this.name, 4);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramFF.d("Could not load class (" + this.className + ") for type " + this.name, 4);
    }

    return null;
  }

  public Class duc()
  {
    if (this.clazz != null) {
      return this.clazz;
    }
    if (this.classLoader == null)
      this.clazz = Class.forName(this.className);
    else {
      this.clazz = this.classLoader.loadClass(this.className);
    }
    return this.clazz;
  }

  public Object w(FF paramFF)
  {
    return ad(paramFF);
  }

  private Object ad(FF paramFF)
  {
    Class localClass = K(paramFF);
    if (localClass == null) {
      return null;
    }
    Object localObject = b(paramFF, localClass);
    if ((localObject == null) || (this.ktV == null)) {
      return localObject;
    }
    if ((this.ktW != null) && 
      (this.ktW.isAssignableFrom(localObject.getClass()))) {
      return localObject;
    }

    bew localbew = (bew)b(paramFF, this.ktV);

    if (localbew == null) {
      return null;
    }
    localbew.aD(localObject);
    return localbew;
  }

  public void L(FF paramFF)
  {
    if (this.clazz == null) {
      this.clazz = K(paramFF);
      if (this.clazz == null) {
        throw new cJ("Unable to create class for " + getName());
      }

    }

    if ((this.ktV != null) && ((this.ktW == null) || (!this.ktW.isAssignableFrom(this.clazz))))
    {
      bew localbew = (bew)b(paramFF, this.ktV);

      if (localbew == null) {
        throw new cJ("Unable to create adapter object");
      }
      localbew.M(this.clazz);
    }
  }

  private Object b(FF paramFF, Class paramClass)
  {
    try
    {
      return b(paramClass, paramFF);
    }
    catch (InvocationTargetException localInvocationTargetException) {
      localObject2 = localInvocationTargetException.getTargetException();
      throw new cJ("Could not create type " + this.name + " due to " + localObject2, (Throwable)localObject2);
    }
    catch (NoClassDefFoundError localNoClassDefFoundError) {
      Object localObject2 = "Type " + this.name + ": A class needed by class " + paramClass + " cannot be found: " + localNoClassDefFoundError.getMessage();

      throw new cJ((String)localObject2, localNoClassDefFoundError);
    } catch (NoSuchMethodException localNoSuchMethodException) {
      throw new cJ("Could not create type " + this.name + " as the class " + paramClass + " has no compatible constructor");
    }
    catch (InstantiationException localInstantiationException) {
      throw new cJ("Could not create type " + this.name + " as the class " + paramClass + " is abstract");
    }
    catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ("Could not create type " + this.name + " as the constructor " + paramClass + " is not accessible");
    }
    catch (Throwable localThrowable) {
      throw new cJ("Could not create type " + this.name + " due to " + localThrowable, localThrowable);
    }
  }

  public Object b(Class paramClass, FF paramFF)
  {
    int i = 0;
    Constructor localConstructor;
    try
    {
      localConstructor = paramClass.getConstructor(new Class[0]);
      i = 1;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {
      localConstructor = paramClass.getConstructor(new Class[] { FF.class });
      i = 0;
    }

    Object localObject = localConstructor.newInstance(new Object[] { i != 0 ? new Object[0] : paramFF });

    paramFF.G(localObject);
    return localObject;
  }

  public boolean a(dTY paramdTY, FF paramFF)
  {
    return (paramdTY != null) && (paramdTY.getClass() == getClass()) && (paramdTY.K(paramFF).equals(K(paramFF))) && (paramdTY.J(paramFF).equals(J(paramFF))) && (paramdTY.ktQ == this.ktQ) && (paramdTY.ktV == this.ktV) && (paramdTY.ktW == this.ktW);
  }

  public boolean b(dTY paramdTY, FF paramFF)
  {
    if ((paramdTY == null) || (getClass() != paramdTY.getClass()) || (!getClassName().equals(paramdTY.getClassName())) || (!ax(this.ktV).equals(ax(paramdTY.ktV))) || (!ax(this.ktW).equals(ax(paramdTY.ktW))) || (this.ktQ != paramdTY.ktQ))
    {
      return false;
    }

    ClassLoader localClassLoader1 = paramdTY.getClassLoader();
    ClassLoader localClassLoader2 = getClassLoader();
    return (localClassLoader1 == localClassLoader2) || (((localClassLoader1 instanceof iA)) && ((localClassLoader2 instanceof iA)) && (((iA)localClassLoader1).qr().equals(((iA)localClassLoader2).qr())));
  }

  private String ax(Class paramClass)
  {
    return paramClass == null ? "<null>" : paramClass.getClass().getName();
  }
}