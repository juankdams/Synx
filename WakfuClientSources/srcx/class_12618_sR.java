import org.apache.log4j.Logger;

public class sR extends dPJ
{
  protected static final Logger K = Logger.getLogger(sR.class);
  private Integer bca;

  public sR(int paramInt)
  {
    this.bca = Integer.valueOf(paramInt);
  }

  public short nc() {
    return 2;
  }

  public cIG pk() {
    return null;
  }

  public int hashCode()
  {
    return this.bca.hashCode();
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof sR)) && (((sR)paramObject).bca.equals(this.bca));
  }
}