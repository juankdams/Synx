import org.apache.log4j.Logger;

public class cMj extends doA
{
  private static final aee bx = new bOO(new zj());
  public static final int krx = 0;
  public static final int NORTHWEST = 1;
  public static final int NORTHEAST = 2;
  public static final int SOUTHEAST = 3;
  public static final int SOUTHWEST = 4;
  public static final int kry = 5;
  public static final int krz = 6;
  public static final int krA = 7;
  public static final int krB = 8;
  public static final int krC = 9;
  public static final int krD = 10;
  public static final int krE = 11;
  private static final qM by = new dzQ(new ec[] { new dLx("Direction/Type", new dmb[] { new dmb(" 0:cellule, 1-2-3-4:NW-NE-SE-SW, 5:rand, ,6:sameCaster, 7:invCaster, 8:turnCasterTowardTarget, 9:turnTargetTowardCaster10:perpendiculaire caster, 11:inverse target", dnN.lnS) }) });

  public qM aF()
  {
    return by;
  }

  public cMj cFo()
  {
    cMj localcMj;
    try
    {
      localcMj = (cMj)bx.Mm();
      localcMj.aOr = bx;
    } catch (Exception localException) {
      localcMj = new cMj();
      localcMj.aOr = null;
      localcMj.eXg = false;
      K.error("Erreur lors d'un newInstance sur ChangeDirection : " + localException.getMessage());
    }
    return localcMj;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp == null) {
      jJ(true);
      return;
    }

    CG localCG1 = CG.eu(this.cxl);
    if (localCG1 == CG.bFP) {
      jJ(true);
      return;
    }

    CG localCG2 = this.evp.E();

    this.evp.c(localCG1);

    if (localCG2 == localCG1)
      jJ(true);
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
    else
      this.cxl = 5;
    if (this.cxl == 5) {
      this.cxl = dpe.eL(1, 4);
    }
    if (this.evp == null) {
      this.cxl = CG.bFP.getIndex();
      return;
    }
    La localLa;
    CG localCG1;
    switch (this.cxl) {
    case 0:
      localLa = new La(this.evp.fa(), this.evp.fb(), this.evp.fc(), this.eUw.getX(), this.eUw.getY(), this.eUw.IB());

      localCG1 = localLa.Vy();
      break;
    case 2:
      localCG1 = CG.bFM;
      break;
    case 1:
      localCG1 = CG.bFK;
      break;
    case 3:
      localCG1 = CG.bFG;
      break;
    case 4:
      localCG1 = CG.bFI;
      break;
    case 6:
      localCG1 = this.evo.E();
      break;
    case 7:
      localCG1 = this.evo.E().LO();
      break;
    case 8:
      localLa = new La(this.evo.fa(), this.evo.fb(), this.evo.fc(), this.evp.fa(), this.evp.fb(), this.evp.fc());

      localCG1 = localLa.Vy();
      this.evp = this.evo;
      break;
    case 9:
      localLa = new La(this.evp.fa(), this.evp.fb(), this.evp.fc(), this.evo.fa(), this.evo.fb(), this.evo.fc());

      localCG1 = localLa.Vy();
      break;
    case 10:
      CG localCG2 = this.evo.E();
      localCG1 = CG.T(localCG2.hZ, localCG2.hY);
      break;
    case 11:
      localCG1 = this.evp.E().LO();
      break;
    case 5:
    default:
      localCG1 = CG.bFP;
    }

    if ((this.evp == null) || (this.evp.c(cfY.hBX))) {
      localCG1 = CG.bFP;
    }
    this.cxl = localCG1.getIndex();
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
    return true;
  }
}