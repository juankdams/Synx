public class deU
{
  private final dHi kZf;

  public deU(Vu paramVu)
  {
    this.kZf = ((dHi)paramVu);
  }

  protected dHi cPk() {
    return this.kZf;
  }

  public final void C(int paramInt, short paramShort) {
    if (paramShort <= 0) {
      throw new wR("Impossible d'ajouter une quantité négative " + paramShort + " à l'item " + paramInt);
    }

    if (this.kZf.ha(paramInt) == null)
      g(paramInt, paramShort);
    else
      E(paramInt, paramShort);
  }

  public final void D(int paramInt, short paramShort)
  {
    if (paramShort >= 0) {
      throw new wR("Impossible de soustraire une quantité positive " + paramShort + " à l'item " + paramInt);
    }

    cEG localcEG = this.kZf.ha(paramInt);
    if (localcEG == null) {
      return;
    }
    if (localcEG.nP() + paramShort > 0)
      E(paramInt, paramShort);
    else
      removeItem(paramInt);
  }

  public final void g(int paramInt, short paramShort)
  {
    cEG localcEG = this.kZf.ha(paramInt);
    if (localcEG != null) {
      throw new wR("Un item " + localcEG + " est déjà présent dans l'inventaire");
    }
    bBn localbBn = Hh.QM().dh(paramInt);
    if (localbBn == null) {
      throw new wR("Impossible de trouver le refItem " + paramInt);
    }

    aLK localaLK = new aLK(localbBn);
    localaLK.l(paramShort);
    this.kZf.f(localaLK);
  }

  public final void e(cEG paramcEG) {
    if (!(paramcEG instanceof aLK)) {
      throw new wR("Impossible d'ajouter un item de type " + paramcEG.getClass().getSimpleName());
    }
    if (this.kZf.ha(paramcEG.tc()) != null) {
      throw new wR("Un item " + paramcEG + " est déjà présent dans l'inventaire");
    }

    this.kZf.f(paramcEG);
  }

  public final void removeItem(int paramInt) {
    cEG localcEG = this.kZf.ha(paramInt);
    if (localcEG == null) {
      throw new wR("L'item " + paramInt + " n'existe pas dans l'inventaire");
    }

    this.kZf.g(localcEG);
  }

  public final void E(int paramInt, short paramShort) {
    if (paramShort == 0) {
      throw new wR("Impossible de mettre à jour la quantité de l'item " + paramInt + " d'une quantité de " + paramShort);
    }

    aLK localaLK = (aLK)this.kZf.ha(paramInt);
    if (localaLK == null) {
      throw new wR("Impossible de trouver l'item " + paramInt);
    }

    int i = localaLK.nP() + paramShort;
    if ((i <= 0) || (i > localaLK.nR())) {
      throw new wR("Impossible de mettre à jour la quantité de l'item " + paramInt + " à une quantité de " + i);
    }

    localaLK.l(bCO.go(i));
  }

  public final void F(int paramInt, short paramShort) {
    aLK localaLK = (aLK)this.kZf.ha(paramInt);
    if (localaLK == null) {
      throw new wR("Impossible de trouver l'item " + paramInt);
    }
    if (paramShort <= 0) {
      throw new wR("Impossible de mettre à jour la quantité de l'item " + paramInt + " d'une quantité de " + paramShort);
    }

    localaLK.l(bCO.E(paramShort, localaLK.nR()));
  }

  public String toString()
  {
    return "QuestInventoryController{m_inventory=" + this.kZf + '}';
  }
}