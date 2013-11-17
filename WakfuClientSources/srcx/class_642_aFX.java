import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.sql.SQLException;
import org.xml.sax.SAXException;

public class aFX extends Exception
{
  private static final String bdh = "@(#) $RCSfile: JDOMException.java,v $ $Revision: 1.23 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";
  private Throwable eda;

  public aFX()
  {
    super("Error occurred in JDOM application.");
  }

  public aFX(String paramString)
  {
    super(paramString);
  }

  public aFX(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    this.eda = paramThrowable;
  }

  public Throwable getCause()
  {
    return this.eda;
  }

  public String getMessage()
  {
    Object localObject1 = super.getMessage();

    Object localObject2 = this;
    Throwable localThrowable;
    while ((localThrowable = d((Throwable)localObject2)) != null)
    {
      String str = localThrowable.getMessage();

      if ((localThrowable instanceof SAXException)) {
        Exception localException = ((SAXException)localThrowable).getException();

        if ((localException != null) && (str != null) && (str.equals(localException.getMessage()))) {
          str = null;
        }

      }

      if (str != null) {
        if (localObject1 != null)
          localObject1 = localObject1 + ": " + str;
        else {
          localObject1 = str;
        }

      }

      if ((localThrowable instanceof aFX)) {
        break;
      }
      localObject2 = localThrowable;
    }

    return localObject1;
  }

  private static Throwable d(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof aFX)) {
      return ((aFX)paramThrowable).getCause();
    }

    if ((paramThrowable instanceof SAXException)) {
      return ((SAXException)paramThrowable).getException();
    }

    if ((paramThrowable instanceof SQLException)) {
      return ((SQLException)paramThrowable).getNextException();
    }

    if ((paramThrowable instanceof InvocationTargetException)) {
      return ((InvocationTargetException)paramThrowable).getTargetException();
    }

    if ((paramThrowable instanceof ExceptionInInitializerError)) {
      return ((ExceptionInInitializerError)paramThrowable).getException();
    }

    if ((paramThrowable instanceof RemoteException)) {
      return ((RemoteException)paramThrowable).detail;
    }

    Throwable localThrowable = a(paramThrowable, "javax.naming.NamingException", "getRootCause");
    if (localThrowable != null) {
      return localThrowable;
    }

    localThrowable = a(paramThrowable, "javax.servlet.ServletException", "getRootCause");
    if (localThrowable != null) {
      return localThrowable;
    }

    return null;
  }

  private static Throwable a(Throwable paramThrowable, String paramString1, String paramString2)
  {
    try
    {
      Class localClass1 = Class.forName(paramString1);
      Class localClass2 = paramThrowable.getClass();
      if (localClass1.isAssignableFrom(localClass2))
      {
        Class[] arrayOfClass = new Class[0];
        Method localMethod = localClass1.getMethod(paramString2, arrayOfClass);
        Object[] arrayOfObject = new Object[0];
        return (Throwable)localMethod.invoke(paramThrowable, arrayOfObject);
      }

    }
    catch (Exception localException)
    {
    }

    return null;
  }

  public Throwable initCause(Throwable paramThrowable)
  {
    this.eda = paramThrowable;
    return this;
  }

  public void printStackTrace()
  {
    super.printStackTrace();

    Object localObject = this;
    Throwable localThrowable;
    while ((localThrowable = d((Throwable)localObject)) != null) {
      System.err.print("Caused by: ");
      localThrowable.printStackTrace();

      if ((localThrowable instanceof aFX)) {
        break;
      }
      localObject = localThrowable;
    }
  }

  public void printStackTrace(PrintStream paramPrintStream)
  {
    super.printStackTrace(paramPrintStream);

    Object localObject = this;
    Throwable localThrowable;
    while ((localThrowable = d((Throwable)localObject)) != null) {
      paramPrintStream.print("Caused by: ");
      localThrowable.printStackTrace(paramPrintStream);

      if ((localThrowable instanceof aFX)) {
        break;
      }
      localObject = localThrowable;
    }
  }

  public void printStackTrace(PrintWriter paramPrintWriter)
  {
    super.printStackTrace(paramPrintWriter);

    Object localObject = this;
    Throwable localThrowable;
    while ((localThrowable = d((Throwable)localObject)) != null) {
      paramPrintWriter.print("Caused by: ");
      localThrowable.printStackTrace(paramPrintWriter);

      if ((localThrowable instanceof aFX)) {
        break;
      }
      localObject = localThrowable;
    }
  }
}