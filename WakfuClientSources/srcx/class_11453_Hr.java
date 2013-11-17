import org.apache.log4j.Logger;

abstract class Hr extends doA
{
  private int bPE;
  private int bPF;
  private int bPG;

  protected int QQ()
  {
    return this.bPE;
  }

  protected int QR() {
    return this.bPF;
  }

  protected int QS() {
    return this.bPG;
  }

  protected abstract boolean QT();

  protected void c(doA paramdoA)
  {
    this.bPE = 0;
    this.bPF = 0;
    this.bPG = 0;

    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM == null) {
      K.error("Groupe d'effet inconnu" + ((dpI)this.eWL).yR());
      cVD();
      return;
    }

    dji localdji = a(paramdoA, QT());
    if ((a(PY.coL)) && (localdji.cRW() == -1)) {
      localdji.Ao(cVC());
    }
    for (dpI localdpI : localaLM) {
      bbq localbbq = null;
      if (aM()) {
        localbbq = localdpI.a(wa(), bke(), aIq(), bsj.bAv(), this.evp.fa(), this.evp.fb(), this.evp.fc(), this.evp, localdji);
      }
      else if (aN()) {
        localbbq = localdpI.a(wa(), bke(), aIq(), bsj.bAv(), this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), null, localdji);
      }
      else {
        K.error("Pas de type de cible défini, on n'execute pas le groupe d'effet " + yR());
      }
      if (localbbq != null) {
        this.bPE += 1;
        this.bPG += localbbq.bpY();
        if (localbbq.bpY() == 0) {
          this.bPF += 1;
        }
      }
    }
    localdji.release();
  }

  protected void a(doA paramdoA, dle paramdle)
  {
    this.bPE = 0;
    this.bPF = 0;
    this.bPG = 0;

    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM == null) {
      K.error("Groupe d'effet inconnu" + ((dpI)this.eWL).yR());
      cVD();
      return;
    }

    dji localdji = a(paramdoA, true);
    if ((a(PY.coL)) && (localdji.cRW() == -1)) {
      localdji.Ao(cVC());
    }
    for (dpI localdpI : localaLM)
    {
      bbq localbbq = localdpI.a(wa(), bke(), aIq(), bsj.bAv(), paramdle.fa(), paramdle.fb(), paramdle.fc(), paramdle, localdji);

      if (localbbq != null) {
        this.bPE += 1;
        this.bPG += localbbq.bpY();
        if (localbbq.bpY() == 0) {
          this.bPF += 1;
        }
      }
    }

    localdji.release();
  }

  protected dji a(doA paramdoA, boolean paramBoolean) {
    dji localdji = dji.a(paramBoolean, false, paramdoA);
    localdji.jt(false);
    return localdji;
  }
}