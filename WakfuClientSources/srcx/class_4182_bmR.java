public class bmR
{
  public static final String fFL = "ant.reuse.loader";

  public static ClassLoader a(FF paramFF, cxK paramcxK)
  {
    return a(paramFF, paramcxK, false);
  }

  public static ClassLoader a(FF paramFF, cxK paramcxK, boolean paramBoolean)
  {
    String str1 = paramcxK.cuW();
    Object localObject = paramFF.bR(str1);
    if (!(localObject instanceof aoo)) {
      throw new cJ("The specified classpathref " + str1 + " does not reference a Path.");
    }

    String str2 = "ant.loader." + str1;
    return a(paramFF, (aoo)localObject, str2, paramBoolean);
  }

  public static ClassLoader a(FF paramFF, aoo paramaoo, String paramString)
  {
    return a(paramFF, paramaoo, paramString, false);
  }

  public static ClassLoader a(FF paramFF, aoo paramaoo, String paramString, boolean paramBoolean)
  {
    return a(paramFF, paramaoo, paramString, paramBoolean, D(paramFF));
  }

  public static ClassLoader a(FF paramFF, aoo paramaoo, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    ClassLoader localClassLoader = null;

    if ((paramString != null) && (paramBoolean2)) {
      Object localObject = paramFF.bR(paramString);
      if ((localObject != null) && (!(localObject instanceof ClassLoader))) {
        throw new cJ("The specified loader id " + paramString + " does not reference a class loader");
      }

      localClassLoader = (ClassLoader)localObject;
    }
    if (localClassLoader == null) {
      localClassLoader = a(paramFF, paramaoo, paramBoolean1);
      if ((paramString != null) && (paramBoolean2)) {
        paramFF.g(paramString, localClassLoader);
      }
    }
    return localClassLoader;
  }

  public static ClassLoader a(FF paramFF, aoo paramaoo, boolean paramBoolean)
  {
    iA localiA = paramFF.b(paramaoo);
    if (paramBoolean) {
      localiA.v(false);
      localiA.qu();
    }
    return localiA;
  }

  public static Object a(String paramString, ClassLoader paramClassLoader)
  {
    return a(paramString, paramClassLoader, Object.class);
  }

  public static Object a(String paramString, ClassLoader paramClassLoader, Class paramClass)
  {
    try
    {
      Class localClass = Class.forName(paramString, true, paramClassLoader);
      Object localObject = localClass.newInstance();
      if (!paramClass.isInstance(localObject)) {
        throw new cJ("Class of unexpected Type: " + paramString + " expected :" + paramClass);
      }

      return localObject;
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new cJ("Class not found: " + paramString, localClassNotFoundException);
    } catch (InstantiationException localInstantiationException) {
      throw new cJ("Could not instantiate " + paramString + ". Specified class should have a no " + "argument constructor.", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ("Could not instantiate " + paramString + ". Specified class should have a " + "public constructor.", localIllegalAccessException);
    }
    catch (LinkageError localLinkageError) {
      throw new cJ("Class " + paramString + " could not be loaded because of an invalid dependency.", localLinkageError);
    }
  }

  public static bDN a(dwE paramdwE)
  {
    return new bDN(paramdwE);
  }

  private static boolean D(FF paramFF)
  {
    return paramFF.getProperty("ant.reuse.loader") != null;
  }
}