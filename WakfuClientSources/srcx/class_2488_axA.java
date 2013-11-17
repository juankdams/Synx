import com.sun.jna.Native;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class axA
{
  public static final int SIZE;
  public static final axA dMG = null;
  public long dMH;
  static Class bRq;
  static Class cvF;
  static Class cvG;
  static Class cvH;
  static Class cvI;
  static Class cvJ;
  static Class cvK;
  static Class cvL;
  static Class cvM;
  static Class cvN;
  static Class bZT;
  static Class bRr;
  static Class bRs;
  static Class cvB;
  static Class cvT;
  static Class bZS;

  public static final axA jdMethod_do(long paramLong)
  {
    return new bUJ(paramLong, null);
  }

  public static final axA kU(int paramInt)
  {
    return new bUJ(paramInt & 0xFFFFFFFF, null);
  }

  axA()
  {
  }

  public axA(long paramLong)
  {
    this.dMH = paramLong;
  }

  public axA dp(long paramLong)
  {
    return p(paramLong, 0L);
  }

  public axA p(long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L) return this;
    return new axA(this.dMH + paramLong1);
  }

  public void dq(long paramLong)
  {
    setMemory(0L, paramLong, (byte)0);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this) return true;
    if (paramObject == null) return false;
    return ((paramObject instanceof axA)) && (((axA)paramObject).dMH == this.dMH);
  }

  public int hashCode()
  {
    return (int)((this.dMH >>> 32) + (this.dMH & 0xFFFFFFFF));
  }

  public long indexOf(long paramLong, byte paramByte)
  {
    return Native.indexOf(this.dMH + paramLong, paramByte);
  }

  public void read(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Native.read(this.dMH + paramLong, paramArrayOfByte, paramInt1, paramInt2);
  }

  public void read(long paramLong, short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    Native.read(this.dMH + paramLong, paramArrayOfShort, paramInt1, paramInt2);
  }

  public void read(long paramLong, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    Native.read(this.dMH + paramLong, paramArrayOfChar, paramInt1, paramInt2);
  }

  public void read(long paramLong, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    Native.read(this.dMH + paramLong, paramArrayOfInt, paramInt1, paramInt2);
  }

  public void read(long paramLong, long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    Native.read(this.dMH + paramLong, paramArrayOfLong, paramInt1, paramInt2);
  }

  public void read(long paramLong, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    Native.read(this.dMH + paramLong, paramArrayOfFloat, paramInt1, paramInt2);
  }

  public void read(long paramLong, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    Native.read(this.dMH + paramLong, paramArrayOfDouble, paramInt1, paramInt2);
  }

  public void a(long paramLong, axA[] paramArrayOfaxA, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i++) {
      axA localaxA1 = bX(paramLong + i * SIZE);
      axA localaxA2 = paramArrayOfaxA[(i + paramInt1)];

      if ((localaxA2 == null) || (localaxA1 == null) || (localaxA1.dMH != localaxA2.dMH))
        paramArrayOfaxA[(i + paramInt1)] = localaxA1;
    }
  }

  public void write(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Native.write(this.dMH + paramLong, paramArrayOfByte, paramInt1, paramInt2);
  }

  public void write(long paramLong, short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    Native.write(this.dMH + paramLong, paramArrayOfShort, paramInt1, paramInt2);
  }

  public void write(long paramLong, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    Native.write(this.dMH + paramLong, paramArrayOfChar, paramInt1, paramInt2);
  }

  public void write(long paramLong, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    Native.write(this.dMH + paramLong, paramArrayOfInt, paramInt1, paramInt2);
  }

  public void write(long paramLong, long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    Native.write(this.dMH + paramLong, paramArrayOfLong, paramInt1, paramInt2);
  }

  public void write(long paramLong, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    Native.write(this.dMH + paramLong, paramArrayOfFloat, paramInt1, paramInt2);
  }

  public void write(long paramLong, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    Native.write(this.dMH + paramLong, paramArrayOfDouble, paramInt1, paramInt2);
  }

  public void b(long paramLong, axA[] paramArrayOfaxA, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i++)
      a(paramLong + i * SIZE, paramArrayOfaxA[(paramInt1 + i)]);
  }

  Object a(long paramLong, Class paramClass, Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2;
    if ((bRq == null ? (axA.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) {
      localObject2 = (bik)paramObject;
      if ((cvF == null ? (axA.cvF = cd("ckM")) : cvF).isAssignableFrom(paramClass)) {
        localObject2 = bik.a(paramClass, (bik)localObject2, bX(paramLong));
      }
      else {
        ((bik)localObject2).a(this, (int)paramLong);
        ((bik)localObject2).hb();
      }
      localObject1 = localObject2;
    } else {
      if (paramClass != Boolean.TYPE) { if (paramClass != (cvG == null ? (axA.cvG = cd("java.lang.Boolean")) : cvG)); } else {
        localObject1 = cvp.valueOf(getInt(paramLong) != 0); break label1092;
      }
      if (paramClass != Byte.TYPE) { if (paramClass != (cvH == null ? (axA.cvH = cd("java.lang.Byte")) : cvH)); } else {
        localObject1 = new Byte(getByte(paramLong)); break label1092;
      }
      if (paramClass != Short.TYPE) { if (paramClass != (cvI == null ? (axA.cvI = cd("java.lang.Short")) : cvI)); } else {
        localObject1 = new Short(getShort(paramLong)); break label1092;
      }
      if (paramClass != Character.TYPE) { if (paramClass != (cvJ == null ? (axA.cvJ = cd("java.lang.Character")) : cvJ)); } else {
        localObject1 = new Character(getChar(paramLong)); break label1092;
      }
      if (paramClass != Integer.TYPE) { if (paramClass != (cvK == null ? (axA.cvK = cd("java.lang.Integer")) : cvK)); } else {
        localObject1 = new Integer(getInt(paramLong)); break label1092;
      }
      if (paramClass != Long.TYPE) { if (paramClass != (cvL == null ? (axA.cvL = cd("java.lang.Long")) : cvL)); } else {
        localObject1 = new Long(getLong(paramLong)); break label1092;
      }
      if (paramClass != Float.TYPE) { if (paramClass != (cvM == null ? (axA.cvM = cd("java.lang.Float")) : cvM)); } else {
        localObject1 = new Float(getFloat(paramLong)); break label1092;
      }
      if (paramClass != Double.TYPE) { if (paramClass != (cvN == null ? (axA.cvN = cd("java.lang.Double")) : cvN)); } else {
        localObject1 = new Double(getDouble(paramLong)); break label1092;
      }
      Object localObject3;
      if ((bZT == null ? (axA.bZT = cd("axA")) : bZT).isAssignableFrom(paramClass)) {
        localObject2 = bX(paramLong);
        if (localObject2 != null) {
          localObject3 = (paramObject instanceof axA) ? (axA)paramObject : null;

          if ((localObject3 == null) || (((axA)localObject2).dMH != ((axA)localObject3).dMH))
            localObject1 = localObject2;
          else
            localObject1 = localObject3;
        }
      }
      else if (paramClass == (bRr == null ? (axA.bRr = cd("java.lang.String")) : bRr)) {
        localObject2 = bX(paramLong);
        localObject1 = localObject2 != null ? ((axA)localObject2).getString(0L) : null;
      }
      else if (paramClass == (bRs == null ? (axA.bRs = cd("cFg")) : bRs)) {
        localObject2 = bX(paramLong);
        localObject1 = localObject2 != null ? new cFg(((axA)localObject2).getString(0L, true)) : null;
      }
      else
      {
        Object localObject4;
        if ((cvB == null ? (axA.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass))
        {
          localObject2 = bX(paramLong);
          if (localObject2 == null) {
            localObject1 = null;
          }
          else {
            localObject3 = (dBN)paramObject;
            localObject4 = dLb.g((dBN)localObject3);
            if (!((axA)localObject2).equals(localObject4)) {
              localObject3 = dLb.b(paramClass, (axA)localObject2);
            }
            localObject1 = localObject3;
          }
        } else {
          if (bIG.gIh) if ((cvT == null ? (axA.cvT = cd("java.nio.Buffer")) : cvT).isAssignableFrom(paramClass)) {
              localObject2 = bX(paramLong);
              if (localObject2 == null) {
                localObject1 = null;
              }
              else {
                localObject3 = paramObject == null ? null : Native.a((Buffer)paramObject);

                if ((localObject3 == null) || (!((axA)localObject3).equals(localObject2))) {
                  throw new IllegalStateException("Can't autogenerate a direct buffer on memory read");
                }
                localObject1 = paramObject;
              }
              break label1092;
            } if ((bZS == null ? (axA.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
            localObject2 = (arr)paramObject;
            if (localObject2 != null) {
              localObject3 = a(paramLong, ((arr)localObject2).WJ(), null);
              localObject1 = ((arr)localObject2).a(localObject3, new hT(paramClass));
              if (localObject2.equals(localObject1))
                localObject1 = localObject2;
            }
            else
            {
              localObject3 = MK.k(paramClass);
              localObject4 = a(paramLong, ((MK)localObject3).WJ(), null);
              localObject1 = ((MK)localObject3).a(localObject4, new hT(paramClass));
            }
          }
          else if (paramClass.isArray()) {
            localObject1 = paramObject;
            if (localObject1 == null) {
              throw new IllegalStateException("Need an initialized array");
            }
            a(paramLong, localObject1, paramClass.getComponentType());
          }
          else {
            throw new IllegalArgumentException("Reading \"" + paramClass + "\" from memory is not supported");
          }
        }
      }
    }
    label1092: return localObject1;
  }

  private void a(long paramLong, Object paramObject, Class paramClass)
  {
    int i = 0;
    i = Array.getLength(paramObject);
    Object localObject1 = paramObject;

    if (paramClass == Byte.TYPE) {
      read(paramLong, (byte[])localObject1, 0, i);
    }
    else if (paramClass == Short.TYPE) {
      read(paramLong, (short[])localObject1, 0, i);
    }
    else if (paramClass == Character.TYPE) {
      read(paramLong, (char[])localObject1, 0, i);
    }
    else if (paramClass == Integer.TYPE) {
      read(paramLong, (int[])localObject1, 0, i);
    }
    else if (paramClass == Long.TYPE) {
      read(paramLong, (long[])localObject1, 0, i);
    }
    else if (paramClass == Float.TYPE) {
      read(paramLong, (float[])localObject1, 0, i);
    }
    else if (paramClass == Double.TYPE) {
      read(paramLong, (double[])localObject1, 0, i);
    }
    else if ((bZT == null ? (axA.bZT = cd("axA")) : bZT).isAssignableFrom(paramClass)) {
      a(paramLong, (axA[])localObject1, 0, i);
    }
    else
    {
      Object localObject2;
      Object localObject3;
      int m;
      if ((bRq == null ? (axA.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) {
        localObject2 = (bik[])localObject1;
        if ((cvF == null ? (axA.cvF = cd("ckM")) : cvF).isAssignableFrom(paramClass)) {
          localObject3 = p(paramLong, localObject2.length);
          for (int j = 0; j < localObject2.length; j++)
            localObject2[j] = bik.a(paramClass, localObject2[j], localObject3[j]);
        }
        else
        {
          localObject3 = localObject2[0];
          if (localObject3 == null) {
            localObject3 = bik.a(paramClass, dp(paramLong));
            ((bik)localObject3).buj();
            localObject2[0] = localObject3;
          }
          else {
            ((bik)localObject3).a(this, (int)paramLong);
            ((bik)localObject3).hb();
          }
          bik[] arrayOfbik = ((bik)localObject3).pS(localObject2.length);
          for (m = 1; m < localObject2.length; m++) {
            if (localObject2[m] == null)
            {
              localObject2[m] = arrayOfbik[m];
            }
            else {
              localObject2[m].a(this, (int)(paramLong + m * localObject2[m].size()));
              localObject2[m].hb();
            }
          }
        }
      }
      else if ((bZS == null ? (axA.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
        localObject2 = (arr[])localObject1;
        localObject3 = MK.k(paramClass);
        int k = Native.a(localObject1.getClass(), localObject1) / localObject2.length;
        for (m = 0; m < localObject2.length; m++) {
          Object localObject4 = a(paramLong + k * m, ((MK)localObject3).WJ(), localObject2[m]);
          localObject2[m] = ((arr)((MK)localObject3).a(localObject4, new hT(paramClass)));
        }
      }
      else {
        throw new IllegalArgumentException("Reading array of " + paramClass + " from memory not supported");
      }
    }
  }

  public byte getByte(long paramLong)
  {
    return Native.getByte(this.dMH + paramLong);
  }

  public char getChar(long paramLong)
  {
    return Native.getChar(this.dMH + paramLong);
  }

  public short getShort(long paramLong)
  {
    return Native.getShort(this.dMH + paramLong);
  }

  public int getInt(long paramLong)
  {
    return Native.getInt(this.dMH + paramLong);
  }

  public long getLong(long paramLong)
  {
    return Native.getLong(this.dMH + paramLong);
  }

  public Sx dr(long paramLong)
  {
    return new Sx(Sx.SIZE == 8 ? getLong(paramLong) : getInt(paramLong));
  }

  public float getFloat(long paramLong)
  {
    return Native.getFloat(this.dMH + paramLong);
  }

  public double getDouble(long paramLong)
  {
    return Native.getDouble(this.dMH + paramLong);
  }

  public axA bX(long paramLong)
  {
    return Native.bX(this.dMH + paramLong);
  }

  public ByteBuffer q(long paramLong1, long paramLong2)
  {
    return Native.getDirectByteBuffer(this.dMH + paramLong1, paramLong2).order(ByteOrder.nativeOrder());
  }

  public String getString(long paramLong, boolean paramBoolean)
  {
    return Native.getString(this.dMH + paramLong, paramBoolean);
  }

  public String getString(long paramLong)
  {
    String str = System.getProperty("jna.encoding");
    if (str != null) {
      long l = indexOf(paramLong, (byte)0);
      if (l != -1L) {
        if (l > 2147483647L) {
          throw new OutOfMemoryError("String exceeds maximum length: " + l);
        }
        byte[] arrayOfByte = i(paramLong, (int)l);
        try {
          return new String(arrayOfByte, str);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException) {
        }
      }
    }
    return getString(paramLong, false);
  }

  public byte[] i(long paramLong, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    read(paramLong, arrayOfByte, 0, paramInt);
    return arrayOfByte;
  }

  public char[] j(long paramLong, int paramInt)
  {
    char[] arrayOfChar = new char[paramInt];
    read(paramLong, arrayOfChar, 0, paramInt);
    return arrayOfChar;
  }

  public short[] k(long paramLong, int paramInt)
  {
    short[] arrayOfShort = new short[paramInt];
    read(paramLong, arrayOfShort, 0, paramInt);
    return arrayOfShort;
  }

  public int[] l(long paramLong, int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    read(paramLong, arrayOfInt, 0, paramInt);
    return arrayOfInt;
  }

  public long[] m(long paramLong, int paramInt)
  {
    long[] arrayOfLong = new long[paramInt];
    read(paramLong, arrayOfLong, 0, paramInt);
    return arrayOfLong;
  }

  public float[] n(long paramLong, int paramInt)
  {
    float[] arrayOfFloat = new float[paramInt];
    read(paramLong, arrayOfFloat, 0, paramInt);
    return arrayOfFloat;
  }

  public double[] o(long paramLong, int paramInt)
  {
    double[] arrayOfDouble = new double[paramInt];
    read(paramLong, arrayOfDouble, 0, paramInt);
    return arrayOfDouble;
  }

  public axA[] ds(long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    axA localaxA = bX(paramLong);
    while (localaxA != null) {
      localArrayList.add(localaxA);
      i += SIZE;
      localaxA = bX(paramLong + i);
    }
    return (axA[])localArrayList.toArray(new axA[localArrayList.size()]);
  }

  public axA[] p(long paramLong, int paramInt)
  {
    axA[] arrayOfaxA = new axA[paramInt];
    a(paramLong, arrayOfaxA, 0, paramInt);
    return arrayOfaxA;
  }

  public String[] dt(long paramLong)
  {
    return a(paramLong, -1, false);
  }

  public String[] q(long paramLong, int paramInt)
  {
    return a(paramLong, paramInt, false);
  }

  public String[] e(long paramLong, boolean paramBoolean)
  {
    return a(paramLong, -1, paramBoolean);
  }

  public String[] a(long paramLong, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();

    int i = 0;
    axA localaxA;
    if (paramInt != -1) {
      localaxA = bX(paramLong + i);
      int j = 0;
      while (j++ < paramInt) {
        String str2 = localaxA == null ? null : localaxA.getString(0L, paramBoolean);
        localArrayList.add(str2);
        if (j < paramInt) {
          i += SIZE;
          localaxA = bX(paramLong + i);
        }
      }
    }
    else {
      while ((localaxA = bX(paramLong + i)) != null) {
        String str1 = localaxA == null ? null : localaxA.getString(0L, paramBoolean);
        localArrayList.add(str1);
        i += SIZE;
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  void b(long paramLong, Object paramObject, Class paramClass)
  {
    if (paramClass != Boolean.TYPE) { if (paramClass != (cvG == null ? (axA.cvG = cd("java.lang.Boolean")) : cvG)); } else {
      setInt(paramLong, Boolean.TRUE.equals(paramObject) ? -1 : 0); return;
    }
    if (paramClass != Byte.TYPE) { if (paramClass != (cvH == null ? (axA.cvH = cd("java.lang.Byte")) : cvH)); } else {
      setByte(paramLong, paramObject == null ? 0 : ((Byte)paramObject).byteValue()); return;
    }
    if (paramClass != Short.TYPE) { if (paramClass != (cvI == null ? (axA.cvI = cd("java.lang.Short")) : cvI)); } else {
      setShort(paramLong, paramObject == null ? 0 : ((Short)paramObject).shortValue()); return;
    }
    if (paramClass != Character.TYPE) { if (paramClass != (cvJ == null ? (axA.cvJ = cd("java.lang.Character")) : cvJ)); } else {
      setChar(paramLong, paramObject == null ? '\000' : ((Character)paramObject).charValue()); return;
    }
    if (paramClass != Integer.TYPE) { if (paramClass != (cvK == null ? (axA.cvK = cd("java.lang.Integer")) : cvK)); } else {
      setInt(paramLong, paramObject == null ? 0 : ((Integer)paramObject).intValue()); return;
    }
    if (paramClass != Long.TYPE) { if (paramClass != (cvL == null ? (axA.cvL = cd("java.lang.Long")) : cvL)); } else {
      setLong(paramLong, paramObject == null ? 0L : ((Long)paramObject).longValue()); return;
    }
    if (paramClass != Float.TYPE) { if (paramClass != (cvM == null ? (axA.cvM = cd("java.lang.Float")) : cvM)); } else {
      setFloat(paramLong, paramObject == null ? 0.0F : ((Float)paramObject).floatValue()); return;
    }
    if (paramClass != Double.TYPE) { if (paramClass != (cvN == null ? (axA.cvN = cd("java.lang.Double")) : cvN)); } else {
      setDouble(paramLong, paramObject == null ? 0.0D : ((Double)paramObject).doubleValue()); return;
    }
    if (paramClass == (bZT == null ? (axA.bZT = cd("axA")) : bZT)) {
      a(paramLong, (axA)paramObject);
    }
    else if (paramClass == (bRr == null ? (axA.bRr = cd("java.lang.String")) : bRr)) {
      a(paramLong, (axA)paramObject);
    }
    else if (paramClass == (bRs == null ? (axA.bRs = cd("cFg")) : bRs)) {
      a(paramLong, (axA)paramObject);
    }
    else
    {
      Object localObject;
      if ((bRq == null ? (axA.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) {
        localObject = (bik)paramObject;
        if ((cvF == null ? (axA.cvF = cd("ckM")) : cvF).isAssignableFrom(paramClass)) {
          a(paramLong, localObject == null ? null : ((bik)localObject).sF());
          if (localObject != null)
            ((bik)localObject).but();
        }
        else
        {
          ((bik)localObject).a(this, (int)paramLong);
          ((bik)localObject).write();
        }
      }
      else if ((cvB == null ? (axA.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass)) {
        a(paramLong, dLb.g((dBN)paramObject));
      } else {
        if (bIG.gIh) if ((cvT == null ? (axA.cvT = cd("java.nio.Buffer")) : cvT).isAssignableFrom(paramClass)) {
            localObject = paramObject == null ? null : Native.a((Buffer)paramObject);

            a(paramLong, (axA)localObject);
            return;
          } if ((bZS == null ? (axA.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
          localObject = MK.k(paramClass);
          Class localClass = ((MK)localObject).WJ();
          b(paramLong, ((MK)localObject).a(paramObject, new qd()), localClass);
        }
        else if (paramClass.isArray()) {
          c(paramLong, paramObject, paramClass.getComponentType());
        }
        else {
          throw new IllegalArgumentException("Writing " + paramClass + " to memory is not supported");
        }
      }
    }
  }

  private void c(long paramLong, Object paramObject, Class paramClass)
  {
    Object localObject1;
    if (paramClass == Byte.TYPE) {
      localObject1 = (byte[])paramObject;
      write(paramLong, (byte[])localObject1, 0, localObject1.length);
    }
    else if (paramClass == Short.TYPE) {
      localObject1 = (short[])paramObject;
      write(paramLong, (short[])localObject1, 0, localObject1.length);
    }
    else if (paramClass == Character.TYPE) {
      localObject1 = (char[])paramObject;
      write(paramLong, (char[])localObject1, 0, localObject1.length);
    }
    else if (paramClass == Integer.TYPE) {
      localObject1 = (int[])paramObject;
      write(paramLong, (int[])localObject1, 0, localObject1.length);
    }
    else if (paramClass == Long.TYPE) {
      localObject1 = (long[])paramObject;
      write(paramLong, (long[])localObject1, 0, localObject1.length);
    }
    else if (paramClass == Float.TYPE) {
      localObject1 = (float[])paramObject;
      write(paramLong, (float[])localObject1, 0, localObject1.length);
    }
    else if (paramClass == Double.TYPE) {
      localObject1 = (double[])paramObject;
      write(paramLong, (double[])localObject1, 0, localObject1.length);
    }
    else if ((bZT == null ? (axA.bZT = cd("axA")) : bZT).isAssignableFrom(paramClass)) {
      localObject1 = (axA[])paramObject;
      b(paramLong, (axA[])localObject1, 0, localObject1.length);
    }
    else
    {
      Object localObject2;
      Object localObject3;
      int j;
      if ((bRq == null ? (axA.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) {
        localObject1 = (bik[])paramObject;
        if ((cvF == null ? (axA.cvF = cd("ckM")) : cvF).isAssignableFrom(paramClass)) {
          localObject2 = new axA[localObject1.length];
          for (int i = 0; i < localObject1.length; i++) {
            if (localObject1[i] == null) {
              localObject2[i] = null;
            }
            else {
              localObject2[i] = localObject1[i].sF();
              localObject1[i].write();
            }
          }
          b(paramLong, (axA[])localObject2, 0, localObject2.length);
        }
        else {
          localObject2 = localObject1[0];
          if (localObject2 == null) {
            localObject2 = bik.a(paramClass, dp(paramLong));
            localObject1[0] = localObject2;
          }
          else {
            ((bik)localObject2).a(this, (int)paramLong);
          }
          ((bik)localObject2).write();
          localObject3 = ((bik)localObject2).pS(localObject1.length);
          for (j = 1; j < localObject1.length; j++) {
            if (localObject1[j] == null) {
              localObject1[j] = localObject3[j];
            }
            else {
              localObject1[j].a(this, (int)(paramLong + j * localObject1[j].size()));
            }
            localObject1[j].write();
          }
        }
      }
      else if ((bZS == null ? (axA.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
        localObject1 = (arr[])paramObject;
        localObject2 = MK.k(paramClass);
        localObject3 = ((MK)localObject2).WJ();
        j = Native.a(paramObject.getClass(), paramObject) / localObject1.length;
        for (int k = 0; k < localObject1.length; k++) {
          Object localObject4 = ((MK)localObject2).a(localObject1[k], new qd());
          b(paramLong + k * j, localObject4, (Class)localObject3);
        }
      }
      else {
        throw new IllegalArgumentException("Writing array of " + paramClass + " to memory not supported");
      }
    }
  }

  public void setMemory(long paramLong1, long paramLong2, byte paramByte)
  {
    Native.setMemory(this.dMH + paramLong1, paramLong2, paramByte);
  }

  public void setByte(long paramLong, byte paramByte)
  {
    Native.setByte(this.dMH + paramLong, paramByte);
  }

  public void setShort(long paramLong, short paramShort)
  {
    Native.setShort(this.dMH + paramLong, paramShort);
  }

  public void setChar(long paramLong, char paramChar)
  {
    Native.setChar(this.dMH + paramLong, paramChar);
  }

  public void setInt(long paramLong, int paramInt)
  {
    Native.setInt(this.dMH + paramLong, paramInt);
  }

  public void setLong(long paramLong1, long paramLong2)
  {
    Native.setLong(this.dMH + paramLong1, paramLong2);
  }

  public void a(long paramLong, Sx paramSx)
  {
    if (Sx.SIZE == 8)
      setLong(paramLong, paramSx.longValue());
    else
      setInt(paramLong, paramSx.intValue());
  }

  public void setFloat(long paramLong, float paramFloat)
  {
    Native.setFloat(this.dMH + paramLong, paramFloat);
  }

  public void setDouble(long paramLong, double paramDouble)
  {
    Native.setDouble(this.dMH + paramLong, paramDouble);
  }

  public void a(long paramLong, axA paramaxA)
  {
    Native.setPointer(this.dMH + paramLong, paramaxA != null ? paramaxA.dMH : 0L);
  }

  public void setString(long paramLong, String paramString, boolean paramBoolean)
  {
    Native.setString(this.dMH + paramLong, paramString, paramBoolean);
  }

  public void c(long paramLong, String paramString)
  {
    byte[] arrayOfByte = Native.getBytes(paramString);
    write(paramLong, arrayOfByte, 0, arrayOfByte.length);
    setByte(paramLong + arrayOfByte.length, (byte)0);
  }

  public String toString() {
    return "native@0x" + Long.toHexString(this.dMH);
  }

  public static long a(axA paramaxA)
  {
    return paramaxA == null ? 0L : paramaxA.dMH;
  }

  public static void b(axA paramaxA, long paramLong)
  {
    paramaxA.dMH = paramLong;
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }

  static
  {
    if ((axA.SIZE = Native.cuK) == 0)
      throw new Error("Native library not initialized");
  }
}