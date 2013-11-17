import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.Collection;
import org.apache.log4j.Logger;

abstract class alE
  implements fe
{
  private static final Logger K = Logger.getLogger(alE.class);

  private final bMS dmx = new bMS();
  final ckT aCI;
  final byz dmy;
  Byte dmz;
  Su dmA;
  boolean dmB = false;
  private boolean dmC;
  private static final int cUE = 20;
  private boolean dmD;

  alE(ckT paramckT, byz parambyz)
  {
    this.aCI = paramckT;
    this.dmy = parambyz;
  }

  public final int ma()
  {
    int i = ayu();
    if (i != 0) {
      return i;
    }
    int j = ayt();
    if (j != 0) {
      return j;
    }

    return arg();
  }

  public final int mb() {
    this.dmB = true;
    try {
      return ma();
    } finally {
      this.dmB = false;
    }
  }

  public final void mc() {
    this.dmC = true;
  }

  abstract int arg();

  void G(Su paramSu)
  {
    this.dmA = paramSu;
    if (this.dmz == null)
      this.dmz = Byte.valueOf(this.dmA.Fx());
  }

  int ayo() {
    int i = this.dmx.a(this.aCI, this.dmz.byteValue()).sS();
    if (i != 0) {
      return i;
    }
    int j = ayv();
    if (j != 0) {
      return j;
    }
    if (!this.dmC) {
      localObject = new cKJ(this, null);
      if (((cKJ)localObject).cEf()) {
        this.dmD = true;
        return 0;
      }
    }

    Object localObject = new cIu(this, null);
    if (((cIu)localObject).cCs()) {
      j = ((cIu)localObject).cCt();
      if (j != 0) {
        return j;
      }
    }
    return ayq();
  }

  int ayp()
  {
    int i = ayr();
    if (i != 0)
      return i;
    return ays();
  }

  private int ayq()
  {
    if (!this.dmB) {
      boolean bool = WakfuClientInstance.awy().awB().a(bmz.fEy);
      bE localbE = new bE(this.dmA.getId(), bool);
      byv.bFN().aJK().d(localbE);
    }

    return 0;
  }

  private int ayr()
  {
    bvv localbvv = new bvv();
    for (byte b = 0; b < this.aCI.aEt().bgC(); b = (byte)(b + 1)) {
      if ((this.dmx.a(this.aCI, b).sS() == 0) && (!localbvv.contains(b))) {
        localbvv.add(b);
      }
    }
    if (localbvv.size() != 1)
      return 1041;
    this.dmz = Byte.valueOf(localbvv.rk(0));
    return 0;
  }

  private int ays() {
    Collection localCollection = this.aCI.bgG();
    for (Su localSu : localCollection)
      if (localSu.Fx() == this.dmz.byteValue())
      {
        this.dmA = localSu;
        int i = ayo();
        if (i == 0)
          return 0;
      }
    return 1041;
  }

  private int ayt()
  {
    if (this.dmy.adF()) {
      return 1023;
    }
    if (this.dmy.d(dKm.lWN) > 0) {
      return 1020;
    }
    if (this.dmy.bGK()) {
      return 1030;
    }
    if (aYP.feK.bnQ()) {
      return 1031;
    }
    return 0;
  }

  private int ayu() {
    dzm localdzm = this.aCI.aEu();
    if ((localdzm != dzm.lFJ) && (localdzm != dzm.lFL))
    {
      return 1024;
    }
    return 0;
  }

  private int ayv()
  {
    if (!this.dmA.adF()) {
      return 1022;
    }

    if (this.dmA.d(dKm.lWR) > 0) {
      return 1021;
    }
    int i = jd(20);
    if (i != 0) {
      return i;
    }
    return 0;
  }

  private int jd(int paramInt) {
    cew localcew = this.dmy.aeL();

    int i = localcew.dpB();
    int j = localcew.dpC();
    short s1 = localcew.dpD();

    int k = this.dmA.fa();
    int m = this.dmA.fb();
    short s2 = this.dmA.fc();

    Nm localNm = new Nm();
    localNm.caB = (paramInt * paramInt);
    localNm.caF = true;
    localNm.caA = false;

    cGw localcGw = new cGw();
    cwO.a(i, j, k, m, localcGw);

    dqg localdqg = dqg.cXq();
    localdqg.ae(i, j, s1);
    localdqg.af(k, m, s2);
    localdqg.a(localcew.BC(), localcew.afD(), localcew.arG());
    localdqg.a(localNm);
    localdqg.a(localcGw);
    int n = localdqg.cXv();
    localdqg.release();

    if (n == -1)
      return 1026;
    if (n >= paramInt)
      return 1042;
    return 0;
  }

  public boolean md() {
    return this.dmD;
  }
}