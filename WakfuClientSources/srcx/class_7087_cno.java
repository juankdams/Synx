import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import javax.media.opengl.GL;

public final class cno
{
  private final VertexBufferPCT aVY;
  private final dUU UJ;
  private GL dzZ;
  private dsZ hTO;
  private int hTP = 7;

  private int count = -1;
  private int total = 0;
  private int max = 0;

  public cno()
  {
    this(8192, 8192);
  }

  public cno(int paramInt1, int paramInt2) {
    this.aVY = VertexBufferPCT.gNI.zN(Math.min(paramInt1, paramInt2));
    this.UJ = dUU.mtc;
  }

  public final void a(GL paramGL, dsZ paramdsZ)
  {
    this.aVY.rewind();
    this.dzZ = paramGL;
    this.hTO = paramdsZ;
  }

  public final void b(Ul paramUl) {
    if (!paramUl.ahw()) {
      return;
    }
    int i = paramUl.getMode();
    if (i != this.hTP) {
      flush();
      this.hTP = i;
    }

    if (!paramUl.a(this.aVY)) {
      flush();
      paramUl.a(this.aVY);
    }
    paramUl.a(this.hTO);
    this.count += 1;
  }

  public final void flush() {
    if (this.aVY.bSV() == 0) {
      return;
    }
    GL localGL = this.dzZ;
    dHL.lSB.dhZ().dNI.qH(13);

    localGL.glVertexPointer(2, 5126, 0, this.aVY.bSP());
    localGL.glColorPointer(4, 5126, 0, this.aVY.bSQ());
    localGL.glTexCoordPointer(2, 5126, 0, this.aVY.bSR());

    localGL.glDrawElements(this.hTP, this.aVY.bSV(), 5123, this.UJ.dvi());
    this.aVY.rewind();
    if (this.count > this.max)
      this.max = this.count;
    this.total += this.count;
    this.count = -1;
  }

  public final void end() {
    flush();
    this.total = 0;
    this.max = 0;
  }
}