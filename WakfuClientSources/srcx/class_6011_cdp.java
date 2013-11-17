import java.util.Enumeration;

public class cdp extends bAo
  implements cjq
{
  public boolean gh()
  {
    Enumeration localEnumeration = bIH();
    while (localEnumeration.hasMoreElements()) {
      cjq localcjq = (cjq)localEnumeration.nextElement();
      if (!localcjq.gh()) {
        return false;
      }
    }
    return true;
  }
}