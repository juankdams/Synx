import com.ankamagames.wakfu.client.binaryStorage.InteractiveElementTemplateBinaryData;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class jr
  implements asq
{
  private static final Logger K = Logger.getLogger(jr.class);

  private static final jr aLe = new jr();

  private boolean aLf = false;

  public static jr rh()
  {
    return aLe;
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.interactiveElementTemplates");
  }

  public void a(dnq paramdnq) {
    try {
      bDg localbDg = new bDg();

      cze.cwb().a(new InteractiveElementTemplateBinaryData(), new bsE(this, localbDg));

      acs.aoN().a(localbDg);
    } catch (Exception localException) {
      K.error("Erreur lors de la lecture du fichier de vues d'éléments interactifs", localException);
    }
    paramdnq.c(this);
  }

  private byte[] a(InteractiveElementTemplateBinaryData paramInteractiveElementTemplateBinaryData) {
    ArrayList localArrayList = new ArrayList();
    for (Object localObject2 : paramInteractiveElementTemplateBinaryData.cqb()) {
      localArrayList.add(new cYk(localObject2.getX(), localObject2.getY(), localObject2.IB()));
    }

    ??? = new deM(paramInteractiveElementTemplateBinaryData.D(), paramInteractiveElementTemplateBinaryData.getX(), paramInteractiveElementTemplateBinaryData.getY(), paramInteractiveElementTemplateBinaryData.IB(), paramInteractiveElementTemplateBinaryData.cpW(), paramInteractiveElementTemplateBinaryData.cpX(), paramInteractiveElementTemplateBinaryData.cpY(), paramInteractiveElementTemplateBinaryData.aeH(), paramInteractiveElementTemplateBinaryData.cpZ(), paramInteractiveElementTemplateBinaryData.FW(), paramInteractiveElementTemplateBinaryData.boz(), localArrayList, paramInteractiveElementTemplateBinaryData.cqa(), paramInteractiveElementTemplateBinaryData.cqc(), paramInteractiveElementTemplateBinaryData.Bz(), paramInteractiveElementTemplateBinaryData.apa());

    return ((deM)???).j();
  }
}