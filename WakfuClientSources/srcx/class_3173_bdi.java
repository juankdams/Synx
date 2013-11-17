import java.util.ArrayList;
import java.util.EnumMap;
import org.apache.log4j.Logger;

public class bdi extends dGf
{
  public static final bdi fnz = new bdi((short)-2, 0, false, (short)0, (short)0, new EnumMap(eu.class), 0, 0, new int[0], new int[0], new int[0], 0, new short[0], (short)0, (short)0, (byte)0, (byte)0, 30000, aqh.dxG, aqh.dxF, 5, bDh.gyf, bwA.ggS, 1.0F);

  private static final Logger K = Logger.getLogger(bdi.class);
  private final boolean cNP;
  private final int aTm;
  private final int cOq;
  private final byte io;
  private final PX fnA;
  private final ArrayList fnB = new ArrayList();
  private final ms fnC;
  private final float fnD;
  private aMl fnE;
  private final ArrayList dcd = new ArrayList();

  public bdi(short paramShort1, int paramInt1, boolean paramBoolean, short paramShort2, short paramShort3, EnumMap paramEnumMap, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int paramInt4, short[] paramArrayOfShort, short paramShort4, short paramShort5, byte paramByte1, byte paramByte2, int paramInt5, aqh paramaqh1, aqh paramaqh2, int paramInt6, int paramInt7, bwA parambwA, float paramFloat)
  {
    super(paramShort1, paramInt1, paramShort2, paramShort3, paramEnumMap, paramArrayOfInt2, paramArrayOfInt1, paramArrayOfShort, paramShort4, paramShort5, paramByte1, paramInt5, paramaqh1, paramaqh2, paramInt6, paramInt7, parambwA);

    this.aTm = paramInt2;
    this.cOq = paramInt3;
    if ((!xc.dx(this.aTm)) && (paramArrayOfInt3 != null) && (paramArrayOfInt3.length != 0)) {
      if (paramArrayOfInt3.length % 2 != 0) {
        K.error(" le tableau d'équippement doit contenir des paires Id / Nombre");
      }
      this.fnA = new PX(paramArrayOfInt3.length / 2);
      for (int i = 0; i < paramArrayOfInt3.length; i += 2)
        this.fnA.c((byte)paramArrayOfInt3[(i + 2)], paramArrayOfInt3[i]);
    }
    else {
      this.fnA = null;
      if ((xc.dx(this.aTm)) && (paramArrayOfInt3 != null) && (paramArrayOfInt3.length != 0))
        K.error("ON TENTE DE METTRE DES EQUIPEMENTS (VISUEL) SUR UN GFX DE TYPE MONSTER (>1000), monsterId=" + paramShort1);
    }
    this.io = ((byte)paramInt4);
    this.cNP = paramBoolean;
    this.fnC = ms.w(paramByte2);
    this.fnD = paramFloat;
  }

  public boolean amR() {
    return this.cNP;
  }

  public int ajB() {
    return this.aTm;
  }

  public int anr() {
    return this.cOq;
  }

  public byte bY() {
    return this.io;
  }

  public PX aeu()
  {
    return this.fnA;
  }

  public String getName() {
    int i = uO();
    if (i != fnz.uO()) {
      return bU.fH().b(7, i, new Object[0]);
    }
    return "error : breed not set";
  }

  public ArrayList brj() {
    return this.fnB;
  }

  public boolean oV(int paramInt) {
    return !this.fnB.isEmpty();
  }

  public void ck(int paramInt1, int paramInt2) {
    dSR localdSR = Be.Kj().ea(paramInt1);
    if (localdSR != null)
      this.fnB.add(new bvM(paramInt2, localdSR));
  }

  public void a(VI paramVI) {
    this.dcd.add(paramVI);
  }

  public ArrayList bjo() {
    return this.dcd;
  }

  public VI fe(long paramLong)
  {
    for (int i = 0; i < this.dcd.size(); i++) {
      VI localVI = (VI)this.dcd.get(i);
      if (localVI.getId() == paramLong)
        return localVI;
    }
    return null;
  }

  public ms brk() {
    return this.fnC;
  }

  public aMl brl() {
    return this.fnE;
  }

  public void a(aMl paramaMl) {
    this.fnE = paramaMl;
  }

  public void oW(int paramInt)
  {
    super.oW(paramInt);
  }

  public float brm() {
    return this.fnD;
  }
}