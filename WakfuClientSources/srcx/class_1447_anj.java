import org.apache.log4j.Logger;

public final class anj extends doA
{
  private static final aee aER = new bOO(new cwj());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public anj() {
    aH();
  }

  public anj azU()
  {
    anj localanj;
    try {
      localanj = (anj)aER.Mm();
      localanj.aOr = aER;
    } catch (Exception localException) {
      localanj = new anj();
      localanj.aOr = null;
      localanj.eXg = false;
      K.error("Erreur lors d'un checkOut sur un DropForEnutrofBlessing : " + localException.getMessage());
    }
    return localanj;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }

    if (this.evp == null) {
      cVD();
      return;
    }

    if (((this.ejP instanceof dMC)) && ((this.evp instanceof bqi)))
      this.cxl = ((dMC)this.ejP).dps().a((bqi)this.evp);
    else
      cVD();
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
}