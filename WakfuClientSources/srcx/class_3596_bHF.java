import org.apache.log4j.Logger;

public abstract class bHF
{
  protected static final Logger K = Logger.getLogger(bHF.class);
  protected dqD gGb;
  protected dqD gGc;
  protected dTl gGd;
  protected long gGe;
  protected final long aTz;
  protected final long gGf;

  protected bHF(long paramLong1, long paramLong2)
  {
    this.aTz = paramLong1;
    this.gGf = paramLong2;
  }

  public long getId() {
    return this.aTz;
  }

  public long bOZ() {
    return this.gGf;
  }

  public void gH(long paramLong)
  {
    this.gGe = paramLong;
  }

  public long bPa()
  {
    return this.gGe;
  }

  protected void a(dqD paramdqD1, dqD paramdqD2)
  {
    K.info("[Trade] Initialisation d'un échange entre " + paramdqD1.getName() + "(id=" + paramdqD1.getId() + ") et " + paramdqD2.getName() + " (id=" + paramdqD2.getId() + ")");

    if (paramdqD1 == null) {
      throw new NullPointerException("[Trade] First user of an ItemExchanger can't be null");
    }
    if (paramdqD2 == null) {
      throw new NullPointerException("[Trade] Second user of an ItemExchanger can't be null");
    }
    this.gGd = dTl.mpJ;

    this.gGb = paramdqD1;
    this.gGb.dq(false);

    this.gGc = paramdqD2;
    this.gGc.dq(false);
  }

  public void start()
  {
    if (this.gGd != dTl.mpJ) {
      throw new IllegalStateException("[Trade] Only an Initializing exchanger can be started. Current State: " + this.gGd);
    }

    if (!aFa.aRA().a(this)) {
      this.gGd = dTl.mpM;
      a(this.gGb, bGt.a(this, cVF.kIf));

      a(this.gGb);
      a(this.gGc);

      aFa.aRA().b(this);
      return;
    }

    if (aBY())
      bPd();
    else
      bPe();
  }

  protected abstract boolean b(dqD paramdqD);

  protected abstract void a(dqD paramdqD);

  protected boolean c(dqD paramdqD)
  {
    return (paramdqD == this.gGb) || (paramdqD == this.gGc);
  }

  public dqD bPb() {
    return this.gGb;
  }

  public dqD bPc() {
    return this.gGc;
  }

  public dqD d(dqD paramdqD)
  {
    if (paramdqD == this.gGb) {
      return this.gGc;
    }
    if (paramdqD == this.gGc) {
      return this.gGb;
    }
    return null;
  }

  private void bPd() {
    this.gGd = dTl.mpK;
    a(this.gGb, bQf.a(this, bzG.gof));
    a(this.gGc, bQf.a(this, bzG.goe));
  }

  private void bPe() {
    if (!b(this.gGb))
    {
      this.gGd = dTl.mpM;

      a(this.gGb, bGt.a(this, cVF.kIg));
      a(this.gGc, bGt.a(this, cVF.kIf));

      aFa.aRA().b(this);
      return;
    }

    if (!b(this.gGc)) {
      this.gGd = dTl.mpM;

      a(this.gGb, bGt.a(this, cVF.kIf));
      a(this.gGc, bGt.a(this, cVF.kIg));

      a(this.gGb);

      aFa.aRA().b(this);

      return;
    }

    this.gGd = dTl.mpL;
    a(bQf.a(this, bzG.gog));
  }

  protected void bPf() {
    K.info("[Trade] Fin de l'échange entre " + this.gGb.getName() + " (id=" + this.gGb.getId() + " et " + this.gGc.getName() + " (id=" + this.gGc.getId() + ")");

    this.gGd = dTl.mpM;

    this.gGb.clear();
    this.gGc.clear();

    aFa.aRA().b(this);
  }

  public dqD gI(long paramLong)
  {
    if (paramLong == this.gGb.getId()) {
      return this.gGb;
    }
    if (paramLong == this.gGc.getId()) {
      return this.gGc;
    }
    return null;
  }

