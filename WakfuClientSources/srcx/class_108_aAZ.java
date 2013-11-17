import com.ankamagames.wakfu.client.core.script.fightLibrary.effectArea.EffectAreaFunctionsLibrary;

public class aAZ extends aIN
{
  private final boolean dUH;

  public aAZ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, long paramLong)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.dUH = paramBoolean;

    c(new hQ[] { new EffectAreaFunctionsLibrary(this) });

    bMF.bUo().fo(paramLong);

    if (LC() != null) {
      aAn localaAn = bMF.bUo().fo(paramLong);
      if ((localaAn instanceof amo))
        ko(((amo)localaAn).uN());
    }
  }

  public long mC()
  {
    Su localSu = dX(gA());

    if (LC() != null) {
      cjK localcjK = LC().ec(bwv());

      if (localcjK != null) {
        if (this.dUH) {
          localcjK.a((aVc)null, localSu);

          long l1 = 0L;
          if ((localcjK instanceof dhy)) {
            dhy localdhy = (dhy)localcjK;
            if (localdhy.cz("AnimAttaque")) {
              l1 = localdhy.Uc().na("AnimAttaque");
            }

          }

          long l2 = super.mC();
          return l2 > l1 ? l2 : l1;
        }
        localcjK.g(localSu);
      }

    }

    bZw();
    return -1L;
  }

  protected void kO()
  {
  }
}