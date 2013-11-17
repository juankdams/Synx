public class axJ
  implements Comparable
{
  private String m_name;
  private String bSn;
  private boolean dMV = false;
  private long aTz;

  public axJ(String paramString1, String paramString2, boolean paramBoolean, long paramLong)
  {
    this.bSn = paramString1;
    this.m_name = paramString2;
    this.dMV = paramBoolean;
    this.aTz = paramLong;
  }

  public axJ(long paramLong, String paramString1, String paramString2)
  {
    this(paramString2, paramString1, false, paramLong);
  }

  public String getName()
  {
    return this.m_name;
  }

  public void setName(String paramString)
  {
    this.m_name = paramString;
  }

  public boolean aJl()
  {
    return this.dMV;
  }

  public void G(boolean paramBoolean)
  {
    this.dMV = paramBoolean;
  }

  public long getId()
  {
    return this.aTz;
  }

  public void a(long paramLong)
  {
    this.aTz = paramLong;
  }

  public String aJm() {
    return this.bSn;
  }

  public void cf(String paramString) {
    this.bSn = paramString;
  }

  public int a(axJ paramaxJ) {
    return getName().toLowerCase().compareTo(paramaxJ.getName().toLowerCase());
  }
}