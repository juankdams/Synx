import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ads extends bLQ
{
  private final Map cJU;
  private final FT bGQ;
  private final FT bGS;
  private final FT cTC;

  public ads(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
    if (paramdUl == dUl.mrx)
      this.cJU = null;
    else {
      this.cJU = new HashMap(5);
    }
    this.bGQ = ((FT)a(new FT("value", this, paramdUl)));
    this.bGS = ((FT)a(new FT("max", this, paramdUl)));
    this.cTC = ((FT)a(new FT("maxTime", this, paramdUl)));
  }

  public void a(cXr paramcXr) {
    throw new UnsupportedOperationException("Un noeud fusionnant ne peut pas être sérialisé");
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    long l1 = paramByteBuffer.getLong();
    if (this.mee != dUl.mrx) {
      this.cJU.put(paramString, Long.valueOf(l1));
      l1 = 0L;
      for (Iterator localIterator = this.cJU.values().iterator(); localIterator.hasNext(); ) { long l2 = ((Long)localIterator.next()).longValue();
        l1 += l2;
      }
      if (this.mee == dUl.mrz) {
        l1 /= this.cJU.size();
      }
    }
    this.bGQ.fM(l1);
    if (l1 > this.bGS.getValue()) {
      this.bGS.fM(l1);
      this.cTC.fM(System.currentTimeMillis());
    }
  }
}