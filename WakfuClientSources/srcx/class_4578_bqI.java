import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public final class bqI extends dKf
{
  private static final Logger K = Logger.getLogger(bqI.class);
  private long fLM;

  bqI(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString)
  {
  }

  public boolean f(gA paramgA)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return false;
    }

    i(paramgA);
    return true;
  }

  private void i(gA paramgA)
  {
    dGx.dhr().a(duv.lyz, true);

    ajn localajn = new ajn(this, paramgA);

    Rl.acN().a(localajn);
    bsP.getInstance().a(CH.bGv, localajn, true);
  }

  private void b(gA paramgA, byz parambyz) {
    gA localgA = parambyz.bGP().iS(this.fLM);
    if (localgA == null) {
      localgA = (gA)parambyz.ayJ().ci(this.fLM);
    }

    if (localgA == null) {
      K.warn("[ItemAction] Tentative d'utilisation de dégemmage d'un item qui n'existe pas dans l'inventaire " + this.fLM);
      return;
    }

    ArrayList localArrayList = parambyz.bGP().a(new dmi(parambyz));
    if (!localArrayList.contains(localgA)) {
      return;
    }

    bZ(paramgA.oj());
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    super.g(paramByteBuffer);
    paramByteBuffer.putLong(this.fLM);
    return true;
  }

  public int O() {
    return super.O() + 8;
  }

  public void clear()
  {
  }
}