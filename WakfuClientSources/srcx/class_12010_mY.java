import java.util.BitSet;
import org.apache.log4j.Logger;

public class mY extends doA
{
  private static final aee bx = new bOO(new cRF());

  private static final qM by = new dzQ(new ec[] { new dLx("Set de Charac, valeur = charac du caster (tention !)", new dmb[0]), new dLx("Set de Charac (tention !)", new dmb[] { new dmb("valeur (eventuellement en %)", dnN.lnR) }) });
  private dSc aOF;
  private int aRo = 0;

  public qM aF()
  {
    return by;
  }

  private mY()
  {
  }

  public mY(dSc paramdSc)
  {
    this.aOF = paramdSc;
    aH();
  }

  public mY uA()
  {
    mY localmY;
    try
    {
      localmY = (mY)bx.Mm();
      localmY.aOr = bx;
    } catch (Exception localException) {
      localmY = new mY();
      localmY.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacGain : " + localException.getMessage());
    }
    localmY.aOF = this.aOF;
    return localmY;
  }

  public dSc sw()
  {
    return this.aOF;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    switch (this.aOF.ln()) {
    case 0:
      uB();
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if ((this.eWL != null) && (((dpI)this.eWL).bep() > 0))
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
    else
      this.cxl = bke().e(this.aOF);
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

  public void aK()
  {
    if ((this.ksH) && (bkM())) {
      switch (this.aOF.ln()) {
      case 0:
        uC();
      }
    }

    super.aK();
  }

  private void uB() {
    if ((this.evp != null) && (this.evp.b(this.aOF)))
    {
      int i = bke().e(this.aOF);

      cqm localcqm = this.evp.a(this.aOF);
      b(localcqm);

      if ((this.aOF == eu.azq) && (this.ejP.LH() != null)) {
        this.ejP.LH().AT();
      }
      int j = bke().e(this.aOF) - i;

      if ((this.aOF instanceof eu)) {
        eu localeu = (eu)this.aOF;

        if ((localeu.ly()) && (j > 0)) {
          this.eWR.set(localeu.lu());
        }
        if ((localeu.lz()) && (j < 0))
          this.eWR.set(localeu.lv());
      }
    }
    else {
      jJ(true);
    }
  }

  private void uC()
  {
    if ((this.evp != null) && (this.evp.b(this.aOF)))
    {
      c(this.evp.a(this.aOF));

      if ((this.aOF == eu.azq) && (this.ejP != null) && (this.ejP.LH() != null))
        this.ejP.LH().AT();
    }
  }

  private void b(cqm paramcqm) {
    int i = paramcqm.value();
    paramcqm.set(this.cxl);
    this.cxl = paramcqm.value();
    this.aRo = (this.cxl - i);
  }

  private void c(cqm paramcqm) {
    int i = paramcqm.value() - this.aRo;
    paramcqm.set(i);
  }
}