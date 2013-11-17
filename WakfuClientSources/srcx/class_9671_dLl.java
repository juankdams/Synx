import com.ankamagames.wakfu.client.binaryStorage.RecipeBinaryData;
import java.util.ArrayList;
import org.apache.log4j.Logger;

final class dLl
  implements gd
{
  dLl(deT paramdeT, cSR paramcSR)
  {
  }

  public void b(RecipeBinaryData paramRecipeBinaryData)
  {
    try
    {
      cGx localcGx = vv.a(paramRecipeBinaryData);
      this.maE.a(paramRecipeBinaryData.getId(), localcGx);

      BZ localBZ = localcGx.cBy();
      while (localBZ.hasNext()) {
        localBZ.fl();
        int i = localBZ.zY();
        ArrayList localArrayList = (ArrayList)this.maF.get(i);
        if (localArrayList == null) {
          localArrayList = new ArrayList();
          this.maF.put(i, localArrayList);
        }
        localArrayList.add(localcGx);
        if (!localcGx.c(yK.bso))
          bcF.fmQ.ci(i, this.maE.getId());
      }
    }
    catch (Exception localException) {
      vv.i().error("", localException);
    }
  }
}