import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

class bb extends Thread
{
  public ArrayList iT;
  private int iU = 0;
  private int iV = 0;

  bb(Jd paramJd, Zp[] paramArrayOfZp, bOK parambOK) {  } 
  private void a(Zp paramZp, String paramString) { uz localuz = dQU.drS().rO((String)paramZp.getFieldValue(paramString));
    if (localuz != null) {
      localuz.gQ();
      this.iT.add(localuz);
      Jd.l(this.iO).add(localuz);
    }
  }

  public void run()
  {
    this.iT = new ArrayList();
    for (Zp localZp : this.iW) {
      a(localZp, "malePortraitIllustration");
      a(localZp, "femalePortraitIllustration");
      a(localZp, "maleIllustration");
      a(localZp, "femaleIllustration");
    }
    while (true)
    {
      if ((this.iT.isEmpty()) || (this.iV >= 5000)) {
        Jd.SR().error("Creation dialog loading finish");
        this.iT.clear();
        ckU.cmE().done();
        return;
      }
      for (int i = this.iT.size() - 1; i >= 0; i--) {
        uz localuz = (uz)this.iT.get(i);
        if (localuz == null) {
          this.iX.gs(this.iU++);
          this.iT.remove(i);
        }
        else if (localuz.gI()) {
          this.iX.gs(this.iU++);
          this.iT.remove(localuz);
        }
      }
      try
      {
        Thread.sleep(50L);
        this.iV += 50;
      } catch (InterruptedException localInterruptedException) {
        localInterruptedException.printStackTrace();
      }
    }
  }
}