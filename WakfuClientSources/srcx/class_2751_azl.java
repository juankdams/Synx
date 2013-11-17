import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;

public class azl extends bNr
{
  public void a(ccT paramccT)
  {
    ayc localayc = dHL.lSB.dhZ();

    this.dzZ.glDrawBuffer(1029);
    bVb();

    localayc.dNI.qH(5);

    dUU localdUU = dUU.mtb;
    int i = 0;
    long l = System.nanoTime();
    while (System.nanoTime() - l < gSe) {
      this.dzZ.glVertexPointer(2, 5126, 0, this.aVY.bSP());
      this.dzZ.glColorPointer(4, 5126, 0, this.aVY.bSQ());
      this.dzZ.glDrawElements(7, 4, 5123, localdUU.dvi());
      i++;
    }

    float f = i / ((float)gSe / 1.0E+009F);
    K.info("colored quad draw/s ~= " + f);
    paramccT.H(f);
  }

  public String getName() {
    return "GL pixel fillrate";
  }
}