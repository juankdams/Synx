import org.apache.log4j.Logger;

public class cwM
  implements aVF
{
  private static final Logger K = Logger.getLogger(cwM.class);
  private long ijd;
  private short cZu = 1;
  private final boolean ije;

  public cwM(boolean paramBoolean)
  {
    this.ije = paramBoolean;
  }

  public long blf() {
    return this.ijd;
  }

  public short nU() {
    return this.cZu;
  }

  public void reset() {
    this.ijd = 0L;
    this.cZu = 1;
  }

  public cOB ble() {
    return PF.abu();
  }

  public float ayY()
  {
    return ble().d(this.cZu, this.ijd);
  }

  public float ctW() {
    return ble().d(this.cZu, this.ijd);
  }

  private uP h(short paramShort, long paramLong) {
    long l = paramLong - blf();
    short s = (short)(paramShort - nU());

    this.cZu = paramShort;
    this.ijd = paramLong;

    return new uP(l, s);
  }

  private uP hO(long paramLong) {
    short s = ble().cF(paramLong);
    return h(s, paramLong);
  }

  public uP eK(long paramLong) {
    if (!ble().cG(paramLong)) {
      K.error("Valeur d'expérience non valide : " + paramLong);
      return uP.biS;
    }

    if (paramLong > ctX()) {
      K.error("On essaye d'ajouter plus d'xp que ce que le cap permet", new Exception());
      paramLong = ctX();
    }

    if (blf() == paramLong) {
      return uP.biS;
    }

    return hO(paramLong);
  }

  public uP da(long paramLong)
  {
    long l = hP(paramLong);

    if (l <= 0L) {
      return uP.biS;
    }

    return eK(blf() + l);
  }

  private long hP(long paramLong) {
    return Math.max(0L, Math.min(paramLong, ctX() - blf()));
  }

  public long ctX() {
    return (this.ije) && (140 < ble().nV()) ? ble().hR(140) : ble().aqM();
  }

  public short ctY()
  {
    return (this.ije) && (140 < ble().nV()) ? 140 : PF.abu().nV();
  }

  public uP bs(short paramShort)
  {
    if (!ble().ap(paramShort)) {
      K.error("Valeur de niveau non valide : " + paramShort);
      return uP.biS;
    }

    if (paramShort > ctY()) {
      K.error("Valeur de niveau non valide : supérieure au cap ! : " + paramShort, new Exception());
      paramShort = ctY();
    }

    if (nU() == paramShort) {
      return uP.biS;
    }

    long l = ble().hR(paramShort);
    return h(paramShort, l);
  }
}