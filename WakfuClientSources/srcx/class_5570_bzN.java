import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bzN
{
  protected static Logger K = Logger.getLogger(bzN.class);
  private int goo;
  private aGa gop;
  private boolean bJa;
  private boolean goq;

  public bzN()
  {
    this.goo = 1;
    this.bJa = true;
    this.goq = false;
  }

  public void b(ccT paramccT) {
    aPy localaPy = new aPy(WakfuClientInstance.awy().aww());
    ArrayList localArrayList = localaPy.bgs();

    this.goq = d(paramccT);
    this.gop = a(localArrayList, paramccT);
    this.goo = e(paramccT);
    this.bJa = c(paramccT);
  }

  private boolean c(ccT paramccT)
  {
    return true;
  }

  private boolean d(ccT paramccT) {
    boolean bool = aNh.eth.a(dEX.lOj);
    if (!bool) {
      return false;
    }

    return true;
  }

  private aGa a(ArrayList paramArrayList, ccT paramccT)
  {
    return (aGa)paramArrayList.get(0);
  }

  private int e(ccT paramccT)
  {
    return 1;
  }

  public void bIt() {
    K.info("Graphical preferences :");
    K.info("\t* resolution : " + this.gop);
    K.info("\t* fullscreen : " + this.bJa);
    K.info("\t* level of details : " + this.goo);
    K.info("\t* shaders activated : " + this.goq);
  }
}