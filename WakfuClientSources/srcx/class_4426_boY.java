import com.ankamagames.wakfu.client.binaryStorage.NationRankBinaryData;
import org.apache.log4j.Logger;

class boY
  implements gd
{
  boY(aX paramaX)
  {
  }

  public void a(NationRankBinaryData paramNationRankBinaryData)
  {
    Yp localYp = Yp.cj(paramNationRankBinaryData.getId());
    if (localYp == null) {
      aX.ch().error("NationRank inconnu lors du chargement des binary storage : " + paramNationRankBinaryData.getId());
      return;
    }
    float f = paramNationRankBinaryData.IO();
    String str = paramNationRankBinaryData.uL();
    int i = paramNationRankBinaryData.IP();

    localYp.ab(f);
    localYp.hp(i);
  }
}