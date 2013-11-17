public class doI
{
  public static cdI j(bBn parambBn)
  {
    return new cdI(parambBn);
  }

  public static cdI a(bBn parambBn, cdI paramcdI) {
    return new cdI(parambBn, paramcdI);
  }

  public static cdI a(bBn parambBn, bQo parambQo) {
    return a(parambBn, parambQo, true);
  }

  public static cdI a(bBn parambBn, bQo parambQo, boolean paramBoolean) {
    abb localabb = paramBoolean ? new cdI(parambBn) : new abb(parambBn);
    localabb.b(parambQo);
    return localabb;
  }
}