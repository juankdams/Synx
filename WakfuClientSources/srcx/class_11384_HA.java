import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement.ObjectFactory;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import org.apache.log4j.Logger;

public final class HA
{
  private static final Logger K = Logger.getLogger(HA.class);

  private final aoL bPQ = new aoL(8192);

  public HA() {
    this.bPQ.bP(0.0F);
  }

  public DisplayedScreenElement bC(long paramLong) {
    if ((!bB) && (paramLong == 0L)) throw new AssertionError();
    DisplayedScreenElement localDisplayedScreenElement1 = (DisplayedScreenElement)this.bPQ.get(paramLong);
    if (localDisplayedScreenElement1 != null) {
      localDisplayedScreenElement1.gQ();
      return localDisplayedScreenElement1;
    }

    DisplayedScreenElement localDisplayedScreenElement2 = (DisplayedScreenElement)DisplayedScreenElement.fir.bQy();
    this.bPQ.put(paramLong, localDisplayedScreenElement2);
    return localDisplayedScreenElement2;
  }

  public void a(DisplayedScreenElement paramDisplayedScreenElement) {
    if (paramDisplayedScreenElement.bpu() <= 0) {
      long l = paramDisplayedScreenElement.fis.lGL;
      if ((!bB) && (l == 0L)) throw new AssertionError();
      this.bPQ.remove(l);
    }

    paramDisplayedScreenElement.axl();
  }

  public void X(byte paramByte) {
    cHu localcHu = this.bPQ.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)localcHu.value();
      if ((localDisplayedScreenElement.fiu == null) && 
        (localDisplayedScreenElement.cC(paramByte)))
      {
        localDisplayedScreenElement.GH();
      }
    }
  }

  public void clear() { if (!this.bPQ.isEmpty())
      K.error("la factory contient encore des éléments!!!");
    this.bPQ.clear();
  }
}