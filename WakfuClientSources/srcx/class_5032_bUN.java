public class bUN
  implements dBv
{
  public static final String bC = "name";
  public static final String bHJ = "id";
  private long aTz;
  private String m_name;

  public bUN(long paramLong, String paramString)
  {
    this.aTz = paramLong;
    this.m_name = paramString;
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public long getId() {
    return this.aTz;
  }

  public void a(long paramLong) {
    this.aTz = paramLong;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.m_name;
    if (paramString.equals("id")) {
      return Long.valueOf(this.aTz);
    }
    return null;
  }

  public String[] getFields() {
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }
}