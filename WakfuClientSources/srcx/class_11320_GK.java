import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class GK extends dKf
{
  private static final Logger K = Logger.getLogger(GK.class);
  private int Rm;
  private long kD;

  public GK(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
    this.Rm = Integer.valueOf(paramArrayOfString[0]).intValue();
  }

  public boolean f(gA paramgA) {
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return false;
    }

    aah localaah = new aah(this, paramgA);

    if (!localbyz.bGE().a(this.Rm, localaah))
      K.error("[ItemAction] Impossible d'utiliser l'Emote " + this.Rm);
    return true;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    super.g(paramByteBuffer);
    doe localdoe = bmJ.fFu.qi(this.Rm);
    paramByteBuffer.put((byte)(localdoe.aTk() ? 1 : 0));
    paramByteBuffer.putLong(this.kD);
    return false;
  }

  public int O() {
    return super.O() + 1 + 8;
  }

  public void clear() {
    this.kD = -1L;
  }
}