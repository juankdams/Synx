import java.util.ArrayList;

public final class Nl
{
  public static final int cai = -1;
  private static final int caj = 1;
  private static final int cak = 2;
  private static final int cal = 4;
  private static final int cam = 8;
  private static final int can = 16;
  private static final int cao = 32;
  private static final int cap = 64;
  private static final int caq = 128;
  private byte car;
  private float cas;
  private float cat;
  private String[] cau;
  private vp[] cav;
  private final akR caw = new akR();
  private bul[] cax;
  private aWk[] cay;
  private cNi caz;

  public Nl()
  {
    clear();
  }

  public void d(aYQ paramaYQ)
  {
    this.car = paramaYQ.readByte();
    if (Xl()) {
      this.cas = paramaYQ.readFloat();
    }
    if (Xn()) {
      this.cat = paramaYQ.readFloat();
    }
    if (Xm()) {
      i = paramaYQ.readShort() & 0xFFFF;
      this.cau = new String[i];
      for (j = 0; j < i; j++)
        this.cau[j] = paramaYQ.readString();
    }
    int m;
    if (Xo()) {
      i = paramaYQ.readByte() & 0xFF;
      this.cax = new bul[i];
      for (j = 0; j < i; j++) {
        int k = paramaYQ.readInt();
        m = paramaYQ.readInt();
        this.cax[j] = new bul(k, m);
      }
    }
    Object localObject;
    if (Xq()) {
      i = paramaYQ.readByte() & 0xFF;
      this.cay = new aWk[i];
      for (j = 0; j < i; j++) {
        localObject = paramaYQ.readString();
        m = paramaYQ.readInt();
        this.cay[j] = new aWk((String)localObject, m);
      }
    }

    if (isExtended()) {
      this.caz = new cNi(paramaYQ);
    }

    int i = paramaYQ.readShort() & 0xFFFF;
    this.cav = new vp[i];
    this.caw.ensureCapacity(i);
    for (int j = 0; j < this.cav.length; j++) {
      localObject = new vp();
      this.cav[j] = localObject;
      ((vp)localObject).d(paramaYQ);
      this.caw.put(((vp)localObject).m_name, localObject);
    }
  }

  public void b(dSw paramdSw)
  {
    paramdSw.writeByte(this.car);
    if (Xl()) {
      paramdSw.writeFloat(this.cas);
    }
    if (Xn())
      paramdSw.writeFloat(this.cat);
    int i;
    if (Xm()) {
      paramdSw.writeShort((short)this.cau.length);
      for (i = 0; i < this.cau.length; i++)
        paramdSw.writeString(this.cau[i]);
    }
    Object localObject;
    if (Xo()) {
      paramdSw.writeByte((byte)this.cax.length);
      for (i = 0; i < this.cax.length; i++) {
        localObject = this.cax[i];
        paramdSw.writeInt(((bul)localObject).fbr);
        paramdSw.writeInt(((bul)localObject).gdJ);
      }
    }
    if (Xq()) {
      paramdSw.writeByte((byte)this.cay.length);
      for (i = 0; i < this.cay.length; i++) {
        localObject = this.cay[i];
        paramdSw.writeString(((aWk)localObject).fbq);
        paramdSw.writeInt(((aWk)localObject).fbr);
      }
    }
    if (isExtended()) {
      this.caz.b(paramdSw);
    }

    if (this.cav == null) {
      paramdSw.writeShort((short)0);
    } else {
      paramdSw.writeShort((short)this.cav.length);
      for (i = 0; i < this.cav.length; i++)
        this.cav[i].b(paramdSw);
    }
  }

  public float[] gK()
  {
    return this.caz == null ? cNi.ksr : this.caz.gK();
  }

  public int cK(String paramString) {
    if (this.caz == null)
      return -1;
    return this.caz.nN(paramString);
  }

  public vp cL(String paramString) {
    return (vp)this.caw.get(paramString);
  }

  public String fP(int paramInt) {
    return this.cau[paramInt];
  }

  public vp[] gT() {
    return this.cav;
  }

  public String[] getFileNames() {
    return this.cau;
  }

  public bul[] Xk() {
    return this.cax;
  }

  public float getScale() {
    return this.cas;
  }

  public float jdMethod_if() {
    return this.cat;
  }

  private boolean Xl() {
    return (this.car & 0x1) != 0;
  }

  private boolean Xm() {
    return (this.car & 0x2) != 0;
  }

  public boolean Xn() {
    return (this.car & 0x8) != 0;
  }

  public boolean Xo() {
    return (this.car & 0x4) != 0;
  }

  public boolean Xp() {
    return (this.car & 0x10) == 0;
  }

  public boolean gJ() {
    return (this.car & 0x20) == 32;
  }

  public boolean Xq() {
    return (this.car & 0x40) != 0;
  }

  private boolean isExtended() {
    return (this.car & 0x80) != 0;
  }

  public void clear()
  {
    this.car = 0;
    this.cas = 1.0F;
    this.cat = 1.0F;
    this.cau = null;
    this.cav = null;
    this.caw.clear();
    this.cax = null;
    this.cay = null;
    this.caz = null;
  }

  public void l(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
      return;
    }
    this.car = ((byte)(this.car | 0x2));
    this.cau = ((String[])paramArrayList.toArray(new String[paramArrayList.size()]));
  }

  public void m(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
      return;
    }
    this.car = ((byte)(this.car | 0x4));
    this.cax = new bul[paramArrayList.size()];
    paramArrayList.toArray(this.cax);
  }

  public void n(ArrayList paramArrayList) {
    if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
      return;
    }
    this.car = ((byte)(this.car | 0x40));
    this.cay = new aWk[paramArrayList.size()];
    paramArrayList.toArray(this.cay);
  }

  public void setScale(float paramFloat)
  {
    if (paramFloat != 1.0F) {
      this.car = ((byte)(this.car | 0x1));
      this.cas = paramFloat;
    }
  }

  public void R(float paramFloat) {
    if (paramFloat != 1.0F) {
      this.car = ((byte)(this.car | 0x8));
      this.cat = paramFloat;
    }
  }

  public void aX(boolean paramBoolean) {
    if (paramBoolean)
      this.car = ((byte)(this.car | 0x10));
    else
      this.car = ((byte)(this.car & 0xFFFFFFEF));
  }

  public void a(vp[] paramArrayOfvp)
  {
    this.cav = paramArrayOfvp;
  }

  public void Xr() {
    this.car = ((byte)(this.car | 0x20));
  }

  public aWk[] Xs() {
    return this.cay;
  }

  public void a(bEw parambEw) {
    if (parambEw.isEmpty())
      return;
    this.car = ((byte)(this.car | 0x80));
    this.caz = new cNi();
    this.caz.a(parambEw);
  }

  public void h(float[] paramArrayOfFloat) {
    if (paramArrayOfFloat == null)
      return;
    this.car = ((byte)(this.car | 0x80));
    this.caz = new cNi();
    this.caz.h(paramArrayOfFloat);
  }
}