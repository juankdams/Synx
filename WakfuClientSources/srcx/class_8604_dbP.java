import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import java.util.ArrayList;
import java.util.HashMap;

public final class dbP
{
  private static final boolean aRN = false;
  private static final dbP kUf = new dbP();
  private ArrayList kUg;
  private float kUh;
  private float kUi;
  private HashMap kUj;
  private int kUk;
  private bkl kUl;

  public static dbP cNw()
  {
    return kUf;
  }

  public void b(aum paramaum)
  {
  }

  public final void cNx()
  {
    if (this.kUj != null)
      this.kUj.clear();
    this.kUk = 0;
  }

  public void c(Geometry paramGeometry)
  {
  }

  public void a(bSr parambSr)
  {
  }

  public void cNy()
  {
  }

  private dbP()
  {
    cNx();
  }

  private void a(bSr parambSr, aum paramaum) {
    float f = 200.0F * paramaum.akc() / paramaum.getSize();
    parambSr.a(this.kUh, this.kUi, f, 14.0F, -12582912);
    parambSr.a(this.kUh + f, this.kUi, 200.0F - f, 14.0F, -16760832);

    this.kUl.fT(paramaum.aGy().getSimpleName() + "(" + paramaum.akc() + "/" + paramaum.getSize() + ")");

    this.kUi -= 16.0F;
  }
}