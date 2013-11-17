public class WX
{
  private final ccR cGU;

  public WX(ccR paramccR)
  {
    this.cGU = paramccR;
  }

  public bky a(dVO paramdVO, int paramInt)
  {
    Object localObject = null;
    switch (sq.baz[dWm.Em(paramdVO.type).ordinal()])
    {
    case 1:
      if (a.a(paramInt, a.a)) {
        jJ localjJ = ((dWz)paramdVO.mvb.h(dWz.class)).bOF;
        localObject = new bWt(this.cGU, localjJ, this.cGU.c(localjJ));
      }break;
    case 2:
      if (a.a(paramInt, a.w))
        localObject = new bun(this.cGU, ((CI)paramdVO.mvb.h(CI.class)).bGN); break;
    case 3:
      if (a.a(paramInt, a.z))
        localObject = new aIs(this.cGU, ((bcE)paramdVO.mvb.h(bcE.class)).fmP); break;
    case 4:
      if (a.a(paramInt, a.A))
        localObject = new aGZ(this.cGU, ((dFA)paramdVO.mvb.h(dFA.class)).lPG); break;
    case 5:
      if (a.a(paramInt, a.B))
        localObject = new der(this.cGU, ((af)paramdVO.mvb.h(af.class)).bK); break;
    case 6:
      if (a.a(paramInt, a.C))
        localObject = new aAt(this.cGU); break;
    case 7:
      if (a.a(paramInt, a.D)) {
        localObject = new bel(this.cGU, ((dgX)paramdVO.mvb.h(dgX.class)).lcf);
      }
      break;
    }
    return localObject;
  }
}