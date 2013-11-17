import org.apache.log4j.Logger;

abstract class apM extends doA
{
  protected long aDR;
  protected csi dwn;
  private EU dwo;
  private static final qM dwp = new dzQ(new ec[] { new dLx("Params", new dmb[0]), new dLx("Avec Ratio de puissance", new dmb[] { new dmb("Ratio", dnN.lnS) }) });

  public cCH aDV = new drj(this, 8);

  public cCH dwq = new agr(this);

  public qM aF()
  {
    return dwp;
  }

  protected apM() {
    aH();
  }

  public void bc()
  {
    this.dwo = null;
    this.dwn = null;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!(this.evo instanceof dhJ)) {
      cVD();
      return;
    }

    K.info("Instanciation d'une nouvelle invocation avec un id de " + this.aDR);

    EU localEU = aBJ();
    dhJ localdhJ1 = aBG();
    dhJ localdhJ2 = localdhJ1.b(this.aDR, aBI(), localEU.uO(), this.dwn, localEU.Oo(), null);

    if (bkt()) {
      this.dwn.dF(localdhJ2.cgE());
    }

    b(paramaVc, paramBoolean);

    if ((bkt()) && (localdhJ1.afv() != null))
      localdhJ1.afv().ay(localdhJ2);
  }

  public void a(aVc paramaVc)
  {
    this.aDR = this.ejP.LD().P((byte)1);

    dhJ localdhJ = aBH();
    EU localEU = aBJ();

    bhI localbhI = localEU.Or();
    dCi localdCi = localbhI.a(localdhJ, localEU, cVC());

    this.dwn = localEU.Oq().b(localdhJ.aJp().uO(), localdhJ.getName() + " clone", localdhJ.e(eu.ayM), localdhJ.nU(), localdhJ, aBF(), localdCi);
  }

  public cCH nu()
  {
    return this.aDV;
  }

  public cCH lJ()
  {
    return this.dwq;
  }

  protected void aBE()
  {
    dhJ localdhJ = (dhJ)bke();

    if (localdhJ.auK() == null)
      this.dwn = aBJ().Oq().age();
    else
      this.dwn = aBJ().Oq().b((short)100, localdhJ.auK().ajw(), localdhJ.auK().ajz(), false, false, false);
  }

  protected final int aBF()
  {
    short s = cVC();
    if ((this.eWL != null) && (((dpI)this.eWL).bep() > 0)) {
      return ((dpI)this.eWL).a(0, s, dNF.meh);
    }
    return 100;
  }

  protected final dhJ aBG() {
    if ((this.evo instanceof dhJ)) {
      return (dhJ)this.evo;
    }
    return null;
  }

  protected dhJ aBH()
  {
    dle localdle = aBJ().On() ? this.evo : this.evp;

    if ((localdle instanceof dhJ)) {
      return (dhJ)localdle;
    }
    return null;
  }

  protected cYk aBI() {
    return this.eUw;
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aN()
  {
    return true;
  }

  public boolean aM()
  {
    return false;
  }

  protected EU aBJ()
  {
    if (this.dwo != null) {
      return this.dwo;
    }
    this.dwo = VP();
    return this.dwo;
  }

  protected abstract EU VP();
}