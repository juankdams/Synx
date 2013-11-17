class uS
  implements dGy
{
  uS(avU paramavU, int paramInt1, int paramInt2, long paramLong, auE paramauE)
  {
  }

  public boolean a(bfx parambfx)
  {
    cYk localcYk = new cYk(parambfx.bsJ());
    localcYk.add(this.aOU, this.aOV);
    long l1 = bin.buv();
    long l2 = dqW.cYb();
    this.bja.d(this.biY, l1, l2);

    aZK localaZK = this.biZ.a(this.biY, parambfx.apa(), l1, l2, localcYk);
    if (localaZK == null) {
      this.bja.dn(l1);
      throw new bcw(je.aKr, "Impossible de spawner l'élément.");
    }

    return true;
  }
}