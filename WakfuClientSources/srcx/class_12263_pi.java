import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

public class pi
  implements dQZ
{
  private static final Logger K = Logger.getLogger(pi.class);
  private aka aUW;
  private dOc aUX;
  private czv aUY;
  private boolean aUZ;
  private dwn aVa;
  private EntitySprite aVb;
  private int aVc;
  private int aVd;

  public pi(aka paramaka)
  {
    this.aUW = paramaka;
  }

  public void a(int paramInt1, int paramInt2, dOc paramdOc) {
    if ((!this.aUZ) && (
      (paramInt1 < this.aVc - 20) || (paramInt1 > this.aVc + 20) || (paramInt2 < this.aVd - 20) || (paramInt2 > this.aVd + 20)))
    {
      this.aUY = new czv();
      this.aUY.aJ();
      this.aUY.setPixmap(new dDq(this.aVb.hN()));

      this.aUY.setSize(this.aVb.getWidth(), this.aVb.getHeight());
      this.aUY.setNonBlocking(true);
      this.aUY.setLayoutData(null);

      this.aUW.aT(this.aVa);

      bsP.getInstance().getLayeredContainer().b(this.aUY, 30000);

      this.aUZ = true;
    }

    if ((this.aUZ) && (this.aUY != null)) {
      this.aUY.setPosition(paramInt1 - this.aUY.getWidth() / 2, paramInt2 - this.aUY.getHeight() / 2);

      if (paramdOc != this.aUX) {
        if (this.aUX != null) {
          this.aUW.b(null, this.aVa);
          this.aUX = null;
        }
        if (paramdOc != null) {
          this.aUX = paramdOc;
          this.aUW.c(null, this.aVa);
        }
      }
    }
  }

  public void b(int paramInt1, int paramInt2, dOc paramdOc) {
    if (this.aUZ) {
      bXx localbXx = null;
      Object localObject;
      if (paramdOc != null) {
        if ((paramdOc instanceof bXx))
          localbXx = (bXx)paramdOc;
        else {
          localbXx = (bXx)paramdOc.getParentOfType(aka.class);
        }

        if (localbXx == null) {
          if (!(paramdOc instanceof axU)) {
            localObject = paramdOc.getParentOfType(axU.class);
            if ((localObject instanceof axU))
              localbXx = ((axU)localObject).getDragNDropable();
          }
          else {
            localbXx = ((axU)paramdOc).getDragNDropable();
          }
        }
      }

      if ((localbXx != null) && (localbXx.isDropValid(this.aUW, this.aVa))) {
        localbXx.a(localbXx, this.aVa);
      } else {
        localObject = cTo.a(bsP.getInstance().getCurrentAWTMouseEvent(), this.aUW, this.aVa);
        this.aUW.g((cSx)localObject);
      }
    }

    clean();
  }

  public void clean() {
    if (this.aUY != null) {
      this.aUY.beH();
      this.aUY = null;
    }

    this.aVa = null;
    this.aVb = null;
    this.aUX = null;
  }

  public boolean ws() {
    boolean bool = this.aUZ;
    clean();
    this.aUW = null;
    return bool;
  }

  public Object getValue() {
    return null;
  }

  public boolean a(dOc paramdOc, int paramInt1, int paramInt2) {
    if (paramdOc == null) {
      return false;
    }

    if ((paramdOc == this.aUW) || (paramdOc.j(this.aUW))) {
      dwn localdwn = this.aUW.getOverItem();
      return (this.aUW.isDragEnabled()) && (localdwn != null) && (localdwn.dby()) && ((!localdwn.isEditable()) || (!localdwn.dbz()));
    }

    return false;
  }

  public void select(int paramInt1, int paramInt2) {
    this.aVc = paramInt1;
    this.aVd = paramInt2;
    this.aVa = this.aUW.getOverItem();
    this.aVb = this.aUW.getOverMesh();
    this.aUZ = false;
    this.aUX = null;
  }
}