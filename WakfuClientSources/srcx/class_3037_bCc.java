import com.ankamagames.wakfu.client.binaryStorage.ItemSetBinaryData;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bCc extends cCe
{
  private static final Logger K = Logger.getLogger(bCc.class);

  private static final bCc gwl = new bCc();
  private aVS gwm;

  public static bCc bKN()
  {
    return gwl;
  }

  private bCc() {
    this.gwm = new aVG(new ItemSetBinaryData());
  }

  public void a(aVS paramaVS) {
    this.gwm = paramaVS;
  }

  public dLB cm(short paramShort)
  {
    if (paramShort <= 0) {
      return null;
    }
    dLB localdLB = (dLB)this.iup.cx(paramShort);
    if ((localdLB == null) && (!this.iup.contains(paramShort))) {
      ItemSetBinaryData localItemSetBinaryData = (ItemSetBinaryData)this.gwm.jt(paramShort);
      if (localItemSetBinaryData == null) {
        return null;
      }
      localdLB = b(localItemSetBinaryData);

      c(localdLB);
    }
    return localdLB;
  }

  private static dLB b(ItemSetBinaryData paramItemSetBinaryData)
  {
    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt = paramItemSetBinaryData.aTK();
    int i = arrayOfInt == null ? 0 : arrayOfInt.length;
    for (int j = 0; j < i; j++) {
      int k = arrayOfInt[j];
      bVw localbVw = (bVw)Hh.QM().dh(k);
      if (localbVw == null) {
        K.warn("item inconnu itemId=" + k + " pour la panop " + paramItemSetBinaryData.nc());
      }
      else
      {
        localArrayList.add(localbVw);
      }
    }
    dLB localdLB = new dLB(paramItemSetBinaryData.nc(), paramItemSetBinaryData.aTJ(), localArrayList);
    a(paramItemSetBinaryData, localdLB);

    localdLB.doS();

    return localdLB;
  }

  public static void a(ItemSetBinaryData paramItemSetBinaryData, ctU paramctU) {
    cSR localcSR = paramItemSetBinaryData.aTL();
    if ((localcSR != null) && (!localcSR.isEmpty()))
      localcSR.a(new adw(paramctU));
  }

  public cSR DZ()
  {
    cSR localcSR = new cSR();
    try
    {
      cze.cwb().a(new ItemSetBinaryData(), new ady(this, localcSR));
    }
    catch (Exception localException)
    {
      K.error("", localException);
    }

    return localcSR;
  }
}