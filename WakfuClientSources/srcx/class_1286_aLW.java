import com.ankamagames.framework.graphics.engine.entity.Entity;

public class aLW extends djm
{
  private cew eqP;

  public void bc()
  {
    super.bc();

    if (this.eqP != null) {
      bQK.bXG().g(this.eqP);
      this.eqP = null;
    }
  }

  private void bdp() {
    bPF localbPF = (bPF)this.aTk;
    dPl localdPl = localbPF.yJ();

    if (this.eqP != null) {
      bQK.bXG().g(this.eqP);
      this.eqP = null;
    }

    if (localdPl == null) {
      return;
    }

    boD localboD = new boD(localdPl);
    localboD.byn();
    localboD.c(this.aTk.E());

    cew localcew = localboD.aeL();

    localcew.c(this.aTk.E());
    localcew.k(((cMb)this.aTk).getWorldX(), ((cMb)this.aTk).getWorldY(), ((cMb)this.aTk).getAltitude());

    ass localass = localbPF.bXi();
    String str = localass.getAnimName();
    PX localPX = localass.aEK();
    localcew.eq(str);
    localcew.es(str);
    for (jR localjR = localPX.abM(); localjR.hasNext(); ) {
      localjR.fl();
      localcew.a(localjR.value(), (short)localjR.rC(), true);
    }
    localcew.getEntity().mnT |= 2;

    this.eqP = localcew;
    bQK.bXG().d(this.eqP);
  }

  public void update()
  {
    bdp();
  }

  public void bQ(int paramInt)
  {
    if (this.aTk == null) {
      return;
    }

    bPF localbPF = (bPF)this.aTk;
    dPl localdPl = localbPF.yJ();

    if (localdPl == null) {
      super.bQ(paramInt);
      return;
    }

    bdp();
  }
}