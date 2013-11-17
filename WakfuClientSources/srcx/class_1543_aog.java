public class aog extends cGj
{
  public static final String bHJ = "id";
  public static final String bC = "name";
  private final long aTz;
  private final String m_name;

  public aog(fx paramfx, long paramLong, String paramString)
  {
    this.aTz = paramLong;
    this.m_name = paramString;
  }

  public long getId() {
    return this.aTz;
  }

  public String getName() {
    return this.m_name;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("id"))
      return Long.valueOf(this.aTz);
    if (paramString.equals("name")) {
      return this.m_name;
    }

    return null;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    aog localaog = (aog)paramObject;

    if (this.aTz != localaog.aTz) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    return (int)(this.aTz ^ this.aTz >>> 32);
  }
}