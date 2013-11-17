public class cUK
  implements bwK
{
  private static final String kHu = "Money";
  private final bOi kHv;

  public cUK(bOi parambOi)
  {
    this.kHv = parambOi;
  }

  public bcx mu() {
    cVe localcVe = new cVe("Money");

    bcx localbcx = new bcx();
    localbcx.a(localcVe);

    return localbcx;
  }

  public bOi cJR() {
    return this.kHv;
  }

  public String toString()
  {
    return "Money{}";
  }
}