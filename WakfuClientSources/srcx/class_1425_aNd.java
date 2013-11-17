import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.text.NumberFormat;
import javax.swing.JComponent;

public class aNd extends JComponent
{
  private cEz esN;
  private Color esO = Color.GREEN;
  private Color esP = Color.YELLOW;
  private Color esQ = new Color(128, 255, 128);
  private static final int esR = 2;
  private static final int esS = 11;
  private static final int esT = 10;
  private static final int esU = 10;
  private static final Font esV = new Font("Dialog", 0, 10);

  private int esW = -1;
  private final NumberFormat esX = NumberFormat.getIntegerInstance();

  private int esY = 0;
  private int esZ = 0;
  private BufferedImage eta;

  public aNd()
  {
    this.esX.setGroupingUsed(true);

    addMouseListener(new djI(this));

    addMouseMotionListener(new djJ(this));
  }

  public void a(cEz paramcEz)
  {
    this.esN = paramcEz;
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    int i = getHeight();
    cZL localcZL1 = getWidth();

    super.paintComponent(paramGraphics);
    paramGraphics.setColor(getBackground());

    paramGraphics.fillRect(0, 0, localcZL1, i);

    paramGraphics.setColor(new Color(12, 64, 12));
    for (int j = 0; j < i; j += 10)
      paramGraphics.drawLine(0, j, localcZL1, j);
    for (j = 0; j < localcZL1; j += 10) {
      paramGraphics.drawLine(j, 0, j, i);
    }

    if ((this.eta == null) || (this.esY != i) || (this.esZ != localcZL1))
    {
      this.eta = new BufferedImage(localcZL1, i, 2);
      this.esY = i;
      this.esZ = localcZL1;
    }
    Graphics2D localGraphics2D = this.eta.createGraphics();
    localGraphics2D.clearRect(0, 0, localcZL1, localcZL1);

    int k = this.esN.cAg();
    int m = this.esN.cAd();

    int[] arrayOfInt1 = new int[k + 2];
    int[] arrayOfInt2 = new int[k + 2];

    arrayOfInt1[k] = bM(k, localcZL1);
    arrayOfInt2[k] = z(0, 0, i);
    cZL localcZL2;
    for (int n = k - 1; n >= 0; n--) {
      localcZL2 = this.esN.xC(n);
      arrayOfInt1[n] = bM(n, localcZL1);

      arrayOfInt2[n] = z(localcZL2.kNy, m, i);
    }

    arrayOfInt1[(k + 1)] = arrayOfInt1[0];
    arrayOfInt2[(k + 1)] = z(0, 0, i);

    localGraphics2D.setColor(this.esO);
    localGraphics2D.drawPolygon(arrayOfInt1, arrayOfInt2, k + 2);

    arrayOfInt1[k] = bM(k, localcZL1);
    arrayOfInt2[k] = z(0, 0, i);

    for (n = k - 1; n >= 0; n--) {
      localcZL2 = this.esN.xC(n);
      arrayOfInt1[n] = bM(n, localcZL1);

      arrayOfInt2[n] = z(localcZL2.kNy + localcZL2.kNx, m, i);
    }

    arrayOfInt1[(k + 1)] = arrayOfInt1[0];
    arrayOfInt2[(k + 1)] = z(0, 0, i);

    localGraphics2D.setColor(this.esP);
    localGraphics2D.drawPolygon(arrayOfInt1, arrayOfInt2, k + 2);

    if ((this.esW >= 0) && (localcZL1 >= 50))
    {
      if (this.esW >= localcZL1 - k)
      {
        cZL localcZL3 = this.esN.xC(localcZL1 - this.esW);

        String str1 = "Used : " + this.esX.format(localcZL3.kNy);
        String str2 = "Free : " + this.esX.format(localcZL3.kNx);
        String str3 = "Total: " + this.esX.format(localcZL3.kNy + localcZL3.kNx);

        FontMetrics localFontMetrics = localGraphics2D.getFontMetrics();
        int i2 = Math.max(Math.max(localFontMetrics.stringWidth(str1), localFontMetrics.stringWidth(str2)), localFontMetrics.stringWidth(str3));
        int i1;
        if (this.esW < localcZL1 / 2) {
          n = localcZL1 - i2 + 4;
          localcZL2 = localcZL1;
        } else {
          n = 0;
          i1 = i2 + 4;
        }
        localGraphics2D.setColor(Color.BLACK);
        localGraphics2D.fillRect(n, 0, i1, 37);
        localGraphics2D.setColor(this.esQ);
        localGraphics2D.setFont(esV);
        localGraphics2D.drawString(str1, n + 2, 13);
        localGraphics2D.drawString(str2, n + 2, 24);
        localGraphics2D.drawString(str3, n + 2, 35);
      }
    }

    paramGraphics.drawImage(this.eta, 0, 0, null);
  }

  private int bM(int paramInt1, int paramInt2)
  {
    return paramInt2 - paramInt1;
  }

  private int z(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 == 0)
      return paramInt3;
    return paramInt3 - (int)(paramInt1 * paramInt3 * 0.9D) / paramInt2;
  }

  private void b(MouseEvent paramMouseEvent) {
    this.esW = paramMouseEvent.getX();
  }

  private void c(MouseEvent paramMouseEvent) {
    this.esW = paramMouseEvent.getX();
    repaint();
  }

  private void d(MouseEvent paramMouseEvent) {
    this.esW = -1;
    repaint();
  }
}