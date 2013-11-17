import java.nio.ByteBuffer;

public class cAs extends bLQ
{
  private final FT bGQ;
  private final FT bGS;
  private final FT cTC;

  public cAs(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
    this.bGQ = ((FT)a(new FT("value", this, paramdUl)));
    this.bGS = ((FT)a(new FT("max", this, paramdUl)));
    this.cTC = ((FT)a(new FT("maxTime", this, paramdUl)));
  }

  public long getValue()
  {
    return this.bGQ.getValue();
  }

  public void fM(long paramLong)
  {
    this.bGQ.fM(paramLong);
    if (paramLong > this.bGS.getValue()) {
      this.bGS.fM(paramLong);
      this.cTC.fM(System.currentTimeMillis());
    }
  }

  public void a(cXr paramcXr) {
    a(paramcXr, cdG.hxw);
    paramcXr.jn(this.bGQ.getValue());
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    throw new UnsupportedOperationException("Un TrackMaxPropertyNode doit être désérialisé en tant que FusioningTrackMaxPropertyNode");
  }
}