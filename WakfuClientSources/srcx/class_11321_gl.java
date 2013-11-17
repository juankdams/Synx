import org.apache.log4j.Logger;

public class gl extends doA
{
  private static final aee bx = new bOO(new abD());

  private static final qM by = new dzQ(new ec[] { new dLx("Invoque la créature actuellement sélectionnée dans le symbiote", new dmb[0]), new dLx("Invoque la créature sélectionnée dans le symbiote avec controle de sa puissance", new dmb[] { new dmb("Puissance des caracs principales (hp/dmg/res)", dnN.lnR), new dmb("Puissance des caracs secondaires (init/tacle/esquive)", dnN.lnR) }) });
  private float aDP;
  private float aDQ;
  private long aDR;
  private csi aDS;
  private byte aDT = -1;
  private boolean aDU;
  public cCH aDV = new abB(this, 8);

  public cCH aDW = new abA(this);

  public qM aF()
  {
    return by;
  }

  public gl()
  {
    aH();
  }

  public gl ns()
  {
    gl localgl;
    try {
      localgl = (gl)bx.Mm();
      localgl.aOr = bx;
    } catch (Exception localException) {
      localgl = new gl();
      localgl.aOr = null;
      localgl.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SummonFromSymbiot : " + localException.getMessage());
    }
    localgl.aDU = false;
    return localgl;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.aDU) {
      K.error("Impossible d'invoquer");
      jJ(true);
      return;
    }
    if (this.evo == null)
      return;
    dhJ localdhJ = null;
    if ((this.aDS != null) && ((this.evo instanceof ajF)) && ((this.evo instanceof dhJ))) {
      ajF localajF = (ajF)this.evo;
      this.aDS.ej(this.aDR);

      if ((this.aDT != -1) && (localajF.awq() != null)) {
        csi localcsi = localajF.awq().aj(this.aDT);
        localcsi.ej(this.aDR);
      }

      K.info("Instanciation d'une nouvelle invocation avec un id de " + this.aDS.cqG());
      localdhJ = ((dhJ)localajF).b(this.aDS.cqG(), this.eUw, this.aDS.Rw(), this.aDS, false, null);
      d(localdhJ);
      localdhJ.d(eu.azc).gv(this.evo.e(eu.azI));
      localdhJ.jn(true);

      if (bkt())
        this.aDS.dF(localdhJ.cgE());
      if (localajF.awq() != null) {
        localajF.awq().d(this.aDT, false);

        if (!localajF.awq().an(this.aDT))
          localajF.awq().aam();
      }
    }
    else if ((this.evo instanceof dhJ))
    {
      localdhJ = ((dhJ)this.evo).b(this.aDS.cqG(), this.eUw, this.aDS.Rw(), this.aDS, false, null);
      d(localdhJ);
      localdhJ.d(eu.azc).gv(this.evo.e(eu.azI));
    }

    b(paramaVc, paramBoolean);
    if ((bkt()) && (((dhJ)this.evo).afv() != null))
      ((dhJ)this.evo).afv().ay(localdhJ);
  }

  private void d(dhJ paramdhJ)
  {
    deI.kYD.a(paramdhJ.cQY(), this.aDP, this.aDQ);
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();

    if (((dpI)this.eWL).bep() == 2) {
      this.aDP = (((dpI)this.eWL).a(0, s, dNF.meh) / 100.0F);
      this.aDQ = (((dpI)this.eWL).a(1, s, dNF.meh) / 100.0F);
    } else {
      this.aDP = 1.0F;
      this.aDQ = 1.0F;
    }

    this.aDR = this.ejP.LD().P((byte)1);

    NQ localNQ = ((ajF)this.evo).awq();
    if (localNQ.an(localNQ.aae())) {
      this.aDT = localNQ.aae();
      this.aDS = localNQ.aj(this.aDT);
      this.aDS.hu(true);
    } else {
      this.aDU = true;
    }
  }

  public void bc() {
    super.bc();

    this.aDP = 1.0F;
    this.aDQ = 1.0F;
  }

  public void nt()
  {
    this.aDS = null;
    super.nt();
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
    return this.aDW;
  }
}