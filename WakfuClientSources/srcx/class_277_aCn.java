import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public final class aCn extends doA
{
  private static final aee bx = new bOO(new bzr());

  private static final qM by = new dzQ(new ec[] { new dLx("Par défaut, transfère tout", new dmb[0]), new dLx("% à transférer", new dmb[] { new dmb("% à transférer", dnN.lnR) }) });
  private dSc aOF;
  private dkF dWI;
  private dkF dWJ;
  private int dWK;
  private boolean dWL;

  public qM aF()
  {
    return by;
  }

  public aCn()
  {
    aH();
  }

  public aCn(eu parameu, dkF paramdkF1, dkF paramdkF2) {
    this.aOF = parameu;
    this.dWI = paramdkF1;
    this.dWJ = paramdkF2;
    this.dWL = false;
  }

  public aCn(eu parameu, dkF paramdkF1, dkF paramdkF2, boolean paramBoolean)
  {
    this.aOF = parameu;
    this.dWI = paramdkF1;
    this.dWJ = paramdkF2;
    this.dWL = paramBoolean;
  }

  public aCn aOF()
  {
    aCn localaCn;
    try {
      localaCn = (aCn)bx.Mm();
      localaCn.aOr = bx;
    } catch (Exception localException) {
      localaCn = new aCn();
      localaCn.aOr = null;
      localaCn.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacTransferToTargets : " + localException.getMessage());
    }
    localaCn.aOF = this.aOF;
    localaCn.dWI = this.dWI;
    localaCn.dWJ = this.dWJ;
    localaCn.dWL = this.dWL;
    return localaCn;
  }

  public void a(aVc paramaVc) {
    this.dWK = 0;

    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() == 0) {
      return;
    }
    if (((dpI)this.eWL).bep() >= 1)
      this.dWK = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    cVD();
    if ((this.evo == null) || (!this.evo.b(this.aOF))) {
      return;
    }

    List localList1 = a((dpI)this.eWL, this.evo, this.ejP, this.eUw.getX(), this.eUw.getY(), this.eUw.IB());
    ArrayList localArrayList = new ArrayList();
    List localList2 = 0;
    List localList4;
    int j;
    int k;
    dle localdle;
    for (List localList3 = localList1.size(); localList2 < localList3; localList2++) {
      localList4 = (List)localList1.get(localList2);
      j = 0; for (k = localList4.size(); j < k; j++) {
        localdle = (dle)localList4.get(j);
        if ((!localArrayList.contains(localdle)) && (localdle.b(this.aOF))) {
          localArrayList.add(localdle);
        }
      }
    }
    if (localArrayList.isEmpty()) {
      return;
    }

    if (bkt()) {
      this.cxl = this.evo.e(this.aOF);
      if (this.dWK > 0) {
        this.cxl = (this.cxl * this.dWK / 100);
      }

      localList2 = this.cxl / localArrayList.size();
      localList3 = this.cxl % localArrayList.size();

      j = 0; for (k = localArrayList.size(); j < k; j++) {
        localdle = (dle)localArrayList.get(j);

        localList4 = localList2;
        int i;
        if ((localList3 > 0) && (j == localArrayList.size() - 1)) {
          localList4 += localList3;
        }
        a(localdle, i);
      }
    }

    aYO localaYO = new aYO(this.aOF);
    localaYO.d(this.dWJ.getId());
    localaYO.j(this.evo);
    localaYO.bkr();
    localaYO.kf(this.cxl);
    localaYO.u(this);
    localaYO.i(this.evo);
    localaYO.b(cHp.cBR());
    localaYO.b(this.ejP);
    localaYO.c(null, false);
  }

  private void a(dle paramdle, int paramInt) {
    doA localdoA = (doA)this.dWI.getObject();
    Object localObject;
    if ((localdoA instanceof kM)) {
      kM localkM = new kM(this.aOF);
      localObject = localkM;
      localkM.B(true);
    } else if ((localdoA instanceof dqZ)) {
      localObject = new dqZ(this.aOF);
    } else {
      K.error("Type d'effet non géré " + localdoA);
      return;
    }

    ((doA)localObject).d(this.dWI.getId());
    ((doA)localObject).j(paramdle);
    ((doA)localObject).C(this.eUw.getX(), this.eUw.getY(), this.eUw.IB());
    ((doA)localObject).bkr();
    ((doA)localObject).kf(paramInt);
    ((doA)localObject).u(this);
    ((doA)localObject).i(this.evo);
    ((doA)localObject).b(this.eWL);
    ((doA)localObject).b(this.ejP);
    ((doA)localObject).c(null, false);
  }

  public void aK() {
    if ((this.dWL) && (this.evo != null) && (this.evo.b(this.aOF)))
      this.evo.a(this.aOF).gv(this.cxl);
    super.aK();
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return false;
  }

  public boolean aN() {
    return true;
  }

  public void bc() {
    this.dWK = 0;
    this.aOF = null;
    this.dWI = null;
    this.dWJ = null;
    super.bc();
  }
}