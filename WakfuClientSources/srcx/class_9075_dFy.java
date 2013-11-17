import com.ankamagames.wakfu.client.binaryStorage.MonsterTypePestBinaryData;
import org.apache.log4j.Logger;

class dFy
  implements gd
{
  dFy(kG paramkG)
  {
  }

  public void a(MonsterTypePestBinaryData paramMonsterTypePestBinaryData)
  {
    int i = paramMonsterTypePestBinaryData.nn();
    int j = paramMonsterTypePestBinaryData.GC();

    ciJ localciJ = bRu.bYI().tP(i);
    if (localciJ == null) {
      kG.ch().error("On ajoute un nuisible à une famille de monstre inconnue : familyId=" + i);
      return;
    }

    localciJ.vr(j);
  }
}