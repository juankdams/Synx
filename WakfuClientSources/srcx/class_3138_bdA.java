import com.ankamagames.wakfu.client.binaryStorage.AreaEffectBinaryData;
import org.apache.log4j.Logger;

public final class bdA extends bMF
{
  private final aVS bh;

  public bdA()
  {
    this(new aVG(new AreaEffectBinaryData()));
  }

  public bdA(aVS paramaVS) {
    this.bh = paramaVS;
  }

  public bbx ff(long paramLong)
  {
    if (super.ff(paramLong) == null) {
      fg(paramLong);
    }
    return super.ff(paramLong);
  }

  private void fg(long paramLong) {
    if (paramLong <= 0L) {
      return;
    }
    AreaEffectBinaryData localAreaEffectBinaryData = (AreaEffectBinaryData)this.bh.jt((int)paramLong);
    if (localAreaEffectBinaryData == null) {
      return;
    }
    aAn localaAn = bQd.gYm.b(localAreaEffectBinaryData);

    if (localaAn == null) {
      return;
    }

    localaAn.hd(false);
    e(localaAn);

    if (localAreaEffectBinaryData.vD() == null) {
      return;
    }
    for (int k : localAreaEffectBinaryData.vD()) {
      dpI localdpI = ciQ.ckL().vt(k);
      if (localdpI != null)
        localaAn.a(localdpI);
      else
        K.error("Problème de chargmeent de effectArea " + localAreaEffectBinaryData.getId());
    }
  }

  public bmS fh(long paramLong)
  {
    if (super.fh(paramLong) == null) {
      fg(paramLong);
    }
    return super.fh(paramLong);
  }

  public aho fi(long paramLong)
  {
    if (super.fi(paramLong) == null) {
      fg(paramLong);
    }
    return super.fi(paramLong);
  }

  public fk fj(long paramLong)
  {
    if (super.fj(paramLong) == null) {
      fg(paramLong);
    }
    return super.fj(paramLong);
  }

  public aYV fk(long paramLong)
  {
    if (super.fk(paramLong) == null) {
      fg(paramLong);
    }
    return super.fk(paramLong);
  }

  public hq fl(long paramLong)
  {
    if (super.fl(paramLong) == null) {
      fg(paramLong);
    }
    return super.fl(paramLong);
  }

  public bQv fm(long paramLong)
  {
    if (super.fm(paramLong) == null) {
      fg(paramLong);
    }
    return super.fm(paramLong);
  }

  public cTE fn(long paramLong)
  {
    if (super.fn(paramLong) == null) {
      fg(paramLong);
    }
    return super.fn(paramLong);
  }

  public aAn fo(long paramLong)
  {
    if (super.fo(paramLong) == null) {
      fg(paramLong);
    }
    return super.fo(paramLong);
  }

  public awr fp(long paramLong)
  {
    awr localawr = super.fp(paramLong);
    if (localawr != null) {
      return localawr;
    }

    fg(paramLong);
    return super.fp(paramLong);
  }
}