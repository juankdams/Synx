import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

public class cMi extends BrowserFunction
{
  public static final String krw = "sendCommand";

  public cMi(Browser paramBrowser)
  {
    super(paramBrowser, "sendCommand");
  }

  public Object function(Object[] paramArrayOfObject) {
    if (paramArrayOfObject.length == 0) {
      return null;
    }
    Object localObject = paramArrayOfObject[0];
    if (!(localObject instanceof String)) {
      return null;
    }

    String str = (String)localObject;
    Object[] arrayOfObject = new Object[paramArrayOfObject.length - 1];
    System.arraycopy(paramArrayOfObject, 1, arrayOfObject, 0, arrayOfObject.length);

    cjO.clE().j(new dtI(str, arrayOfObject));

    return null;
  }
}