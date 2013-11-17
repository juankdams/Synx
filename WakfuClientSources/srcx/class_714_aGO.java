public class aGO
{
  private final aBc eee;

  public aGO(cyS paramcyS)
  {
    this.eee = ((aBc)paramcyS);
  }

  public void d(aCl paramaCl) {
    if (this.eee.ay(paramaCl.getId()) != null) {
      throw new dPr("Membre déjà présent dans la guilde");
    }

    this.eee.d(paramaCl);
  }

  public void dK(long paramLong) {
    aCl localaCl = this.eee.ay(paramLong);
    if (localaCl == null) {
      throw new dPr("Membre non-présent dans la guilde");
    }

    this.eee.dK(paramLong);
  }

  public void f(bqd parambqd) {
    if (this.eee.lA(parambqd.ajL()) != null) {
      throw new dPr("Bonus déjà présent dans la guilde");
    }

    this.eee.f(parambqd);
  }

  public void lG(int paramInt) {
    bqd localbqd = this.eee.lA(paramInt);
    if (localbqd == null) {
      throw new dPr("Bonus non-présent dans la guilde");
    }

    this.eee.lG(paramInt);
  }

  public void d(aUJ paramaUJ) {
    if (this.eee.az(paramaUJ.getId()) != null) {
      throw new dPr("Rank déjà présent dans la guilde");
    }
    if (paramaUJ.getName().length() > 15) {
      throw new dPr("Le nom de rang demandé est trop long");
    }

    this.eee.d(paramaUJ);
  }

  public void dJ(long paramLong) {
    aUJ localaUJ = this.eee.az(paramLong);
    if (localaUJ == null) {
      throw new dPr("Rang non-présent dans la guilde");
    }
    if (paramLong == this.eee.CE()) {
      throw new dPr("Impossible de supprimer le plus haut rang de la guilde");
    }
    if (paramLong == this.eee.aNq()) {
      throw new dPr("Impossible de supprimer rang le plus bas de la guilde");
    }
    if (!this.eee.A(new bKx(paramLong))) {
      throw new dPr("Des membres de la guildes ont encore ce rang assigné");
    }

    this.eee.dJ(paramLong);
  }

  public void my(int paramInt) {
    if (paramInt < 0) {
      throw new dPr("Impossible de retirer des points négatifs");
    }
    this.eee.lC((int)Math.max(this.eee.CI() - paramInt, 0L));
  }

  public int mz(int paramInt) {
    if (paramInt < 0) {
      throw new dPr("Impossible d'ajouter des points négatifs");
    }
    if (this.eee.aNw() <= 0) {
      mA(paramInt);
      return paramInt;
    }

    aSR();
    int i = this.eee.aNw() - this.eee.aNx();
    if (i <= 0) {
      return 0;
    }
    int j = Math.min(paramInt, i);
    mA(j);
    return j;
  }

  private void aSR() {
    int i = this.eee.aNy();
    int j = dDE.dft().get(3);

    if (i != j) {
      this.eee.lF(j);
      this.eee.lE(0);
    }
  }

  void mA(int paramInt) {
    this.eee.lC((int)Math.min(paramInt + this.eee.CI(), 9223372036854775807L));
    this.eee.lB((int)Math.min(paramInt + this.eee.aNr(), 9223372036854775807L));
    this.eee.lE(this.eee.aNx() + paramInt);
  }

  public void lD(int paramInt) {
    this.eee.lD(paramInt);
  }

  public void bd(short paramShort) {
    if (paramShort < 0) {
      throw new dPr("Impossible d'appliquer un niveau négatif");
    }
    if (CG().nU() >= paramShort)
      throw new dPr("Mauvais level à débloquer");
    if (paramShort > 10) {
      throw new dPr("Impossible d'appliquer un niveau > 10");
    }
    this.eee.aQ(paramShort);
  }

  public void gz(String paramString) {
    this.eee.setDescription(paramString);
  }

  public void gA(String paramString) {
    this.eee.setMessage(paramString);
  }

  public void e(long paramLong, String paramString) {
    bmF localbmF = (bmF)this.eee.az(paramLong);
    if (localbmF == null) {
      throw new dPr("Rang non-présent dans la guilde");
    }
    if (paramString.length() > 15) {
      throw new dPr("Le nom de rang demandé est trop long");
    }

    localbmF.setName(paramString);
  }

  public void w(long paramLong1, long paramLong2) {
    bmF localbmF = (bmF)this.eee.az(paramLong1);
    if (localbmF == null) {
      throw new dPr("Rang non-présent dans la guilde");
    }
    if ((paramLong1 == this.eee.CE()) && (paramLong2 != cnm.hTG)) {
      throw new dPr("Impossible de modifier le plus haut rang de la guilde");
    }
    if ((paramLong1 == this.eee.aNq()) && (paramLong2 != cnm.hTH)) {
      throw new dPr("Impossible de modifier rang le plus bas de la guilde");
    }

    localbmF.fH(paramLong2);
  }

  public void b(long paramLong, byte paramByte) {
    djP localdjP = (djP)this.eee.ay(paramLong);
    if (localdjP == null) {
      throw new dPr("Membre non-présent dans la guilde");
    }

    localdjP.fb(paramByte);
  }

  public void s(long paramLong, int paramInt) {
    djP localdjP = (djP)this.eee.ay(paramLong);
    if (localdjP == null) {
      throw new dPr("Membre non-présent dans la guilde");
    }

    localdjP.hm(paramInt);
  }

  public void x(long paramLong1, long paramLong2) {
    djP localdjP = (djP)this.eee.ay(paramLong1);
    if (localdjP == null) {
      throw new dPr("Membre non-présent dans la guilde");
    }

    localdjP.aM(paramLong2);
  }

  public void t(long paramLong, int paramInt) {
    djP localdjP = (djP)this.eee.ay(paramLong);
    if (localdjP == null) {
      throw new dPr("Membre non-présent dans la guilde");
    }

    localdjP.dc(paramInt);
  }

  public void f(long paramLong, String paramString) {
    djP localdjP = (djP)this.eee.ay(paramLong);
    if (localdjP == null) {
      throw new dPr("Membre non-présent dans la guilde");
    }

    localdjP.setName(paramString);
  }

  public void y(long paramLong1, long paramLong2) {
    djP localdjP = (djP)this.eee.ay(paramLong1);
    if (localdjP == null) {
      throw new dPr("Membre non-présent dans la guilde");
    }
    aUJ localaUJ = this.eee.az(paramLong2);
    if (localaUJ == null) {
      throw new dPr("Le rank demandé n'existe pas");
    }

    localdjP.jJ(paramLong2);
  }

  public void f(long paramLong, boolean paramBoolean) {
    djP localdjP = (djP)this.eee.ay(paramLong);
    if (localdjP == null) {
      throw new dPr("Membre non-présent dans la guilde");
    }

    localdjP.dK(paramBoolean);
  }

  public void g(int paramInt, dxL paramdxL) {
    bqv localbqv = (bqv)this.eee.lA(paramInt);
    if (localbqv == null) {
      throw new dPr("Bonus non-présent dans la guilde");
    }

    localbqv.H(paramdxL);
  }

  public cyS CG() {
    return this.eee;
  }

  public String toString()
  {
    return "GuildController{m_guild=" + this.eee + '}';
  }
}