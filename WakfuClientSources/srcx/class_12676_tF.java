public class tF
{
  private static final bep[] beo;
  private GM bep;
  private final Je beq;
  private final Je ber;
  private final dNg bes;

  public tF(dNg paramdNg)
  {
    this.beq = new Je(324);
    this.ber = new Je(324);
    this.bes = paramdNg;
  }

  public boolean I(int paramInt1, int paramInt2)
  {
    if (this.bes.I(paramInt1, paramInt2)) {
      return true;
    }
    paramInt1 -= this.bes.hY;
    paramInt2 -= this.bes.hZ;
    return this.beq.get(paramInt2 * 18 + paramInt1);
  }

  public boolean i(int paramInt1, int paramInt2, short paramShort) {
    if (I(paramInt1, paramInt2)) {
      return true;
    }
    return (this.bep != null) && (this.bep.N(aUG.B(paramInt1, paramInt2, paramShort)));
  }

  public boolean J(int paramInt1, int paramInt2) {
    if (I(paramInt1, paramInt2))
      return true;
    if (this.bep == null) {
      return false;
    }
    for (int i = 0; i < this.bep.size(); i++) {
      cYk localcYk = aUG.eF(this.bep.bl(i));
      if ((localcYk.getX() == paramInt1) && (localcYk.getY() == paramInt2))
        return true;
    }
    return false;
  }

  public final int e(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((!bB) && (!this.bes.p(paramInt1, paramInt2))) throw new AssertionError();
    int i = this.bes.a(paramInt1, paramInt2, beo, 0);
    if (i == 0)
      return 0;
    for (int j = 0; j < i; j++) {
      if (beo[j].aOl == paramInt3) {
        return beo[j].bsa();
      }
    }
    return 0;
  }

  public boolean f(int paramInt1, int paramInt2, int paramInt3)
  {
    return bep.pc(e(paramInt1, paramInt2, paramInt3));
  }

  public boolean K(int paramInt1, int paramInt2)
  {
    paramInt1 -= this.bes.hY;
    paramInt2 -= this.bes.hZ;
    return this.ber.get(paramInt2 * 18 + paramInt1);
  }

  public final dNg BV()
  {
    return this.bes;
  }

  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (I(paramInt1, paramInt2) == paramBoolean) {
      return;
    }
    paramInt1 -= this.bes.hY;
    paramInt2 -= this.bes.hZ;
    this.beq.set(paramInt2 * 18 + paramInt1, paramBoolean);
  }

  public void a(int paramInt1, int paramInt2, short paramShort, boolean paramBoolean) {
    if (i(paramInt1, paramInt2, paramShort) == paramBoolean) {
      return;
    }
    if (BV().a(paramInt1, paramInt2, beo, 0) == 1) {
      a(paramInt1, paramInt2, paramBoolean);
      return;
    }

    if (!paramBoolean) {
      if (this.bep != null)
        this.bep.bB(aUG.B(paramInt1, paramInt2, paramShort));
    }
    else {
      if (this.bep == null) {
        this.bep = new GM();
      }
      this.bep.add(aUG.B(paramInt1, paramInt2, paramShort));
    }
  }

  public void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (K(paramInt1, paramInt2) == paramBoolean) {
      return;
    }
    if (paramBoolean) {
      if (!J(paramInt1, paramInt2)) {
        paramInt1 -= this.bes.hY;
        paramInt2 -= this.bes.hZ;
        this.ber.set(paramInt2 * 18 + paramInt1, true);
      }
    } else {
      paramInt1 -= this.bes.hY;
      paramInt2 -= this.bes.hZ;
      this.ber.set(paramInt2 * 18 + paramInt1, false);
    }
  }

  static
  {
    beo = new bep[32];

    for (int i = 0; i < beo.length; i++)
      beo[i] = new bep();
  }
}