import java.io.FilterReader;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public final class bYe
{
  private static final int DEFAULT_BUFFER_SIZE = 8192;
  public Reader hoh;
  public int bufferSize = 8192;

  public Vector hoi = new Vector();

  private FF aIn = null;

  public void h(Reader paramReader)
  {
    this.hoh = paramReader;
  }

  public void b(FF paramFF)
  {
    this.aIn = paramFF;
  }

  public FF Ga()
  {
    return this.aIn;
  }

  public void setBufferSize(int paramInt)
  {
    this.bufferSize = paramInt;
  }

  public void f(Vector paramVector)
  {
    this.hoi = paramVector;
  }

  public Reader cdn()
  {
    if (this.hoh == null) {
      throw new cJ("primaryReader must not be null.");
    }

    Reader localReader1 = this.hoh;
    int i = this.hoi.size();
    Vector localVector1 = new Vector();
    ArrayList localArrayList = new ArrayList();

    for (int j = 0; j < i; j++) {
      dpF localdpF = (dpF)this.hoi.elementAt(j);

      Vector localVector2 = localdpF.cXf();
      int n = localVector2.size();
      for (int i1 = 0; i1 < n; i1++) {
        localVector1.addElement(localVector2.elementAt(i1));
      }
    }

    j = localVector1.size();

    if (j > 0) {
      int k = 0;
      try {
        for (int m = 0; m < j; m++) {
          Object localObject1 = localVector1.elementAt(m);

          if ((localObject1 instanceof bma)) {
            localReader1 = a((bma)localVector1.elementAt(m), localReader1, localArrayList);
          }
          else if ((localObject1 instanceof bEc)) {
            aV(localObject1);
            localReader1 = ((bEc)localObject1).b(localReader1);
            aV(localReader1);
          }
        }
        k = 1;
      } finally {
        if ((k == 0) && (localArrayList.size() > 0)) {
          B(localArrayList);
        }
      }
    }
    Reader localReader2 = localReader1;
    return localArrayList.size() == 0 ? localReader2 : new dKu(this, localReader2, localArrayList);
  }

  private void aV(Object paramObject)
  {
    if (this.aIn == null) {
      return;
    }
    if ((paramObject instanceof bgQ)) {
      ((bgQ)paramObject).b(this.aIn);
      return;
    }
    this.aIn.G(paramObject);
  }

  private static void B(List paramList)
  {
    for (Iterator localIterator = paramList.iterator(); localIterator.hasNext(); )
      ((iA)localIterator.next()).cleanup();
  }

  public String c(Reader paramReader)
  {
    return wh.a(paramReader, this.bufferSize);
  }

  private Reader a(bma parambma, Reader paramReader, List paramList)
  {
    String str = parambma.getClassName();
    aoo localaoo = parambma.bwY();
    FF localFF = parambma.Ga();
    if (str != null) {
      try {
        Class localClass = null;
        Object localObject1;
        if (localaoo == null) {
          localClass = Class.forName(str);
        } else {
          localObject1 = localFF.b(localaoo);
          paramList.add(localObject1);
          localClass = Class.forName(str, true, (ClassLoader)localObject1);
        }
        if (localClass != null) {
          if (!FilterReader.class.isAssignableFrom(localClass)) {
            throw new cJ(str + " does not extend" + " java.io.FilterReader");
          }

          localObject1 = localClass.getConstructors();
          int i = 0;
          int j = 0;
          for (; i < localObject1.length; i++) {
            localObject2 = localObject1[i].getParameterTypes();
            if ((localObject2.length == 1) && (localObject2[0].isAssignableFrom(Reader.class)))
            {
              j = 1;
              break;
            }
          }
          if (j == 0) {
            throw new cJ(str + " does not define" + " a public constructor" + " that takes in a Reader" + " as its single argument.");
          }

          Object localObject2 = { paramReader };
          Reader localReader = (Reader)localObject1[i].newInstance((Object[])localObject2);

          aV(localReader);
          if (MJ.class.isAssignableFrom(localClass)) {
            daL[] arrayOfdaL = parambma.bwZ();
            ((MJ)localReader).a(arrayOfdaL);
          }
          return localReader;
        }
      } catch (ClassNotFoundException localClassNotFoundException) {
        throw new cJ(localClassNotFoundException);
      } catch (InstantiationException localInstantiationException) {
        throw new cJ(localInstantiationException);
      } catch (IllegalAccessException localIllegalAccessException) {
        throw new cJ(localIllegalAccessException);
      } catch (InvocationTargetException localInvocationTargetException) {
        throw new cJ(localInvocationTargetException);
      }

    }

    return paramReader;
  }
}