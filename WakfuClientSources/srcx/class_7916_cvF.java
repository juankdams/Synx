import java.io.IOException;
import java.io.ObjectOutput;

class cvF
  implements BA, CE, EL, NE, Tp, aAI, aCq, aGD, aGQ, aLR, aSV, aXb, aZf, aib, arG, azb, bHz, bPA, bQI, bYD, bZs, bdV, bfl, bhG, bhn, cFk, cIw, cKF, cPv, cSv, ccL, cdP, cvZ, dDn, dGy, dIf, dIy, dOg, dRH, dSo, dVV, dcb, dfG, dgE, diA, dsW, dsq, dwM, dyg, eA, eH, mJ, nf, ok, qP, sQ
{
  private final ObjectOutput ihf;
  IOException ihg;

  cvF(ObjectOutput paramObjectOutput)
  {
    this.ihf = paramObjectOutput;
  }

  public boolean t(byte paramByte) {
    try {
      this.ihf.writeByte(paramByte);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean bb(short paramShort) {
    try {
      this.ihf.writeShort(paramShort);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean R(int paramInt) {
    try {
      this.ihf.writeInt(paramInt);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean O(double paramDouble) {
    try {
      this.ihf.writeDouble(paramDouble);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean Q(long paramLong) {
    try {
      this.ihf.writeLong(paramLong);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean bV(float paramFloat) {
    try {
      this.ihf.writeFloat(paramFloat);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean d(Object paramObject) {
    try {
      this.ihf.writeObject(paramObject);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean f(Object paramObject1, Object paramObject2) {
    try {
      this.ihf.writeObject(paramObject1);
      this.ihf.writeObject(paramObject2);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(Object paramObject, byte paramByte) {
    try {
      this.ihf.writeObject(paramObject);
      this.ihf.writeByte(paramByte);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean b(Object paramObject, short paramShort) {
    try {
      this.ihf.writeObject(paramObject);
      this.ihf.writeShort(paramShort);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(Object paramObject, int paramInt) {
    try {
      this.ihf.writeObject(paramObject);
      this.ihf.writeInt(paramInt);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(Object paramObject, long paramLong) {
    try {
      this.ihf.writeObject(paramObject);
      this.ihf.writeLong(paramLong);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(Object paramObject, double paramDouble) {
    try {
      this.ihf.writeObject(paramObject);
      this.ihf.writeDouble(paramDouble);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(Object paramObject, float paramFloat) {
    try {
      this.ihf.writeObject(paramObject);
      this.ihf.writeFloat(paramFloat);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean k(int paramInt, byte paramByte) {
    try {
      this.ihf.writeInt(paramInt);
      this.ihf.writeByte(paramByte);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean k(int paramInt, short paramShort) {
    try {
      this.ihf.writeInt(paramInt);
      this.ihf.writeShort(paramShort);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean c(int paramInt, Object paramObject) {
    try {
      this.ihf.writeInt(paramInt);
      this.ihf.writeObject(paramObject);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean aL(int paramInt1, int paramInt2) {
    try {
      this.ihf.writeInt(paramInt1);
      this.ihf.writeInt(paramInt2);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean f(int paramInt, long paramLong) {
    try {
      this.ihf.writeInt(paramInt);
      this.ihf.writeLong(paramLong);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(int paramInt, double paramDouble) {
    try {
      this.ihf.writeInt(paramInt);
      this.ihf.writeDouble(paramDouble);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean h(int paramInt, float paramFloat) {
    try {
      this.ihf.writeInt(paramInt);
      this.ihf.writeFloat(paramFloat);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(long paramLong, Object paramObject) {
    try {
      this.ihf.writeLong(paramLong);
      this.ihf.writeObject(paramObject);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean f(long paramLong, byte paramByte) {
    try {
      this.ihf.writeLong(paramLong);
      this.ihf.writeByte(paramByte);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean b(long paramLong, short paramShort) {
    try {
      this.ihf.writeLong(paramLong);
      this.ihf.writeShort(paramShort);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean r(long paramLong, int paramInt) {
    try {
      this.ihf.writeLong(paramLong);
      this.ihf.writeInt(paramInt);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(long paramLong1, long paramLong2) {
    try {
      this.ihf.writeLong(paramLong1);
      this.ihf.writeLong(paramLong2);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(long paramLong, double paramDouble) {
    try {
      this.ihf.writeLong(paramLong);
      this.ihf.writeDouble(paramDouble);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(long paramLong, float paramFloat) {
    try {
      this.ihf.writeLong(paramLong);
      this.ihf.writeFloat(paramFloat);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(double paramDouble, Object paramObject) {
    try {
      this.ihf.writeDouble(paramDouble);
      this.ihf.writeObject(paramObject);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(double paramDouble, byte paramByte) {
    try {
      this.ihf.writeDouble(paramDouble);
      this.ihf.writeByte(paramByte);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(double paramDouble, short paramShort) {
    try {
      this.ihf.writeDouble(paramDouble);
      this.ihf.writeShort(paramShort);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(double paramDouble, int paramInt) {
    try {
      this.ihf.writeDouble(paramDouble);
      this.ihf.writeInt(paramInt);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(double paramDouble, long paramLong) {
    try {
      this.ihf.writeDouble(paramDouble);
      this.ihf.writeLong(paramLong);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean s(double paramDouble1, double paramDouble2) {
    try {
      this.ihf.writeDouble(paramDouble1);
      this.ihf.writeDouble(paramDouble2);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(double paramDouble, float paramFloat) {
    try {
      this.ihf.writeDouble(paramDouble);
      this.ihf.writeFloat(paramFloat);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(float paramFloat, Object paramObject) {
    try {
      this.ihf.writeFloat(paramFloat);
      this.ihf.writeObject(paramObject);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(float paramFloat, byte paramByte) {
    try {
      this.ihf.writeFloat(paramFloat);
      this.ihf.writeByte(paramByte);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(float paramFloat, short paramShort) {
    try {
      this.ihf.writeFloat(paramFloat);
      this.ihf.writeShort(paramShort);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean c(float paramFloat, int paramInt) {
    try {
      this.ihf.writeFloat(paramFloat);
      this.ihf.writeInt(paramInt);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(float paramFloat, long paramLong) {
    try {
      this.ihf.writeFloat(paramFloat);
      this.ihf.writeLong(paramLong);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(float paramFloat, double paramDouble) {
    try {
      this.ihf.writeFloat(paramFloat);
      this.ihf.writeDouble(paramDouble);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean i(float paramFloat1, float paramFloat2) {
    try {
      this.ihf.writeFloat(paramFloat1);
      this.ihf.writeFloat(paramFloat2);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean b(byte paramByte, Object paramObject) {
    try {
      this.ihf.writeByte(paramByte);
      this.ihf.writeObject(paramObject);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean c(byte paramByte1, byte paramByte2) {
    try {
      this.ihf.writeByte(paramByte1);
      this.ihf.writeByte(paramByte2);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(byte paramByte, short paramShort) {
    try {
      this.ihf.writeByte(paramByte);
      this.ihf.writeShort(paramShort);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean g(byte paramByte, int paramInt) {
    try {
      this.ihf.writeByte(paramByte);
      this.ihf.writeInt(paramInt);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean f(byte paramByte, long paramLong) {
    try {
      this.ihf.writeByte(paramByte);
      this.ihf.writeLong(paramLong);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(byte paramByte, double paramDouble) {
    try {
      this.ihf.writeByte(paramByte);
      this.ihf.writeDouble(paramDouble);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(byte paramByte, float paramFloat) {
    try {
      this.ihf.writeByte(paramByte);
      this.ihf.writeFloat(paramFloat);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(short paramShort, Object paramObject) {
    try {
      this.ihf.writeShort(paramShort);
      this.ihf.writeObject(paramObject);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean d(short paramShort, byte paramByte) {
    try {
      this.ihf.writeShort(paramShort);
      this.ihf.writeByte(paramByte);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean c(short paramShort1, short paramShort2) {
    try {
      this.ihf.writeShort(paramShort1);
      this.ihf.writeShort(paramShort2);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean f(short paramShort, int paramInt) {
    try {
      this.ihf.writeShort(paramShort);
      this.ihf.writeInt(paramInt);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean c(short paramShort, long paramLong) {
    try {
      this.ihf.writeShort(paramShort);
      this.ihf.writeLong(paramLong);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean a(short paramShort, double paramDouble) {
    try {
      this.ihf.writeShort(paramShort);
      this.ihf.writeDouble(paramDouble);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }

  public boolean b(short paramShort, float paramFloat) {
    try {
      this.ihf.writeShort(paramShort);
      this.ihf.writeFloat(paramFloat);
    } catch (IOException localIOException) {
      this.ihg = localIOException;
      return false;
    }
    return true;
  }
}