import java.io.File;
import java.util.Enumeration;

public class eO extends MS
{
  private Object aAX;
  private Object aAY;

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (lT()) {
      localStringBuffer.append("{select");
      if (this.aAX != null) {
        localStringBuffer.append(" if: ");
        localStringBuffer.append(this.aAX);
      }
      if (this.aAY != null) {
        localStringBuffer.append(" unless: ");
        localStringBuffer.append(this.aAY);
      }
      localStringBuffer.append(" ");
      localStringBuffer.append(super.toString());
      localStringBuffer.append("}");
    }
    return localStringBuffer.toString();
  }

  private eO lS()
  {
    Object localObject = i(getClass(), "SelectSelector");
    return (eO)localObject;
  }

  public boolean lT()
  {
    if (cum()) {
      return lS().lT();
    }
    return super.lT();
  }

  public int lU()
  {
    if (cum()) {
      return lS().lU();
    }
    return super.lU();
  }

  public ank[] a(FF paramFF)
  {
    if (cum()) {
      return lS().a(paramFF);
    }
    return super.a(paramFF);
  }

  public Enumeration lV()
  {
    if (cum()) {
      return lS().lV();
    }
    return super.lV();
  }

  public void a(ank paramank)
  {
    if (cum()) {
      throw cur();
    }
    super.a(paramank);
  }

  public void cd()
  {
    int i = lU();
    if ((i < 0) || (i > 1))
      be("Only one selector is allowed within the <selector> tag");
  }

  public boolean lW()
  {
    afR localafR = afR.t(Ga());
    return (localafR.U(this.aAX)) && (localafR.V(this.aAY));
  }

  public void l(Object paramObject)
  {
    this.aAX = paramObject;
  }

  public void L(String paramString)
  {
    l(paramString);
  }

  public void m(Object paramObject)
  {
    this.aAY = paramObject;
  }

  public void M(String paramString)
  {
    m(paramString);
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();

    if (!lW()) {
      return false;
    }

    Enumeration localEnumeration = lV();
    if (!localEnumeration.hasMoreElements()) {
      return true;
    }
    ank localank = (ank)localEnumeration.nextElement();
    return localank.a(paramFile1, paramString, paramFile2);
  }
}