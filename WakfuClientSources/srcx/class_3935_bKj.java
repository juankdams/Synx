import java.lang.reflect.Method;
import java.util.Map;

abstract class bKj
{
  private Method method;
  private Class type;

  protected bKj(Method paramMethod, Class paramClass)
  {
    this.method = paramMethod;
    this.type = paramClass;
  }

  void a(FF paramFF, Object paramObject1, Object paramObject2) {
    if (this.type != null) {
      Class localClass = this.type;
      if (this.type.isPrimitive()) {
        if (paramObject2 == null) {
          throw new cJ("Attempt to set primitive " + wE.n(this.method.getName(), "set") + " to null on " + paramObject1);
        }

        localClass = (Class)wE.FM().get(this.type);
      }
      if ((paramObject2 == null) || (localClass.isInstance(paramObject2))) {
        this.method.invoke(paramObject1, new Object[] { paramObject2 });
        return;
      }
    }
    e(paramFF, paramObject1, paramObject2.toString());
  }

  abstract void e(FF paramFF, Object paramObject, String paramString);
}