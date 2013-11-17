import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

public class DB
  implements Uq
{
  private final Fi bIu = new Fi(0, 0, 0, 0);
  protected float bIv;
  protected float bIw;
  protected boolean aYZ;
  private boolean bIx;

  public DB()
  {
    setVisible(false);
  }

  public final Fi MG() {
    return this.bIu;
  }

  public float MH() {
    return this.bIv;
  }

  public float MI() {
    return this.bIw;
  }

  public void W(int paramInt1, int paramInt2) {
    this.bIv = paramInt1;
    this.bIw = paramInt2;
    this.bIu.set(0, 0, paramInt1, paramInt2);
  }

  public void init(GLAutoDrawable paramGLAutoDrawable) {
    W(paramGLAutoDrawable.getWidth(), paramGLAutoDrawable.getHeight());
  }

  public void cz(int paramInt)
  {
  }

  public void a(GL paramGL)
  {
  }

  public void uninitialize()
  {
    ax(false);
    this.aYZ = true;
  }

  public boolean isInitialized() {
    return this.bIx;
  }

  public void ax(boolean paramBoolean) {
    this.bIx = paramBoolean;
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public void aJ()
  {
    if (!isInitialized()) {
      ax(true);
      this.aYZ = true;
    }
  }

  public void bc()
  {
    if (isInitialized())
      uninitialize();
  }
}