import org.apache.log4j.Logger;

public final class hB extends doA
{
  private static final aee bx = new bOO(new djV());

  private static final qM by = new dzQ(new ec[] { new dLx("Defaut", new dmb[0]), new dLx("Ratio en %", new dmb[] { new dmb("ratio en %", dnN.lnS) }) });
  private dSc[] aHb;

  public qM aF()
  {
    return by;
  }

  public hB() {
    aH();
  }

  public hB(dSc[] paramArrayOfdSc) {
    this.aHb = paramArrayOfdSc;
    aH();
  }

  public hB pB()
  {
    hB localhB;
    try {
      localhB = (hB)bx.Mm();
      localhB.aOr = bx;
    } catch (Exception localException) {
      localhB = new hB();
      localhB.aOr = null;
      localhB.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacBuffFunctionCasterCharacAtApplication : " + localException.getMessage());
    }
    localhB.aHb = this.aHb;
    return localhB;
  }

  public void oT()
  {
    if ((this.evo != null) && (bkt())) {
      for (int i = 0; i < this.aHb.length; i++) {
        dSc localdSc = this.aHb[i];
        if (this.evo.b(localdSc))
          this.cxl += this.evo.e(localdSc);
      }
      if ((this.eWL != null) && (((dpI)this.eWL).bep() > 0)) {
        i = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
        this.cxl = (this.cxl * i / 100);
      }
    }
    super.oT();
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    if (this.eWL == null) {
      cVD();
      return;
    }

    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM == null) {
      K.error("Groupe d'effet inconnu" + ((dpI)this.eWL).yR());
      cVD();
      return;
    }

    dji localdji = a((doA)paramaVc, true);
    localdji.Ap(this.cxl);
    if ((a(PY.coL)) && (localdji.cRW() == -1)) {
      localdji.Ao(cVC());
    }

    for (dpI localdpI : localaLM) {
      try {
        localdpI.a(wa(), bke(), aIq(), bsj.bAv(), this.evp.fa(), this.evp.fb(), this.evp.fc(), bke(), localdji);
      }
      catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    }

    localdji.release();
  }

  private dji a(doA paramdoA, boolean paramBoolean) {
    dji localdji = dji.a(paramBoolean, false, paramdoA);
    localdji.jt(false);
    return localdji;
  }

  public void bc()
  {
    this.aHb = null;
    super.bc();
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }
}