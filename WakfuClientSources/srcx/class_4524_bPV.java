import java.nio.ByteBuffer;

final class bPV
  implements ako
{
  private bPV(dmk paramdmk)
  {
  }

  public void a(axA paramaxA1, int paramInt, gf paramgf, String paramString, axA paramaxA2)
  {
    if ((dmk.a(this.gYe) != null) && (paramInt >= dmk.a(this.gYe).intValue()))
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(201);

      int i = bra.fMl.a(localByteBuffer, localByteBuffer.capacity(), paramString, paramaxA2);

      if (i >= 0)
      {
        i = Math.min(i, 201);

        byte[] arrayOfByte = new byte[i];
        localByteBuffer.get(arrayOfByte);
        String str1 = new String(arrayOfByte);
        if (str1.length() > 0)
        {
          cJv localcJv1 = new cJv();
          cJv localcJv2 = new cJv();
          cjs localcjs1 = new cjs();
          dmk.b(this.gYe).a(paramgf, localcJv1, localcJv2, localcjs1);
          cJv localcJv3 = new cJv();
          cJv localcJv4 = new cJv();
          cjs localcjs2 = new cjs();
          dmk.b(this.gYe).b(paramgf, localcJv3, localcJv4, localcjs2);
          String str2 = dmk.a(this.gYe, localcJv1);
          String str3 = dmk.a(this.gYe, localcJv2);
          Integer localInteger1 = Integer.valueOf(localcjs1.getValue());
          String str4 = dmk.a(this.gYe, localcJv3);
          String str5 = dmk.a(this.gYe, localcJv4);
          Integer localInteger2 = Integer.valueOf(localcjs2.getValue());

          dmk.a(this.gYe, dCM.Cs(paramInt), str2, str3, localInteger1, str4, str5, localInteger2, str1);
        }
      }
      else {
        aHA.error("Failed to format log message", new Object[0]);
      }
    }
  }
}