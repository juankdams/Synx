import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class cg extends dKc
{
  protected static final Logger K = Logger.getLogger(cg.class);
  private final Su Rl;
  private int Rm;
  private final HashMap Rn = new HashMap();

  public cg(Su paramSu) {
    this.Rl = paramSu;
  }

  public short fU() {
    return 20;
  }

  public boolean fV() {
    return true;
  }

  public void begin() {
    K.info("[EMOTE] Lancement de l'occupation pour le joueur " + this.Rl);

    this.Rl.q(false, true);
    this.Rl.a(this.Rm, this.Rn, true);

    this.Rl.a(this);
    if (fX())
      fY();
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      ayC localayC = new ayC();
      localayC.bt((byte)3);
      localayC.aS(fU());
      byv.bFN().aJK().d(localayC);
    }

    return fW();
  }

  public boolean fW() {
    K.info("[EMOTE] Arrêt de l'occupation pour le joueur " + this.Rl);
    if (fX())
      fZ();
    return true;
  }

  public void b(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.Rm = localByteBuffer.getInt();
    int i = localByteBuffer.get();
    for (int j = 0; j < i; j++) {
      byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
      localByteBuffer.get(arrayOfByte);
      this.Rn.put(dzp.aJ(arrayOfByte), Long.valueOf(localByteBuffer.getLong()));
    }
  }

  private boolean fX() {
    doe localdoe = bmJ.fFu.qi(this.Rm);
    if (localdoe == null) {
      K.error("Emote inconnu: " + this.Rm);
      return false;
    }
    int i = this.Rl == byv.bFN().bFO() ? 1 : 0;
    return (i != 0) && (localdoe.aTl());
  }

  private void fY() {
    ciB localciB = cpT.hZb.cpc();
    localciB.q(localciB.alh() * 0.2F, 700.0F);
  }

  private void fZ() {
    ciB localciB = cpT.hZb.cpc();
    aIH localaIH = WakfuClientInstance.awy().awB();
    float f = localaIH.c(yR.bsB);
    localciB.q(f, 700.0F);
  }

  public boolean ga()
  {
    return true;
  }
}