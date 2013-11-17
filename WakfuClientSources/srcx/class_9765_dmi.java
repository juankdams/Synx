public class dmi
  implements dVX
{
  private final dhJ ljX;

  public dmi(dhJ paramdhJ)
  {
    this.ljX = paramdhJ;
  }

  public boolean v(gA paramgA) {
    if (paramgA.or()) {
      return false;
    }
    bZA localbZA = paramgA.oi().a(Aq.bvV);
    boolean bool = paramgA.ol().nl();
    int i = (localbZA == null) || (localbZA.i(this.ljX, null, null, this.ljX.bGq())) ? 1 : 0;

    return (bool) && (i != 0);
  }
}