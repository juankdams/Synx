import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class drD extends csx
  implements bye
{
  private int aSg;
  private static final String fib = "recycle";

  public drD()
  {
    this.aSg = coH.hWB.aw;
  }

  public drD cYr()
  {
    return new drD();
  }

  public String qa()
  {
    return "recycle";
  }

  public boolean pZ()
  {
    if (byv.bFN().bFO().adF()) {
      return false;
    }

    if (aYP.feK.bnQ()) {
      return false;
    }

    return true;
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    dWu localdWu = (dWu)this.dvI;
    List localList = localdWu.bVi();
    byz localbyz = byv.bFN().bFO();

    if (!localbyz.q(false, true)) {
      return;
    }
    localbyz.aeL().b(this);

    if (!byv.bFN().bFO().a(false, true, localList)) {
      byv.bFN().bFO().aeL().c(this);
      if ((Math.abs(localbyz.aeL().atB().getX() - localdWu.fa()) <= 1) && (Math.abs(localbyz.aeL().atB().getY() - localdWu.fb()) <= 1))
      {
        cYs();
      } else {
        aEe localaEe = new aEe(bU.fH().getString("too.far.to.interact"));
        localaEe.mm(3);
        CM.LV().a(localaEe);
      }
    }
  }

  public aiI pW()
  {
    return aiI.dfT;
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    byv.bFN().bFO().aeL().c(this);
    cYs();
  }

  protected int qc()
  {
    return this.aSg;
  }

  protected void cYs() {
    cew localcew = byv.bFN().bFO().aeL();
    cMb localcMb = (cMb)this.dvI;

    if (localcMb.g(localcew)) {
      dhC.cQm().a(localcMb);
      if (byv.bFN().aCA().contains(dhC.cQm()))
        dhC.cQm().abg();
      else {
        byv.bFN().a(dhC.cQm());
      }

      CG localCG = localcew.atB().aa(localcMb.fa(), localcMb.fb(), localcMb.fc());
      if (localCG != null) {
        localcew.i(localCG);
      }

      localcMb.x((short)2);
      localcMb.sM();
    }
  }

  public void iT(int paramInt) {
    this.aSg = paramInt;
  }
}