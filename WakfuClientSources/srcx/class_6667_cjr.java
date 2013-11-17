class cjr extends cMf
{
  private cjr(csn paramcsn)
  {
    super(paramcsn, null);
  }
  protected void a(Su paramSu, cYk paramcYk, dpI paramdpI, short paramShort, Ce paramCe) {
    CG localCG = new La(paramSu.ML(), paramcYk).Vy();
    Iterable localIterable = b(paramdpI, (bqk)paramCe).b(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramSu.fa(), paramSu.fb(), paramSu.fc(), localCG);

    cYk localcYk = new cYk();
    UG localUG = paramSu.aeQ().LB();
    for (int[] arrayOfInt : localIterable) {
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];
      localcYk.ac(i, j, paramcYk.IB());
      if (localUG.aq(i, j))
        csn.a(this.hIM, paramCe, paramSu, localcYk, paramShort);
    }
  }
}