import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import org.apache.log4j.Logger;

public final class bsn
{
  protected static final Logger K = Logger.getLogger(bsn.class);
  public static final byte fZf = 1;
  private boolean fZg = false;
  private byte[] bFC;
  private int ia;
  private int ib;

  public bsn(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this.ia = paramInt1;
    this.ib = paramInt2;
    this.bFC = paramArrayOfByte;
  }

  public bsn(BufferedImage paramBufferedImage, boolean paramBoolean)
  {
    b(paramBufferedImage, paramBoolean);
  }

  public bsn(aYQ paramaYQ)
  {
    g(paramaYQ);
  }

  public BufferedImage bAw()
  {
    return atf.a(this.ia, this.ib, this.bFC, dbx.kTw);
  }

  private void b(BufferedImage paramBufferedImage, boolean paramBoolean)
  {
    if (paramBufferedImage != null) {
      this.ia = paramBufferedImage.getWidth();
      this.ib = paramBufferedImage.getHeight();

      if (paramBoolean) {
        if (paramBufferedImage.getType() != 3) {
          paramBufferedImage = atf.e(paramBufferedImage);
        }
        else if (paramBufferedImage.getType() != 2) {
          paramBufferedImage = atf.d(paramBufferedImage);
        }

      }
      else if (paramBufferedImage.getType() != 2) {
        paramBufferedImage = atf.d(paramBufferedImage);
      }

      this.fZg = paramBufferedImage.isAlphaPremultiplied();

      DataBufferInt localDataBufferInt = (DataBufferInt)paramBufferedImage.getData().getDataBuffer();

      this.bFC = new byte[this.ia * this.ib * 4];

      for (int i = 0; i < localDataBufferInt.getSize(); i++) {
        int j = 4 * i;
        int k = localDataBufferInt.getElem(i);
        this.bFC[j] = ((byte)(k >> 16 & 0xFF));
        this.bFC[(j + 1)] = ((byte)(k >> 8 & 0xFF));
        this.bFC[(j + 2)] = ((byte)(k & 0xFF));
        this.bFC[(j + 3)] = ((byte)(k >> 24 & 0xFF));
      }
    }
    else {
      this.ia = 0;
      this.ib = 0;
      this.bFC = null;
    }
  }

  public byte[] getData()
  {
    return this.bFC;
  }

  public int getHeight()
  {
    return this.ib;
  }

  public int getWidth()
  {
    return this.ia;
  }

  public String toString()
  {
    return "AlphaBitmapData (" + this.ia + "x" + this.ib + ") @" + Integer.toHexString(super.hashCode());
  }

  public void a(dSw paramdSw)
  {
    paramdSw.eP((short)1);
    paramdSw.lu(this.fZg);

    paramdSw.DS(this.ia);
    paramdSw.DS(this.ib);

    if (this.bFC != null) {
      paramdSw.kY(this.bFC.length);
      paramdSw.writeBytes(this.bFC);
    } else {
      paramdSw.kY(0L);
    }
  }

  public void g(aYQ paramaYQ)
  {
    int i = paramaYQ.bnS();

    if (i != 1) {
      K.error("Exception", new Exception("Version incorrecte:" + i + " courante:" + 1));
    }

    this.fZg = paramaYQ.bnT();
    this.ia = paramaYQ.readUnsignedShort();
    this.ib = paramaYQ.readUnsignedShort();
    int j = (int)paramaYQ.readUnsignedInt();
    if (j > 0)
      this.bFC = paramaYQ.ot(j);
  }

  public void bAx()
  {
    if ((this.bFC != null) && (!this.fZg)) {
      this.fZg = true;
      for (int i = 0; i < this.bFC.length; i += 4) {
        int j = this.bFC[(i + 3)];

        this.bFC[i] = ((byte)(this.bFC[i] * j / 255));
        this.bFC[(i + 1)] = ((byte)(this.bFC[(i + 1)] * j / 255));
        this.bFC[(i + 2)] = ((byte)(this.bFC[(i + 2)] * j / 255));
      }
    }
  }

  public void bAy() {
    if ((this.bFC != null) && (this.fZg)) {
      this.fZg = false;
      for (int i = 0; i < this.bFC.length; i += 4) {
        int j = this.bFC[(i + 3)];
        if (j != 0) {
          this.bFC[i] = ((byte)(this.bFC[i] * 255 / j));
          this.bFC[(i + 1)] = ((byte)(this.bFC[(i + 1)] * 255 / j));
          this.bFC[(i + 2)] = ((byte)(this.bFC[(i + 2)] * 255 / j));
        } else {
          this.bFC[i] = -1;
          this.bFC[(i + 1)] = -1;
          this.bFC[(i + 2)] = -1;
        }
      }
    }
  }

  public boolean isAlphaPremultiplied()
  {
    return this.fZg;
  }

  public float cv(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= this.ia) || (paramInt2 >= this.ib) || (this.bFC == null)) {
      return 0.0F;
    }
    int i = this.bFC[(4 * (paramInt1 + paramInt2 * this.ia) + 3)];
    return i / 255.0F;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof bsn)) {
      bsn localbsn = (bsn)paramObject;
      if ((getWidth() != localbsn.getWidth()) || (getHeight() != localbsn.getHeight())) {
        return false;
      }
      byte[] arrayOfByte1 = getData();
      byte[] arrayOfByte2 = localbsn.getData();

      for (int i = 0; i < arrayOfByte1.length; i++) {
        if (arrayOfByte1[i] != arrayOfByte2[i]) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  public int hashCode()
  {
    if (!bB) throw new AssertionError("Pas d'insertion possible en tant que clef dans une HashMap/HashTable");
    return super.hashCode();
  }
}