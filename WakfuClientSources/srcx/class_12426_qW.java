import com.ankamagames.wakfu.client.binaryStorage.InteractiveElementModelBinaryData;
import org.apache.log4j.Logger;

public final class qW
  implements asq
{
  private bIW aYG;
  private static final Logger K = Logger.getLogger(qW.class);

  public String getName() {
    return bU.fH().getString("contentLoader.interactiveElement");
  }

  public void a(dnq paramdnq) {
    this.aYG = new bIW();
    this.aYG.a(tR.values());
    this.aYG.a(cCy.values());
    try
    {
      cze.cwb().a(new InteractiveElementModelBinaryData(), new aJm(this));
    }
    catch (Exception localException)
    {
      K.error("Erreur lors de la lecture du fichier de vues d'éléments interactifs", localException);
    }

    acs.aoN().a(this.aYG);
    this.aYG = null;

    paramdnq.c(this);
  }
}