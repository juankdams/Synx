import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import javax.media.opengl.GL;

public class agH
{
  private Geometry dau;
  private uz UI;
  private Material UZ;
  private boolean dav;

  public agH(Geometry paramGeometry, uz paramuz, Material paramMaterial)
  {
    setTexture(paramuz);

    if (paramGeometry != null) {
      paramGeometry.gQ();
    }
    this.dau = paramGeometry;

    setMaterial(paramMaterial);
  }

  public final void destroy()
  {
    if (this.UI != null) {
      this.UI.axl();
      this.UI = null;
    }
    if (this.dau != null) {
      this.dau.axl();
      this.dau = null;
    }
    if (this.UZ != null) {
      this.UZ.axl();
      this.UZ = null;
    }
  }

  public Geometry ase() {
    return this.dau;
  }

  public uz hN() {
    return this.UI;
  }

  public void setTexture(uz paramuz) {
    if (paramuz == this.UI) {
      return;
    }
    if (paramuz != null) {
      paramuz.gQ();
    }
    if (this.UI != null) {
      this.UI.axl();
    }
    this.UI = paramuz;
  }

  public Material asf() {
    return this.UZ;
  }

  void setMaterial(Material paramMaterial) {
    if (this.UZ == paramMaterial) {
      return;
    }

    if (paramMaterial != null) {
      paramMaterial.gQ();
    }
    if (this.UZ != null) {
      this.UZ.axl();
    }

    this.UZ = paramMaterial;

    this.dav = true;
  }

  public void asg() {
    this.dav = true;
  }

  public final void a(ayc paramayc, boolean paramBoolean) {
    if ((this.UI != null) && (!this.UI.gI())) {
      return;
    }
    if (this.dau == null) {
      return;
    }

    dsZ localdsZ = dsZ.cZe();
    localdsZ.a(paramayc, (cdg)this.UI);

    if (this.UZ != null) {
      localdsZ.a((GL)paramayc.bZk(), this.UZ);

      if ((this.dav) && (paramBoolean)) {
        this.dav = false;
        this.dau.b(this.UZ);
      }
    }

    this.dau.a(paramayc);
  }
}