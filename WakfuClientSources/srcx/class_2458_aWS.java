import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class aWS extends aVk
{
  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[] { new dmb("nb de rolls", dnN.lnR), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS) }), new dLx("Vérifie le critere sur les cellules de la zone (pas sur l'effet de base)", new dmb[] { new dmb("nb de rolls", dnN.lnR), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", dnN.lnS) }), new dLx("Utilise la direction vers la cellule cible", new dmb[] { new dmb("nb de rolls", dnN.lnR), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", dnN.lnS), new dmb("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", dnN.lnS) }), new dLx("Calcul la zone avec la cellule du caster en cellule cible", new dmb[] { new dmb("nb de rolls", dnN.lnR), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", dnN.lnS), new dmb("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", dnN.lnS), new dmb("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", dnN.lnS) }), new dLx("Retrait des cellules deja utilisées", new dmb[] { new dmb("nb de rolls", dnN.lnR), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("Critere sur zone = 1, critere sur effet de base = 0 (defaut)", dnN.lnS), new dmb("Utilise la direction vers la cible (1 = oui) (pas la direction du caster)", dnN.lnS), new dmb("Calcul la zone avec la cellule du caster en cellule cible (1=oui)", dnN.lnS), new dmb("Retire de la liste les cellules déjà ciblées (1=oui)", dnN.lnS) }) });

  private static final aee bx = new bOO(new cvB());
  private boolean fcj;
  private boolean fck;
  private boolean fcl;
  private boolean fcm;

  public aWS()
  {
    aH();
  }

  public qM aF()
  {
    return by;
  }

  public aVk xD()
  {
    aWS localaWS;
    try {
      localaWS = (aWS)bx.Mm();
      localaWS.aOr = bx;
    } catch (Exception localException) {
      localaWS = new aWS();
      localaWS.aOr = null;
      localaWS.eXg = false;
      K.error("Erreur lors d'un checkOut sur un EffectRandomInArea : " + localException.getMessage());
    }
    a(localaWS);
    return localaWS;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    if (this.eWL == null) {
      K.error("Pas de genericEffect, ça ne devrait pas arriver");
      cVD();
      return;
    }
    UG localUG = this.ejP.LB();
    if (localUG == null) {
      K.error("pas de fightmap sur le context " + this.ejP);
      return;
    }

    List localList = bmu();
    if (localList.isEmpty()) {
      cVD();
      return;
    }

    dji localdji = dji.a(false, false, (doA)paramaVc);
    if ((a(PY.coL)) && (localdji.cRW() == -1)) {
      localdji.Ao(cVC());
    }
    for (int i = 0; i < this.eXw; i++) {
      int j = localList.size();
      int k = bCO.sf(j);
      int[] arrayOfInt = (int[])localList.get(k);

      for (dpI localdpI : this.mkv) {
        short s = localUG.aw(arrayOfInt[0], arrayOfInt[1]);
        localdpI.a(wa(), this.evo, this.ejP, bsj.bAv(), arrayOfInt[0], arrayOfInt[1], s, null, localdji);
      }

      if (this.fcm)
        localList.remove(k);
    }
  }

  private List bmu() {
    UG localUG = this.ejP.LB();

    if (localUG == null) {
      return Collections.emptyList();
    }
    if (bmy()) {
      return f(localUG);
    }
    CG localCG = bmx();
    cYk localcYk1 = bmw();
    cYk localcYk2 = bmv();

    Iterable localIterable = ((dpI)this.eWL).aui().b(localcYk1.getX(), localcYk1.getY(), localcYk1.IB(), localcYk2.getX(), localcYk2.getY(), localcYk2.IB(), localCG);
    ArrayList localArrayList = new ArrayList();
    bZA localbZA = ((dpI)this.eWL).bew();
    cYk localcYk3 = new cYk();
    for (int[] arrayOfInt : localIterable) {
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];

      if ((localUG.p(i, j)) && 
        (localUG.aq(i, j)))
      {
        short s = localUG.aw(i, j);
        if (s != -32768)
        {
          if ((this.fcj) && (localbZA != null)) {
            localcYk3.ac(i, j, s);
            if (!localbZA.i(this.evo, localcYk3, this, this.ejP));
          }
          else
          {
            localArrayList.add(arrayOfInt);
          }
        }
      }
    }
    return localArrayList;
  }

  private List f(UG paramUG) {
    List localList = paramUG.ahX();
    bZA localbZA = ((dpI)this.eWL).bew();
    if ((!this.fcj) || (localbZA == null)) {
      return localList;
    }
    cYk localcYk = new cYk();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext()) {
      int[] arrayOfInt = (int[])localIterator.next();
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];

      short s = paramUG.aw(i, j);
      if (s != -32768)
      {
        localcYk.ac(i, j, s);
        if (!localbZA.i(this.evo, localcYk, this, this.ejP))
          localIterator.remove(); 
      }
    }
    return localList;
  }

  private cYk bmv() {
    if (this.evo != null)
      return this.evo.ML();
    return this.eUw;
  }

  private cYk bmw() {
    if (this.fcl)
      return this.evo.ML();
    return this.eUw;
  }

  private CG bmx() {
    if (this.evo == null)
      return CG.bFM;
    if (this.fck) {
      return this.evo.ML().aa(this.eUw);
    }
    return this.evo.E();
  }

  boolean D(aVc paramaVc)
  {
    if ((((dpI)this.eWL).bep() >= 3) && (((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1))
      return true;
    return super.D(paramaVc);
  }

  public void a(aVc paramaVc)
  {
    super.a(paramaVc);
    this.fcj = false;
    if (((dpI)this.eWL).bep() >= 3)
      this.fcj = (((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() >= 4)
      this.fck = (((dpI)this.eWL).a(3, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() >= 5)
      this.fcl = (((dpI)this.eWL).a(4, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() >= 6)
      this.fcm = (((dpI)this.eWL).a(5, cVC(), dNF.meh) == 1);
  }

  public void bc() {
    super.bc();
    this.fcj = false;
    this.fcl = false;
    this.fck = false;
    this.fcm = false;
  }

  private boolean bmy() {
    return ((dpI)this.eWL).aui().eL() == chY.hGo;
  }
}