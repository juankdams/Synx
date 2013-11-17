import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class cuB
  implements Iterable
{
  public static final cuB ifk = new cuB();
  public static final int ifl = 0;
  public static final int ifm = 1;
  public static final int ifn = 2;
  private static final Logger K = Logger.getLogger(cuB.class);
  private final boolean ifo;
  private final int[][] ifp;
  private static final cEi ifq = new cEi();
  private static final cEi ifr = new cEi();

  private static final cEi ifs = new cEi();
  private static final cEi ift = new cEi();

  private static final cEi ifu = new cEi();

  private cuB()
  {
    this.ifo = false;
    this.ifp = ((int[][])null);
  }

  public cuB(int paramInt)
  {
    this.ifp = new int[paramInt][3];
    this.ifo = true;
  }

  public cuB(int[][] paramArrayOfInt)
  {
    this.ifp = paramArrayOfInt;
    this.ifo = true;
  }

  public cuB(int[] paramArrayOfInt, List paramList)
  {
    this.ifp = new int[1 + paramList.size()][3];
    this.ifp[0][0] = paramArrayOfInt[0];
    this.ifp[0][1] = paramArrayOfInt[1];
    this.ifp[0][2] = paramArrayOfInt[2];
    int i = 0; for (int j = paramList.size(); i < j; i++) {
      int[] arrayOfInt = (int[])paramList.get(i);
      if ((!bB) && (arrayOfInt.length != 3)) throw new AssertionError("Cellule de longueur invalide : " + arrayOfInt.length);
      this.ifp[(i + 1)][0] = arrayOfInt[0];
      this.ifp[(i + 1)][1] = arrayOfInt[1];
      this.ifp[(i + 1)][2] = arrayOfInt[2];
    }
    this.ifo = true;
  }

  public cuB(List paramList)
  {
    this.ifp = new int[paramList.size()][3];
    int i = 0; for (int j = paramList.size(); i < j; i++) {
      int[] arrayOfInt = (int[])paramList.get(i);
      if ((!bB) && (arrayOfInt.length != 3)) throw new AssertionError("Cellule de longueur invalide : " + arrayOfInt.length);
      this.ifp[i][0] = arrayOfInt[0];
      this.ifp[i][1] = arrayOfInt[1];
      this.ifp[i][2] = arrayOfInt[2];
    }
    this.ifo = true;
  }

  public cuB(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    if ((localByteBuffer.remaining() > 0) && (localByteBuffer.remaining() < 65536)) {
      this.ifp = new int[localByteBuffer.remaining() / 10][3];
      int i = 0;
      while (localByteBuffer.remaining() >= 10) {
        this.ifp[i][0] = localByteBuffer.getInt();
        this.ifp[i][1] = localByteBuffer.getInt();
        this.ifp[i][2] = localByteBuffer.getShort();
        i++;
      }
      this.ifo = true;
    } else {
      this.ifp = ((int[][])null);
      this.ifo = false;
      K.error("PathFindResult sérialisé de longueur louche : " + paramArrayOfByte.length + " @ " + bBd.bJO());
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, short paramShort) {
    this.ifp[paramInt1][0] = paramInt2;
    this.ifp[paramInt1][1] = paramInt3;
    this.ifp[paramInt1][2] = paramShort;
  }

  public void i(int paramInt, int[] paramArrayOfInt) {
    this.ifp[paramInt] = paramArrayOfInt;
  }

  public int csW()
  {
    if ((!this.ifo) || (this.ifp == null))
      return 0;
    return this.ifp.length;
  }

  public boolean csX() {
    return this.ifo;
  }

  public int[] wR(int paramInt)
  {
    if ((!bB) && ((paramInt < 0) || (paramInt >= this.ifp.length))) throw new AssertionError("Trying to get a path step not within the bounds length = " + this.ifp.length + " stepIndex = " + paramInt);
    if (paramInt < this.ifp.length)
      return this.ifp[paramInt];
    return null;
  }

  public int[] csY()
  {
    if ((this.ifp != null) && (this.ifp.length != 0)) {
      return this.ifp[0];
    }
    return null;
  }

  public int[] csZ()
  {
    if ((this.ifp != null) && (this.ifp.length != 0)) {
      return this.ifp[(this.ifp.length - 1)];
    }
    return null;
  }

  public CG wS(int paramInt)
  {
    if ((!this.ifo) || (paramInt < 0) || (paramInt >= csW())) {
      return null;
    }
    int i = this.ifp[paramInt][0] - this.ifp[(paramInt - 1)][0];
    int j = this.ifp[paramInt][1] - this.ifp[(paramInt - 1)][1];
    return CG.T(i, j);
  }

  public Iterator iterator()
  {
    if (this.ifp == null)
      return new btA();
    return new tK(this.ifp, true);
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("{ ");
    if (this.ifo)
      for (int[] arrayOfInt1 : this.ifp)
        localStringBuffer.append('[').append(arrayOfInt1[0]).append(';').append(arrayOfInt1[1]).append(';').append(arrayOfInt1[2]).append("] ");
    else {
      localStringBuffer.append("not found");
    }
    return '}';
  }

  public ArrayList q(long paramLong, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();

    if (this.ifp.length < 2) {
      return null;
    }

    ifq.j(this.ifp[0]);
    ifr.j(this.ifp[1]);
    ifr.m(ifq);

    long l = 0L;
    int i = 1;

    bmM localbmM1 = new bmM();
    bmM localbmM2 = null;

    localbmM1.a(ifq);
    localbmM1.cm(l);
    do
    {
      ifs.j(this.ifp[i]);
      ift.k(ifs);
      ift.m(ifq);

      if ((ift.getX() != ifr.getX()) || (ift.getY() != ifr.getY()) || ((paramBoolean) && (ift.aCv() != ifr.aCv())))
      {
        localbmM1.c(ifq);

        l += ()localbmM1.akl().o(localbmM1.akj()).czR() * paramLong;
        localbmM1.co(l);

        ifu.k(localbmM1.akl());
        ifu.m(localbmM1.akj());

        localbmM1.b(ifu);

        if (localbmM2 != null) {
          localbmM2.d(ifr);
        }

        localArrayList.add(localbmM1);

        ifr.k(ift);

        localbmM2 = localbmM1;
        localbmM1 = new bmM();
        localbmM1.a(ifq);
        localbmM1.cm(l);
      }

      ifq.k(ifs);

      i++;
    }while (i < this.ifp.length);

    localbmM1.c(ifq);

    l += ()localbmM1.akl().o(localbmM1.akj()).czR() * paramLong;

    localbmM1.co(l);

    localbmM1.b(localbmM1.akl().o(localbmM1.akj()));
    localArrayList.add(localbmM1);

    return localArrayList;
  }

  public boolean Q(int[] paramArrayOfInt)
  {
    if (!csX()) {
      return false;
    }
    for (int[] arrayOfInt : this) {
      if ((arrayOfInt[0] == paramArrayOfInt[0]) && (arrayOfInt[1] == paramArrayOfInt[1]) && (arrayOfInt[2] == paramArrayOfInt[2])) {
        return true;
      }
    }
    return false;
  }

  public cuB dM(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= paramInt2) || (paramInt2 > csW())) {
      throw new IllegalArgumentException("0 <= startIndex < endIndex <= getPathLength() non-respecté");
    }
    cuB localcuB = new cuB(paramInt2 - paramInt1);
    for (int i = paramInt1; i < paramInt2; i++) {
      localcuB.i(i - paramInt1, wR(i));
    }
    return localcuB;
  }

  public static Cs a(int[] paramArrayOfInt, cuB paramcuB1, cuB paramcuB2)
  {
    int[] arrayOfInt1 = paramcuB2.csY();

    if (arrayOfInt1 == null) {
      K.error("Le point de départ du 2e chemin est null lors d'une fusion de chemin: firstPath=" + paramcuB1 + ", secondPath=" + paramcuB2);
      return null;
    }

    int i = -1;
    int j = -1;
    for (int k = 0; k < paramcuB1.csW(); k++) {
      int[] arrayOfInt2 = paramcuB1.wR(k);
      if ((arrayOfInt2[0] == paramArrayOfInt[0]) && (arrayOfInt2[1] == paramArrayOfInt[1]) && (arrayOfInt2[2] == paramArrayOfInt[2]) && 
        (i == -1))
      {
        i = k;
        if (j != -1)
        {
          break;
        }
      }
      else if ((arrayOfInt2[0] == arrayOfInt1[0]) && (arrayOfInt2[1] == arrayOfInt1[1]) && (arrayOfInt2[2] == arrayOfInt1[2]) && 
        (j == -1))
      {
        j = k;
        if (i != -1)
        {
          break;
        }
      }
    }
    if (i == -1) {
      K.error("La position de départ " + paramArrayOfInt[0] + ':' + paramArrayOfInt[1] + ':' + paramArrayOfInt[2] + " n'a pas été trouvée sur le premier chemin. (path: " + paramcuB1 + ')');

      return null;
    }
    if (j == -1) {
      K.error("Le point de jonction " + arrayOfInt1[0] + ':' + arrayOfInt1[1] + ':' + arrayOfInt1[2] + " n'a pas été trouvé sur le premier chemin. (path: " + paramcuB1 + ')');

      return null;
    }

    k = 0;
    int m = 0;
    cuB localcuB;
    if (i <= j) {
      localcuB = new cuB(j - i + paramcuB2.csW());

      for (n = i; n < j; n++)
        localcuB.i(k++, paramcuB1.wR(n));
    }
    else {
      localcuB = new cuB(i - j + paramcuB2.csW());

      for (n = i; n > j; n--) {
        localcuB.i(k++, paramcuB1.wR(n));
      }
      m = i - j;
    }
    for (int n = 0; n < paramcuB2.csW(); n++) {
      localcuB.i(k++, paramcuB2.wR(n));
    }

    return new Cs(localcuB, Integer.valueOf(m));
  }

  public byte[] j()
  {
    int i = csW();
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i * 10);
    for (int j = 0; j < i; j++) {
      int[] arrayOfInt = wR(j);
      localByteBuffer.putInt(arrayOfInt[0]);
      localByteBuffer.putInt(arrayOfInt[1]);
      localByteBuffer.putShort((short)arrayOfInt[2]);
    }
    return localByteBuffer.array();
  }

  public List cta()
  {
    return Arrays.asList(this.ifp);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof cuB))) {
      return false;
    }
    cuB localcuB = (cuB)paramObject;
    if ((localcuB.ifo != this.ifo) || (localcuB.ifp.length != this.ifp.length)) {
      return false;
    }
    int i = 0; for (int j = this.ifp.length; i < j; i++) {
      int[] arrayOfInt1 = this.ifp[i];
      int[] arrayOfInt2 = localcuB.ifp[i];
      if ((arrayOfInt1.length != arrayOfInt2.length) || (arrayOfInt1[0] != arrayOfInt2[0]) || (arrayOfInt1[1] != arrayOfInt2[1]) || (arrayOfInt1[2] != arrayOfInt2[2])) {
        return false;
      }
    }
    return true;
  }
}