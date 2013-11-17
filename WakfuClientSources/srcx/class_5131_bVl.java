import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bVl extends IT
{
  public static final Logger K = Logger.getLogger(bVl.class);
  private static final int hhn = 18;
  private static final bVl hho = new bVl();
  protected final aoL hhp;
  ArrayList hhq = new ArrayList(8);
  protected final aoL hhr;
  private final ArrayList cSU;
  private final ArrayList cSV;
  private final ArrayList cSW;
  private final ArrayList cSX;
  private final bhG hhs = new dSU(this);

  public static bVl caZ()
  {
    return hho;
  }

  protected bVl()
  {
    this.hhp = new aoL();
    this.hhr = new aoL();

    this.cSU = new ArrayList();
    this.cSV = new ArrayList();
    this.cSW = new ArrayList();
    this.cSX = new ArrayList();
  }

  public void b(ob paramob)
  {
    if (!this.hhp.containsKey(paramob.getId())) {
      paramob.ce(paramob.bZ());
      this.hhp.put(paramob.getId(), paramob);
      cYk localcYk = paramob.atB();
      cbQ localcbQ = dl(localcYk.getX(), localcYk.getY());
      localcbQ.add(paramob.getId());

      a(paramob, localcYk.getX(), localcYk.getY(), localcYk.IB());
      e(paramob);
    } else {
      K.warn("Impossible d'ajouter l'élément id=" + paramob.getId() + " en " + paramob.fa() + ":" + paramob.fb() + " car il en existe déjà avec cet ID.");
    }
  }

  public void c(ob paramob)
  {
    if (paramob != null) {
      this.hhp.remove(paramob.getId());
      long l = d(paramob);
      a(paramob, l);
      f(paramob);
      paramob.release();
    } else {
      K.error("Impossible de retirer un element null");
    }
  }

  private long d(ob paramob) {
    return bCO.cM(paramob.atB().getX(), paramob.atB().getY());
  }

  public void bT(long paramLong) {
    ob localob = (ob)this.hhp.get(paramLong);
    if (localob != null)
      c(localob);
    else
      K.warn("Impossible de supprimer un element d'ID " + paramLong + " qui n'existe pas");
  }

  public void removeAllElements()
  {
    K.info("Supression de tout les Element du AnimatedElementSceneViewManager.");
    ob[] arrayOfob1 = new ob[this.hhp.size()];
    arrayOfob1 = (ob[])this.hhp.d(arrayOfob1);
    for (ob localob : arrayOfob1) {
      c(localob);
    }
    if (!this.hhp.isEmpty())
      K.error("Il reste encore " + this.hhp.size() + " après la supression !!!");
  }

  public boolean dj(int paramInt1, int paramInt2)
  {
    return this.hhr.N(bCO.cM(paramInt1, paramInt2));
  }

  public ob hb(long paramLong) {
    return (ob)this.hhp.get(paramLong);
  }

  public ArrayList dk(int paramInt1, int paramInt2) {
    ArrayList localArrayList = new ArrayList();
    cbQ localcbQ = (cbQ)this.hhr.get(bCO.cM(paramInt1, paramInt2));
    if (localcbQ != null) {
      for (int i = localcbQ.size() - 1; i >= 0; i--) {
        localArrayList.add(this.hhp.get(localcbQ.get(i)));
      }
      return localArrayList;
    }
    return localArrayList;
  }

  public int cba() {
    return this.hhp.size();
  }

  public void a(cXf paramcXf, int paramInt)
  {
    int i = this.hhp.size();
    ob[] arrayOfob = new ob[i];
    this.hhp.d(arrayOfob);

    this.kSP.clear();
    for (int j = 0; j < i; j++) {
      ob localob = arrayOfob[j];
      if (localob.b(paramcXf, paramInt)) {
        if (localob.vL())
          this.hhq.add(localob);
        else {
          this.kSP.add(localob);
        }
      }
    }

    j = 0; for (int k = this.hhq.size(); j < k; j++) {
      c((ob)this.hhq.get(j));
    }
    this.hhq.clear();
  }

  public void a(cXf paramcXf, float paramFloat1, float paramFloat2) {
    this.kSP.clear();

    cHu localcHu = this.hhp.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      ob localob = (ob)localcHu.value();
      if (localob.a(paramcXf)) {
        this.kSP.add(localob);
      }
      a(localob, paramcXf);
    }
  }

  public void clear() {
    cHu localcHu = this.hhp.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      ob localob = (ob)localcHu.value();
      localob.dispose();
      localob.release();
    }
    this.hhp.clear();
    this.kSP.clear();

    this.cSW.clear();
    this.cSW.addAll(this.cSU);
    this.cSX.clear();
    this.cSX.addAll(this.cSV);
  }

  public void a(long paramLong, int paramInt1, int paramInt2) {
    ob localob = (ob)this.hhp.get(paramLong);
    if (localob != null) {
      long l = d(localob);
      a(localob, l);

      cbQ localcbQ = dl(paramInt1, paramInt2);
      localcbQ.add(localob.getId());
    }
  }

  private cbQ dl(int paramInt1, int paramInt2) {
    long l = bCO.cM(paramInt1, paramInt2);
    cbQ localcbQ = (cbQ)this.hhr.get(l);
    if (localcbQ == null) {
      localcbQ = new cbQ();
      this.hhr.put(l, localcbQ);
    }
    return localcbQ;
  }

  private void a(ob paramob, long paramLong) {
    cbQ localcbQ = (cbQ)this.hhr.get(paramLong);
    if (localcbQ == null) {
      K.error("Pas d'elements enregistrés à la position " + paramob.atB() + " l'IE " + paramob);
      return;
    }
    Cu.b(localcbQ, paramob.getId());

    if (localcbQ.isEmpty())
      this.hhr.remove(paramLong);
  }

  private void e(ob paramob)
  {
    int i = 0; for (int j = this.cSW.size(); i < j; i++)
      ((dDt)this.cSW.get(i)).g(paramob);
  }

  private void f(ob paramob)
  {
    for (int i = this.cSX.size() - 1; i >= 0; i--)
      ((aua)this.cSX.get(i)).a(paramob);
  }

  public void a(dDt paramdDt)
  {
    if (this.cSU.contains(paramdDt)) {
      return;
    }
    this.cSU.add(paramdDt);
    b(paramdDt);
  }

  public void a(aua paramaua) {
    if (this.cSV.contains(paramaua)) {
      return;
    }
    this.cSV.add(paramaua);
    b(paramaua);
  }

  public void b(dDt paramdDt) {
    if (!this.cSW.contains(paramdDt))
      this.cSW.add(paramdDt);
  }

  public void b(aua paramaua)
  {
    if (!this.cSX.contains(paramaua))
      this.cSX.add(paramaua);
  }

  public void c(aua paramaua)
  {
    if (this.cSX.contains(paramaua))
      this.cSX.remove(paramaua);
  }

  public Iterator cbb()
  {
    return this.kSP.iterator();
  }

  public cHu cbc() {
    return this.hhp.aBa();
  }

  public void ape()
  {
    this.hhp.s(new dSV(this));
  }
}