import java.util.ArrayList;

public class Cu
{
  public static long c(cbQ paramcbQ)
  {
    return paramcbQ.remove(bCO.sf(paramcbQ.size()));
  }

  public static boolean b(cbQ paramcbQ, long paramLong) {
    int i = 0; for (int j = paramcbQ.size(); i < j; i++) {
      if (paramcbQ.uD(i) == paramLong) {
        paramcbQ.remove(i);
        return true;
      }
    }
    return false;
  }

  public static boolean b(cSi paramcSi, int paramInt) {
    int i = 0; for (int j = paramcSi.size(); i < j; i++) {
      if (paramcSi.wm(i) == paramInt) {
        paramcSi.wH(i);
        return true;
      }
    }
    return false;
  }

  public static boolean a(bHu parambHu, short paramShort) {
    int i = 0; for (int j = parambHu.size(); i < j; i++) {
      if (parambHu.sV(i) == paramShort) {
        parambHu.aP(i);
        return true;
      }
    }
    return false;
  }

  public static boolean a(bvv parambvv, byte paramByte) {
    int i = 0; for (int j = parambvv.size(); i < j; i++) {
      if (parambvv.rk(i) == paramByte) {
        parambvv.pV(i);
        return true;
      }
    }
    return false;
  }

  public static void a(cSR paramcSR, int paramInt, Object paramObject) {
    ArrayList localArrayList = (ArrayList)paramcSR.get(paramInt);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      paramcSR.put(paramInt, localArrayList);
    }
    localArrayList.add(paramObject);
  }
}