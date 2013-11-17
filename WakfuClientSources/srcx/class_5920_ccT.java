import org.apache.log4j.Logger;

public class ccT
{
  protected static Logger K = Logger.getLogger(ccT.class);
  private int hvC;
  private double hvD;
  private double hvE;
  private double hvF;
  private double hvG;

  public int cfR()
  {
    return this.hvC;
  }

  public void uH(int paramInt) {
    this.hvC = paramInt;
  }

  public double cfS() {
    return this.hvD;
  }

  public void F(double paramDouble) {
    this.hvD = paramDouble;
  }

  public double cfT() {
    return this.hvE;
  }

  public void G(double paramDouble) {
    this.hvE = paramDouble;
  }

  public double cfU() {
    return this.hvF;
  }

  public void H(double paramDouble) {
    this.hvF = paramDouble;
  }

  public double cfV() {
    return this.hvG;
  }

  public void I(double paramDouble) {
    this.hvG = paramDouble;
  }

  public void bIt() {
    K.info("Benchmark result :");
    K.info("\t* best texture format : " + (this.hvC == 6408 ? "RGBA" : "BGRA"));
    K.info("\t* rgba bandwidth index : " + this.hvD);
    K.info("\t* bgra bandwidth index : " + this.hvE);

    K.info("\t* pixel fillrate index : " + this.hvF);
    K.info("\t* texture fillrate index : " + this.hvG);
  }
}