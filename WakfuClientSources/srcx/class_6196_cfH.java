public class cfH
{
  private final aOX hAG;

  public cfH(dqG paramdqG)
  {
    this.hAG = ((aOX)paramdqG);
  }

  protected dqG ciq() {
    return this.hAG;
  }

  public final void ai(gA paramgA) {
    int i = !ak(paramgA) ? 1 : 0;
    if (i != 0)
      aj(paramgA);
  }

  public final gA hq(long paramLong)
  {
    gA localgA = this.hAG.en(paramLong);
    if (localgA == null) {
      throw new czR("Impossible de trouver l'item " + paramLong);
    }

    return this.hAG.eo(paramLong);
  }

  public final short cf(long paramLong) {
    gA localgA = this.hAG.en(paramLong);
    if (localgA == null) {
      throw new czR("Impossible de trouver l'item " + paramLong);
    }

    return localgA.nP();
  }

  public final void e(long paramLong, short paramShort) {
    gA localgA = this.hAG.en(paramLong);
    if (localgA == null) {
      throw new czR("Impossible de trouver l'item " + paramLong);
    }

    e(localgA, paramShort);
  }

  public final gA h(long paramLong, short paramShort)
  {
    if (paramShort < 0) {
      throw new czR("Impossible de modifier la quantité de l'item " + paramLong + ", on utilise une quantité négative");
    }

    gA localgA = this.hAG.en(paramLong);
    if (localgA == null) {
      throw new czR("Impossible de trouver l'item " + paramLong);
    }

    int i = localgA.nP() - paramShort;
    return e(localgA, (short)i);
  }

  public final void a(long paramLong1, long paramLong2, short paramShort1, short paramShort2) {
    cRs localcRs = D(paramLong2);
    if (localcRs == null) {
      throw new czR("Impossible de trouver le sac");
    }

    gA localgA1 = this.hAG.en(paramLong1);
    if (localgA1 == null) {
      throw new czR("Impossible de trouver l'item " + paramLong1);
    }

    int i = paramShort2 == -1 ? localgA1.nP() : paramShort2;
    if ((i < 0) || (i > localgA1.nP())) {
      throw new czR("Quantité invalide : " + i);
    }
    try
    {
      if (localcRs.h(localgA1, paramShort1)) {
        if (!localcRs.i(localgA1, paramShort1)) {
          throw new czR("Problème à l'ajout de l'item.");
        }
        this.hAG.eo(paramLong1);
        if (!localcRs.j(localgA1))
          localgA1.release();
      }
      else {
        gA localgA2 = localcRs.dR(paramShort1);
        if ((localgA2 != null) && (localgA2.b(localgA1))) {
          short s = (short)Math.min(i, Math.min(localgA1.nP(), localgA2.nQ()));
          localcRs.c(localgA2.oj(), s);
          if (s == localgA1.nP())
            this.hAG.eo(paramLong1);
          else
            this.hAG.e(paramLong1, (short)(localgA1.nP() - s));
        }
        else {
          throw new czR("La position n'est pas stackable.");
        }
      }
    } catch (dI localdI) {
      throw new czR("La destination est occupée. " + localdI);
    } catch (dcF localdcF) {
      throw new czR("Contenu déja présent. Triche ?" + localdcF);
    } catch (bQT localbQT) {
      throw new czR("La destination est occupée." + localbQT);
    }
  }

  public final void i(long paramLong, short paramShort) {
    bZH localbZH = mX();
    if (localbZH == null) {
      throw new czR("Impossible de trouver l'equipement");
    }

    gA localgA1 = this.hAG.en(paramLong);
    if (localgA1 == null)
      throw new czR("Impossible de trouver l'item " + paramLong);
    gA localgA2;
    if (localgA1.nP() == 1) {
      localgA2 = localgA1;
    } else {
      localgA2 = gA.a(localgA1.oi());
      localgA2.l((short)1);
    }

    int i = (a(localgA2)) && (localbZH.a(localgA2, paramShort)) ? 1 : 0;

    if (i == 0) {
      throw new czR("L'emplacement de destination est déjà occupé ou invalide.");
    }

    boolean bool = false;
    try {
      localbZH.b(localgA2, paramShort);
      bool = true;
      if (localgA1.oi().bKn().nj() != null) {
        for (azO localazO : localgA1.oi().bKn().nj()) {
          gA localgA3 = localgA1.nG();
          bool &= localbZH.b(localgA3, (short)localazO.bJ());
        }

      }

      if ((!bool) && (localgA2 != localgA1))
        localgA2.release();
    }
    catch (dI localdI)
    {
      throw new czR("La destination est occupée. " + localdI);
    } catch (dcF localdcF) {
      throw new czR("Contenu déja présent. Triche ?" + localdcF);
    } catch (bQT localbQT) {
      throw new czR("La destination est occupée." + localbQT);
    } finally {
      if ((!bool) && (localgA2 != localgA1)) {
        localgA2.release();
      }
    }

    if (localgA1 == localgA2)
      this.hAG.eo(paramLong);
    else
      this.hAG.e(paramLong, (short)(localgA1.nP() - 1));
  }

  public void b(dVX paramdVX)
  {
    for (short s = (short)(this.hAG.bfO() - 1); s >= 0; s = (short)(s - 1)) {
      gA localgA1 = this.hAG.bn(s);
      if (paramdVX.j(localgA1)) {
        gA localgA2 = this.hAG.eo(localgA1.oj());
        localgA2.release();
      }
    }
  }

  public void clear() {
    this.hAG.clear();
  }

  protected boolean a(gA paramgA) {
    return true;
  }

  protected bZH mX()
  {
    return null;
  }

  protected cRs D(long paramLong)
  {
    return null;
  }

  private void aj(gA paramgA) {
    if (this.hAG.isFull()) {
      this.hAG.bfN();
    }

    this.hAG.J(paramgA);
  }

  private boolean ak(gA paramgA) {
    short s1 = 0; for (short s2 = this.hAG.bfO(); s1 < s2; s1 = (short)(s1 + 1)) {
      gA localgA = this.hAG.bn(s1);
      if ((localgA.b(paramgA)) && (localgA.nQ() != 0)) {
        int i = Math.min(paramgA.nP(), localgA.nQ());

        this.hAG.e(localgA.oj(), (short)(localgA.nP() + i));

        if (paramgA.nP() == i) {
          paramgA.release();
          return true;
        }
        paramgA.a((short)-i);
      }

    }

    return false;
  }

  private gA e(gA paramgA, short paramShort)
  {
    if ((paramShort < 0) || (paramShort > paramgA.nR())) {
      throw new czR("Impossible de définir la quantité de l'item " + paramgA.oj() + " à " + paramShort);
    }

    gA localgA = null;
    if (paramShort == 0)
      localgA = this.hAG.eo(paramgA.oj());
    else {
      this.hAG.e(paramgA.oj(), paramShort);
    }

    return localgA;
  }

  public String toString()
  {
    return "TemporaryInventoryController{m_inventory=" + this.hAG + '}';
  }
}