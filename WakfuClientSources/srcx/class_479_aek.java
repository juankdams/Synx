import org.apache.log4j.Logger;

public class aek
{
  private static aqa cVc;
  private static final Logger K = Logger.getLogger(aek.class);

  protected final aoL cVd = new aoL();
  protected final dli cVe = new dli();

  public aek(aqa paramaqa) {
    cVc = paramaqa;
  }

  public void a(dsj paramdsj, Object paramObject, short paramShort)
  {
    Object localObject;
    if ((paramObject instanceof bCJ)) {
      if ((byv.bFN().bFO().getId() != ((cPO)cVc.bPb()).getId()) && (byv.bFN().bFO().getId() != ((cPO)cVc.bPc()).getId()))
      {
        K.error("On essaie de mémoriser la position d'un item lors d'un échange qui ne concerne pas le joueur !");
        return;
      }
      localObject = (bCJ)paramObject;
      this.cVd.put(paramdsj.oj(), localObject);
      this.cVe.r(paramdsj.oj(), paramShort);
    }
    else if ((paramObject instanceof bZH)) {
      if ((byv.bFN().bFO().getId() != ((cPO)cVc.bPb()).getId()) && (byv.bFN().bFO().getId() != ((cPO)cVc.bPc()).getId()))
      {
        K.error("On essaie de mémoriser la position d'un item lors d'un échange qui ne concerne pas le joueur !");
        return;
      }
      localObject = (bZH)paramObject;
      this.cVd.put(paramdsj.oj(), localObject);
      this.cVe.r(paramdsj.oj(), paramShort);
    }
  }

  public Object g(dsj paramdsj)
  {
    return this.cVd.get(paramdsj.oj());
  }

  public short h(dsj paramdsj) {
    return this.cVe.jK(paramdsj.oj());
  }

  public Object c(gA paramgA, short paramShort) {
    return a(paramgA, paramShort, true);
  }

  public Object a(gA paramgA, short paramShort, boolean paramBoolean)
  {
    cPO localcPO = (cPO)cVc.gI(byv.bFN().bFO().getId());
    gA localgA1 = (gA)localcPO.jb(paramgA.oj());
    if (localgA1 != null) {
      paramBoolean = false;
    }

    Object localObject1 = this.cVd.get(paramgA.oj());
    Short localShort = Short.valueOf(this.cVe.jK(paramgA.oj()));

    bMD localbMD = byv.bFN().bFO().bGP();
    if (localbMD == null) {
      K.info("Erreur lors de la récupération des sacs du local player");
      return null;
    }

    if ((localObject1 == null) || (localShort == null)) {
      K.error("On cherche a retirer un objet qui n'a pas été mémorisé pendant l'échange");
      return null;
    }
    Object localObject2;
    boolean bool;
    gA localgA2;
    Object localObject3;
    int i;
    if ((localObject1 instanceof bCJ)) {
      localObject2 = (bCJ)localObject1;
      bool = false;
      localgA2 = paramgA.nH();
      localgA2.l(paramShort);

      localObject3 = (bCJ)localbMD.iO(((bCJ)localObject2).EN());
      i = ((bCJ)localObject3).je(localgA2.oj()) != null ? 1 : 0;
      if (i != 0) {
        bool = ((bCJ)localObject3).c(localgA2.oj(), localgA2.nP());
        if (bool)
          localgA2.release();
      } else if (((bCJ)localObject3).h(localgA2, localShort.shortValue())) {
        try {
          bool = ((bCJ)localObject3).i(localgA2, localShort.shortValue());
        } catch (Exception localException) {
          K.warn(localException.getMessage());
        }
        if ((bool) && (!((bCJ)localObject3).j(localgA2))) {
          localgA2.release();
        }

      }

      if (bool) {
        if (paramBoolean) {
          i(localgA2);
        }
        return localObject2;
      }

      if (!bool) {
        cRs localcRs2 = localbMD.b(localgA2, true);
        if (localcRs2 == null) {
          K.error("L'item n'a pu etre ajouté nulle part. Il n'a pas été ajouté a l'inventaire");
          return null;
        }
        K.warn("L'item a été placé dans le premier bag disponible, soit :" + localcRs2.EN());
        if (paramBoolean) {
          i(paramgA);
        }
        return localcRs2;
      }

    }
    else if ((localObject1 instanceof bZH)) {
      localObject2 = byv.bFN().bFO().ayJ();
      bool = false;
      localgA2 = paramgA.nH();
      try
      {
        bool = ((bZH)localObject2).b(localgA2, localShort.shortValue());

        if (localgA2.oi().bKn().nj() != null)
          for (Object localObject4 : localgA2.oi().bKn().nj()) {
            gA localgA3 = localgA2.nG();
            bool &= ((bZH)localObject2).b(localgA3, (short)localObject4.hV);
          }
      }
      catch (dI localdI) {
        K.error("La capacité de l'inventaire de départ est dépassée");
      } catch (dcF localdcF) {
        K.error("L'objet est déja présent a cette place");
      } catch (bQT localbQT) {
        K.error("La position de destination est occupée  !");
      }

      if (bool) {
        if (paramBoolean) {
          i(paramgA);
        }
        return localObject2;
      }
      cRs localcRs1 = localbMD.ap(paramgA);
      if (localcRs1 == null) {
        localgA2.release();
        K.error("L'item n'a pu etre ajouté nulle part. Il n'a pas été ajouté a l'inventaire");
        return null;
      }
      K.warn("L'item a été placé dans le premier bag disponible, soit :" + localcRs1.EN());
      if (paramBoolean) {
        i(paramgA);
      }
      return localcRs1;
    }

    return null;
  }

  public void aqc() {
    if ((byv.bFN().bFO().getId() != ((cPO)cVc.bPb()).getId()) && (byv.bFN().bFO().getId() != ((cPO)cVc.bPc()).getId()))
    {
      K.error("On veut remettre a zéro les positions d'un échange qui ne nous concerne pas !");
      return;
    }

    this.cVd.clear();
    this.cVe.clear();
  }

  public void i(dsj paramdsj)
  {
    if ((!this.cVd.containsKey(paramdsj.oj())) || (!this.cVe.containsKey(paramdsj.oj()))) {
      K.error("L'objet que l'on veut retirer n'est pas mémorisé ! ");
      return;
    }
    this.cVd.remove(paramdsj.oj());
    this.cVe.jL(paramdsj.oj());
  }

  public void a(aqa paramaqa) {
    if (paramaqa != cVc) {
      K.error("On veut retirer les items d'un échange qui ne nous concerne pas! ");
      return;
    }

    cPO localcPO = (cPO)cVc.gI(byv.bFN().bFO().getId());
    int i = 0;

    for (cHu localcHu = this.cVd.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      long l = localcHu.bic();

      gA localgA = (gA)localcPO.jb(l);

      Object localObject = a(localgA, localgA.nP(), false);
      if ((localObject instanceof bZH)) {
        i = 1;
      }
    }

    if (i != 0) {
      byv.bFN().bFO().bGH();
    }

    aqc();
  }
}