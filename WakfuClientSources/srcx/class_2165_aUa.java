import java.util.Collection;

public final class aUa
  implements brG
{
  public boolean c(aPH paramaPH)
  {
    Collection localCollection = paramaPH.bgK();
    for (dhJ localdhJ : localCollection) {
      if (localdhJ.getType() == 0)
        return true;
    }
    return false;
  }
}