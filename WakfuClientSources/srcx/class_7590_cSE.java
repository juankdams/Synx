import com.ankamagames.wakfu.client.binaryStorage.ProtectorBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ProtectorBuffListBinaryData;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cSE extends cEk
{
  private final dFu kEW = new dFu();
  private final aVS kEX;
  private final aVS kEY;
  public static final cSE kEZ = new cSE();

  private cSE()
  {
    this.kEY = new aVG(new ProtectorBinaryData());
    this.kEX = new aVG(new ProtectorBinaryData());
    cIs();
  }

  public boolean i(ayn paramayn)
  {
    ProtectorBinaryData localProtectorBinaryData = (ProtectorBinaryData)this.kEX.jt(paramayn.getId());
    if (localProtectorBinaryData == null) {
      return false;
    }
    aFL localaFL = b(localProtectorBinaryData);
    cYk localcYk = localaFL.aKb();
    paramayn.d(localcYk.getX(), localcYk.getY(), localcYk.IB());

    for (deN localdeN : localaFL.aSg()) {
      paramayn.a(localdeN);
    }
    paramayn.r(localaFL.aKc());

    return super.r(paramayn);
  }

  public ayn yY(int paramInt)
  {
    ayn localayn1 = (ayn)super.xz(paramInt);
    if (localayn1 != null) {
      return localayn1;
    }
    ProtectorBinaryData localProtectorBinaryData = (ProtectorBinaryData)this.kEY.jt(paramInt);
    if (localProtectorBinaryData == null)
      return null;
    ayn localayn2 = c(localProtectorBinaryData);
    localayn2.d(localProtectorBinaryData.avT(), localProtectorBinaryData.avU(), localProtectorBinaryData.avV());

    return localayn2;
  }

  public ayn yZ(int paramInt)
  {
    int i = this.kEW.get(paramInt);
    if (i != 0)
      return yY(i);
    return null;
  }

  public final void cIs()
  {
    this.kEW.clear();
    try {
      cze.cwb().a(new ProtectorBinaryData(), new bfr(this));
    }
    catch (Exception localException)
    {
      K.error("", localException);
    }
  }

  private static aFL b(ProtectorBinaryData paramProtectorBinaryData)
  {
    aFL localaFL = new aFL(paramProtectorBinaryData.CB());
    localaFL.d(paramProtectorBinaryData.avT(), paramProtectorBinaryData.avU(), paramProtectorBinaryData.avV());
    for (Qd localQd : paramProtectorBinaryData.avX())
      localaFL.a(new deN(localQd.getId(), localQd.abU(), localQd.abV(), localQd.abW()));
    localaFL.r(paramProtectorBinaryData.avW());
    return localaFL;
  }

  private static ayn c(ProtectorBinaryData paramProtectorBinaryData) {
    int i = paramProtectorBinaryData.CB();
    int j = paramProtectorBinaryData.bP();
    int k = paramProtectorBinaryData.avR();
    int m = paramProtectorBinaryData.aqS();

    cSR localcSR = new cSR();
    for (Object localObject3 : paramProtectorBinaryData.avY()) {
      localcSR.put(localObject3.xj(), new aCc(localObject3.no(), localObject3.np()));
    }

    ??? = new cSR();
    Qd[] arrayOfQd;
    for (arrayOfQd : paramProtectorBinaryData.avZ()) {
      ((cSR)???).put(arrayOfQd.xj(), new aCc(arrayOfQd.no(), arrayOfQd.np()));
    }

    ??? = new blx();
    ((blx)???).aRq = i;
    ((blx)???).aRr = new bDs();
    ((blx)???).aRr.gyY = j;
    ((blx)???).aRr.gyZ = j;
    ((blx)???).aRr.gza = k;

    ((blx)???).aRs = new bPH();
    ((blx)???).aRs.gXT = m;
    ((blx)???).aRs.gXU = -1L;
    try
    {
      cze.cwb().a(paramProtectorBinaryData.avK(), new ProtectorBuffListBinaryData(), new bfq((blx)???));
    }
    catch (Exception localException)
    {
      K.error("problème avec protector " + i, localException);
    }

    ((blx)???).aRB = new ed();
    localcSR.a(new bfp((blx)???));

    ((blx)???).aRC = new aKR();
    ((cSR)???).a(new bfo((blx)???));

    ByteBuffer localByteBuffer = ByteBuffer.wrap(cBP.isO.a((blx)???));
    ayn localayn = (ayn)dfR.lay.N(localByteBuffer);

    for (Qd localQd : paramProtectorBinaryData.avX()) {
      localayn.a(new deN(localQd.getId(), localQd.abU(), localQd.abV(), localQd.abW()));
    }
    return localayn;
  }
}