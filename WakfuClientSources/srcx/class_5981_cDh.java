import java.util.BitSet;
import java.util.Iterator;

public class cDh
{
  protected dDN dcP;
  protected cbQ iwu = new cbQ();
  protected cbQ iwv = new cbQ();
  protected aoL iww = new aoL();

  protected cDh(dDN paramdDN) {
    this.dcP = paramdDN;
  }

  public boolean a(BitSet paramBitSet, aVc paramaVc, byte paramByte) {
    czi();

    boolean bool = b(paramBitSet, paramaVc, paramByte);

    if (bool) {
      a(paramaVc, paramByte);
    }

    czi();

    return bool;
  }

  private void czi() {
    this.iwu.clear();
    this.iwv.clear();
    this.iww.clear();
  }

  protected boolean b(BitSet paramBitSet, aVc paramaVc, byte paramByte) {
    if ((paramaVc != null) && (paramaVc.aiz()))
      return false;
    boolean bool = false;
    for (Iterator localIterator = this.dcP.iterator(); localIterator.hasNext(); ) {
      aVc localaVc = (aVc)localIterator.next();

      if ((paramaVc != localaVc) && ((paramaVc == null) || (paramaVc.bkn() != localaVc)))
      {
        if (R(localaVc))
          bool |= a(paramByte, localaVc, paramBitSet);
        else if (localaVc.yL())
          bool |= b(paramBitSet, paramByte, localaVc);
        else {
          bool |= a(paramBitSet, paramByte, localaVc);
        }
      }
    }
    return bool;
  }

  protected void a(aVc paramaVc, byte paramByte) {
    cbQ localcbQ1 = new cbQ(this.iwv.cfv());
    cbQ localcbQ2 = new cbQ(this.iwu.cfv());

    aoL localaoL = this.iww.aAZ();

    this.iwv.clear();
    this.iwu.clear();
    this.iww.clear();

    int i = 0; for (int k = localcbQ1.size(); i < k; i++) {
      long l1 = localcbQ1.get(i);
      aVc localaVc1 = (aVc)localaoL.get(l1);
      if ((localaVc1 != null) && (localaVc1.oj() == l1)) {
        localaVc1.bkE();
      }
    }
    if ((paramByte == 10) || (paramByte == 1)) {
      cUz localcUz = null;
      Object localObject = null;
      int n = 0; for (int i1 = localcbQ2.size(); n < i1; n++) {
        long l3 = localcbQ2.get(n);
        aVc localaVc3 = (aVc)localaoL.get(l3);
        if ((localaVc3 != null) && (localaVc3.oj() == l3))
        {
          if ((localcUz == null) || (localcUz.a(localaVc3.bkJ()) < 0)) {
            localcUz = localaVc3.bkJ();
            localObject = localaVc3;
          }
        }
      }
      if (localObject != null)
        localObject.y(paramaVc);
    }
    else {
      int j = 0; for (int m = localcbQ2.size(); j < m; j++) {
        long l2 = localcbQ2.get(j);
        aVc localaVc2 = (aVc)localaoL.get(l2);
        if ((localaVc2 != null) && (localaVc2.oj() == l2))
        {
          localaVc2.y(paramaVc); } 
      }
    }
  }

  protected boolean a(BitSet paramBitSet, byte paramByte, aVc paramaVc) { boolean bool = false;
    switch (paramByte) {
    case 1:
      if ((paramaVc.aua() != null) && (paramaVc.aua().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 2:
      if ((paramaVc.aub() != null) && (paramaVc.aub().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 3:
      if ((paramaVc.aud() != null) && (paramaVc.aud().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 5:
      if ((paramaVc.bkv() != null) && (paramaVc.bkv().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 6:
      if ((paramaVc.bkw() != null) && (paramaVc.bkw().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 4:
      if ((paramaVc.auc() != null) && (paramaVc.auc().intersects(paramBitSet))) {
        Q(paramaVc);
        bool = true;
      }

      break;
    }

    return bool; }

  protected boolean b(BitSet paramBitSet, byte paramByte, aVc paramaVc)
  {
    boolean bool = false;
    switch (paramByte) {
    case 10:
      if ((paramaVc.aua() != null) && (paramaVc.aua().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 20:
      if ((paramaVc.aub() != null) && (paramaVc.aub().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 30:
      if ((paramaVc.aud() != null) && (paramaVc.aud().intersects(paramBitSet))) {
        P(paramaVc);
        bool = true; } break;
    case 60:
      if ((paramaVc.bkw() != null) && (paramaVc.bkw().intersects(paramBitSet)))
      {
        P(paramaVc);
        bool = true; } break;
    case 40:
      if ((paramaVc.auc() != null) && (paramaVc.auc().intersects(paramBitSet))) {
        Q(paramaVc);
        bool = true;
      }

      break;
    }

    return bool;
  }

  protected void P(aVc paramaVc) {
    this.iwu.add(paramaVc.oj());
    this.iww.put(paramaVc.oj(), paramaVc);
  }

  protected void Q(aVc paramaVc) {
    this.iwv.add(paramaVc.oj());
    this.iww.put(paramaVc.oj(), paramaVc);
  }

  protected boolean R(aVc paramaVc) {
    return false;
  }

  protected boolean a(byte paramByte, aVc paramaVc, BitSet paramBitSet) {
    return false;
  }
}