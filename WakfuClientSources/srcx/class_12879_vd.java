import com.ankamagames.wakfu.client.binaryStorage.ItemBinaryData;
import org.apache.log4j.Logger;

public final class vd extends Hh
{
  private final adz bjf = new adz();
  private final aVG bjg;
  private final aoP bjh;

  public vd()
  {
    this.bjg = new aVG(new ItemBinaryData());
    this.bjh = new aoP();
  }

  public bVw de(int paramInt)
  {
    if (paramInt <= 0) {
      return null;
    }

    if (this.bPq.containsKey(paramInt)) {
      return (bVw)this.bPq.get(paramInt);
    }

    ItemBinaryData localItemBinaryData = (ItemBinaryData)this.bjg.jt(paramInt);
    if (localItemBinaryData == null) {
      return null;
    }
    bBn localbBn = this.bjh.b(localItemBinaryData);
    if (!(localbBn instanceof bVw)) {
      return null;
    }

    bVw localbVw = (bVw)localbBn;
    c(localbVw);
    return localbVw;
  }

  public cSR DZ()
  {
    cSR localcSR = new cSR();
    try
    {
      cze.cwb().a(new ItemBinaryData(), new cdx(this, localcSR));
    }
    catch (Exception localException)
    {
      K.error("", localException);
    }

    return localcSR;
  }

  public boolean df(int paramInt) {
    return this.bjf.contains(paramInt);
  }

  public void dg(int paramInt) {
    this.bjf.hL(paramInt);
  }
}