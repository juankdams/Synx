import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aiq
  implements bWU, eo
{
  private static final Logger K = Logger.getLogger(aiq.class);
  public static final short den = 5;
  private static final aee bx = new bOO(new bGC(), 100);

  private cyE deo = new cyE();

  private cyE dep = new cyE();
  private short deq;

  public final void release()
  {
    try
    {
      bx.y(this);
    } catch (Exception localException) {
      K.error("Exception lors du returnObject d'un BonusPointCharacteristics. Impossible d'après les javadoc des apache Pools");
    }
  }

  public static aiq avh()
  {
    try {
      return (aiq)bx.Mm();
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut sur un BonusPointCharacteristics : ", localException);
    }
  }

  public void aJ()
  {
    this.dep.c(eu.azt.bJ(), (short)0);
    this.dep.c(eu.azw.bJ(), (short)0);
    this.dep.c(eu.azv.bJ(), (short)0);
    this.dep.c(eu.azu.bJ(), (short)0);
    this.dep.c(eu.azs.bJ(), (short)0);
    this.dep.c(eu.azr.bJ(), (short)0);

    this.deo.c(eu.azt.bJ(), (short)0);
    this.deo.c(eu.azw.bJ(), (short)0);
    this.deo.c(eu.azv.bJ(), (short)0);
    this.deo.c(eu.azu.bJ(), (short)0);
    this.deo.c(eu.azs.bJ(), (short)0);
    this.deo.c(eu.azr.bJ(), (short)0);
  }

  public void bc() {
    this.dep.clear();
    this.deq = 0;
    this.deo.clear();
  }

  public short a(bhh parambhh, byte paramByte)
  {
    if (!this.dep.D(paramByte)) {
      return -1;
    }

    short s = (short)e(parambhh, paramByte);
    return Y.ax().a(parambhh.uO(), paramByte, s);
  }

  public short b(bhh parambhh, byte paramByte) {
    if (!this.dep.D(paramByte)) {
      return -1;
    }

    short s = (short)e(parambhh, paramByte);
    return Y.ax().b(parambhh.uO(), paramByte, s);
  }

  public aMd c(bhh parambhh, byte paramByte)
  {
    if (!this.dep.D(paramByte)) {
      return aMd.eqY;
    }

    if (!(parambhh instanceof SB)) {
      return aMd.eqZ;
    }

    short s = (short)e(parambhh, paramByte);
    int i = Y.ax().a(parambhh.uO(), paramByte, s);

    if (i > this.deq) {
      return aMd.eqX;
    }

    this.deq = ((short)(this.deq - i));
    this.dep.c(paramByte, (short)(this.dep.ea(paramByte) + i));

    return aMd.eqW;
  }

  public aMd d(bhh parambhh, byte paramByte)
  {
    if (!this.dep.D(paramByte)) {
      return aMd.eqY;
    }

    if (!(parambhh instanceof SB)) {
      return aMd.eqZ;
    }

    int i = this.dep.ea(paramByte);
    this.dep.c(paramByte, (short)0);
    this.deq = ((short)(this.deq + i));

    return aMd.eqW;
  }

  public aMd a(bhh parambhh)
  {
    for (byte b : this.dep.yv()) {
      aMd localaMd = d(parambhh, b);
      if (localaMd != aMd.eqW) {
        return localaMd;
      }
    }
    return aMd.eqW;
  }

  public int e(bhh parambhh, byte paramByte)
  {
    if (!this.dep.D(paramByte)) {
      return -1;
    }

    if (!(parambhh instanceof SB)) {
      return -1;
    }

    short s1 = 0;
    int i = this.dep.ea(paramByte);

    while (i > 0) {
      int j = Y.ax().a(parambhh.uO(), paramByte, s1);
      short s2 = Y.ax().b(parambhh.uO(), paramByte, s1);
      i = (short)(i - j);
      if (i >= 0) {
        s1 = (short)(s1 + s2);
      }
    }
    return s1;
  }

  public void az(short paramShort)
  {
    this.deq = ((short)(this.deq + paramShort));
  }

  public short avi()
  {
    return this.deq;
  }

  public void b(byte paramByte, short paramShort) {
    short s = this.deo.ea(paramByte);
    s = (short)(s + paramShort);
    this.deo.c(paramByte, s);
  }

  public aNm avj() {
    return this.dep.cvC();
  }

  public aNm avk() {
    return this.deo.cvC();
  }

  public boolean a(apI paramapI)
  {
    boolean bool = true;
    paramapI.clear();
    aNm localaNm = this.dep.cvC();
    while (localaNm.hasNext()) {
      localaNm.fl();
      localObject = new dkz();
      ((dkz)localObject).cfJ = localaNm.rC();
      ((dkz)localObject).lhL = localaNm.Lb();
      paramapI.dvN.add(localObject);
    }
    Object localObject = this.deo.cvC();
    while (((aNm)localObject).hasNext()) {
      ((aNm)localObject).fl();
      Ow localOw = new Ow();
      localOw.cfJ = ((aNm)localObject).rC();
      localOw.value = ((aNm)localObject).Lb();
      paramapI.dvO.add(localOw);
    }

    paramapI.dvM = this.deq;
    return bool;
  }

  public boolean b(apI paramapI)
  {
    boolean bool = true;
    this.deq = paramapI.dvM;
    for (Iterator localIterator = paramapI.dvN.iterator(); localIterator.hasNext(); ) { localObject = (dkz)localIterator.next();
      this.dep.c(((dkz)localObject).cfJ, ((dkz)localObject).lhL);
    }
    Object localObject;
    for (localIterator = paramapI.dvO.iterator(); localIterator.hasNext(); ) { localObject = (Ow)localIterator.next();
      this.deo.c(((Ow)localObject).cfJ, ((Ow)localObject).value);
    }

    return bool;
  }
}