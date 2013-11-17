import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;
import java.util.zip.CRC32;

public class bCO
{
  public static final float gxh = 3.141593F;
  public static final Random gxi;
  private static final CRC32 gxj;
  public static final float dua = 1.0E-005F;
  public static final float gxk = 6.283186F;
  public static final float gxl = 3.141593F;
  public static final float gxm = 1.570796F;
  public static final float gxn = 1.047198F;
  public static final float gxo = 0.7853982F;
  public static final float gxp = 0.5235988F;
  public static final float gxq = 0.3926991F;
  public static final float gxr = 0.01745329F;
  public static final float gxs = 57.29578F;
  public static final double gxt;
  public static final float gxu;
  private static final float[] gxv;
  private static final float[] gxw;
  private static int gxx;
  private static int gxy;
  private static final float[][] gxz = { { 0.5708353F, -0.6139014F, 0.5452267F }, { 0.4132552F, -0.4696516F, -0.780159F }, { 0.6405728F, -0.56433F, 0.5207675F }, { 0.4716922F, 0.6140794F, 0.632782F }, { 0.1522787F, 0.121726F, 0.9808129F }, { -0.8743947F, -0.3485584F, -0.3375516F }, { 0.7713206F, 0.613651F, -0.168812F }, { 0.4826271F, -0.8640989F, -0.142843F }, { 0.4947002F, -0.7475342F, -0.4432428F }, { 0.6329491F, -0.1805553F, 0.7528448F }, { 0.4869739F, 0.5622945F, -0.6683422F }, { 0.228542F, -0.07848456F, -0.9703654F }, { -0.2278852F, -0.7168149F, -0.6589726F }, { -0.638312F, -0.5510635F, 0.5374821F }, { -0.6907991F, 0.686444F, -0.2271368F }, { 0.0342741F, -0.99261F, -0.1164113F }, { 0.2728738F, 0.4116586F, 0.869527F }, { 0.00990071F, 0.635923F, 0.7716889F }, { 0.5978979F, -0.675608F, -0.4313605F }, { -0.9579213F, 0.2860754F, 0.02340163F }, { -0.868781F, -0.3579894F, -0.3421446F }, { -0.6223337F, 0.2561255F, 0.7396625F }, { -0.3543662F, 0.6203524F, -0.699705F }, { -0.8627111F, -0.5032229F, -0.0499609F }, { -0.4263197F, 0.8811234F, -0.204629F }, { 0.5895717F, 0.7441359F, 0.3141131F }, { -0.9304057F, 0.3642617F, 0.04072633F }, { 0.8866713F, 0.04308955F, 0.4603883F }, { -0.2648718F, 0.6299012F, 0.7301146F }, { -0.3194356F, -0.1704759F, -0.9321474F }, { -0.5922897F, 0.4855427F, 0.642994F }, { 0.8475182F, 0.36836F, 0.3821306F }, { -0.5880656F, 0.6549881F, 0.4745201F }, { 0.7625849F, 0.1147434F, -0.63663F }, { 0.6694696F, -0.6793314F, 0.3005317F }, { -0.287328F, -0.5944033F, 0.751084F }, { -0.8043973F, -0.2963362F, 0.5149078F }, { -0.03320302F, 0.6650103F, 0.7460957F }, { -0.7202033F, -0.03790988F, 0.6927264F }, { 0.6309926F, -0.3906175F, -0.6702734F }, { 0.9063712F, -0.366167F, -0.2107436F }, { 0.8494861F, 0.3947938F, 0.3500159F }, { 0.9216346F, 0.3775673F, 0.08962431F }, { 0.278925F, -0.876532F, -0.392291F }, { 0.2542012F, -0.9606544F, 0.111915F }, { 0.347059F, -0.7478827F, 0.5658811F }, { -0.3868459F, 0.783865F, 0.4857014F }, { 0.320662F, 0.7031841F, 0.634593F }, { -0.5732749F, 0.296697F, -0.763758F }, { 0.603305F, 0.7850254F, -0.1405643F }, { 0.7512555F, 0.3619039F, -0.5519428F }, { -0.6551819F, 0.610656F, -0.4447875F }, { 0.9809997F, 0.143693F, -0.1303524F }, { -0.6029437F, -0.6300851F, -0.4893382F }, { -0.3663285F, -0.8380485F, -0.4043244F }, { 0.880623F, 0.402645F, -0.2497607F }, { -0.3946621F, 0.4755198F, -0.786208F }, { 0.07596095F, 0.4059133F, 0.9107493F }, { 0.702105F, 0.3449947F, -0.6229181F }, { 0.5622422F, -0.6330723F, 0.5320746F }, { -0.4350993F, 0.4180273F, -0.7974595F }, { -0.461028F, 0.3033429F, -0.8339282F }, { -0.4637706F, -0.424434F, 0.777671F }, { 0.2465587F, -0.7575924F, -0.6043695F }, { 0.8609697F, -0.4654239F, 0.2052118F }, { -0.5761994F, 0.7141871F, 0.3974055F }, { -0.4098885F, 0.653704F, -0.6361304F }, { -0.156657F, 0.7326548F, -0.6623259F }, { 0.6951415F, -0.717503F, 0.04435876F }, { 0.535588F, 0.2820334F, -0.7959917F }, { -0.708387F, -0.7029033F, -0.06414832F }, { -0.0602829F, 0.96048F, 0.2717446F }, { -0.4737863F, -0.8492266F, 0.2331112F }, { 0.09777062F, 0.975437F, -0.1973915F }, { -0.938247F, 0.3459661F, -0.0002834754F }, { -0.0528417F, 0.02032114F, -0.998396F }, { 0.422827F, 0.4732117F, -0.7728441F }, { 0.9702957F, 0.233958F, -0.06156113F }, { -0.6260152F, -0.5795249F, 0.5217814F }, { -0.6479445F, 0.7608896F, -0.03485559F }, { 0.0660722F, 0.9974566F, -0.0267383F }, { -0.6674177F, 0.364852F, -0.6491815F }, { 0.1863055F, 0.9119203F, -0.365639F }, { -0.7228599F, 0.1991739F, -0.6616671F }, { -0.1155393F, 0.869136F, 0.4808889F }, { 0.5482941F, 0.618027F, -0.5633971F }, { 0.593462F, 0.5478089F, -0.5896679F }, { 0.639189F, 0.2074478F, -0.7405422F }, { -0.639159F, -0.6415075F, 0.4241976F }, { -0.454964F, 0.6583679F, -0.5996329F }, { -0.871361F, -0.4141183F, -0.263129F }, { 0.9230238F, 0.04600238F, -0.3819829F }, { 0.07584454F, 0.8657752F, 0.4946525F }, { 0.8783598F, -0.2042444F, 0.432167F }, { 0.2786472F, -0.4547935F, -0.8458833F }, { 0.8800522F, -0.1238761F, 0.4584352F }, { 0.6028159F, -0.4979191F, -0.6234496F }, { -0.3991424F, 0.6944652F, 0.598668F }, { 0.4277038F, -0.656982F, -0.6208414F }, { 0.9394859F, 0.3282087F, -0.09820987F }, { 0.976861F, 0.02923175F, 0.2118683F }, { 0.1721456F, -0.4170242F, -0.8924442F }, { 0.0894661F, 0.9677178F, -0.235623F }, { -0.8162444F, -0.577697F, 0.003336679F }, { -0.2162678F, -0.7443695F, -0.6317771F }, { 0.1735309F, -0.1940609F, -0.9655193F }, { -0.9365822F, 0.3346914F, 0.1039019F }, { 0.7071796F, -0.6503142F, 0.2774679F }, { -0.4395213F, 0.878935F, 0.1851847F }, { -0.5484355F, -0.642256F, 0.5354676F }, { 0.795935F, 0.1751962F, 0.5794771F }, { 0.925516F, -0.2896319F, -0.2439952F }, { 0.955958F, 0.1536951F, 0.250044F }, { -0.809686F, 0.583312F, 0.06446613F }, { 0.9512082F, -0.07180032F, 0.3000795F }, { 0.3947988F, 0.4133883F, -0.8205144F }, { 0.4969092F, 0.851779F, -0.1659911F }, { 0.6526827F, -0.4120457F, 0.6357858F }, { 0.4568873F, -0.6149302F, -0.64274F }, { 0.3382903F, -0.9316731F, 0.1324575F }, { -0.376893F, -0.863641F, -0.3347777F }, { -0.6898719F, 0.5089235F, 0.5148529F }, { -0.9813364F, -0.003560476F, -0.192266F }, { -0.6721537F, 0.415151F, -0.6130734F }, { 0.7563062F, -0.4807457F, 0.4437167F }, { 0.8540043F, -0.4223006F, 0.3038732F }, { -0.4658324F, 0.4535278F, 0.759811F }, { -0.4586807F, -0.5417392F, 0.7043655F }, { -0.6779395F, 0.09315205F, 0.7291918F }, { -0.8336349F, -0.5523117F, 0.0021758F }, { -0.6842901F, -0.1216667F, 0.7189884F }, { -0.6867551F, -0.1460664F, 0.7120618F }, { 0.7247291F, -0.06969679F, -0.6854999F }, { 0.4960045F, 0.7654496F, -0.4099588F }, { 0.407532F, 0.1291176F, -0.9040168F }, { 0.731161F, -0.5036977F, 0.4601007F }, { 0.7102183F, -0.6615177F, -0.2407992F }, { 0.00265691F, 0.9084792F, -0.4179216F }, { 0.3986762F, -0.699413F, -0.5931934F }, { 0.4815642F, 0.6983988F, 0.5294668F }, { 0.528222F, -0.064928F, -0.8466203F }, { 0.6755618F, 0.6992443F, 0.233824F }, { -0.7088862F, 0.1823847F, 0.6813341F }, { -0.7388302F, -0.1672183F, -0.6528155F }, { 0.2063491F, -0.9285104F, 0.3086886F }, { -0.1921599F, 0.070541F, -0.9788252F }, { -0.5823455F, -0.1968788F, -0.7887411F }, { -0.040857F, 0.6282986F, -0.7768986F }, { -0.1988984F, 0.6212684F, -0.7579347F }, { 0.4141958F, -0.8725848F, 0.2589161F }, { 0.386978F, -0.6417822F, 0.6620902F }, { -0.7703481F, -0.637368F, 0.01804982F }, { 0.4336925F, -0.2990099F, 0.8500024F }, { -0.2883942F, 0.1907694F, 0.9383155F }, { -0.432032F, -0.4884265F, 0.7581477F }, { -0.4478179F, 0.04616318F, -0.8929324F }, { 0.7093718F, 0.1890682F, -0.6790028F }, { 0.356534F, -0.9072912F, 0.2229486F }, { 0.9355106F, -0.2235231F, -0.2736007F }, { 0.6762252F, 0.5192115F, -0.5226269F }, { 0.04846009F, 0.7564253F, -0.6522825F }, { -0.968152F, 0.2260463F, -0.1076285F }, { -0.6444421F, -0.5538665F, -0.5271871F }, { 0.6941376F, -0.08813985F, -0.7144259F }, { -0.008108428F, -0.4474733F, 0.8942606F }, { 0.9290844F, 0.1912445F, -0.3165878F }, { -0.8386886F, 0.2213928F, 0.497581F }, { -0.7068576F, -0.4093104F, 0.5769032F }, { -0.6881402F, -0.678856F, 0.2561593F }, { 0.4982763F, 0.6138209F, -0.6123272F }, { 0.2721483F, 0.7111862F, -0.6481895F }, { -0.7745531F, -0.1579883F, 0.61246F }, { -0.52419F, 0.7304407F, 0.4378142F }, { -0.2052423F, -0.04481616F, 0.9776846F }, { 0.5607051F, 0.577052F, 0.593819F }, { 0.4662902F, 0.7085491F, 0.5296522F }, { -0.6417161F, 0.7036523F, 0.3050801F }, { 0.5504509F, 0.2516242F, 0.796046F }, { 0.3124787F, 0.640439F, -0.7015666F }, { -0.3470818F, -0.8063192F, -0.47894F }, { 0.4533105F, 0.012785F, 0.891261F }, { 0.3402281F, -0.525888F, -0.7795426F }, { -0.5377899F, -0.8430184F, -0.01009843F }, { 0.554847F, 0.4703298F, 0.6862469F }, { 0.7934082F, 0.5978481F, -0.1143727F }, { 0.841805F, -0.1222733F, 0.5257506F }, { -0.3408287F, -0.7949187F, -0.5019364F }, { 0.6949356F, -0.334751F, 0.6364012F }, { -0.713217F, 0.5154967F, -0.4749573F }, { 0.6188621F, 0.1446276F, -0.7720703F }, { 0.1690832F, 0.8295986F, -0.532144F }, { -0.7172616F, 0.6967959F, 0.003363893F }, { -0.7435784F, 0.2381989F, 0.6247819F }, { 0.6631706F, 0.7261589F, -0.181378F }, { 0.4386407F, 0.8204559F, -0.3666696F }, { 0.1687384F, -0.8197722F, -0.5472667F }, { 0.1020667F, 0.1819733F, 0.9779919F }, { -0.003088902F, -0.4168414F, 0.9089739F }, { -0.3060569F, 0.6826242F, 0.6635913F }, { -0.405654F, 0.7936871F, 0.4533274F }, { -0.7287459F, 0.627386F, 0.2744384F }, { -0.5983348F, -0.2867149F, -0.7481912F }, { 0.546525F, 0.4105477F, 0.7299047F }, { 0.8590134F, -0.1863427F, 0.4768358F }, { -0.5587658F, 0.8251408F, 0.08320648F }, { 0.7395675F, -0.662648F, 0.1180597F }, { 0.5116888F, 0.7745279F, -0.3718618F }, { 0.5730044F, 0.6709918F, -0.47057F }, { -0.8265536F, -0.140608F, -0.5450124F }, { 0.66644F, 0.04516847F, -0.744189F }, { -0.646514F, 0.5048743F, 0.5719454F }, { 0.2231749F, 0.9734679F, 0.05052877F }, { 0.8850123F, 0.3770126F, -0.2731571F }, { 0.578584F, 0.5675244F, -0.585796F }, { 0.4901663F, 0.6107312F, -0.6218879F }, { 0.6495792F, 0.6529948F, 0.389416F }, { 0.3801904F, -0.9121227F, -0.1532561F }, { 0.7580674F, -0.2541926F, 0.6005996F }, { 0.4478577F, 0.7788233F, -0.439156F }, { -0.324437F, 0.3264228F, -0.8878F }, { 0.09900978F, 0.5097075F, 0.8546317F }, { -0.2937438F, 0.526333F, -0.7979277F }, { 0.9082893F, 0.2812832F, 0.3096616F }, { 0.9688025F, 0.0817761F, 0.2339541F }, { -0.4257678F, -0.2090773F, -0.8803456F }, { -0.6762167F, 0.436051F, -0.5937932F }, { -0.7104877F, 0.648522F, -0.2731794F }, { -0.9262357F, 0.122954F, 0.3563279F }, { -0.8543634F, -0.5104818F, 0.09732187F }, { -0.7734761F, -0.07080485F, 0.629858F }, { -0.589429F, -0.1853201F, 0.786276F }, { 0.3578834F, 0.8735291F, 0.329949F }, { -0.8244525F, -0.261671F, 0.501803F }, { -0.328173F, 0.8881941F, 0.3215804F }, { -0.5771918F, 0.512601F, -0.635681F }, { -0.5927615F, 0.3399834F, -0.7300993F }, { 0.04652253F, -0.2348098F, -0.9709274F }, { -0.5168656F, 0.8045143F, 0.2925862F }, { -0.153501F, 0.0304608F, 0.987679F }, { 0.5606552F, -0.5814097F, -0.5896004F }, { -0.4344841F, -0.529094F, 0.7288917F }, { -0.1900027F, 0.7594953F, 0.6221462F }, { 0.3831752F, -0.7962402F, -0.4681649F }, { 0.08458876F, 0.8813494F, -0.4648311F }, { 0.692885F, -0.7181526F, -0.0645543F }, { 0.848042F, 0.310419F, 0.4294939F }, { 0.6095336F, 0.3941969F, -0.6878063F }, { -0.9411591F, -0.1337674F, 0.310364F }, { 0.7096913F, -0.126569F, -0.6930502F }, { -0.6335558F, -0.4813395F, 0.6057386F }, { -0.8322148F, -0.5454283F, -0.0996312F }, { 0.1635391F, -0.917557F, -0.3624136F }, { -0.7896088F, -0.3313309F, -0.5164666F }, { 0.490911F, 0.6483417F, 0.5819445F }, { -0.7029837F, -0.6256284F, 0.3382354F }, { 0.6494896F, -0.3249732F, -0.6874268F } };

