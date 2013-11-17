import java.lang.reflect.Method;

class dir extends cqV
{
  dir(wE paramwE, Method paramMethod, Object paramObject1, Object paramObject2)
  {
    super(paramMethod);
  }
  Object b(FF paramFF, Object paramObject1, Object paramObject2) {
    if (!getMethod().getName().endsWith("Configured")) {
      getMethod().invoke(paramObject1, new Object[] { this.leM });
    }
    return this.leN;
  }

  Object aMC() {
    return this.leM;
  }

  void p(Object paramObject1, Object paramObject2)
  {
    if (getMethod().getName().endsWith("Configured"))
      getMethod().invoke(paramObject1, new Object[] { this.leM });
  }
}