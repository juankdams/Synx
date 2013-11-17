import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.log4j.Logger;

public class cYq
  implements dxL
{
  private static final Logger K;
  public static final TimeZone iDd;
  private static final GregorianCalendar kyk;
  public static final long kLT = 0L;
  public static final dxL kLU = jq(0L);
  private int aMQ;
  private int aMR;
  private int aMS;
  private int kLV;
  private int kLD;
  private int gJV;
  private long brA;

  private cYq()
  {
  }

  public cYq(dxL paramdxL)
  {
    if (paramdxL != null)
      P(paramdxL);
    else
      P(kLU);
  }

  public cYq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    set(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }

  public void set(long paramLong)
  {
    if (paramLong == 0L) {
      cLN();
      return;
    }

    synchronized (kyk) {
      kyk.clear();
      kyk.setTimeZone(iDd);
      kyk.setTimeInMillis(paramLong);
      this.aMQ = kyk.get(13);
      this.aMR = kyk.get(12);
      this.aMS = kyk.get(11);
      this.kLV = kyk.get(5);
      this.kLD = (kyk.get(2) + 1);
      if (kyk.get(0) == 1)
        this.gJV = kyk.get(1);
      else {
        this.gJV = (1 - kyk.get(1));
      }
      this.brA = kyk.getTimeInMillis();
    }
  }

  public void P(dxL paramdxL) {
    if (paramdxL.avJ())
      cLN();
    else
      set(paramdxL.getSeconds(), paramdxL.getMinutes(), paramdxL.getHours(), paramdxL.getDay(), paramdxL.getMonth(), paramdxL.getYear());
  }

  public void set(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.gJV = paramInt6;
    this.kLD = paramInt5;
    this.kLV = paramInt4;
    this.aMS = paramInt3;
    this.aMR = paramInt2;
    this.aMQ = paramInt1;
    normalize();
  }

  public void normalize()
  {
    synchronized (kyk) {
      kyk.clear();
      kyk.setTimeZone(iDd);
      kyk.set(this.gJV, this.kLD - 1, this.kLV, this.aMS, this.aMR, this.aMQ);
      this.brA = kyk.getTimeInMillis();
      this.aMQ = kyk.get(13);
      this.aMR = kyk.get(12);
      this.aMS = kyk.get(11);
      this.kLV = kyk.get(5);
      this.kLD = (kyk.get(2) + 1);
      if (kyk.get(0) == 1)
        this.gJV = kyk.get(1);
      else
        this.gJV = (1 - kyk.get(1));
    }
  }

  public static cYq cLM()
  {
    cYq localcYq = new cYq();
    localcYq.cLN();
    return localcYq;
  }

  public static void setTimeZone(TimeZone paramTimeZone) {
    kyk.setTimeZone(paramTimeZone);
  }

  public boolean avJ()
  {
    return this.brA == 0L;
  }

  private void cLN() {
    this.brA = 0L;
    this.gJV = kLU.getYear();
    this.kLD = kLU.getMonth();
    this.kLV = kLU.getDay();
    this.aMS = kLU.getHours();
    this.aMR = kLU.getMinutes();
    this.aMQ = kLU.getSeconds();
  }

  public boolean Q(dxL paramdxL)
  {
    return (avJ()) || (U(paramdxL) < 0);
  }

  public boolean R(dxL paramdxL) {
    return (avJ()) || (U(paramdxL) <= 0);
  }

  public boolean S(dxL paramdxL) {
    return (!avJ()) && (U(paramdxL) > 0);
  }

  public boolean T(dxL paramdxL)
  {
    return (!avJ()) && (U(paramdxL) >= 0);
  }

  public int U(dxL paramdxL)
  {
    if (avJ()) {
      return paramdxL.avJ() ? 0 : -1;
    }

    if (paramdxL.avJ()) {
      return 1;
    }

    if (this.gJV > paramdxL.getYear())
      return 1;
    if (this.gJV < paramdxL.getYear()) {
      return -1;
    }

    if (this.kLD > paramdxL.getMonth())
      return 1;
    if (this.kLD < paramdxL.getMonth()) {
      return -1;
    }

    if (this.kLV > paramdxL.getDay())
      return 1;
    if (this.kLV < paramdxL.getDay()) {
      return -1;
    }

    if (this.aMS > paramdxL.getHours())
      return 1;
    if (this.aMS < paramdxL.getHours()) {
      return -1;
    }

    if (this.aMR > paramdxL.getMinutes())
      return 1;
    if (this.aMR < paramdxL.getMinutes()) {
      return -1;
    }

    if (this.aMQ > paramdxL.getSeconds())
      return 1;
    if (this.aMQ < paramdxL.getSeconds()) {
      return -1;
    }

    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    cYq localcYq = (cYq)paramObject;

    if (avJ()) {
      return localcYq.avJ();
    }
    if (this.kLV != localcYq.kLV) {
      return false;
    }
    if (this.aMS != localcYq.aMS) {
      return false;
    }
    if (this.aMR != localcYq.aMR) {
      return false;
    }
    if (this.kLD != localcYq.kLD) {
      return false;
    }
    if (this.aMQ != localcYq.aMQ) {
      return false;
    }
    if (this.gJV != localcYq.gJV) {
      return false;
    }

    return true;
  }

  public cYq n(cds paramcds)
  {
    if (avJ()) {
      return this;
    }
    E(paramcds.getSeconds(), paramcds.getMinutes(), paramcds.getHours(), paramcds.getDays());

    return this;
  }

  public cYq o(cds paramcds) {
    if (avJ()) {
      return this;
    }
    F(paramcds.getSeconds(), paramcds.getMinutes(), paramcds.getHours(), paramcds.getDays());

    return this;
  }

  public dxL b(yd paramyd) {
    return b(paramyd.getSeconds(), paramyd.getMinutes(), paramyd.getHours(), paramyd.getDays(), paramyd.getMonths(), paramyd.getYears());
  }

  public dxL c(yd paramyd) {
    return c(paramyd.getSeconds(), paramyd.getMinutes(), paramyd.getHours(), paramyd.getDays(), paramyd.getMonths(), paramyd.getYears());
  }

  public dxL zp(int paramInt) {
    cYq localcYq = new cYq(this);
    localcYq.F(0, 0, 0, paramInt);
    return localcYq;
  }

  public dxL cLO() {
    return zp(1);
  }

  public dxL zq(int paramInt) {
    cYq localcYq = new cYq(this);
    localcYq.E(0, 0, 0, paramInt);
    return localcYq;
  }

  public dxL cLP() {
    return zq(1);
  }

  public kb V(dxL paramdxL)
  {
    if ((!bB) && (avJ())) throw new AssertionError("Onessaye de calculer une différence à partir d'une date nulle.");
    if ((!bB) && (paramdxL.avJ())) throw new AssertionError("On essaye de calculer une différence avec une date nulle");

    normalize();
    paramdxL.normalize();

    long l = (paramdxL.rP() - rP()) / 1000L;
    return new kb(l);
  }

  public dxL a(dxL paramdxL, cds paramcds) {
    return b(paramdxL, paramcds, false);
  }

  public dxL b(dxL paramdxL, cds paramcds, boolean paramBoolean)
  {
    if ((!bB) && (avJ())) throw new AssertionError("On essaye de calculer une date à partir d'une date nulle.");
    if ((!bB) && (paramdxL.avJ())) throw new AssertionError("On essaye de calculer une date avec une date nulle");
    if ((!bB) && (paramcds.isEmpty())) throw new AssertionError("On essaye de calculer une date avec un interval nul");

    kb localkb1 = paramdxL.V(this);
    int i = localkb1.rN() ? 0 : -1;
    int j = paramBoolean ? 1 : 0;

    kb localkb2 = new kb(paramcds);

    int k = localkb1.d(paramcds) + i + j;
    localkb2.bi(k);

    cYq localcYq = new cYq(paramdxL);
    localcYq.n(localkb2);

    return localcYq;
  }

  public int W(dxL paramdxL)
  {
    cYq localcYq1 = new cYq(0, 0, 0, this.kLV, this.kLD, this.gJV);
    cYq localcYq2 = new cYq(0, 0, 0, paramdxL.getDay(), paramdxL.getMonth(), paramdxL.getYear());
    kb localkb = new kb((localcYq2.rP() - localcYq1.rP()) / 1000L);
    int i = localkb.getDays();
    if (localkb.getHours() > 12) {
      i++;
    }

    return i;
  }

  public cYq b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (avJ()) {
      return this;
    }
    this.aMQ += paramInt1;
    this.aMR += paramInt2;
    this.aMS += paramInt3;
    this.kLV += paramInt4;
    this.kLD += paramInt5;
    this.gJV += paramInt6;
    normalize();
    return this;
  }

  public cYq E(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return b(paramInt1, paramInt2, paramInt3, paramInt4, 0, 0);
  }

  public cYq zr(int paramInt) {
    this.kLD += paramInt;
    normalize();
    return this;
  }

  public cYq zs(int paramInt) {
    this.gJV += paramInt;
    normalize();
    return this;
  }

  public cYq F(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (avJ()) {
      return this;
    }
    this.aMQ -= paramInt1;
    this.aMR -= paramInt2;
    this.aMS -= paramInt3;
    this.kLV -= paramInt4;
    normalize();
    return this;
  }

  public cYq c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (avJ()) {
      return this;
    }
    this.aMQ -= paramInt1;
    this.aMR -= paramInt2;
    this.aMS -= paramInt3;
    this.kLV -= paramInt4;
    this.kLD -= paramInt5;
    this.gJV -= paramInt6;
    normalize();
    return this;
  }

  public void cLQ()
  {
    if (avJ()) {
      return;
    }
    this.aMS = 0;
    this.aMR = 0;
    this.aMQ = 0;
    normalize();
  }

  public void cLR()
  {
    if (avJ()) {
      return;
    }
    this.aMR = 0;
    this.aMQ = 0;
    normalize();
  }

  public int get(int paramInt) {
    synchronized (kyk) {
      kyk.setTimeInMillis(this.brA);
      return kyk.get(paramInt);
    }
  }

  public static cYq h(Date paramDate)
  {
    synchronized (kyk) {
      kyk.clear();
      kyk.setTimeZone(iDd);
      kyk.setTime(paramDate);
      int i;
      if (kyk.get(0) == 1)
        i = kyk.get(1);
      else {
        i = 1 - kyk.get(1);
      }

      return new cYq(kyk.get(13), kyk.get(12), kyk.get(11), kyk.get(5), kyk.get(2) + 1, i);
    }
  }

  public static cYq jq(long paramLong)
  {
    synchronized (kyk) {
      kyk.clear();
      kyk.setTimeZone(iDd);
      kyk.setTimeInMillis(paramLong);
      int i;
      if (kyk.get(0) == 1)
        i = kyk.get(1);
      else {
        i = 1 - kyk.get(1);
      }

      return new cYq(kyk.get(13), kyk.get(12), kyk.get(11), kyk.get(5), kyk.get(2) + 1, i);
    }
  }

  public long cLS()
  {
    if ((!bB) && (avJ())) throw new AssertionError("On essaye de calculer les heurs d'une date nulle");
    synchronized (kyk) {
      kyk.clear();
      kyk.setTimeZone(iDd);
      kyk.set(this.gJV, this.kLD - 1, this.kLV, this.aMS, 0, 0);
      return kyk.getTimeInMillis();
    }
  }

  public long cLT()
  {
    if ((!bB) && (avJ())) throw new AssertionError("On essaye de calculer les jours d'une date nulle");
    synchronized (kyk) {
      kyk.clear();
      kyk.setTimeZone(iDd);
      kyk.set(this.gJV, this.kLD - 1, this.kLV, 0, 0, 0);
      return kyk.getTimeInMillis();
    }
  }

  public long rP() {
    return this.brA;
  }

  public Date cLU() {
    if ((!bB) && (avJ())) throw new AssertionError("On essaye de convertir une date nulle");
    synchronized (kyk) {
      kyk.clear();
      kyk.setTimeZone(iDd);
      kyk.set(this.gJV, this.kLD - 1, this.kLV, this.aMS, this.aMR, this.aMQ);
      return kyk.getTime();
    }
  }

  public int getDay() {
    return this.kLV;
  }

  public int getHours() {
    return this.aMS;
  }

  public int getMinutes() {
    return this.aMR;
  }

  public int getMonth() {
    return this.kLD;
  }

  public int getSeconds() {
    return this.aMQ;
  }

  public int getYear() {
    return this.gJV;
  }

  public void setSeconds(int paramInt) {
    this.aMQ = paramInt;
    normalize();
  }

  public void setMinutes(int paramInt) {
    this.aMR = paramInt;
    normalize();
  }

  public void setHours(int paramInt) {
    this.aMS = paramInt;
    normalize();
  }

  public void setDay(int paramInt) {
    this.kLV = paramInt;
    normalize();
  }

  public void setMonth(int paramInt) {
    this.kLD = paramInt;
    normalize();
  }

  public void setYear(int paramInt) {
    this.gJV = paramInt;
    normalize();
  }

  public String toString()
  {
    if (avJ()) {
      return "Date{ nulle }";
    }
    int i = kyk.getTimeZone().getRawOffset() / 3600000;
    if (i >= 0) {
      return bAL.a("{Date : %d/%M/%Y %h:%m:%s UTC+" + i + "}", this);
    }
    return bAL.a("{Date : %d/%M/%Y %h:%m:%s UTC" + i + "}", this);
  }

  public String cLV()
  {
    if (avJ()) {
      return "null date";
    }
    return bAL.a("%d/%M/%Y %hH%mmin", this);
  }

  static
  {
    K = Logger.getLogger(cYq.class);

    iDd = TimeZone.getTimeZone("UTC");
    kyk = new GregorianCalendar(iDd);

    K.info("GameDate initialized. Timezone : " + kyk.getTimeZone());
  }
}