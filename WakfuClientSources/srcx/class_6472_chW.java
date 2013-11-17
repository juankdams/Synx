import javax.media.opengl.GLAutoDrawable;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class chW
  implements cSa, dDB
{
  private final afK hFY;
  private static final int hFZ = 5;
  private static final long hGa = 60000000L;
  private final long[] hGb = new long[5];
  private int hGc = -1;
  private long hGd = 0L;

  public chW() {
    this.hFY = new afK(this, null);
  }

  private int vo(int paramInt)
  {
    int i = paramInt % 5;
    if (i >= 0) {
      return i;
    }
    return i + 5;
  }

  public void b(GLAutoDrawable paramGLAutoDrawable) {
    int i = vo(++this.hGc);
    long l1 = System.nanoTime();
    this.hGb[i] = l1;

    if (l1 - this.hGd <= 60000000L) {
      return;
    }

    long l2 = l1 - this.hGb[vo(i + 1)];
    if (l2 == 0L) {
      return;
    }

    long l3 = Math.round(1000000000.0D / l2 * 4.0D);
    this.hFY.cYM.setText(Long.toString(l3));
    this.hGd = l1;
  }

  public void b(dnq paramdnq) {
    paramdnq.rs().a(this);
  }

  public void c(dnq paramdnq) {
    paramdnq.rs().b(this);
  }

  public JComponent bMJ() {
    return this.hFY;
  }

  public String getName() {
    return "FPS Viewer";
  }

  public void c(GLAutoDrawable paramGLAutoDrawable)
  {
  }

  public void a(GLAutoDrawable paramGLAutoDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(GLAutoDrawable paramGLAutoDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
  }
}