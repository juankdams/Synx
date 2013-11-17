import java.util.ArrayList;

class bYB
  implements dGy
{
  bYB(cYC paramcYC)
  {
  }

  public boolean a(bhZ parambhZ)
  {
    ArrayList localArrayList = parambhZ.cwY;
    for (dBv localdBv : localArrayList)
    {
      Object localObject1;
      Object localObject2;
      if ((localdBv instanceof aXZ)) {
        localObject1 = new ctA(this.hox.kMc);
        localObject2 = (aXZ)localdBv;
        int i = ((aXZ)localObject2).bns();
        ((aXZ)localObject2).gf(((bjn)localObject1).h(new bFA(0L, i, 0, (short)-32768, (short)-32768)));
        ((aXZ)localObject2).a((bjn)localObject1);
      }
      else if (!(localdBv instanceof bIT))
      {
        if ((localdBv instanceof mV)) {
          localObject1 = (mV)localdBv;
          localObject2 = (cDs)((mV)localObject1).bqR();

          cKg localcKg = bZv.cdR().tZ();
          int j = e(localcKg);
          int k = mw.a(this.hox.kLZ, ((cDs)localObject2).bqQ()) ? 0 : j >= 20 ? 1 : 0;

          boolean bool = this.hox.kMc.rW(((cDs)localObject2).ahA());
          ((mV)localObject1).gf((bool) && (k == 0));
        }
      }
    }
    return true;
  }

  private int e(cKg paramcKg) {
    if (paramcKg == null) {
      return 0;
    }
    TY localTY = new TY();
    paramcKg.p(new cmi(this, localTY));

    for (ju localju : mw.a(this.hox.kLZ)) {
      a(localTY, localju, paramcKg);
    }

    return localTY.getValue();
  }

  private void a(TY paramTY, ju paramju, cKg paramcKg) {
    dDO localdDO = paramju.rj();
    Object localObject;
    bcQ localbcQ;
    short s;
    if ((localdDO instanceof ie)) {
      localObject = (ie)localdDO;
      localbcQ = (bcQ)((ie)localObject).Qw();
      s = ((ie)localObject).pQ();
      if ((mw.a(this.hox.kLZ, localbcQ.bqQ())) && (!mw.a(this.hox.kLZ, s)))
        paramTY.ahr();
      else if ((!mw.a(this.hox.kLZ, localbcQ.bqQ())) && (mw.a(this.hox.kLZ, s)))
        paramTY.gO(-1);
    }
    else if ((localdDO instanceof hS)) {
      localObject = (hS)localdDO;
      localbcQ = (bcQ)((hS)localObject).Qw();
      s = localbcQ.bqQ();
      if (mw.a(this.hox.kLZ, s))
        paramTY.gO(-1);
    }
  }
}