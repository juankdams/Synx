import java.lang.reflect.Method;

public class bCQ extends hT
{
  private Method method;
  private Object[] args;
  private int index;

  bCQ(Class paramClass, Method paramMethod, Object[] paramArrayOfObject, int paramInt)
  {
    super(paramClass);
    this.method = paramMethod;
    this.args = paramArrayOfObject;
    this.index = paramInt;
  }
  public Method getMethod() { return this.method; } 
  public Object[] getArguments() { return this.args; } 
  public int getIndex() { return this.index; }

}