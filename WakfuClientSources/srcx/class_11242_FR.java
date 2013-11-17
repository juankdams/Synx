import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class FR extends daW
{
  private final SortedMap bNU;

  FR(Map paramMap)
  {
    this.bNU = new TreeMap(paramMap);
  }

  int PY()
  {
    if (this.kSR != null) {
      return this.kSR.intValue();
    }

    int i = this.bNU.isEmpty() ? 0 : ((Integer)this.bNU.lastKey()).intValue() - ((Integer)this.bNU.firstKey()).intValue();
    return cMQ() + i;
  }

  long[] PZ()
  {
    return drH.b(this.bNU, cMQ(), PY());
  }
}