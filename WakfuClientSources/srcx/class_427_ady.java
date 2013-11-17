import com.ankamagames.wakfu.client.binaryStorage.ItemSetBinaryData;
import org.apache.log4j.Logger;

class ady
  implements gd
{
  ady(bCc parambCc, cSR paramcSR)
  {
  }

  public void a(ItemSetBinaryData paramItemSetBinaryData)
  {
    try
    {
      dLB localdLB = bCc.c(paramItemSetBinaryData);

      this.cTM.put(localdLB.nc(), localdLB);
    } catch (Exception localException) {
      bCc.ch().error("Exception levee sur " + paramItemSetBinaryData.nc(), localException);
    }
  }
}