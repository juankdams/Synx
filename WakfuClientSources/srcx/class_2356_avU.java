public class avU
{
  private final ago dKP;

  public avU(cKg paramcKg)
  {
    this.dKP = ((ago)paramcKg);
  }

  public cKg tZ() {
    return this.dKP;
  }

  public final void c(bpu parambpu) {
    if (this.dKP.aiJ() != null) {
      throw new bcw(je.aJS, "Le Havre-monde a déjà une guilde");
    }

    this.dKP.b(parambpu);
  }

  public final void d(bpu parambpu) {
    this.dKP.b(parambpu);
  }

  protected final cuF a(aXL paramaXL, long paramLong) {
    cUh localcUh = paramaXL.adj();
    Sk localSk = new Sk(localcUh, paramaXL.gv(), paramaXL.gw(), paramLong, paramaXL.bmV(), paramaXL.bmW());
    g(localSk);
    return localSk;
  }

  public final void g(cuF paramcuF) {
    if (paramcuF.adj() == null) {
      throw new bcw(je.aJZ, "Aucune définition pour le bâtiment");
    }
    if (this.dKP.cI(paramcuF.EN()) != null) {
      throw new bcw(je.aKh, "Le bâtiment existe déjà");
    }

    this.dKP.g(paramcuF);
  }

  public final void cJ(long paramLong) {
    cuF localcuF = this.dKP.cI(paramLong);
    if (localcuF == null) {
      throw new bcw(je.aKf, "Le bâtiment n'existe pas");
    }
    if (localcuF.adk()) {
      throw new bcw(je.aKp, "Il existe encore des éléments liés à ce bâtiment");
    }

    this.dKP.cJ(paramLong);
  }

  protected final void d(long paramLong1, long paramLong2, long paramLong3) {
    Sk localSk = (Sk)this.dKP.cI(paramLong1);
    if (localSk == null) {
      throw new bcw(je.aKf, "Le bâtiment n'existe pas " + paramLong1);
    }
    if (localSk.bS(paramLong2) != null) {
      throw new bcw(je.aKo, "L'élément existe déjà");
    }

    localSk.b(new bOy(paramLong2, paramLong3));
  }

  protected void a(aXL paramaXL, auE paramauE) {
    cUh localcUh = paramaXL.adj();
    long l = paramaXL.gv();
    int i = paramaXL.bmV();
    int j = paramaXL.bmW();

    localcUh.k(new uS(this, i, j, l, paramauE));
  }

  protected final void dn(long paramLong)
  {
    ddo localddo = new ddo(paramLong);
    this.dKP.o(localddo);
    long l = localddo.gv();
    Sk localSk = (Sk)this.dKP.cI(l);
    if (localSk == null) {
      throw new bcw(je.aKf, "Le bâtiment n'existe pas");
    }
    if (localSk.bS(paramLong) == null) {
      throw new bcw(je.aKn, "L'élément n'existe pas");
    }

    localSk.bT(paramLong);
  }

  protected final void h(long paramLong, int paramInt) {
    Sk localSk = (Sk)this.dKP.cI(paramLong);
    if (localSk == null) {
      throw new bcw(je.aKf, "Le bâtiment n'existe pas");
    }
    cUh localcUh = localSk.adj();
    if ((paramInt != 0) && (!localcUh.xO(paramInt))) {
      throw new bcw(je.aKk, "Impossible d'équipper l'item " + paramInt);
    }

    localSk.gC(paramInt);
  }

  public final bnt r(short paramShort1, short paramShort2) {
    ou localou = new ou(paramShort1, paramShort2);
    d(localou);
    return localou;
  }

  protected final bnt b(short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, short paramShort6)
  {
    ou localou = new ou(paramShort1, paramShort2, paramShort3, paramShort4, paramShort5, paramShort6);
    d(localou);
    return localou;
  }

  protected final void d(bnt parambnt) {
    if (this.dKP.l(parambnt.nx(), parambnt.ny()) != null) {
      throw new bcw(je.aKu, "La partition existe déjà");
    }

    this.dKP.d(parambnt);
  }

  public final void c(short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, short paramShort6) {
    ou localou = (ou)this.dKP.l(paramShort1, paramShort2);
    if (localou == null) {
      throw new bcw(je.aKt, "La partition n'existe pas");
    }

    boolean bool = localou.a(paramShort3, paramShort4, paramShort5, paramShort6);
    if (bool)
      this.dKP.e(localou);
  }

  public final void ky(int paramInt)
  {
    if (paramInt < 0) {
      throw new bcw(je.aKz, "Impossible de rajouter une quantité de resources négative");
    }

    ago localago = (ago)tZ();
    localago.hZ(Math.min(50000000, bCO.gq(localago.arM() + paramInt)));
  }

  protected final void kz(int paramInt) {
    if (paramInt < 0) {
      throw new bcw(je.aKz, "Impossible de supprimer une quantité de resources négative");
    }

    ago localago = (ago)tZ();
    if (localago.arM() - paramInt < 0) {
      throw new bcw(je.aKz, "Impossible de descendre en dessous de 0 ressources");
    }

    localago.hZ(bCO.gr(localago.arM() - paramInt));
  }

  public final void hZ(int paramInt) {
    if (paramInt < 0) {
      throw new bcw(je.aKz, "Impossible de définir une quantité de resources négative");
    }

    ago localago = (ago)tZ();
    localago.hZ(paramInt);
  }

  public String toString()
  {
    return "HavenWorldController{m_world=" + this.dKP + '}';
  }
}