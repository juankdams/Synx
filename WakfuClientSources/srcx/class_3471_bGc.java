import java.io.IOException;
import org.apache.log4j.Logger;

public class bGc
{
  private static final Logger K = Logger.getLogger(bGc.class);

  private final cSR gCh = new cSR();
  private int bQo;
  private String SL;
  private static final bGc gCi = new bGc();

  public static bGc bOn() {
    return gCi;
  }

  public String getFileName()
  {
    return this.SL;
  }

  public void setFile(String paramString) {
    this.SL = paramString;
  }

  public void sH(int paramInt) {
    this.bQo = paramInt;
  }

  public void load()
  {
    clear();
    if (this.SL == null)
      return;
    String str = String.format(this.SL, new Object[] { Integer.valueOf(this.bQo) });
    try {
      aYQ localaYQ = aYQ.V(dtb.readFile(str));
      d(localaYQ);
      localaYQ.close();
    } catch (IOException localIOException) {
      K.error("Error while loading AmbianceZone file : " + this.SL + " (world " + this.bQo + ") : " + str, localIOException);
    }
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    this.gCh.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      agq localagq = new agq();
      localagq.d(paramaYQ);

      if ((!bB) && (this.gCh.contains(localagq.biu))) throw new AssertionError();
      this.gCh.put(localagq.biu, localagq);
    }
  }

  public void b(dSw paramdSw) {
    dmn localdmn = this.gCh.yF();
    paramdSw.writeInt(this.gCh.size());
    while (localdmn.hasNext()) {
      localdmn.fl();
      ((agq)localdmn.value()).b(paramdSw);
    }
  }

  public final void b(agq paramagq) {
    if ((!bB) && (this.gCh.contains(paramagq.biu))) throw new AssertionError();
    this.gCh.put(paramagq.biu, paramagq);
  }

  public agq sI(int paramInt)
  {
    return (agq)this.gCh.get(paramInt);
  }

  public void clear()
  {
    this.gCh.clear();
  }
}