import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dsh
{
  public static final dsh luB = new dsh();

  private static final Logger K = Logger.getLogger(dsh.class);

  private final cSR hwA = new cSR();
  private final ArrayList bLX = new ArrayList();

  public void a(biz parambiz)
  {
    if (this.bLX.contains(parambiz))
      return;
    this.bLX.add(parambiz);
    for (dmn localdmn = cgk(); localdmn.hasNext(); ) {
      localdmn.fl();
      aYr localaYr = (aYr)localdmn.value();
      parambiz.n(localaYr);
    }
  }

  private void n(aYr paramaYr) {
    for (int i = 0; i < this.bLX.size(); i++)
      ((biz)this.bLX.get(i)).n(paramaYr);
  }

  public boolean s(aYr paramaYr)
  {
    if (paramaYr.bP() == 0)
      K.info("Enregistrement d'une VOID_NATION : " + paramaYr);
    else {
      K.info("Enregistrement d'une nation  : " + paramaYr);
    }
    int i = paramaYr.bP();
    aYr localaYr = (aYr)this.hwA.get(i);
    if ((localaYr != null) && (localaYr != paramaYr)) {
      K.error("Tentative d'écrasement de référence de nation. ID=" + i);
      return false;
    }
    this.hwA.put(i, paramaYr);
    n(paramaYr);
    return true;
  }

  public aYr BA(int paramInt)
  {
    return (aYr)this.hwA.get(paramInt);
  }

  public dmn cgk() {
    return this.hwA.yF();
  }

  public int[] cYT() {
    return this.hwA.qe();
  }

  public int kh(long paramLong) {
    dmn localdmn = cgk();
    while (localdmn.hasNext()) {
      localdmn.fl();
      aYr localaYr = (aYr)localdmn.value();
      if (localaYr.o(paramLong) != null)
        return localaYr.bP();
    }
    return 0;
  }
}