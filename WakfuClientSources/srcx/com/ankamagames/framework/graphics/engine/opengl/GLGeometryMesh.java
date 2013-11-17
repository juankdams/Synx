package com.ankamagames.framework.graphics.engine.opengl;

import ayc;
import bSr;
import brZ;
import cSb;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMeshLine;
import dHL;
import dUU;
import dbP;
import dsZ;
import javax.media.opengl.GL;

public class GLGeometryMesh extends GeometryMeshLine
{
  public static final GLGeometryMesh.ObjectFactory djO = new GLGeometryMesh.ObjectFactory();

  public void a(bSr parambSr)
  {
    if ((!bB) && (parambSr.aJG() != dHL.lSB)) throw new AssertionError();

    dbP.cNw().c(this);

    dsZ localdsZ = dsZ.cZe();
    localdsZ.setLineWidth(this.cfH);
    localdsZ.ku(this.cfI);
    localdsZ.a(this.krq, this.krr);
    localdsZ.x(parambSr);

    ayc localayc = (ayc)parambSr;
    localayc.dNI.qH(13);

    GL localGL = (GL)localayc.bZk();

    localGL.glVertexPointer(2, 5126, 0, this.aVY.bSP());
    localGL.glColorPointer(4, 5126, 0, this.aVY.bSQ());
    localGL.glTexCoordPointer(2, 5126, 0, this.aVY.bSR());

    cSb localcSb = bIm();
    switch (aGY.eey[localcSb.ordinal()]) {
    case 1:
      localGL.glDrawElements(4, this.UJ.dvh(), 5123, this.UJ.dvi());
      break;
    case 2:
      localGL.glDrawElements(5, this.aVY.bSV(), 5123, this.UJ.dvi());
      break;
    case 3:
      localGL.glDrawElements(7, this.aVY.bSV(), 5123, this.UJ.dvi());
      break;
    case 4:
      localGL.glDrawElements(3, this.aVY.bSV(), 5123, this.UJ.dvi());
      break;
    case 5:
      localGL.glDrawElements(1, this.aVY.bSV(), 5123, this.UJ.dvi());
      break;
    case 6:
      localGL.glDrawElements(0, this.aVY.bSV(), 5123, this.UJ.dvi());
      break;
    default:
      if (!bB) throw new AssertionError("Unimplemented mesh type"); break;
    }
  }

  public void axl()
  {
    super.axl();
  }
}