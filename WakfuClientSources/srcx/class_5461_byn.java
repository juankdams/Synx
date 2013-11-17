import java.util.ArrayList;
import org.apache.log4j.Logger;

public class byn
{
  public uz gjS;
  public uz gjT;
  public static final float gjU = 0.004F;
  private static final boolean gjV = false;
  private static byn gjW = new byn();
  private boolean fuh;
  private bwZ gjX;
  private String gjY;
  protected static final Logger K = Logger.getLogger(byn.class);

  public static byn bFr() {
    return gjW;
  }

  public static boolean S(float paramFloat1, float paramFloat2) {
    return bCO.u(paramFloat1, paramFloat2, 0.004F);
  }

  public void e(bwZ parambwZ) {
    this.gjX = parambwZ;
    z(parambwZ.bEx().b("engine"));
  }

  public void jm(String paramString)
  {
    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();
    try
    {
      localbpA.iy(paramString);
      localbpA.a(localbwZ, new cdJ[0]);
      localbpA.close();
    } catch (Exception localException) {
      K.error("Exception", localException);
    }

    e(localbwZ);
  }

  public void jn(String paramString) {
    if ((!bB) && (this.gjX == null)) throw new AssertionError("You must call initializePools before");

    K localK = this.gjX.bEx().b("engine");
    d(localK, paramString);

    tq localtq = tq.Bg();
    ayc localayc = dHL.lSB.dhZ();
    this.gjY = paramString;
    this.gjS = localtq.a(localayc, -1296775008915292159L, paramString + "textures/maskAlpha.tga", false);
    this.gjS.gQ();

    this.gjT = localtq.a(localayc, -1296775008915292158L, paramString + "textures/perturb.tga", false);
    this.gjT.gQ();

    this.fuh = true;
  }

  public final boolean bFs() {
    return this.fuh;
  }

  public final String bFt() {
    return this.gjY;
  }

  private byn()
  {
    this.fuh = false;
  }

  private void z(K paramK) {
    if ((!bB) && (paramK == null)) throw new AssertionError("Unable to find engine node");

    K localK = paramK.b("pools");
    if ((!bB) && (localK == null)) throw new AssertionError("Unable to find pools node");

    ArrayList localArrayList = new ArrayList(64);

    a(localK, localArrayList);
    b(localK, localArrayList);
    c(localK, localArrayList);

    cJX.cDN().aa(localArrayList);
  }

  private void a(K paramK, ArrayList paramArrayList) {
    if ((!bB) && (paramK == null)) throw new AssertionError("Unable to find pools node");

    K localK1 = paramK.b("texture_pools");
    if ((!bB) && (localK1 == null)) throw new AssertionError("Unable to find texture_pools node");

    ArrayList localArrayList = localK1.c("texture");
    if ((!bB) && (localArrayList == null)) throw new AssertionError("Unable to find texture nodes");

    for (K localK2 : localArrayList) {
      K localK3 = localK2.e("width");
      if ((!bB) && (localK3 == null)) throw new AssertionError("Unable to find width parameter and it's not optionnal");

      K localK4 = localK2.e("height");
      if ((!bB) && (localK4 == null)) throw new AssertionError("Unable to find height parameter and it's not optionnal");

      K localK5 = localK2.e("bpp");
      if ((!bB) && (localK5 == null)) throw new AssertionError("Unable to find bpp parameter and it's not optionnal");
      if ((!bB) && (!ru(localK5.getIntValue()))) throw new AssertionError("Texture with a bit per pixel of " + localK5.getIntValue() + " is not supported");

      K localK6 = localK2.e("count");
      if ((!bB) && (localK6 == null)) throw new AssertionError("Unable to find count parameter and it's not optionnal");

      int i = 1;

      K localK7 = localK2.e("compression");
      if (localK7 != null) {
        bIN localbIN = new bIN(localK7.getStringValue());
        if ((!bB) && (!a(localbIN))) throw new AssertionError("Compression mode " + localbIN.toString() + " is not supported");
        i = a(localbIN, localK5.getIntValue());
      }

      int j = (int)(localK3.getIntValue() * localK4.getIntValue() * localK5.getIntValue() / (8.0F * i));

      tw localtw = new tw();
      localtw.a(ayA.dOJ);
      localtw.cT(1);
      localtw.setBufferSize(j);
      paramArrayList.add(localtw);
    }
  }

