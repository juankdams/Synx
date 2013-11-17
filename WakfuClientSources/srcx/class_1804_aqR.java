import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class aqR
{
  public static final void aa(Object paramObject)
  {
    String str1 = "execute";
    ddU localddU = null;
    try
    {
      Object localObject1;
      Object localObject2;
      if ((paramObject instanceof ddU)) {
        localddU = (ddU)paramObject;
      } else if ((paramObject instanceof aQS)) {
        localObject1 = (aQS)paramObject;
        localObject2 = ((aQS)localObject1).bhq();
        if ((localObject2 != null) && ((localObject2 instanceof ddU)) && ((localObject2 instanceof aGK)))
        {
          localddU = (ddU)localObject2;
        }
      }
      if (localddU != null) {
        localObject1 = null;
        try {
          localObject2 = localddU.cOP();
          if ((localObject2 != null) && (((String)localObject2).trim().length() > 0)) {
            localObject1 = "get" + ((String)localObject2).trim().substring(0, 1).toUpperCase();
            if (((String)localObject2).length() > 1) {
              localObject1 = (String)localObject1 + ((String)localObject2).substring(1);
            }
            Class localClass = localddU.getClass();
            Method localMethod1 = localClass.getMethod((String)localObject1, new Class[0]);
            if (localMethod1 != null) {
              Object localObject3 = localMethod1.invoke(localddU, (Object[])null);
              if (localObject3 != null) {
                String str2 = localObject3.toString();
                if ((str2 != null) && (str2.trim().length() > 0)) {
                  str1 = str2.trim();
                  Method localMethod2 = null;
                  localMethod2 = localddU.getClass().getMethod(str1, new Class[0]);

                  if (localMethod2 == null) {
                    throw new cJ("No public " + str1 + "() in " + localddU.getClass());
                  }

                  localMethod2.invoke(localddU, (Object[])null);
                  if ((paramObject instanceof aQS))
                    ((aQS)paramObject).as(null);
                }
                else {
                  throw new cJ("Dispatchable Task attribute '" + ((String)localObject2).trim() + "' not set or value is empty.");
                }
              }
              else
              {
                throw new cJ("Dispatchable Task attribute '" + ((String)localObject2).trim() + "' not set or value is empty.");
              }
            }
          }
          else
          {
            throw new cJ("Action Parameter Name must not be empty for Dispatchable Task.");
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException2) {
          throw new cJ("No public " + (String)localObject1 + "() in " + paramObject.getClass());
        }
      } else {
        localObject1 = null;
        localObject1 = paramObject.getClass().getMethod(str1, new Class[0]);
        if (localObject1 == null) {
          throw new cJ("No public " + str1 + "() in " + paramObject.getClass());
        }

        ((Method)localObject1).invoke(paramObject, (Object[])null);
        if ((paramObject instanceof aQS))
          ((aQS)paramObject).as(null);
      }
    }
    catch (InvocationTargetException localInvocationTargetException) {
      Throwable localThrowable = localInvocationTargetException.getTargetException();
      if ((localThrowable instanceof cJ)) {
        throw ((cJ)localThrowable);
      }
      throw new cJ(localThrowable);
    }
    catch (NoSuchMethodException localNoSuchMethodException1) {
      throw new cJ(localNoSuchMethodException1);
    } catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ(localIllegalAccessException);
    }
  }
}