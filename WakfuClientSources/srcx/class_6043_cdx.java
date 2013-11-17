import com.ankamagames.wakfu.client.binaryStorage.ItemBinaryData;
import org.apache.log4j.Logger;

class cdx
  implements gd
{
  cdx(vd paramvd, cSR paramcSR)
  {
  }

  public void l(ItemBinaryData paramItemBinaryData)
  {
    try
    {
      bBn localbBn = vd.a(this.hwX).b(paramItemBinaryData);
      this.cTM.put(localbBn.getId(), localbBn);
    } catch (Exception localException) {
      vd.i().error("Exception levee sur " + paramItemBinaryData.getId(), localException);
    }
  }
}