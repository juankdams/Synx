import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import org.apache.log4j.Logger;

public class aHl
{
  private static final Logger K = Logger.getLogger(aHl.class);
  public static final aHl eeV = new aHl();

  private acu eeW = new acu(this, null);
  private static final int eeX = 15000;
  private int eeY = 0;
  private final akR eeZ = new akR();

  public GlyphVector a(char paramChar, Font paramFont, FontRenderContext paramFontRenderContext)
  {
    return a(String.valueOf(paramChar), paramFont, paramFontRenderContext);
  }

  public GlyphVector a(String paramString, Font paramFont, FontRenderContext paramFontRenderContext) {
    akR localakR = (akR)this.eeZ.get(paramFont);
    if (localakR == null) {
      localakR = new akR();
      this.eeZ.put(paramFont, localakR);
    }

    dVv localdVv = (dVv)localakR.get(paramString);
    if (localdVv == null) {
      localdVv = dVv.a(paramFont.createGlyphVector(paramFontRenderContext, paramString), paramString);
      localakR.put(paramString, localdVv);
    }

    localdVv.ae(true);
    return localdVv.dvr();
  }

  public void update(int paramInt) {
    this.eeY += paramInt;

    if (this.eeY > 15000) {
      if (!this.eeZ.isEmpty()) {
        this.eeZ.s(new cpL(this));
      }

      this.eeY = 0;
    }
  }
}