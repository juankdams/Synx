import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement.ObjectFactory;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.log4j.Logger;

public class gn
{
  private static final Logger K = Logger.getLogger(gn.class);
  public static final int aDZ = 1024;
  public static final int aEa = 576;
  private static final cbQ aEb = new cbQ(2048);
  private static final ArrayList aEc = new ArrayList();
  final ArrayList aDd;
  final short aEd;
  final short aEe;
  int aEf;
  int aEg;
  int aEh;
  int aEi;
  private int aEj = 2147483647;
  private int aEk = 2147483647;
  private short aEl = 32767;

  private int aEm = -2147483648;
  private int aEn = -2147483648;
  private short aEo = -32768;

  public gn()
  {
    this(0, 0);
  }

  public gn(int paramInt1, int paramInt2) {
    this.aDd = new ArrayList(1024);
    this.aEf = 2147483647;
    this.aEh = -2147483648;
    this.aEg = 2147483647;
    this.aEi = -2147483648;

    if ((!bB) && ((paramInt1 <= -32768) || (paramInt1 >= 32767))) throw new AssertionError();
    if ((!bB) && ((paramInt2 <= -32768) || (paramInt2 >= 32767))) throw new AssertionError();
    this.aEd = ((short)paramInt1);
    this.aEe = ((short)paramInt2);
  }

  public final void clear()
  {
    int i = this.aDd.size();
    for (int j = 0; j < i; j++) {
      ScreenElement localScreenElement = (ScreenElement)this.aDd.get(j);
      localScreenElement.axl();
    }
    this.aDd.clear();
  }

  public final int f(byte paramByte) {
    int i = 0;
    int j = 0; for (int k = this.aDd.size(); j < k; j++) {
      ScreenElement localScreenElement = (ScreenElement)this.aDd.get(j);
      byte b = localScreenElement.ddL().bBm();
      if ((b & paramByte) == b) {
        i++;
      }
    }

    return i;
  }

  public final ArrayList nw() {
    return this.aDd;
  }

  public final short nx() {
    return this.aEd;
  }

  public final short ny() {
    return this.aEe;
  }

  public boolean load(String paramString) {
    String str = Q(paramString);
    aYQ localaYQ = aYQ.V(dtb.readFile(str));

    this.aEj = localaYQ.readInt();
    this.aEk = localaYQ.readInt();
    this.aEl = localaYQ.readShort();

    this.aEm = localaYQ.readInt();
    this.aEn = localaYQ.readInt();
    this.aEo = localaYQ.readShort();

    int i = localaYQ.readShort() & 0xFFFF;
    int[] arrayOfInt1 = new int[i];
    byte[] arrayOfByte = new byte[i];
    int[] arrayOfInt2 = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt1[j] = localaYQ.readInt();
      arrayOfByte[j] = localaYQ.readByte();
      arrayOfInt2[j] = localaYQ.readInt();
    }

    float[][] arrayOfFloat = e(localaYQ);

    boolean bool = true;

    int k = localaYQ.readInt();
    int m = localaYQ.readInt();

    int n = localaYQ.readShort() & 0xFFFF;
    for (int i1 = 0; i1 < n; i1++) {
      int i2 = k + (localaYQ.readByte() & 0xFF);
      int i3 = k + (localaYQ.readByte() & 0xFF);
      int i4 = m + (localaYQ.readByte() & 0xFF);
      int i5 = m + (localaYQ.readByte() & 0xFF);

      for (int i6 = i2; i6 < i3; i6++) {
        for (int i7 = i4; i7 < i5; i7++) {
          int i8 = localaYQ.readByte() & 0xFF;
          for (int i9 = 0; i9 < i8; i9++) {
            ScreenElement localScreenElement = (ScreenElement)ScreenElement.lHn.bQy();
            localScreenElement.lHo = i6;
            localScreenElement.lHp = i7;
            bool &= localScreenElement.F(localaYQ);

            int i10 = localaYQ.readShort() & 0xFFFF;
            localScreenElement.bMK = arrayOfInt1[i10];
            localScreenElement.fiz = ((short)arrayOfByte[i10]);
            localScreenElement.aVh = arrayOfInt2[i10];

            int i11 = localaYQ.readShort() & 0xFFFF;
            localScreenElement.dMd = arrayOfFloat[i11];

            cid localcid = localScreenElement.lHq;
            if (localcid != null)
            {
              localScreenElement.ddS();
              localScreenElement.ddR();

              this.aDd.add(localScreenElement);
            }
          }
        }
      }
    }
    localaYQ.close();

