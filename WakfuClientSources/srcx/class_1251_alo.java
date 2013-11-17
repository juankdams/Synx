import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class alo extends dKf
{
  private static final Logger K = Logger.getLogger(alo.class);
  private int aHf;
  private short cMR;
  private int aKI;
  private int dma;
  private int dmb;

  public alo(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
    if (paramArrayOfString.length != 4) {
      K.error("[LD] Mauvais nombre de paramètres sur une action d'item");
      return;
    }
    int i = Integer.parseInt(paramArrayOfString[0]);
    this.aHf = Integer.parseInt(paramArrayOfString[1]);
    this.cMR = Short.parseShort(paramArrayOfString[2]);
    this.aKI = Integer.parseInt(paramArrayOfString[3]);
  }

  public boolean f(gA paramgA) {
    if (!axV()) {
      return false;
    }
    if ((byv.bFN().c(aDI.aPQ())) && 
      (aDI.aPQ().getItem() == paramgA)) {
      byv.bFN().b(aDI.aPQ());
      return false;
    }

    dGx.dhr().a(duv.lyv, true);

    SE localSE = new SE(this);

    Rl.acN().a(localSE);
    bsP.getInstance().a(CH.bGv, localSE, true);

    if (paramgA != null) {
      if (byv.bFN().c(aDI.aPQ())) {
        byv.bFN().b(aDI.aPQ());
      } else {
        aDI.aPQ().e(paramgA);
        aDI.aPQ().wb();

        byv.bFN().a(aDI.aPQ());
      }
    }
    return true;
  }

  private boolean axV() {
    byz localbyz = byv.bFN().bFO();
    azP localazP = localbyz.aTn();

    aqa localaqa = aYP.feK.bnR();
    if (localaqa != null) {
      return false;
    }
    if (!localazP.contains(this.aHf)) {
      avW.aIb().a(21, 3, new Object[0]);
      return false;
    }

    int i = localazP.getLevel(this.aHf);
    if (i < this.cMR) {
      avW.aIb().a(4, 3, new Object[0]);
      return false;
    }

    dxy localdxy = (dxy)fj.mh().hH(this.aKI);
    if (localdxy == null) {
      avW.aIb().a(1, 3, new Object[0]);
      return false;
    }

    if (axW()) {
      String str = bU.fH().getString("error.notInOwnHavenWorld");
      CM.LV().f(str, 3);
      return false;
    }

    return true;
  }

  private static boolean axW() {
    byz localbyz = byv.bFN().bFO();
    short s = localbyz.Lk();
    bMG localbMG = localbyz.bSt();
    int i = localbMG.CF();
    brW localbrW1 = ars.dzL.aL(s);
    if (localbrW1 == null)
      return false;
    brW localbrW2 = ars.dzL.jG(i);
    return (localbrW2 != null) && (localbrW2.arI() != s);
  }

  public int axX() {
    return this.aHf;
  }

  public short alM() {
    return this.cMR;
  }

  public int axY() {
    return this.aKI;
  }

  public void a(gA paramgA, int paramInt1, int paramInt2)
  {
    aDI.aPQ().wg();
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