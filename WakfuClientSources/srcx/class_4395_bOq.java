import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bOq
{
  private static final Logger K = Logger.getLogger(bOq.class);

  private static final bOq gTC = new bOq();
  private boolean drG;
  private arl cUs;

  public static bOq bVv()
  {
    return gTC;
  }

  public boolean apR()
  {
    return this.drG;
  }

  public void L(boolean paramBoolean) {
    if (this.drG != paramBoolean) {
      this.drG = paramBoolean;
      aMH();
    }
  }

  public void j(arl paramarl) {
    if (paramarl != this.cUs) {
      this.cUs = paramarl;
      aMH();
    }
  }

  private void aMH() {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    if ((this.drG) && (this.cUs != null))
      try {
        btL.gcv.fn(false);
        localdSz.a(new EC(this.cUs));
        localdSz.lv(false);
        localdSz.l(bNa.gRy);
      } catch (Exception localException) {
        K.error("", localException);
        b(localdSz);
      }
    else
      b(localdSz);
  }

  private void b(dSz paramdSz)
  {
    btL.gcv.fn(true);
    paramdSz.a(dkP.lip);
    paramdSz.lv(true);

    c(paramdSz);
  }

  private void c(dSz paramdSz) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    int i = localbyz.Lk();
    dUx localdUx = bDk.bLI().cr((short)i);
    if (localdUx != null)
      paramdSz.l(localdUx.mrZ);
  }
}