    nz();
    return bool;
  }

  private float[][] e(aYQ paramaYQ) {
    int i = paramaYQ.readShort() & 0xFFFF;
    float[][] arrayOfFloat = new float[i][];
    for (int j = 0; j < i; j++) {
      int k = paramaYQ.readByte();
      arrayOfFloat[j] = ScreenElement.Ch(k);
      ScreenElement.a(arrayOfFloat[j], k, paramaYQ);
    }
    return arrayOfFloat;
  }

  public final void nz() {
    d(this.aDd);
    nA();
  }

  private void nA() {
    int i = 0; for (int j = this.aDd.size(); i < j; i++) {
      ScreenElement localScreenElement = (ScreenElement)this.aDd.get(i);

      if (localScreenElement.dKx < this.aEf) {
        this.aEf = localScreenElement.dKx;
      }

      int k = localScreenElement.lHq.cjF();
      if (localScreenElement.dKx + k > this.aEh) {
        this.aEh = (localScreenElement.dKx + k);
      }

      if (localScreenElement.dKv > this.aEi) {
        this.aEi = localScreenElement.dKv;
      }

      int m = localScreenElement.lHq.cjG();
      if (localScreenElement.dKv - m < this.aEg)
        this.aEg = (localScreenElement.dKv - m);
    }
  }

  private static void d(ArrayList paramArrayList)
  {
    aEb.reset();

    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      ScreenElement localScreenElement = (ScreenElement)paramArrayList.get(j);
      aEb.add((localScreenElement.lGL << 14) + j);
    }
    aEb.sort();

    aEc.clear();
    aEc.ensureCapacity(i);
    j = 0;
    for (int k = 0; k < i; k++) {
      long l = aEb.uD(k);
      int m = (int)(l & 0x3FFF);
      if (l < 0L) {
        aEc.add(paramArrayList.get(m));
      } else {
        aEc.add(j, paramArrayList.get(m));
        j++;
      }
    }
    paramArrayList.clear();
    paramArrayList.addAll(aEc);
  }

  public final String toString()
  {
    return "ScreenMap {" + this.aEd + ", " + this.aEe + "}";
  }

  int a(String paramString, int[] paramArrayOfInt)
  {
    String str = Q(paramString);
    dSw localdSw = new dSw();

    nB();

    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    int i = this.aDd.size();
    for (int j = 0; j < i; j++) {
      ScreenElement localScreenElement1 = (ScreenElement)this.aDd.get(j);

      localHashSet1.add(new csb(localScreenElement1));
      localHashSet2.add(new dsR(localScreenElement1));
    }

    localdSw.writeInt(this.aEj);
    localdSw.writeInt(this.aEk);
    localdSw.writeShort(this.aEl);

    localdSw.writeInt(this.aEm);
    localdSw.writeInt(this.aEn);
    localdSw.writeShort(this.aEo);

    j = 2147483647;
    int k = 2147483647;
    int m = -2147483648;
    int n = -2147483648;

    cSR localcSR = new cSR(512);
    for (int i1 = 0; i1 < i; i1++) {
      ScreenElement localScreenElement2 = (ScreenElement)this.aDd.get(i1);

      i3 = localScreenElement2.lHo;
      i4 = localScreenElement2.lHp;

      if (i3 < j) {
        j = i3;
      }
      if (i3 > m) {
        m = i3;
      }
      if (i4 < k) {
        k = i4;
      }
      if (i4 > n) {
        n = i4;
      }

      int i5 = bCO.cN(i3, i4);
      Cu.a(localcSR, i5, localScreenElement2);
    }

    ArrayList localArrayList1 = new ArrayList(localHashSet1);
    localdSw.writeShort((short)localArrayList1.size());
    for (int i2 = 0; i2 < localArrayList1.size(); i2++) {
      ((csb)localArrayList1.get(i2)).a(localdSw);
    }
    paramArrayOfInt[1] = localArrayList1.size();

    ArrayList localArrayList2 = new ArrayList(localHashSet2);
    localdSw.writeShort((short)localArrayList2.size());
    for (int i3 = 0; i3 < localArrayList2.size(); i3++) {
      ((dsR)localArrayList2.get(i3)).a(localdSw);
    }
    paramArrayOfInt[2] = localArrayList2.size();

    if ((!bB) && (m - j > 255)) throw new AssertionError();
    if ((!bB) && (n - k > 255)) throw new AssertionError();

    localdSw.writeInt(j);
    localdSw.writeInt(k);

    i3 = m - j + 1;
    int i4 = n - k + 1;
    ArrayList localArrayList3 = new ArrayList(i3 * i4);
    byte[] arrayOfByte = new byte[i4 * i3];

    dmn localdmn = localcSR.yF();
    int i8;
    int i9;
    int i10;
    while (localdmn.hasNext()) {
      localdmn.fl();
      ArrayList localArrayList4 = (ArrayList)localdmn.value();
      i7 = localArrayList4.size();
      i8 = localdmn.zY();
      i9 = bCO.sg(i8);
      i10 = bCO.sh(i8);

      arrayOfByte[((i10 - k) * i3 + (i9 - j))] = ((byte)i7);
    }
    int i11;
    int i12;
    for (int i6 = 0; i6 < i4; i6++) {
      for (i7 = 0; i7 < i3; i7++) {
        if (arrayOfByte[(i6 * i3 + i7)] != 0)
        {
          i8 = 1;
          i9 = 1;

          for (i10 = i6 + 1; (i10 < i4) && 
            (arrayOfByte[(i10 * i3 + i7)] != 0); i10++)
          {
            i9++;
          }

          for (i10 = i7 + 1; i10 < i3; i10++) {
            i11 = 1;
            for (i12 = i6; i12 < i6 + i9; i12++) {
              if (arrayOfByte[(i12 * i3 + i10)] == 0) {
                i11 = 0;
                break;
              }
            }
            if (i11 == 0) break;
            i8++;
          }

          for (i10 = i6; i10 < i6 + i9; i10++) {
            for (i11 = i7; i11 < i7 + i8; i11++) {
              arrayOfByte[(i10 * i3 + i11)] = 0;
            }

          }

          localArrayList3.add(new dQx(i7, i7 + i8, i6, i6 + i9));
        }
      }
    }
    i6 = localArrayList3.size();
    localdSw.writeShort((short)i6);

    for (int i7 = 0; i7 < i6; i7++) {
      localObject = (dQx)localArrayList3.get(i7);
      localdSw.writeByte((byte)((dQx)localObject).hqu);
      localdSw.writeByte((byte)((dQx)localObject).hqv);
      localdSw.writeByte((byte)((dQx)localObject).hqw);
      localdSw.writeByte((byte)((dQx)localObject).hqx);
      for (i9 = ((dQx)localObject).hqu; i9 < ((dQx)localObject).hqv; i9++) {
        for (i10 = ((dQx)localObject).hqw; i10 < ((dQx)localObject).hqx; i10++) {
          i11 = i9 + j;
          i12 = i10 + k;
          int i13 = bCO.cN(i11, i12);
          ArrayList localArrayList5 = (ArrayList)localcSR.get(i13);
          int i14 = localArrayList5.size();
          localdSw.writeByte((byte)i14);
          for (int i15 = 0; i15 < i14; i15++) {
            ScreenElement localScreenElement3 = (ScreenElement)localArrayList5.get(i15);
            localScreenElement3.b(localdSw);

            int i16 = localArrayList1.indexOf(new csb(localScreenElement3));
            if ((i16 == -1) || (i16 > 32767)) {
              throw new cJ("pas d'indexage de groupe");
            }
            localdSw.writeShort((short)i16);

            int i17 = localArrayList2.indexOf(new dsR(localScreenElement3));
            if ((i17 == -1) || (i17 > 32767)) {
              throw new cJ("pas d'indexage de couleur");
            }
            localdSw.writeShort((short)i17);
          }
        }
      }
    }

    FileOutputStream localFileOutputStream = dtb.qd(str);
    Object localObject = localdSw.getData();
    localFileOutputStream.write((byte[])localObject);
    localdSw.close();
    localFileOutputStream.close();
    return localObject.length;
  }

  public void nB() {
    int i = this.aDd.size();
    for (int j = 0; j < i; j++) {
      ScreenElement localScreenElement = (ScreenElement)this.aDd.get(j);
      if (localScreenElement.lHo < this.aEj) {
        this.aEj = localScreenElement.lHo;
      }
      if (localScreenElement.lHo > this.aEm) {
        this.aEm = localScreenElement.lHo;
      }

      if (localScreenElement.lHp < this.aEk) {
        this.aEk = localScreenElement.lHp;
      }
      if (localScreenElement.lHp > this.aEn) {
        this.aEn = localScreenElement.lHp;
      }

      if (localScreenElement.fdo < this.aEl) {
        this.aEl = localScreenElement.fdo;
      }
      if (localScreenElement.fdo > this.aEo)
        this.aEo = localScreenElement.fdo;
    }
  }

  void b(ScreenElement paramScreenElement)
  {
    this.aDd.add(paramScreenElement);
  }

  boolean p(int paramInt1, int paramInt2) {
    return (paramInt1 >= this.aEj) && (paramInt1 <= this.aEm) && (paramInt2 >= this.aEk) && (paramInt2 <= this.aEn);
  }

  boolean e(int paramInt1, int paramInt2, short paramShort)
  {
    return (paramInt1 >= this.aEj) && (paramInt1 <= this.aEm) && (paramInt2 >= this.aEk) && (paramInt2 <= this.aEn) && (paramShort >= this.aEl) && (paramShort <= this.aEo);
  }

  private String Q(String paramString)
  {
    return paramString + this.aEd + "_" + this.aEe;
  }
}