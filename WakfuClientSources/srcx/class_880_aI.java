public class aI
{
  private byte[][] ig;
  private byte[] ih;

  public void init()
  {
    this.ig = ((byte[][])null);
    this.ih = null;
  }

  private static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    int i = 0;

    while (i < paramInt) {
      int j = paramArrayOfByte1[i];
      int k = paramArrayOfByte2[i];
      if ((90 >= j) && (j >= 65))
        j = (byte)(j - 65 + 97);
      if ((90 >= k) && (k >= 65))
        k = (byte)(k - 65 + 97);
      if (j != k) {
        return false;
      }
      i++;
    }
    return true;
  }

  public String q(String paramString) {
    return b(paramString, 0);
  }

  String b(String paramString, int paramInt) {
    int i = a(paramString.getBytes(), paramInt);
    if (i == -1)
      return null;
    byte[] arrayOfByte = this.ig[i];
    for (int j = 0; j < arrayOfByte.length; j++) {
      if (arrayOfByte[j] == 61) {
        return new String(arrayOfByte, j + 1, arrayOfByte.length - (j + 1));
      }
    }
    return null;
  }

  private int a(byte[] paramArrayOfByte, int paramInt) {
    if (this.ig == null) {
      return -1;
    }
    int i = 0;
    int j = 0;
    int k = paramArrayOfByte.length + 1;
    byte[] arrayOfByte = new byte[k];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    arrayOfByte[paramArrayOfByte.length] = 61;

    for (i = 0; i < this.ig.length; i++) {
      if (a(this.ig[i], arrayOfByte, k)) {
        if (paramInt == j)
        {
          return i;
        }
        j++;
      }
    }

    return -1;
  }

  int a(cf paramcf) {
    int i = paramcf.read(32);
    if (i < 0) {
      clear();
      return -1;
    }
    this.ih = new byte[i];
    paramcf.b(this.ih, i);
    int j = paramcf.read(32);
    if (j < 0) {
      clear();
      return -1;
    }
    if (j == 0) {
      this.ig = ((byte[][])null);
    } else {
      this.ig = new byte[j][];

      for (int k = 0; k < j; k++) {
        int m = paramcf.read(32);
        if (m < 0) {
          clear();
          return -1;
        }
        this.ig[k] = new byte[m];
        paramcf.b(this.ig[k], m);
      }
    }
    if (paramcf.read(1) != 1) {
      clear();
      return -1;
    }

    return 0;
  }

  void clear() {
    this.ig = ((byte[][])null);
    this.ih = null;
  }

  public boolean bR() {
    return this.ih != null;
  }

  public String toString() {
    String str = "Vendor: " + new String(this.ih, 0, this.ih.length);
    for (int i = 0; i < this.ig.length; i++) {
      str = str + "\nComment: " + new String(this.ig[i], 0, this.ig[i].length);
    }

    str = str + '\n';
    return str;
  }
}