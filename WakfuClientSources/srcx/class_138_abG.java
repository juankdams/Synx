import com.ankamagames.wakfu.client.binaryStorage.MonsterTypeBinaryData;

class abG
  implements gd
{
  abG(Cl paramCl)
  {
  }

  public void a(MonsterTypeBinaryData paramMonsterTypeBinaryData)
  {
    int i = paramMonsterTypeBinaryData.getId();
    int j = paramMonsterTypeBinaryData.yS();
    byte b = paramMonsterTypeBinaryData.getType();

    ciJ localciJ = new ciJ(i, j, cZR.eO(b));
    bRu.bYI().a(localciJ);
  }
}