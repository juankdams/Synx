import java.util.List;
import org.apache.log4j.Logger;

public class bti extends csx
  implements bye
{
  private static final String gbJ = "mergePowder";
  private static final String gbK = "mergeGem";
  private int aSg;
  private boolean gbL;

  public bti()
  {
    fk(true);
  }

  public bti(boolean paramBoolean) {
    fk(paramBoolean);
  }

  public void fk(boolean paramBoolean) {
    this.gbL = paramBoolean;
    this.aSg = (this.gbL ? coH.hXA.aw : coH.hXB.aw);
  }

  public bti bBN()
  {
    return new bti(this.gbL);
  }

  public String qa()
  {
    return this.gbL ? "mergePowder" : "mergeGem";
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
        bBO();
      } else {
        aEe localaEe = new aEe(bU.fH().getString("too.far.to.interact"));
        localaEe.mm(3);
        CM.LV().a(localaEe);
      }
    }
  }

  public aiI pW()
  {
    return aiI.dgw;
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    byv.bFN().bFO().aeL().c(this);
    bBO();
  }

  protected int qc()
  {
    return this.aSg;
  }

  protected void bBO() {
    cew localcew = byv.bFN().bFO().aeL();
    cMb localcMb = (cMb)this.dvI;

    if (localcMb.g(localcew)) {
      avV.aIa().a(localcMb);
      if (byv.bFN().c(avV.aIa())) {
        avV.aIa().cT(this.gbL);
        avV.aIa().abg();
      } else {
        avV.aIa().cT(this.gbL);
        byv.bFN().a(avV.aIa());
      }

      CG localCG = localcew.atB().aa(localcMb.fa(), localcMb.fb(), localcMb.fc());
      if (localCG != null)
        localcew.i(localCG);
    }
  }

  public void iT(int paramInt)
  {
    this.aSg = paramInt;
  }
}