import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aom
{
  private static final Logger K = Logger.getLogger(aom.class);
  private static final aXL[] dsQ = new aXL[0];
  private final aoL bEs;
  private aXL[] dsR = dsQ;
  private short dsS = 32767;
  private short dsT = 32767;

  public aom(aoL paramaoL) {
    this.bEs = paramaoL;
  }

  public aXL[] g(short paramShort1, short paramShort2) {
    if ((this.dsS == paramShort1) && (this.dsT == paramShort2)) {
      return this.dsR;
    }

    int i = paramShort1 * 18;
    int j = paramShort2 * 18;
    dQx localdQx = new dQx(i, i + 18 - 1, j, j + 18 - 1);

    ArrayList localArrayList = new ArrayList();
    this.bEs.s(new dqr(this, localdQx, localArrayList));

    aXL[] arrayOfaXL = localArrayList.isEmpty() ? dsQ : (aXL[])localArrayList.toArray(new aXL[localArrayList.size()]);
    this.dsS = paramShort1;
    this.dsT = paramShort2;
    this.dsR = arrayOfaXL;
    return arrayOfaXL;
  }

  public void aAB() {
    this.dsR = dsQ;
    this.dsS = 32767;
    this.dsT = 32767;
  }
}