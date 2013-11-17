import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class awb extends bgQ
  implements bEc
{
  private String dLi = null;
  private static final String dLj = "org.apache.tools.ant.filters.util.JavaClassHelper";

  public awb()
  {
  }

  public awb(Reader paramReader)
  {
    super(paramReader);
  }

  public int read()
  {
    int i = -1;

    if ((this.dLi != null) && (this.dLi.length() == 0)) {
      this.dLi = null;
    }

    if (this.dLi != null) {
      i = this.dLi.charAt(0);
      this.dLi = this.dLi.substring(1);
      if (this.dLi.length() == 0)
        this.dLi = null;
    }
    else {
      String str = btq();
      if ((str == null) || (str.length() == 0)) {
        i = -1;
      } else {
        byte[] arrayOfByte = str.getBytes("ISO-8859-1");
        try {
          Class localClass = Class.forName("org.apache.tools.ant.filters.util.JavaClassHelper");

          if (localClass != null) {
            localObject = new Class[] { [B.class };

            Method localMethod = localClass.getMethod("getConstants", (Class[])localObject);

            Object[] arrayOfObject = { arrayOfByte };

            StringBuffer localStringBuffer = (StringBuffer)localMethod.invoke(null, arrayOfObject);

            if (localStringBuffer.length() > 0) {
              this.dLi = localStringBuffer.toString();
              return read();
            }
          }
        } catch (NoClassDefFoundError localNoClassDefFoundError) {
          throw localNoClassDefFoundError;
        } catch (RuntimeException localRuntimeException) {
          throw localRuntimeException;
        } catch (InvocationTargetException localInvocationTargetException) {
          Object localObject = localInvocationTargetException.getTargetException();
          if ((localObject instanceof NoClassDefFoundError)) {
            throw ((NoClassDefFoundError)localObject);
          }
          if ((localObject instanceof RuntimeException)) {
            throw ((RuntimeException)localObject);
          }
          throw new cJ((Throwable)localObject);
        } catch (Exception localException) {
          throw new cJ(localException);
        }
      }
    }
    return i;
  }

  public Reader b(Reader paramReader)
  {
    awb localawb = new awb(paramReader);
    return localawb;
  }
}