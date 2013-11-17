import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class dKA
  implements dPK
{
  public static final Logger K = Logger.getLogger(dKA.class);

  public static final dPK aXY = new dKA();
  private final cnf lYv = new cnf();
  protected final Nm bEA = new Nm();

  protected dKA() {
    this.bEA.caB = 1000;
    this.bEA.caD = false;
    this.bEA.caC = -1;
    this.bEA.caJ = true;
    this.bEA.caH = true;
  }

  public cuB a(Su paramSu, cew paramcew, int paramInt)
  {
    if (paramInt <= 0) {
      return qK.aXY.a(paramSu, paramcew, paramInt);
    }
    if (paramSu.cRe() != null) {
      return qK.aXY.a(paramSu, paramcew, paramInt);
    }

    boolean bool1 = paramSu.i(cfY.hCx);

    arl localarl = paramSu.aeQ();

    List localList = localarl.bZ(paramSu.Fx());

    if ((localList == null) || (localList.isEmpty()) || (!bCs.a(paramSu.ML(), localList))) {
      if (bool1) {
        return cuB.ifk;
      }
      return qK.aXY.a(paramSu, paramcew, paramInt);
    }

    cYk localcYk = a(paramSu, paramcew, localList);
    if (localcYk == null) {
      if (bool1) {
        return cuB.ifk;
      }
      return qK.aXY.a(paramSu, paramcew, paramInt);
    }

    UG localUG = localarl.LB();
    localUG.c(paramSu);
    cuB localcuB = null;
    try {
      this.lYv.a(localarl, paramSu.Fx(), localList);

      localcuB = bYZ.a(WakfuClientInstance.awy().Dg(), paramcew, axB.dyx, axB.dyy, this.bEA, localUG, this.lYv);
    }
    finally
    {
      localUG.ahM();
    }

    if ((localcuB != null) && (localcuB.csX())) {
      boolean bool2 = paramSu.c(cfY.hCS);
      if ((bool2) && (paramInt > 0)) {
        return localcuB;
      }
      int i = paramInt * 3;
      if (localcuB.csW() <= i) {
        return localcuB;
      }
    }

    if (bool1) {
      return cuB.ifk;
    }

    return qK.aXY.a(paramSu, paramcew, paramInt);
  }

  private cYk a(Su paramSu, cew paramcew, List paramList)
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
        if (!localcYk.equals(localScreenElement.ddK()))
        {
          if (bCs.a(localScreenElement.ddK(), paramList))
            return new cYk(localScreenElement.ddK()); 
        }
      }
    }
    return null;
  }
}