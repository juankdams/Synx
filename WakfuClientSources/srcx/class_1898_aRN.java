import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class aRN extends djm
{
  private bNJ eOO;

  public void aJ()
  {
    super.aJ();
    this.eOO = new bNJ(this, null);
  }

  public void bc()
  {
    super.bc();
    this.eOO = null;
  }

  public void a(dWu paramdWu) {
    super.a(paramdWu);
    ((rb)paramdWu).a(this);
  }

  private void bdp() {
    if (this.aTk == null) {
      super.update();
      return;
    }

    rb localrb = (rb)this.aTk;
    int i = vI();

    super.bQ(i);

    eq(localrb.getAnimName());
    es(localrb.getAnimName());

    int j = localrb.xL();
    bBn localbBn = Hh.QM().dh(j);
    if (localbBn == null) {
      super.update();
      return;
    }

    if (a(localrb, localbBn)) {
      super.update();
      return;
    }

    if (f(localbBn))
      super.update();
  }

  private boolean f(bBn parambBn)
  {
    cjT localcjT = parambBn.bKe();
    for (dpI localdpI : localcjT)
      if (localdpI.eo() == bsj.fSd.getId())
      {
        int i = localdpI.a(0, (short)0, dNF.meh);
        bJC localbJC = cNO.cFX().yF(i);
        if (localbJC != null)
        {
          a(localbJC);
        }
      }
    return false;
  }

  private void a(bJC parambJC) {
    ArrayList localArrayList = parambJC.cd((short)0);
    for (dpI localdpI : localArrayList) {
      int i = ((rb)vK()).xK();
      bZA localbZA = localdpI.bew();
      if (localbZA == null)
        c(localdpI);
      else if (((localbZA instanceof cpH)) && 
        (((cpH)localbZA).xK() == i))
        c(localdpI);
    }
  }

  private void c(dpI paramdpI)
  {
    List localList = paramdpI.beB();
    for (cHP localcHP : localList)
      a(paramdpI, localcHP);
  }

  private boolean a(dpI paramdpI, cHP paramcHP)
  {
    if (paramcHP.Ds() == cVZ.kIP) {
      bZf localbZf = (bZf)paramcHP;
      dCf localdCf = new dCf(paramdpI, localbZf.cdK(), localbZf.ayf(), localbZf.cdL());
      localdCf.b(this, false);
      return true;
    }
    return false;
  }

  private boolean a(rb paramrb, bBn parambBn) {
    adx localadx = parambBn.bKr();
    if (localadx == null) {
      super.update();
      return false;
    }

    short s = ((wD)localadx).FD();
    dLB localdLB = bCc.bKN().cm(s);
    if (localdLB == null) {
      K.error("Panoplie inconnue " + s);
      super.update();
      return false;
    }

    Iterator localIterator = localdLB.iterator();
    while (localIterator.hasNext()) {
      bVw localbVw = (bVw)localIterator.next();

      ge localge = localbVw.bKn();
      int i = localge.nh()[0].bJ();
      this.eOO.a(localbVw, (short)i, paramrb.xK());
    }
    return true;
  }

  protected void a(byte paramByte, boolean paramBoolean, XV paramXV, CG paramCG) {
    c(paramCG);
  }

  public void update()
  {
    bdp();
  }

  public void bQ(int paramInt)
  {
    if (this.aTk == null) {
      super.bQ(paramInt);
      return;
    }

    bdp();
  }
}