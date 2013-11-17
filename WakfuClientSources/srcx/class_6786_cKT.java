import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class cKT
{
  private static final Logger K = Logger.getLogger(cKT.class);
  public static final Comparator iJw = new dpJ();

  public static final Comparator iJx = new dpM();

  protected final aoL iJy = new aoL();
  protected final ArrayList aBf = new ArrayList();

  public boolean iN(long paramLong) {
    return this.iJy.containsKey(paramLong);
  }

  public cRs iO(long paramLong) {
    return (cRs)this.iJy.get(paramLong);
  }

  public cRs iP(long paramLong) {
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      if (localcRs.EN() == paramLong) {
        return localcRs;
      }
    }
    return null;
  }

  public cHu cEg() {
    return this.iJy.aBa();
  }

  public cRs ao(gA paramgA) {
    for (cRs localcRs : b(iJx)) {
      if (localcRs.krO.ajz().b(localcRs.krO, paramgA) == 0) {
        return localcRs;
      }
    }
    return null;
  }

  public cRs iQ(long paramLong) {
    for (cRs localcRs : b(iJw)) {
      if (localcRs.krO.ch(paramLong)) {
        return localcRs;
      }
    }
    return null;
  }

  public cRs ap(gA paramgA) {
    return a(paramgA, null);
  }

  public cRs a(gA paramgA, cNd paramcNd) {
    return a(paramgA, false, paramcNd);
  }

  public cRs b(gA paramgA, boolean paramBoolean) {
    return a(paramgA, paramBoolean, null);
  }

  public cRs a(gA paramgA, boolean paramBoolean, bbk parambbk)
  {
    cRs localcRs1 = null;
    if (paramgA.nR() > 1) {
      localcRs1 = ar(paramgA);
    }

    if (localcRs1 == null) {
      localcRs1 = ao(paramgA);
    }

    if (localcRs1 == null) {
      return null;
    }

    dfy localdfy = localcRs1.krO;
    try {
      if (parambbk != null) {
        localdfy.d(parambbk);
      }
      if (localdfy.c(paramgA)) {
        if ((paramBoolean) && (!localdfy.f(paramgA)))
        {
          paramgA.release();
        }
        return localcRs1;
      }
    } catch (dI localdI) {
      K.error("Capacité de l'inventaire cible atteinte. Erreur, on a récupéré ce sac comme disponible pour cet objet !", localdI);
    } catch (dcF localdcF) {
      K.error("L'item était déja présent dans le sac de destination. ID Dupliqué ?", localdcF);
    } finally {
      if (parambbk != null) {
        localdfy.c(parambbk);
      }
    }
    return null;
  }

  public cRs aq(gA paramgA)
  {
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      if (localcRs.krO.d(paramgA)) {
        return localcRs;
      }
    }
    return null;
  }

  public void c(dVX paramdVX) {
    this.iJy.s(new dpL(this, paramdVX));
  }

  public int yd(int paramInt)
  {
    int i = 0;
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      i += localcRs.krO.nP(paramInt);
    }
    return i;
  }

  public int en(int paramInt1, int paramInt2)
  {
    int i = 0;
    cHu localcHu = this.iJy.aBa();
    while ((localcHu.hasNext()) && (paramInt2 > 0)) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      i += localcRs.krO.bP(paramInt1, paramInt2);
      if (i >= paramInt2) {
        return i;
      }
    }
    return i;
  }

  public void cEh()
  {
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      ((cRs)localcHu.value()).krO.cleanup();
    }
  }

  public gA iR(long paramLong) {
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      gA localgA = (gA)((cRs)localcHu.value()).krO.cg(paramLong);
      if (localgA != null) {
        return localgA;
      }
    }
    return null;
  }

  public short cf(long paramLong) {
    cHu localcHu = this.iJy.aBa();
    short s = 0;
    while (localcHu.hasNext()) {
      localcHu.fl();
      s = (short)(s + ((cRs)localcHu.value()).krO.cf(paramLong));
    }
    return s;
  }

  public boolean c(long paramLong, short paramShort) {
    return a(paramLong, paramShort, null);
  }

  public boolean a(long paramLong, short paramShort, cNd paramcNd) {
    boolean bool = false;

    cHu localcHu = this.iJy.aBa();
    while ((localcHu.hasNext()) && (!bool)) {
      localcHu.fl();
      bool = ((cRs)localcHu.value()).a(paramLong, paramShort, paramcNd);
    }

    return bool;
  }

  public dsj ye(int paramInt) {
    for (cRs localcRs : b(iJw)) {
      dsj localdsj = localcRs.krO.hh(paramInt);
      if (localdsj != null) {
        return localdsj;
      }
    }
    return null;
  }

  public gA m(ge paramge) {
    for (cRs localcRs : b(iJw)) {
      gA localgA = localcRs.o(paramge);
      if (localgA != null) {
        return localgA;
      }
    }
    return null;
  }

  public gA c(bGS parambGS) {
    for (cRs localcRs : b(iJw)) {
      gA localgA = localcRs.d(parambGS);
      if (localgA != null) {
        return localgA;
      }
    }
    return null;
  }

  public gA yf(int paramInt) {
    for (cRs localcRs : b(iJw)) {
      gA localgA = localcRs.yT(paramInt);
      if (localgA != null) {
        return localgA;
      }
    }
    return null;
  }

  public gA c(int paramInt, dVX paramdVX) {
    for (cRs localcRs : b(iJw)) {
      gA localgA = localcRs.d(paramInt, paramdVX);
      if (localgA != null) {
        return localgA;
      }
    }
    return null;
  }

  public gA cEi() {
    for (cRs localcRs : b(iJw)) {
      for (gA localgA : localcRs.krO) {
        if (localgA != null) {
          return localgA;
        }
      }
    }
    return null;
  }

  public cRs yg(int paramInt) {
    for (cRs localcRs : b(iJw)) {
      dsj localdsj = localcRs.krO.hh(paramInt);
      if (localdsj != null) {
        return localcRs;
      }
    }
    return null;
  }

  public gA iS(long paramLong)
  {
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      gA localgA = (gA)((cRs)localcHu.value()).krO.ci(paramLong);
      if (localgA != null) {
        return localgA;
      }
    }
    return null;
  }

  public ArrayList yh(int paramInt) {
    Object localObject = null;
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      ArrayList localArrayList = ((cRs)localcHu.value()).krO.hi(paramInt);
      if (localObject == null) {
        localObject = localArrayList;
      } else {
        int i = 0; for (int j = localArrayList.size(); i < j; i++) {
          localObject.add(localArrayList.get(i));
        }
      }
    }
    return localObject;
  }

  public cRs ar(gA paramgA) {
    for (Iterator localIterator1 = b(iJx).iterator(); localIterator1.hasNext(); ) { localcRs = (cRs)localIterator1.next();

      ArrayList localArrayList = localcRs.krO.hi(paramgA.ok());
      for (gA localgA : localArrayList)
      {
        if ((localgA.b(paramgA)) && (localgA.nP() + paramgA.nP() <= paramgA.nR()))
          return localcRs;
      }
    }
    cRs localcRs;
    return null;
  }

  protected final ArrayList b(Comparator paramComparator) {
    ArrayList localArrayList = new ArrayList();
    this.iJy.s(new dpO(this, localArrayList));

    Collections.sort(localArrayList, paramComparator);
    return localArrayList;
  }

  public boolean as(gA paramgA) {
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      bPr localbPr = ((cRs)localcHu.value()).krO.ajz();
      if ((localbPr != null) && (localbPr.b(((cRs)localcHu.value()).krO, paramgA) == 0)) {
        return true;
      }
    }
    return false;
  }

  public cRs o(dsj paramdsj)
  {
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      if (((cRs)localcHu.value()).krO.ch(paramdsj.oj())) {
        return (cRs)localcHu.value();
      }
    }
    return null;
  }

  public boolean N(long paramLong) {
    cHu localcHu = this.iJy.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      if (((cRs)localcHu.value()).krO.ch(paramLong)) {
        return true;
      }
    }
    return false;
  }

  public boolean a(bSX parambSX) {
    return (!this.aBf.contains(parambSX)) && (this.aBf.add(parambSX));
  }

  public boolean b(bSX parambSX) {
    return this.aBf.remove(parambSX);
  }

  public void d(cRs paramcRs) {
    this.iJy.put(paramcRs.EN(), paramcRs);
    a(paramcRs);
    for (int i = 0; i < this.aBf.size(); i++)
      ((bSX)this.aBf.get(i)).a(paramcRs);
  }

  public cRs iT(long paramLong)
  {
    cRs localcRs = (cRs)this.iJy.remove(paramLong);
    b(localcRs);
    for (int i = 0; i < this.aBf.size(); i++) {
      ((bSX)this.aBf.get(i)).b(localcRs);
    }
    return localcRs;
  }

  protected abstract void a(cRs paramcRs);

  protected abstract void b(cRs paramcRs);

  public void clean() {
    for (cHu localcHu = this.iJy.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      for (int i = 0; i < this.aBf.size(); i++) {
        ((bSX)this.aBf.get(i)).b((cRs)localcHu.value());
      }
    }
    this.iJy.clear();
    this.aBf.clear();
  }

  public dUy a(int paramInt1, int paramInt2, bbk parambbk) {
    dUy localdUy1 = new dUy();

    int i = 0;

    cHu localcHu = this.iJy.aBa();

    while (localcHu.hasNext()) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      if (parambbk != null)
        localcRs.krO.d(parambbk);
      try
      {
        ArrayList localArrayList = localcRs.hi(paramInt1);
        if (localArrayList.isEmpty())
        {
          if (parambbk != null)
            localcRs.krO.c(parambbk);
        }
        else
          for (int j = localArrayList.size() - 1; j >= 0; j--) {
            dsj localdsj = (dsj)localArrayList.get(j);
            int k = (short)Math.min(paramInt2 - i, localdsj.nP());
            localdUy1.G(localdsj.oj(), -k);
            i += k;
            localcRs.krO.c(localdsj.oj(), (short)-k);

            if (i == paramInt2)
              return localdUy1;
          }
      }
      finally {
        if (parambbk != null) {
          localcRs.krO.c(parambbk);
        }
      }
    }

    return localdUy1;
  }

  public int yi(int paramInt) {
    int i = 0;

    cHu localcHu = this.iJy.aBa();

    while (localcHu.hasNext()) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      ArrayList localArrayList = localcRs.krO.hi(paramInt);
      if (!localArrayList.isEmpty())
      {
        for (int j = localArrayList.size() - 1; j >= 0; j--) {
          dsj localdsj = (dsj)localArrayList.get(j);
          i += localdsj.nP();
        }
      }
    }
    return i;
  }

  public int cEj() {
    cHu localcHu = this.iJy.aBa();
    int i = 0;
    while (localcHu.hasNext()) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      if (!(localcRs.ajz() instanceof bmd))
      {
        i += localcRs.cEj();
      }
    }
    return i;
  }

  public short at(gA paramgA) {
    short s = 0;
    for (cRs localcRs : b(iJx))
    {
      try
      {
        if (localcRs.aL(paramgA))
          s = (short)(s + 1);
      }
      catch (dI localdI) {
        K.warn("L'inventaire de destination est plein, erreur de simulateAdd", localdI);
      } catch (dcF localdcF) {
        K.error("l'item testé est déja présent dans l'inventaire cible. Erreur, ID Dupliqué ? ", localdcF);
      }
    }
    return s;
  }

  public ArrayList hi(int paramInt) {
    ArrayList localArrayList = new ArrayList();
    for (cHu localcHu = cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      localArrayList.addAll(((cRs)localcHu.value()).hi(paramInt));
    }
    return localArrayList;
  }

  public ArrayList b(int paramInt, dVX paramdVX) {
    ArrayList localArrayList = new ArrayList();
    for (cHu localcHu = cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      localArrayList.addAll(((cRs)localcHu.value()).b(paramInt, paramdVX));
    }
    return localArrayList;
  }

  public ArrayList a(dVX paramdVX) {
    ArrayList localArrayList = new ArrayList();
    for (cHu localcHu = cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      localArrayList.addAll(((cRs)localcHu.value()).a(paramdVX));
    }
    return localArrayList;
  }

  public cRs er(byte paramByte) {
    for (cHu localcHu = this.iJy.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      if (localcRs.cHq() == paramByte) {
        return localcRs;
      }
    }
    return null;
  }
}