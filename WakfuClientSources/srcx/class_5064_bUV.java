import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class bUV
{
  protected static final Logger K = Logger.getLogger(bUV.class);

  private final LinkedList hhc = new LinkedList();
  private awu hhd;

  public void a(awu paramawu)
  {
    String str = paramawu.getText();
    boolean bool = paramawu.aIr();
    long l1 = paramawu.getDuration();

    if ((!bool) && (!WakfuClientInstance.awy().awB().a(bmz.fEP))) {
      return;
    }
    if ((this.hhd == null) || ((!this.hhd.aIr()) && (bool))) {
      this.hhd = paramawu;
      dLE.doY().t("petBubbleMessage", str);

      if (l1 != -1L) {
        long l2 = l1 > 0L ? l1 : aDe.gg(str) / 2;
        dka.cSF().a(new dqn(this, paramawu), l2, 1);
      }

      aEe localaEe = new aEe(bU.fH().getString("gelutin"), str);
      localaEe.setColor(cPU.kAz);
      localaEe.mm(4);
      CM.LV().a(localaEe);
    } else {
      this.hhc.addLast(paramawu);
    }
  }

  public void caW() {
    this.hhd = null;
    if (!this.hhc.isEmpty())
      a((awu)this.hhc.poll());
    else
      bCY.bLy().bLz();
  }

  public void clean()
  {
    this.hhd = null;
    this.hhc.clear();
    bCY.bLy().bLz();
  }
}