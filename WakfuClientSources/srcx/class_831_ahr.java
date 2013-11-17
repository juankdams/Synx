import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class ahr extends qK
{
  public static final Logger K = Logger.getLogger(ahr.class);

  public static final dPK aXY = new ahr();

  public cuB a(Su paramSu, cew paramcew, int paramInt)
  {
    if (paramInt > 0) {
      cYk localcYk = a(paramSu, paramcew);
      if (localcYk != null) {
        int[][] arrayOfInt = new int[1][3];
        arrayOfInt[0][0] = localcYk.getX();
        arrayOfInt[0][1] = localcYk.getY();
        arrayOfInt[0][2] = localcYk.IB();
        return new cuB(arrayOfInt);
      }

    }

    return super.a(paramSu, paramcew, paramInt);
  }

  private cYk a(Su paramSu, cew paramcew) {
    arl localarl = paramSu.aeQ();

    if (!a(localarl, paramSu)) {
      return null;
    }

    return a(localarl, paramSu, paramcew);
  }

  private cYk a(arl paramarl, Su paramSu, cew paramcew)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    dSz localdSz = WakfuClientInstance.awy().Dg();
    if (localdSz == null) {
      return null;
    }
    ArrayList localArrayList = localdSz.a(axB.dyx, axB.dyy, paramcew.getAltitude(), bYP.hoH, 0.0F, 0.0F);
    int i = localArrayList.size();
    if (i == 0) {
      return null;
    }

    cYk localcYk = paramSu.aKb();

    bKR localbKR = new bKR(50);
    for (int j = 0; j < i; j++)
    {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)localArrayList.get(j);
      ScreenElement localScreenElement = localDisplayedScreenElement.bpc();

      if (localbKR.add(localDisplayedScreenElement.bpf()))
      {
        int k = localScreenElement.ddI();
        int m = localScreenElement.ddJ();
        short s = localScreenElement.ddH();

        if (!localcYk.Z(k, m, s))
        {
          if (a(paramarl, paramSu, k, m, s))
            return new cYk(localScreenElement.ddI(), localScreenElement.ddJ(), localScreenElement.ddH()); 
        }
      }
    }
    return null;
  }

  private boolean a(arl paramarl, Su paramSu) {
    cYk localcYk = paramSu.aKb();
    return a(paramarl, paramSu, localcYk.getX(), localcYk.getY(), localcYk.IB());
  }

  private boolean a(arl paramarl, Su paramSu, int paramInt1, int paramInt2, short paramShort) {
    Collection localCollection = paramarl.LC().bbj();
    for (cjK localcjK : localCollection)
    {
      if ((localcjK.axG() == paramSu) && 
        (localcjK.getType() == xj.bpk.xj()))
      {
        if (localcjK.P(paramInt1, paramInt2, paramShort))
          return true;
      }
    }
    return false;
  }
}