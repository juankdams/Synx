import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import org.apache.log4j.Logger;

public final class bz
  implements Qh, aEN
{
  private static final Logger K = Logger.getLogger(bz.class);

  public static final bz kt = new bz();

  private boolean ku = true;

  public void a(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    DisplayedScreenElement localDisplayedScreenElement = aWe.c(btb.bBd(), paramInt1, paramInt2, paramShort);

    if (localDisplayedScreenElement == null) {
      return;
    }

    boolean bool = ayj.aJY().lb(localDisplayedScreenElement.OV());
    f(bool);
  }

  public void eE() {
    boolean bool = ayj.aJY().aJZ();
    f(bool);
  }

  private void f(boolean paramBoolean) {
    if (paramBoolean != this.ku)
    {
      anK.drx.cC(paramBoolean);
      this.ku = paramBoolean;
    }
  }

  public boolean eF() {
    return this.ku;
  }
}