import com.sun.opengl.cg.CgGL;
import org.apache.log4j.Logger;

class dih
  implements hz
{
  dih(nI paramnI)
  {
  }

  public void a(cbW paramcbW, int paramInt, float[] paramArrayOfFloat)
  {
    NT localNT = (NT)nI.a(this.lea).get(paramcbW.bjv);
    if (localNT == null) {
      nI.i().error("paramètre inconnu " + paramcbW.m_name);
      return;
    }
    switch (die.ldJ[paramcbW.hto.ordinal()]) {
    case 1:
      if (!localNT.S(paramArrayOfFloat[paramInt])) {
        CgGL.cgSetParameter1f(localNT.ceK, paramArrayOfFloat[paramInt]);
        localNT.T(paramArrayOfFloat[paramInt]); } break;
    case 2:
      if (!localNT.c(paramArrayOfFloat, paramInt, 2)) {
        CgGL.cgSetParameter2fv(localNT.ceK, paramArrayOfFloat, paramInt);
        localNT.d(paramArrayOfFloat, paramInt, 2); } break;
    case 3:
      if (!localNT.c(paramArrayOfFloat, paramInt, 3)) {
        CgGL.cgSetParameter3fv(localNT.ceK, paramArrayOfFloat, paramInt);
        localNT.d(paramArrayOfFloat, paramInt, 3); } break;
    case 4:
      if (!localNT.c(paramArrayOfFloat, paramInt, 4)) {
        CgGL.cgSetParameter4fv(localNT.ceK, paramArrayOfFloat, paramInt);
        localNT.d(paramArrayOfFloat, paramInt, 4); } break;
    case 5:
      if (!localNT.c(paramArrayOfFloat, paramInt, 16)) {
        CgGL.cgSetParameterValuefr(localNT.ceK, 16, paramArrayOfFloat, paramInt);
        localNT.d(paramArrayOfFloat, paramInt, 16); } break;
    default:
      nI.i().error("type inconnu " + paramcbW.hto);
    }
  }
}