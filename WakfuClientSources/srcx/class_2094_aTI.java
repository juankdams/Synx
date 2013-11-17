import com.ankamagames.wakfu.client.binaryStorage.SkillBinaryData;
import org.apache.log4j.Logger;

public class aTI
  implements asq
{
  private static final Logger K = Logger.getLogger(aTI.class);

  public void a(dnq paramdnq) {
    cze.cwb().a(new SkillBinaryData(), new bhw(this));

    paramdnq.c(this);
  }

  public String getName() {
    return bU.fH().getString("contentLoader.skill");
  }

  public static Dk a(SkillBinaryData paramSkillBinaryData)
  {
    int i = paramSkillBinaryData.getId();
    int j = paramSkillBinaryData.getType();
    int[] arrayOfInt1 = paramSkillBinaryData.Xu();
    int[] arrayOfInt2 = paramSkillBinaryData.Ei();

    boolean bool = paramSkillBinaryData.Wk();
    int k = paramSkillBinaryData.uN();
    int m = paramSkillBinaryData.PY();

    bcR localbcR = bcR.oU(j);
    if (localbcR == null) {
      K.error("Impossible de créer un skill de type " + j + " : id de skill inconnu");
    }
    return new Dk(i, localbcR, arrayOfInt1, arrayOfInt2, m, bool, k);
  }
}