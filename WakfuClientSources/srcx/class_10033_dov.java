import com.sun.opengl.impl.packrect.Rect;
import com.sun.opengl.impl.packrect.RectanglePacker;
import com.sun.opengl.util.j2d.TextureRenderer;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureCoords;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

class dov
{
  private char loH;
  private int loI;
  private cBt loJ;
  private float advance;
  private GlyphVector loK;
  private Rect loL;
  private String ijf;
  private boolean loM;

  public dov(cLb paramcLb, char paramChar, int paramInt, GlyphVector paramGlyphVector, cBt paramcBt)
  {
    this.loH = paramChar;
    this.loI = paramInt;
    this.advance = paramGlyphVector.getGlyphMetrics(0).getAdvance();
    this.loK = paramGlyphVector;
    this.loJ = paramcBt;
  }

  public dov(cLb paramcLb, String paramString, boolean paramBoolean)
  {
    this.ijf = paramString;
    this.loM = paramBoolean;
  }

  public int getUnicodeID()
  {
    return this.loH;
  }

  public int getGlyphCode()
  {
    return this.loI;
  }

  public float getAdvance()
  {
    return this.advance;
  }

  public float draw3D(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Object localObject;
    if (this.ijf != null) {
      cLb.a(this.dXC, this.ijf, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      if (!this.loM) {
        return 0.0F;
      }

      localObject = aHl.eeV.a(this.ijf, cLb.s(this.dXC), cLb.t(this.dXC));
      float f1 = 0.0F;
      for (int i = 0; i < ((GlyphVector)localObject).getNumGlyphs(); i++) {
        f1 += ((GlyphVector)localObject).getGlyphMetrics(i).getAdvance();
      }
      return f1;
    }

    if (this.loL == null) {
      cVz();
    }
    try
    {
      if (this.dXC.iKE == null) {
        this.dXC.iKE = new cCK(this.dXC);
      }

      localObject = cLb.u(this.dXC);

      TextureCoords localTextureCoords = ((TextureRenderer)localObject).getTexture().getImageTexCoords();
      float f2 = localTextureCoords.right();
      float f3 = localTextureCoords.bottom();

      Rect localRect = this.loL;
      cwN localcwN = (cwN)localRect.getUserData();
      localcwN.cuf();

      Rectangle2D localRectangle2D = localcwN.cud();

      float f4 = paramFloat1 - paramFloat4 * localcwN.cub();
      float f5 = paramFloat2 - paramFloat4 * ((float)localRectangle2D.getHeight() - localcwN.cuc());

      int j = localRect.x() + (localcwN.cua().x - localcwN.cub());
      int k = ((TextureRenderer)localObject).getHeight() - localRect.y() - (int)localRectangle2D.getHeight() - (localcwN.cua().y - localcwN.cuc());

      int m = (int)localRectangle2D.getWidth();
      int n = (int)localRectangle2D.getHeight();

      float f6 = f2 * j / ((TextureRenderer)localObject).getWidth();
      float f7 = f3 * (1.0F - k / ((TextureRenderer)localObject).getHeight());

      float f8 = f2 * (j + m) / ((TextureRenderer)localObject).getWidth();
      float f9 = f3 * (1.0F - (k + n) / ((TextureRenderer)localObject).getHeight());

      this.dXC.iKE.glTexCoord2f(f6, f7);
      this.dXC.iKE.glVertex3f(f4, f5, paramFloat3);
      this.dXC.iKE.glTexCoord2f(f8, f7);
      this.dXC.iKE.glVertex3f(f4 + m * paramFloat4, f5, paramFloat3);

      this.dXC.iKE.glTexCoord2f(f8, f9);
      this.dXC.iKE.glVertex3f(f4 + m * paramFloat4, f5 + n * paramFloat4, paramFloat3);

      this.dXC.iKE.glTexCoord2f(f6, f9);
      this.dXC.iKE.glVertex3f(f4, f5 + n * paramFloat4, paramFloat3);
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
    return this.advance;
  }

  public void clear()
  {
    this.loL = null;
  }

  private void cVz() {
    GlyphVector localGlyphVector = cVA();
    Rectangle2D localRectangle2D1 = cLb.c(cLb.a(this.dXC).getBounds(localGlyphVector, this.dXC.getFontRenderContext()));
    Rectangle2D localRectangle2D2 = cLb.a(this.dXC, localRectangle2D1);
    Point localPoint = new Point((int)-localRectangle2D2.getMinX(), (int)-localRectangle2D2.getMinY());

    Rect localRect = new Rect(0, 0, (int)localRectangle2D2.getWidth(), (int)localRectangle2D2.getHeight(), new cwN(null, localPoint, localRectangle2D1, this.loH));

    cLb.f(this.dXC).add(localRect);
    this.loL = localRect;
    Graphics2D localGraphics2D = cLb.v(this.dXC);

    int i = localRect.x() + localPoint.x;
    int j = localRect.y() + localPoint.y;

    localGraphics2D.setComposite(AlphaComposite.Clear);
    localGraphics2D.fillRect(localRect.x(), localRect.y(), localRect.w(), localRect.h());
    localGraphics2D.setComposite(AlphaComposite.Src);

    cLb.a(this.dXC).drawGlyphVector(localGraphics2D, localGlyphVector, i, j);

    cLb.u(this.dXC).markDirty(localRect.x(), localRect.y(), localRect.w(), localRect.h());
  }

  private GlyphVector cVA()
  {
    if (this.loK != null) {
      GlyphVector localGlyphVector = this.loK;
      this.loK = null;
      return localGlyphVector;
    }

    return aHl.eeV.a(this.loH, cLb.s(this.dXC), this.dXC.getFontRenderContext());
  }
}