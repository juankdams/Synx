import org.apache.log4j.Logger;

public class aai extends dPJ
{
  protected static final Logger K = Logger.getLogger(aai.class);
  private Long cOs;

  public aai(long paramLong)
  {
    this.cOs = Long.valueOf(paramLong);
  }

  public short nc() {
    return 6;
  }

  public cIG pk() {
    return null;
  }

  public int hashCode()
  {
    return this.cOs.hashCode();
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof aai)) && (((aai)paramObject).cOs.equals(this.cOs));
  }
}