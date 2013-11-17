import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

public class cOc
  implements vP
{
  public boolean intensityOnly()
  {
    return true;
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
    return paramGlyphVector.getVisualBounds();
  }

  public void drawGlyphVector(Graphics2D paramGraphics2D, GlyphVector paramGlyphVector, int paramInt1, int paramInt2)
  {
    paramGraphics2D.drawGlyphVector(paramGlyphVector, paramInt1, paramInt2);
  }

  public void draw(Graphics2D paramGraphics2D, String paramString, int paramInt1, int paramInt2) {
    paramGraphics2D.drawString(paramString, paramInt1, paramInt2);
  }
}