import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class csl extends vC
  implements bye
{
  private static bye dqN;
  private int aSg;
  private String bjA;
  private cMb ice;
  private bNa icf = bNa.gRx;

  private String icg = null;

  public aiI pW()
  {
    return aiI.dfO;
  }

  protected dJO aIu() {
    return this.ice.adT();
  }

  public void i(bNa parambNa) {
    this.icf = parambNa;
  }

  public void run()
  {
    if (!pZ()) {
      return;
    }
    byz localbyz = byv.bFN().bFO();

    if (!localbyz.q(false, true)) {
      return;
    }
    cew localcew = localbyz.aeL();
    if (dqN != null)
      localcew.c(dqN);
    dqN = this;
    localcew.b(dqN);

    cMb localcMb = (cMb)this.dvI;
    this.ice = localcMb;

    int i = localcew.OV();
    ArrayList localArrayList = new ArrayList(localcMb.bVi());
    for (int j = localArrayList.size() - 1; j >= 0; j--) {
      cYk localcYk = (cYk)localArrayList.get(j);
      DisplayedScreenElement localDisplayedScreenElement = btb.bBd().d(localcYk.getX(), localcYk.getY(), localcYk.IB(), cWj.kJk);
      if (localDisplayedScreenElement == null) {
        K.error("walkableElement null sur l'approchPoint=" + localcYk);
      }
      else if (localDisplayedScreenElement.OV() != i) {
        localArrayList.remove(j);
      }
    }
    if (!localbyz.a(false, true, localArrayList)) {
      localbyz.aeL().c(dqN);
      c(aIu());
    }
  }

  public boolean isEnabled()
  {
    return (super.isEnabled()) && (((cMb)this.dvI).ta());
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();
    return (!localbyz.adF()) && (!aYP.feK.bnQ());
  }

  public String getLabel()
  {
    lZ locallZ = new lZ().tz().am(this.icf.bUV());
    locallZ.a(bU.fH().getString(qa()));
    locallZ.tA();
    if (!isEnabled()) {
      if (this.icg != null)
        locallZ.tH().am(ict).a(this.icg);
      if (!((cMb)this.dvI).ta())
        locallZ.tH().am(ict).a(bU.fH().getString("error.playerNotSubscribed"));
    }
    return locallZ.tP();
  }

  public String qa()
  {
    return this.bjA != null ? this.bjA : "ielt.use";
  }

  public csx qb()
  {
    return new csl();
  }

  public void lZ(String paramString) {
    this.icg = paramString;
  }

  protected int qc()
  {
    return this.aSg;
  }

  public void iT(int paramInt) {
    this.aSg = paramInt;
  }

  public void ma(String paramString) {
    this.bjA = paramString;
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(dqN);
    if (this.ice.V(paramdMM.atB()))
      c(aIu());
  }

  public List EB()
  {
    return null;
  }

  public List EC()
  {
    if (Ew() != dqU.ltr)
      return null;
    byz localbyz = byv.bFN().bFO();
    bQe localbQe = new bQe(localbyz);
    localbQe.ni(2147483647);
    localbQe.b(((DO)this.dvI).getId());
    return localbQe.bDr();
  }
}