  protected void a(bQf parambQf) {
    a(parambQf, true);
  }

  protected void a(bQf parambQf, boolean paramBoolean) {
    if (this.gGb != null) {
      this.gGb.b(parambQf);
    }
    if (this.gGc != null) {
      this.gGc.b(parambQf);
    }
    if (paramBoolean)
      try {
        parambQf.release();
      } catch (Exception localException) {
        K.error("[Trade] Exception lors de la notification d'un évènement aux utilisateurs d'un ItemExchanger: ", localException);
      }
  }

  protected void a(long paramLong, bQf parambQf)
  {
    a(paramLong, parambQf, true);
  }

  protected void a(dqD paramdqD, bQf parambQf) {
    a(paramdqD, parambQf, true);
  }

  protected void a(long paramLong, bQf parambQf, boolean paramBoolean) {
    dqD localdqD = gI(paramLong);
    if (localdqD == null) {
      K.error("[Trade] Impossible d'envoyer un évènement à l'utilisateur d'id " + paramLong);
      return;
    }

    a(localdqD, parambQf, paramBoolean);
  }

  protected void a(dqD paramdqD, bQf parambQf, boolean paramBoolean) {
    if (paramdqD != null) {
      paramdqD.b(parambQf);
    }
    if (paramBoolean)
      try {
        parambQf.release();
      } catch (Exception localException) {
        K.error("[Trade] Exception lors de la notification d'un évènement à un user d'un ItemExchanger: ", localException);
      }
  }

  public dTl bPg()
  {
    return this.gGd;
  }

  protected abstract boolean aBY();

  protected abstract boolean aBZ();

  public void gJ(long paramLong) {
    e(gI(paramLong));
  }

  public void e(dqD paramdqD) {
    if (!c(paramdqD)) {
      return;
    }
    bPe();
  }

  public void a(dqD paramdqD, cVF paramcVF) {
    if (!c(paramdqD)) {
      return;
    }

    dqD localdqD = d(paramdqD);
    if ((!bB) && (localdqD == null)) throw new AssertionError();

    bGt localbGt1 = bGt.a(this, cVF.kIg);
    localbGt1.gV(paramdqD.getId());

    bGt localbGt2 = bGt.a(this, paramcVF);
    localbGt2.gV(paramdqD.getId());

    this.gGd = dTl.mpM;

    a(localdqD.getId(), localbGt2);
    a(paramdqD.getId(), localbGt1);

    bPf();
  }

  public void gK(long paramLong) {
    f(gI(paramLong));
  }

  public void f(dqD paramdqD) {
    if (!c(paramdqD)) {
      K.warn("[Trade] Impossible d'annuler l'échange, " + paramdqD.getName() + " n'est pas concerné");
      return;
    }

    this.gGd = dTl.mpM;

    a(this.gGb, bGt.a(this, cVF.kIf));
    a(this.gGc, bGt.a(this, cVF.kIg));

    bPf();
  }

  public void bPh()
  {
    this.gGd = dTl.mpM;

    a(this.gGb, bGt.a(this, cVF.kIm));
    a(this.gGc, bGt.a(this, cVF.kIm));

    bPf();
  }

  public void g(dqD paramdqD) {
    if (!c(paramdqD)) {
      K.error("[Trade] Impossible de retirer l'utilisateur (\"" + paramdqD.getName() + "\", " + paramdqD.getId() + ") de l'ExchangerUser : Il n'est pas concerné par cet échange (\"" + this.gGb.getName() + "\", " + this.gGb.getId() + "/\"" + this.gGc.getName() + "\", " + this.gGc.getId() + ").");

      return;
    }

    dqD localdqD = d(paramdqD);

    this.gGd = dTl.mpM;

    a(paramdqD, bGt.a(this, cVF.kIj));
    a(localdqD, bGt.a(this, cVF.kIi));

    bPf();
  }

