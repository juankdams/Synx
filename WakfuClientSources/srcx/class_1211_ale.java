import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBuildingBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBuildingCatalogBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBuildingDecoBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBuildingEvolutionBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBuildingVisualDefinitionBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.HavenWorldDefinitionBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.HavenWorldPatchDefinitionBinaryData;
import org.apache.log4j.Logger;

public class ale
  implements asq
{
  private static final Logger K = Logger.getLogger(ale.class);

  public static final ale dlT = new ale();

  public void a(dnq paramdnq) {
    try {
      axL();
      axN();
      axM();
      axO();
      axP();
      axR();
      axQ();

      aDF.aPL();
      Ab.IU().IV();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    } finally {
      paramdnq.c(this);
    }
  }

  public String getName()
  {
    return null;
  }

  private void axL() {
    cze.cwb().a(new HavenWorldDefinitionBinaryData(), new biP(this));
  }

  private void axM()
  {
    cze.cwb().a(new HavenWorldBuildingBinaryData(), new bjb(this));
  }

  private void axN()
  {
    cze.cwb().a(new HavenWorldBuildingDecoBinaryData(), new biZ(this));
  }

  private void a(HavenWorldBuildingBinaryData paramHavenWorldBuildingBinaryData, dde paramdde)
  {
    cgj[] arrayOfcgj1 = paramHavenWorldBuildingBinaryData.bZE();
    if (arrayOfcgj1.length != 0) {
      ctR localctR = new ctR();
      for (cgj localcgj : arrayOfcgj1) {
        localctR.put(localcgj.gw(), localcgj.bcY());
      }
      paramdde.a(localctR);
    }
  }

  private void axO() {
    cze.cwb().a(new HavenWorldBuildingVisualDefinitionBinaryData(), new biW(this));
  }

  private void axP()
  {
    cze.cwb().a(new HavenWorldBuildingCatalogBinaryData(), new biV(this));
  }

  private void axQ()
  {
    cze.cwb().a(new HavenWorldPatchDefinitionBinaryData(), new bjd(this));
  }

  private void axR()
  {
    cze.cwb().a(new HavenWorldBuildingEvolutionBinaryData(), new bjc(this));
  }
}