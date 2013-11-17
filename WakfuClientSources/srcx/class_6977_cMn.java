import com.ankamagames.wakfu.client.binaryStorage.MonsterBinaryData;
import org.apache.log4j.Logger;

public class cMn extends drn
{
  private final dqx krG = new dqx();

  private static final cMn krH = new cMn();
  private final aVS bh;

  public static cMn cFp()
  {
    return krH;
  }

  private cMn() {
    this.bh = new aVG(new MonsterBinaryData());
  }

  public bdi[] cFq() {
    return (bdi[])this.ltL.d(new bdi[this.ltL.size()]);
  }

  public bdi dP(short paramShort)
  {
    if (paramShort <= 0)
      return null;
    bdi localbdi = (bdi)this.ltL.cx(paramShort);
    if (localbdi != null) {
      return localbdi;
    }

    MonsterBinaryData localMonsterBinaryData = (MonsterBinaryData)this.bh.jt(paramShort);
    if (localMonsterBinaryData == null)
      return null;
    localbdi = this.krG.b(localMonsterBinaryData);
    if (localbdi != null) {
      e(localbdi);
    }
    return localbdi;
  }

  public cSR DZ()
  {
    cSR localcSR = new cSR();
    try {
      cze.cwb().a(new MonsterBinaryData(), new bKz(this, localcSR));
    }
    catch (Exception localException)
    {
      K.error("", localException);
    }
    return localcSR;
  }
}