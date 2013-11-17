import com.ankamagames.wakfu.client.binaryStorage.BackgroundFeedbackBinaryData;
import java.util.ArrayList;

class bUB
  implements gd
{
  bUB(djz paramdjz)
  {
  }

  public void a(BackgroundFeedbackBinaryData paramBackgroundFeedbackBinaryData)
  {
    ArrayList localArrayList = new ArrayList();
    for (Object localObject2 : paramBackgroundFeedbackBinaryData.cMK()) {
      localArrayList.add(new qi(localObject2.getId(), localObject2.cJX(), localObject2.cJY(), localObject2.cJZ()));
    }

    ??? = bdD.bJ(paramBackgroundFeedbackBinaryData.getType());
    if ((((bdD)???).brI()) && (paramBackgroundFeedbackBinaryData.cMK().length % 2 != 0)) {
      localArrayList.add(new qi(-1, (short)localArrayList.size(), (short)0, -1));
    }

    Bn localBn = new Bn((bdD)???, paramBackgroundFeedbackBinaryData.getId(), localArrayList);
    cuw.ifd.a(localBn);
  }
}