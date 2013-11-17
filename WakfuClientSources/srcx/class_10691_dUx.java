import java.nio.ByteBuffer;

public class dUx
{
  public final short az;
  public dsO[] mrM;
  public final short mrN;
  public final int mrO;
  public final bNa mrP = new bNa();
  public final byte mrQ;
  public final boolean mrR;
  public final boolean mrS;
  public final boolean mrT;
  public final boolean mrU;
  public final boolean mrV;
  public final boolean mrW;
  public final boolean mrX;
  public final dOy mrY;
  public final bNa mrZ = new bNa();
  public final bNa msa = new bNa();
  public final short cYh;
  public final boolean msb;
  public final boolean msc;
  public final boolean msd;
  public final cSR cpL = new cSR();
  public final cSR mse = new cSR();

  public void Ed(int paramInt) {
    if (this.mrM != null)
      this.mrM[0] = this.mrM[0].eq((short)paramInt);
    else
      this.mrM = new dsO[] { new dsO((short)paramInt, true, 0.5F, 2.0F, 0.5F) };
  }

  public dUx(short paramShort1, short paramShort2, int paramInt, bNa parambNa1, bNa parambNa2, byte paramByte, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, dsO[] paramArrayOfdsO, boolean paramBoolean6, boolean paramBoolean7, short paramShort3, dOy paramdOy, bNa parambNa3, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10)
  {
    this.az = paramShort1;
    this.mrN = paramShort2;
    this.mrO = paramInt;
    this.mrR = paramBoolean1;
    this.mrP.set(parambNa3.get());
    this.msa.set(parambNa1.get());
    this.mrZ.set(parambNa2.get());
    this.mrM = paramArrayOfdsO;
    this.mrQ = paramByte;
    this.mrS = paramBoolean2;
    this.mrT = paramBoolean3;
    this.mrU = paramBoolean4;
    this.mrV = paramBoolean5;
    this.mrW = paramBoolean6;
    this.mrX = paramBoolean7;
    this.mrY = paramdOy;
    this.cYh = paramShort3;
    this.msc = paramBoolean9;
    this.msb = paramBoolean8;
    this.msd = paramBoolean10;
  }

  private dUx(ByteBuffer paramByteBuffer) {
    this.az = paramByteBuffer.getShort();
    this.mrN = paramByteBuffer.getShort();
    this.mrO = paramByteBuffer.getInt();
    this.msa.set(paramByteBuffer.getInt());
    this.mrZ.set(paramByteBuffer.getInt());
    int i = paramByteBuffer.get();
    if (i == 0) {
      this.mrM = null;
    } else {
      this.mrM = new dsO[i];
      for (j = 0; j < this.mrM.length; j++) {
        this.mrM[j] = new dsO(paramByteBuffer);
      }
    }
    this.mrQ = paramByteBuffer.get();

    this.mrR = (paramByteBuffer.get() != 0);
    this.mrS = (paramByteBuffer.get() != 0);
    this.msd = (paramByteBuffer.get() != 0);
    this.mrT = (paramByteBuffer.get() != 0);
    this.mrU = (paramByteBuffer.get() != 0);
    this.mrV = (paramByteBuffer.get() != 0);
    this.mrW = (paramByteBuffer.get() != 0);
    this.mrX = (paramByteBuffer.get() != 0);
    this.mrY = dOy.fV(paramByteBuffer.get());

    this.mrP.set(paramByteBuffer.getInt());
    this.msc = (paramByteBuffer.get() != 0);
    this.msb = (paramByteBuffer.get() != 0);

    this.cYh = paramByteBuffer.getShort();

    int j = paramByteBuffer.get() & 0xFF;
    for (int k = 0; k < j; k++) {
      bva localbva = new bva();
      localbva.rf(this.az);
      localbva.read(paramByteBuffer);

      if (!bnk.fFX.contains(localbva.getId()))
      {
        this.cpL.put(localbva.getId(), localbva);
        QI.cpK.a(localbva);
      }
    }
    k = paramByteBuffer.get() & 0xFF;
    for (int m = 0; m < k; m++) {
      uA localuA = new uA(paramByteBuffer);
      this.mse.put(localuA.biu, localuA);
    }
  }

  public boolean bMr() {
    return this.mrR;
  }

  public boolean dux() {
    return (this.mrT) || (this.mrU) || (this.mrV);
  }

  public void a(uA paramuA) {
    this.mse.put(paramuA.biu, paramuA);
  }

  public void d(bva parambva) {
    this.cpL.put(parambva.getId(), parambva);
  }

  public final go duy() {
    return go.g(this.mrQ);
  }

  public void b(dSw paramdSw) {
    paramdSw.writeShort(this.az);
    paramdSw.writeShort(this.mrN);
    paramdSw.writeInt(this.mrO);
    paramdSw.writeInt(this.msa.get());
    paramdSw.writeInt(this.mrZ.get());
    if (this.mrM == null) {
      paramdSw.writeByte((byte)0);
    } else {
      paramdSw.writeByte((byte)this.mrM.length);
      for (i = 0; i < this.mrM.length; i++) {
        this.mrM[i].a(paramdSw);
      }
    }
    paramdSw.writeByte(this.mrQ);
    paramdSw.writeByte((byte)(this.mrR ? 1 : 0));
    paramdSw.writeByte((byte)(this.mrS ? 1 : 0));
    paramdSw.writeByte((byte)(this.msd ? 1 : 0));
    paramdSw.writeByte((byte)(this.mrT ? 1 : 0));
    paramdSw.writeByte((byte)(this.mrU ? 1 : 0));
    paramdSw.writeByte((byte)(this.mrV ? 1 : 0));
    paramdSw.writeByte((byte)(this.mrW ? 1 : 0));
    paramdSw.writeByte((byte)(this.mrX ? 1 : 0));
    paramdSw.writeByte(this.mrY.bJ());

    paramdSw.writeInt(this.mrP.get());
    paramdSw.writeByte((byte)(this.msc ? 1 : 0));
    paramdSw.writeByte((byte)(this.msb ? 1 : 0));

    paramdSw.writeShort(this.cYh);

    int i = this.cpL.size();
    if (i >= 255)
      throw new IllegalArgumentException("trop de territoire dans le monde " + this.az);
    paramdSw.writeByte((byte)i);
    dmn localdmn1 = this.cpL.yF();
    for (int j = 0; j < i; j++) {
      localdmn1.fl();
      ((bva)localdmn1.value()).a(paramdSw);
    }

    j = this.mse.size();
    if (j >= 255)
      throw new IllegalArgumentException("trop de territoire dans le monde " + this.az);
    paramdSw.writeByte((byte)j);
    dmn localdmn2 = this.mse.yF();
    for (int k = 0; k < j; k++) {
      localdmn2.fl();
      ((uA)localdmn2.value()).a(paramdSw);
    }
  }

  public bva Ee(int paramInt) {
    return (bva)this.cpL.get(paramInt);
  }

  public uA Ef(int paramInt) {
    return (uA)this.mse.get(paramInt);
  }

  public dmn duz() {
    return this.cpL.yF();
  }

  public int duA() {
    return this.mrM == null ? 0 : this.mrM.length;
  }

  public dsO Eg(int paramInt) {
    return this.mrM[paramInt];
  }
}