import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.Point;
import org.apache.log4j.Logger;

public class clD
  implements doN
{
  private static final Logger K = Logger.getLogger(clD.class);

  private final bHa hNw = new bHa();

  private final bHa hNx = new bHa();

  private final bHa hNy = new bHa();

  private short hNz = 0;

  private int hNA = 0;

  private dBz hNB = null;

  public void display()
  {
    this.hNB = cBQ.cxL().cyb();

    this.hNB.a(CH.bGE, this, true);
    this.hNB.a(CH.bGH, this, false);

    if ((this.hNx != null) && (this.hNx.size() > 0))
      this.hNB.setRadius(((cRz)this.hNx.hc(this.hNx.size() - 1)).OL());
    else {
      this.hNB.setRadius(0);
    }

    Object localObject1 = null;

    Point localPoint = null;
    int j;
    for (int i = 0; i < this.hNw.size(); j = (short)(i + 1)) {
      int k = 0;

      cRz localcRz = (cRz)this.hNx.cx(i);
      csx[] arrayOfcsx;
      Object localObject2;
      int i1;
      if (localcRz != null)
      {
        arrayOfcsx = localcRz.adN();
        if (arrayOfcsx != null)
        {
          if (localObject1 == null) {
            localObject1 = (dCb)this.hNw.cx(i);
          }
          for (int m = 0; m < arrayOfcsx.length; m++) {
            localObject2 = arrayOfcsx[m];
            ((csx)localObject2).Q(localcRz);

            boolean bool = false;
            try {
              bool = ((csx)localObject2).isUsable();
            } catch (Exception localException1) {
              K.error("Exception levée en déterminant si l'action " + localObject2.getClass().getSimpleName() + " est usable", localException1);
            }
            i1 = 0;
            try {
              i1 = ((csx)localObject2).pZ();
            } catch (Exception localException2) {
              K.error("Exception levée en déterminant si l'action " + localObject2.getClass().getSimpleName() + " est runnable", localException2);
            }
            if ((bool) && (i1 != 0))
            {
              if (k == 0) {
                this.hNB.deJ();
                k = 1;
              }

              this.hNB.a(null, ((csx)localObject2).getTooltip(), ((csx)localObject2).Eu(), null, ((csx)localObject2).getStyle(), ((csx)localObject2).ED(), new cQW(this, (csx)localObject2), ((csx)localObject2).isEnabled());
            }

          }

          if (localcRz.adO())
            localPoint = localcRz.adP();
        }
      } else {
        arrayOfcsx = (csx[])this.hNy.cx(i);
        if (arrayOfcsx != null) {
          dCb localdCb = (dCb)this.hNw.cx(i);

          for (csx localcsx : arrayOfcsx) {
            if ((localcsx.isUsable()) && (localcsx.pZ()))
            {
              if (localObject1 == null) {
                localObject1 = localdCb;
              }
              if (k == 0) {
                this.hNB.deJ();
                k = 1;
              }

              dSz localdSz = WakfuClientInstance.awy().Dg();
              cYm localcYm = up.c(localdSz, localdCb.getWorldX(), localdCb.getWorldY(), localdCb.getAltitude() + localdCb.ats());

              localPoint = new Point((int)localcYm.aOR, (int)localcYm.aOS);
              this.hNB.a(null, localcsx.getTooltip(), localcsx.Eu(), null, localcsx.getStyle(), localcsx.ED(), new cQT(this, localcsx), localcsx.isEnabled());
            }

          }

        }

      }

    }

    if (this.hNB.getGroupSize() > 0) {
      aWc.blo().eO(600072L);
      localPoint = null;
      if (localPoint != null)
        cBQ.cxL().a(this.hNB, localPoint.x, localPoint.y);
      else {
        cBQ.cxL().a(this.hNB);
      }
    }

    if ((localObject1 != null) && (((dCb)localObject1).apP()))
      beo.d((dCb)localObject1);
  }

  public void a(cRz paramcRz, dCb paramdCb)
  {
    csx[] arrayOfcsx = paramcRz.adN();
    if ((arrayOfcsx == null) || (arrayOfcsx.length == 0)) {
      return;
    }
    this.hNw.b(this.hNz, paramdCb);
    this.hNx.b(this.hNz, paramcRz);
    this.hNz = ((short)(this.hNz + 1));
  }

  public void a(csx[] paramArrayOfcsx, dCb paramdCb) {
    this.hNw.b(this.hNz, paramdCb);
    this.hNy.b(this.hNz, paramArrayOfcsx);
    this.hNz = ((short)(this.hNz + 1));
  }

  public final int cmZ() {
    return this.hNx.size();
  }

  public final cRz vK(int paramInt) {
    return (cRz)this.hNx.hc(paramInt);
  }

  public final boolean isDisplayable() {
    return (this.hNx.size() > 0) || (this.hNy.size() > 0);
  }

  public void cna() {
    if (this.hNB != null) {
      this.hNB.beH();
      this.hNB = null;

      cleanUp();
    }
  }

  private void cleanUp() {
    cqu.cpE().a(null);
    int j;
    for (int i = 0; i < this.hNw.size(); j = (short)(i + 1)) {
      dCb localdCb = (dCb)this.hNw.cx(i);
      if (localdCb != null)
        localdCb.atq();
    }
  }

  public boolean a(cSx paramcSx) {
    if (paramcSx.mp() == CH.bGE) {
      bZx localbZx = (bZx)paramcSx;

      if (localbZx.ced() < this.hNw.size())
      {
        localdCb = (dCb)this.hNw.cx((short)localbZx.ced());
        if ((localdCb != null) && (localdCb.apP())) {
          beo.d(localdCb);
        }
      }
      dCb localdCb = (dCb)this.hNw.cx((short)this.hNA);
      if (localdCb != null) {
        localdCb.atq();
      }
      this.hNA = localbZx.ced();
    }

    if (paramcSx.mp() == CH.bGH) {
      cleanUp();
    }

    return true;
  }
}