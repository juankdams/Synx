import com.ankamagames.wakfu.client.binaryStorage.SpellBinaryData;
import org.apache.log4j.Logger;

final class cTO
  implements bZs
{
  cTO(doH paramdoH, SpellBinaryData paramSpellBinaryData)
  {
  }

  public boolean a(String paramString, aDH paramaDH)
  {
    try
    {
      bZA localbZA = aVj.hn(paramString);
      this.kGi.a(localbZA, Be.b(paramaDH));
    } catch (Exception localException) {
      Be.i().error("Erreur lors de la compilation des critères d'apprentissage du sort " + this.kGj.getId(), localException);
    }
    return true;
  }
}