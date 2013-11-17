import com.ankamagames.wakfu.client.binaryStorage.SpellBinaryData;

public class bQD
  implements asq
{
  public String getName()
  {
    return bU.fH().getString("contentLoader.spell");
  }

  public void a(dnq paramdnq)
  {
    SpellBinaryData localSpellBinaryData = new SpellBinaryData();
    for (Zp localZp : aQC.bhe().bhh()) {
      a(localSpellBinaryData, localZp.nc());
    }
    a(localSpellBinaryData, SB.cty.uO());

    paramdnq.c(this);
  }

  private void a(SpellBinaryData paramSpellBinaryData, int paramInt) {
    cze.cwb().a(paramSpellBinaryData, "breed_id", paramInt, new acH(this));
  }
}