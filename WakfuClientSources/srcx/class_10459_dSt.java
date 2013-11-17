import java.nio.ByteBuffer;

public final class dSt extends drI
  implements dUC
{
  private ByteBuffer mor;
  private long mos = this.lub;
  private dwr mot;

  public dSt()
  {
    initialize();
  }

  public byte cIB() {
    return 18;
  }

  protected long cYt() {
    return this.mos;
  }

  protected ByteBuffer getImageData() {
    return this.mor;
  }

  protected int getImageWidth() {
    return this.mot != null ? this.mot.getWidth() : 0;
  }

  protected int getImageHeight() {
    return this.mot != null ? this.mot.getHeight() : 0;
  }

  public void a(bnX parambnX, dcj[] paramArrayOfdcj, dwr paramdwr) {
    if (this.mos != this.lub)
      this.mos += 1L;
    else {
      this.mos = 1L;
    }
    this.mot = paramdwr;
    this.mor = paramArrayOfdcj[0].q(0L, paramArrayOfdcj[0].size());
  }
}