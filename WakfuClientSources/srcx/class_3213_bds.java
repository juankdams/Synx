import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bds extends dFz
{
  public bds(bfE parambfE)
  {
    this(parambfE, null, null, cMx.krQ);
  }

  public bds(bfE parambfE, ArrayList paramArrayList1, ArrayList paramArrayList2, cMx paramcMx)
  {
    super(parambfE, parambfE.bsL().getId(), parambfE.nU(), cxo.ilm.d(parambfE), paramArrayList1, paramArrayList2, paramcMx, cxo.ll);
  }

  public void f(ArrayList paramArrayList)
  {
  }

  public String a(String paramString, dpI paramdpI)
  {
    Object localObject1;
    Object localObject2;
    if (((bfE)this.lba).bsL().Os() == SB.ctJ.uO()) {
      localObject1 = null;
      localObject2 = paramdpI.atZ();
      if (((dRh)localObject2).bt(34359738368L))
        localObject1 = "puppet";
      else if (((dRh)localObject2).bt(137438953472L))
        localObject1 = "totem";
      else if ((((dRh)localObject2).bt(68719476736L)) || (((dRh)localObject2).bt(274877906944L)))
      {
        localObject1 = "enemy";
      }
      if (localObject1 != null) {
        paramString = cxo.ilm.b(cxo.ill.cLY(), (String)localObject1).a(paramString).tP();
      }

    }
    else if (((bfE)this.lba).bsL().Os() == SB.ctK.uO()) {
      localObject1 = null;
      localObject2 = paramdpI.atZ();
      if (((dRh)localObject2).bt(2L)) {
        localObject1 = "caster";
      }
      if (localObject1 != null) {
        paramString = cxo.ilm.b(cxo.ill.cLY(), (String)localObject1).a(paramString).tP();
      }
    }

    paramString = a((bfE)this.lba, nU(), paramString);

    if ((((bfE)this.lba).bsL().bHY()) && (((bfE)this.lba).nU() == 0)) {
      localObject1 = dzp.c(paramString, '\n');
      localObject2 = cxo.ill.cLY();
      for (int i = 0; i < localObject1.length; i++) {
        if (localObject1[i].length() > 0) {
          ((lZ)localObject2).tI().am("b0b0b0").a(localObject1[i]).tJ().tH();
        }
      }
      return ((lZ)localObject2).tP();
    }
    return paramString;
  }

  public static String a(bfE parambfE, short paramShort, String paramString) {
    Matcher localMatcher = cxo.ikm.matcher(paramString.trim());
    dhJ localdhJ = cxo.ilm.bmK();
    Object localObject = cxo.ilm.bmN();
    while (localMatcher.find()) {
      String str1 = localMatcher.group(1);
      int i = str1.charAt(0);
      int j;
      switch (i) {
      case 97:
        j = str1.charAt(1);
        switch (j) {
        case 112:
          paramString = paramString.substring(0, localMatcher.start()) + parambfE.bsL().c(parambfE, localdhJ, null, localObject) + paramString.substring(localMatcher.end());

          localMatcher = cxo.ikm.matcher(paramString.trim());
        }

        break;
      case 109:
        j = str1.charAt(1);
        switch (j) {
        case 112:
          paramString = paramString.substring(0, localMatcher.start()) + parambfE.bsL().e(parambfE, localdhJ, null, localObject) + paramString.substring(localMatcher.end());

          localMatcher = cxo.ikm.matcher(paramString.trim());
          break;
        case 114:
          paramString = paramString.substring(0, localMatcher.start()) + parambfE.bsL().rL(paramShort) + paramString.substring(localMatcher.end());
          localMatcher = cxo.ikm.matcher(paramString.trim());
        }

        break;
      case 77:
        j = str1.charAt(1);
        switch (j) {
        case 114:
          paramString = paramString.substring(0, localMatcher.start()) + parambfE.bsL().f(parambfE, localdhJ, null, localObject) + paramString.substring(localMatcher.end());

          localMatcher = cxo.ikm.matcher(paramString.trim());
        }

        break;
      case 119:
        j = str1.charAt(1);
        switch (j) {
        case 112:
          paramString = paramString.substring(0, localMatcher.start()) + parambfE.bsL().d(parambfE, localdhJ, null, localObject) + paramString.substring(localMatcher.end());

          localMatcher = cxo.ikm.matcher(paramString.trim());
        }

        break;
      case 101:
        j = str1.charAt(1);
        switch (j) {
        case 108:
          bTI localbTI = bTI.dx(parambfE.bsL().bHU());
          String str2 = cxo.l(localbTI);
          paramString = paramString.substring(0, localMatcher.start()) + str2 + paramString.substring(localMatcher.end());
          localMatcher = cxo.ikm.matcher(paramString.trim());
        }

        break;
      case 99:
        j = str1.charAt(1);
        switch (j) {
        case 104:
          paramString = paramString.substring(0, localMatcher.start()) + cxo.ilm.bmI() + paramString.substring(localMatcher.end());
          localMatcher = cxo.ikm.matcher(paramString.trim());
        }

        break;
      case 108:
        j = str1.charAt(1);
        switch (j) {
        case 118:
          paramString = paramString.substring(0, localMatcher.start()) + localdhJ.nU() + paramString.substring(localMatcher.end());
          localMatcher = cxo.ikm.matcher(paramString.trim());
        }

      }

    }

    return paramString;
  }
}