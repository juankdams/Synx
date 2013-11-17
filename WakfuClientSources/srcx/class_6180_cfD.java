import java.util.LinkedHashMap;
import java.util.Map.Entry;

class cfD extends LinkedHashMap
{
  cfD(bnQ parambnQ, int paramInt, float paramFloat, boolean paramBoolean)
  {
    super(paramInt, paramFloat, paramBoolean);
  }
  protected boolean removeEldestEntry(Map.Entry paramEntry) {
    return size() > bnQ.a(this.hAF);
  }
}