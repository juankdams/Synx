import java.util.BitSet;
import org.apache.log4j.Logger;

public class kM extends doA
{
  private static final aee bx = new bOO(new axS());

  private static final qM by = new dzQ(new ec[] { new dLx("Buff de charac", new dmb[] { new dmb("Valeur (-1 = valeur de l'effet declencheur, -2 = 2*la valeur de l'effet déclencheur)", dnN.lnR), new dmb("Augmente la valeur courante (0 non 1 oui)", dnN.lnS), new dmb("Diminue à la désapplication (0 généralement. Si vous hésitez, demandez ! Bug à l'horizon)", dnN.lnS) }) });
  protected dSc aOF;
  protected boolean aOG = true;
  protected boolean aOH = true;
  protected int aOI = 0;

  private cCH aGA = new axT(this);

  public qM aF()
  {
    return by;
  }

  protected kM()
  {
  }

  public kM(dSc paramdSc)
  {
    this.aOF = paramdSc;
    aH();
  }

  public kM sv()
  {
    kM localkM;
    try {
      localkM = (kM)bx.Mm();
      localkM.aOr = bx;
    } catch (Exception localException) {
      localkM = new kM();
      localkM.eXg = false;
      localkM.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacBuff : " + localException.getMessage());
    }
    localkM.aOF = this.aOF;
    return localkM;
  }

  public dSc sw() {
    return this.aOF;
  }

  public void aH()
  {
    super.aH();
    if (this.aOF == null)
      return;
    switch (this.aOF.ln()) {
    case 0:
      eu localeu = (eu)this.aOF;
      if (localeu.lw()) {
        this.eWR.set(localeu.ls());
      }

      break;
    case 1:
      switch (axR.bZV[((avB)this.aOF).ordinal()]) {
      case 1:
        this.eWR.set(3);
      }
      break;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((sx() != null) && (sx().b(this.aOF))) {
      cqm localcqm = sx().a(this.aOF);

      if ((this.cxl == -1) && (paramaVc != null)) {
        this.cxl = paramaVc.getValue();
      }
      int i = localcqm.acX();
      int j = localcqm.max();
      int k = localcqm.adb().lD();
      B(i, k);
      int m = localcqm.gx(this.cxl);

      if (bkt()) {
        this.cxl = (localcqm.acX() - i);
        this.aOI = (m - j);
      }

      if ((this.aOG) && (this.aOI != 0)) {
        int n = sx().a(this.aOF).gv(this.aOI);
        if ((n != 0) && (this.aOF.ln() == 0)) {
          eu localeu = (eu)this.aOF;
          if (localeu.lw())
            this.eWR.set(localeu.ls());
        }
        this.ksH = true;
      }

      if ((this.aOF == eu.azq) && (this.ejP.LH() != null))
        this.ejP.LH().AT();
    }
    else {
      jJ(true);
    }
  }

  private void B(int paramInt1, int paramInt2) {
    if ((!bkt()) || (paramInt2 == -1)) {
      return;
    }
    if (wa() == null) {
      return;
    }
    if (a(PY.coM)) {
      return;
    }
    this.cxl = Math.min(paramInt2 - paramInt1, this.cxl);
  }

  public void B(boolean paramBoolean)
  {
    this.aOG = paramBoolean;
  }

  public void C(boolean paramBoolean) {
    this.aOH = paramBoolean;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    short s = cVC();
    this.aOG = (((dpI)this.eWL).a(1, s, dNF.mei) != 0);
    this.aOH = (((dpI)this.eWL).a(2, s, dNF.mei) != 0);

    this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);

    if ((this.cxl == -2) && (bkh() != null) && (((dji)bkh()).cRV() != null))
    {
      if (((dji)bkh()).cRV().getValue() > 0)
        this.cxl = (((dji)bkh()).cRV().getValue() * 2);
    }
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean) {
    switch (paramInt) {
    case 0:
      if (!paramBoolean)
        this.cxl += bMr.ax(this.cxl * paramFloat / 100.0F); break;
    case 1:
      if (paramBoolean)
        this.cxl = bMr.ax(paramFloat);
      else {
        this.cxl = ((int)(this.cxl + paramFloat));
      }
      break;
    }

    if (this.cxl == 0)
      cVD();
  }

  protected dle sx()
  {
    return this.evp;
  }

  public void aK()
  {
    if (this.ksH) {
      if ((sx() != null) && (sx().b(this.aOF))) {
        int i = this.cxl;
        if (this.aOF == eu.ayM) {
          int j = sx().e(this.aOF);
          i = this.aOI > j ? j - 1 : this.aOI;
        }
        if (this.aOH) {
          sx().a(this.aOF).gw(i);
        }
        sx().a(this.aOF).gx(-this.cxl);
      }
      if ((this.aOF == eu.azq) && (this.ejP.LH() != null))
        this.ejP.LH().AT();
    }
    super.aK();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public cCH lJ()
  {
    return this.aGA;
  }
}