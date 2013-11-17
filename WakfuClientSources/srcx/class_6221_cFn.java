import com.ankamagames.wakfu.client.binaryStorage.TimelineBuffListBinaryData;
import org.apache.log4j.Logger;

class cFn
  implements gd
{
  cFn(Pt paramPt)
  {
  }

  public void a(TimelineBuffListBinaryData paramTimelineBuffListBinaryData)
  {
    int[] arrayOfInt = paramTimelineBuffListBinaryData.vD();
    if (arrayOfInt.length > 0) {
      int i = arrayOfInt[0];
      dpI localdpI = ciQ.ckL().vt(i);
      if (localdpI == null)
        Pt.ch().error("Problème de chargmeent de Timelinebuff " + paramTimelineBuffListBinaryData.getId());
      else {
        cMB.krT.a(localdpI, paramTimelineBuffListBinaryData.getId());
      }
      cMB.krT.eq(i, paramTimelineBuffListBinaryData.oc());
      cMB.krT.a(cko.vC(paramTimelineBuffListBinaryData.xj()), i);
    }
  }
}