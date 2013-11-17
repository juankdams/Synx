import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class cTW extends boq
{
  private final Map cJU;

  public cTW(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
    if (paramdUl == dUl.mrx)
      this.cJU = null;
    else
      this.cJU = new HashMap(5);
  }

  public void fM(long paramLong)
  {
    throw new UnsupportedOperationException("Les données d'un noeud fusionnant ne peuvent provenir que d'une désérialisation");
  }

  public void a(cXr paramcXr)
  {
    throw new UnsupportedOperationException("Un noeud fusionnant ne peut pas être sérialisé");
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    long l = paramByteBuffer.getLong();
    Iterator localIterator;
    Long localLong;
    switch (bSd.hcB[this.mee.ordinal()]) {
    case 1:
      this.aJf = l;
      break;
    case 2:
      this.cJU.put(paramString, Long.valueOf(l));
      this.aJf = 0L;
      for (localIterator = this.cJU.values().iterator(); localIterator.hasNext(); ) { localLong = (Long)localIterator.next();
        this.aJf += localLong.longValue();
      }
      this.aJf /= this.cJU.size();
      break;
    case 3:
      this.cJU.put(paramString, Long.valueOf(l));
      this.aJf = 0L;
      for (localIterator = this.cJU.values().iterator(); localIterator.hasNext(); ) { localLong = (Long)localIterator.next();
        this.aJf += localLong.longValue();
      }
    }
  }
}