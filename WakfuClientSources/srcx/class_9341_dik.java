import org.apache.log4j.Logger;

public class dik extends csx
  implements bye
{
  private aCH giU;

  public aiI pW()
  {
    return aiI.dgk;
  }

  public csx qb()
  {
    return new dik();
  }

  public void run()
  {
    if (!pZ()) {
      return;
    }
    ajO localajO = (ajO)this.dvI;
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();

    if (localajO.V(localcew.atB())) {
      cRC();
      return;
    }

    localcew.b(this);
    K.info("Searching path to " + localajO);
    localbyz.a(Rl.a(localcew, localajO), true);
  }

  public String getLabel() {
    String str = super.getLabel();
    lZ locallZ = new lZ();
    locallZ.a(str);
    byz localbyz = byv.bFN().bFO();

    dKc localdKc = localbyz.bSe();
    if (localdKc != null) {
      locallZ.tH().tI().am(ict).a(bU.fH().getString("error.localPlayerBusy")).tJ();
    }
    return locallZ.tP();
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();

    dKc localdKc = localbyz.bSe();
    if (localdKc != null) {
      return false;
    }
    return super.isEnabled();
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof ajO)) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();
    if ((localbyz.bGK()) || (localbyz.adF()) || (aYP.feK.bnQ())) {
      return false;
    }

    return true;
  }

  public String qa()
  {
    return this.giU.aOS();
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    paramdMM.c(this);
    cRC();
  }

  private void cRC() {
    dmB localdmB = new dmB((ajO)this.dvI);
    if (localdmB.fV()) {
      localdmB.begin();
      return;
    }
  }

  public void Ah(int paramInt)
  {
    this.giU = clR.cni().vL(paramInt);
  }

  protected int qc()
  {
    return this.giU.aOR();
  }
}