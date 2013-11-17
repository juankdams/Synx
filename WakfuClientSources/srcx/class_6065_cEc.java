import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

public class cEc
{
  private static final int WORD = 4;
  private static final Map ixx = new ConcurrentHashMap();

  public static void register(Class paramClass)
  {
    try
    {
      bpz localbpz = (bpz)paramClass.newInstance();
      ixx.put(localbpz.HA(), paramClass);
    } catch (ClassCastException localClassCastException) {
      throw new RuntimeException(paramClass + " doesn't implement ZipExtraField");
    } catch (InstantiationException localInstantiationException) {
      throw new RuntimeException(paramClass + " is not a concrete class");
    } catch (IllegalAccessException localIllegalAccessException) {
      throw new RuntimeException(paramClass + "'s no-arg constructor is not public");
    }
  }

  public static bpz a(bTM parambTM)
  {
    Class localClass = (Class)ixx.get(parambTM);
    if (localClass != null) {
      return (bpz)localClass.newInstance();
    }
    cEx localcEx = new cEx();
    localcEx.b(parambTM);
    return localcEx;
  }

  public static bpz[] az(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, true, vG.bkr);
  }

  public static bpz[] c(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    return a(paramArrayOfByte, paramBoolean, vG.bkr);
  }

  public static bpz[] a(byte[] paramArrayOfByte, boolean paramBoolean, vG paramvG)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;

    while (i <= paramArrayOfByte.length - 4) {
      localObject1 = new bTM(paramArrayOfByte, i);
      int j = new bTM(paramArrayOfByte, i + 2).getValue();
      Object localObject2;
      if (i + 4 + j > paramArrayOfByte.length) {
        switch (paramvG.getKey()) {
        case 0:
          throw new ZipException("bad extra field starting at " + i + ".  Block length of " + j + " bytes exceeds remaining" + " data of " + (paramArrayOfByte.length - i - 4) + " bytes.");
        case 2:
          localObject2 = new boW();

          if (paramBoolean) {
            ((boW)localObject2).b(paramArrayOfByte, i, paramArrayOfByte.length - i);
          }
          else {
            ((boW)localObject2).f(paramArrayOfByte, i, paramArrayOfByte.length - i);
          }

          localArrayList.add(localObject2);
        case 1:
          break;
        default:
          throw new ZipException("unknown UnparseableExtraField key: " + paramvG.getKey());
        }
      }
      try
      {
        localObject2 = a((bTM)localObject1);
        if ((paramBoolean) || (!(localObject2 instanceof crQ)))
        {
          ((bpz)localObject2).b(paramArrayOfByte, i + 4, j);
        }
        else ((crQ)localObject2).f(paramArrayOfByte, i + 4, j);

        localArrayList.add(localObject2);
      } catch (InstantiationException localInstantiationException) {
        throw new ZipException(localInstantiationException.getMessage());
      } catch (IllegalAccessException localIllegalAccessException) {
        throw new ZipException(localIllegalAccessException.getMessage());
      }
      i += j + 4;
    }

    Object localObject1 = new bpz[localArrayList.size()];
    return (bpz[])localArrayList.toArray((Object[])localObject1);
  }

  public static byte[] a(bpz[] paramArrayOfbpz)
  {
    int i = (paramArrayOfbpz.length > 0) && ((paramArrayOfbpz[(paramArrayOfbpz.length - 1)] instanceof boW)) ? 1 : 0;

    int j = i != 0 ? paramArrayOfbpz.length - 1 : paramArrayOfbpz.length;

    int k = 4 * j;
    byte[] arrayOfByte2;
    for (arrayOfByte2 : paramArrayOfbpz) {
      k += arrayOfByte2.Oz().getValue();
    }

    ??? = new byte[k];
    ??? = 0;
    for (??? = 0; ??? < j; ???++) {
      System.arraycopy(paramArrayOfbpz[???].HA().getBytes(), 0, ???, ???, 2);

      System.arraycopy(paramArrayOfbpz[???].Oz().getBytes(), 0, ???, ??? + 2, 2);

      arrayOfByte2 = paramArrayOfbpz[???].Oy();
      System.arraycopy(arrayOfByte2, 0, ???, ??? + 4, arrayOfByte2.length);
      ??? += arrayOfByte2.length + 4;
    }
    if (i != 0) {
      byte[] arrayOfByte1 = paramArrayOfbpz[(paramArrayOfbpz.length - 1)].Oy();
      System.arraycopy(arrayOfByte1, 0, ???, ???, arrayOfByte1.length);
    }
    return ???;
  }

  public static byte[] b(bpz[] paramArrayOfbpz)
  {
    int i = (paramArrayOfbpz.length > 0) && ((paramArrayOfbpz[(paramArrayOfbpz.length - 1)] instanceof boW)) ? 1 : 0;

    int j = i != 0 ? paramArrayOfbpz.length - 1 : paramArrayOfbpz.length;

    int k = 4 * j;
    byte[] arrayOfByte2;
    for (arrayOfByte2 : paramArrayOfbpz) {
      k += arrayOfByte2.Ox().getValue();
    }
    ??? = new byte[k];
    ??? = 0;
    for (??? = 0; ??? < j; ???++) {
      System.arraycopy(paramArrayOfbpz[???].HA().getBytes(), 0, ???, ???, 2);

      System.arraycopy(paramArrayOfbpz[???].Ox().getBytes(), 0, ???, ??? + 2, 2);

      arrayOfByte2 = paramArrayOfbpz[???].Ow();
      System.arraycopy(arrayOfByte2, 0, ???, ??? + 4, arrayOfByte2.length);
      ??? += arrayOfByte2.length + 4;
    }
    if (i != 0) {
      byte[] arrayOfByte1 = paramArrayOfbpz[(paramArrayOfbpz.length - 1)].Ow();
      System.arraycopy(arrayOfByte1, 0, ???, ???, arrayOfByte1.length);
    }
    return ???;
  }

  static
  {
    register(Iz.class);
    register(bob.class);
    register(yW.class);
    register(afM.class);
    register(acw.class);
  }
}