  private static final float[][] gxA = { { 0.4975613F, 0.2244832F, 0.8378784F }, { 0.1471782F, 0.001476921F, 0.9891089F }, { 0.2717708F, 0.3083952F, 0.9116102F }, { 0.1955972F, 0.02365086F, 0.9803991F }, { 0.331441F, 0.1631638F, 0.9292601F }, { 0.06737462F, 0.2740468F, 0.9593535F }, { 0.1512537F, 0.05353529F, 0.9870443F }, { 0.05284634F, 0.2111024F, 0.9760343F }, { 0.02034855F, 0.9956124F, 0.09133342F }, { 0.3726079F, 0.219475F, 0.9016618F }, { 0.01607458F, 0.2444246F, 0.9695351F }, { 0.1501835F, 0.1799476F, 0.9721439F }, { 0.1240574F, 0.05102748F, 0.9909621F }, { 0.06034564F, 0.1311387F, 0.9895257F }, { 0.04406986F, 0.1449926F, 0.9884508F }, { 0.4890187F, 0.255729F, 0.833945F }, { 0.404263F, 0.8102286F, 0.4243833F }, { 0.1400851F, 0.5821627F, 0.8009138F }, { 0.1489376F, 0.06965798F, 0.9863901F }, { 0.840596F, 0.5148547F, 0.1682945F }, { 0.1830598F, 0.0730659F, 0.980383F }, { 0.2027132F, 0.9737819F, 0.1032287F }, { 0.1742469F, 0.329279F, 0.9280158F }, { 0.3456133F, 0.02019202F, 0.9381598F }, { 0.254851F, 0.02492159F, 0.9666591F }, { 0.09820176F, 0.1640255F, 0.981556F }, { 0.101472F, 0.189009F, 0.9767185F }, { 0.6014152F, 0.1043435F, 0.7920936F }, { 0.1110119F, 0.1301658F, 0.985258F }, { 0.1275416F, 0.135393F, 0.9825487F }, { 0.2787766F, 0.2270738F, 0.9331244F }, { 0.0322129F, 0.4238338F, 0.905167F }, { 0.1569111F, 0.0287113F, 0.9871953F }, { 0.0888859F, 0.09613364F, 0.9913918F }, { 0.3051871F, 0.1501517F, 0.9403805F }, { 0.08545087F, 0.1289388F, 0.987964F }, { 0.1068607F, 0.118308F, 0.9872102F }, { 0.1463141F, 0.1570732F, 0.9766884F }, { 0.145382F, 0.1972639F, 0.9695107F }, { 0.0412977F, 0.216926F, 0.975314F }, { 0.3480543F, 0.1697548F, 0.9219769F }, { 0.1283469F, 0.07743836F, 0.9887013F }, { 0.5458888F, 0.3492899F, 0.7615787F }, { 0.1908336F, 0.152376F, 0.969724F }, { 0.1151322F, 0.04820036F, 0.9921801F }, { 0.07832789F, 0.2751789F, 0.9581969F }, { 0.1791477F, 0.05800988F, 0.9821104F }, { 0.2784201F, 0.1762149F, 0.9441561F }, { 0.0925104F, 0.1245505F, 0.987891F }, { 0.08815455F, 0.1006855F, 0.9910052F }, { 0.3248586F, 0.6316893F, 0.7038718F }, { 0.08309894F, 0.108092F, 0.990662F }, { 0.1164537F, 0.3749372F, 0.9197068F }, { 0.09285728F, 0.2744433F, 0.9571095F }, { 0.09286511F, 0.1021446F, 0.9904254F }, { 0.08153807F, 0.1368768F, 0.9872266F }, { 0.09908146F, 0.240129F, 0.965671F }, { 0.2967209F, 0.1370712F, 0.9450758F }, { 0.1699756F, 0.120903F, 0.9780034F }, { 0.644406F, 0.3565725F, 0.6764591F }, { 0.3255589F, 0.1321274F, 0.9362446F }, { 0.214134F, 0.217981F, 0.9521716F }, { 0.1031076F, 0.1307052F, 0.9860451F }, { 0.2943317F, 0.1319489F, 0.9465507F }, { 0.4688346F, 0.8828301F, 0.02837612F }, { 0.106797F, 0.1309076F, 0.9856254F }, { 0.176981F, 0.07421359F, 0.9814124F }, { 0.169767F, 0.08335241F, 0.981953F }, { 0.1588891F, 0.0005585878F, 0.9872963F }, { 0.0997858F, 0.1454202F, 0.984325F }, { 0.04894697F, 0.1584401F, 0.9861546F }, { 0.3304698F, 0.4106115F, 0.8498164F }, { 0.1395365F, 0.1481158F, 0.9790767F }, { 0.1291763F, 0.01972225F, 0.9914255F }, { 0.230329F, 0.1534236F, 0.9609422F }, { 0.04405832F, 0.1222713F, 0.9915183F }, { 0.09330104F, 0.1272128F, 0.9874775F }, { 0.6186327F, 0.5913308F, 0.5173215F }, { 0.6337878F, 0.771834F, 0.0508527F }, { 0.374922F, 0.3864993F, 0.842646F }, { 0.02968728F, 0.2742973F, 0.9611867F }, { 0.09935042F, 0.096224F, 0.990389F }, { 0.07249868F, 0.150897F, 0.9858875F }, { 0.5379798F, 0.7171547F, 0.4430203F }, { 0.188842F, 0.07182939F, 0.9793769F }, { 0.5932034F, 0.029998F, 0.8044935F }, { 0.1726483F, 0.1909994F, 0.9662876F }, { 0.2491251F, 0.07369533F, 0.9656634F }, { 0.115621F, 0.112318F, 0.986923F }, { 0.08351392F, 0.3054667F, 0.9485334F }, { 0.171408F, 0.239222F, 0.955716F }, { 0.06740571F, 0.1374334F, 0.9882149F }, { 0.08116575F, 0.1336772F, 0.9876955F }, { 0.08952832F, 0.1764687F, 0.9802263F }, { 0.1277317F, 0.1125377F, 0.9854034F }, { 0.1134206F, 0.1655832F, 0.9796519F }, { 0.08931992F, 0.1747039F, 0.9805613F }, { 0.1471271F, 0.117708F, 0.982089F }, { 0.3307236F, 0.07222591F, 0.9409598F }, { 0.3112319F, 0.02846323F, 0.9499077F }, { 0.4895888F, 0.08672012F, 0.8676304F }, { 0.0830861F, 0.09630138F, 0.9918784F }, { 0.2984844F, 0.3545508F, 0.8861156F }, { 0.7432745F, 0.4939974F, 0.4511204F }, { 0.2869368F, 0.05372302F, 0.9564419F }, { 0.3224211F, 0.226892F, 0.9190019F }, { 0.301785F, 0.2849079F, 0.9098095F }, { 0.4798638F, 0.4086944F, 0.7763373F }, { 0.1703531F, 0.1113232F, 0.9790745F }, { 0.037479F, 0.2048879F, 0.9780676F }, { 0.3274832F, 0.1321303F, 0.935573F }, { 0.0659988F, 0.5471322F, 0.8344402F }, { 0.1271333F, 0.229587F, 0.9649492F }, { 0.15077F, 0.01174767F, 0.988499F }, { 0.1421358F, 0.0453922F, 0.9888058F }, { 0.1050752F, 0.0871994F, 0.9906339F }, { 0.07965378F, 0.1132427F, 0.9903693F }, { 0.09819041F, 0.1518542F, 0.9835137F }, { 0.07062863F, 0.109996F, 0.9914194F }, { 0.1725401F, 0.04153475F, 0.9841265F }, { 0.2213996F, 0.2440011F, 0.944164F }, { 0.1191241F, 0.0768585F, 0.9899001F }, { 0.1570387F, 0.1080132F, 0.981668F }, { 0.136433F, 0.9344091F, 0.3290375F }, { 0.1655011F, 0.166442F, 0.972063F }, { 0.1677325F, 0.1372865F, 0.9762265F }, { 0.007919231F, 0.1311469F, 0.9913313F }, { 0.1644369F, 0.1424748F, 0.9760438F }, { 0.02652751F, 0.2846124F, 0.9582756F }, { 0.375605F, 0.1286626F, 0.9178054F }, { 0.004631573F, 0.1461478F, 0.989252F }, { 0.189623F, 0.1389914F, 0.9719694F }, { 0.09867623F, 0.1919126F, 0.976439F }, { 0.6580259F, 0.02899912F, 0.7524366F }, { 0.1789979F, 0.1624649F, 0.970343F }, { 0.5974721F, 0.4293554F, 0.67726F }, { 0.9811881F, 0.1720422F, 0.08758657F }, { 0.1767513F, 0.1636687F, 0.9705522F }, { 0.2871354F, 0.1967288F, 0.9374706F }, { 0.288206F, 0.2882314F, 0.9131593F }, { 0.8898462F, 0.03912875F, 0.4545797F }, { 0.6905361F, 0.0775412F, 0.7191296F }, { 0.1508212F, 0.180138F, 0.9720101F }, { 0.3391668F, 0.317445F, 0.885548F }, { 0.2701476F, 0.25525F, 0.9283685F }, { 0.5789823F, 0.656693F, 0.4832529F }, { 0.1518327F, 0.07357982F, 0.9856637F }, { 0.7191466F, 0.3968967F, 0.5703518F }, { 0.1080095F, 0.196742F, 0.9744878F }, { 0.9181333F, 0.3001031F, 0.2587846F }, { 0.01330525F, 0.4400341F, 0.8978825F }, { 0.9148535F, 0.0643394F, 0.398627F }, { 0.13969F, 0.00495142F, 0.9901829F }, { 0.5770786F, 0.7725552F, 0.2648372F }, { 0.1154302F, 0.5179759F, 0.8475712F }, { 0.1156836F, 0.07634384F, 0.9903479F }, { 0.03741293F, 0.3117188F, 0.949438F }, { 0.1758599F, 0.1039F, 0.978917F }, { 0.06685313F, 0.2098842F, 0.975438F }, { 0.2163622F, 0.2121021F, 0.9529954F }, { 0.06542105F, 0.1193955F, 0.990689F }, { 0.158119F, 0.0939761F, 0.9829378F }, { 0.5077691F, 0.2264546F, 0.8311973F }, { 0.4810373F, 0.2761074F, 0.8320864F }, { 0.2025212F, 0.167005F, 0.9649324F }, { 0.02518381F, 0.3096152F, 0.9505283F }, { 0.0667333F, 0.105116F, 0.9922183F }, { 0.138574F, 0.1957917F, 0.9708052F }, { 0.4939374F, 0.06480283F, 0.8670793F }, { 0.2229222F, 0.1161763F, 0.9678888F }, { 0.2127594F, 0.3167579F, 0.9243364F }, { 0.006743938F, 0.1251328F, 0.9921171F }, { 0.2163814F, 0.07033642F, 0.9737719F }, { 0.1481729F, 0.0981366F, 0.9840803F }, { 0.08377457F, 0.2182233F, 0.9722964F }, { 0.2753128F, 0.06116114F, 0.9594072F }, { 0.1411714F, 0.2145816F, 0.9664499F }, { 0.03019351F, 0.1742926F, 0.9842309F }, { 0.125214F, 0.2287044F, 0.96541F }, { 0.141464F, 0.1373834F, 0.9803641F }, { 0.10774F, 0.1050096F, 0.9886177F }, { 0.1539683F, 0.5417584F, 0.8263121F }, { 0.04914795F, 0.2435632F, 0.9686391F }, { 0.08580625F, 0.1015948F, 0.9911184F }, { 0.4254127F, 0.3578491F, 0.831245F }, { 0.193599F, 0.08969823F, 0.9769716F }, { 0.07467243F, 0.2009263F, 0.9767562F }, { 0.3272849F, 0.6910123F, 0.644505F }, { 0.3462249F, 0.1600415F, 0.9243999F }, { 0.1297099F, 0.1249203F, 0.9836515F }, { 0.1370795F, 0.049451F, 0.9893249F }, { 0.07557739F, 0.1667772F, 0.983094F }, { 0.5764278F, 0.1618982F, 0.8009495F }, { 0.117379F, 0.0978234F, 0.9882575F }, { 0.08197988F, 0.1219356F, 0.9891466F }, { 0.2892012F, 0.1228174F, 0.9493569F }, { 0.2149371F, 0.350424F, 0.9115947F }, { 0.04949367F, 0.3594826F, 0.9318383F }, { 0.01704402F, 0.1890532F, 0.9818189F }, { 0.0284027F, 0.1916186F, 0.9810584F }, { 0.0212058F, 0.1454378F, 0.9891402F }, { 0.1460896F, 0.08215707F, 0.985854F }, { 0.350044F, 0.02759028F, 0.9363269F }, { 0.4605753F, 0.2930635F, 0.837845F }, { 0.162201F, 0.06479218F, 0.9846283F }, { 0.2193794F, 0.3685551F, 0.9033493F }, { 0.08758094F, 0.1161045F, 0.9893681F }, { 0.1736783F, 0.2099406F, 0.9621646F }, { 0.06649119F, 0.1207518F, 0.9904534F }, { 0.08600856F, 0.114495F, 0.9896936F }, { 0.09365819F, 0.146049F, 0.984834F }, { 0.1117439F, 0.09896309F, 0.988797F }, { 0.1800464F, 0.1041909F, 0.9781246F }, { 0.1404172F, 0.117173F, 0.9831346F }, { 0.128689F, 0.1700531F, 0.976996F }, { 0.09477305F, 0.3862537F, 0.9175109F }, { 0.06009529F, 0.320112F, 0.9454718F }, { 0.7339581F, 0.4212839F, 0.5327525F }, { 0.2925296F, 0.1768557F, 0.9397598F }, { 0.645471F, 0.6363059F, 0.4224713F }, { 0.2991647F, 0.04509231F, 0.9531354F }, { 0.0340174F, 0.2090626F, 0.9773105F }, { 0.05824569F, 0.123476F, 0.9906367F }, { 0.07014034F, 0.2575727F, 0.9637098F }, { 0.1576869F, 0.1855886F, 0.9698926F }, { 0.221608F, 0.1311231F, 0.96628F }, { 0.1754506F, 0.2487214F, 0.9525517F }, { 0.002583423F, 0.3857257F, 0.92261F }, { 0.1804317F, 0.1997408F, 0.9630929F }, { 0.05227348F, 0.139042F, 0.9889059F }, { 0.215388F, 0.04857657F, 0.9753196F }, { 0.1043241F, 0.1677143F, 0.9803002F }, { 0.08442982F, 0.1486791F, 0.9852746F }, { 0.1865498F, 0.126238F, 0.9743013F }, { 0.0926326F, 0.1064925F, 0.9899892F }, { 0.184511F, 0.177178F, 0.9667284F }, { 0.1568599F, 0.1790865F, 0.9712482F }, { 0.01811427F, 0.1416165F, 0.9897559F }, { 0.08844289F, 0.2070482F, 0.9743248F }, { 0.05653442F, 0.992793F, 0.1056697F }, { 0.128833F, 0.09958774F, 0.9866531F }, { 0.122742F, 0.04530217F, 0.9914041F }, { 0.9158077F, 0.2857845F, 0.2821763F }, { 0.02154162F, 0.1303375F, 0.9912356F }, { 0.2452634F, 0.4963911F, 0.832732F }, { 0.1463753F, 0.05371274F, 0.9877698F }, { 0.08568521F, 0.1319186F, 0.9875503F }, { 0.4687859F, 0.5839647F, 0.6627405F }, { 0.631431F, 0.5700715F, 0.5256547F }, { 0.2634596F, 0.1477117F, 0.9532945F }, { 0.1767656F, 0.0305211F, 0.9837796F }, { 0.4498411F, 0.6537991F, 0.6084321F }, { 0.5786396F, 0.6376385F, 0.5085208F }, { 0.331F, 0.1202034F, 0.9359434F }, { 0.2224328F, 0.196587F, 0.9549226F }, { 0.1354946F, 0.05314529F, 0.9893517F } };

