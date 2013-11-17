import com.sun.opengl.impl.packrect.BackingStoreManager;
import com.sun.opengl.impl.packrect.Rect;
import com.sun.opengl.impl.packrect.RectanglePacker;
import com.sun.opengl.util.j2d.TextureRenderer;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.PrintStream;
import java.util.Map;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

class cob
  implements BackingStoreManager
{
  private Graphics2D hVC;
  private final BufferedImage hVD = new BufferedImage(256, 256, 2);

  cob(cLb paramcLb)
  {
  }

  public Object allocateBackingStore(int paramInt1, int paramInt2)
  {
    TextureRenderer localTextureRenderer;
    if (cLb.a(this.dXC).intensityOnly())
      localTextureRenderer = TextureRenderer.createAlphaOnlyRenderer(paramInt1, paramInt2, cLb.b(this.dXC));
    else {
      localTextureRenderer = new TextureRenderer(paramInt1, paramInt2, true, cLb.b(this.dXC));
    }
    localTextureRenderer.setSmoothing(cLb.c(this.dXC));

    if (cLb.bJa()) {
      System.err.println(" TextRenderer allocating backing store " + paramInt1 + " x " + paramInt2);
    }

    return localTextureRenderer;
  }

  public void deleteBackingStore(Object paramObject) {
    ((TextureRenderer)paramObject).dispose();
  }

  public boolean preExpand(Rect paramRect, int paramInt)
  {
    if (paramInt == 0) {
      if (cLb.bJa()) {
        System.err.println("Clearing unused entries in preExpand(): attempt number " + paramInt);
      }

      if (cLb.d(this.dXC))
      {
        this.dXC.flush();
      }

      cLb.e(this.dXC);

      return true;
    }

    return false;
  }

  public void additionFailed(Rect paramRect, int paramInt)
  {
    cLb.f(this.dXC).clear();
    cLb.g(this.dXC).clear();
    cLb.h(this.dXC).clearAllCacheEntries();

    if (cLb.bJa())
      System.err.println(" *** Cleared all text because addition failed ***");
  }

  public boolean coj()
  {
    return true;
  }

  public void beginMovement(Object paramObject1, Object paramObject2)
  {
    if (cLb.d(this.dXC))
    {
      this.dXC.flush();

      localObject = GLU.getCurrentGL();

      ((GL)localObject).glPopClientAttrib();

      if ((this.dXC.getUseVertexArrays()) && (cLb.a(this.dXC, (GL)localObject))) {
        try {
          ((GL)localObject).glBindBuffer(34962, 0);
        } catch (Exception localException) {
          cLb.a(this.dXC, false);
        }
      }

      if (cLb.i(this.dXC))
        ((TextureRenderer)paramObject1).endOrthoRendering();
      else {
        ((TextureRenderer)paramObject1).end3DRendering();
      }
    }

    Object localObject = (TextureRenderer)paramObject2;
    this.hVC = ((TextureRenderer)localObject).createGraphics();
  }

  public void move(Object paramObject1, Rect paramRect1, Object paramObject2, Rect paramRect2)
  {
    TextureRenderer localTextureRenderer1 = (TextureRenderer)paramObject1;
    TextureRenderer localTextureRenderer2 = (TextureRenderer)paramObject2;

    if (localTextureRenderer1 == localTextureRenderer2)
    {
      this.hVC.setComposite(AlphaComposite.Src);
      this.hVC.copyArea(paramRect1.x(), paramRect1.y(), paramRect1.w(), paramRect1.h(), paramRect2.x() - paramRect1.x(), paramRect2.y() - paramRect1.y());
    }
    else
    {
      Image localImage = localTextureRenderer1.getImage();
      this.hVC.setComposite(AlphaComposite.Clear);
      this.hVC.drawRect(paramRect2.x(), paramRect2.y(), paramRect2.w(), paramRect2.h());
      this.hVC.setComposite(AlphaComposite.Src);
      this.hVC.drawImage(localImage, paramRect2.x(), paramRect2.y(), paramRect2.x() + paramRect2.w(), paramRect2.y() + paramRect2.h(), paramRect1.x(), paramRect1.y(), paramRect1.x() + paramRect1.w(), paramRect1.y() + paramRect1.h(), null);
    }
  }

  public void endMovement(Object paramObject1, Object paramObject2)
  {
    this.hVC.dispose();

    TextureRenderer localTextureRenderer = (TextureRenderer)paramObject2;
    localTextureRenderer.markDirty(0, 0, localTextureRenderer.getWidth(), localTextureRenderer.getHeight());

    if (cLb.d(this.dXC)) {
      if (cLb.i(this.dXC)) {
        ((TextureRenderer)paramObject2).beginOrthoRendering(cLb.j(this.dXC), cLb.k(this.dXC), cLb.l(this.dXC));
      }
      else {
        ((TextureRenderer)paramObject2).begin3DRendering();
      }

      GL localGL = GLU.getCurrentGL();
      localGL.glPushClientAttrib(-1);

      if (cLb.m(this.dXC))
        if (cLb.n(this.dXC) == null) {
          ((TextureRenderer)paramObject2).setColor(cLb.o(this.dXC), cLb.p(this.dXC), cLb.q(this.dXC), cLb.r(this.dXC));
        }
        else
          ((TextureRenderer)paramObject2).setColor(cLb.n(this.dXC));
    }
    else
    {
      cLb.b(this.dXC, true);
    }
  }
}