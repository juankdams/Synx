import com.sun.opengl.util.j2d.TextureRenderer;
import java.awt.EventQueue;
import java.awt.Frame;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

class aCR
  implements GLEventListener
{
  private GLU dXA;
  private Frame dXB;

  aCR(cLb paramcLb, GL paramGL, Frame paramFrame)
  {
    this.dXA = new GLU();
    this.dXB = paramFrame;
  }

  public void display(GLAutoDrawable paramGLAutoDrawable) {
    GL localGL = GLU.getCurrentGL();
    localGL.glClear(16640);

    if (cLb.f(this.dXC) == null) {
      return;
    }

    TextureRenderer localTextureRenderer = cLb.u(this.dXC);
    int i = localTextureRenderer.getWidth();
    int j = localTextureRenderer.getHeight();
    localTextureRenderer.beginOrthoRendering(i, j);
    localTextureRenderer.drawOrthoRect(0, 0);
    localTextureRenderer.endOrthoRendering();

    if ((this.dXB.getWidth() != i) || (this.dXB.getHeight() != j))
      EventQueue.invokeLater(new cfX(this, i, j));
  }

  public void a(GLAutoDrawable paramGLAutoDrawable)
  {
    this.dXA = null;
    this.dXB = null;
  }

  public void init(GLAutoDrawable paramGLAutoDrawable)
  {
  }

  public void reshape(GLAutoDrawable paramGLAutoDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void displayChanged(GLAutoDrawable paramGLAutoDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
  }
}