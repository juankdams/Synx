import org.apache.log4j.Logger;

public class clu extends dPJ
{
  protected static final Logger K = Logger.getLogger(clu.class);
  private final Integer bca;
  private final Integer hNp;
  private final int bsY;
  private final bNY hNq;

  public clu()
  {
    this.bca = Integer.valueOf(0);
    this.hNp = Integer.valueOf(0);
    this.bsY = 0;
    this.hNq = bNY.gTa;
  }

  public clu(bNY parambNY, int paramInt1, int paramInt2, int paramInt3) {
    this.hNq = parambNY;
    this.bca = Integer.valueOf(paramInt1);
    this.hNp = Integer.valueOf(paramInt2);
    this.bsY = paramInt3;
  }

  public short nc() {
    return 4;
  }

  public cIG pk() {
    cIG localcIG = new cIG("event");
    localcIG.v("action", this.hNq.getAction());
    localcIG.v("referenceId", this.bca);
    localcIG.v("quantity", this.hNp);
    localcIG.v("price", Integer.valueOf(this.bsY));
    return localcIG;
  }

  public int hashCode()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return paramObject instanceof clu;
  }
}