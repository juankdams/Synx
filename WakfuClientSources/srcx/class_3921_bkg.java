import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bkg extends csx
  implements bye
{
  private ArrayList ewi = new ArrayList();
  private aSu fAw;
  public static final int ENABLED = 0;
  public static final int cRz = 1;
  private int cPV = 0;

  public csx qb() {
    return new bkg();
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();

    if (!bGP.gDv.a(new aGH[] { localbyz })) {
      this.cPV = 1;
      return false;
    }
    return true;
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();

    if (!(this.dvI instanceof aSu)) {
      return false;
    }
    if (localbyz.bGK()) {
      return false;
    }
    if (localbyz.adF()) {
      return false;
    }
    if (aYP.feK.bnQ()) {
      return false;
    }
    for (bls localbls : ((aSu)this.dvI).big()) {
      if ((!localbls.isLocked()) || (localbls.cqo().contains(Long.valueOf(localbyz.getId())))) {
        bZA localbZA = localbls.getItem().oi().a(Aq.bvU);
        aSu localaSu = (aSu)this.dvI;
        if ((localbZA == null) || (localbZA.i(localbyz, new cYk(localaSu.fa(), localaSu.fb(), localaSu.fc()), localbls, localbyz.bEY())))
        {
          return true;
        }
      }
    }
    return false;
  }

  public void run() {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }
    this.fAw = ((aSu)this.dvI);
    for (Object localObject1 = ((aSu)this.dvI).big().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bls)((Iterator)localObject1).next();
      if ((!((bls)localObject2).isLocked()) || (((bls)localObject2).cqo().contains(Long.valueOf(byv.bFN().bFO().getId()))))
        this.ewi.add(localObject2);
    }
    Object localObject2;
    localObject1 = byv.bFN().bFO();

    if ((Math.abs(((byz)localObject1).fa() - this.fAw.fa()) <= 1) && (Math.abs(((byz)localObject1).fb() - this.fAw.fb()) <= 1))
    {
      localObject2 = new bfe();
      for (bls localbls : this.ewi) {
        ((bfe)localObject2).fs(localbls.getItem().oj());
      }
      ((bfe)localObject2).ft(this.fAw.getId());
      byv.bFN().aJK().d((cWG)localObject2);
    } else {
      byv.bFN().bFO().aeL().b(this);
      localObject2 = (aSu)this.dvI;
      byv.bFN().bFO().a(((aSu)localObject2).fa(), ((aSu)localObject2).fb(), ((aSu)localObject2).fc(), false, true);
    }
  }

  public aiI pW()
  {
    return aiI.dfA;
  }

  public String qa()
  {
    return "pickup";
  }

  public String getLabel() {
    if (!isEnabled()) {
      locallZ = new lZ();
      locallZ.tz().a(bU.fH().getString("desc.mru." + qa())).tA().a("\n");

      locallZ.tI().am(ict);
      switch (this.cPV) {
      case 1:
        locallZ.a(bU.fH().getString("error.playerNotSubscribed")).tJ();
      }

      return locallZ.tP();
    }
    lZ locallZ = new lZ().tz().am(icr);
    locallZ.a(bU.fH().getString(qa())).tA();
    return locallZ.tP();
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    paramdMM.c(this);

    bfe localbfe = new bfe();
    for (bls localbls : this.ewi) {
      int i = this.fAw.fa() - paramdMM.fa();
      int j = this.fAw.fb() - paramdMM.fb();

      if ((Math.abs(i) <= 1) && (Math.abs(j) <= 1)) {
        if ((i != 0) && (j != 0)) {
          paramdMM.c(La.l(i, j));
        }
        localbfe.fs(localbls.getItem().oj());
      }
    }

    localbfe.ft(this.fAw.getId());
    byv.bFN().aJK().d(localbfe);
  }

  protected int qc()
  {
    return coH.hWq.aw;
  }
}