import java.util.BitSet;
import org.apache.log4j.Logger;

public final class cXv extends doA
{
  private static final aee bx = new bOO(new Ef());

  private static final qM by = new dzQ(new ec[] { new dLx("Dégats/case de deplacement ", new dmb[] { new dmb("Dmg/case", dnN.lnS), new dmb("Element", dnN.lnS) }), new dLx("Dégats/case de deplacement ", new dmb[] { new dmb("Dmg/case", dnN.lnS), new dmb("Element", dnN.lnS), new dmb("Max de cases", dnN.lnS) }) });
  private bTI cpW;

  public qM aF()
  {
    return by;
  }

  public cXv() {
    aH();
  }

  public cXv cLj()
  {
    cXv localcXv;
    try {
      localcXv = (cXv)bx.Mm();
      localcXv.aOr = bx;
    } catch (Exception localException) {
      localcXv = new cXv();
      localcXv.aOr = null;
      localcXv.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossAfterMovement : " + localException.getMessage());
    }
    return localcXv;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = 0;

    doA localdoA = paramaVc != null ? paramaVc : ((dji)bkh()).cRV();
    if (localdoA == null) {
      K.error("Cet effet ne peut etre utilisé que dans le cadre d'un declenchement");
      return;
    }
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() > 3) {
      K.error("Pas le bon nombre de param");
      return;
    }

    int i = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    int j = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    int k = 2147483647;
    if (((dpI)this.eWL).bep() == 3) {
      k = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
    }

    this.cpW = bTI.dx((byte)j);
    cYk localcYk1 = null;
    cYk localcYk2 = null;
    Object localObject;
    if ((localdoA instanceof avO)) {
      localObject = (avO)localdoA;
      localcYk1 = ((avO)localObject).oO();
      localcYk2 = ((avO)localObject).qR();
    }
    else
    {
      dle localdle;
      if ((localdoA instanceof ez)) {
        localObject = (ez)localdoA;
        localdle = ((ez)localObject).bke();
        if (localdle == null) {
          return;
        }
        if ((localdle.fa() == ((ez)localObject).lK()) && (localdle.getWorldY() == ((ez)localObject).lL()))
        {
          return;
        }

        localcYk1 = new cYk(((ez)localObject).lK(), ((ez)localObject).lL(), ((ez)localObject).lM());
        localcYk2 = new cYk(((ez)localObject).lN(), ((ez)localObject).lO(), ((ez)localObject).lP());
      } else if ((localdoA instanceof gE)) {
        localObject = (gE)localdoA;
        localcYk1 = ((gE)localObject).oO();
        localdle = ((gE)localObject).gs();
        if (localdle != null)
          localcYk2 = new cYk(localdle.fa(), localdle.fb(), localdle.fc());
      }
      else if (U(localdoA)) {
        localcYk1 = localdoA.bke().ML();
        localObject = localdoA.bkf();
        if (localObject != null)
          localcYk2 = new cYk(((dle)localObject).fa(), ((dle)localObject).fb(), ((dle)localObject).fc());
      }
    }
    if ((localcYk1 == null) || (localcYk2 == null)) {
      return;
    }

    int m = localcYk1.ac(localcYk2);
    m = Math.min(m, k);
    this.cxl = (i * m);
  }

  private boolean U(aVc paramaVc) {
    return paramaVc.DV().get(2158);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    if (this.cxl == 0) {
      cVD();
      return;
    }
    b(paramaVc, paramBoolean);
    bFw localbFw = bFw.a(this.ejP, this.cpW, dnO.lnU, this.cxl, this.evp);
    localbFw.i(this.evo);
    localbFw.bkr();
    localbFw.b(bdH.brN());
    localbFw.ct((byte)1);
    localbFw.bNp();
    localbFw.ct((byte)2);
    localbFw.c(null, false);
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    this.cpW = null;
    super.bc();
  }
}