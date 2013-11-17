import org.apache.log4j.Logger;

public class alS extends doA
{
  private static final bOO aCJ = new bOO(new bYM());

  private static final qM by = new dzQ(new ec[] { new dLx("Absorbe des dégâts subis et les convertit en perte de Kamas", new dmb[] { new dmb("Kamas perdus par point de dégât annulé", dnN.lnR), new dmb("% des dégâts absorbés", dnN.lnR), new dmb("Perte de Kamas maximale pour 1 source de dégâts", dnN.lnR), new dmb("Perte de Kamas minimale pour 1 source de dégâts", dnN.lnR) }) });
  private float dnD;
  private int dnE;
  private int dnF;
  private int dnG;

  public qM aF()
  {
    return by;
  }

  public alS ayB()
  {
    alS localalS;
    try {
      localalS = (alS)aCJ.Mm();
      localalS.aOr = aCJ;
    } catch (Exception localException) {
      K.warn("Erreur lors de newInstance sur un " + getClass().getSimpleName());
      localalS = new alS();
      localalS.aOr = null;
      localalS.eXg = false;
    }
    return localalS;
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

  public void a(aVc paramaVc)
  {
    short s = cVC();
    this.dnD = ((dpI)this.eWL).o(0, s);
    this.dnE = ((dpI)this.eWL).a(1, s, dNF.mei);
    this.dnF = ((int)Math.floor(((dpI)this.eWL).o(2, s) / this.dnD));
    this.dnG = ((dpI)this.eWL).a(3, s, dNF.mei);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((paramaVc != null) && (paramBoolean)) {
      p(paramaVc);
    }
    jJ(true);
  }

  void p(aVc paramaVc)
  {
    dle localdle = paramaVc.bkf();
    if (!(localdle instanceof dhJ)) {
      return;
    }

    dhJ localdhJ = (dhJ)localdle;
    int i = localdhJ.JE();
    if (i < this.dnG) {
      return;
    }
    int j = (int)Math.floor(i / this.dnD);

    int k = ax(paramaVc.getValue() * this.dnE / 100.0F);
    if (k > this.dnF)
      k = this.dnF;
    if (k > j) {
      k = j;
    }
    int m = Math.max((int)Math.ceil(k * this.dnD), this.dnG);

    localdhJ.dU(m);
    paramaVc.b(1, -k, false);
  }

  protected int ax(float paramFloat)
  {
    return bMr.ax(paramFloat);
  }
}