import org.apache.log4j.Logger;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class VH extends Canvas
{
  private static final Logger K = Logger.getLogger(VH.class);
  private int cAC;
  private int cAD;
  private int cAE;
  private Color cAF;
  private Color cAG;
  private float cAH;
  private int cAI;
  private int cAJ;
  private int cAK;
  private aRl cAL;
  private Runnable cAM;
  private GC cAN;

  public VH(Composite paramComposite, int paramInt)
  {
    super(paramComposite, paramInt);

    this.cAH = 0.0F;
    this.cAD = 150;

    this.cAJ = 4;
    this.cAI = 15;
    this.cAK = 15;

    this.cAE = 15;

    this.cAM = aiM();

    this.cAF = new Color(getDisplay(), 64, 64, 64);
    this.cAG = new Color(getDisplay(), 192, 192, 192);

    addPaintListener(new dyn(this));

    addDisposeListener(new dyo(this));
  }

  public void initialize()
  {
    this.cAN = new GC(this);
    this.cAN.setAntialias(-1);
  }

  public void start() {
    if (this.cAN == null) {
      throw new IllegalStateException("initialize() n'a pas été appelé !");
    }

    this.cAH = 0.0F;
    this.cAC = 0;

    this.cAI = 16;
    this.cAK = 15;

    if (this.cAL == null) {
      this.cAL = new aRl(this, null);
      this.cAL.start();
    }
  }

  public void stop() {
    if (this.cAL != null) {
      this.cAL.av(false);
      this.cAL = null;
    }
  }

  private Runnable aiM()
  {
    return new dyq(this);
  }

  private void a(GC paramGC)
  {
    Rectangle localRectangle = getBounds();

    paramGC.setBackground(this.cAF);
    paramGC.fillRectangle(localRectangle);

    b(paramGC);
  }

  private void b(GC paramGC) {
    Rectangle localRectangle = getBounds();
    int i = localRectangle.width / 2;
    int j = localRectangle.height / 2;

    float f1 = 6.283186F / this.cAI;
    for (int k = 0; k < this.cAI; k++) {
      float f2 = f1 * k;
      int m = Math.round(bCO.bI(f2) * this.cAK + i);
      int n = Math.round(bCO.bH(f2) * this.cAK + j);

      Color localColor = Y(f2);
      paramGC.setBackground(localColor);

      paramGC.fillOval(m, n, this.cAJ, this.cAJ);
      localColor.dispose();
    }
  }

  private Color Y(float paramFloat)
  {
    if (paramFloat < this.cAH) {
      paramFloat += 6.283186F;
    }

    float f1 = 6.283186F / this.cAI;

    float f2 = paramFloat - this.cAH - f1;
    float f3;
    if (f2 >= 0.0F)
      f3 = f2 / (6.283186F - f1);
    else {
      f3 = -f2 / f1;
    }

    int i = (int)bCO.s(this.cAF.getRed(), this.cAG.getRed(), f3);
    int j = (int)bCO.s(this.cAF.getGreen(), this.cAG.getGreen(), f3);
    int k = (int)bCO.s(this.cAF.getBlue(), this.cAG.getBlue(), f3);

    return new Color(getDisplay(), i, j, k);
  }
}