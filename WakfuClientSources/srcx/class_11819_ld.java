import org.apache.log4j.Logger;

public class ld extends cbv
{
  private cQn aOZ;
  private int aPa;

  public boolean og()
  {
    return false;
  }

  public boolean a(Qv paramQv) {
    throw new UnsupportedOperationException("Un item d'inventaire de protecteur ne doit pas être sérialisé par le client");
  }

  public boolean b(Qv paramQv)
  {
    this.aUe = new gA();
    if (!this.aUe.b(paramQv.cpq)) {
      return false;
    }
    ed(paramQv.cps);
    bCe localbCe = bCe.co(paramQv.cpr);
    if (localbCe != null) {
      b(localbCe);
      return true;
    }
    K.error("Impossible de trouver le pack à " + paramQv.cpr + " items");
    return false;
  }

  public cQn sC()
  {
    return this.aOZ;
  }

  public void a(cQn paramcQn) {
    this.aOZ = paramcQn;
  }

  public int sD() {
    return this.aPa;
  }

  public void bm(int paramInt) {
    this.aPa = paramInt;
  }

  public void a(short paramShort)
  {
  }

  public bYT sE()
  {
    switch (cdC.hxp[this.aOZ.ordinal()]) {
    case 1:
      return new cod(this, this.aPa);
    case 2:
      return new QA(this, this.aPa);
    case 3:
      return new OR(this, this.aPa);
    }
    return null;
  }

  public void aJ()
  {
    super.aJ();
    this.aOZ = null;
    this.aPa = 0;
  }
}