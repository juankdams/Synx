import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.material.Material;
import java.io.ByteArrayOutputStream;
import org.apache.log4j.Logger;

public abstract class dCQ
{
  private static final Logger K = Logger.getLogger(dCQ.class);
  public static final String lLk = "png";
  public static final float lLl = 1.5F;
  protected final Entity3D eSL;
  protected final int lLm;
  protected final int lLn;
  protected final float dka;
  protected final float aZs;
  protected final float aZt;
  protected dR dca;
  protected String UV;

  protected dCQ(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.eSL = ((Entity3D)Entity3D.fAs.bQy());

    this.lLm = paramInt1;
    this.lLn = paramInt2;
    this.dka = paramFloat1;
    this.aZs = paramFloat2;
    this.aZt = paramFloat3;
  }

  public final void a(dR paramdR, String paramString, String[] paramArrayOfString) {
    if (this.dca != null) {
      this.dca.reset();
    }
    this.dca = new dR(paramdR);
    this.dca.setMaterial(Material.mwz);
    this.UV = paramString;
    for (int i = 0; i < paramArrayOfString.length; i++)
      this.dca.at(byn.jq(paramArrayOfString[i]));
  }

  protected boolean dfe()
  {
    this.dca.hT();
    if ((this.dca.gI()) && (!this.dca.ii())) {
      this.dca.setAnimation(this.UV);
      if (this.dca.hR()) {
        return false;
      }
      this.dca.a(0, this.eSL, 0);
      return true;
    }

    return false;
  }

  public abstract void a(ByteArrayOutputStream paramByteArrayOutputStream, String paramString);

  public abstract void v(String paramString1, String paramString2);

  public abstract void a(String paramString, dsP paramdsP);

  public final void cleanup() {
    this.eSL.axl();
    if (this.dca != null)
      this.dca.reset();
  }
}