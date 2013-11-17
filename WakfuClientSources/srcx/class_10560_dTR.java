import java.lang.reflect.Method;

public class dTR extends aGK
  implements bew
{
  private Object mqW;

  public dTR()
  {
  }

  public dTR(Object paramObject)
  {
    this();
    aD(paramObject);
  }

  public static void a(Class paramClass, FF paramFF)
  {
    if (!ddU.class.isAssignableFrom(paramClass))
    {
      try
      {
        Method localMethod = paramClass.getMethod("execute", (Class[])null);

        if (!Void.TYPE.equals(localMethod.getReturnType())) {
          str = "return type of execute() should be void but was \"" + localMethod.getReturnType() + "\" in " + paramClass;

          paramFF.d(str, 1);
        }
      } catch (NoSuchMethodException localNoSuchMethodException) {
        str = "No public execute() in " + paramClass;
        paramFF.d(str, 0);
        throw new cJ(str);
      } catch (LinkageError localLinkageError) {
        String str = "Could not load " + paramClass + ": " + localLinkageError;
        paramFF.d(str, 0);
        throw new cJ(str, localLinkageError);
      }
    }
  }

  public void M(Class paramClass)
  {
    a(paramClass, Ga());
  }

  public void execute()
  {
    try
    {
      Method localMethod1 = this.mqW.getClass().getMethod("setLocation", new Class[] { aaA.class });

      if (localMethod1 != null)
        localMethod1.invoke(this.mqW, new Object[] { gu() });
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
    }
    catch (Exception localException1) {
      d("Error setting location in " + this.mqW.getClass(), 0);

      throw new cJ(localException1);
    }
    try
    {
      Method localMethod2 = this.mqW.getClass().getMethod("setProject", new Class[] { FF.class });

      if (localMethod2 != null)
        localMethod2.invoke(this.mqW, new Object[] { Ga() });
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
    }
    catch (Exception localException2) {
      d("Error setting project in " + this.mqW.getClass(), 0);

      throw new cJ(localException2);
    }
    try
    {
      aqR.aa(this.mqW);
    } catch (cJ localcJ) {
      throw localcJ;
    } catch (Exception localException3) {
      d("Error in " + this.mqW.getClass(), 3);
      throw new cJ(localException3);
    }
  }

  public void aD(Object paramObject)
  {
    this.mqW = paramObject;
  }

  public Object bsm()
  {
    return this.mqW;
  }
}