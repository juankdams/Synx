import com.ankamagames.wakfu.client.binaryStorage.MagiCraftLootListBinaryData;
import org.apache.log4j.Logger;

class zL
  implements gd
{
  zL(dxd paramdxd)
  {
  }

  public void a(MagiCraftLootListBinaryData paramMagiCraftLootListBinaryData)
  {
    aBs localaBs = new aBs();
    uX[] arrayOfuX = paramMagiCraftLootListBinaryData.cjs();
    int i = 0; for (int j = arrayOfuX.length; i < j; i++) {
      uX localuX = arrayOfuX[i];
      if (bSx.hdo.tU(localuX.gw()) == null) {
        dxd.ch().error("Item a looter inconnu : " + localuX.gw() + " sur la lootList de forgemagie.");
      }
      else {
        localaBs.a(new drE(localuX.gw()));
      }
    }
    AB.bwj.a(localaBs);
  }
}