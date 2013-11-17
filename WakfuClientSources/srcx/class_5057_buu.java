import java.util.Enumeration;

final class buu
  implements Enumeration
{
  private final Enumeration gdR;
  private final Enumeration gdS;

  public buu(Enumeration paramEnumeration1, Enumeration paramEnumeration2)
  {
    this.gdR = paramEnumeration1;
    this.gdS = paramEnumeration2;
  }

  public boolean hasMoreElements() {
    return (this.gdR.hasMoreElements()) || (this.gdS.hasMoreElements());
  }

  public Object nextElement() {
    if (this.gdR.hasMoreElements()) {
      return this.gdR.nextElement();
    }
    return this.gdS.nextElement();
  }
}