public final class dJD
{
  public static final dJD lVl = new dJD();

  private final cSR Ul = new cSR();

  public void b(bcD parambcD)
  {
    if (this.Ul.contains(parambcD.CF())) {
      throw new IllegalArgumentException("definition déjà insérée avec l'id " + parambcD.CF());
    }

    this.Ul.put(parambcD.CF(), parambcD);
  }

  public bcD CL(int paramInt) {
    return (bcD)this.Ul.get(paramInt);
  }

  public boolean s(dGy paramdGy) {
    return this.Ul.s(paramdGy);
  }
}