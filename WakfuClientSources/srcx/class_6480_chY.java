import java.util.ArrayList;
import org.apache.log4j.Logger;

public enum chY
  implements aqm, ccI
{
  private static final Logger K = Logger.getLogger(chY.class);
  private short aXf;
  private Class bS;
  private qM doG;
  private short hGp;

  private chY(short paramqM, Class paramShort2, qM arg5, short arg6)
  {
    this.aXf = paramqM;
    this.bS = paramShort2;
    Object localObject;
    this.doG = localObject;
    short s;
    this.hGp = s;
  }

  public short xr() {
    return this.aXf;
  }

  public bbH c(int[] paramArrayOfInt, short paramShort) {
    try {
      bbH localbbH = (bbH)this.bS.newInstance();
      localbbH.a(paramArrayOfInt);
      localbbH.bG(paramShort);
      return localbbH;
    } catch (InstantiationException localInstantiationException) {
      K.error(bBd.g(localInstantiationException));
    } catch (IllegalAccessException localIllegalAccessException) {
      K.error(bBd.g(localIllegalAccessException));
    }
    return null;
  }

  public static bbH a(int paramInt, int[] paramArrayOfInt, short paramShort) {
    for (chY localchY : values()) {
      if (localchY.xr() == paramInt) {
        return localchY.c(paramArrayOfInt, paramShort);
      }
    }
    return null;
  }

  public static bbH R(ArrayList paramArrayList) {
    Object localObject = null;
    for (bbH localbbH : paramArrayList) {
      if (localObject == null) {
        localObject = localbbH;
      }
      else if (localObject.eL().cjE() < localbbH.eL().cjE()) {
        localObject = localbbH;
      }
    }

    return localObject;
  }

  public short cjE() {
    return this.hGp;
  }

  public void db(short paramShort) {
    this.hGp = paramShort;
  }

  public String bK() {
    return Short.valueOf(this.aXf).toString();
  }

  public String bL() {
    return toString();
  }

  public qM aF() {
    return this.doG;
  }

  public String bN() {
    return null;
  }
}