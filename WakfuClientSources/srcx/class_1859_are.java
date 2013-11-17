import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class are extends dKf
{
  private static final Logger K = Logger.getLogger(are.class);
  private int cAK;
  private int hY;
  private int hZ;

  public are(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
    if (paramArrayOfString.length != 1) {
      K.error("[LD] Mauvais nombre de paramètres sur une action d'item");
      return;
    }

    this.cAK = Integer.parseInt(paramArrayOfString[0]);
  }

  public int getRadius() {
    return this.cAK;
  }

  public boolean f(gA paramgA) {
    if (!axV()) {
      return false;
    }

    cMo localcMo = new cMo(this);

    Rl.acN().a(localcMo);
    bsP.getInstance().a(CH.bGv, localcMo, true);

    if (paramgA != null) {
      if (byv.bFN().c(bfU.bsU())) {
        byv.bFN().b(bfU.bsU());
      } else {
        bfU.bsU().setItem(paramgA);

        byv.bFN().a(bfU.bsU());
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
    if (!aDj()) {
      FJ.d("error.notInOwnHavenWorld", new Object[0]);
      return false;
    }

    if (!aDk()) {
      FJ.d("guild.rank.missing", new Object[] { bU.fH().getString(cnm.hTn.name()) });
      return false;
    }

    return true;
  }

  private static boolean aDj() {
    byz localbyz = byv.bFN().bFO();
    short s = localbyz.Lk();
    bMG localbMG = localbyz.bSt();
    int i = localbMG.CF();
    brW localbrW1 = ars.dzL.aL(s);
    if (localbrW1 == null) {
      return false;
    }
    brW localbrW2 = ars.dzL.jG(i);
    return (localbrW2 != null) && (localbrW2.arI() == s);
  }

  private boolean aDk() {
    byz localbyz = byv.bFN().bFO();
    return clr.a(localbyz.bSt(), localbyz.bSt().ay(localbyz.getId()), cnm.hTn);
  }

  public void a(gA paramgA, int paramInt1, int paramInt2) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    bZ(paramgA.oj());
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    super.g(paramByteBuffer);
    paramByteBuffer.putInt(this.hY);
    paramByteBuffer.putInt(this.hZ);
    return true;
  }

  public int O() {
    return super.O() + 4 + 4;
  }

  public void clear() {
    this.hY = 0;
    this.hZ = 0;
    ap(null);
  }
}