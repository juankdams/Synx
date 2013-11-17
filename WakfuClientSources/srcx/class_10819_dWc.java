public class dWc
{
  public static final dWc mvm = new dWc();

  private cxu mvn = null;

  public boolean isRunning() {
    return this.mvn != null;
  }

  public void c(aTL paramaTL, int paramInt1, int paramInt2) {
    if (this.mvn != null)
      this.mvn.c(paramaTL, paramInt1, paramInt2);
  }

  public void d(aTL paramaTL, int paramInt1, int paramInt2) {
    if (this.mvn != null) {
      this.mvn.d(paramaTL, paramInt1, paramInt2);
      this.mvn = null;
    }
  }

  public void a(Class paramClass, duv paramduv1, duv paramduv2) {
    this.mvn = new cxu(paramClass, paramduv1, paramduv2);
    this.mvn.start();
  }

  public void stop() {
    if (this.mvn != null) {
      this.mvn.stop();
      this.mvn = null;
    }
  }
}