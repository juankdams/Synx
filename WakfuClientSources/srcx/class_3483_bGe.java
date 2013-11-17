import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class bGe extends Hr
{
  private static final aee bx = new bOO(new cOL());

  private static final qM by = new dzQ(new ec[] { new dLx("Valeur de la perte de Pdv", new dmb[0]), new dLx("Valeur de la perte de Pdv", new dmb[] { new dmb("Perte de Pdv", dnN.lnR) }), new dLx("Valeur de la perte de Pdv + element", new dmb[] { new dmb("Perte de Pdv", dnN.lnR), new dmb("Element", dnN.lnS) }), new dLx("Valeur de la perte de Pdv et de l'état à appliquer", new dmb[] { new dmb("Perte de Pdv", dnN.lnR), new dmb("stateId", dnN.lnQ), new dmb("level", dnN.lnS) }) });

  private bTI cpW = bTI.heZ;

  private short aGz = 0;
  private short gCj = -1;

  public qM aF()
  {
    return by;
  }

  public bGe()
  {
    aH();
  }

  public bGe bOo()
  {
    bGe localbGe;
    try {
      localbGe = (bGe)bx.Mm();
      localbGe.aOr = bx;
    } catch (Exception localException) {
      localbGe = new bGe();
      localbGe.aOr = null;
      localbGe.eXg = false;
      K.error("Erreur lors d'un checkOut sur un BlitzkriegEffect : " + localException.getMessage());
    }
    return localbGe;
  }

  public void a(aVc paramaVc) {
    if ((this.eWL == null) || (((dpI)this.eWL).bep() == 0)) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);

    if (((dpI)this.eWL).bep() == 2) {
      this.cpW = bTI.dx((byte)((dpI)this.eWL).a(1, cVC(), dNF.meh));
    }

    if (((dpI)this.eWL).bep() == 3) {
      this.aGz = ((short)((dpI)this.eWL).a(1, cVC(), dNF.meh));
      this.gCj = ((short)((dpI)this.eWL).a(2, cVC(), dNF.meh));
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    cVD();

    if ((this.evo == null) || (this.eUw == null) || (!(this.evo instanceof dhJ))) {
      return;
    }

    cYk localcYk1 = ((dhJ)this.evo).aKb();
    CG localCG = localcYk1.aa(this.eUw);

    List localList = a(localcYk1, localCG);

    if (localList.isEmpty()) {
      cVD();
      return;
    }
    cYk localcYk2 = a(localcYk1, localCG, localList);

    if (localcYk2 == null) {
      return;
    }
    for (dle localdle : localList) {
      if (localdle.ayb()) {
        a((doA)paramaVc, localdle);
      }
    }
    a(paramaVc, localList, localcYk2);
  }

  private void a(aVc paramaVc, List paramList, cYk paramcYk) {
    try {
      brt localbrt = brt.a(this.ejP, (dpI)this.eWL, this.evo, (bqk)this.eWM, paramcYk);
      localbrt.d(bsj.fSb.getId());
      localbrt.bkz();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  private cYk a(cYk paramcYk, CG paramCG, List paramList) {
    Object localObject1 = null;
    for (Object localObject2 = paramList.iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (dle)((Iterator)localObject2).next();
      if (localObject1 == null) {
        localObject1 = localObject3;
      }
      else if (paramcYk.eC(((dle)localObject3).fa(), ((dle)localObject3).fb()) > paramcYk.eC(localObject1.fa(), localObject1.fb()))
      {
        localObject1 = localObject3;
      }
    }

    if (localObject1 == null) {
      return null;
    }
    localObject2 = new cYk(localObject1.fa(), localObject1.fb(), localObject1.fc());
    ((cYk)localObject2).k(paramCG);

    Object localObject3 = (dhJ)this.evo;
    short s = cwO.a(((dhJ)localObject3).Lk(), ((cYk)localObject2).getX(), ((cYk)localObject2).getY(), ((cYk)localObject2).IB(), (short)0);
    ((cYk)localObject2).dG(s);
    return localObject2;
  }

  private List a(cYk paramcYk, CG paramCG) {
    int i = b(paramcYk, paramCG);

    Iterator localIterator = this.ejP.LE().Lz();
    ArrayList localArrayList = new ArrayList();
    int j = paramCG.hY;
    int k = paramCG.hZ;
    while (localIterator.hasNext()) {
      dle localdle = (dle)localIterator.next();

      if (((!(localdle instanceof aTa)) || (!((aTa)localdle).Vj())) && 
        (v(localdle)))
      {
        double d1 = localdle.getWorldX() - paramcYk.getX();
        double d2 = localdle.getWorldY() - paramcYk.getY();

        if (Math.abs(d1) + Math.abs(d2) < i)
        {
          if (((d1 == j) || (d1 / Math.max(Math.abs(d1), 1.0D) == j)) && ((d2 == k) || (d2 / Math.max(Math.abs(d2), 1.0D) == k)))
          {
            localArrayList.add(localdle);
          }
        }
      }
    }
    return localArrayList;
  }

  private boolean v(dle paramdle) {
    return (paramdle.b(eu.ayM)) || (paramdle.b(eu.aAg)) || (paramdle.b(eu.azX));
  }

  private int b(cYk paramcYk, CG paramCG)
  {
    UG localUG = this.ejP.LB();
    if (localUG == null) {
      K.error("pas de fightmap sur le context " + this.ejP);
      return 0;
    }
    dhJ localdhJ = (dhJ)this.evo;
    cYk localcYk1 = new cYk(paramcYk);
    cYk localcYk2 = new cYk(paramcYk);
    short s1 = localcYk1.IB();

    localcYk1.k(paramCG);
    short s2 = cwO.a(localdhJ.Lk(), localcYk1.getX(), localcYk1.getY(), s1, (short)0);

    if (H(s1, s2)) {
      return 0;
    }
    localcYk2.ae(localcYk1);

    while ((localUG.aq(localcYk1.getX(), localcYk1.getY())) && (localUG.v(localcYk1.getX(), localcYk1.getY(), s2)))
    {
      if (!localUG.s(localcYk1.getX(), localcYk1.getY(), localcYk1.IB())) {
        localcYk2.ae(localcYk1);
      }
      s1 = s2;
      localcYk1.k(paramCG);
      s2 = cwO.a(localdhJ.Lk(), localcYk1.getX(), localcYk1.getY(), s1, (short)0);

      if (H(s1, s2)) {
        break;
      }
    }
    return paramcYk.ac(localcYk2);
  }

  private boolean H(short paramShort1, short paramShort2) {
    return Math.abs(paramShort1 - paramShort2) > 4;
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

  public bTI Cz() {
    return this.cpW;
  }

  public void bc() {
    super.bc();

    this.aGz = 0;
    this.gCj = -1;
    this.cpW = bTI.heZ;
  }

  protected boolean QT() {
    return true;
  }
}