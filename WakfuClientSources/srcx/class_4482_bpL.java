public class bpL
  implements biz
{
  public static bpL fKb = new bpL();

  private final aoL fKc = new aoL();
  private final bKR fKd = new bKR();
  private final cSR fKe = new cSR();

  public void b(dWf paramdWf)
  {
    this.fKc.put(paramdWf.getId(), paramdWf);
    this.fKd.add(paramdWf.getId());
  }

  public void a(int paramInt, dWf paramdWf) {
    this.fKc.put(paramdWf.getId(), paramdWf);
    bKR localbKR = (bKR)this.fKe.get(paramInt);
    if (localbKR == null)
      this.fKe.put(paramInt, localbKR = new bKR());
    localbKR.add(paramdWf.getId());
  }

  public void n(aYr paramaYr) {
    cWY localcWY = paramaYr.bnz();
    for (Object localObject = this.fKd.bTc(); ((bKT)localObject).hasNext(); ) {
      localcWY.c((dWf)this.fKc.get(((bKT)localObject).bTd()));
    }
    localObject = (bKR)this.fKe.get(paramaYr.bP());
    if (localObject == null) {
      return;
    }
    for (bKT localbKT = ((bKR)localObject).bTc(); localbKT.hasNext(); )
      localcWY.c((dWf)this.fKc.get(localbKT.bTd()));
  }
}