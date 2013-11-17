import com.ankamagames.wakfu.client.binaryStorage.MonsterTypeRelashionshipBinaryData;

public final class dye
  implements asq
{
  public void a(dnq paramdnq)
  {
    bRu localbRu = bRu.bYI();

    cze.cwb().a(new MonsterTypeRelashionshipBinaryData(), new cpY(this, localbRu));

    paramdnq.c(this);
  }

  public String getName() {
    return bU.fH().getString("contentLoader.monsterFamilyRelationShip");
  }
}