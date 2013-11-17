import org.apache.log4j.Logger;

public abstract class cfx extends ciK
{
  private final bPu hAA = new bPu();

  private final cSR hAB = new cSR();

  public final void a(Nd[] paramArrayOfNd) {
    for (Nd localNd : paramArrayOfNd)
      this.hAA.c(localNd.Xf(), localNd.Xg());
  }

  public final void a(int paramInt1, short paramShort, int paramInt2, byte paramByte, int paramInt3, int paramInt4, int paramInt5)
  {
    this.hAB.put(paramInt1, new axe(paramShort, paramInt2, paramByte, paramInt3, paramInt4, paramInt5, null));
  }

  public final dFu da(short paramShort) {
    dFu localdFu = new dFu();
    dmn localdmn = this.hAB.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      axe localaxe = (axe)localdmn.value();
      if (axe.a(localaxe) == paramShort)
        localdFu.fg(localdmn.zY(), localaxe.dMu);
    }
    return localdFu;
  }

  public final dfN vf(int paramInt) {
    axe localaxe = (axe)this.hAB.get(paramInt);
    if (localaxe == null) {
      K.error("Aucune définition pour la vue de viewModelId=" + paramInt);
      return null;
    }

    short s = axe.a(localaxe);
    dfN localdfN = (dfN)this.hAA.cx(s);
    if (localdfN == null) {
      K.error("Aucune factory d'enregistrée pour le viewTypeId=" + s);
    }
    return localdfN;
  }

  public final abc va(int paramInt)
  {
    dfN localdfN = vf(paramInt);
    if (localdfN == null)
      return null;
    axe localaxe = (axe)this.hAB.get(paramInt);
    if (localaxe == null) {
      return null;
    }
    abc localabc = (abc)localdfN.p();
    localabc.bP(paramInt);
    localabc.bQ(localaxe.dMu);
    localabc.y(localaxe.io);
    localabc.H(localaxe.io == 0);
    localabc.setColor(localaxe.dui);
    localabc.aN(localaxe.cOu, localaxe.dMv);
    return localabc;
  }
}