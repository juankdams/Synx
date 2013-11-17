import org.apache.log4j.Logger;

public class bGl
{
  protected static final Logger K = Logger.getLogger(bGl.class);
  private short cZu;
  private long gCz;
  private final cOB gyR;

  public bGl(cOB paramcOB)
  {
    this.gyR = paramcOB;
  }

  public cOB ble() {
    return this.gyR;
  }

  public long ayX() {
    return this.gCz;
  }

  public short nU() {
    return this.cZu;
  }

  public String ayZ() {
    return ble().cH(this.gCz) + '/' + ble().aq(this.cZu);
  }

  public float ayY()
  {
    return ble().d(this.cZu, this.gCz);
  }

  public uP e(short paramShort, long paramLong) {
    if ((!ble().ap(paramShort)) || (!ble().cG(paramLong))) {
      return uP.biS;
    }

    return h(paramShort, paramLong);
  }

  public uP d(short paramShort, boolean paramBoolean) {
    if (!ble().ap(paramShort)) {
      throw new IllegalArgumentException("Valeur de niveau non valide : " + paramShort);
    }

    if (this.cZu == paramShort) {
      return uP.biS;
    }

    return h(paramShort, paramBoolean ? ble().hR(paramShort) : this.gCz);
  }

  public uP m(long paramLong, boolean paramBoolean)
  {
    if (!ble().cG(paramLong)) {
      throw new IllegalArgumentException("Valeur d'expérience non valide : " + paramLong);
    }

    if (this.gCz == paramLong) {
      return uP.biS;
    }

    return h(paramBoolean ? ble().cF(paramLong) : this.cZu, paramLong);
  }

  public uP da(long paramLong)
  {
    if (paramLong < 0L) {
      K.error("Impossible d'ajouter une expérience négative (" + paramLong + "). Il faut plutôt utiliser Levelable.removeXp");
      return uP.biS;
    }
    if (paramLong == 0L) {
      return uP.biS;
    }
    long l = Math.min(this.gCz + paramLong, ble().aqM());
    if (l == this.gCz) {
      return uP.biS;
    }

    short s = ble().cF(l);

    return h(s, l);
  }

  public uP gD(long paramLong)
  {
    if (paramLong < 0L) {
      K.error("Impossible de supprimer une expérience négative (" + paramLong + "). Il faut plutôt utiliser Levelable.addXp");
      return uP.biS;
    }
    if (paramLong == 0L) {
      return uP.biS;
    }
    long l = Math.max(this.gCz - paramLong, ble().aqL());
    if (l == this.gCz) {
      return uP.biS;
    }

    short s = ble().cF(l);

    return h(s, l);
  }

  private uP h(short paramShort, long paramLong) {
    short s = (short)(paramShort - this.cZu);
    long l = paramLong - this.gCz;
    this.cZu = paramShort;
    this.gCz = paramLong;

    return new uP(l, s);
  }

  public uP ga(boolean paramBoolean)
  {
    if (this.cZu + 1 > ble().nV()) {
      return uP.biS;
    }

    return d((short)(this.cZu + 1), paramBoolean);
  }

  public void clear() {
    this.gCz = 0L;
    this.cZu = 0;
  }
}