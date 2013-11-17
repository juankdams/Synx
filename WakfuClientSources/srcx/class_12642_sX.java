import com.ankamagames.wakfu.client.console.command.debug.DisplayStatesCommand;

public class sX
  implements nc
{
  private final akR bcJ = new akR();
  private long bcK = 0L;
  private long bcL = 1L;

  private static dGy bcM = new ciu();

  private static dGy bcN = new ciw();

  public brO a(aVc paramaVc, int paramInt)
  {
    if (paramaVc == null) {
      return null;
    }
    Object localObject1 = paramaVc.wa();
    if (paramaVc.getId() == bsj.fSj.getId())
      localObject1 = ((bPD)paramaVc).bWk();
    else if (paramaVc.getId() == bsj.fSH.getId())
      localObject1 = ((bIL)paramaVc).bQj();
    else if (paramaVc.getId() == bsj.fSX.getId())
      localObject1 = ((bIL)paramaVc).bQj();
    else if ((paramaVc.getId() == bsj.fSn.getId()) || (paramaVc.getId() == bsj.fSG.getId()))
      return null;
    if (localObject1 == null) {
      return null;
    }
    if ((localObject1 instanceof apX)) {
      localObject2 = (dSR)((apX)localObject1).bsL();
      if ((localObject2 == null) || ((!((dSR)localObject2).cdl()) && (!DisplayStatesCommand.aIv())))
        return null;
    }
    Object localObject2 = g(paramaVc);
    if (localObject2 != null) {
      boolean bool = (paramaVc.bkc() == null) || (((dpI)paramaVc.bkc()).zQ());
      ((brO)localObject2).e(paramaVc, bool);
      if (paramInt != -1)
        ((brO)localObject2).qC(paramInt);
    }
    return (localObject2 == null) || (((brO)localObject2).bdo() == 0) ? null : localObject2;
  }

  private brO g(aVc paramaVc) {
    Ce localCe = paramaVc.wa();
    if (localCe == null)
      return null;
    long l = localCe.nT();

    if ((localCe.nS() == 19) || (localCe.nS() == 33)) {
      if (this.bcK != 0L)
        l = this.bcK;
      else {
        this.bcK = l;
      }
    }

    apU localapU = new apU(localCe.nS(), l);
    brO localbrO = (brO)this.bcJ.get(localapU);
    if (localbrO == null) {
      localbrO = brO.d(localCe);
      this.bcJ.put(localapU, localbrO);
    } else {
      localbrO.e(localCe);
    }

    return localbrO;
  }

  public void h(aVc paramaVc)
  {
    if (paramaVc == null)
      return;
    Object localObject = paramaVc.wa();
    if (paramaVc.getId() == bsj.fSj.getId())
      localObject = ((bPD)paramaVc).bWk();
    if (localObject == null) {
      return;
    }
    long l = ((Ce)localObject).nT();
    if (((((Ce)localObject).nS() == 19) || (((Ce)localObject).nS() == 33)) && 
      (this.bcK != 0L)) {
      l = this.bcK;
    }

    if (((Ce)localObject).nS() == 28) {
      l = this.bcL;
    }
    brO localbrO = (brO)this.bcJ.get(Long.valueOf(l));
    if (localbrO != null) {
      localbrO.f((Ce)localObject);
      if (!localbrO.bzW()) {
        this.bcJ.remove(Long.valueOf(l));
        localbrO.release();
        if ((((Ce)localObject).nS() == 19) || (((Ce)localObject).nS() == 33))
        {
          this.bcK = 0L;
        }
      }
    }
  }

  public void a(Ce paramCe)
  {
    brO localbrO = (brO)this.bcJ.remove(Long.valueOf(paramCe.nT()));
    if (localbrO != null)
      localbrO.release();
  }

  public void AC()
  {
    this.bcJ.s(bcM);
  }

  public void clear() {
    this.bcK = 0L;
    this.bcJ.s(bcN);
    this.bcJ.clear();
  }

  public void uD() {
    AC();
  }
}