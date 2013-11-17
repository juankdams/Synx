import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JI extends bFe
{
  private static final int bUE = bFe.aj("PropertyResource".getBytes());

  private static final InputStream bUF = new cmb();

  public JI()
  {
  }

  public JI(FF paramFF, String paramString)
  {
    super(paramString);
    b(paramFF);
  }

  public String getValue()
  {
    if (cum()) {
      return ((JI)cup()).getValue();
    }
    FF localFF = Ga();
    return localFF == null ? null : localFF.getProperty(getName());
  }

  public Object TX()
  {
    if (cum()) {
      return ((JI)cup()).TX();
    }
    FF localFF = Ga();
    return localFF == null ? null : afR.a(localFF, getName());
  }

  public boolean TY()
  {
    if (TZ()) {
      return Ua().TY();
    }
    return TX() != null;
  }

  public long getSize()
  {
    if (TZ()) {
      return Ua().getSize();
    }
    Object localObject = TX();
    return localObject == null ? 0L : String.valueOf(localObject).length();
  }

  public boolean equals(Object paramObject)
  {
    if (super.equals(paramObject)) {
      return true;
    }
    return (TZ()) && (Ua().equals(paramObject));
  }

  public int hashCode()
  {
    if (TZ()) {
      return Ua().hashCode();
    }
    return super.hashCode() * bUE;
  }

  public String toString()
  {
    if (TZ()) {
      return Ua().toString();
    }
    return getValue();
  }

  public InputStream getInputStream()
  {
    if (TZ()) {
      return Ua().getInputStream();
    }
    Object localObject = TX();
    return localObject == null ? bUF : new ByteArrayInputStream(String.valueOf(localObject).getBytes());
  }

  public OutputStream getOutputStream()
  {
    if (TZ()) {
      return Ua().getOutputStream();
    }
    if (TY()) {
      throw new dEJ();
    }
    return new aRC(Ga(), getName());
  }

  protected boolean TZ()
  {
    return (cum()) || ((TX() instanceof bFe));
  }

  protected bFe Ua()
  {
    if (cum()) {
      return (bFe)i(bFe.class, "resource");
    }
    Object localObject = TX();
    if ((localObject instanceof bFe)) {
      return (bFe)localObject;
    }
    throw new IllegalStateException("This PropertyResource does not reference or proxy another Resource");
  }
}