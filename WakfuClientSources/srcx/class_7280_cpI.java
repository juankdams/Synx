import java.lang.reflect.Method;

class cpI extends cqV
{
  cpI(Method paramMethod)
  {
    super(paramMethod);
  }

  Object b(FF paramFF, Object paramObject1, Object paramObject2)
  {
    return getMethod().invoke(paramObject1, new Object[0]);
  }
}