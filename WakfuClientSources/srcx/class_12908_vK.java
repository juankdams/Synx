public class vK
{
  private final aoL bkE = new aoL();

  private final aoL bkF = new aoL();
  private cyc bkG;

  public void a(cyc paramcyc)
  {
    if (this.bkG != null)
      throw new nY("Un validator " + this.bkG + " a déjà été défini");
    this.bkG = paramcyc;
  }

  void a(aVw paramaVw, short paramShort)
  {
    if ((this.bkG != null) && (!this.bkG.e(paramaVw))) {
      return;
    }
    long l1 = paramaVw.bdG();
    long l2 = paramaVw.getId();
    aoL localaoL = (aoL)this.bkE.get(l1);
    if (localaoL == null)
      this.bkE.put(l1, localaoL = new aoL());
    dhL localdhL = (dhL)localaoL.get(l2);
    if (localdhL == null)
      localaoL.put(l2, localdhL = new dhL(l2, paramaVw.aFY(), paramaVw.Hy(), paramaVw.bdJ()));
    localdhL.eg(paramShort);
  }

  int aA(long paramLong)
  {
    aoL localaoL = (aoL)this.bkE.remove(paramLong);
    if (localaoL == null) {
      throw new nY("Aucune vente stockée pour le joueur " + paramLong);
    }
    int i = 0;
    for (cHu localcHu = localaoL.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      dhL localdhL = (dhL)localcHu.value();

      i += localdhL.cRt();
    }

    return i;
  }

  aVw b(long paramLong1, long paramLong2)
  {
    aoL localaoL = (aoL)this.bkF.get(paramLong1);
    if (localaoL == null)
      throw new nY("Aucune expiration stockée pour le joueur " + paramLong1);
    aVw localaVw = (aVw)localaoL.remove(paramLong2);
    if (localaVw == null)
      throw new nY("Aucune expiration d'Id " + paramLong2 + " stockée pour le joueur " + paramLong1);
    if (localaoL.isEmpty()) {
      this.bkF.remove(paramLong1);
    }
    return localaVw;
  }

  void a(aVw paramaVw) {
    if ((this.bkG != null) && (!this.bkG.f(paramaVw))) {
      return;
    }
    long l = paramaVw.bdG();
    aoL localaoL = (aoL)this.bkF.get(l);
    if (localaoL == null)
      this.bkF.put(l, localaoL = new aoL());
    localaoL.put(paramaVw.getId(), paramaVw);
  }

  void a(long paramLong, dhL paramdhL)
  {
    aoL localaoL = (aoL)this.bkE.get(paramLong);
    if (localaoL == null) {
      this.bkE.put(paramLong, localaoL = new aoL());
    }
    localaoL.put(paramdhL.getId(), paramdhL);
  }

  void aB(long paramLong) {
    this.bkE.remove(paramLong);
    this.bkF.remove(paramLong);
  }

  aoL aC(long paramLong) {
    return (aoL)this.bkE.get(paramLong);
  }

  dhL c(long paramLong1, long paramLong2) {
    aoL localaoL = (aoL)this.bkE.get(paramLong1);
    return localaoL != null ? (dhL)localaoL.get(paramLong2) : null;
  }

  public int aD(long paramLong) {
    aoL localaoL = (aoL)this.bkE.get(paramLong);
    return localaoL == null ? 0 : localaoL.size();
  }

  aoL aE(long paramLong) {
    return (aoL)this.bkF.get(paramLong);
  }

  aVw d(long paramLong1, long paramLong2) {
    aoL localaoL = (aoL)this.bkF.get(paramLong1);
    return localaoL != null ? (aVw)localaoL.get(paramLong2) : null;
  }

  public int aF(long paramLong) {
    aoL localaoL = (aoL)this.bkF.get(paramLong);
    return localaoL == null ? 0 : localaoL.size();
  }

  void clear() {
    this.bkE.clear();
    this.bkF.clear();
  }

  byte[] aG(long paramLong)
  {
    aoL localaoL = (aoL)this.bkE.get(paramLong);
    cXr localcXr = new cXr();
    if ((localaoL == null) || (localaoL.isEmpty())) {
      localcXr.putInt(0);
    } else {
      localcXr.putInt(localaoL.size());
      for (localObject = localaoL.aBa(); ((cHu)localObject).hasNext(); ) {
        ((cHu)localObject).fl();
        localcXr.aD(((dhL)((cHu)localObject).value()).bdN());
      }

    }

    Object localObject = (aoL)this.bkF.get(paramLong);
    cHu localcHu;
    if ((localObject == null) || (((aoL)localObject).isEmpty())) {
      localcXr.putInt(0);
    } else {
      localcXr.putInt(((aoL)localObject).size());
      for (localcHu = ((aoL)localObject).aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        localcXr.aD(((aVw)localcHu.value()).bdN());
      }
    }
    return localcXr.toArray();
  }
}