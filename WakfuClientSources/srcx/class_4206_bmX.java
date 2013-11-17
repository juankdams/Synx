import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;

public class bmX extends bNr
{
  private cdg fFR;

  public void initialize()
  {
    super.initialize();

    String str = byn.bFr().bFt() + "textures/cloud.tga";
    this.fFR = new cdg(byn.jp(str), str, false);
  }

  public void a(ccT paramccT) {
    ayc localayc = dHL.lSB.dhZ();

    this.dzZ.glDrawBuffer(1029);
    bVb();

    this.fFR.d(localayc);

    localayc.dNI.qH(9);
    dUU localdUU = dUU.mtb;
    int i = 0;
    long l = System.nanoTime();
    while (System.nanoTime() - l < gSe) {
      this.dzZ.glVertexPointer(2, 5126, 0, this.aVY.bSP());
      this.dzZ.glTexCoordPointer(2, 5126, 0, this.aVY.bSR());
      this.dzZ.glDrawElements(7, 4, 5123, localdUU.dvi());
      i++;
    }

    float f = i / ((float)gSe / 1.0E+009F);
    K.info("textured quad draw/s ~= " + f);
    paramccT.I(f);
  }

  public void cleanUp()
  {
    ayc localayc = dHL.lSB.dhZ();
    this.fFR.e(localayc);
    this.fFR.axl();

    super.cleanUp();
  }

  public String getName() {
    return "GL texture fillrate";
  }
}