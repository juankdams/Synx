import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class ayg extends bMz
{
  private static final ayg dNP = new ayg();

  public static ayg aJQ() {
    return dNP;
  }

  private static int bs(int paramInt1, int paramInt2)
  {
    if ((!bB) && ((paramInt1 < -2) || (paramInt1 > 2))) throw new AssertionError();
    if ((!bB) && ((paramInt2 < -2) || (paramInt2 > 2))) throw new AssertionError();
    if (paramInt1 > 0) {
      if (paramInt2 > 0) {
        return 8;
      }
      if (paramInt2 == 0) {
        return 5;
      }
      return 2;
    }

    if (paramInt1 == 0) {
      if (paramInt2 > 0) {
        return 7;
      }
      if (paramInt2 == 0) {
        return 4;
      }
      return 1;
    }

    if (paramInt2 > 0) {
      return 6;
    }
    if (paramInt2 == 0) {
      return 3;
    }
    return 0;
  }

  protected cfb a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    cfb localcfb = new cfb(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
    localcfb.initialize();
    return localcfb;
  }

  protected cew aJR()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return null;
    }

    return localbyz.aeL();
  }

  public boolean b(czN paramczN)
  {
    if ((!bB) && (this.eUJ == null)) throw new AssertionError();
    boolean bool = false;
    for (Cs localCs : paramczN.cwK()) {
      cfb localcfb = (cfb)bY(((Short)localCs.getFirst()).shortValue(), ((Short)localCs.Lp()).shortValue());
      if (localcfb != null) {
        localcfb.g(paramczN);
        bool |= true;
      }
    }
    return bool;
  }

  public void k(azX paramazX)
  {
    if ((!bB) && (this.eUJ == null)) throw new AssertionError();
    cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
    for (int i = 0; i < arrayOfcfb.length; i++) {
      cfb localcfb = arrayOfcfb[i];
      if (localcfb.cl(paramazX.fa(), paramazX.fb())) {
        localcfb.k(paramazX);
        return;
      }
    }

    K.error("Impossible d'ajouter une resource hors du champ de vision : resource=[" + paramazX.fa() + ':' + paramazX.fb() + "] lpmOrigin=[" + aJU() + ':' + aJV() + ']');
  }

  public void b(cMb paramcMb)
  {
    cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
    for (int i = 0; i < arrayOfcfb.length; i++) {
      cfb localcfb = arrayOfcfb[i];
      if (localcfb.cl(paramcMb.fa(), paramcMb.fb())) {
        localcfb.g(paramcMb);
        return;
      }
    }

    K.error("Impossible d'ajouter un élément interactif hors du champ de vision (cache disabled): ID=" + paramcMb.getId());
  }

  public dWu dw(long paramLong)
  {
    cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
    for (int i = 0; i < arrayOfcfb.length; i++) {
      dWu localdWu = arrayOfcfb[i].dw(paramLong);
      if (localdWu != null) {
        return localdWu;
      }
    }
    return null;
  }

  public ArrayList aJS()
  {
    ArrayList localArrayList = new ArrayList();
    cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
    for (int i = 0; i < arrayOfcfb.length; i++) {
      arrayOfcfb[i].P(new uQ(this, localArrayList));
    }

    return localArrayList;
  }

  public void a(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    cew localcew = aJR();

    if ((localcew != null) && (paramdMM == localcew)) {
      cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
      for (int i = 0; i < arrayOfcfb.length; i++) {
        cfb localcfb = arrayOfcfb[i];
        if (localcfb != null) {
          localcfb.N(paramInt1, paramInt2, paramShort);
        }
      }
      dO.hI().k(paramInt1, paramInt2);
    }
  }

  public void clear()
  {
    super.clear();

    aJT();

    removeAllListeners();
  }

  public void c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    aJT();
    super.E(paramInt1, paramInt2);
  }

  private void aJT() {
    if (this.eUJ != null) {
      cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
      for (int i = 0; i < arrayOfcfb.length; i++)
        arrayOfcfb[i].chX();
    }
  }

  public void c(czN paramczN)
  {
    cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
    for (int i = 0; i < arrayOfcfb.length; i++) {
      cfb localcfb = arrayOfcfb[i];
      if (localcfb.f(paramczN))
        localcfb.e(paramczN);
    }
  }

  public void h(azX paramazX)
  {
    cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
    for (int i = 0; i < arrayOfcfb.length; i++) {
      cfb localcfb = arrayOfcfb[i];
      if (localcfb.r(paramazX))
        localcfb.q(paramazX);
    }
  }

  public void e(dWu paramdWu)
  {
    cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
    for (int i = 0; i < arrayOfcfb.length; i++) {
      cfb localcfb = arrayOfcfb[i];
      if (localcfb.ho(paramdWu.getId())) {
        localcfb.f(paramdWu);
        return;
      }
    }
  }

  public void dx(long paramLong)
  {
    cfb[] arrayOfcfb = (cfb[])((cfb)this.eUJ).brP();
    for (int i = 0; i < arrayOfcfb.length; i++) {
      cfb localcfb = arrayOfcfb[i];
      if (localcfb.ho(paramLong)) {
        localcfb.hn(paramLong);
        return;
      }
    }
  }

  public void bt(int paramInt1, int paramInt2)
  {
    cfb localcfb1 = (cfb)((cfb)this.eUJ).pa(4);
    int i = asc.jT(paramInt1);
    int j = asc.jU(paramInt2);

    int k = i - localcfb1.getX();
    int m = j - localcfb1.getY();
    int n = Math.abs(k);
    int i1 = Math.abs(m);
    int i2 = n > i1 ? n : i1;

    if (i2 != 0)
    {
      if (i2 == 1)
      {
        ((cfb)this.eUJ).ve(bs(k, m));
      } else if (i2 == 2)
      {
        ((cfb)this.eUJ).ve(bs(k, m));
        k = i - ((cfb)((cfb)this.eUJ).pa(4)).getX();
        m = j - ((cfb)((cfb)this.eUJ).pa(4)).getY();

        ((cfb)this.eUJ).ve(bs(k, m));
      }
      else
      {
        c(paramInt1, paramInt2, false);
      }
    }
    cfb localcfb2 = (cfb)((cfb)this.eUJ).pa(4);
    b(aJR(), localcfb1, localcfb2);
  }

  public int aJU()
  {
    if ((!bB) && (this.eUJ == null)) throw new AssertionError();
    return ((cfb)((cfb)this.eUJ).pa(4)).getX() * 18;
  }

  public int aJV() {
    if ((!bB) && (this.eUJ == null)) throw new AssertionError();
    return ((cfb)((cfb)this.eUJ).pa(4)).getY() * 18;
  }

  public void removeAllListeners() {
    synchronized (this.gQf) {
      this.gQf.clear();
    }
  }
}