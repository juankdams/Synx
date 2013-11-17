import java.util.BitSet;
import org.apache.log4j.Logger;

public class cEt extends doA
{
  private static final aee bx = new bOO(new bBe());

  private static final qM by = new dzQ(new ec[] { new dLx("Attaque si Cac, avec l'arme en cours(main droite)", new dmb[0]), new dLx("Attaque si Cac, avec l'arme spécifiée", new dmb[] { new dmb("id de position de l'équipement", dnN.lnQ) }) });

  private byte iye = -1;

  public qM aF()
  {
    return by;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(186);
  }

  public cEt cAa()
  {
    cEt localcEt;
    try
    {
      localcEt = (cEt)bx.Mm();
      localcEt.aOr = bx;
    } catch (Exception localException) {
      localcEt = new cEt();
      localcEt.aOr = null;
      localcEt.eXg = false;
      K.error("Erreur lors d'un checkOut sur un WeaponAttack : " + localException.getMessage());
    }
    return localcEt;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp == null)
      return;
    Object localObject;
    if (((this.evp instanceof dhJ)) && (paramBoolean) && (paramaVc != null) && (paramaVc.bke() != null) && (paramaVc.bke() != this.evp)) {
      localObject = paramaVc.bke();
      ((dhJ)this.evp).a(this.iye, new cYk(((dle)localObject).fa(), ((dle)localObject).fb(), ((dle)localObject).fc()), false, null);
    } else {
      localObject = null;
      if ((wa() instanceof bfE)) {
        localObject = (bfE)wa();
      }

      if (this.evp != null)
        ((dhJ)this.evo).a(this.iye, new cYk(this.evp.fa(), this.evp.fb(), this.evp.fc()), false, (bfE)localObject);
      else
        ((dhJ)this.evo).a(this.iye, bkg(), false, (bfE)localObject);
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if ((this.eWL != null) && (((dpI)this.eWL).bep() > 0))
      this.iye = ((byte)((dpI)this.eWL).a(0, s, dNF.mei));
    else
      this.iye = azO.dRM.bJ();
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