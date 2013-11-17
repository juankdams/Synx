import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public final class bJw
  implements Comparable
{
  private static final Logger K = Logger.getLogger(bJw.class);
  private final short gKy;
  private final int gKz;
  private final bcm gKA = new bcm();
  private final eu gKB;
  private final int dcO;
  private final int gKC;
  private final int gKD;
  private final ArrayList cub = new ArrayList();
  private final short aSh;
  private final int gKE;
  private final cSi gKF;
  private final cSi gKG;
  private final qE gKH;
  private final cSi gKI;
  private final cSi gKJ;

  public bJw(short paramShort1, int paramInt1, int[] paramArrayOfInt1, eu parameu, int paramInt2, int paramInt3, int paramInt4, short paramShort2, int paramInt5, int[] paramArrayOfInt2, int[] paramArrayOfInt3, qE paramqE)
  {
    this.gKy = paramShort1;
    this.gKz = paramInt1;
    this.dcO = paramInt2;
    this.gKC = paramInt3;
    this.gKD = paramInt4;
    this.aSh = paramShort2;
    this.gKE = paramInt5;

    for (int k : paramArrayOfInt1) {
      SB localSB = SB.gG(k);
      if (localSB != null)
        this.gKA.add(localSB);
      else {
        K.warn("Breed Id inconnue : " + k);
      }
    }
    this.gKB = parameu;

    this.gKF = new cSi();
    this.gKG = new cSi();
    D(paramArrayOfInt2);

    this.gKI = new cSi();
    this.gKJ = new cSi();
    E(paramArrayOfInt3);

    this.gKH = paramqE;
  }

  private void D(int[] paramArrayOfInt) {
    if (paramArrayOfInt.length % 2 != 0) {
      return;
    }
    int i = 0; for (int j = paramArrayOfInt.length / 2; i < j; i++) {
      this.gKG.add(paramArrayOfInt[(i * 2)]);
      this.gKF.add(paramArrayOfInt[(i * 2 + 1)]);
    }
  }

  private void E(int[] paramArrayOfInt) {
    if (paramArrayOfInt.length % 2 != 0) {
      return;
    }
    int i = 0; for (int j = paramArrayOfInt.length / 2; i < j; i++) {
      this.gKJ.add(paramArrayOfInt[(i * 2)]);
      this.gKI.add(paramArrayOfInt[(i * 2 + 1)]);
    }
  }

  public short bQz() {
    return this.gKy;
  }

  public int bQA() {
    return this.gKz;
  }

  public boolean b(bhh parambhh) {
    return (this.gKA.contains(SB.cty)) || (this.gKA.contains(parambhh));
  }

  public short nV() {
    return this.aSh;
  }

  public void a(dpI paramdpI) {
    this.cub.add(paramdpI);
  }

  public List qo() {
    return this.cub;
  }

  public int cE(short paramShort) {
    if ((paramShort < 0) || (paramShort > this.aSh)) {
      return -1;
    }
    if (paramShort == 0) {
      return 0;
    }
    return this.gKE + cF(paramShort);
  }

  private int cF(short paramShort) {
    if (this.gKF.isEmpty()) {
      return 0;
    }
    int i = 0;
    int j = 0; for (int k = this.gKG.size(); (j < k) && 
      (this.gKG.get(j) <= paramShort); j++)
    {
      i = this.gKF.get(j);
    }

    return i;
  }

  public int cG(short paramShort) {
    if ((paramShort < 0) || (paramShort > this.aSh)) {
      return -1;
    }
    int i = 0;
    int j = 0; for (int k = this.gKJ.size(); (j < k) && 
      (this.gKJ.get(j) <= paramShort); j++)
    {
      i = this.gKI.get(j);
    }

    return i;
  }

  public int bQB() {
    return this.gKC;
  }

  public int bQC() {
    return this.gKD;
  }

  public eu bQD() {
    return this.gKB;
  }

  public int atR() {
    return this.dcO;
  }

  public qE bQE() {
    return this.gKH;
  }

  public int b(bJw parambJw) {
    return this.gKz - parambJw.gKz;
  }

  public String toString() {
    return "ReferenceAptitude{m_referenceId=" + this.gKy + ", m_breed=" + this.gKA + '}';
  }
}