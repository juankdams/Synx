public class an
{
  private final String m_name;
  public final Class bS;
  private final String bT;

  public an(String paramString, Class paramClass)
  {
    this.m_name = paramString;
    this.bS = paramClass;
    int i = this.m_name.indexOf('.');
    this.bT = (i == -1 ? "" : this.m_name.substring(0, i));
  }

  public String getPackageName() {
    return this.bT;
  }

  public boolean aX() {
    return this.bT.length() == 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    an localan = (an)paramObject;

    if (!this.bS.equals(localan.bS)) {
      return false;
    }
    if (!this.m_name.equals(localan.m_name)) {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    int i = this.m_name.hashCode();
    i = 31 * i + this.bS.hashCode();
    return i;
  }
}