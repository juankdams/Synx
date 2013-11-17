import java.util.ArrayList;

public class dvw
  implements K
{
  private String m_name;
  private String bFu;

  public dvw(String paramString1, String paramString2)
  {
    this.m_name = (paramString1 != null ? paramString1.intern() : null);
    this.bFu = (paramString2 != null ? paramString2.intern() : null);
  }

  public int getId()
  {
    return 0;
  }

  public void d(int paramInt)
  {
  }

  public String getName()
  {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = (paramString != null ? paramString.intern() : null);
  }

  public String getStringValue()
  {
    return this.bFu;
  }

  public boolean getBooleanValue()
  {
    return Boolean.parseBoolean(this.bFu);
  }

  public byte af()
  {
    return Byte.parseByte(this.bFu);
  }

  public short ag()
  {
    return Short.parseShort(this.bFu);
  }

  public int getIntValue()
  {
    return Integer.parseInt(this.bFu);
  }

  public long ah()
  {
    return Long.parseLong(this.bFu);
  }

  public float ai()
  {
    return Float.parseFloat(this.bFu);
  }

  public double getDoubleValue()
  {
    return Double.parseDouble(this.bFu);
  }

  public void a(String paramString)
  {
    this.bFu = (paramString != null ? paramString.intern() : null);
  }

  public void c(boolean paramBoolean)
  {
    this.bFu = (paramBoolean ? "true" : "false");
  }

  public void a(byte paramByte)
  {
    this.bFu = ("" + paramByte).intern();
  }

  public void e(int paramInt)
  {
    this.bFu = ("" + paramInt).intern();
  }

  public void c(long paramLong)
  {
    this.bFu = ("" + paramLong).intern();
  }

  public void a(float paramFloat)
  {
    this.bFu = ("" + paramFloat).intern();
  }

  public void setDoubleValue(double paramDouble)
  {
    this.bFu = ("" + paramDouble).intern();
  }

  public void a(K paramK)
  {
  }

  public void b(K paramK)
  {
  }

  public ArrayList getChildren()
  {
    return null;
  }

  public K b(String paramString)
  {
    return null;
  }

  public ArrayList c(String paramString)
  {
    return null;
  }

  public ArrayList d(String paramString)
  {
    return null;
  }

  public K e(String paramString)
  {
    return null;
  }

  public void c(K paramK)
  {
  }

  public void d(K paramK)
  {
  }

  public ArrayList aj()
  {
    return null;
  }

  public String toString()
  {
    return this.m_name + '=' + this.bFu;
  }
}