  public static void setSeed(long paramLong)
  {
    gxi.setSeed(paramLong);
  }

  public static int sf(int paramInt)
  {
    return gxi.nextInt(paramInt);
  }

  public static int bLh() {
    return gxi.nextInt();
  }

  public static int bLi() {
    return gxi.nextInt() >> 1;
  }

  public static int cK(int paramInt1, int paramInt2) {
    return paramInt1 - paramInt2 + gxi.nextInt(2 * paramInt2);
  }

  public static void ag(byte[] paramArrayOfByte)
  {
    gxi.nextBytes(paramArrayOfByte);
  }

  public static boolean bLj()
  {
    return gxi.nextBoolean();
  }

  public static float bLk()
  {
    return gxi.nextFloat();
  }

  public static double bLl()
  {
    return gxi.nextDouble();
  }

  public static int cL(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return paramInt1;
    }

    return gxi.nextInt(paramInt2 - paramInt1) + paramInt1;
  }

  public static long C(long paramLong1, long paramLong2)
  {
    if (paramLong1 == paramLong2) {
      return paramLong1;
    }

    return Math.abs(gxi.nextLong() % (paramLong2 - paramLong1)) + paramLong1;
  }

  public static float U(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 == paramFloat2) {
      return paramFloat1;
    }

    return gxi.nextFloat() * (paramFloat2 - paramFloat1) + paramFloat1;
  }

  public static float s(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return paramFloat1 + paramFloat3 * (paramFloat2 - paramFloat1);
  }

  public static double e(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return paramDouble1 + paramDouble3 * (paramDouble2 - paramDouble1);
  }

  public static short d(short paramShort1, short paramShort2, short paramShort3)
  {
    return paramShort1 >= paramShort3 ? paramShort3 : paramShort1 <= paramShort2 ? paramShort2 : paramShort1;
  }

  public static int J(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt1 >= paramInt3 ? paramInt3 : paramInt1 <= paramInt2 ? paramInt2 : paramInt1;
  }

  public static long e(long paramLong1, long paramLong2, long paramLong3)
  {
    return paramLong1 >= paramLong3 ? paramLong3 : paramLong1 <= paramLong2 ? paramLong2 : paramLong1;
  }

  public static float t(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return paramFloat1 >= paramFloat3 ? paramFloat3 : paramFloat1 <= paramFloat2 ? paramFloat2 : paramFloat1;
  }

  public static double f(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return paramDouble1 >= paramDouble3 ? paramDouble3 : paramDouble1 <= paramDouble2 ? paramDouble2 : paramDouble1;
  }

  public static float bB(float paramFloat)
  {
    float f = Math.abs(paramFloat);

    return Math.signum(paramFloat) * (f - bD(f));
  }

  public static double v(double paramDouble)
  {
    double d = Math.abs(paramDouble);

    return Math.signum(paramDouble) * (d - x(d));
  }

  public static float h(float paramFloat, int paramInt)
  {
    BigDecimal localBigDecimal = BigDecimal.valueOf(paramFloat);
    return localBigDecimal.round(new MathContext(localBigDecimal.precision() - localBigDecimal.scale() + paramInt)).floatValue();
  }

  public static double b(double paramDouble, int paramInt)
  {
    BigDecimal localBigDecimal = BigDecimal.valueOf(paramDouble);
    return localBigDecimal.round(new MathContext(localBigDecimal.precision() - localBigDecimal.scale() + paramInt)).doubleValue();
  }

  public static int bC(float paramFloat)
  {
    return bD(paramFloat + 0.5F);
  }

  public static long w(double paramDouble)
  {
    return x(paramDouble + 0.5D);
  }

  public static int bD(float paramFloat)
  {
    int i = (int)paramFloat;
    if (paramFloat >= 0.0F) {
      return i;
    }
    return i == paramFloat ? i : i - 1;
  }

  public static int aB(float paramFloat)
  {
    int i = (int)paramFloat;
    if (paramFloat <= 0.0F) {
      return i;
    }
    return i == paramFloat ? i : i + 1;
  }

  public static long x(double paramDouble)
  {
    long l = ()paramDouble;
    if (paramDouble >= 0.0D) {
      return l;
    }
    return l == paramDouble ? l : l - 1L;
  }

  public static long y(double paramDouble)
  {
    int i = (int)paramDouble;
    if (paramDouble <= 0.0D) {
      return i;
    }
    return i == paramDouble ? i : i + 1;
  }

  public static float V(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 >= paramFloat2 ? paramFloat1 : paramFloat2;
  }

  public static float W(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 >= paramFloat2 ? paramFloat2 : paramFloat1;
  }

  public static byte j(byte paramByte1, byte paramByte2) {
    return paramByte1 >= paramByte2 ? paramByte2 : paramByte1;
  }

  public static short E(short paramShort1, short paramShort2) {
    return paramShort1 >= paramShort2 ? paramShort2 : paramShort1;
  }

  public static byte k(byte paramByte1, byte paramByte2) {
    return paramByte1 >= paramByte2 ? paramByte1 : paramByte2;
  }

  public static short F(short paramShort1, short paramShort2) {
    return paramShort1 >= paramShort2 ? paramShort1 : paramShort2;
  }

  public static byte c(byte paramByte1, byte paramByte2, byte paramByte3) {
    return k(j(paramByte1, paramByte2), paramByte3);
  }

  public static byte gn(long paramLong) {
    return (byte)(int)e(paramLong, -128L, 127L);
  }

  public static short go(long paramLong) {
    return (short)(int)e(paramLong, -32768L, 32767L);
  }

  public static short gp(long paramLong) {
    return (short)(int)e(paramLong, 0L, 32767L);
  }

  public static int gq(long paramLong) {
    return (int)e(paramLong, -2147483648L, 2147483647L);
  }

  public static int gr(long paramLong) {
    return (int)e(paramLong, 0L, 2147483647L);
  }

  public static long cM(int paramInt1, int paramInt2)
  {
    long l1 = paramInt1 & 0xFFFFFFFF;
    long l2 = paramInt2 & 0xFFFFFFFF;
    return l1 << 32 | l2;
  }

  public static int gs(long paramLong) {
    return (int)(paramLong >> 32 & 0xFFFFFFFF);
  }

  public static int gt(long paramLong) {
    return (int)(paramLong & 0xFFFFFFFF);
  }

  public static int c(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    int i = paramByte1 & 0xFF;
    int j = paramByte2 & 0xFF;
    int k = paramByte3 & 0xFF;
    int m = paramByte4 & 0xFF;

    return i << 8 | j << 16 | k << 24 | m;
  }

  public static short l(byte paramByte1, byte paramByte2)
  {
    int i = (short)((short)paramByte1 & 0xFF);
    int j = (short)((short)paramByte2 & 0xFF);
    return (short)(i << 8 | j);
  }

  public static byte cp(short paramShort) {
    return (byte)(paramShort >> 8 & 0xFF);
  }

  public static byte cq(short paramShort) {
    return (byte)(paramShort & 0xFF);
  }

  public static int G(short paramShort1, short paramShort2)
  {
    int i = paramShort1 & 0xFFFF;
    int j = paramShort2 & 0xFFFF;
    return i << 16 | j;
  }

  public static int cN(int paramInt1, int paramInt2)
  {
    if ((!bB) && ((paramInt1 <= -32768) || (paramInt1 >= 32767))) throw new AssertionError();
    if ((!bB) && ((paramInt2 <= -32768) || (paramInt2 >= 32767))) throw new AssertionError();
    return paramInt1 << 16 | paramInt2 & 0xFFFF;
  }

  public static short sg(int paramInt) {
    return (short)(paramInt >> 16 & 0xFFFF);
  }

  public static short sh(int paramInt) {
    return (short)(paramInt & 0xFFFF);
  }

  public static boolean X(float paramFloat1, float paramFloat2)
  {
    return u(paramFloat1, paramFloat2, 1.0E-005F);
  }

  public static boolean u(float paramFloat1, float paramFloat2, float paramFloat3) {
    return Math.abs(paramFloat1 - paramFloat2) < paramFloat3;
  }

  public static boolean bE(float paramFloat) {
    return X(paramFloat, 0.0F);
  }

  public static boolean z(double paramDouble) {
    return g(paramDouble, 0.0D, 9.999999747378752E-006D);
  }

  public static boolean g(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return x(paramDouble1 / paramDouble3) == x(paramDouble2 / paramDouble3);
  }

  public static float bF(float paramFloat)
  {
    return (float)Math.sin(paramFloat);
  }

  public static float bG(float paramFloat)
  {
    return (float)Math.cos(paramFloat);
  }

  public static float bH(float paramFloat)
  {
    int i = (int)(paramFloat * 57.29578F) % 360;
    if (i < 0) {
      i += 360;
    }
    return gxw[i];
  }

  public static float bI(float paramFloat)
  {
    int i = (int)(paramFloat * 57.29578F) % 360;
    if (i < 0) {
      i += 360;
    }
    return gxv[i];
  }

  public static float bJ(float paramFloat)
  {
    return (float)Math.acos(paramFloat);
  }

  public static float Y(float paramFloat1, float paramFloat2) {
    return (float)Math.atan2(paramFloat1, paramFloat2);
  }

  public static float bK(float paramFloat) {
    return (float)Math.sqrt(paramFloat);
  }

  public static int si(int paramInt)
  {
    for (int i = 0; paramInt >= 2 * i + 1; paramInt -= 2 * i++ + 1);
    return i;
  }

  public static int sj(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    if (paramInt < 2) {
      return paramInt;
    }

    paramInt--;
    paramInt |= paramInt >> 1;
    paramInt |= paramInt >> 2;
    paramInt |= paramInt >> 4;
    paramInt |= paramInt >> 8;
    paramInt |= paramInt >> 16;
    paramInt++; return paramInt;
  }

  public static double A(double paramDouble)
  {
    return paramDouble * paramDouble;
  }

  public static float bL(float paramFloat)
  {
    return paramFloat * paramFloat;
  }

  public static double B(double paramDouble)
  {
    return paramDouble * paramDouble * paramDouble;
  }

  public static float bM(float paramFloat)
  {
    return paramFloat * paramFloat * paramFloat;
  }

  public static int cO(int paramInt1, int paramInt2) {
    int i = 1;
    for (int j = 0; j < paramInt2; j++) {
      i *= paramInt1;
    }

    return i;
  }

  public static long w(long paramLong, int paramInt) {
    long l = 1L;
    for (int i = 0; i < paramInt; i++) {
      l *= paramLong;
    }

    return l;
  }

  public static int sk(int paramInt)
  {
    if ((!bB) && (paramInt <= 0)) throw new AssertionError();
    int i = 1;
    int j = 0;
    while (paramInt > i) {
      i *= 2;
      j++;
    }
    return j;
  }

  public static float bN(float paramFloat)
  {
    return (float)(Math.log(paramFloat) / gxt);
  }

  public static double C(double paramDouble)
  {
    return Math.log(paramDouble) / gxt;
  }

  public static int a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i = Math.max(paramInt1, paramInt2);
    int j = 0; for (int k = paramArrayOfInt.length; j < k; j++) {
      i = Math.max(i, paramArrayOfInt[j]);
    }
    return i;
  }

  public static Random bLm()
  {
    return gxi;
  }

  public static int jF(String paramString)
  {
    gxj.reset();
    gxj.update(paramString.getBytes());
    return (int)gxj.getValue();
  }

  public static float[] bLn() {
    return gxz[(++gxx & 0xFF)];
  }

  public static float[] bLo() {
    return gxA[(++gxy & 0xFF)];
  }

  public static boolean x(long paramLong, int paramInt)
  {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 64))) throw new AssertionError();
    return (paramLong >> paramInt & 1L) == 1L;
  }

  public static long b(long paramLong, int paramInt, boolean paramBoolean)
  {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 64))) throw new AssertionError();
    if (paramBoolean)
      paramLong |= 1L << paramInt;
    else {
      paramLong &= (1L << paramInt ^ 0xFFFFFFFF);
    }

    return paramLong;
  }

  public static boolean i(short paramShort, int paramInt)
  {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 16))) throw new AssertionError();
    return (paramShort >> paramInt & 0x1) == 1;
  }

  public static short a(short paramShort, int paramInt, boolean paramBoolean)
  {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 16))) throw new AssertionError();
    if (paramBoolean)
      paramShort = (short)(paramShort | 1 << paramInt);
    else {
      paramShort = (short)(paramShort & (1 << paramInt ^ 0xFFFFFFFF));
    }

    return paramShort;
  }

  public static int o(long paramLong1, long paramLong2)
  {
    if (paramLong1 > paramLong2) {
      return 1;
    }
    if (paramLong1 < paramLong2) {
      return -1;
    }
    return 0;
  }

  static
  {
    gxi = new yb();
    gxj = new CRC32();

    gxt = Math.log(2.0D);
    gxu = (float)Math.sqrt(2.0D);

    gxv = new float[360];
    gxw = new float[360];

    int i = 0; for (int j = gxv.length; i < j; i++) {
      gxv[i] = ((float)Math.cos(i * 3.141592653589793D / 180.0D));
    }

    i = 0; for (j = gxv.length; i < j; i++)
      gxw[i] = ((float)Math.sin(i * 3.141592653589793D / 180.0D));
  }
}