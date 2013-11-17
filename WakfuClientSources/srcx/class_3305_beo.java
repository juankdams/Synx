import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import org.apache.log4j.Logger;

public class beo
{
  private static final Logger K = Logger.getLogger(beo.class);

  public static final Material fqU = (Material)Material.mwD.bQx();
  private static final float fqV = 0.0F;
  private static final float fqW = 0.1F;

  public static void c(dCb paramdCb)
  {
    a(paramdCb, 0.0F);
  }

  public static void d(dCb paramdCb) {
    a(paramdCb, 0.1F);
  }

  public static void e(dCb paramdCb) {
    paramdCb.atq();
  }

  private static void a(dCb paramdCb, float paramFloat) {
    float[] arrayOfFloat = paramdCb.atx().gK();
    fqU.F(arrayOfFloat[0] + paramFloat, arrayOfFloat[1] + paramFloat, arrayOfFloat[2] + paramFloat);
    paramdCb.a(fqU);
  }
}