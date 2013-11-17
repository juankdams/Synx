import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bgy
  implements cvW
{
  private static final Logger K = Logger.getLogger(bgy.class);
  public static final byte fup = 0;
  public static final byte fuq = 1;
  public static final byte fur = 2;
  private static final bgy fus = new bgy();
  private static final String cgf = "APSTarget";
  private static final float[] fut = { 1.0F, 1.0F, 1.0F, 0.6F };
  private DisplayedScreenElement cgj;
  private bMh fuu;
  private cew fuv;
  private byte fuw;

  public void cJ(byte paramByte)
  {
    this.fuw = paramByte;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    try {
      dbL.cNv().oL("APSTarget");
    } catch (Exception localException) {
      K.error("Erreur durant la création d'un layer sur le HighLightManager");
    }
    dGx.dhr().a(duv.lyt, true);
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (this.fuu != null) {
      cYk localcYk = this.cgj == null ? null : new cYk(this.cgj.fa(), this.cgj.fb(), this.cgj.fc());
      this.fuu.K(localcYk);
      this.fuu = null;
    }

    dbL.cNv().oO("APSTarget");
    dbL.cNv().oM("APSTarget");
    dGx.dhr().unlock();
    this.fuw = 0;
    this.cgj = null;
    if (this.fuv != null) {
      this.fuv.cgT();
      this.fuv = null;
    }
  }

  public boolean a(cWG paramcWG) {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    aqQ localaqQ;
    dCb localdCb;
    Object localObject1;
    switch (paramcWG.getId()) {
    case 19994:
      localaqQ = (aqQ)paramcWG;
      localdCb = localaTL.biV();
      Object localObject2;
      if ((localdCb instanceof cew)) {
        localObject1 = (cew)localdCb;
        ((cew)localObject1).cgS();
        this.fuv = ((cew)localObject1);
        localObject2 = btb.bBd().d(((cew)localObject1).fa(), ((cew)localObject1).fb(), ((cew)localObject1).fc(), cWj.kJj);

        if (localObject2 != this.cgj) {
          if (localObject2 != null) {
            dbL.cNv().oO("APSTarget");
            dbL.cNv().h(((DisplayedScreenElement)localObject2).bpf(), "APSTarget");
            dbL.cNv().oN("APSTarget").g(fut);
          }
          this.cgj = ((DisplayedScreenElement)localObject2);
        }
      }
      else if (this.fuv != null) {
        this.fuv.cgT();
        this.fuv = null;
      } else {
        localObject1 = WakfuClientInstance.awy().Dg().a(localaqQ.aCX(), localaqQ.aCY(), 0.0F, bYP.hoG);
        localObject2 = null;
        if (localObject1 != null) {
          for (int i = 0; i < ((ArrayList)localObject1).size(); i++) {
            DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)((ArrayList)localObject1).get(i);
            if (cwO.v(localDisplayedScreenElement.fa(), localDisplayedScreenElement.fb(), localDisplayedScreenElement.fc())) {
              localObject2 = localDisplayedScreenElement;
              break;
            }
          }
        }
        if (localObject2 != this.cgj) {
          if (localObject2 != null) {
            dbL.cNv().oO("APSTarget");
            dbL.cNv().h(((DisplayedScreenElement)localObject2).bpf(), "APSTarget");
            dbL.cNv().oN("APSTarget").g(fut);
          }
          this.cgj = ((DisplayedScreenElement)localObject2);
        }
      }

      return false;
    case 19992:
      localaqQ = (aqQ)paramcWG;
      if (localaqQ.aCU()) {
        localdCb = localaTL.biV();
        if (((this.fuw == 2) || (this.fuw == 0)) && ((localdCb instanceof cew)) && (this.fuu != null))
        {
          localObject1 = (cew)localdCb;
          this.fuu.q((cew)localObject1);
          this.fuu = null;
        }
        if (((this.fuw == 1) || (this.fuw == 0)) && (this.fuu != null))
        {
          localObject1 = bYZ.a(WakfuClientInstance.awy().Dg(), localaqQ.aCX(), localaqQ.aCY(), true);
          this.fuu.J((cYk)localObject1);
          this.fuu = null;
        }
      }

      byv.bFN().b(this);
    }

    return false;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public static bgy bte()
  {
    return fus;
  }

  public void a(bMh parambMh) {
    this.fuu = parambMh;
  }
}