import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dyY extends acS
  implements ZF
{
  private static final Logger K = Logger.getLogger(dyY.class);
  private static final String fwJ = "BeaconZoneEffect";
  private static final String fwK = "BeaconRangeEffect";
  private beb lFw;
  private Cs lFx;
  private static final String lFy = "beaconRange.tga";
  private static final String lFz = "beaconEffect.tga";
  private static final dyY lFA = new dyY();

  public static dyY dcU() {
    return lFA;
  }

  private dyY() {
    super("BeaconRangeEffect", clP.hOX, "BeaconZoneEffect", clP.hOV, null, null, null, null, null, null);
  }

  public void a(beb parambeb, Su paramSu)
  {
    this.lFw = parambeb;
    this.lFx = this.lFw.f(paramSu);

    E(paramSu);

    arl localarl = paramSu.aeQ();

    if (localarl != null) {
      UG localUG = localarl.LB();
      if (localUG != null) {
        long[] arrayOfLong = (long[])this.lFx.Lp();
        if (arrayOfLong != null) {
          for (int i = 0; i < arrayOfLong.length; i++) {
            long l = arrayOfLong[i];
            int j = aUG.eG(l);
            int k = aUG.eH(l);
            int m = aUG.eI(l);
            a(this.lFw, paramSu, new cYk(j, k, localUG.aw(j, k)));
          }
        }
      }
    }

    this.lFx = null;
    this.lFw = null;
  }

  protected dif a(cYk paramcYk, Su paramSu)
  {
    if ((this.lFw == null) || (this.lFx == null)) {
      return dif.ldO;
    }

    for (cYk localcYk : (ArrayList)this.lFx.getFirst()) {
      if (localcYk.equals(paramcYk)) {
        return dif.ldK;
      }
    }
    return dif.ldO;
  }

  public void update()
  {
    try
    {
      String str = ay.bd().getString("highLightGfxPath") + "beaconEffect.tga";
      this.cTf.a(str, dn.Tq);

      str = ay.bd().getString("highLightGfxPath") + "beaconRange.tga";
      a(str, dn.Tq);
    }
    catch (Exception localException) {
      K.error(localException);
    }
  }
}