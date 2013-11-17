import com.sun.jna.Native;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;

public class rG
{
  public static long a(Window paramWindow)
  {
    return s(paramWindow);
  }

  public static long s(Object paramObject)
  {
    if (GraphicsEnvironment.isHeadless()) {
      throw new HeadlessException("No native windows when headless");
    }
    Component localComponent = (Component)paramObject;
    if (localComponent.isLightweight()) {
      throw new IllegalArgumentException("Component must be heavyweight");
    }
    if (!localComponent.isDisplayable()) {
      throw new IllegalStateException("Component must be displayable");
    }
    if ((bIG.bQe()) && (System.getProperty("java.version").startsWith("1.4")))
    {
      if (!localComponent.isVisible()) {
        throw new IllegalStateException("Component must be visible");
      }

    }

    return Native.getWindowHandle0(localComponent);
  }
}