import java.util.BitSet;
import java.util.Iterator;

final class cMV extends cDh
{
  cMV(dDN paramdDN)
  {
    super(paramdDN);
  }

  protected void a(aVc paramaVc, byte paramByte)
  {
    cbQ localcbQ1 = new cbQ(this.iwv.cfv());
    cbQ localcbQ2 = new cbQ(this.iwu.cfv());
    aoL localaoL = this.iww.aAZ();

    this.iwv.clear();
    this.iwu.clear();
    this.iww.clear();

    a(localcbQ1, localaoL);
    a(paramaVc, localcbQ2, localaoL);
  }

  private void a(aVc paramaVc, cbQ paramcbQ, aoL paramaoL) {
    int i = (paramaVc != null) && (cFy.f(paramaVc.DV())) ? 1 : 0;
    int j = 0; for (int k = paramcbQ.size(); j < k; j++) {
      long l = paramcbQ.get(j);
      aVc localaVc = (aVc)paramaoL.get(l);
      if ((localaVc != null) && (localaVc.oj() == l))
      {
        if ((!localaVc.bkF()) && (!localaVc.akZ()))
        {
          if (i != 0) {
            aVc.bka();
          }
          localaVc.y(paramaVc); } 
      }
    }
  }

  private void a(cbQ paramcbQ, aoL paramaoL) { int i = 0; for (int j = paramcbQ.size(); i < j; i++) {
      long l = paramcbQ.get(i);
      aVc localaVc = (aVc)paramaoL.get(l);
      if ((localaVc != null) && (localaVc.oj() == l))
        localaVc.bkE();
    }
  }

  protected boolean a(byte paramByte, aVc paramaVc, BitSet paramBitSet)
  {
    doA localdoA = (doA)paramaVc;

    if (!localdoA.atS()) {
      return false;
    }
    boolean bool = false;
    switch (paramByte) {
    case 31:
      if ((localdoA.aud() != null) && (localdoA.aud().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 11:
      if ((paramaVc.aua() != null) && (paramaVc.aua().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 21:
      if ((paramaVc.aub() != null) && (paramaVc.aub().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 61:
      if ((paramaVc.bkw() != null) && (paramaVc.bkw().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 41:
      if ((paramaVc.auc() != null) && (paramaVc.auc().intersects(paramBitSet))) {
        Q(paramaVc);
        bool = true;
      }
      break;
    }

    return bool;
  }

  protected boolean R(aVc paramaVc)
  {
    doA localdoA = (doA)paramaVc;
    return localdoA.atS();
  }

  protected boolean b(BitSet paramBitSet, aVc paramaVc, byte paramByte)
  {
    if ((paramaVc != null) && (((doA)paramaVc).a(PY.coB)))
      return false;
    boolean bool = false;
    for (Iterator localIterator = this.dcP.iterator(); localIterator.hasNext(); ) {
      doA localdoA = (doA)localIterator.next();

      if ((paramaVc != localdoA) && ((paramaVc == null) || (paramaVc.bkn() != localdoA)) && (
        (paramaVc == null) || (!paramaVc.aiz()) || (localdoA.a(PY.cow))))
      {
        if (R(localdoA))
          bool |= a(paramByte, localdoA, paramBitSet);
        else if (localdoA.yL())
          bool |= b(paramBitSet, paramByte, localdoA);
        else {
          bool |= a(paramBitSet, paramByte, localdoA);
        }
      }
    }
    return bool;
  }
}