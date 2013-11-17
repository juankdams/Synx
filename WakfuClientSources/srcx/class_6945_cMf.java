import java.util.List;

class cMf
{
  private cMf(csn paramcsn)
  {
  }

  protected boolean cFh()
  {
    return false;
  }

  protected aVc a(dpI paramdpI, cOE paramcOE, dle paramdle1, dle paramdle2, cYk paramcYk) {
    doA localdoA = (doA)bsj.bAv().kD(paramdpI.eo());
    aVc localaVc = localdoA.aO();

    localaVc.a(paramdpI, null, paramcOE, paramdle1, paramdle2, paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), null);
    return localaVc;
  }

  protected boolean S(aVc paramaVc) {
    return false;
  }

  protected boolean T(aVc paramaVc) {
    return true;
  }

  protected bbH b(dpI paramdpI, bqk parambqk) {
    if (csn.a(this.hIM, paramdpI)) {
      cjK localcjK = bIL.a(paramdpI, parambqk);
      if (localcjK != null) {
        return localcjK.clv();
      }
    }
    return paramdpI.aui();
  }

  public void b(Su paramSu, cYk paramcYk, dpI paramdpI, short paramShort, bqk parambqk) {
    if (paramdpI.beD()) {
      Su localSu = null;
      arl localarl = paramSu.aeQ();

      localSu = (Su)localarl.bo(paramcYk.getX(), paramcYk.getY());

      aVc localaVc = a(paramdpI, paramSu.bEY(), paramSu, localSu, paramcYk);

      if ((S(localaVc)) && (localSu != null)) {
        paramSu = localSu;
      }

      if (localaVc.aM()) {
        int i = paramcYk.getX();
        int j = paramcYk.getY();
        short s = paramcYk.IB();

        if (!T(localaVc))
          localSu = null;
        if ((localSu == null) || (paramdpI.beC())) {
          if (cFh()) {
            List localList1 = csn.a(this.hIM).a(paramdpI, paramSu, localarl.aIq(), paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
            int k = 0; for (int m = localList1.size(); k < m; k++) {
              List localList2 = (List)localList1.get(k);
              int n = 0; for (int i1 = localList2.size(); n < i1; n++) {
                dle localdle = (dle)localList2.get(n);
                paramcYk.ac(localdle.fa(), localdle.fb(), localdle.fc());
                a(paramSu, paramcYk, paramdpI, paramShort, parambqk);
              }
            }
          } else {
            a(paramSu, paramcYk, paramdpI, paramShort, parambqk);
          }
        } else {
          paramcYk.ac(localSu.fa(), localSu.fb(), localSu.fc());
          a(paramSu, paramcYk, paramdpI, paramShort, parambqk);
        }

        paramcYk.ac(i, j, s);
      } else {
        a(paramSu, paramcYk, paramdpI, paramShort, parambqk);
      }

      localaVc.release();
    } else {
      a(paramSu, paramcYk, paramdpI, paramShort, parambqk);
    }
  }

  protected void a(Su paramSu, cYk paramcYk, dpI paramdpI, short paramShort, Ce paramCe) {
    CG localCG = new La(paramSu.ML(), paramcYk).Vy();
    if (localCG == CG.bFP)
      localCG = paramSu.E();
    Iterable localIterable = b(paramdpI, (bqk)paramCe).b(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), paramSu.fa(), paramSu.fb(), paramSu.fc(), localCG);

    UG localUG = paramSu.aeQ().LB();
    for (int[] arrayOfInt : localIterable) {
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];

      if (localUG.aq(i, j)) {
        csn.b(this.hIM).Q(i, j, localUG.aw(i, j));
        if (csn.c(this.hIM) != null)
          csn.c(this.hIM).R(i, j, localUG.aw(i, j));
      }
    }
  }
}