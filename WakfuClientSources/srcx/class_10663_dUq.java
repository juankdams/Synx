import java.awt.Point;
import java.util.ArrayList;
import javax.media.opengl.GL;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class dUq
{
  private static dUq hSy = new dUq();

  private static boolean DEBUG = false;
  private GL dzZ;
  private GLU dNJ = new GLU();
  private GLUquadric mrF = this.dNJ.gluNewQuadric();
  private int ia;
  private int ib;
  private Point mrG = new Point();
  private avN mrH;
  private final ArrayList mrI = new ArrayList();
  private GLDrawable mrJ;

  public static dUq dup()
  {
    return hSy;
  }

  public void a(GL paramGL, GLDrawable paramGLDrawable)
  {
    this.dzZ = paramGL;
    this.mrJ = paramGLDrawable;
    this.ia = this.mrJ.getWidth();
    this.ib = this.mrJ.getHeight();
  }

  public final Point duq()
  {
    return this.mrG;
  }

  public boolean g(avN paramavN)
  {
    return paramavN.d(this.mrH);
  }

  public avN dur()
  {
    return this.mrH;
  }

  public void h(avN paramavN)
  {
    if (!this.mrI.isEmpty()) {
      avN localavN = (avN)this.mrI.get(this.mrI.size() - 1);
      if (localavN.d(paramavN)) {
        paramavN.a(localavN, paramavN);
      }
      else
      {
        paramavN.setBounds(0, 0, 0, 0);
      }
    }

    this.mrI.add(paramavN);
    this.mrH = paramavN;
  }

  public void dus()
  {
    if (!this.mrI.isEmpty()) {
      ((avN)this.mrI.remove(this.mrI.size() - 1)).release();
      this.mrH = dut();
    }
  }

  public avN dut()
  {
    if (!this.mrI.isEmpty()) {
      return (avN)this.mrI.get(this.mrI.size() - 1);
    }
    return null;
  }

  public void fu(int paramInt1, int paramInt2)
  {
    this.ia = paramInt1;
    this.ib = paramInt2;
    this.mrH = avN.m(0, 0, paramInt1, paramInt2);
    this.mrG.setLocation(-paramInt1 / 2, -paramInt2 / 2);
  }

  public Or duu()
  {
    return new Or(this.ia, this.ib);
  }

  public void drawRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.dzZ.glBegin(2);
    this.dzZ.glVertex2i(paramInt1, paramInt2);
    this.dzZ.glVertex2i(paramInt1 + paramInt3, paramInt2);
    this.dzZ.glVertex2i(paramInt1 + paramInt3, paramInt2 + paramInt4);
    this.dzZ.glVertex2i(paramInt1, paramInt2 + paramInt4);
    this.dzZ.glEnd();
  }

  public void Q(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.dzZ.glBegin(7);
    this.dzZ.glVertex2i(paramInt1, paramInt2);
    this.dzZ.glVertex2i(paramInt1 + paramInt3, paramInt2);
    this.dzZ.glVertex2i(paramInt1 + paramInt3, paramInt2 + paramInt4);
    this.dzZ.glVertex2i(paramInt1, paramInt2 + paramInt4);
    this.dzZ.glEnd();
  }

  public void an(int paramInt1, int paramInt2, int paramInt3)
  {
    this.dNJ.gluQuadricTexture(this.mrF, true);
    this.dzZ.glTranslatef(paramInt1, paramInt2, 0.0F);
    this.dNJ.gluDisk(this.mrF, 0.0D, paramInt3, paramInt3 > 50 ? 32 : 16, 1);
    this.dzZ.glTranslatef(-paramInt1, -paramInt2, 0.0F);
  }

  public void setColor(bNa parambNa) {
    this.dzZ.glColor4f(parambNa.QC() / 255.0F, parambNa.QD() / 255.0F, parambNa.QE() / 255.0F, parambNa.getAlpha() / 255.0F);
  }

  public void translate(int paramInt1, int paramInt2) {
    this.dzZ.glTranslatef(paramInt1, paramInt2, 0.0F);
  }
}