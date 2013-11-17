import java.util.Map;
import java.util.SortedMap;

public class drH
{
  public static cOB a(daW paramdaW)
  {
    return new aff(paramdaW.PZ(), paramdaW.cMQ(), paramdaW.PY(), paramdaW.cMR(), paramdaW.cMS(), paramdaW.cMT());
  }

  public static daW p(long[] paramArrayOfLong) {
    return new bJo(paramArrayOfLong);
  }

  public static daW t(Map paramMap) {
    return new FR(paramMap);
  }

  private static long[] a(SortedMap paramSortedMap, int paramInt1, int paramInt2)
  {
    long[] arrayOfLong = new long[paramInt2 - paramInt1 + 1];
    for (int i = 0; i < arrayOfLong.length - 1; i++) {
      arrayOfLong[(i + 1)] = (arrayOfLong[i] + a(paramInt1 + i, paramSortedMap));
    }
    return arrayOfLong;
  }

  private static long a(int paramInt, SortedMap paramSortedMap) {
    SortedMap localSortedMap = paramSortedMap.headMap(Integer.valueOf(paramInt + 1));
    return localSortedMap.isEmpty() ? 0L : ((Long)paramSortedMap.get(localSortedMap.lastKey())).longValue();
  }
}