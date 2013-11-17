import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aSr extends Ig
{
  public static final qM by = new cpQ(new ec[] { new dhX("", new dou[] { new dDZ("iconName", Pq.chu), new dDZ("titleTranslationKey", Pq.chu), new dDZ("textTranslationKey", Pq.chu) }), new dhX("En précisant le type (tuto sinon)", new dou[] { new dDZ("iconName", Pq.chu), new dDZ("titleTranslationKey", Pq.chu), new dDZ("textTranslationKey", Pq.chu), new dDZ("type", Pq.chv) }) });
  private String hh;
  private String aGr;
  private String ePD;
  private int aGs;

  public aSr(int paramInt)
  {
    super(paramInt);
  }

  public void execute() {
    NN localNN = new NN(this.hh, this.aGr, this.ePD, this.aGs, getId());
    cjO.clE().j(localNN);
  }

  protected void j(ArrayList paramArrayList) {
    int i = paramArrayList.size();
    if (i != 3) {
      K.error("Nombre de paramètres invalide pour une action de type ClientEventActionLaunchTutorial id=" + getId() + " paramCount=" + i);
      return;
    }
    int j = 0;

    String str1 = ((cic)paramArrayList.get(j++)).getValue();
    String str2 = bU.fH().getString(((cic)paramArrayList.get(j++)).getValue());
    String str3 = ((cic)paramArrayList.get(j++)).getValue();
    int k;
    if (i == j)
      k = 0;
    else {
      try {
        k = (int)((aOw)paramArrayList.get(j)).b(null, null, null, null);
        j++;
      } catch (ClassCastException localClassCastException) {
        k = 0;
      }
    }

    String str4 = bU.fH().getString(str3);

    this.ePD = str1;
    this.hh = str2;
    this.aGr = str4;
    this.aGs = k;
  }

  public qM aF() {
    return by;
  }

  public String getTitle() {
    return this.hh;
  }
}