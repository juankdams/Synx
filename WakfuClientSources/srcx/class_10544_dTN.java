public class dTN
{
  private long mqF;
  private byte mqG = 1;
  private byte mqH = 1;
  private bNa mqI;
  private bNa mqJ;

  public dTN(byte paramByte1, byte paramByte2, bNa parambNa1, bNa parambNa2)
  {
    this.mqG = paramByte1;
    this.mqH = paramByte2;
    this.mqJ = parambNa1;
    this.mqI = parambNa2;
    this.mqF = bop();
  }

  public byte dtE() {
    return this.mqG;
  }

  public void fX(byte paramByte) {
    this.mqG = paramByte;
    this.mqF = bop();
  }

  public byte dtF() {
    return this.mqH;
  }

  public void fY(byte paramByte) {
    this.mqH = paramByte;
    this.mqF = bop();
  }

  public bNa dtG() {
    return this.mqJ;
  }

  public void n(bNa parambNa) {
    if (this.mqJ == parambNa) {
      return;
    }
    this.mqJ = parambNa;
    this.mqF = bop();
  }

  public bNa dtH() {
    return this.mqI;
  }

  public void o(bNa parambNa) {
    if (this.mqI == parambNa) {
      return;
    }
    this.mqI = parambNa;
    this.mqF = bop();
  }

  public void cleanUp() {
  }

  public String dtI() {
    StringBuilder localStringBuilder = new StringBuilder("generatedGuildBanner-");
    localStringBuilder.append(this.mqG).append('-').append(this.mqH);
    localStringBuilder.append('-').append(this.mqJ.get()).append('-').append(this.mqI.get());
    return localStringBuilder.toString();
  }

  private long bop() {
    return byn.jp(dtI());
  }

  public long dtJ() {
    return this.mqF;
  }

  public dbY dtK() {
    short s1 = boJ.byr().e(this.mqI);
    short s2 = boJ.byr().e(this.mqJ);
    return new dbY(this.mqG, s1, this.mqH, s2);
  }
}