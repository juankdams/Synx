import org.apache.log4j.Logger;

public class bMQ extends doA
{
  private static final aee bx = new bOO(new bzq());

  private static final qM by = new dzQ(new ec[] { new dLx("Invocation d'une image", new dmb[] { new dmb("ID de la breed qui servira de base à l'image", dnN.lnR), new dmb("Niveau de l'invocation (<= 0 = niveau du controller)", dnN.lnR) }) });
  private static final short gRh = 0;
  private short aSi;
  private long aDR;
  protected Pg gRi;
  public cCH aDV = new bzk(this, 10);

  public cCH gRj = new bzn(this);

  public qM aF()
  {
    return by;
  }

  public bMQ()
  {
    aH();
  }

  public bMQ bUB()
  {
    bMQ localbMQ;
    try {
      localbMQ = (bMQ)bx.Mm();
      localbMQ.aOr = bx;
    } catch (Exception localException) {
      localbMQ = new bMQ();
      localbMQ.aOr = null;
      localbMQ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SummonImage : " + localException.getMessage());
    }
    return localbMQ;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo instanceof dhJ)) {
      K.info("Instanciation d'une nouvelle invocation avec un id de " + this.aDR);

      dhJ localdhJ1 = (dhJ)this.evo;

      dhJ localdhJ2 = localdhJ1.b(this.aDR, this.eUw, this.aSi, this.gRi, false, null);

      if (bkt()) {
        this.gRi.dF(localdhJ2.cgE());
      }
      b(paramaVc, paramBoolean);
      if ((bkt()) && (((dhJ)this.evo).afv() != null)) {
        ((dhJ)this.evo).afv().ay(localdhJ2);
      }

      localdhJ2.a(cfY.hCg);
      localdhJ2.a(cfY.hBr);
    }
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    dhJ localdhJ = (dhJ)this.evo;
    short s = cVC();

    this.aSi = ((short)((dpI)this.eWL).a(0, s, dNF.meh));
    this.cxl = ((dpI)this.eWL).a(1, s, dNF.meh);
    if (this.cxl <= 0) {
      this.cxl = localdhJ.nU();
    }
    this.aDR = this.ejP.LD().P((byte)1);

    dCi localdCi1 = localdhJ.auK();
    dCi localdCi2 = new dCi((short)0, localdCi1.ajw(), localdCi1.ajz(), false, false, false);

    this.gRi = Pg.abf().b(localdhJ.aJp().uO(), localdhJ.getName() + " clone", localdhJ.e(eu.ayM), (short)this.cxl, localdhJ, localdCi2);
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public cCH nu()
  {
    return this.aDV;
  }

  public cCH lJ()
  {
    return this.gRj;
  }
}