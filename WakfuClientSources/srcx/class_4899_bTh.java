import java.util.ArrayList;
import java.util.Collections;

class bTh
{
  private final ArrayList heH = new ArrayList();
  private int heI;
  private final ArrayList heJ = new ArrayList();
  private int heK;

  public void a(ZI paramZI, byte paramByte)
  {
    switch (paramByte) {
    case 0:
      this.heH.add(paramZI);
      this.heI = this.heH.size();
      break;
    case 1:
      this.heJ.add(paramZI);
      this.heK = this.heJ.size();
    }
  }

  public ZI dw(byte paramByte)
  {
    ZI localZI;
    switch (paramByte) {
    case 0:
      if (this.heH.size() == 0) {
        return null;
      }

      if (this.heI == this.heH.size()) {
        M(this.heH);
        this.heI = 0;
      }

      localZI = (ZI)this.heH.get(this.heI);
      this.heI += 1;
      return localZI;
    case 1:
      if (this.heJ.size() == 0) {
        return null;
      }

      if (this.heK == this.heJ.size()) {
        M(this.heJ);
        this.heK = 0;
      }

      localZI = (ZI)this.heJ.get(this.heK);
      this.heK += 1;
      return localZI;
    }

    return null;
  }

  private void M(ArrayList paramArrayList) {
    Collections.shuffle(paramArrayList, bCO.bLm());
  }
}