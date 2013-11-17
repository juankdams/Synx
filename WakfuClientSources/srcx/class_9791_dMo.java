import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dMo extends Vz
{
  protected String a(dpI paramdpI, String paramString, Object[] paramArrayOfObject, boolean paramBoolean, cFo paramcFo)
  {
    short s = 0;
    Object localObject1 = null;
    Object localObject2;
    if ((paramdpI.eo() == cxo.ikW) || (paramdpI.eo() == cxo.ikZ) || (paramdpI.eo() == cxo.ikY) || (paramdpI.eo() == cxo.ila) || (paramdpI.eo() == cxo.ikX))
    {
      localObject2 = cNO.cFX().yF(((Number)paramArrayOfObject[0]).intValue());
      if (localObject2 != null)
      {
        if ((paramdpI.eo() == cxo.ikW) || (paramdpI.eo() == cxo.ila))
        {
          s = ((Number)paramArrayOfObject[1]).shortValue();
          localObject1 = localObject2;
          paramArrayOfObject[0] = cxo.a((bJC)localObject2, s, ((bJC)localObject2).bRe(), true);
        }
        else if ((paramdpI.eo() == cxo.ikZ) || (paramdpI.eo() == cxo.ikY))
        {
          s = 1;
          localObject1 = localObject2;
          paramArrayOfObject[0] = cxo.a((bJC)localObject2, s, 1, false);
        }
        else
        {
          paramArrayOfObject[0] = cxo.a((bJC)localObject2, s, 1, false);
        }
      }
    }
    else if (paramdpI.eo() == cxo.ikU)
    {
      localObject2 = cNO.cFX().yF(((Number)paramArrayOfObject[0]).intValue());
      s = ((Number)paramArrayOfObject[1]).shortValue();
      localObject1 = localObject2;
      paramArrayOfObject[0] = cxo.a((bJC)localObject2, s, (short)paramdpI.zC(), true);
    }
    else if (paramdpI.eo() == cxo.ikV)
    {
      localObject2 = cNO.cFX().yF(((Number)paramArrayOfObject[0]).intValue());
      s = ((Number)paramArrayOfObject[1]).shortValue();
      localObject1 = localObject2;
      paramArrayOfObject[0] = cxo.a((bJC)localObject2, s, (short)paramdpI.zC(), true);
    }
    else if ((paramdpI.eo() == cxo.ilb) && (paramArrayOfObject.length == 3))
    {
      localObject1 = cNO.cFX().yF(((Number)paramArrayOfObject[1]).intValue());
      if (localObject1 != null)
      {
        s = ((Number)paramArrayOfObject[2]).shortValue();
        paramArrayOfObject[1] = cxo.a((bJC)localObject1, s, ((bJC)localObject1).bRe(), true);
      }
    }

    if ((localObject1 != null) && ((paramdpI.eo() == cxo.ikW) || (paramdpI.eo() == cxo.ikU) || (paramdpI.eo() == cxo.ila) || (paramdpI.eo() == cxo.ikV)))
    {
      localObject2 = cxo.ikH.matcher(paramString.trim());
      while (((Matcher)localObject2).find())
      {
        String str1 = ((Matcher)localObject2).group(1);
        int j = str1.charAt(0);
        switch (j)
        {
        case 108:
          int k = str1.charAt(1);
          String str2;
          switch (k)
          {
          case 105:
            str2 = cxo.a((bJC)localObject1, s, false, 0, false, false);
            if (str2 != null)
            {
              paramString = paramString.substring(0, ((Matcher)localObject2).start()) + str2 + paramString.substring(((Matcher)localObject2).end());

              localObject2 = cxo.ikH.matcher(paramString.trim()); } break;
          case 112:
            str2 = cxo.a((bJC)localObject1, s, false, 0, false, true);
            if (str2 != null)
            {
              paramString = paramString.substring(0, ((Matcher)localObject2).start()) + str2 + paramString.substring(((Matcher)localObject2).end());

              localObject2 = cxo.ikH.matcher(paramString.trim()); } break;
          }

        }

      }

    }

    if ((paramdpI.on()) && (!paramdpI.om()))
    {
      int i = ((bJC)localObject1).bQV();
      if (i != -1000)
      {
        paramString = paramString + '(' + bXW.m(kb.I(i / 1000)) + ')';
      }
    }
    return bjv.format(paramString, paramArrayOfObject);
  }
}