import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Iterator;

public class bFe extends cwV
  implements Ae, Comparable
{
  public static final long gAd = -1L;
  public static final long gAe = 0L;
  protected static final int gAf = aj("Resource".getBytes());

  private static final int gAg = aj("null name".getBytes());

  private String name = null;
  private Boolean gAh = null;
  private Long gAi = null;
  private Boolean gAj = null;
  private Long gAk = null;

  protected static int aj(byte[] paramArrayOfByte)
  {
    return new BigInteger(paramArrayOfByte).intValue();
  }

  public bFe()
  {
  }

  public bFe(String paramString)
  {
    this(paramString, false, 0L, false);
  }

  public bFe(String paramString, boolean paramBoolean, long paramLong)
  {
    this(paramString, paramBoolean, paramLong, false);
  }

  public bFe(String paramString, boolean paramBoolean1, long paramLong, boolean paramBoolean2)
  {
    this(paramString, paramBoolean1, paramLong, paramBoolean2, -1L);
  }

  public bFe(String paramString, boolean paramBoolean1, long paramLong1, boolean paramBoolean2, long paramLong2)
  {
    this.name = paramString;
    setName(paramString);
    ds(paramBoolean1);
    setLastModified(paramLong1);
    aI(paramBoolean2);
    setSize(paramLong2);
  }

  public String getName()
  {
    return cum() ? ((bFe)cup()).getName() : this.name;
  }

  public void setName(String paramString)
  {
    cuu();
    this.name = paramString;
  }

  public boolean TY()
  {
    if (cum()) {
      return ((bFe)cup()).TY();
    }

    return (this.gAh == null) || (this.gAh.booleanValue());
  }

  public void ds(boolean paramBoolean)
  {
    cuu();
    this.gAh = (paramBoolean ? Boolean.TRUE : Boolean.FALSE);
  }

  public long getLastModified()
  {
    if (cum()) {
      return ((bFe)cup()).getLastModified();
    }
    if ((!TY()) || (this.gAi == null)) {
      return 0L;
    }
    long l = this.gAi.longValue();
    return l < 0L ? 0L : l;
  }

  public void setLastModified(long paramLong)
  {
    cuu();
    this.gAi = new Long(paramLong);
  }

  public boolean isDirectory()
  {
    if (cum()) {
      return ((bFe)cup()).isDirectory();
    }

    return (this.gAj != null) && (this.gAj.booleanValue());
  }

  public void aI(boolean paramBoolean)
  {
    cuu();
    this.gAj = (paramBoolean ? Boolean.TRUE : Boolean.FALSE);
  }

  public void setSize(long paramLong)
  {
    cuu();
    this.gAk = new Long(paramLong > -1L ? paramLong : -1L);
  }

  public long getSize()
  {
    if (cum()) {
      return ((bFe)cup()).getSize();
    }
    return TY() ? -1L : this.gAk != null ? this.gAk.longValue() : 0L;
  }

  public Object clone()
  {
    try
    {
      return super.clone(); } catch (CloneNotSupportedException localCloneNotSupportedException) {
    }
    throw new UnsupportedOperationException("CloneNotSupportedException for a Resource caught. Derived classes must support cloning.");
  }

  public int b(bFe parambFe)
  {
    if (cum()) {
      return ((bFe)cup()).b(parambFe);
    }
    return toString().compareTo(parambFe.toString());
  }

  public boolean equals(Object paramObject)
  {
    if (cum()) {
      return cup().equals(paramObject);
    }
    return (paramObject.getClass().equals(getClass())) && (b((bFe)paramObject) == 0);
  }

  public int hashCode()
  {
    if (cum()) {
      return cup().hashCode();
    }
    String str = getName();
    return gAf * (str == null ? gAg : str.hashCode());
  }

  public InputStream getInputStream()
  {
    if (cum()) {
      return ((bFe)cup()).getInputStream();
    }
    throw new UnsupportedOperationException();
  }

  public OutputStream getOutputStream()
  {
    if (cum()) {
      return ((bFe)cup()).getOutputStream();
    }
    throw new UnsupportedOperationException();
  }

  public Iterator iterator()
  {
    return cum() ? ((bFe)cup()).iterator() : new vq(this);
  }

  public int size()
  {
    return cum() ? ((bFe)cup()).size() : 1;
  }

  public boolean Jm()
  {
    return ((cum()) && (((bFe)cup()).Jm())) || (G(dmo.class) != null);
  }

  public String toString()
  {
    if (cum()) {
      return cup().toString();
    }
    String str = getName();
    return str == null ? "(anonymous)" : str;
  }

  public final String bMV()
  {
    return cun() + " \"" + toString() + '"';
  }

  public void a(cxK paramcxK)
  {
    if ((this.name != null) || (this.gAh != null) || (this.gAi != null) || (this.gAj != null) || (this.gAk != null))
    {
      throw cuq();
    }
    super.a(paramcxK);
  }

  public Object G(Class paramClass)
  {
    return paramClass.isAssignableFrom(getClass()) ? paramClass.cast(this) : null;
  }
}