import org.apache.log4j.Logger;

public class abu extends csx
  implements bye
{
  private static final int cPR = 0;
  private static final int cPS = 2;
  private static final int cPT = 3;
  private boolean cPU;
  private aCH cAO;
  private int cPV = 0;

  public abu(boolean paramBoolean) {
    this.cPU = paramBoolean;
  }

  public abu(aCH paramaCH, boolean paramBoolean) {
    this.cAO = paramaCH;
    this.cPU = paramBoolean;
  }

  public abu anT()
  {
    return new abu(this.cAO, this.cPU);
  }

  public void a(aCH paramaCH) {
    this.cAO = paramaCH;
  }

  public String qa()
  {
    return this.cAO.aOS();
  }

  public String getLabel()
  {
    lZ locallZ = new lZ();
    locallZ.tz().a(bU.fH().getString("desc.mru." + qa()));
    if (this.cPU)
      locallZ.a(" (").a(bU.fH().getString("craft.improvise")).a(")");
    locallZ.tA();

    if ((!isEnabled()) && 
      (this.cPV != 0)) {
      locallZ.a("\n").tI().am(ict);
      switch (this.cPV) {
      case 2:
        locallZ.a(bU.fH().getString("craft.unknown")).tJ();
        break;
      case 3:
        locallZ.a(bU.fH().getString("error.playerNotSubscribed")).tJ();
      }

    }

    return locallZ.tP();
  }

  public boolean pZ()
  {
    setEnabled(true);
    return true;
  }

  public boolean isEnabled()
  {
    byz localbyz = byv.bFN().bFO();
    if (!bGP.gDx.a(new aGH[] { localbyz })) {
      this.cPV = 3;
      return false;
    }
    if (localbyz.aTn().contains(((bNK)this.dvI).axX())) {
      this.cPV = 0;
      return true;
    }

    this.cPV = 2;
    return false;
  }

  public void run()
  {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    cMb localcMb = (cMb)this.dvI;
    byz localbyz = byv.bFN().bFO();

    if (!localbyz.q(false, true))
      return;
    localbyz.aeL().b(this);

    if (!localbyz.a(false, true, localcMb.bVi())) {
      localbyz.aeL().c(this);
      if ((!localbyz.aeL().dpE()) && (localcMb.V(localbyz.aeL().atB()))) {
        anU();
      } else {
        aEe localaEe = new aEe(bU.fH().getString("too.far.to.interact"));
        localaEe.mm(3);
        CM.LV().a(localaEe);
      }
    }
  }

  public aiI pW()
  {
    return this.cPU ? aiI.dgi : aiI.dfI;
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    paramdMM.c(this);
    cMb localcMb = (cMb)this.dvI;
    byz localbyz = byv.bFN().bFO();
    if (localcMb.V(localbyz.aeL().atB()))
      anU();
  }

  protected int qc()
  {
    return this.cPU ? coH.hXs.aw : this.cAO.aOR();
  }

  protected void anU() {
    byz localbyz = byv.bFN().bFO();
    bNK localbNK = (bNK)this.dvI;
    localbyz.aeL().c(localbyz.ML().aa(localbNK.fa(), localbNK.fb(), (short)0));

    duO.dax().a((bNK)this.dvI, this.cPU);
  }
}