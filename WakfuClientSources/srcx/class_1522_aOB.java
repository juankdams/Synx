import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public final class aOB
  implements dGd
{
  private static Logger K = Logger.getLogger(aOB.class);
  public static final int evk = 25;
  public static final int evl = 10;
  private static final int evm = 0;
  private static final int evn = -75;
  private final dle evo;
  private final dle evp;
  private final bTI cpW;
  private bTI evq;
  private boolean evr;
  private gA evs;
  private int evt;
  private boolean evu;
  private int evv;
  private int evw;
  private int evx;
  private int evy;
  private int evz = 0;
  private int cxl;

  public aOB(dle paramdle1, dle paramdle2, bTI parambTI)
  {
    this.evp = paramdle2;
    this.evo = paramdle1;
    this.cpW = parambTI;
    this.evq = this.cpW;
  }

  public void bfu() {
    float f = this.cxl;

    this.evx = 0;
    this.evy = 0;
    this.evz = 0;

    bfy();

    bfB();
    bfC();
    bfv();

    f = f * (100 + this.evx) / 100.0F * (100 + this.evy) / 100.0F;

    this.cxl = Math.max(1, bMr.ax(f));
  }

  private void bfv() {
    this.evx = Math.max(0, this.evx);
    this.evy = Math.max(-75, this.evy);
  }

  private void bfw() {
    adr localadr = bfx();
    if (localadr == null) {
      return;
    }
    switch (localadr.aps()) {
    case 2:
      if (this.evo.b(eu.ayY)) {
        this.evx += this.evo.e(eu.ayY);
      }
      if (this.evp.b(eu.ayZ))
        this.evx -= this.evp.e(eu.ayZ);
      break;
    }
  }

  private adr bfx()
  {
    if ((this.cpW == bTI.heW) || (!this.evr)) {
      return null;
    }
    if (this.evp.atN() == null) {
      return null;
    }
    adr localadr = this.evp.atN().E(this.evo.fa(), this.evo.fb(), this.evo.fc());

    if (localadr == null) {
      K.error("Impossible de récupérer un partLocalisation...");
      return null;
    }
    return localadr;
  }

  private void bfy() {
    if ((this.evt & 0x2) == 0) {
      return;
    }
    if (this.cpW == bTI.hfb)
      this.evq = bfz();
    else {
      this.evq = this.cpW;
    }

    this.evx -= this.evw;

    dle localdle = this.evp.clC();
    eu localeu;
    if (localdle.c(cfY.hBZ)) {
      if (localdle.b(eu.azc)) {
        this.evx -= localdle.e(eu.azc);
      }
      localeu = this.evq.bZS();
      if (localdle.b(localeu))
        this.evx -= localdle.e(this.evq.bZS());
    }
    else {
      if (localdle.b(eu.azj)) {
        this.evx -= localdle.e(eu.azj);
      }
      localeu = this.evq.bZT();
      if (localdle.b(localeu))
        this.evx -= localdle.e(this.evq.bZT());
    }
  }

  private bTI bfz() {
    ArrayList localArrayList = new ArrayList();

    if (this.evp.b(bTI.heZ.bZT()))
      localArrayList.add(bTI.heZ);
    if (this.evp.b(bTI.hfa.bZT()))
      localArrayList.add(bTI.hfa);
    if (this.evp.b(bTI.heX.bZT()))
      localArrayList.add(bTI.heX);
    if (this.evp.b(bTI.heY.bZT())) {
      localArrayList.add(bTI.heY);
    }
    if (localArrayList.isEmpty()) {
      return this.cpW;
    }
    Collections.sort(localArrayList, new Ot(this));

    for (int i = 0; i < localArrayList.size() - 1; i++) {
      int j = this.evp.e(((bTI)localArrayList.get(i)).bZT());
      int k = this.evp.e(((bTI)localArrayList.get(i + 1)).bZT());
      if (j < k) {
        break;
      }
    }
    return (bTI)localArrayList.get(bCO.sf(i + 1));
  }

  private void bfA() {
    if (this.evs == null)
      return;
    if (this.evo.aLY() != 20) {
      return;
    }
    cvq localcvq = ((dhJ)this.evo).bGn();
    if ((localcvq == null) || (this.evs.oi() == null)) {
      return;
    }
    cyv localcyv = localcvq.b(bcR.fmZ, this.evs.oi().bKn().nc());
    if ((localcyv == null) || (localcyv.cvw().Wg() == null)) {
      return;
    }
    axk localaxk = localcyv.cvw().Wg();

    if (localaxk.aIW() == dht.lcr)
      this.evz = ((bns)localaxk).qq(localcyv.nU());
  }

  private void bfB()
  {
    if (((this.evt & 0x1) == 0) || (this.evo == null)) {
      return;
    }

    this.evx += this.evv;

    bfw();

    if (this.evo.c(cfY.hBZ)) {
      if (this.evo.b(eu.azj)) {
        this.evx += this.evo.e(eu.azj);
      }

      if (this.cpW != bTI.heW)
        this.evx += i(this.cpW.bZT());
    } else {
      if (this.evo.b(eu.azc)) {
        this.evx += this.evo.e(eu.azc);
      }

      if (this.cpW != bTI.heW) {
        this.evx += i(this.cpW.bZS());
      }
    }
    if (((this.evp instanceof dhJ)) && 
      (((dhJ)this.evp).aJr()) && (this.evo.b(eu.azJ))) {
      this.evx += this.evo.e(eu.azJ);
    }

    if (this.evu) {
      if (this.evo.b(eu.azF))
        this.evx += this.evo.e(eu.azF);
      if (this.evp.b(eu.aAm))
        this.evx -= this.evp.e(eu.aAm);
    }
  }

  private int i(eu parameu) {
    int i = 0;

    if (this.evo.b(parameu)) {
      Rx localRx = (Rx)this.evo.a(parameu);
      i += localRx.acU();
      if (i > localRx.lp())
        i = localRx.lp();
    }
    return i;
  }

  private void bfC() {
    this.evy += bfD();
    if (this.evo.c(cfY.hBZ)) {
      if (this.evo.b(eu.azD))
        this.evy += this.evo.e(eu.azD);
    } else if (this.evo.b(eu.azC)) {
      this.evy += this.evo.e(eu.azC);
    }

    if (this.evp.c(cfY.hBZ)) {
      if (this.evp.b(eu.azC))
        this.evy -= this.evp.e(eu.azC);
    } else if (this.evp.b(eu.azD))
      this.evy -= this.evp.e(eu.azD);
  }

  private int bfD()
  {
    adr localadr = bfx();
    if (localadr == null)
      return 0;
    switch (localadr.aps()) {
    case 2:
      return 25;
    case 1:
    case 3:
      return 10;
    }
    return 0;
  }

  public bTI bfE() {
    return this.evq;
  }

  public int getValue() {
    return this.cxl;
  }

  public void nq(int paramInt) {
    this.evt = paramInt;
  }

  public void dN(boolean paramBoolean) {
    this.evr = paramBoolean;
  }

  public void setValue(int paramInt) {
    this.cxl = paramInt;
  }

  public void I(gA paramgA) {
    this.evs = paramgA;
  }

  public void dO(boolean paramBoolean) {
    this.evu = paramBoolean;
  }

  public void nr(int paramInt) {
    this.evw = paramInt;
  }

  public void ns(int paramInt) {
    this.evv = paramInt;
  }
}