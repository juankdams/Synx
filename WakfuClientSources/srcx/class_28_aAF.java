import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

public class aAF
  implements vP
{
  public static aAF dTA = new aAF();

  private static Color dTB = new Color(0.2F, 0.2F, 0.2F, 1.0F);

  public void draw(Graphics2D paramGraphics2D, String paramString, int paramInt1, int paramInt2)
  {
    paramGraphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);

    paramInt1++;
    paramInt2++;

    paramGraphics2D.setColor(Color.BLACK);

    paramGraphics2D.drawString(paramString, paramInt1 + 1, paramInt2);
    paramGraphics2D.drawString(paramString, paramInt1 + 1, paramInt2 + 1);
    paramGraphics2D.drawString(paramString, paramInt1, paramInt2 + 1);
    paramGraphics2D.drawString(paramString, paramInt1 - 1, paramInt2);
    paramGraphics2D.drawString(paramString, paramInt1 - 1, paramInt2 - 1);
    paramGraphics2D.drawString(paramString, paramInt1, paramInt2 - 1);
    paramGraphics2D.drawString(paramString, paramInt1 + 1, paramInt2 - 1);
    paramGraphics2D.drawString(paramString, paramInt1 - 1, paramInt2 + 1);

    paramGraphics2D.setColor(Color.WHITE);
    paramGraphics2D.drawString(paramString, paramInt1, paramInt2);
  }

  public void drawGlyphVector(Graphics2D paramGraphics2D, GlyphVector paramGlyphVector, int paramInt1, int paramInt2)
  {
    paramGraphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);

    paramInt1++;
    paramInt2++;

    paramGraphics2D.setColor(Color.BLACK);

    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1 + 1, paramInt2);
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1 + 1, paramInt2 + 1);
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1, paramInt2 + 1);
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1 - 1, paramInt2);
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1 - 1, paramInt2 - 1);
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1, paramInt2 - 1);
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1 + 1, paramInt2 - 1);
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1 - 1, paramInt2 + 1);

    paramGraphics2D.setColor(Color.WHITE);
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1, paramInt2);
  }

  public boolean intensityOnly() {
    return false;
  }

  public Rectangle2D getBounds(CharSequence paramCharSequence, Font paramFont, FontRenderContext paramFontRenderContext)
  {
    GlyphVector localGlyphVector = aHl.eeV.a(paramCharSequence.toString(), paramFont, paramFontRenderContext);
    return getBounds(localGlyphVector, paramFontRenderContext);
  }

  public Rectangle2D getBounds(String paramString, Font paramFont, FontRenderContext paramFontRenderContext)
  {
    GlyphVector localGlyphVector = aHl.eeV.a(paramString, paramFont, paramFontRenderContext);
    return getBounds(localGlyphVector, paramFontRenderContext);
  }

  public Rectangle2D getBounds(GlyphVector paramGlyphVector, FontRenderContext paramFontRenderContext) {
    Rectangle2D localRectangle2D = paramGlyphVector.getVisualBounds();
    localRectangle2D.setRect(localRectangle2D.getX(), localRectangle2D.getY(), localRectangle2D.getWidth() + 2.0D, localRectangle2D.getHeight() + 2.0D);
    return localRectangle2D;
  }
}