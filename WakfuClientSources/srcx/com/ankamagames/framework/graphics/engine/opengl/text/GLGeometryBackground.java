package com.ankamagames.framework.graphics.engine.opengl.text;

import ayc;
import bSr;
import brZ;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import dHL;
import dUU;
import dbP;
import dsZ;
import javax.media.opengl.GL;

public class GLGeometryBackground extends GeometryBackground
{
  public static final GLGeometryBackground.ObjectFactory aTA = new GLGeometryBackground.ObjectFactory();

  public void a(bSr parambSr)
  {
    if ((!bB) && (parambSr.aJG() != dHL.lSB)) throw new AssertionError();
    dbP.cNw().c(this);

    bJi();

    dsZ localdsZ = dsZ.cZe();
    localdsZ.a(this.krq, this.krr);
    localdsZ.x(parambSr);

    ayc localayc = (ayc)parambSr;
    localayc.dNI.qH(13);

    GL localGL = (GL)localayc.bZk();
    a(localGL, 7, this.aVY, this.UJ);

    float f = getBorderWidth();
    if (f > 0.0F) {
      localdsZ.setLineWidth(f);
      localdsZ.x(parambSr);
      a(localGL, 3, this.gqv, this.gqw);
    }
  }

  private void a(GL paramGL, int paramInt, VertexBufferPCT paramVertexBufferPCT, dUU paramdUU)
  {
    paramGL.glVertexPointer(2, 5126, 0, paramVertexBufferPCT.bSP());
    paramGL.glColorPointer(4, 5126, 0, paramVertexBufferPCT.bSQ());
    paramGL.glTexCoordPointer(2, 5126, 0, paramVertexBufferPCT.bSR());
    paramGL.glDrawElements(paramInt, paramdUU.dvh(), 5123, paramdUU.dvi());
  }
}