import com.ankamagames.wakfu.client.binaryStorage.MonsterTypeRelashionshipBinaryData;

class cpY
  implements gd
{
  cpY(dye paramdye, bRu parambRu)
  {
  }

  public void a(MonsterTypeRelashionshipBinaryData paramMonsterTypeRelashionshipBinaryData)
  {
    int i = paramMonsterTypeRelashionshipBinaryData.bzP();
    int j = paramMonsterTypeRelashionshipBinaryData.bzQ();

    ciJ localciJ1 = this.hZO.tP(i);
    localciJ1.vq(j);

    ciJ localciJ2 = this.hZO.tP(j);
    localciJ2.vq(i);
  }
}