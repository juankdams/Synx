import com.ankamagames.wakfu.client.binaryStorage.AudioMarkerInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.BackgroundInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.BoardInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.BookcaseInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.CollectInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.CraftInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.DecorationInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.DestructibleElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.DoorInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.DungeonDisplayerInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.EquipableDummyInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ExchangeInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.GemBackgroundInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.GenericActivableInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBoardInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.KrosmozGameBoardInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.KrosmozGameCollectionInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.LootChestInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.MarketBoardInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.RecycleMachineInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.RewardDisplayerInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.StoolInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.StorageBoxBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.StreetLightInteractiveElementParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.TeleporterBinaryData;
import org.apache.log4j.Logger;

public class TO
  implements asq
{
  private static final Logger K = Logger.getLogger(TO.class);

  private static final TO cxa = new TO();
  private static final int cxb = 186;

  public static TO agI()
  {
    return cxa;
  }

  public void a(dnq paramdnq)
  {
    agX();
    agW();
    agV();
    agU();
    agS();
    agT();
    agR();
    agQ();
    agO();
    agN();
    agM();
    agY();
    agL();
    agP();
    agK();
    agJ();
    agZ();
    aha();
    ahb();
    ahc();
    ahd();
    ahe();
    ahf();
    ahg();
    ahh();
    ahi();

    paramdnq.c(this);
  }

  private static void agJ() {
    cze.cwb().a(new ExchangeInteractiveElementParamBinaryData(), new beN());
  }

  private static void agK()
  {
    cze.cwb().a(new GenericActivableInteractiveElementParamBinaryData(), new beP());
  }

  private void agL()
  {
    cze.cwb().a(new MarketBoardInteractiveElementParamBinaryData(), new beS(this));
  }

  private static void agM()
  {
    cze.cwb().a(new TeleporterBinaryData(), new beR());
  }

  private static void agN()
  {
    cze.cwb().a(new CollectInteractiveElementParamBinaryData(), new beX());
  }

  private static void agO()
  {
    cze.cwb().a(new LootChestInteractiveElementParamBinaryData(), new beU());
  }

  private static void agP()
  {
    cze.cwb().a(new StorageBoxBinaryData(), new beZ());
  }

  private static void agQ()
  {
    cze.cwb().a(new DestructibleElementParamBinaryData(), new beY());
  }

  private static void agR()
  {
    cze.cwb().a(new BackgroundInteractiveElementParamBinaryData(), new bfa());
  }

  private static void agS()
  {
    cze.cwb().a(new BoardInteractiveElementParamBinaryData(), new byV());
  }

  private static void agT()
  {
    cze.cwb().a(new AudioMarkerInteractiveElementParamBinaryData(), new byU());
  }

  private static void agU()
  {
    cze.cwb().a(new StreetLightInteractiveElementParamBinaryData(), new byX());
  }

  private static void agV()
  {
    cze.cwb().a(new GemBackgroundInteractiveElementParamBinaryData(), new byW());
  }

  private static void agW()
  {
    cze.cwb().a(new DecorationInteractiveElementParamBinaryData(), new byZ());
  }

  private static void agX()
  {
    cze.cwb().a(new CraftInteractiveElementParamBinaryData(), new byY());
  }

  private static void agY()
  {
    cze.cwb().a(new StoolInteractiveElementParamBinaryData(), new bzc());
  }

  private static void agZ()
  {
    cze.cwb().a(new RecycleMachineInteractiveElementParamBinaryData(), new bza());
  }

  private static void aha()
  {
    cze.cwb().a(new DungeonDisplayerInteractiveElementParamBinaryData(), new bzf());
  }

  private static void ahb()
  {
    cze.cwb().a(new RewardDisplayerInteractiveElementParamBinaryData(), new bzd());
  }

  private static void ahc()
  {
    cze.cwb().a(new HavenWorldBoardInteractiveElementParamBinaryData(), new byE());
  }

  private static void ahd()
  {
    aRz localaRz = new aRz(1, 186, aPb.ewn, 0);

    aKY.epr.a(localaRz);
  }

  private static void ahe()
  {
    cze.cwb().a(new EquipableDummyInteractiveElementParamBinaryData(), new byD());
  }

  private static void ahf()
  {
    cze.cwb().a(new BookcaseInteractiveElementParamBinaryData(), new byC());
  }

  private static void ahg()
  {
    cze.cwb().a(new KrosmozGameBoardInteractiveElementParamBinaryData(), new byI());
  }

  private static void ahh()
  {
    cze.cwb().a(new KrosmozGameCollectionInteractiveElementParamBinaryData(), new byH());
  }

  private static void ahi()
  {
    cze.cwb().a(new DoorInteractiveElementParamBinaryData(), new byF());
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.ie.params");
  }

  public static int a(ChaosParamBinaryData paramChaosParamBinaryData) {
    if (paramChaosParamBinaryData == null) {
      return 0;
    }
    return paramChaosParamBinaryData.ckc();
  }

  public static aPb b(ChaosParamBinaryData paramChaosParamBinaryData) {
    if (paramChaosParamBinaryData == null) {
      return aPb.ewn;
    }
    return aPb.bX(paramChaosParamBinaryData.cnM());
  }
}