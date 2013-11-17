import com.ankamagames.wakfu.client.binaryStorage.CraftBinaryData;
import org.apache.log4j.Logger;

class dLm
  implements gd
{
  dLm(vv paramvv)
  {
  }

  public void c(CraftBinaryData paramCraftBinaryData)
  {
    try
    {
      deT localdeT = vv.b(paramCraftBinaryData);
      DA.bIr.a(localdeT);
      for (localdmn = localdeT.cPi(); localdmn.hasNext(); ) {
        localdmn.fl();
        for (bmj localbmj : ((cGx)localdmn.value()).cBx())
          ((vd)Hh.QM()).dg(localbmj.gw());
      }
    }
    catch (Exception localException)
    {
      dmn localdmn;
      vv.i().error("[GD] Exception au chargement du métier " + paramCraftBinaryData.axX(), localException);
    }
  }
}