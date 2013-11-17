import com.sun.opengl.util.texture.TextureCoords;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public final class cwz
{
  public static final cwz iiH = new cwz();
  private boolean bIx;
  private JFrame fsi;
  private float aOR;
  private float aOS;
  private cEl iiI;
  private cEl iiJ;
  private cEh iiK;
  private uz UI;
  private TextureCoords iiL;
  private int iiM;
  private int iiN;
  private boolean aVO;
  private BufferedImage eta;
  private final ArrayList iiO = new ArrayList();
  private final ArrayList cWn = new ArrayList();

  public void initialize()
  {
    SwingUtilities.invokeLater(new bcZ(this));

    this.bIx = true;
  }

  public void a(float paramFloat1, float paramFloat2, cEl paramcEl1, cEl paramcEl2, cEh paramcEh) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.iiI = paramcEl1;
    this.iiJ = paramcEl2;
    this.iiK = paramcEh;
  }

  private void a(Graphics paramGraphics, cEh[] paramArrayOfcEh, int paramInt1, int paramInt2) {
    paramGraphics.drawLine((int)(paramInt1 + paramArrayOfcEh[0].getX()), (int)(paramInt2 - paramArrayOfcEh[0].getY()), (int)(paramInt1 + paramArrayOfcEh[1].getX()), (int)(paramInt2 - paramArrayOfcEh[1].getY()));
    paramGraphics.drawLine((int)(paramInt1 + paramArrayOfcEh[1].getX()), (int)(paramInt2 - paramArrayOfcEh[1].getY()), (int)(paramInt1 + paramArrayOfcEh[2].getX()), (int)(paramInt2 - paramArrayOfcEh[2].getY()));
    paramGraphics.drawLine((int)(paramInt1 + paramArrayOfcEh[2].getX()), (int)(paramInt2 - paramArrayOfcEh[2].getY()), (int)(paramInt1 + paramArrayOfcEh[3].getX()), (int)(paramInt2 - paramArrayOfcEh[3].getY()));
    paramGraphics.drawLine((int)(paramInt1 + paramArrayOfcEh[3].getX()), (int)(paramInt2 - paramArrayOfcEh[3].getY()), (int)(paramInt1 + paramArrayOfcEh[0].getX()), (int)(paramInt2 - paramArrayOfcEh[0].getY()));
  }

  public void update()
  {
    if (!this.bIx) {
      return;
    }
    if (this.fsi == null) {
      return;
    }
    Container localContainer = this.fsi.getContentPane();
    Graphics localGraphics = localContainer.getGraphics();
    int i = localContainer.getWidth() / 2;
    int j = localContainer.getHeight() / 2;

    localGraphics.clearRect(0, 0, localContainer.getWidth(), localContainer.getHeight());

    localGraphics.setColor(Color.GRAY);
    for (cEh[] arrayOfcEh : this.iiO) {
      a(localGraphics, arrayOfcEh, i, j);
    }
    int k = (int)(i + this.aOR);
    int m = (int)(j - this.aOS);

    for (aNu localaNu : this.cWn) {
      aNu.a(localaNu, localGraphics, k, m);
    }
    if (this.eta != null) {
      localGraphics.drawImage(this.eta, 0, 0, null);
      if (this.aVO)
        localGraphics.setColor(Color.YELLOW);
      else
        localGraphics.setColor(new Color(64, 64, 64));
      localGraphics.drawOval(this.iiM, this.iiN, 1, 1);
    }

    if (this.iiI != null) {
      localGraphics.setColor(Color.RED);
      localGraphics.drawLine(k, m, (int)(k + this.iiI.getX()), (int)(m - this.iiI.getY()));
    }
    if (this.iiJ != null) {
      localGraphics.setColor(Color.PINK);
      localGraphics.drawLine(k, m, (int)(k + this.iiJ.getX()), (int)(m - this.iiJ.getY()));
    }
    localGraphics.setColor(Color.BLUE);
    if (this.iiK != null)
      localGraphics.drawLine(k, m, (int)(k + this.iiK.getX()), (int)(m - this.iiK.getY()));
  }

  public void a(aNu paramaNu) {
    this.cWn.add(paramaNu);
  }

  public void a(cEh[] paramArrayOfcEh) {
    this.iiO.add(paramArrayOfcEh);
  }

  public void a(uz paramuz, TextureCoords paramTextureCoords) {
    if ((this.UI == paramuz) && (a(paramTextureCoords, this.iiL)))
      return;
    this.UI = paramuz;
    this.iiL = paramTextureCoords;

    cSJ localcSJ = this.UI.wn(0);
    int i = localcSJ.getWidth();
    int j = localcSJ.getHeight();

    this.eta = new BufferedImage(i, j, 2);

    dKq localdKq = localcSJ.cIz();
    int k = new Color(128, 20, 128).getRGB();
    int m = new Color(192, 192, 192).getRGB();
    try
    {
      for (int n = 0; n < j; n++)
        for (int i1 = 0; i1 < i; i1++)
          this.eta.setRGB(i1, n, localdKq.fj(i1, n) ? k : m);
    }
    catch (Exception localException)
    {
    }
  }

  private static boolean a(TextureCoords paramTextureCoords1, TextureCoords paramTextureCoords2) {
    if ((paramTextureCoords1 == null) || (paramTextureCoords2 == null))
      return true;
    return (paramTextureCoords1.left() == paramTextureCoords2.left()) && (paramTextureCoords1.bottom() == paramTextureCoords2.bottom()) && (paramTextureCoords1.right() == paramTextureCoords2.right()) && (paramTextureCoords1.top() == paramTextureCoords2.left());
  }

  public void i(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.iiM = paramInt1;
    this.iiN = paramInt2;
    this.aVO = paramBoolean;
  }

  public void clear() {
    this.iiO.clear();
    this.cWn.clear();
  }

  static
  {
    if (!iiH.bIx)
      iiH.initialize();
  }
}