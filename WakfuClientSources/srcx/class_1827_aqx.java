import com.ankamagames.wakfu.client.binaryStorage.ArcadeChallengeBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ArcadeDungeonBinaryData;
import org.apache.log4j.Logger;

public class aqx
  implements asq
{
  private static final Logger K = Logger.getLogger(aqx.class);

  public static final aqx dyc = new aqx();

  private dFu dyd = new dFu();

  public void a(dnq paramdnq) {
    cze.cwb().a(new ArcadeDungeonBinaryData(), new bqL(this));

    paramdnq.c(this);
  }

  public String getName() {
    return null;
  }

  public dVR jx(int paramInt) {
    return jy(this.dyd.get(paramInt));
  }

  public dVR jy(int paramInt) {
    dVR localdVR = new dVR(paramInt);
    try {
      cze.cwb().a(paramInt, new ArcadeDungeonBinaryData(), new bqM(this, localdVR));
    }
    catch (Exception localException)
    {
      K.error("Problème avec le donjon " + paramInt, localException);
      return null;
    }
    return localdVR;
  }

  private JF i(int paramInt, float paramFloat) {
    ArcadeChallengeBinaryData localArcadeChallengeBinaryData = new ArcadeChallengeBinaryData();
    if (cze.cwb().a(paramInt, localArcadeChallengeBinaryData))
      return new JF(localArcadeChallengeBinaryData.getId(), paramFloat);
    throw new Exception("Pas de défi avec id=" + paramInt);
  }

  public String jz(int paramInt) {
    return bU.fH().b(113, paramInt, new Object[0]);
  }

  public String jA(int paramInt) {
    return bU.fH().b(118, paramInt, new Object[0]);
  }

  public String jB(int paramInt) {
    return bU.fH().b(112, paramInt, new Object[0]);
  }
}