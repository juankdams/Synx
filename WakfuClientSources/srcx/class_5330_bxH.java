import java.util.ArrayList;

public class bxH extends dsl
{
  private final dPx giO = new dPx();

  public bxH(aid paramaid, ccY paramccY, zt paramzt)
  {
    bmt[] arrayOfbmt = bmt.values();
    for (int i = 0; i < arrayOfbmt.length; i++) {
      bmt localbmt = arrayOfbmt[i];
      if ((paramzt == null) || (paramzt.a(paramaid, localbmt)))
      {
        aZS localaZS = (aZS)paramccY.gy();
        localaZS.o(paramaid);
        this.giO.c(localbmt.bUy, localaZS);
      }
    }
  }

  public boolean b(bmt parambmt) { return this.giO.contains(parambmt.bUy); }

  public int c(bmt parambmt)
  {
    aZS localaZS = (aZS)this.giO.bf(parambmt.bUy);
    return localaZS == null ? 0 : localaZS.fO().bDx();
  }

  public boolean a(bmt parambmt, int paramInt) {
    aZS localaZS = (aZS)this.giO.bf(parambmt.bUy);
    return (localaZS != null) && (localaZS.fO().BC(paramInt));
  }

  public boolean b(bmt parambmt, int paramInt) {
    aZS localaZS = (aZS)this.giO.bf(parambmt.bUy);
    return (localaZS != null) && (localaZS.fO().Bj(paramInt));
  }

  public boolean c(bmt parambmt, int paramInt) {
    aZS localaZS = (aZS)this.giO.bf(parambmt.bUy);
    return (localaZS != null) && (localaZS.fO().BD(paramInt));
  }

  public void reset(int paramInt) {
    bmt[] arrayOfbmt = bmt.values();
    for (int i = 0; i < arrayOfbmt.length; i++)
      a(arrayOfbmt[i], 0);
    BC(paramInt);
  }

  public aZS d(bmt parambmt) {
    return (aZS)this.giO.bf(parambmt.bUy);
  }

  public void a(cvs paramcvs) {
    paramcvs.igo = bDx();
    for (aJp localaJp = this.giO.dqF(); localaJp.hasNext(); ) {
      localaJp.fl();
      cwA localcwA = new cwA();
      localcwA.iiP = localaJp.rC();
      localcwA.igo = ((aZS)localaJp.value()).fO().bDx();
      paramcvs.igp.add(localcwA);
    }
  }

  public void b(cvs paramcvs) {
    for (int i = 0; i < paramcvs.igp.size(); i++) {
      cwA localcwA = (cwA)paramcvs.igp.get(i);
      bmt localbmt = bmt.cW(localcwA.iiP);
      a(localbmt, localcwA.igo);
    }
    BC(paramcvs.igo);
  }
}