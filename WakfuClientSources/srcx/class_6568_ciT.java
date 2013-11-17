import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class ciT extends bIL
{
  private static final aee hIl = new bOO(new Cr());

  private static final qM by = new dzQ(new ec[] { new dLx("Param standard", new dmb[] { new dmb("id de la zone heure", dnN.lnQ), new dmb("heure", dnN.lnS) }) });
  private byte aGH;

  public qM aF()
  {
    return by;
  }

  protected aee Bq()
  {
    return hIl;
  }

  public ciT ckM()
  {
    ciT localciT = (ciT)super.rn();
    localciT.aGH = 0;
    return localciT;
  }

  public void aJ() {
    super.aJ();
    this.aGH = 0;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.gIX == null) {
      localObject = bMF.bUo().fl(this.cxl);

      if (localObject != null) {
        if ((this.aGH == 0) && (this.eWL != null)) {
          s = cVC();
          this.aGH = ((byte)((dpI)this.eWL).a(1, s, dNF.mei));
        }

        short s = cVC();

        this.gIX = ((hq)localObject).a(new agg(this.aDR, this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), this.ejP, this.evo, s, this.evo.E()));
        ((hq)this.gIX).h(this.aGH);
      } else {
        K.error("EffectArea inexistante pour l'id " + this.cxl);
        jJ(true);
        return;
      }
    }

    Object localObject = new ArrayList();
    for (Iterator localIterator = this.ejP.LC().bbj().iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if ((localcjK.getType() == xj.bpk.xj()) && (localcjK.axG() == this.evo) && 
        (((hq)localcjK).po() == this.aGH))
        ((ArrayList)localObject).add(localcjK);
    }
    cjK localcjK;
    for (localIterator = ((ArrayList)localObject).iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      this.ejP.LC().h(localcjK);
    }

    if (this.gIX != null)
    {
      b(paramaVc, paramBoolean);
      this.ejP.LC().g(this.gIX);
    } else {
      jJ(true);
    }
  }

  public void a(aVc paramaVc)
  {
    super.a(paramaVc);
    this.aGH = ((byte)((dpI)this.eWL).a(1, cVC(), dNF.mei));
  }
}