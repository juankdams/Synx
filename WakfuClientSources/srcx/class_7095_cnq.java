import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class cnq extends gR
{
  private static final short hTQ = 1;
  private int aw;
  private byte bkM;
  private byte hTR;
  private boolean hTS;
  private boolean hTT;
  private boolean hTU;
  private short hTV;
  private dxL hTW;
  private short hTX;
  private short hTY;
  private String hTZ;
  private String hUa;
  private String[] hUb;
  private String cGh;
  private final ArrayList hUc = new ArrayList(2);

  private final ArrayList cLh = new ArrayList(2);

  public cnq() {
    super((short)1);
  }

  public void a(cVX paramcVX) {
    this.hUc.add(paramcVX);
  }

  public void a(XE paramXE) {
    this.cLh.add(paramXE);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt, short paramShort)
  {
    aL(paramInt);

    if (paramShort == 1)
    {
      this.aw = paramByteBuffer.getInt();
      this.bkM = paramByteBuffer.get();
      this.hTR = paramByteBuffer.get();

      this.hTS = (paramByteBuffer.get() == 1);
      this.hTT = (paramByteBuffer.get() == 1);
      this.hTU = (paramByteBuffer.get() == 1);

      this.hTV = paramByteBuffer.getShort();
      this.hTX = paramByteBuffer.getShort();
      this.hTY = paramByteBuffer.getShort();

      long l = paramByteBuffer.getLong();
      if (l != 0L)
        this.hTW = cYq.jq(l);
      else {
        this.hTW = null;
      }
      try
      {
        byte[] arrayOfByte1 = new byte[paramByteBuffer.getInt()];
        paramByteBuffer.get(arrayOfByte1);
        this.cGh = new String(arrayOfByte1, "UTF-8").intern();
      } catch (UnsupportedEncodingException localUnsupportedEncodingException1) {
        K.error("Exception", localUnsupportedEncodingException1);
      }
      byte[] arrayOfByte4;
      try {
        int i = paramByteBuffer.getInt();
        this.hUb = new String[i];
        for (int k = 0; k < i; k++) {
          arrayOfByte4 = new byte[paramByteBuffer.getInt()];
          paramByteBuffer.get(arrayOfByte4);

          this.hUb[k] = new String(arrayOfByte4, "UTF-8").intern();
        }
      } catch (UnsupportedEncodingException localUnsupportedEncodingException2) {
        K.error("Exception", localUnsupportedEncodingException2);
      }
      try
      {
        byte[] arrayOfByte2 = new byte[paramByteBuffer.getInt()];
        paramByteBuffer.get(arrayOfByte2);
        this.hTZ = new String(arrayOfByte2, "UTF-8").intern();

        byte[] arrayOfByte3 = new byte[paramByteBuffer.getInt()];
        paramByteBuffer.get(arrayOfByte3);
        this.hUa = new String(arrayOfByte3, "UTF-8").intern();
      } catch (UnsupportedEncodingException localUnsupportedEncodingException3) {
        K.error("Exception", localUnsupportedEncodingException3);
      }

      int j = paramByteBuffer.getInt();
      Object localObject;
      for (int m = 0; m < j; m++) {
        arrayOfByte4 = new byte[paramByteBuffer.getInt()];
        paramByteBuffer.get(arrayOfByte4);
        localObject = new cVX();
        ((cVX)localObject).v(arrayOfByte4);
        this.hUc.add(localObject);
      }

      m = paramByteBuffer.getInt();
      for (int n = 0; n < m; n++) {
        localObject = new byte[paramByteBuffer.getInt()];
        paramByteBuffer.get((byte[])localObject);
        XE localXE = new XE();
        localXE.v((byte[])localObject);
        this.cLh.add(localXE);
      }
    }
    else {
      K.error("Tentative de désérialisation d'un objet avec une version non prise en charge");
    }
  }

  public gR pb()
  {
    return new cnq();
  }

  public cVX cnP() {
    return new cVX();
  }

  public XE cnQ() {
    return new XE();
  }

  public ArrayList cnR() {
    return this.hUc;
  }

  public byte[] pa()
  {
    ArrayList localArrayList1 = new ArrayList(this.hUc.size());
    ArrayList localArrayList2 = new ArrayList(this.cLh.size());

    int i = 0;

    i += 4;
    try {
      for (String str1 : this.hUb)
        i += 4 + str1.getBytes("UTF-8").length;
    }
    catch (Exception localException1) {
      K.error("Exception", localException1);
    }
    try
    {
      i += 8;
      i += (this.hTZ != null ? this.hTZ.getBytes("UTF-8").length : 0);
      i += (this.hUa != null ? this.hUa.getBytes("UTF-8").length : 0);
    } catch (Exception localException2) {
      K.error("Exception", localException2);
    }

    for (Iterator localIterator1 = this.hUc.iterator(); localIterator1.hasNext(); ) { localObject = (cVX)localIterator1.next();
      arrayOfByte2 = ((cVX)localObject).j();
      i += arrayOfByte2.length + 4;
      localArrayList1.add(arrayOfByte2);
    }
    Object localObject;
    byte[] arrayOfByte2;
    for (localIterator1 = this.cLh.iterator(); localIterator1.hasNext(); ) { localObject = (XE)localIterator1.next();
      arrayOfByte2 = ((XE)localObject).j();
      i += arrayOfByte2.length + 4;
      localArrayList2.add(arrayOfByte2);
    }
    try
    {
      i += 4;
      i += (this.cGh != null ? this.cGh.getBytes("UTF-8").length : 0);
    } catch (Exception localException3) {
      K.error("Exception", localException3);
    }

    ByteBuffer localByteBuffer = ByteBuffer.allocate(31 + i);

    localByteBuffer.putInt(this.aw);
    localByteBuffer.put(this.bkM);
    localByteBuffer.put(this.hTR);
    localByteBuffer.put((byte)(this.hTS ? 1 : 0));
    localByteBuffer.put((byte)(this.hTT ? 1 : 0));
    localByteBuffer.put((byte)(this.hTU ? 1 : 0));
    localByteBuffer.putShort(this.hTV);
    localByteBuffer.putShort(this.hTX);
    localByteBuffer.putShort(this.hTY);
    if (this.hTW != null)
      localByteBuffer.putLong(this.hTW.rP());
    else {
      localByteBuffer.putLong(0L);
    }
    try
    {
      if (this.cGh != null)
      {
        localObject = this.cGh.getBytes("UTF-8");
        localByteBuffer.putInt(localObject.length);
        localByteBuffer.put((byte[])localObject);
      } else {
        localByteBuffer.putInt(0);
      }
    } catch (Exception localException4) {
      K.error("Exception", localException4);
    }

    try
    {
      localByteBuffer.putInt(this.hUb.length);
      for (String str2 : this.hUb) {
        byte[] arrayOfByte4 = str2.getBytes("UTF-8");

        localByteBuffer.putInt(arrayOfByte4.length);
        localByteBuffer.put(arrayOfByte4);
      }
    } catch (Exception localException5) {
      K.error("Exception", localException5);
    }
    try
    {
      byte[] arrayOfByte1;
      if (this.hTZ != null)
      {
        arrayOfByte1 = this.hTZ.getBytes("UTF-8");
        localByteBuffer.putInt(arrayOfByte1.length);
        localByteBuffer.put(arrayOfByte1);
      } else {
        localByteBuffer.putInt(0);
      }

      if (this.hUa != null)
      {
        arrayOfByte1 = this.hUa.getBytes("UTF-8");
        localByteBuffer.putInt(arrayOfByte1.length);
        localByteBuffer.put(arrayOfByte1);
      } else {
        localByteBuffer.putInt(0);
      }
    } catch (Exception localException6) {
      K.error("Exception", localException6);
    }

    localByteBuffer.putInt(localArrayList1.size());
    for (Iterator localIterator2 = localArrayList1.iterator(); localIterator2.hasNext(); ) { arrayOfByte3 = (byte[])localIterator2.next();
      localByteBuffer.putInt(arrayOfByte3.length);
      localByteBuffer.put(arrayOfByte3);
    }
    byte[] arrayOfByte3;
    localByteBuffer.putInt(localArrayList2.size());
    for (localIterator2 = localArrayList2.iterator(); localIterator2.hasNext(); ) { arrayOfByte3 = (byte[])localIterator2.next();
      localByteBuffer.putInt(arrayOfByte3.length);
      localByteBuffer.put(arrayOfByte3);
    }

    return localByteBuffer.array();
  }

  public int oZ()
  {
    return aKp.elX.getId();
  }

  public short azI() {
    return this.hTV;
  }

  public dxL cnS() {
    return this.hTW;
  }

  public int getId() {
    return this.aw;
  }

  public ArrayList cfd() {
    return this.cLh;
  }

  public byte getType() {
    return this.bkM;
  }

  public byte cnT() {
    return this.hTR;
  }

  public String[] cnU() {
    return this.hUb;
  }

  public String cnV() {
    return this.hTZ;
  }

  public String cnW() {
    return this.hUa;
  }

  public boolean cnX()
  {
    return this.hTS;
  }

  public boolean cnY() {
    return this.hTT;
  }

  public boolean azC() {
    return this.hTU;
  }

  public void hl(boolean paramBoolean) {
    this.hTS = paramBoolean;
  }

  public void hm(boolean paramBoolean) {
    this.hTT = paramBoolean;
  }

  public void hn(boolean paramBoolean) {
    this.hTU = paramBoolean;
  }

  public void df(short paramShort) {
    this.hTV = paramShort;
  }

  public void dg(short paramShort) {
    this.hTX = paramShort;
  }

  public short cnZ() {
    return this.hTX;
  }

  public short coa() {
    return this.hTY;
  }

  public void dh(short paramShort) {
    this.hTY = paramShort;
  }

  public void c(Date paramDate) {
    this.hTW = (paramDate != null ? cYq.h(paramDate) : null);
  }

  public void d(int paramInt) {
    this.aw = paramInt;
  }

  public void setType(byte paramByte) {
    this.bkM = paramByte;
  }

  public void dN(byte paramByte) {
    this.hTR = paramByte;
  }

  public void y(String[] paramArrayOfString) {
    this.hUb = paramArrayOfString;
  }

  public void lv(String paramString) {
    this.hTZ = paramString;
  }

  public void lw(String paramString) {
    this.hUa = paramString;
  }

  public void dN(String paramString) {
    this.cGh = paramString;
  }

  public String aiV() {
    return this.cGh;
  }
}