import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class Gh extends doA
{
  private static final aee bx = new bOO(new bbV());

  private static final qM by = new dzQ(new ec[] { new dLx("Valeur de la perte de Pdv", new dmb[] { new dmb("Valeur perte de PdV", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public Gh() {
    aH();
  }

  public Gh Qm()
  {
    Gh localGh;
    try {
      localGh = (Gh)bx.Mm();
      localGh.aOr = bx;
    } catch (Exception localException) {
      localGh = new Gh();
      localGh.aOr = null;
      localGh.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossAndPuppetHeal : " + localException.getMessage());
    }
    return localGh;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() >= 1)
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.mei);
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    jJ(true);

    if (this.evp == null) {
      return;
    }
    bTI localbTI = Cz();
    if (localbTI == null)
      localbTI = cVJ();
    bFw localbFw = bFw.a(this.ejP, localbTI, dnO.lnU, this.cxl, this.evp);
    localbFw.b(dzg.dcV());
    localbFw.i(this.evo);
    localbFw.c(localbFw.bNo(), (this.eWL != null) && (((dpI)this.eWL).cL(1L)), (this.eWL != null) && (((dpI)this.eWL).zi()));

    int i = Math.min(this.evp.e(eu.ayM), localbFw.getValue());
    localbFw.bkz();

    List localList = Qn();
    if (localList.isEmpty())
      return;
    int j = i / localList.size();
    for (dle localdle : localList) {
      aWl localaWl = aWl.c(this.ejP, localbTI);
      localaWl.j(localdle);
      localaWl.kf(j);
      localaWl.u(this);
      localaWl.i(this.evo);
      localaWl.b(bkc());
      localaWl.bkz();
    }
  }

  private List Qn()
  {
    Iterator localIterator = this.ejP.LE().Lz();
    ArrayList localArrayList = new ArrayList();
    while (localIterator.hasNext()) {
      dle localdle = (dle)localIterator.next();
      if ((localdle.c(cfY.hBQ)) && 
        ((localdle instanceof dhJ)))
      {
        dhJ localdhJ = (dhJ)localdle;
        if (localdhJ.afw() == this.evo)
        {
          localArrayList.add(localdle);
        }
      }
    }
    return localArrayList;
  }

  public boolean aL() {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }
}