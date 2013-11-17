import java.util.ArrayList;

public class CC
  implements K
{
  public static final String bFr = "#text";
  public static final String bFs = "#cdata-section";
  public static final String bFt = "#comment";
  private String m_name;
  private String bFu;
  private final ArrayList bFv;
  private final ArrayList bFw;

  public CC(String paramString1, String paramString2)
  {
    this.bFv = new ArrayList();
    this.bFw = new ArrayList();
    this.m_name = (paramString1 != null ? paramString1.intern() : null);
    this.bFu = (paramString2 != null ? paramString2.intern() : null);
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = (paramString != null ? paramString.intern() : null);
  }

  public int getId()
  {
    return 0;
  }

  public void d(int paramInt)
  {
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

  public K e(String paramString)
  {
    if (this.bFv != null) {
      int i = 0; for (int j = this.bFv.size(); i < j; i++) {
        dvw localdvw = (dvw)this.bFv.get(i);
        if (localdvw.getName().equalsIgnoreCase(paramString)) {
          return localdvw;
        }
      }
    }
    return null;
  }

  public void c(K paramK)
  {
    if (!this.bFv.contains(paramK))
      this.bFv.add((dvw)paramK);
  }

  public void i(ArrayList paramArrayList)
  {
    for (K localK : paramArrayList)
      c(localK);
  }

  public void d(K paramK)
  {
    this.bFv.remove(paramK);
  }

  public ArrayList aj()
  {
    return this.bFv;
  }

  public K b(String paramString)
  {
    if (this.m_name.equalsIgnoreCase(paramString)) {
      return this;
    }
    for (CC localCC : this.bFw) {
      K localK = localCC.b(paramString);
      if (localK != null) {
        return localK;
      }
    }
    return null;
  }

  public ArrayList c(String paramString)
  {
    ArrayList localArrayList1 = new ArrayList();

    if (this.m_name.equalsIgnoreCase(paramString))
      localArrayList1.add(this);
    else {
      for (CC localCC : this.bFw) {
        ArrayList localArrayList2 = localCC.c(paramString);
        if (localArrayList2 != null) {
          localArrayList1.addAll(localArrayList2);
        }
      }
    }

    return localArrayList1.isEmpty() ? null : localArrayList1;
  }

  public ArrayList d(String paramString)
  {
    ArrayList localArrayList = new ArrayList();

    for (CC localCC : this.bFw) {
      if (localCC.getName().equalsIgnoreCase(paramString)) {
        localArrayList.add(localCC);
      }
    }

    return localArrayList.isEmpty() ? null : localArrayList;
  }

  public void a(K paramK)
  {
    if (!this.bFw.contains(paramK))
      this.bFw.add((CC)paramK);
  }

  public void b(K paramK)
  {
    this.bFw.remove(paramK);
  }

  public ArrayList getChildren()
  {
    return this.bFw;
  }

  public String toString()
  {
    return this.m_name + ' ' + this.bFu;
  }
}