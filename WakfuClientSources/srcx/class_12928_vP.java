import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

public abstract interface vP
{
  public abstract boolean intensityOnly();

  public abstract Rectangle2D getBounds(String paramString, Font paramFont, FontRenderContext paramFontRenderContext);

  public abstract Rectangle2D getBounds(CharSequence paramCharSequence, Font paramFont, FontRenderContext paramFontRenderContext);

  public abstract Rectangle2D getBounds(GlyphVector paramGlyphVector, FontRenderContext paramFontRenderContext);

  public abstract void draw(Graphics2D paramGraphics2D, String paramString, int paramInt1, int paramInt2);

  public abstract void drawGlyphVector(Graphics2D paramGraphics2D, GlyphVector paramGlyphVector, int paramInt1, int paramInt2);
}