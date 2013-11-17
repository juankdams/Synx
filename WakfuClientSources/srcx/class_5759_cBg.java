import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;

public class cBg extends bLQ
{
  protected static final Logger K = Logger.getLogger(cBg.class);
  private final Map cJU;
  private final FT bGQ;
  private final FT bGR;
  private final FT bGS;
  private final FT bGT;
  private final FT bGU;

  public cBg(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
    if (paramdUl == dUl.mrx)
      this.cJU = null;
    else {
      this.cJU = new HashMap(5);
    }
    this.bGQ = ((FT)a(new FT("value", this, paramdUl)));
    this.bGR = ((FT)a(new FT("min", this, paramdUl)));
    this.bGR.fM(9223372036854775807L);
    this.bGS = ((FT)a(new FT("max", this, paramdUl)));
    this.bGT = ((FT)a(new FT("quotaMin", this, paramdUl)));
    this.bGU = ((FT)a(new FT("quotaMax", this, paramdUl)));
  }

  public void a(cXr paramcXr) {
    throw new UnsupportedOperationException("Un noeud fusionnant ne peut pas être sérialisé");
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    long l1 = paramByteBuffer.getLong();
    long l2 = paramByteBuffer.getLong();
    long l3 = paramByteBuffer.getLong();

    if (this.mee != dUl.mrx) {
      this.cJU.put(paramString, Long.valueOf(l1));
      l1 = 0L;
      for (Iterator localIterator = this.cJU.values().iterator(); localIterator.hasNext(); ) { long l4 = ((Long)localIterator.next()).longValue();
        l1 += l4;
      }
      if (this.mee == dUl.mrz) {
        l1 /= this.cJU.size();
      }
    }
    this.bGQ.fM(l1);
    if (l1 > this.bGS.getValue())
      this.bGS.fM(l1);
    else if (l1 < this.bGR.getValue()) {
      this.bGR.fM(l1);
    }

    this.bGT.fM(l2);
    this.bGU.fM(l3);
  }
}