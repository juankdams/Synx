import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aLr
{
  private static final Logger K = Logger.getLogger(aLr.class);

  int epH = 2147483647;
  int epI = 2147483647;
  final ArrayList epJ = new ArrayList();

  void reset() {
    this.epH = 2147483647;
    this.epI = 2147483647;
    this.epJ.clear();
  }

  private void a(btb parambtb, int paramInt1, int paramInt2) {
    if ((paramInt1 == this.epH) && (paramInt2 == this.epI)) {
      return;
    }
    this.epJ.clear();
    parambtb.a(paramInt1, paramInt2, this.epJ, cWj.kJi);
    this.epH = paramInt1;
    this.epI = paramInt2;
  }

  int a(btb parambtb, int paramInt1, int paramInt2, int paramInt3) {
    Object localObject = b(parambtb, paramInt1, paramInt2, paramInt3);
    try
    {
      for (int i = this.epJ.size() - 1; i >= 0; i--) {
        DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)this.epJ.get(i);
        if (localDisplayedScreenElement.bpg())
        {
          if ((localObject != null) && (localDisplayedScreenElement.GG().mnP > ((DisplayedScreenElement)localObject).GG().mnP))
            localObject = localDisplayedScreenElement;
        }
      }
    } catch (Exception localException) {
      K.warn("Problème dans le process d'affichage :", localException);
      return 0;
    }

    return localObject != null ? ((DisplayedScreenElement)localObject).fis.ddQ() : 0;
  }

  DisplayedScreenElement b(btb parambtb, int paramInt1, int paramInt2, int paramInt3) {
    a(parambtb, paramInt1, paramInt2);

    int i = this.epJ.size();
    if (i == 0)
      return null;
    if (i == 1) {
      return (DisplayedScreenElement)this.epJ.get(0);
    }

    int j = 2147483647;
    Object localObject = null;
    try {
      for (int k = 0; k < i; k++) {
        DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)this.epJ.get(k);
        if (!localDisplayedScreenElement.bpg())
        {
          int m = localDisplayedScreenElement.fc();
          int n = m - localDisplayedScreenElement.fis.bY();
          int i1 = (paramInt3 >= n) && (paramInt3 <= m) ? 1 : 0;

          int i2 = Math.abs(m - paramInt3);
          if (((i2 == 0) && (j == 0)) || (i1 != 0)) {
            int i3 = localObject == null ? -1 : localObject.fis.ddQ();
            if (localDisplayedScreenElement.fis.ddQ() > i3)
              localObject = localDisplayedScreenElement;
          }
          if (i2 < j) {
            j = (short)i2;
            localObject = localDisplayedScreenElement;
          }
        }
      }
    } catch (Exception localException) { K.warn("Problème dans le process d'affichage :", localException);
      return null;
    }
    return localObject;
  }
}