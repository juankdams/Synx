import org.apache.log4j.Logger;

public class alY
{
  private static final Logger K = Logger.getLogger(alY.class);
  public static final int dnM = -1;
  private final int aVh;
  private final adl dnN = new adl();

  public alY(int paramInt) {
    this.aVh = paramInt;
  }

  public boolean be(int paramInt1, int paramInt2) {
    return this.dnN.p(paramInt1, paramInt2);
  }

  public boolean p(int paramInt1, int paramInt2) {
    return (this.dnN.p(paramInt1, paramInt2)) && (!this.dnN.eX(paramInt1, paramInt2));
  }

  public final int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3) {
    if (!p(paramInt1, paramInt2)) {
      return -1;
    }
    return this.dnN.a(paramInt1, paramInt2, paramArrayOfbep, paramInt3);
  }

  public int a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc, int paramInt3) {
    if (!p(paramInt1, paramInt2)) {
      return -1;
    }
    return this.dnN.a(paramInt1, paramInt2, paramArrayOfcZc, paramInt3);
  }

  public int getWidth() {
    return this.dnN.app();
  }

  public int getHeight() {
    return this.dnN.apq();
  }

  public void g(aYQ paramaYQ) {
    int i = paramaYQ.readByte();
    this.dnN.d(paramaYQ);
  }

  public boolean bf(int paramInt1, int paramInt2) {
    return p(paramInt1, paramInt2);
  }

  public int RV() {
    return this.aVh;
  }

  public boolean I(int paramInt1, int paramInt2) {
    if ((!bB) && (!this.dnN.p(paramInt1, paramInt2))) throw new AssertionError();
    return this.dnN.I(paramInt1, paramInt2);
  }

  public boolean bg(int paramInt1, int paramInt2) {
    if ((!bB) && (!this.dnN.p(paramInt1, paramInt2))) throw new AssertionError();
    return (this.dnN.eX(paramInt1, paramInt2)) || (this.dnN.aS(paramInt1, paramInt2));
  }
}