import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class CL extends bLQ
{
  protected static final Logger K = Logger.getLogger(CL.class);
  private final FT bGQ;
  private final FT bGR;
  private final FT bGS;
  private final FT bGT;
  private final FT bGU;

  public CL(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
    this.bGQ = ((FT)a(new FT("value", this, paramdUl)));
    this.bGR = ((FT)a(new FT("min", this, paramdUl)));
    this.bGR.fM(9223372036854775807L);
    this.bGS = ((FT)a(new FT("max", this, paramdUl)));
    this.bGT = ((FT)a(new FT("quotaMin", this, paramdUl)));
    this.bGT.fM(-1L);
    this.bGU = ((FT)a(new FT("quotaMax", this, paramdUl)));
    this.bGU.fM(-1L);
  }

  public void bl(long paramLong) {
    this.bGT.fM(paramLong);
  }

  public void bm(long paramLong) {
    this.bGU.fM(paramLong);
  }

  public long getValue()
  {
    return this.bGQ.getValue();
  }

  public void c(long paramLong, boolean paramBoolean)
  {
    this.bGQ.fM(paramLong);
    if (paramLong > this.bGS.getValue()) {
      this.bGS.fM(paramLong);
    }

    if ((paramBoolean) && 
      (paramLong < this.bGR.getValue()))
      this.bGR.fM(paramLong);
  }

  public void a(cXr paramcXr)
  {
    a(paramcXr, cdG.hxy);
    paramcXr.jn(this.bGQ.getValue());
    paramcXr.jn(this.bGT.getValue());
    paramcXr.jn(this.bGU.getValue());
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    throw new UnsupportedOperationException("Un TrackQuotaPropertyNode doit être désérialisé en tant que FusionningQuotaPropertyNode");
  }
}