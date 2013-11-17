import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class dUH extends cqV
{
  static final int ADD = 1;
  static final int msD = 2;
  private Constructor msE;
  private int msF;

  dUH(Method paramMethod, Constructor paramConstructor, int paramInt)
  {
    super(paramMethod);
    this.msE = paramConstructor;
    this.msF = paramInt;
  }

  boolean cpM() {
    return true;
  }

  Object b(FF paramFF, Object paramObject1, Object paramObject2)
  {
    if (paramObject2 == null) {
      paramObject2 = this.msE.newInstance(new Object[] { this.msE.getParameterTypes().length == 0 ? new Object[0] : paramFF });
    }

    if ((paramObject2 instanceof bBD)) {
      paramObject2 = ((bBD)paramObject2).M(paramFF);
    }
    if (this.msF == 1) {
      y(paramObject1, paramObject2);
    }
    return paramObject2;
  }

  void p(Object paramObject1, Object paramObject2)
  {
    if (this.msF == 2)
      y(paramObject1, paramObject2);
  }

  private void y(Object paramObject1, Object paramObject2)
  {
    getMethod().invoke(paramObject1, new Object[] { paramObject2 });
  }
}