import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;

public abstract class bTp
{
  private final URL fAM;
  private AtomicReference heO;
  private crE epM = null;
  private cib heP = dma.ljQ;

  public bTp(URL paramURL) {
    this.fAM = paramURL;
    this.heO = new AtomicReference(awB.dLK);
  }

  public void a(crE paramcrE) {
    this.epM = paramcrE;
  }

  public void a(cib paramcib) {
    this.heP = paramcib;
    this.heP.c(this);
  }

  public cib bZN() {
    return this.heP;
  }

  public boolean bZO() {
    return (this.heP != null) && (this.heP.isValid());
  }

  public awB bZP() {
    return (awB)this.heO.get();
  }

  abstract OutputStream bQF();

  abstract boolean gg(boolean paramBoolean);

  void a(awB paramawB)
  {
    awB localawB = (awB)this.heO.getAndSet(paramawB);
    if ((this.epM != null) && (localawB != paramawB))
      this.epM.b(this);
  }

  URL bvo()
  {
    return this.fAM;
  }

  protected abstract String bQH();

  public String toString()
  {
    return '{' + getClass().getSimpleName() + ' ' + this.heO + " remote:" + this.fAM + " local:" + bQH() + '}';
  }
}