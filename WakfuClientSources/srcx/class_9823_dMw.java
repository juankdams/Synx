final class dMw
  implements cSv
{
  private final cLO mcA;

  dMw(cLO paramcLO)
  {
    this.mcA = paramcLO;
  }

  public final boolean a(byte paramByte, float paramFloat) {
    int i = this.mcA.j(paramByte);
    if ((i >= 0) && (v(paramFloat, this.mcA.ew(paramByte)))) {
      return true;
    }
    return false;
  }

  private final boolean v(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 == paramFloat2;
  }
}