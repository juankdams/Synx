import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aIZ extends dKf
{
  private static final Logger K = Logger.getLogger(aIZ.class);
  private int dma;
  private int dmb;

  public aIZ(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
    if (paramArrayOfString.length != 2) {
      K.error("[LD] Mauvais nombre de paramètres sur une action d'item");
      return;
    }
  }

  public boolean f(gA paramgA)
  {
    if (!axV()) {
      return false;
    }

    dGx.dhr().a(duv.lyv, true);

    cgH localcgH = new cgH(this);

    Rl.acN().a(localcgH);
    bsP.getInstance().a(CH.bGv, localcgH, true);

    if (paramgA != null) {
      if (byv.bFN().c(daM.kSz)) {
        byv.bFN().b(daM.kSz);
      } else {
        daM.kSz.e(paramgA);
        daM.kSz.wb();

        byv.bFN().a(daM.kSz);
      }
    }
    return true;
  }

  private boolean axV() {
    byz localbyz = byv.bFN().bFO();

    aqa localaqa = aYP.feK.bnR();
    if (localaqa != null) {
      return false;
    }
    return true;
  }

  public void a(gA paramgA, int paramInt1, int paramInt2)
  {
    daM.kSz.wg();
    this.dma = paramInt1;
    this.dmb = paramInt2;
    bZ(paramgA.oj());
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    super.g(paramByteBuffer);
    paramByteBuffer.putInt(this.dma);
    paramByteBuffer.putInt(this.dmb);
    return true;
  }

  public int O() {
    return super.O() + 4 + 4;
  }

  public void clear() {
    this.dma = 0;
    this.dmb = 0;
  }
}