import com.ankamagames.wakfu.client.binaryStorage.LightLootListBinaryData;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class abS
  implements cvW
{
  private static final Logger K = Logger.getLogger(abS.class);

  private static final abS cQw = new abS();
  public static final int cQx = 2000;
  private bnm N;
  private VQ cQy;
  private ArrayList cQz;
  private static final int cQA = 25;
  private ZG cQB;
  private dpu cQC;
  private long cfv;

  public abS()
  {
    this.cQz = new ArrayList();
  }

  public static abS aob()
  {
    return cQw;
  }

  public boolean a(cWG paramcWG) {
    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if ((this.cQy == null) || (this.cQC == null)) {
        return;
      }

      this.N = new bov(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().j("wakfu.blindBox", zY.class);

      bpn localbpn = (bpn)cBQ.cxL().a("blindBoxDialog", VV.dJ("blindBoxDialog"), 8448L, (short)10005);

      cpa localcpa = cBQ.cxL().coO().nf("blindBoxDialog");
      ccG localccG = (ccG)localcpa.fi("rollingItemList1");
      localccG.a(new bou(this, localccG));

      this.cQz.add(new aRB(this, localccG));
      this.cQz.add(new aRB(this, (ccG)localcpa.fi("rollingItemList2")));
      this.cQz.add(new aRB(this, (ccG)localcpa.fi("rollingItemList3")));

      dLE.doY().t("blindBox", this.cQy);
    }
  }

  private void aoc()
  {
    for (aRB localaRB : this.cQz) {
      localaRB.a(false, 0.9F);
    }
    dka.cSF().a(new bot(this), 2000L, 1);

    this.cQB = aWc.blo().g(600152L, true);
    if (this.cQB != null) {
      this.cQB.ae(0.0F);
      this.cQB.q(1.0F, 100.0F);
    }
  }

  private void ao(short paramShort) {
    for (aRB localaRB : this.cQz)
      aRB.a(localaRB, paramShort, false, 0.9F);
  }

  private int a(ccG paramccG, float paramFloat)
  {
    if (paramccG == null) {
      return -1;
    }

    paramccG.setListOffset(paramFloat);
    this.cQy.Z(paramFloat);
    return -1;
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.cQB != null) {
        this.cQB.bH(true);
        this.cQB.q(0.0F, 100.0F);
        this.cQB = null;
      }
      for (aRB localaRB : this.cQz) {
        dka.cSF().j(localaRB);
      }
      this.cQz.clear();

      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("blindBox");

      cBQ.cxL().mW("blindBoxDialog");
      cBQ.cxL().mN("wakfu.blindBox");
    }
  }

  public void a(VQ paramVQ) {
    this.cQy = paramVQ;
  }

  private ArrayList hC(int paramInt) {
    ArrayList localArrayList = new ArrayList();
    try {
      LightLootListBinaryData localLightLootListBinaryData = new LightLootListBinaryData();
      if (cze.cwb().a(paramInt, localLightLootListBinaryData))
        for (bkD localbkD : localLightLootListBinaryData.cri()) {
          int k = localbkD.gw();
          localArrayList.add((bVw)vd.QM().dh(k));
        }
    }
    catch (Exception localException) {
      K.error("Prioblème de récupération des info pour la loot List id=" + paramInt);
    }

    return localArrayList;
  }

  public void hD(int paramInt) {
    int i = this.cQy.indexOf(paramInt);
    ao((short)i);
  }

  public void a(dpu paramdpu, gA paramgA) {
    this.cfv = paramgA.oj();
    this.cQC = paramdpu;
    this.cQy = new VQ(paramgA.getName(), hC(paramdpu.cXd()));
  }

  public byte aod()
  {
    byte b = 0;
    for (aRB localaRB : this.cQz) {
      if (localaRB.azx()) {
        b = (byte)(b + 1);
      }
    }
    return b;
  }

  private void aoe() {
    int i = -1;
    int j = aod();
    switch (j) {
    case 1:
      i = 600153;
      break;
    case 2:
      i = 600154;
      break;
    case 3:
      i = 600155;
      break;
    default:
      return;
    }

    aWc.blo().eO(i);
    if (j < 3) {
      return;
    }
    this.cQy.bz(true);
    aWc.blo().eO(600156L);
    cpa localcpa = cBQ.cxL().coO().nf("blindBoxDialog");
    dRq localdRq = (dRq)localcpa.fi("containerParticle");

    cag localcag = new cag();
    localcag.aJ();
    localcag.setUseParentScissor(true);
    localcag.setFile("6001051.xps");
    localcag.setAlignment(aFG.eck);
    localdRq.getAppearance().a(localcag);

    if (this.cQB != null) {
      this.cQB.bH(true);
      this.cQB.q(0.0F, 100.0F);
      this.cQB = null;
    }
  }
}