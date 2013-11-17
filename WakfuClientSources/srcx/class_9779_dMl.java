import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.media.opengl.GLAutoDrawable;
import javax.swing.JComponent;
import javax.swing.JDialog;

public class dMl
  implements cSa, dDB, dbH
{
  private final dob mcw;

  public dMl()
  {
    this.mcw = new dob(null);
  }
  public static void main(String[] paramArrayOfString) {
    JDialog localJDialog = new JDialog();
    localJDialog.add(new dob(null));
    localJDialog.setVisible(true);
  }

  public void b(GLAutoDrawable paramGLAutoDrawable)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz != null) {
      cYk localcYk = localbyz.aKb();
      this.mcw.b(localcYk, localbyz.Lk());
    }
  }

  public void b(dnq paramdnq) {
    paramdnq.rs().a(this);
    paramdnq.rs().a(this, true);
  }

  public void c(dnq paramdnq) {
    paramdnq.rs().b(this);
    paramdnq.rs().a(this);
  }

  public JComponent bMJ() {
    return this.mcw;
  }

  public String getName() {
    return "Position Viewer";
  }

  public void c(GLAutoDrawable paramGLAutoDrawable) {
  }

  public void a(GLAutoDrawable paramGLAutoDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
  }

  public void a(GLAutoDrawable paramGLAutoDrawable, boolean paramBoolean1, boolean paramBoolean2) {
  }

  public boolean e(MouseEvent paramMouseEvent) {
    return false;
  }

  public boolean mousePressed(MouseEvent paramMouseEvent) {
    return false;
  }

  public boolean f(MouseEvent paramMouseEvent) {
    return false;
  }

  public boolean g(MouseEvent paramMouseEvent) {
    return false;
  }

  public boolean h(MouseEvent paramMouseEvent) {
    return false;
  }

  public boolean i(MouseEvent paramMouseEvent) {
    return false;
  }

  public boolean j(MouseEvent paramMouseEvent) {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    cYk localcYk = bYZ.a(localdSz, paramMouseEvent.getX(), paramMouseEvent.getY(), false);
    this.mcw.aj(localcYk);
    return false;
  }

  public boolean a(MouseWheelEvent paramMouseWheelEvent) {
    return false;
  }
}