import java.util.Iterator;

final class csn
{
  private final dRK ich;
  private final dRK ici;
  private final ans icj = new ans();

  private final cMw ick = new cMw(this, null);
  private final cjr icl = new cjr(this, null);
  private final cMf icm = new cMf(this, null);

  csn(dRK paramdRK1, dRK paramdRK2)
  {
    this.ich = paramdRK1;
    this.ici = paramdRK2;
  }

  public void b(Ce paramCe, Su paramSu, cYk paramcYk) {
    if ((!(paramCe instanceof aAn)) || (((aAn)paramCe).getType() != xj.bpA.xj()))
      clear();
    short s = ((bqk)paramCe).nU();
    a(paramCe, paramSu, paramcYk, s);
  }

  public void p(cYk paramcYk) {
    clear();
    if (this.ich == null) {
      return;
    }
    this.ich.Q(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  private void a(Ce paramCe, Su paramSu, cYk paramcYk, short paramShort) {
    if (paramCe == null) {
      throw new IllegalArgumentException("container == null");
    }
    if ((this.ich == null) && (this.ici == null)) {
      return;
    }
    if ((paramSu == null) || (!paramSu.aeL().isVisible())) {
      return;
    }
    arl localarl = paramSu.aeQ();
    if (localarl == null) {
      return;
    }
    UG localUG = localarl.LB();

    for (dpI localdpI : paramCe)
      if ((localdpI.aMG() == 2) && 
        (!localdpI.cL(1L)) && 
        (!localdpI.a(PY.coy)) && 
        (paramShort <= localdpI.zC()) && (paramShort >= localdpI.zB()))
      {
        a(paramSu, paramcYk, localUG, localdpI);
        a((bqk)paramCe, paramSu, paramcYk, localarl, localUG, localdpI, paramShort);
      }
  }

  private void a(Su paramSu, cYk paramcYk, UG paramUG, dpI paramdpI) {
    if (this.ici == null) {
      return;
    }
    bbH localbbH = paramdpI.beA();
    if (localbbH == null) {
      return;
    }
    Iterable localIterable = localbbH.b(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramSu.fa(), paramSu.fb(), paramSu.fc(), paramSu.E());

    for (int[] arrayOfInt : localIterable) {
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];

      if (paramUG.aq(i, j)) {
        short s = paramUG.aw(i, j);
        this.ici.Q(i, j, s);
      }
    }
  }

  private void a(bqk parambqk, Su paramSu, cYk paramcYk, arl paramarl, UG paramUG, dpI paramdpI, short paramShort)
  {
    if (this.ich == null) {
      return;
    }
    if (!a(paramSu, paramcYk, paramarl, paramUG, paramdpI)) {
      return;
    }
    if (j(paramdpI)) {
      a(paramSu, paramcYk, paramdpI, paramShort);
      return;
    }

    bbH localbbH = paramdpI.aui();

    if (localbbH.eL() == chY.hGo)
      a(paramSu, paramcYk, paramarl, paramdpI);
    else
      a(parambqk, paramSu, paramcYk, paramUG, paramdpI, localbbH, paramShort);
  }

  private boolean a(Su paramSu, cYk paramcYk, arl paramarl, UG paramUG, dpI paramdpI)
  {
    bbH localbbH = paramdpI.beA();
    if (localbbH != null) {
      Iterable localIterable = localbbH.b(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramSu.fa(), paramSu.fb(), paramSu.fc(), paramSu.E());

      for (int[] arrayOfInt : localIterable) {
        if (paramUG.au(arrayOfInt[0], arrayOfInt[1]) != null) {
          return false;
        }
      }
    }
    if ((paramdpI.bew() != null) && (!paramdpI.bew().i(paramSu, paramcYk, null, paramarl)))
      return false;
    return true;
  }

  private void a(Su paramSu, cYk paramcYk, dpI paramdpI, bqk parambqk, short paramShort) {
    this.icm.b(paramSu, paramcYk, paramdpI, paramShort, parambqk);
  }

  private void a(Su paramSu, cYk paramcYk, dpI paramdpI, short paramShort, bqk parambqk) {
    cjK localcjK = bIL.a(paramdpI, parambqk);
    if (localcjK != null)
      this.icl.b(paramSu, paramcYk, paramdpI, paramShort, (bqk)localcjK);
  }

  private void a(Su paramSu, cYk paramcYk, dpI paramdpI, short paramShort)
  {
    int i = paramdpI.yR();

    aLM localaLM = aww.cMI().zw(i);
    if (localaLM == null) {
      return;
    }
    this.ick.b(paramSu, paramcYk, paramdpI, paramShort, localaLM);
  }

  private boolean j(dpI paramdpI) {
    int i = paramdpI.eo();
    return aBn.dVb.contains(i);
  }

  private boolean k(dpI paramdpI) {
    int i = paramdpI.eo();
    return (i == bsj.fSo.getId()) || (i == bsj.fSh.getId()) || (i == bsj.fSH.getId()) || (i == bsj.fSX.getId()) || (m(paramdpI)) || (l(paramdpI));
  }

  private boolean l(dpI paramdpI)
  {
    return paramdpI.eo() == bsj.fSm.getId();
  }

  private boolean m(dpI paramdpI) {
    return paramdpI.eo() == bsj.fSq.getId();
  }

  private void a(bqk parambqk, Su paramSu, cYk paramcYk, UG paramUG, dpI paramdpI, bbH parambbH, short paramShort)
  {
    if (l(paramdpI)) {
      a(paramSu, paramcYk, paramdpI, paramShort, parambqk);
    } else if (m(paramdpI)) {
      cjK localcjK = bIL.a(paramdpI, parambqk);
      if (localcjK != null)
        a(localcjK, paramSu, paramcYk, paramShort);
    }
    else {
      a(paramSu, paramcYk, paramdpI, parambqk, paramShort);
    }
  }

  private void a(Su paramSu, cYk paramcYk, arl paramarl, dpI paramdpI) {
    for (Iterator localIterator = paramarl.Lz(); localIterator.hasNext(); ) {
      dle localdle = (dle)localIterator.next();
      Cs localCs = paramdpI.atZ().a(localdle, paramSu);

      switch (bTL.hfz[((btH)localCs.getFirst()).ordinal()]) {
      case 1:
      case 2:
      case 3:
        this.ich.Q(localdle.fa(), localdle.fb(), localdle.fc());
      }

    }

    this.ich.Q(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
    if (this.ici != null)
      this.ici.R(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  void a(String paramString, dn paramdn) {
    if (this.ich != null)
      this.ich.a(paramString, paramdn);
  }

  public void clear() {
    if (this.ich != null) {
      this.ich.clear();
    }
    if (this.ici != null)
      this.ici.clear();
  }
}