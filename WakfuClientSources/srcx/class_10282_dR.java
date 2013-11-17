import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.ankamagames.framework.kernel.core.maths.Matrix44.ObjectFactory;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class dR
{
  private static final Logger K;
  private static final Logger Uy;
  private static final cnQ Uz;
  private static final Material UA;
  private static final float[] UB;
  private static final float[] UC;
  private static final float[] UD;
  private static int UE;
  private static int UF;
  private static int UG;
  private static int UH;
  private static long SO;
  private static uz UI;
  private static final dUU UJ;
  private static final axM[] UK;
  private static final int UL = 1003439990;
  private static final int UM = 1272524161;
  static final int UN = 2048;
  String UO;
  private final Anm UP;
  private final String UQ;
  private final String SK;
  private aux UR = aux.dGK;

  private aux US = null;
  private dcC UT = dcC.kVG;
  private float[][] UU;
  private String UV;
  private biK UW;
  private Anm UX;
  private int Sz = -1;
  private boolean UY;
  private Material UZ;
  private cnQ Va;
  private cnQ Vb;
  private final dQx Vc = new dQx();
  private byte Vd = -1;
  private final dQx Ve = new dQx();
  float Vf;
  float Vg;
  float Vh;
  float Vi;
  private final Matrix44 Vj;
  private final Matrix44 Vk;
  private int Vl;
  private boolean Vm = false;

  private boolean Vn = false;

  private final axM Vo = new axM();
  private byte Vp;
  private byte Vq;
  private GLGeometryMesh Vr;

  public dR(Anm paramAnm, String paramString1, String paramString2)
  {
    if ((!bB) && (paramAnm == null)) throw new AssertionError();
    this.UP = paramAnm;
    this.UP.gQ();
    setScale(paramAnm.SH.getScale());

    this.UQ = paramString1;
    this.SK = paramString2;

    this.UX = null;
    this.UW = null;

    this.UR = aux.dGK;
    this.UT = dcC.kVG;

    this.Va = Uz;
    this.Vb = cnQ.hUY;
    this.UZ = null;

    setScale(1.0F);

    this.Vc.set(2147483647, -2147483648, 2147483647, -2147483648);
    this.Ve.set(0, 0, 0, 0);

    this.Vj = ((Matrix44)Matrix44.bFc.bQy());
    this.Vj.Ls();

    this.Vk = ((Matrix44)Matrix44.bFc.bQy());
    this.Vk.Ls();

    this.UY = false;

    this.Vm = false;
  }

  public dR(dR paramdR) {
    this(paramdR.UP, paramdR.UQ, paramdR.SK);

    if ((!bB) && (!this.UQ.equals(paramdR.UQ))) throw new AssertionError();
    if ((!bB) && (!this.SK.equals(paramdR.SK))) throw new AssertionError();

    if (paramdR.UV != null) {
      setAnimation(paramdR.UV);
    }

    this.UR = paramdR.UR.aGL();
    this.UT = paramdR.UT.bit();

    a(paramdR);

    this.Va = paramdR.Va;
    this.Vb = paramdR.Vb;
    this.UZ = paramdR.UZ;
    if (this.UZ != null) {
      this.UZ.gQ();
    }

    this.Vc.set(paramdR.Vc.drw(), paramdR.Vc.drx(), paramdR.Vc.dry(), paramdR.Vc.drz());
    this.Vj.a(paramdR.Vj);
    this.Vk.a(paramdR.Vk);

    this.Vm = paramdR.Vm;
    this.Vl = paramdR.Vl;

    setScale(paramdR.getScale());
  }

  public Anm hK()
  {
    return this.UP;
  }

  public cnQ hL() {
    return this.Va;
  }

  public cnQ hM() {
    return this.Vb;
  }

  public static uz hN() {
    return UI;
  }

  public void reset() {
    this.UP.axl();

    this.UR.clear();
    this.UR = aux.dGK;
    this.UT.clear();

    if (this.US != null) {
      this.US.clear();
      this.US = null;
    }

    this.UV = null;
    if ((this.UX != null) && (this.UX != this.UP)) {
      this.UX.axl();
      this.UX = null;
      this.Sz = -1;
    }
    this.UW = null;

    this.Va = Uz;
    this.Vb = cnQ.hUY;
    if (this.UZ != null) {
      this.UZ.axl();
      this.UZ = null;
    }

    this.UU = ((float[][])null);

    this.UY = false;

    this.Vl = 0;
    this.Vm = false;

    this.Vj.axl();
    this.Vk.axl();

    setScale(1.0F);

    if (this.Vr != null) {
      this.Vr.axl();
      this.Vr = null;
    }
  }

  public String getPath() {
    return this.SK;
  }

  public void a(Anm paramAnm, int[] paramArrayOfInt)
  {
    if (this.UR == aux.dGK) {
      this.UR = new aux();
    }
    this.UR.a(paramAnm, b(paramArrayOfInt));

    if (paramAnm.Sz > 1) {
      this.Sz = -1;
    }
    hO();
  }

  public void b(Anm paramAnm, int[] paramArrayOfInt) {
    if (this.UR == aux.dGK) {
      return;
    }

    adz localadz = b(paramArrayOfInt);
    this.Vm |= this.UR.b(paramAnm, localadz);
    hO();
  }

  private static adz b(int[] paramArrayOfInt) {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return null;
    }

    return new adz(paramArrayOfInt);
  }

  public void hO() {
    this.UT.cOc();
    bul[] arrayOfbul = this.UP.SH.Xk();
    if (arrayOfbul == null) {
      return;
    }

    ArrayList localArrayList = this.UR.aGJ();
    int i = localArrayList.size();
    if (i == 0) {
      return;
    }

    int j = arrayOfbul.length;
    for (int k = 0; k < i; k++) {
      aWk localaWk = (aWk)localArrayList.get(k);
      for (int m = 0; m < j; m++) {
        bul localbul = arrayOfbul[m];
        if (localaWk.fbr == localbul.fbr) {
          if (this.UT == dcC.kVG) {
            this.UT = new dcC();
          }
          this.UT.nT(localbul.gdJ);
        }
      }
    }
  }

  public void at(int paramInt) {
    if (this.UT == dcC.kVG) {
      this.UT = new dcC();
    }
    this.UT.nU(paramInt);
  }

  public void au(int paramInt) {
    if ((!bB) && (this.UT == dcC.kVG)) throw new AssertionError();
    this.UT.zI(paramInt);
  }

  public boolean hP() {
    boolean bool = false;
    if (this.UO != null) {
      setAnimation(this.UO);
      if (this.UO == null) {
        bool = true;
        this.Vm = true;
      }
    }
    return bool;
  }

  public void setAnimation(String paramString) {
    Nl localNl = this.UP.SH;
    String str1 = I(paramString);

    if (str1 != paramString) {
      this.UY = true;
      this.Vo.g(-1.0F, 0.0F, 0.0F, 1.0F);
    } else {
      this.UY = false;
      this.Vo.aJn();
    }

    this.UV = str1;
    this.UW = null;
    this.UO = null;
    this.Vn = true;
    this.Vm = true;

    vp localvp = localNl.cL(str1);
    if (localvp == null) {
      Uy.error("Animation " + str1 + " not found (" + this.SK + this.UQ + ")!");
      return;
    }
    if ((!bB) && (!localvp.m_name.equals(str1))) throw new AssertionError();

    if (localvp.bju == -1) {
      if ((!bB) && (!this.UP.gI())) throw new AssertionError();
      a(this.UP, this.UP.ad(localvp.bjv));
    } else {
      String str2 = localNl.fP(localvp.bju);
      bOE.bVz().a(str2, localvp, this);
    }
    this.Vd = -1;
  }

  public biK hQ() {
    return this.UW;
  }

  public boolean hR() {
    return this.UO != null;
  }

  public boolean hS() {
    return this.Vn;
  }

  public void c(ArrayList paramArrayList) {
    vp[] arrayOfvp = this.UP.SH.gT();
    for (int i = 0; i < arrayOfvp.length; i++)
      paramArrayList.add(arrayOfvp[i].m_name);
  }

  public void a(cnQ paramcnQ1, cnQ paramcnQ2)
  {
    this.Va = paramcnQ1;
    this.Vb = paramcnQ2;
  }

  public boolean hT() {
    boolean bool = this.UR.aBC();
    if (this.US != null) {
      bool |= this.US.aBC();
    }
    if (bool) {
      hO();
    }
    return bool;
  }

  public void a(int paramInt1, Entity3D paramEntity3D, int paramInt2) {
    paramEntity3D.clear();
    if ((this.Vr != null) && (this.Sz == -1)) {
      this.Vr.axl();
      this.Vr = null;
    }
    if (this.UW == null) {
      K.error("On ne peut pas mettre a jour une animation nulle");
      return;
    }

    setScale(this.UP.SH.getScale());

    int i = ay(paramInt1);
    this.Vl = i;
    this.Vm = true;
    this.Vn = false;

    this.Vp = 0;
    this.Vq = 0;
    UE = 0;
    SO = 0L;
    UF = 0;
    UG = 0;
    UH = 0;
    UI = null;

    this.Vf = 3.4028235E+38F;
    this.Vg = -3.402824E+038F;
    this.Vh = 3.4028235E+38F;
    this.Vi = -3.402824E+038F;

    this.Vo.dNf = 0;
    a(i, this.UW, paramEntity3D, this.Vo, this.UX, 0);
    if (UE != 0) {
      b(paramEntity3D);
    }

    this.Vc.set((int)this.Vf, (int)this.Vg, (int)this.Vh, (int)this.Vi);
  }

  public void b(float paramFloat) {
    dQx localdQx = this.Vc;
    if (this.Vd == 0) {
      return;
    }
    if ((localdQx.hqu == 2147483647) || (localdQx.hqw == 2147483647) || (localdQx.hqv == -2147483648) || (localdQx.hqx == -2147483648))
    {
      this.Ve.set(localdQx.hqu, localdQx.hqv, localdQx.hqw, localdQx.hqx);
      this.Vd = -1;
      return;
    }

    if (this.Vd == -1) {
      this.Ve.set(localdQx.hqu, localdQx.hqv, localdQx.hqw, localdQx.hqx);
      this.Vd = 0;
      return;
    }

    float f = paramFloat / 300.0F;
    this.Vd = 0;

    int i = a(this.Ve.hqu, localdQx.hqu, f);
    int j = a(this.Ve.hqv, localdQx.hqv, f);
    int k = a(this.Ve.hqw, localdQx.hqw, f);
    int m = a(this.Ve.hqx, localdQx.hqx, f);

    this.Ve.set(i, j, k, m);
  }

  private int a(int paramInt1, int paramInt2, float paramFloat) {
    float f = paramInt2 - paramInt1;
    if (Math.abs(f) <= 1.0F) {
      return paramInt1;
    }

    this.Vd = 1;
    return bCO.aB(paramInt1 + f * paramFloat);
  }

  public static Material hU() {
    return UA;
  }

  public void setMaterial(Material paramMaterial) {
    if (paramMaterial != null) {
      paramMaterial.gQ();
    }
    if (this.UZ != null) {
      this.UZ.axl();
    }
    this.UZ = paramMaterial;
  }

  public dQx hV() {
    return this.Vc;
  }

  public int av(int paramInt)
  {
    biK localbiK;
    if (this.UW.qi())
      localbiK = this.UX.f(this.UW.qj());
    else {
      localbiK = this.UW;
    }

    if (localbiK == null) {
      return 0;
    }

    int i = ay(paramInt);
    return a(i, localbiK);
  }

  private static int a(int paramInt, biK parambiK) {
    int i = parambiK.getFrameCount();
    if (paramInt >= i) {
      if (parambiK.akR()) {
        return paramInt % i;
      }
      return i - 1;
    }
    return paramInt;
  }

  public float getScale() {
    return this.UP.SH.getScale();
  }

  public void setScale(float paramFloat) {
    if (this.UY)
      this.Vo.g(-paramFloat, 0.0F, 0.0F, paramFloat);
    else
      this.Vo.g(paramFloat, 0.0F, 0.0F, paramFloat);
  }

  public boolean gJ()
  {
    return (this.UX != null) && (this.UX.gJ());
  }

  public int hW()
  {
    if ((!bB) && (this.UW == null)) throw new AssertionError();
    biK localbiK;
    if (this.UW.qi()) {
      localbiK = this.UX.f(this.UW.qj());
      if (localbiK == null)
        return 1;
    }
    else {
      localbiK = this.UW;
    }
    return localbiK.getFrameCount();
  }

  public float[] aw(int paramInt) {
    if (this.UU == null) {
      return null;
    }
    return this.UU[paramInt];
  }

  public void a(int paramInt, float[] paramArrayOfFloat) {
    if (this.UU == null) {
      this.UU = new float[10][];
    }

    this.UU[paramInt] = paramArrayOfFloat;
  }

  public void a(dR paramdR) {
    float[][] arrayOfFloat = paramdR.UU;
    if (arrayOfFloat == null) {
      this.UU = ((float[][])null);
    } else {
      this.UU = new float[arrayOfFloat.length][];
      for (int i = 0; i < arrayOfFloat.length; i++)
        if (arrayOfFloat[i] == null)
          this.UU[i] = null;
        else
          this.UU[i] = ((float[])arrayOfFloat[i].clone());
    }
  }

  public void ax(int paramInt)
  {
    if (this.UU == null) {
      return;
    }

    this.UU[paramInt] = null;
  }

  public void hX()
  {
    this.UU = ((float[][])null);
  }

  public void a(ArrayList paramArrayList, int paramInt1, int paramInt2) {
    if ((!bB) && (this.UW == null)) throw new AssertionError();

    if ((paramInt1 == paramInt2) && (paramInt1 != 0)) {
      return;
    }

    int i = hW();

    int j = paramInt1 == 0 ? -1 : av(paramInt2);
    int k = paramInt1 == 0 ? 0 : av(paramInt1);
    int m;
    if (j + 1 > k) {
      for (m = j + 1; m <= i - 1; m++) {
        this.UW.b(m, paramArrayList);
      }

      for (m = 0; m <= k; m++)
        this.UW.b(m, paramArrayList);
    }
    else {
      for (m = j + 1; m <= k; m++)
        this.UW.b(m, paramArrayList);
    }
  }

  private int ay(int paramInt)
  {
    return (int)(this.UX.SA.getFrameRate() * (paramInt / 1000.0F));
  }

  public Matrix44 hY() {
    return this.Vj;
  }

  public Matrix44 hZ() {
    return this.Vk;
  }

  public boolean gI() {
    return this.UP.gI();
  }

  public int H(String paramString) {
    if (!this.UP.gI()) {
      K.error("Impossible de récupérer la duree de l'animation " + paramString + " dans " + this.SK + this.UQ + " : la definition n'est pas chargee");
      return 0;
    }
    Nl localNl = this.UP.SH;

    paramString = I(paramString);
    vp localvp = localNl.cL(paramString);
    if (localvp == null) {
      Uy.error("Animation " + paramString + " not found (" + this.SK + this.UQ + ")!");
      return 0;
    }
    if ((!bB) && (!localvp.m_name.equals(paramString))) throw new AssertionError();
    biK localbiK;
    Anm localAnm;
    if (localvp.bju == -1) {
      localbiK = this.UP.ad(localvp.bjv);
      localAnm = this.UX;
    } else {
      String str = this.SK + localNl.fP(localvp.bju) + ".anm";
      try {
        localAnm = bOE.bVz().C(str, true);
        localbiK = localAnm != null ? localAnm.ad(localvp.bjv) : null;
      } catch (IOException localIOException) {
        K.error("", localIOException);
        return 0;
      }
    }

    return a(localbiK, localAnm);
  }

  private String I(String paramString)
  {
    if (this.UP.SH.Xp()) {
      int i = paramString.charAt(0);
      switch (i) {
      case 52:
        paramString = '0' + paramString.substring(1);
        break;
      case 51:
        paramString = '1' + paramString.substring(1);
        break;
      case 55:
        paramString = '5' + paramString.substring(1);
      case 53:
      case 54:
      }
    }
    return paramString;
  }

  private static int a(biK parambiK, Anm paramAnm) {
    if ((parambiK == null) || (paramAnm == null)) {
      return 0;
    }

    if (parambiK.qi()) {
      parambiK = paramAnm.f(parambiK.qj());
      if (parambiK == null) {
        return 0;
      }
    }
    if (parambiK.akR()) {
      return 2147483647;
    }
    int i = parambiK.getFrameCount();
    return (int)(1000 * i / paramAnm.SA.getFrameRate());
  }

  public int ia()
  {
    return a(this.UW, this.UX);
  }

  public boolean ib() {
    return this.Vm;
  }

  public void ic() {
    this.Vm = false;
  }

  public void ie() {
    this.Vm = true;
  }

  void a(Anm paramAnm, biK parambiK)
  {
    if ((paramAnm != null) && (paramAnm != this.UP)) {
      paramAnm.gQ();
    }
    if ((this.UX != null) && (this.UX != this.UP)) {
      this.UX.axl();
    }
    this.UX = paramAnm;
    this.Sz = (paramAnm != null ? paramAnm.Sz : 0);
    this.UW = parambiK;
    this.Vd = 1;
  }

  private void a(int paramInt1, biK parambiK, Entity3D paramEntity3D, axM paramaxM, Anm paramAnm, int paramInt2)
  {
    int i = a(paramInt1, parambiK);
    this.UT.update();

    int j = parambiK.aU(i);
    int k = !paramAnm.SG.isEmpty() ? 1 : 0;
    boolean bool = paramAnm.gJ();
    for (int m = 0; m < j; m++) {
      parambiK.qk();
      axM localaxM = UK[paramInt2];
      localaxM.dNf = paramaxM.dNf;

      short s = parambiK.b(paramaxM, localaxM);
      if ((localaxM.bPc != 0.0F) || (!bool))
      {
        if (k != 0) {
          localObject = paramAnm.g(s);
          if (localObject != null) {
            a(paramInt1, paramEntity3D, paramAnm, paramInt2, localaxM, (aJW)localObject);
            continue;
          }
        }

        Object localObject = (biK)paramAnm.SE.cx(s);
        if (a((biK)localObject)) {
          a(this.UR, (biK)localObject, paramInt1, paramEntity3D, localaxM, paramAnm, paramInt2);
        }
        else {
          dVz localdVz = (dVz)paramAnm.SC.cx(s);
          if (localdVz != null)
          {
            if ((localaxM.bPc > 0.004F) || (!bool))
            {
              float f1 = localdVz.aZs * localaxM.dMX + localdVz.aZt * localaxM.dMZ + localaxM.dNb;
              float f2 = localdVz.aZs * -localaxM.dMY + localdVz.aZt * -localaxM.dNa - localaxM.dNc;
              float f3 = localaxM.dMZ * localdVz.bdV;
              float f4 = -localaxM.dNa * localdVz.bdV;
              float f5 = localaxM.dMX * localdVz.gKt;
              float f6 = -localaxM.dMY * localdVz.gKt;

              long l = paramAnm.gO();
              if (SO != l) {
                if (UE != 0) {
                  b(paramEntity3D);
                }
                SO = l;
                UI = tq.Bg().aw(l);
              }

              float f7 = f3 + f1;
              float f8 = f4 + f2;
              float f9 = f5 + f3 + f1;
              float f10 = f6 + f4 + f2;
              float f11 = f5 + f1;
              float f12 = f6 + f2;

              UB[(UF++)] = f1;
              UB[(UF++)] = f2;

              UB[(UF++)] = f7;
              UB[(UF++)] = f8;

              UB[(UF++)] = f9;
              UB[(UF++)] = f10;

              UB[(UF++)] = f11;
              UB[(UF++)] = f12;

              if (f1 > this.Vg)
                this.Vg = f1;
              else if (f1 < this.Vf) {
                this.Vf = f1;
              }

              if (f7 > this.Vg)
                this.Vg = f7;
              else if (f7 < this.Vf) {
                this.Vf = f7;
              }

              if (f9 > this.Vg)
                this.Vg = f9;
              else if (f9 < this.Vf) {
                this.Vf = f9;
              }

              if (f11 > this.Vg)
                this.Vg = f11;
              else if (f11 < this.Vf) {
                this.Vf = f11;
              }

              if (f2 > this.Vi)
                this.Vi = f2;
              else if (f2 < this.Vh) {
                this.Vh = f2;
              }

              if (f8 > this.Vi)
                this.Vi = f8;
              else if (f8 < this.Vh) {
                this.Vh = f8;
              }

              if (f10 > this.Vi)
                this.Vi = f10;
              else if (f10 < this.Vh) {
                this.Vh = f10;
              }

              if (f12 > this.Vi)
                this.Vi = f12;
              else if (f12 < this.Vh) {
                this.Vh = f12;
              }

              float f13 = localaxM.bOZ;
              float f14 = localaxM.bPa;
              float f15 = localaxM.bPb;
              float f16 = localaxM.bPc;
              f13 *= 0.5F;
              f14 *= 0.5F;
              f15 *= 0.5F;

              UC[(UG++)] = f13;
              UC[(UG++)] = f14;
              UC[(UG++)] = f15;
              UC[(UG++)] = f16;

              UC[(UG++)] = f13;
              UC[(UG++)] = f14;
              UC[(UG++)] = f15;
              UC[(UG++)] = f16;

              UC[(UG++)] = f13;
              UC[(UG++)] = f14;
              UC[(UG++)] = f15;
              UC[(UG++)] = f16;

              UC[(UG++)] = f13;
              UC[(UG++)] = f14;
              UC[(UG++)] = f15;
              UC[(UG++)] = f16;

              UD[(UH++)] = localdVz.eVH;
              UD[(UH++)] = localdVz.hYN;

              UD[(UH++)] = localdVz.eVH;
              UD[(UH++)] = localdVz.eVG;

              UD[(UH++)] = localdVz.hYM;
              UD[(UH++)] = localdVz.eVG;

              UD[(UH++)] = localdVz.hYM;
              UD[(UH++)] = localdVz.hYN;

              UE += 1; }  }  } 
      }
    }
  }

  private void a(int paramInt1, Entity3D paramEntity3D, Anm paramAnm, int paramInt2, axM paramaxM, aJW paramaJW) { if (this.US != null) {
      localObject = this.US.kw(paramaJW.bjv);
      if (localObject != null) {
        biK localbiK = ((afS)localObject).cZj;
        if (a(localbiK)) {
          a(this.US, localbiK, paramInt1, paramEntity3D, paramaxM, paramAnm, paramInt2);
        }
        return;
      }
    }
    Object localObject = (biK)this.UP.SF.get(paramaJW.bjv);
    if (a((biK)localObject))
      a(this.UR, (biK)localObject, paramInt1, paramEntity3D, paramaxM, this.UP, paramInt2);
  }

  private boolean a(biK parambiK)
  {
    return (parambiK != null) && (!this.UT.contains(parambiK.fzo));
  }

  private void a(Entity3D paramEntity3D) {
    int i = UE * 4;
    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(i);
    a(localVertexBufferPCT, i);

    GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.djO.bQy();

    localGLGeometryMesh.a(this.Va, this.Vb);
    localGLGeometryMesh.a(cSb.kEo, localVertexBufferPCT, UJ, UC);
    paramEntity3D.a(localGLGeometryMesh, UI, this.UZ);
    localGLGeometryMesh.axl();

    UE = 0;
    UF = 0;
    UG = 0;
    UH = 0;

    localVertexBufferPCT.axl();
  }

  private void a(VertexBufferPCT paramVertexBufferPCT, int paramInt) {
    paramVertexBufferPCT.e(UB, UF);
    paramVertexBufferPCT.g(UC, UG);
    paramVertexBufferPCT.i(UD, UH);
    paramVertexBufferPCT.tg(paramInt);
  }

  private void b(Entity3D paramEntity3D)
  {
    this.Vq = ((byte)(this.Vq + 1));
    this.Vp = ((byte)(this.Vp + UE));

    if ((this.Sz == -1) || (paramEntity3D.bvg() != 0))
    {
      a(paramEntity3D);
      return;
    }

    int i = UE * 4;

    if ((this.Vr != null) && (this.Vr.bIl().bSW() < i)) {
      this.Vr.axl();
      this.Vr = null;
    }
    if (this.Vr == null) {
      VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(Math.max(this.Sz * 4, i));
      this.Vr = ((GLGeometryMesh)GLGeometryMesh.djO.bQy());
      this.Vr.a(cSb.kEo, localVertexBufferPCT, UJ, UC);
      localVertexBufferPCT.axl();
    }
    this.Vr.c(UC, i);

    this.Vr.a(this.Va, this.Vb);
    a(this.Vr.bIl(), i);
    paramEntity3D.a(this.Vr, UI, this.UZ);

    UE = 0;
    UF = 0;
    UG = 0;
    UH = 0;
  }

  private void a(aux paramaux, biK parambiK, int paramInt1, Entity3D paramEntity3D, axM paramaxM, Anm paramAnm, int paramInt2) {
    int i = parambiK.buD();

    if ((paramaux.aGH()) && 
      (!a(paramaux, parambiK, paramInt1, paramEntity3D, paramaxM, paramInt2, i))) {
      return;
    }

    if ((this.UU != null) && (i != 0)) {
      a(paramaxM, i);
    }

    if (parambiK.m_name != null) {
      switch (parambiK.fzo) {
      case 1272524161:
        a(paramaxM, this.Vj.Fj());
        break;
      case 1003439990:
        a(paramaxM, this.Vk.Fj());
      }

    }

    a(paramInt1, parambiK, paramEntity3D, paramaxM, paramAnm, paramInt2 + 1);
  }

  private boolean a(aux paramaux, biK parambiK, int paramInt1, Entity3D paramEntity3D, axM paramaxM, int paramInt2, int paramInt3) {
    afS localafS = paramaux.kw(parambiK.fzn);

    if (localafS == null) {
      return true;
    }
    if ((parambiK.m_name != null) && (paramInt3 != 0) && (paramInt3 != 9) && (paramInt3 != 6) && (paramInt3 != 7))
    {
      if (this.UU != null) {
        a(paramaxM, paramInt3);
      }
    }

    biK localbiK = localafS.cZj;
    if ((!bB) && (localbiK == null)) throw new AssertionError();
    a(paramInt1, localbiK, paramEntity3D, paramaxM, localafS.bXW, paramInt2 + 1);
    return false;
  }

  private void a(axM paramaxM, int paramInt) {
    if (paramInt != paramaxM.dNf) {
      float[] arrayOfFloat = this.UU[paramaxM.dNf];
      if (arrayOfFloat != null) {
        paramaxM.bOZ /= arrayOfFloat[0];
        paramaxM.bPa /= arrayOfFloat[1];
        paramaxM.bPb /= arrayOfFloat[2];
        paramaxM.bPc /= arrayOfFloat[3];
      }

      arrayOfFloat = this.UU[paramInt];
      if (arrayOfFloat != null) {
        paramaxM.bOZ *= arrayOfFloat[0];
        paramaxM.bPa *= arrayOfFloat[1];
        paramaxM.bPb *= arrayOfFloat[2];
        paramaxM.bPc *= arrayOfFloat[3];
        paramaxM.dNf = ((byte)paramInt);
      }
    }
  }

  private void a(axM paramaxM, float[] paramArrayOfFloat) {
    paramArrayOfFloat[0] = (this.UY ? -paramaxM.dMX : paramaxM.dMX);
    paramArrayOfFloat[1] = paramaxM.dMY;
    paramArrayOfFloat[4] = paramaxM.dMZ;
    paramArrayOfFloat[5] = paramaxM.dNa;
    paramArrayOfFloat[12] = paramaxM.dNb;
    paramArrayOfFloat[13] = (-paramaxM.dNc);
  }

  public boolean J(String paramString) {
    paramString = I(paramString);
    return this.UP.SH.cL(paramString) != null;
  }

  public float jdMethod_if() {
    if (this.UP.SH.Xn()) {
      return this.UP.SH.jdMethod_if();
    }
    return 1.0F;
  }

  public dQx ig() {
    return this.Ve;
  }

  public float getMinX() {
    return this.Vf;
  }

  public float getMinY() {
    return this.Vh;
  }

  public String ih() {
    return this.SK + this.UQ + ".anm";
  }

  public boolean ii() {
    return this.UR.aGI();
  }

  public aux ij() {
    return this.UR.aGL();
  }

  public aux ik() {
    return this.US == null ? null : this.US.aGL();
  }

  public void a(aux paramaux1, aux paramaux2) {
    if ((!bB) && (this.UR == null)) throw new AssertionError();
    this.UR.clear();
    this.UR = paramaux1.aGL();
    this.US = (paramaux2 == null ? null : paramaux2.aGL());
    hO();
  }

  public dcC il() {
    return this.UT.bit();
  }

  public void a(dcC paramdcC) {
    this.UT.clear();
    this.UT = paramdcC.bit();
  }

  public void im() {
    this.UR.clear();
    hO();
  }

  public String toString()
  {
    return "AnmInstance - " + this.UQ + " [" + this.UV + "]";
  }

  public byte in()
  {
    return this.Vp;
  }

  public byte io()
  {
    return this.Vq;
  }

  public void a(Anm paramAnm) {
    if (this.US == null) {
      this.US = new aux();
    }
    this.US.a(paramAnm, null);
  }

  public void b(Anm paramAnm) {
    if (this.US != null)
      this.US.b(paramAnm, null);
  }

  static
  {
    K = Logger.getLogger(dR.class);
    Uy = Logger.getLogger("animation");

    Uz = cnQ.hUU;

    UJ = dUU.mtc;

    UA = Material.mwz;

    UB = new float[4096];
    UC = new float[8192];
    UD = new float[4096];

    int i = 32;
    UK = new axM[32];
    for (int j = 0; j < UK.length; j++)
      UK[j] = new axM();
  }
}