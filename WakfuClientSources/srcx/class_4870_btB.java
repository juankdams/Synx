import java.util.Arrays;
import org.apache.log4j.Logger;

public class btB
{
  private static final Logger K = Logger.getLogger(btB.class);
  public static final short fGg = -1;
  public static final int gci = 0;
  public static final int gcj = (int)Math.ceil(40.5D);
  private final byte[] gck;
  private final int[] gcl;

  public btB()
  {
    this(new byte[gcj], null);
  }

  public btB(byte[] paramArrayOfByte, int[] paramArrayOfInt) {
    if ((!bB) && (paramArrayOfByte.length != gcj)) throw new AssertionError();
    this.gck = paramArrayOfByte;
    this.gcl = paramArrayOfInt;
  }

  public btB(btB parambtB) {
    this.gck = ((byte[])parambtB.gck.clone());
    this.gcl = (parambtB.gcl == null ? null : (int[])parambtB.gcl.clone());
  }

  public boolean a(byte paramByte1, byte paramByte2, short paramShort) {
    if ((!bB) && ((paramByte1 < 0) || (paramByte1 >= 18))) throw new AssertionError();
    if ((!bB) && ((paramByte2 < 0) || (paramByte2 >= 18))) throw new AssertionError();

    int i = paramByte1 + paramByte2 * 18;
    int j = 128 >> i % 8;
    boolean bool = (this.gck[(i / 8)] & j) != 0;
    if ((this.gcl == null) || (!bool)) {
      return bool;
    }
    int k = b(paramByte1, paramByte2, paramShort);
    if (this.gcl.length < 16) {
      return aUP.c(this.gcl, k);
    }

    return Arrays.binarySearch(this.gcl, k) >= 0;
  }

  public static int b(byte paramByte1, byte paramByte2, short paramShort) {
    return paramByte1 | paramByte2 << 8 | paramShort << 16;
  }

  public static void a(btB parambtB, dSw paramdSw) {
    if (parambtB == null) {
      paramdSw.writeShort((short)-1);
      return;
    }

    int i = parambtB.gcl == null ? 0 : parambtB.gcl.length;
    paramdSw.writeShort((short)i);

    paramdSw.writeBytes(parambtB.gck);
    if (i != 0)
      for (int j = 0; j < i; j++)
        paramdSw.writeInt(parambtB.gcl[j]);
  }

  public static btB r(aYQ paramaYQ)
  {
    int i = paramaYQ.readShort();
    if (i == -1) {
      return null;
    }
    byte[] arrayOfByte = paramaYQ.ot(gcj);
    int[] arrayOfInt;
    if (i == 0) {
      arrayOfInt = null;
    } else {
      arrayOfInt = new int[i];
      for (int j = 0; j < i; j++) {
        arrayOfInt[j] = paramaYQ.readInt();
      }
    }
    return new btB(arrayOfByte, arrayOfInt);
  }

  public boolean equals(Object paramObject) {
    return a((btB)paramObject);
  }

  public boolean a(btB parambtB) {
    return (Arrays.equals(this.gck, parambtB.gck)) && (Arrays.equals(this.gcl, parambtB.gcl));
  }
}