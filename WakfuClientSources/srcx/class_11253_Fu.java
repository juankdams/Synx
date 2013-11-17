import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

final class Fu extends dKf
{
  private static final Logger K = Logger.getLogger(Fu.class);
  private long bMN;

  Fu(int paramInt)
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

  private void a(gA paramgA, byz parambyz) {
    gA localgA = parambyz.bGP().iS(this.bMN);
    if (localgA == null) {
      localgA = (gA)parambyz.ayJ().ci(this.bMN);
    }

    if (localgA == null) {
      K.warn("[ItemAction] Tentative d'utilisation de dégemmage d'un item qui n'existe pas dans l'inventaire " + this.bMN);
      return;
    }

    bZ(paramgA.oj());
  }

  private void i(gA paramgA)
  {
    dGx.dhr().a(duv.lyz, true);

    dMj localdMj = new dMj(this, paramgA);

    Rl.acN().a(localdMj);
    bsP.getInstance().a(CH.bGv, localdMj, true);
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    super.g(paramByteBuffer);
    paramByteBuffer.putLong(this.bMN);
    return true;
  }

  public int O() {
    return super.O() + 8;
  }

  public void clear()
  {
  }
}