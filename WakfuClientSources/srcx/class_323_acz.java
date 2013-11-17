public class acz
{
  private final String bvr;
  private final int bvs;

  public acz(String paramString, int paramInt)
  {
    this.bvr = paramString;
    this.bvs = paramInt;
  }

  public final String getHost()
  {
    return this.bvr;
  }

  public final int getPort()
  {
    return this.bvs;
  }

  public String toString()
  {
    return "ProxyAddress{m_host='" + this.bvr + '\'' + ", m_port=" + this.bvs + '}';
  }
}