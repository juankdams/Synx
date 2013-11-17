class boD extends bKm
{
  private final dPl fIb;

  boD(dPl paramdPl)
  {
    this.fIb = paramdPl;
    a(dsE.cYX());
  }

  public cew aeL()
  {
    if (this.aEM == null) {
      c(new adN(this));
    }

    return this.aEM;
  }

  public dPl yJ() {
    return this.fIb;
  }

  public void byn() {
    c(aQC.bhe().nx(this.fIb.uO()).aii());
    cO(this.fIb.xK());
    if ((this.fIb instanceof cSs)) {
      cJf().m(dsh.luB.BA(((cSs)this.fIb).bP()));
    }
    cvN localcvN = this.fIb.dqu();
    a(localcvN.bRJ(), localcvN.bRK(), true);
    b(localcvN.bRO(), localcvN.bRP(), true);
    m(localcvN.bRM(), true);
    aei();
    e(localcvN.afn(), true);
    f(localcvN.afo(), true);
    aej();
    bBn localbBn1 = Hh.QM().dh(localcvN.ctz());
    bBn localbBn2 = Hh.QM().dh(localcvN.ctA());
    bBn localbBn3 = Hh.QM().dh(localcvN.ctB());

    adN localadN = (adN)aeL();

    if (localbBn1 != null) {
      localadN.a(localbBn1, (short)azO.dRx.hV);
    }
    if (localbBn2 != null) {
      localadN.a(localbBn2, (short)azO.dRA.hV);
    }
    if (localbBn3 != null) {
      localadN.a(localbBn3, (short)azO.dRC.hV);
    }

    setName(bU.fH().getString("ie.statue", new Object[] { this.fIb.getName() }));
  }

  public csx[] adN()
  {
    return csx.icw;
  }
}