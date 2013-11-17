import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ajp
  implements Iterator
{
  private aIo diF;
  private aIo diG;
  private cSi diH = new cSi();
  private int brR = -1;

  public ajp(aIo paramaIo) {
    this.diF = paramaIo;
    this.diG = null;
  }

  public boolean hasNext() {
    return this.diF != null;
  }

  public aIo awh() {
    aIo localaIo = this.diF;
    this.diF = null;
    if ((localaIo.hasChildren()) && (localaIo.axS())) {
      this.brR += 1;
      this.diG = localaIo;
      this.diH.add(0);
      this.diF = ((aIo)localaIo.getChildren().get(0));
    } else if (this.diG != null) {
      while (this.diG != null) {
        ArrayList localArrayList = this.diG.getChildren();
        int i = this.diH.get(this.brR) + 1;
        if (i == localArrayList.size())
        {
          this.diG = this.diG.aUq();
          this.diH.wH(this.brR);
          this.brR -= 1;
        } else {
          this.diF = ((aIo)localArrayList.get(i));
          this.diH.set(this.brR, i);
          break;
        }
      }
    }
    return localaIo;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }

  public static void main(String[] paramArrayOfString) {
    aZG localaZG1 = new aZG("n1");

    aZG localaZG2 = new aZG("n1A");
    localaZG2.a(new aZG("n1Aa"));
    localaZG2.a(new aZG("n1Ab"));
    localaZG2.cq(true);

    localaZG1.a(localaZG2);

    aZG localaZG3 = new aZG("n1B");
    aZG localaZG4 = new aZG("n1Ba");
    aZG localaZG5 = new aZG("n1Bb");
    localaZG3.a(localaZG4);
    localaZG3.a(localaZG5);
    localaZG3.cq(true);

    localaZG1.a(localaZG3);

    aZG localaZG6 = new aZG("n1C");

    localaZG1.a(localaZG6);
    localaZG1.cq(true);

    ajp localajp = new ajp(localaZG1);
    while (localajp.hasNext()) {
      aIo localaIo = localajp.awh();
      for (int i = 0; i < localaIo.getDepth(); i++) {
        System.out.print("\t");
      }
      System.out.println((String)localaIo.getValue());
    }
  }
}