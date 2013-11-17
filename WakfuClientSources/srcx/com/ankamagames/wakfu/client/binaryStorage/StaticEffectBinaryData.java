package com.ankamagames.wakfu.client.binaryStorage;

import PY;
import aKp;
import bUT;
import drN;

public class StaticEffectBinaryData
  implements drN
{
  protected int baA;
  protected int aRQ;
  protected int baB;
  protected short baC;
  protected int[] baD;
  protected int baE;
  protected short baF;
  protected int[] baG;
  protected short baH;
  protected int[] baI;
  protected int[] baJ;
  protected int[] baK;
  protected int[] baL;
  protected int[] baM;
  protected int[] baN;
  protected int[] baO;
  protected String baP;
  protected long[] baQ;
  protected boolean baR;
  protected int baS;
  protected float baT;
  protected boolean aOE;
  protected boolean aOD;
  protected int baU;
  protected float baV;
  protected float[] baW;
  protected float baX;
  protected float baY;
  protected byte baZ;
  protected byte bba;
  protected byte bbb;
  protected boolean bbc;
  protected short bbd;
  protected float bbe;
  protected byte bbf;
  protected boolean bbg;
  protected String bbh;
  protected int bbi;
  protected int bbj;
  protected String bbk;
  protected String bbl;
  protected String bbm;
  protected boolean bbn;
  protected boolean bbo;
  protected boolean bbp;
  protected boolean bbq;
  protected boolean bbr;
  protected boolean bbs;
  protected int bbt;
  protected boolean bbu;
  protected int[] bbv;
  protected boolean bbw;
  protected boolean bbx;
  protected boolean bby;
  protected boolean bbz;
  protected boolean bbA;

  public boolean yL()
  {
    return false;
  }

  public boolean yM()
  {
    return false;
  }

  public boolean yN()
  {
    return false;
  }

  public boolean yO()
  {
    String str1 = zF().trim();
    boolean bool1 = zz();

    boolean bool2 = yP();
    if (bool2) {
      return false;
    }
    if (str1.startsWith("ITEM")) {
      return (bool1) && (yQ());
    }
    String str2 = zE().trim();
    return ((str2.startsWith("SPELL")) && (bool1)) || (str2.startsWith("GROUP")) || (str2.startsWith("BOMB")) || (str2.startsWith("AREA")) || (str2.startsWith("IEP_DESTRUCTIBLE")) || ((str2.startsWith("STATE")) && (bool1)) || ((str2.startsWith("TIMELINE")) && (bool1));
  }

  public boolean yP()
  {
    if (this.bbv == null)
      return false;
    for (int i = 0; i < this.bbv.length; i++) {
      int j = this.bbv[i];
      PY localPY = PY.gm(j);
      if (localPY == PY.coP)
        return true;
    }
    return false;
  }

  public boolean yQ()
  {
    String str1 = zF().trim();

    boolean bool1 = yP();
    if (bool1) {
      return false;
    }
    if (str1.startsWith("ITEM")) {
      return str1.endsWith("_USE");
    }
    boolean bool2 = zz();
    String str2 = zE().trim();
    return (!str2.startsWith("SET")) && ((!str2.startsWith("SPELL")) || (bool2)) && (!str2.startsWith("PROTECTOR")) && (!str2.startsWith("BUILDING")) && (!str2.startsWith("APTITUDE"));
  }

  public int yR()
  {
    return this.baA;
  }

  public int eo() {
    return this.aRQ;
  }

  public int yS() {
    return this.baB;
  }

  public short yT() {
    return this.baC;
  }

  public int[] yU() {
    return this.baD;
  }

  public int yV() {
    return this.baE;
  }

  public short yW() {
    return this.baF;
  }

  public int[] yX() {
    return this.baG;
  }

  public short yY() {
    return this.baH;
  }

  public int[] yZ() {
    return this.baI;
  }

  public int[] za() {
    return this.baJ;
  }

  public int[] zb() {
    return this.baK;
  }

  public int[] zc() {
    return this.baL;
  }

  public int[] zd() {
    return this.baM;
  }

  public int[] ze() {
    return this.baN;
  }

  public int[] zf() {
    return this.baO;
  }

  public String zg() {
    return this.baP;
  }

  public long[] zh() {
    return this.baQ;
  }

  public boolean zi() {
    return this.baR;
  }

  public int zj() {
    return this.baS;
  }

  public float zk() {
    return this.baT;
  }

  public boolean zl() {
    return this.aOE;
  }

  public boolean zm() {
    return this.aOD;
  }

  public int zn() {
    return this.baU;
  }

  public float zo() {
    return this.baV;
  }

  public float[] zp() {
    return this.baW;
  }

  public float zq() {
    return this.baX;
  }

  public float zr() {
    return this.baY;
  }

  public byte zs() {
    return this.baZ;
  }

  public byte zt() {
    return this.bba;
  }

  public byte zu() {
    return this.bbb;
  }

  public boolean zv() {
    return this.bbc;
  }

  public short zw() {
    return this.bbd;
  }

  public float zx() {
    return this.bbe;
  }

  public byte zy() {
    return this.bbf;
  }

  public boolean zz() {
    return this.bbg;
  }

  public String zA() {
    return this.bbh;
  }

  public int zB() {
    return this.bbi;
  }

  public int zC() {
    return this.bbj;
  }

  public String zD() {
    return this.bbk;
  }

  public String zE() {
    return this.bbl;
  }

  public String zF() {
    return this.bbm;
  }

  public boolean zG() {
    return this.bbn;
  }

  public boolean zH() {
    return this.bbo;
  }

  public boolean zI() {
    return this.bbp;
  }

  public boolean zJ() {
    return this.bbq;
  }

  public boolean zK() {
    return this.bbr;
  }

  public boolean zL() {
    return this.bbs;
  }

  public int zM() {
    return this.bbt;
  }

  public boolean zN() {
    return this.bbu;
  }

  public int[] zO() {
    return this.bbv;
  }

  public boolean zP() {
    return this.bbw;
  }

  public boolean zQ() {
    return this.bbx;
  }

  public boolean zR() {
    return this.bby;
  }

  public boolean zS() {
    return this.bbz;
  }

  public boolean zT() {
    return this.bbA;
  }

  public void reset() {
    this.baA = 0;
    this.aRQ = 0;
    this.baB = 0;
    this.baC = 0;
    this.baD = null;
    this.baE = 0;
    this.baF = 0;
    this.baG = null;
    this.baH = 0;
    this.baI = null;
    this.baJ = null;
    this.baK = null;
    this.baL = null;
    this.baM = null;
    this.baN = null;
    this.baO = null;
    this.baP = null;
    this.baQ = null;
    this.baR = false;
    this.baS = 0;
    this.baT = 0.0F;
    this.aOE = false;
    this.aOD = false;
    this.baU = 0;
    this.baV = 0.0F;
    this.baW = null;
    this.baX = 0.0F;
    this.baY = 0.0F;
    this.baZ = 0;
    this.bba = 0;
    this.bbb = 0;
    this.bbc = false;
    this.bbd = 0;
    this.bbe = 0.0F;
    this.bbf = 0;
    this.bbg = false;
    this.bbh = null;
    this.bbi = 0;
    this.bbj = 0;
    this.bbk = null;
    this.bbl = null;
    this.bbm = null;
    this.bbn = false;
    this.bbo = false;
    this.bbp = false;
    this.bbq = false;
    this.bbr = false;
    this.bbs = false;
    this.bbt = 0;
    this.bbu = false;
    this.bbv = null;
    this.bbw = false;
    this.bbx = false;
    this.bby = false;
    this.bbz = false;
    this.bbA = false;
  }

  public void a(bUT parambUT) {
    this.baA = parambUT.getInt();
    this.aRQ = parambUT.getInt();
    this.baB = parambUT.getInt();
    this.baC = parambUT.getShort();
    this.baD = parambUT.caR();

    this.baE = parambUT.getInt();
    this.baF = parambUT.getShort();
    this.baG = parambUT.caR();

    this.baH = parambUT.getShort();
    this.baI = parambUT.caR();

    this.baJ = parambUT.caR();

    this.baK = parambUT.caR();

    this.baL = parambUT.caR();

    this.baM = parambUT.caR();

    this.baN = parambUT.caR();

    this.baO = parambUT.caR();

    this.baP = parambUT.caP();
    this.baQ = parambUT.caV();

    this.baR = parambUT.readBoolean();
    this.baS = parambUT.getInt();
    this.baT = parambUT.getFloat();
    this.aOE = parambUT.readBoolean();
    this.aOD = parambUT.readBoolean();
    this.baU = parambUT.getInt();
    this.baV = parambUT.getFloat();
    this.baW = parambUT.caT();

    this.baX = parambUT.getFloat();
    this.baY = parambUT.getFloat();
    this.baZ = parambUT.get();
    this.bba = parambUT.get();
    this.bbb = parambUT.get();
    this.bbc = parambUT.readBoolean();
    this.bbd = parambUT.getShort();
    this.bbe = parambUT.getFloat();
    this.bbf = parambUT.get();
    this.bbg = parambUT.readBoolean();
    this.bbh = parambUT.caP();
    this.bbi = parambUT.getInt();
    this.bbj = parambUT.getInt();
    this.bbk = parambUT.caP();
    this.bbl = parambUT.caP();
    this.bbm = parambUT.caP();
    this.bbn = parambUT.readBoolean();
    this.bbo = parambUT.readBoolean();
    this.bbp = parambUT.readBoolean();
    this.bbq = parambUT.readBoolean();
    this.bbr = parambUT.readBoolean();
    this.bbs = parambUT.readBoolean();
    this.bbt = parambUT.getInt();
    this.bbu = parambUT.readBoolean();
    this.bbv = parambUT.caR();

    this.bbw = parambUT.readBoolean();
    this.bbx = parambUT.readBoolean();
    this.bby = parambUT.readBoolean();
    this.bbz = parambUT.readBoolean();
    this.bbA = parambUT.readBoolean();
  }

  public final int gE() {
    return aKp.emd.getId();
  }
}