import java.util.Collections;
import java.util.Set;
import org.apache.log4j.Logger;

public final class aPC extends doA
{
  private static final aee bx = new bOO(new bLF());

  private static final qM by = new dzQ(new ec[] { new dLx("Breed Id et Level", new dmb[] { new dmb("Breed Id", dnN.lnR), new dmb("level", dnN.lnS) }) });
  private int eMm;
  private int aQF;

  public qM aF()
  {
    return by;
  }

  public aPC()
  {
    aH();
  }

  public aPC bgw()
  {
    aPC localaPC;
    try {
      localaPC = (aPC)bx.Mm();
      localaPC.aOr = bx;
    } catch (Exception localException) {
      localaPC = new aPC();
      localaPC.aOr = null;
      localaPC.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SpawnMonster : " + localException.getMessage());
    }
    return localaPC;
  }

  public void a(aVc paramaVc)
  {
    this.eMm = -1;
    this.aQF = -1;
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() < 2) {
      return;
    }
    this.eMm = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    this.aQF = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    if (!bkt())
      return;
    if (this.eMm == -1) {
      return;
    }
    bxO localbxO = aIq().agc();
    if (localbxO == null) {
      return;
    }
    Set localSet = Collections.singleton(dKm.lXr);
    localbxO.a(this.eMm, this.aQF, this.eUw, localSet);
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public void bc()
  {
    this.eMm = -1;
    this.aQF = -1;
    super.bc();
  }
}