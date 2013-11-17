import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class CA
  implements aYF, bcJ
{
  protected static final Logger K = Logger.getLogger(CA.class);

  private static final CA bFk = new CA();

  private final aoL bFl = new aoL();

  private final List bFm = new ArrayList();

  private final List bFn = new ArrayList();
  private long bFo = 0L;
  private cbQ bFp = null;

  private final List aEZ = new ArrayList();
  private final List bFq = new ArrayList();

  public static CA Lv()
  {
    return bFk;
  }

  public boolean p(Su paramSu)
  {
    if (paramSu == null) {
      return false;
    }

    synchronized (this.bFl) {
      if (this.bFl.containsKey(paramSu.getId())) {
        K.error("Ajout de ce CharacterInfo impossible : il existe déjà : " + paramSu.getId() + " - " + paramSu + " - " + this.bFl.get(paramSu.getId()));

        return false;
      }

      this.bFl.put(paramSu.getId(), paramSu);
    }

    ??? = paramSu.aeL();

    byv.a((bAF)???);
    bQK.bXG().d((cUo)???);

    ary.aDT().a(paramSu.getId(), (awH)???);

    if (((paramSu instanceof byo)) && (((byo)paramSu).bFC())) {
      synchronized (this.bFn) {
        this.bFn.add((byo)paramSu);
      }

    }

    if ((paramSu instanceof bKm)) {
      synchronized (this.bFm) {
        this.bFm.add(paramSu);
      }

    }

    ((cew)???).a(cCZ.cyZ());
    ((cew)???).a(bSH.bZs());
    ((cew)???).a(Dj.My());
    Dj.My().a((dMM)???);

    if (paramSu.aeI()) {
      duf.a(paramSu, clP.hOM, bSH.bZs());
      duf.a(paramSu.getId(), 0, paramSu.fa(), paramSu.fb(), paramSu.fc(), paramSu, cCZ.cyZ().bMh(), ay.bd().s(800237), paramSu.getName(), clP.hOS, cCZ.cyZ());
    }

    q(paramSu);

    return true;
  }

  private void q(Su paramSu) {
    for (dFx localdFx : this.aEZ) {
      try {
        localdFx.o(paramSu);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    }

    this.aEZ.removeAll(this.bFq);
    this.bFq.clear();
  }

  public void r(Su paramSu)
  {
    if (paramSu == null) {
      return;
    }

    if (paramSu.aeN() != null) {
      paramSu.aeN().c(paramSu);
    }

    bi(paramSu.getId());

    if ((paramSu instanceof byo)) {
      byo localbyo = (byo)paramSu;
      cWz.cKu().a(localbyo, false);
      chA.cjx().iu(paramSu.getId());

      aIA localaIA = localbyo.bFA();
      if (localaIA != null) {
        localaIA.aUu();
      }
    }

    paramSu.release();
  }

  public boolean a(bhG parambhG)
  {
    boolean bool;
    synchronized (this.bFl) {
      bool = this.bFl.b(parambhG);
    }
    return bool;
  }

  public boolean f(dGy paramdGy) {
    boolean bool = true;
    synchronized (this.bFm) {
      int i = 0; for (int j = this.bFm.size(); i < j; i++) {
        bool = paramdGy.d(this.bFm.get(i));
        if (!bool)
          break;
      }
    }
    return bool;
  }

  public int Lw()
  {
    synchronized (this.bFm) {
      return this.bFm.size();
    }
  }

  public Su bs(String paramString) {
    if (paramString == null)
      return null;
    synchronized (this.bFm) {
      for (int i = this.bFm.size() - 1; i >= 0; i--) {
        Su localSu = (Su)this.bFm.get(i);
        if ((localSu != null) && (paramString.equalsIgnoreCase(localSu.getName())))
          return localSu;
      }
    }
    return null;
  }

  private void bi(long paramLong)
  {
    Su localSu;
    synchronized (this.bFl) {
      localSu = (Su)this.bFl.remove(paramLong);
    }

    if (localSu == null) {
      K.error("Tentative de suppression d'un CharacterInfo " + paramLong + " inexistant.");
      return;
    }

    if ((localSu instanceof byo)) {
      synchronized (this.bFn) {
        this.bFn.remove(localSu);
      }
    }

    synchronized (this.bFm) {
      this.bFm.remove(localSu);
    }
    if (localSu.aeF()) {
      a(paramLong, localSu);
    }
    Dj.My().b(localSu.aeL());

    localSu.cleanUp();
  }

  private void a(long paramLong, Su paramSu)
  {
    if (paramSu.aeI())
      bQK.bXG().h(paramSu.aeL());
    else {
      bQK.bXG().gX(paramLong);
    }

    ary.aDT().di(paramSu.getId());

    bwG.gg(paramSu.getId());
    dmS.jM(paramSu.getId());

    duf.a(0, paramLong, cCZ.cyZ());
    duf.a(0, paramLong, bSH.bZs());
    paramSu.aeL().b(cCZ.cyZ());
    paramSu.aeL().b(bSH.bZs());

    paramSu.aeL().b(Dj.My());
  }

  public Su bj(long paramLong)
  {
    Su localSu;
    synchronized (this.bFl) {
      localSu = (Su)this.bFl.get(paramLong);
    }
    return localSu;
  }

  public Su bt(String paramString)
  {
    if (paramString == null)
      return null;
    cHu localcHu;
    synchronized (this.bFl) {
      for (localcHu = this.bFl.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        Su localSu = (Su)localcHu.value();
        if ((localSu != null) && (paramString.equals(localSu.getName())))
          return localSu;
      }
    }
    return null;
  }

  public void Lx()
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    cHu localcHu;
    synchronized (this.bFl) {
      for (localcHu = this.bFl.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        Su localSu = (Su)localcHu.value();
        if ((localSu.ads()) && (localSu.adt()))
          m++;
        else if ((!localSu.ads()) && (localSu.adt()))
          k++;
        else if ((localSu.ads()) && (!localSu.adt()))
          j++;
        else
          i++;
      }
    }
  }

  public void Ly()
  {
    int i;
    synchronized (this.bFl) {
      i = this.bFl.size();
      for (cHu localcHu = this.bFl.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        ((Su)localcHu.value()).release();
      }
      this.bFl.clear();
    }
    synchronized (this.bFn) {
      this.bFn.clear();
    }
    synchronized (this.bFm) {
      this.bFm.clear();
    }
    cWz.cKu().removeAll();
    chA.cjx().removeAll();
    K.info("Nettoyage des CharacterInfo contenus dans le CharacterInfoManager (" + this.bFl.size() + " restants sur " + i + ")");
  }

  public dle bk(long paramLong)
  {
    Su localSu;
    synchronized (this.bFl) {
      localSu = (Su)this.bFl.get(paramLong);
    }
    return localSu;
  }

  public long P(byte paramByte) {
    return 0L;
  }

  public Iterator Lz() {
    return new dAI(this.bFl);
  }

  public List k(cYk paramcYk) {
    return i(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public List i(int paramInt1, int paramInt2, int paramInt3) {
    ArrayList localArrayList = new ArrayList();
    cHu localcHu;
    synchronized (this.bFl) {
      for (localcHu = this.bFl.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        if (cqJ.a((cDW)localcHu.value(), paramInt1, paramInt2) == 0)
          localArrayList.add(localcHu.value());
      }
    }
    return localArrayList;
  }

  public void a(dFx paramdFx) {
    if (!this.aEZ.contains(paramdFx))
      this.aEZ.add(paramdFx);
  }

  public void b(dFx paramdFx) {
    if (paramdFx != null)
      this.bFq.add(paramdFx);
  }

  public void c(dFx paramdFx) {
    this.aEZ.remove(paramdFx);
  }
}