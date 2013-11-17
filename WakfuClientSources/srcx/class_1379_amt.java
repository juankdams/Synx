import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public abstract class amt
  implements dPK
{
  public static final Logger K = Logger.getLogger(amt.class);

  protected final btl doU = new btl();
  protected final Nm bEA = new Nm();

  public amt() {
    this.bEA.caB = 1000;
    this.bEA.caD = false;
  }

  protected final cuB a(UG paramUG, Su paramSu, cew paramcew, int paramInt, float paramFloat1, float paramFloat2)
  {
    paramUG.c(paramSu);

    this.bEA.caC = paramInt;

    this.doU.a(paramSu.aeQ(), paramSu.Fx());
    this.doU.bt(paramFloat1);
    this.doU.bu(paramFloat2);

    cuB localcuB = bYZ.a(WakfuClientInstance.awy().Dg(), paramcew, axB.dyx, axB.dyy, this.bEA, paramUG, this.doU);

    this.doU.reset();

    paramUG.ahM();
    return localcuB;
  }
}