  private void b(K paramK, ArrayList paramArrayList)
  {
    if ((!bB) && (paramK == null)) throw new AssertionError("Unable to find pools node");

    K localK1 = paramK.b("vertex_buffer_pools");
    if ((!bB) && (localK1 == null)) throw new AssertionError("Unable to find vertex_buffer_pools node");

    ArrayList localArrayList = localK1.c("vertex_buffer");
    if ((!bB) && (localArrayList == null)) throw new AssertionError("Unable to find vertex_buffer nodes");

    for (K localK2 : localArrayList) {
      K localK3 = localK2.e("vertex_size");
      if ((!bB) && (localK3 == null)) throw new AssertionError("Unable to find vertex_size parameter and it's not optionnal");

      if ((!bB) && (localK3.getIntValue() != 32)) throw new AssertionError("Vertex size should be equal to (color + position + texcoord)*4");

      K localK4 = localK2.e("num_vertices");
      if ((!bB) && (localK4 == null)) throw new AssertionError("Unable to find num_vertices parameter and it's not optionnal");

      K localK5 = localK2.e("count");
      if ((!bB) && (localK5 == null)) throw new AssertionError("Unable to find count parameter and it's not optionnal");

      int i = 2 * localK4.getIntValue() * 4;
      int j = 4 * localK4.getIntValue() * 4;
      int k = 2 * localK4.getIntValue() * 4;

      tw localtw = new tw();
      localtw.a(ayA.dOL);
      localtw.cT(localK5.getIntValue());
      localtw.setBufferSize(k);
      a(paramArrayList, localtw);

      localtw = new tw();
      localtw.a(ayA.dOL);
      localtw.cT(localK5.getIntValue());
      localtw.setBufferSize(i);
      a(paramArrayList, localtw);

      localtw = new tw();
      localtw.a(ayA.dOL);
      localtw.cT(localK5.getIntValue());
      localtw.setBufferSize(j);
      a(paramArrayList, localtw);
    }
  }

  private static void a(ArrayList paramArrayList, tw paramtw) {
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      tw localtw = (tw)paramArrayList.get(j);
      if ((localtw.BG() == paramtw.BG()) && (localtw.getBufferSize() == paramtw.getBufferSize())) {
        localtw.cT(localtw.BF() + paramtw.BF());
        return;
      }
    }

    paramArrayList.add(paramtw);
  }

  private static void c(K paramK, ArrayList paramArrayList) {
    if ((!bB) && (paramK == null)) throw new AssertionError("Unable to find pools node");

    K localK1 = paramK.b("index_buffer_pools");
    if ((!bB) && (localK1 == null)) throw new AssertionError("Unable to find index_buffer_pools node");

    ArrayList localArrayList = localK1.c("index_buffer");
    if ((!bB) && (localArrayList == null)) throw new AssertionError("Unable to find index_buffer nodes");

    for (K localK2 : localArrayList) {
      K localK3 = localK2.e("size");
      if ((!bB) && (localK3 == null)) throw new AssertionError("Unable to find size parameter and it's not optionnal");

      K localK4 = localK2.e("count");
      if ((!bB) && (localK4 == null)) throw new AssertionError("Unable to find count parameter and it's not optionnal");

      tw localtw = new tw();
      localtw.a(ayA.dOK);
      localtw.cT(localK4.getIntValue());
      localtw.setBufferSize(localK3.getIntValue());
      paramArrayList.add(localtw);
    }
  }

  private static void d(K paramK, String paramString) {
    if ((!bB) && (paramK == null)) throw new AssertionError("Unable to find engine node");

    K localK1 = paramK.b("effects");
    if ((!bB) && (localK1 == null)) throw new AssertionError("Unable to find shaders node");

    ArrayList localArrayList = localK1.c("effect");
    if ((!bB) && (localArrayList == null)) throw new AssertionError("Unable to find effect nodes");

    for (K localK2 : localArrayList) {
      K localK3 = localK2.e("name");
      if ((!bB) && (localK3 == null)) throw new AssertionError("Unable to find name parameter and it's not optionnal");

      K localK4 = localK2.e("file");
      if ((!bB) && (localK4 == null)) throw new AssertionError("Unable to find file parameter and it's not optionnal");

      K localK5 = localK2.e("class");
      String str1 = localK5 == null ? null : localK5.getStringValue();

      String str2 = paramString + localK4.getStringValue();
      Pb.aaU().c(localK3.getStringValue(), str2, str1);
    }
  }

  private static boolean ru(int paramInt) {
    switch (paramInt) {
    case 24:
    case 32:
      return true;
    case 4:
    case 8:
    case 16:
    }
    return false;
  }

  private static boolean a(bIN parambIN)
  {
    int i = parambIN.getID();
    if (i == bIN.jQ("DXT1")) {
      return true;
    }
    if (i == bIN.jQ("DXT2")) {
      return true;
    }
    if (i == bIN.jQ("DXT3")) {
      return true;
    }
    if (i == bIN.jQ("DXT4")) {
      return true;
    }
    if (i == bIN.jQ("DXT5")) {
      return true;
    }
    return false;
  }

  private int a(bIN parambIN, int paramInt) {
    if ((!bB) && (!a(parambIN))) throw new AssertionError("Compression mode " + parambIN.toString() + " is not supported");
    if ((!bB) && (paramInt != 32) && (paramInt != 24)) throw new AssertionError("Compressed texture with a bit per pixel of " + paramInt + " is not supported");

    int i = parambIN.getID();
    if (i == bIN.jQ("DXT1")) {
      return paramInt / 4;
    }
    return paramInt / 8;
  }

  public static int jo(String paramString) {
    return paramString.hashCode();
  }

  public static int jp(String paramString) {
    return paramString.hashCode();
  }

  public static int jq(String paramString) {
    return paramString.hashCode();
  }

  public static int[] t(String[] paramArrayOfString) {
    int i = paramArrayOfString.length;
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = jq(paramArrayOfString[j]);
    }
    return arrayOfInt;
  }
}