  public void h(dqD paramdqD) {
    if (!c(paramdqD)) {
      K.error("[Trade] Impossible de finir l'échange " + paramdqD + " de l'ExchangerUser n'est pas concerné par cet échange");
      return;
    }

    if (aCa()) {
      aCc();

      this.gGd = dTl.mpM;

      a(bGt.a(this, cVF.kIk));
      bPf();
    } else {
      g(paramdqD);
    }
  }

  public void o(long paramLong, boolean paramBoolean) {
    a(gI(paramLong), paramBoolean);
  }

  public void a(dqD paramdqD, boolean paramBoolean) {
    if (!c(paramdqD)) {
      K.error("[Trade] Impossible de continuer l'échange " + paramdqD + " de l'ExchangerUser n'est pas concerné par cet échange");
      return;
    }

    if (aBZ())
    {
      paramdqD.dq(paramBoolean);

      if ((this.gGb.gI()) && (this.gGc.gI()))
        h(paramdqD);
    }
    else {
      h(paramdqD);
    }
  }

  public void a(long paramLong, dsj paramdsj, short paramShort) {
    b(gI(paramLong), paramdsj, paramShort);
  }

  public void b(dqD paramdqD, dsj paramdsj, short paramShort) {
    if (!c(paramdqD)) {
      return;
    }

    if (paramShort < 1) {
      K.error("[Trade] On essaye d'ajouter une quantité négative ou nulle d'objets à l'échange");
      return;
    }

    this.gGb.dq(false);
    this.gGc.dq(false);

    dsj localdsj1 = paramdqD.jb(paramdsj.oj());

    if (localdsj1 != null)
    {
      if ((aCb()) && (localdsj1.nP() + paramShort > paramdsj.nP())) {
        K.info("[Trade] On essaye d'ajouter plus de carte qu'il n'en a de disponible dans un échange");
        return;
      }

      localdsj1.a(paramShort);
    } else {
      if ((aCb()) && (paramShort > paramdsj.nP())) {
        K.error("[Trade] On essaye d'échanger plus de carte qu'il n'en a de disponible");
        return;
      }

      dsj localdsj2 = paramdsj.ow();
      localdsj2.l(paramShort);

      paramdqD.a(localdsj2.oj(), localdsj2);
    }

    a(dwm.a(this, dxK.lEC, paramdqD.getId(), paramdsj, paramShort));
  }

  public void b(long paramLong, dsj paramdsj, short paramShort) {
    a(gI(paramLong), paramdsj, paramShort);
  }

  public void a(dqD paramdqD, dsj paramdsj, short paramShort) {
    if (!c(paramdqD)) {
      K.error("[Trade] On essaye de retirer un objet de la liste d'un utilisateur non valide");
      return;
    }

    if (paramShort < 1) {
      K.error("[Trade] On essaye de retirer une quantité négative ou nulle d'objets à l'échange");
      return;
    }

    this.gGb.dq(false);
    this.gGc.dq(false);

    dsj localdsj = paramdqD.jb(paramdsj.oj());

    if (localdsj == null) {
      K.error("[Trade] On essaye de retirer un objet de l'échange qui n'existe pas");
      return;
    }

    if (localdsj.nP() < paramShort) {
      K.error("[Trade] On essaie de retirer plus d'objets qu'il n'y en a dans l'échange");
    } else if (localdsj.nP() == paramShort) {
      localdsj.release();
      paramdqD.jc(paramdsj.oj());
    } else {
      localdsj.a((short)-paramShort);
    }

    a(dwm.a(this, dxK.lED, paramdqD.getId(), paramdsj, paramShort));
  }

  protected boolean aCb() {
    return true;
  }

  protected abstract boolean aCa();

  protected abstract void aCc();

  public void cancel(long paramLong) {
    i(gI(paramLong));
  }

  public void i(dqD paramdqD) {
    if (!c(paramdqD)) {
      K.warn("[Trade] Impossible d'annuler l'échange, " + paramdqD.getName() + " n'est pas concerné");
      return;
    }

    switch (czz.ioE[this.gGd.ordinal()]) {
    case 1:
      g(paramdqD);
      break;
    case 2:
      a(paramdqD, cVF.kIh);
    }
  }
}