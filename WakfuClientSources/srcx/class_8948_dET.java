import com.ankamagames.wakfu.client.binaryStorage.ProtectorBuffBinaryData;
import org.apache.log4j.Logger;

class dET
  implements gd
{
  dET(dcQ paramdcQ)
  {
  }

  public void b(ProtectorBuffBinaryData paramProtectorBuffBinaryData)
  {
    int i = paramProtectorBuffBinaryData.acm();
    String str = paramProtectorBuffBinaryData.uL();
    byte b = paramProtectorBuffBinaryData.djH();
    int[] arrayOfInt = paramProtectorBuffBinaryData.djI();
    dcQ.a(this.lNQ, paramProtectorBuffBinaryData);
    try
    {
      bZA localbZA = aVj.hn(str);
      cBV localcBV = (cBV)dPR.mji.a(i, localbZA, b, arrayOfInt);

      localcBV.iT(paramProtectorBuffBinaryData.oc());
      localcBV.setName(bU.fH().b(50, i, new Object[0]));
      localcBV.setDescription(bU.fH().b(51, i, new Object[0]));
    }
    catch (Exception localException) {
      dcQ.K.error("Exception levée lors de l'interprétation du critère : " + str);
    }
  }
}