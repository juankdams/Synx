import com.ankamagames.wakfu.client.binaryStorage.TeleporterBinaryData;
import org.apache.log4j.Logger;

final class beR
  implements gd
{
  public void a(TeleporterBinaryData paramTeleporterBinaryData)
  {
    dQd localdQd = new dQd(paramTeleporterBinaryData.coz(), paramTeleporterBinaryData.gC(), paramTeleporterBinaryData.LI(), paramTeleporterBinaryData.coA(), paramTeleporterBinaryData.ayN(), paramTeleporterBinaryData.bej(), paramTeleporterBinaryData.ayP(), paramTeleporterBinaryData.coB(), paramTeleporterBinaryData.coC());

    aKY.epr.a(localdQd);
    for (abn localabn : paramTeleporterBinaryData.coD()) {
      int k = localabn.anL();
      int m = localabn.getX();
      int n = localabn.getY();
      int i1 = localabn.Go();
      int i2 = localabn.anM();
      CG localCG = CG.eu(localabn.FW());
      int i3 = localabn.anN();
      Object localObject = null;
      try {
        localObject = aVj.hn(localabn.uL());
      } catch (Exception localException) {
        TO.ch().warn(localException.getMessage());
      }
      if (localObject == null)
        localObject = bBB.gus;
      w localw = new w(k, m, n, i1, (short)i2, localCG, (short)i3, (bZA)localObject);

      localdQd.b(localw);
      localw.a(new dIk(localabn.anO(), localabn.anP(), localabn.anQ(), localabn.anR()));
    }
  }
}