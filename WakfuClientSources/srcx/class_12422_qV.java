import java.nio.ByteBuffer;

public class qV
  implements dnm
{
  private final aTz aYE = new aTz();

  public qV() {
  }

  public qV(eo parameo) {
    parameo.j(this.aYE);
  }

  public boolean b(Hp paramHp) {
    aTz localaTz = paramHp.bPB.dVA;
    this.aYE.eRD = localaTz.eRD;
    this.aYE.aGg = localaTz.aGg;
    this.aYE.eRE = localaTz.eRE;
    this.aYE.eRH = localaTz.eRH;
    this.aYE.eRI = localaTz.eRI;
    this.aYE.eRF = localaTz.eRF;
    this.aYE.eRK = localaTz.eRK;
    this.aYE.eRJ = localaTz.eRJ;
    this.aYE.name = localaTz.name;
    this.aYE.eRM = localaTz.eRM;
    this.aYE.eRL = localaTz.eRL;
    this.aYE.eRG = localaTz.eRG;
    return true;
  }

  public boolean c(Hp paramHp) {
    paramHp.bPB = new dzL();
    aTz localaTz = paramHp.bPB.dVA;

    localaTz.eRD = this.aYE.eRD;
    localaTz.aGg = this.aYE.aGg;
    localaTz.eRE = this.aYE.eRE;
    localaTz.eRH = this.aYE.eRH;
    localaTz.eRI = this.aYE.eRI;
    localaTz.eRF = this.aYE.eRF;
    localaTz.eRK = this.aYE.eRK;
    localaTz.eRJ = this.aYE.eRJ;
    localaTz.name = this.aYE.name;
    localaTz.eRM = this.aYE.eRM;
    localaTz.eRL = this.aYE.eRL;
    localaTz.eRG = this.aYE.eRG;

    return true;
  }

  public void b(ByteBuffer paramByteBuffer) {
    this.aYE.g(paramByteBuffer);
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.aYE.h(paramByteBuffer);
  }

  public int O() {
    return this.aYE.O();
  }

  public byte xH() {
    return dIi.lTd.ewr;
  }

  public aTz xI() {
    return this.aYE;
  }
}