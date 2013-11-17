import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class bjv
{
  public static final Logger K = Logger.getLogger(bjv.class);

  public static final Pattern fzP = Pattern.compile("\\{((\\[[^\\[\\]\\{\\}?:]*\\])+)\\s*\\?([^\\{\\}]*):([^\\{\\}]*)\\}");

  public static final Pattern fzQ = Pattern.compile("\\[([^\\[\\]]*)([~\\*\\+\\-><!=])([^\\[\\]]*)\\]");

  public static final Pattern fzR = Pattern.compile("\\[((,)*[\\£#])([0-9]+)(?:.([0-9]+))?\\]");

  public static final Pattern fzS = Pattern.compile(str);

  public static final Pattern fzT = Pattern.compile("((\\|.*)+)\\?([^\\|]*):([^\\|]*)\\|");

  protected static Pattern fzU = Pattern.compile("\\[(#icon)\\s*([0-9]+)(\\s*:\\s*(west|east|center))*\\]");

  public static byte fzV = 0;
  protected static byte fzW = fzV;
  public static String fzX = "Unknown";
  protected static String m_name = fzX;
  protected static String fzY = fzX;
  protected static String fzZ = fzX;

  public static cDi fAa = null;

  public static byte buS()
  {
    return fzW; } 
  // ERROR //
  public static String format(String paramString, Object[] paramArrayOfObject) { // Byte code:
    //   0: new 31	java/lang/StringBuffer
    //   3: dup
    //   4: invokespecial 82	java/lang/StringBuffer:<init>	()V
    //   7: astore_2
    //   8: getstatic 39	bjv:fzP	Ljava/util/regex/Pattern;
    //   11: aload_0
    //   12: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   15: astore_3
    //   16: aload_3
    //   17: invokevirtual 91	java/util/regex/Matcher:find	()Z
    //   20: ifeq +555 -> 575
    //   23: iconst_1
    //   24: istore 4
    //   26: aload_3
    //   27: iconst_1
    //   28: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   31: astore 5
    //   33: getstatic 40	bjv:fzQ	Ljava/util/regex/Pattern;
    //   36: aload 5
    //   38: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   41: astore 6
    //   43: aload 6
    //   45: invokevirtual 91	java/util/regex/Matcher:find	()Z
    //   48: ifeq +494 -> 542
    //   51: aload 6
    //   53: iconst_1
    //   54: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   57: astore 7
    //   59: iconst_1
    //   60: istore 8
    //   62: aload 7
    //   64: invokevirtual 78	java/lang/String:length	()I
    //   67: ifle +10 -> 77
    //   70: aload 7
    //   72: invokestatic 54	bUD:aR	(Ljava/lang/Object;)I
    //   75: istore 8
    //   77: aload 6
    //   79: iconst_2
    //   80: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   83: iconst_0
    //   84: invokevirtual 76	java/lang/String:charAt	(I)C
    //   87: istore 9
    //   89: aload 6
    //   91: iconst_3
    //   92: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   95: astore 10
    //   97: iconst_m1
    //   98: istore 11
    //   100: aload 10
    //   102: invokevirtual 78	java/lang/String:length	()I
    //   105: ifle +10 -> 115
    //   108: aload 10
    //   110: invokestatic 54	bUD:aR	(Ljava/lang/Object;)I
    //   113: istore 11
    //   115: iload 9
    //   117: lookupswitch	default:+397->514, 33:+224->341, 42:+384->501, 43:+298->415, 45:+341->458, 60:+75->192, 61:+127->244, 62:+101->218, 126:+153->270
    //   193: arraylength
    //   194: iload 11
    //   196: if_icmplt +343 -> 539
    //   199: iload 4
    //   201: aload_1
    //   202: iload 11
    //   204: iconst_1
    //   205: isub
    //   206: aaload
    //   207: iload 8
    //   209: invokestatic 64	bjv:d	(Ljava/lang/Object;I)Z
    //   212: iand
    //   213: istore 4
    //   215: goto +324 -> 539
    //   218: aload_1
    //   219: arraylength
    //   220: iload 11
    //   222: if_icmplt +317 -> 539
    //   225: iload 4
    //   227: aload_1
    //   228: iload 11
    //   230: iconst_1
    //   231: isub
    //   232: aaload
    //   233: iload 8
    //   235: invokestatic 63	bjv:c	(Ljava/lang/Object;I)Z
    //   238: iand
    //   239: istore 4
    //   241: goto +298 -> 539
    //   244: aload_1
    //   245: arraylength
    //   246: iload 11
    //   248: if_icmplt +291 -> 539
    //   251: iload 4
    //   253: aload_1
    //   254: iload 11
    //   256: iconst_1
    //   257: isub
    //   258: aaload
    //   259: iload 8
    //   261: invokestatic 65	bjv:e	(Ljava/lang/Object;I)Z
    //   264: iand
    //   265: istore 4
    //   267: goto +272 -> 539
    //   270: iload 4
    //   272: aload_1
    //   273: arraylength
    //   274: iload 11
    //   276: if_icmplt +58 -> 334
    //   279: aload_1
    //   280: iload 11
    //   282: iconst_1
    //   283: isub
    //   284: aaload
    //   285: ifnull +49 -> 334
    //   288: aload_1
    //   289: iload 11
    //   291: iconst_1
    //   292: isub
    //   293: aaload
    //   294: iconst_0
    //   295: invokestatic 65	bjv:e	(Ljava/lang/Object;I)Z
    //   298: ifne +36 -> 334
    //   301: aload_1
    //   302: iload 11
    //   304: iconst_1
    //   305: isub
    //   306: aaload
    //   307: instanceof 30
    //   310: ifeq +20 -> 330
    //   313: aload_1
    //   314: iload 11
    //   316: iconst_1
    //   317: isub
    //   318: aaload
    //   319: checkcast 30	java/lang/String
    //   322: ldc 1
    //   324: invokestatic 58	bjv:Z	(Ljava/lang/String;Ljava/lang/String;)Z
    //   327: ifne +7 -> 334
    //   330: iconst_1
    //   331: goto +4 -> 335
    //   334: iconst_0
    //   335: iand
    //   336: istore 4
    //   338: goto +201 -> 539
    //   341: iload 4
    //   343: aload_1
    //   344: arraylength
    //   345: iload 11
    //   347: if_icmplt +57 -> 404
    //   350: aload_1
    //   351: iload 11
    //   353: iconst_1
    //   354: isub
    //   355: aaload
    //   356: ifnull +48 -> 404
    //   359: aload_1
    //   360: iload 11
    //   362: iconst_1
    //   363: isub
    //   364: aaload
    //   365: iconst_0
    //   366: invokestatic 65	bjv:e	(Ljava/lang/Object;I)Z
    //   369: ifne +35 -> 404
    //   372: aload_1
    //   373: iload 11
    //   375: iconst_1
    //   376: isub
    //   377: aaload
    //   378: instanceof 30
    //   381: ifeq +27 -> 408
    //   384: aload_1
    //   385: iload 11
    //   387: iconst_1
    //   388: isub
    //   389: aaload
    //   390: checkcast 30	java/lang/String
    //   393: ldc 1
    //   395: invokestatic 58	bjv:Z	(Ljava/lang/String;Ljava/lang/String;)Z
    //   398: ifne +6 -> 404
    //   401: goto +7 -> 408
    //   404: iconst_1
    //   405: goto +4 -> 409
    //   408: iconst_0
    //   409: iand
    //   410: istore 4
    //   412: goto +127 -> 539
    //   415: iload 4
    //   417: aload_1
    //   418: arraylength
    //   419: iload 11
    //   421: if_icmplt +30 -> 451
    //   424: aload_1
    //   425: iload 11
    //   427: iconst_1
    //   428: isub
    //   429: aaload
    //   430: ifnull +21 -> 451
    //   433: aload_1
    //   434: iload 11
    //   436: iconst_1
    //   437: isub
    //   438: aaload
    //   439: iconst_0
    //   440: iconst_0
    //   441: invokestatic 62	bjv:b	(Ljava/lang/Object;IZ)Z
    //   444: ifeq +7 -> 451
    //   447: iconst_1
    //   448: goto +4 -> 452
    //   451: iconst_0
    //   452: iand
    //   453: istore 4
    //   455: goto +84 -> 539
    //   458: iload 4
    //   460: aload_1
    //   461: arraylength
    //   462: iload 11
    //   464: if_icmplt +30 -> 494
    //   467: aload_1
    //   468: iload 11
    //   470: iconst_1
    //   471: isub
    //   472: aaload
    //   473: ifnull +21 -> 494
    //   476: aload_1
    //   477: iload 11
    //   479: iconst_1
    //   480: isub
    //   481: aaload
    //   482: iconst_0
    //   483: iconst_0
    //   484: invokestatic 62	bjv:b	(Ljava/lang/Object;IZ)Z
    //   487: ifne +7 -> 494
    //   490: iconst_1
    //   491: goto +4 -> 495
    //   494: iconst_0
    //   495: iand
    //   496: istore 4
    //   498: goto +41 -> 539
    //   501: iload 4
    //   503: iload 8
    //   505: invokestatic 66	bjv:pU	(I)Z
    //   508: iand
    //   509: istore 4
    //   511: goto +28 -> 539
    //   514: getstatic 37	bjv:K	Lorg/apache/log4j/Logger;
    //   517: new 32	java/lang/StringBuilder
    //   520: dup
    //   521: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   524: ldc 5
    //   526: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   529: aload_0
    //   530: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   533: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   536: invokevirtual 96	org/apache/log4j/Logger:error	(Ljava/lang/Object;)V
    //   539: goto -496 -> 43
    //   542: iload 4
    //   544: ifeq +17 -> 561
    //   547: aload_3
    //   548: aload_2
    //   549: aload_3
    //   550: iconst_3
    //   551: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   554: invokevirtual 88	java/util/regex/Matcher:appendReplacement	(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
    //   557: pop
    //   558: goto +14 -> 572
    //   561: aload_3
    //   562: aload_2
    //   563: aload_3
    //   564: iconst_4
    //   565: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   568: invokevirtual 88	java/util/regex/Matcher:appendReplacement	(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
    //   571: pop
    //   572: goto -556 -> 16
    //   575: aload_3
    //   576: aload_2
    //   577: invokevirtual 89	java/util/regex/Matcher:appendTail	(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    //   580: pop
    //   581: aload_2
    //   582: invokevirtual 83	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   585: astore_0
    //   586: getstatic 39	bjv:fzP	Ljava/util/regex/Pattern;
    //   589: aload_0
    //   590: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   593: invokevirtual 91	java/util/regex/Matcher:find	()Z
    //   596: ifne -596 -> 0
    //   599: getstatic 41	bjv:fzR	Ljava/util/regex/Pattern;
    //   602: aload_0
    //   603: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   606: astore_2
    //   607: new 31	java/lang/StringBuffer
    //   610: dup
    //   611: invokespecial 82	java/lang/StringBuffer:<init>	()V
    //   614: astore_3
    //   615: aload_2
    //   616: invokevirtual 91	java/util/regex/Matcher:find	()Z
    //   619: ifeq +116 -> 735
    //   622: aload_2
    //   623: iconst_1
    //   624: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   627: iconst_0
    //   628: invokevirtual 76	java/lang/String:charAt	(I)C
    //   631: sipush 163
    //   634: if_icmpne +7 -> 641
    //   637: iconst_1
    //   638: goto +4 -> 642
    //   641: iconst_0
    //   642: istore 4
    //   644: aload_2
    //   645: iconst_3
    //   646: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   649: invokestatic 54	bUD:aR	(Ljava/lang/Object;)I
    //   652: iconst_1
    //   653: isub
    //   654: istore 5
    //   656: aload_2
    //   657: invokevirtual 93	java/util/regex/Matcher:groupCount	()I
    //   660: iconst_4
    //   661: if_icmpne +16 -> 677
    //   664: aload_2
    //   665: iconst_4
    //   666: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   669: invokestatic 54	bUD:aR	(Ljava/lang/Object;)I
    //   672: istore 6
    //   674: goto +6 -> 680
    //   677: iconst_0
    //   678: istore 6
    //   680: aload_1
    //   681: arraylength
    //   682: iload 5
    //   684: if_icmple +48 -> 732
    //   687: aload_1
    //   688: iload 5
    //   690: aaload
    //   691: ifnull +41 -> 732
    //   694: aload_2
    //   695: iconst_2
    //   696: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   699: ifnull +7 -> 706
    //   702: iconst_1
    //   703: goto +4 -> 707
    //   706: iconst_0
    //   707: istore 7
    //   709: aload_1
    //   710: iload 5
    //   712: aaload
    //   713: iload 4
    //   715: iload 6
    //   717: iload 7
    //   719: invokestatic 60	bjv:a	(Ljava/lang/Object;ZIZ)Ljava/lang/String;
    //   722: astore 8
    //   724: aload_2
    //   725: aload_3
    //   726: aload 8
    //   728: invokevirtual 88	java/util/regex/Matcher:appendReplacement	(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
    //   731: pop
    //   732: goto -117 -> 615
    //   735: aload_2
    //   736: aload_3
    //   737: invokevirtual 89	java/util/regex/Matcher:appendTail	(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    //   740: pop
    //   741: getstatic 42	bjv:fzS	Ljava/util/regex/Pattern;
    //   744: aload_3
    //   745: invokevirtual 83	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   748: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   751: astore_2
    //   752: new 31	java/lang/StringBuffer
    //   755: dup
    //   756: invokespecial 82	java/lang/StringBuffer:<init>	()V
    //   759: astore_3
    //   760: aload_2
    //   761: invokevirtual 91	java/util/regex/Matcher:find	()Z
    //   764: ifeq +65 -> 829
    //   767: aload_2
    //   768: iconst_1
    //   769: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   772: astore 4
    //   774: aload 4
    //   776: invokestatic 100	xp:bj	(Ljava/lang/String;)Lxp;
    //   779: astore 5
    //   781: aload 5
    //   783: ifnonnull +32 -> 815
    //   786: getstatic 37	bjv:K	Lorg/apache/log4j/Logger;
    //   789: new 32	java/lang/StringBuilder
    //   792: dup
    //   793: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   796: ldc 6
    //   798: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   801: aload 4
    //   803: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   806: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   809: invokevirtual 96	org/apache/log4j/Logger:error	(Ljava/lang/Object;)V
    //   812: goto -52 -> 760
    //   815: aload_2
    //   816: aload_3
    //   817: aload 5
    //   819: invokevirtual 101	xp:getValue	()Ljava/lang/String;
    //   822: invokevirtual 88	java/util/regex/Matcher:appendReplacement	(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
    //   825: pop
    //   826: goto -66 -> 760
    //   829: aload_2
    //   830: aload_3
    //   831: invokevirtual 89	java/util/regex/Matcher:appendTail	(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    //   834: pop
    //   835: aload_3
    //   836: invokevirtual 83	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   839: astore 4
    //   841: getstatic 43	bjv:fzT	Ljava/util/regex/Pattern;
    //   844: aload 4
    //   846: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   849: astore_2
    //   850: new 31	java/lang/StringBuffer
    //   853: dup
    //   854: invokespecial 82	java/lang/StringBuffer:<init>	()V
    //   857: astore_3
    //   858: aload_2
    //   859: invokevirtual 91	java/util/regex/Matcher:find	()Z
    //   862: ifeq +120 -> 982
    //   865: aload_2
    //   866: iconst_1
    //   867: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   870: ldc 13
    //   872: invokevirtual 79	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   875: astore 5
    //   877: aload_2
    //   878: invokevirtual 90	java/util/regex/Matcher:end	()I
    //   881: istore 6
    //   883: aload 4
    //   885: invokevirtual 78	java/lang/String:length	()I
    //   888: iload 6
    //   890: if_icmpgt +6 -> 896
    //   893: goto -35 -> 858
    //   896: iconst_0
    //   897: istore 7
    //   899: aload 5
    //   901: astore 8
    //   903: aload 8
    //   905: arraylength
    //   906: istore 9
    //   908: iconst_0
    //   909: istore 10
    //   911: iload 10
    //   913: iload 9
    //   915: if_icmpge +48 -> 963
    //   918: aload 8
    //   920: iload 10
    //   922: aaload
    //   923: astore 11
    //   925: aload 4
    //   927: iload 6
    //   929: invokevirtual 81	java/lang/String:substring	(I)Ljava/lang/String;
    //   932: aload 11
    //   934: invokevirtual 80	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   937: ifeq +20 -> 957
    //   940: aload_2
    //   941: aload_3
    //   942: aload_2
    //   943: iconst_3
    //   944: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   947: invokevirtual 88	java/util/regex/Matcher:appendReplacement	(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
    //   950: pop
    //   951: iconst_1
    //   952: istore 7
    //   954: goto +9 -> 963
    //   957: iinc 10 1
    //   960: goto -49 -> 911
    //   963: iload 7
    //   965: ifne +14 -> 979
    //   968: aload_2
    //   969: aload_3
    //   970: aload_2
    //   971: iconst_4
    //   972: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   975: invokevirtual 88	java/util/regex/Matcher:appendReplacement	(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
    //   978: pop
    //   979: goto -121 -> 858
    //   982: aload_2
    //   983: aload_3
    //   984: invokevirtual 89	java/util/regex/Matcher:appendTail	(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    //   987: pop
    //   988: getstatic 38	bjv:fAa	LcDi;
    //   991: ifnull +89 -> 1080
    //   994: getstatic 44	bjv:fzU	Ljava/util/regex/Pattern;
    //   997: aload_3
    //   998: invokevirtual 83	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1001: invokevirtual 95	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   1004: astore_2
    //   1005: new 31	java/lang/StringBuffer
    //   1008: dup
    //   1009: invokespecial 82	java/lang/StringBuffer:<init>	()V
    //   1012: astore_3
    //   1013: aload_2
    //   1014: invokevirtual 91	java/util/regex/Matcher:find	()Z
    //   1017: ifeq +57 -> 1074
    //   1020: aload_2
    //   1021: iconst_2
    //   1022: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   1025: invokestatic 56	bUD:getByte	(Ljava/lang/Object;)B
    //   1028: istore 5
    //   1030: aload_2
    //   1031: iconst_4
    //   1032: invokevirtual 92	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   1035: astore 6
    //   1037: aload_2
    //   1038: aload_3
    //   1039: getstatic 38	bjv:fAa	LcDi;
    //   1042: iload 5
    //   1044: aload 6
    //   1046: invokeinterface 103 3 0
    //   1051: invokevirtual 88	java/util/regex/Matcher:appendReplacement	(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
    //   1054: pop
    //   1055: goto +16 -> 1071
    //   1058: astore 7
    //   1060: getstatic 37	bjv:K	Lorg/apache/log4j/Logger;
    //   1063: aload 7
    //   1065: invokevirtual 70	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1068: invokevirtual 98	org/apache/log4j/Logger:warn	(Ljava/lang/Object;)V
    //   1071: goto -58 -> 1013
    //   1074: aload_2
    //   1075: aload_3
    //   1076: invokevirtual 89	java/util/regex/Matcher:appendTail	(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    //   1079: pop
    //   1080: aload_3
    //   1081: invokevirtual 83	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1084: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   1037	1055	1058	java/lang/Exception } 
  protected static boolean pU(int paramInt) { if (paramInt > 127) {
      K.error("Constante trop grande pour le test du sex de l'interlocuteur : " + paramInt);
      return false;
    }
    return (byte)paramInt == fzW;
  }

  protected static boolean c(Object paramObject, int paramInt)
  {
    return b(paramObject, paramInt, true);
  }

  protected static boolean d(Object paramObject, int paramInt) {
    return a(paramObject, paramInt, true);
  }

  protected static boolean a(Object paramObject, int paramInt, boolean paramBoolean) {
    Object localObject = aF(paramObject);
    if (localObject == null) {
      return false;
    }
    if (paramBoolean)
      localObject = Double.valueOf(Math.ceil(((Number)localObject).doubleValue()));
    return ((Number)localObject).doubleValue() < paramInt;
  }

  protected static boolean b(Object paramObject, int paramInt, boolean paramBoolean)
  {
    Object localObject = aF(paramObject);
    if (localObject == null) {
      return false;
    }
    if (paramBoolean)
      localObject = Double.valueOf(Math.ceil(((Number)localObject).doubleValue()));
    return ((Number)localObject).doubleValue() > paramInt;
  }

  protected static boolean e(Object paramObject, int paramInt)
  {
    Number localNumber = aF(paramObject);
    if (localNumber == null)
      return false;
    return localNumber.doubleValue() == paramInt;
  }

  protected static boolean Z(String paramString1, String paramString2)
  {
    return paramString1.equals(paramString2);
  }

  protected static String a(Object paramObject, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    if ((paramObject instanceof String)) {
      if ((paramBoolean1) || (paramInt > 0))
        paramObject = Double.valueOf(bUD.getDouble(paramObject));
      else {
        return paramObject.toString();
      }
    }

    if (!(paramObject instanceof Number)) {
      return paramObject.toString();
    }
    double d = ((Number)paramObject).doubleValue();
    if ((paramInt > 0) && ((paramObject instanceof bAX))) {
      d = ((bAX)paramObject).bJK();
    }
    if (paramInt == 0)
      d = bCO.w(d);
    else if (paramInt > 0) {
      d = bCO.b(d, paramInt);
    }
    if (paramBoolean1) {
      d = Math.abs(d);
    }
    return cHO.cCa().R(d);
  }

  public static void cN(byte paramByte) {
    fzW = paramByte;
  }

  public static void setName(String paramString) {
    m_name = paramString;
  }

  public static void ir(String paramString) {
    fzY = paramString;
  }

  public static void is(String paramString) {
    fzZ = paramString;
  }

  protected static Number aF(Object paramObject) {
    if (paramObject == null)
      return null;
    if ((paramObject instanceof Number))
      return (Number)paramObject;
    if ((paramObject instanceof String))
      return Double.valueOf(bUD.b(paramObject, 0.0D));
    return null;
  }

  static
  {
    String str = "\\[#(";
    for (xp localxp : xp.values()) {
      if (localxp != xp.values()[0])
        str = str + "|";
      str = str + localxp.GB();
    }
    str = str + ")\\]";
  }
}