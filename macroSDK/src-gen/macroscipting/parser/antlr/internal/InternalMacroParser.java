package macroscipting.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import macroscipting.services.MacroGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMacroParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'", "'onLoad'", "'filePath'", "'='", "';'", "'fileName'", "'characterID'", "'scope'", "'compatMicro'", "'true'", "'false'", "'bloc #'", "'dir'", "':'", "'VAR'", "'IF'", "'('", "')'", "'WAIT'", "'LOCK'", "'=='", "'!='", "'EMOTE'", "'DIRECTION'", "'MOVEMENT'", "'GOTO'", "'CHAT'", "'EFFET'", "'TO_MAP'", "'TO_TARGET'", "'TO_SUBZONE'", "'TO_ZONE'", "'TO_SUPERZONE'", "'TO_ALL'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMacroParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMacroParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMacroParser.tokenNames; }
    public String getGrammarFileName() { return "../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g"; }



     	private MacroGrammarAccess grammarAccess;
     	
        public InternalMacroParser(TokenStream input, MacroGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domain";	
       	}
       	
       	@Override
       	protected MacroGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomain"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:67:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:68:2: (iv_ruleDomain= ruleDomain EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:69:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain75);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:76:1: ruleDomain returns [EObject current=null] : ( ( (lv_elements_0_0= ruleonLoadBloc ) ) ( (lv_elements_1_0= ruleBloc ) )* ( (lv_elements_2_0= ruleClass ) )* ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:79:28: ( ( ( (lv_elements_0_0= ruleonLoadBloc ) ) ( (lv_elements_1_0= ruleBloc ) )* ( (lv_elements_2_0= ruleClass ) )* ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:80:1: ( ( (lv_elements_0_0= ruleonLoadBloc ) ) ( (lv_elements_1_0= ruleBloc ) )* ( (lv_elements_2_0= ruleClass ) )* )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:80:1: ( ( (lv_elements_0_0= ruleonLoadBloc ) ) ( (lv_elements_1_0= ruleBloc ) )* ( (lv_elements_2_0= ruleClass ) )* )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:80:2: ( (lv_elements_0_0= ruleonLoadBloc ) ) ( (lv_elements_1_0= ruleBloc ) )* ( (lv_elements_2_0= ruleClass ) )*
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:80:2: ( (lv_elements_0_0= ruleonLoadBloc ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:81:1: (lv_elements_0_0= ruleonLoadBloc )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:81:1: (lv_elements_0_0= ruleonLoadBloc )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:82:3: lv_elements_0_0= ruleonLoadBloc
            {
             
            	        newCompositeNode(grammarAccess.getDomainAccess().getElementsOnLoadBlocParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleonLoadBloc_in_ruleDomain131);
            lv_elements_0_0=ruleonLoadBloc();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"onLoadBloc");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:98:2: ( (lv_elements_1_0= ruleBloc ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:99:1: (lv_elements_1_0= ruleBloc )
            	    {
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:99:1: (lv_elements_1_0= ruleBloc )
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:100:3: lv_elements_1_0= ruleBloc
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getElementsBlocParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBloc_in_ruleDomain152);
            	    lv_elements_1_0=ruleBloc();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"Bloc");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:116:3: ( (lv_elements_2_0= ruleClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:117:1: (lv_elements_2_0= ruleClass )
            	    {
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:117:1: (lv_elements_2_0= ruleClass )
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:118:3: lv_elements_2_0= ruleClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getElementsClassParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClass_in_ruleDomain174);
            	    lv_elements_2_0=ruleClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"Class");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleClass"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:142:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:143:2: (iv_ruleClass= ruleClass EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:144:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass211);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:151:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleClass ) ) )? otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_superType_3_0 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:154:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleClass ) ) )? otherlv_4= '{' otherlv_5= '}' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:155:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleClass ) ) )? otherlv_4= '{' otherlv_5= '}' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:155:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleClass ) ) )? otherlv_4= '{' otherlv_5= '}' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:155:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleClass ) ) )? otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleClass258); 

                	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:159:1: ( (lv_name_1_0= RULE_ID ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:160:1: (lv_name_1_0= RULE_ID )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:160:1: (lv_name_1_0= RULE_ID )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:161:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass275); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:177:2: (otherlv_2= 'extends' ( (lv_superType_3_0= ruleClass ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:177:4: otherlv_2= 'extends' ( (lv_superType_3_0= ruleClass ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleClass293); 

                        	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                        
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:181:1: ( (lv_superType_3_0= ruleClass ) )
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:182:1: (lv_superType_3_0= ruleClass )
                    {
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:182:1: (lv_superType_3_0= ruleClass )
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:183:3: lv_superType_3_0= ruleClass
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypeClassParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_in_ruleClass314);
                    lv_superType_3_0=ruleClass();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		set(
                           			current, 
                           			"superType",
                            		lv_superType_3_0, 
                            		"Class");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleClass328); 

                	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleClass340); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleonLoadBloc"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:215:1: entryRuleonLoadBloc returns [EObject current=null] : iv_ruleonLoadBloc= ruleonLoadBloc EOF ;
    public final EObject entryRuleonLoadBloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleonLoadBloc = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:216:2: (iv_ruleonLoadBloc= ruleonLoadBloc EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:217:2: iv_ruleonLoadBloc= ruleonLoadBloc EOF
            {
             newCompositeNode(grammarAccess.getOnLoadBlocRule()); 
            pushFollow(FOLLOW_ruleonLoadBloc_in_entryRuleonLoadBloc376);
            iv_ruleonLoadBloc=ruleonLoadBloc();

            state._fsp--;

             current =iv_ruleonLoadBloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleonLoadBloc386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleonLoadBloc"


    // $ANTLR start "ruleonLoadBloc"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:224:1: ruleonLoadBloc returns [EObject current=null] : (otherlv_0= 'onLoad' otherlv_1= '{' otherlv_2= 'filePath' otherlv_3= '=' ( (lv_filePath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'fileName' otherlv_7= '=' ( (lv_fileName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'characterID' otherlv_11= '=' ( (lv_characterID_12_0= RULE_INT ) ) otherlv_13= ';' otherlv_14= 'scope' otherlv_15= '=' ( (lv_scope_16_0= ruleScopeType ) ) otherlv_17= ';' otherlv_18= 'compatMicro' otherlv_19= '=' ( ( (lv_compactMicro_20_0= 'true' ) ) | otherlv_21= 'false' ) otherlv_22= ';' otherlv_23= '}' ) ;
    public final EObject ruleonLoadBloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_filePath_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_fileName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_characterID_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_compactMicro_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_scope_16_0 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:227:28: ( (otherlv_0= 'onLoad' otherlv_1= '{' otherlv_2= 'filePath' otherlv_3= '=' ( (lv_filePath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'fileName' otherlv_7= '=' ( (lv_fileName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'characterID' otherlv_11= '=' ( (lv_characterID_12_0= RULE_INT ) ) otherlv_13= ';' otherlv_14= 'scope' otherlv_15= '=' ( (lv_scope_16_0= ruleScopeType ) ) otherlv_17= ';' otherlv_18= 'compatMicro' otherlv_19= '=' ( ( (lv_compactMicro_20_0= 'true' ) ) | otherlv_21= 'false' ) otherlv_22= ';' otherlv_23= '}' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:228:1: (otherlv_0= 'onLoad' otherlv_1= '{' otherlv_2= 'filePath' otherlv_3= '=' ( (lv_filePath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'fileName' otherlv_7= '=' ( (lv_fileName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'characterID' otherlv_11= '=' ( (lv_characterID_12_0= RULE_INT ) ) otherlv_13= ';' otherlv_14= 'scope' otherlv_15= '=' ( (lv_scope_16_0= ruleScopeType ) ) otherlv_17= ';' otherlv_18= 'compatMicro' otherlv_19= '=' ( ( (lv_compactMicro_20_0= 'true' ) ) | otherlv_21= 'false' ) otherlv_22= ';' otherlv_23= '}' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:228:1: (otherlv_0= 'onLoad' otherlv_1= '{' otherlv_2= 'filePath' otherlv_3= '=' ( (lv_filePath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'fileName' otherlv_7= '=' ( (lv_fileName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'characterID' otherlv_11= '=' ( (lv_characterID_12_0= RULE_INT ) ) otherlv_13= ';' otherlv_14= 'scope' otherlv_15= '=' ( (lv_scope_16_0= ruleScopeType ) ) otherlv_17= ';' otherlv_18= 'compatMicro' otherlv_19= '=' ( ( (lv_compactMicro_20_0= 'true' ) ) | otherlv_21= 'false' ) otherlv_22= ';' otherlv_23= '}' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:228:3: otherlv_0= 'onLoad' otherlv_1= '{' otherlv_2= 'filePath' otherlv_3= '=' ( (lv_filePath_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'fileName' otherlv_7= '=' ( (lv_fileName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'characterID' otherlv_11= '=' ( (lv_characterID_12_0= RULE_INT ) ) otherlv_13= ';' otherlv_14= 'scope' otherlv_15= '=' ( (lv_scope_16_0= ruleScopeType ) ) otherlv_17= ';' otherlv_18= 'compatMicro' otherlv_19= '=' ( ( (lv_compactMicro_20_0= 'true' ) ) | otherlv_21= 'false' ) otherlv_22= ';' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleonLoadBloc423); 

                	newLeafNode(otherlv_0, grammarAccess.getOnLoadBlocAccess().getOnLoadKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleonLoadBloc435); 

                	newLeafNode(otherlv_1, grammarAccess.getOnLoadBlocAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleonLoadBloc447); 

                	newLeafNode(otherlv_2, grammarAccess.getOnLoadBlocAccess().getFilePathKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleonLoadBloc459); 

                	newLeafNode(otherlv_3, grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_3());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:244:1: ( (lv_filePath_4_0= RULE_STRING ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:245:1: (lv_filePath_4_0= RULE_STRING )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:245:1: (lv_filePath_4_0= RULE_STRING )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:246:3: lv_filePath_4_0= RULE_STRING
            {
            lv_filePath_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleonLoadBloc476); 

            			newLeafNode(lv_filePath_4_0, grammarAccess.getOnLoadBlocAccess().getFilePathSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOnLoadBlocRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filePath",
                    		lv_filePath_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleonLoadBloc493); 

                	newLeafNode(otherlv_5, grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleonLoadBloc505); 

                	newLeafNode(otherlv_6, grammarAccess.getOnLoadBlocAccess().getFileNameKeyword_6());
                
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleonLoadBloc517); 

                	newLeafNode(otherlv_7, grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_7());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:274:1: ( (lv_fileName_8_0= RULE_STRING ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:275:1: (lv_fileName_8_0= RULE_STRING )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:275:1: (lv_fileName_8_0= RULE_STRING )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:276:3: lv_fileName_8_0= RULE_STRING
            {
            lv_fileName_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleonLoadBloc534); 

            			newLeafNode(lv_fileName_8_0, grammarAccess.getOnLoadBlocAccess().getFileNameSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOnLoadBlocRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fileName",
                    		lv_fileName_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleonLoadBloc551); 

                	newLeafNode(otherlv_9, grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_9());
                
            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleonLoadBloc563); 

                	newLeafNode(otherlv_10, grammarAccess.getOnLoadBlocAccess().getCharacterIDKeyword_10());
                
            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleonLoadBloc575); 

                	newLeafNode(otherlv_11, grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_11());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:304:1: ( (lv_characterID_12_0= RULE_INT ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:305:1: (lv_characterID_12_0= RULE_INT )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:305:1: (lv_characterID_12_0= RULE_INT )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:306:3: lv_characterID_12_0= RULE_INT
            {
            lv_characterID_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleonLoadBloc592); 

            			newLeafNode(lv_characterID_12_0, grammarAccess.getOnLoadBlocAccess().getCharacterIDINTTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOnLoadBlocRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"characterID",
                    		lv_characterID_12_0, 
                    		"INT");
            	    

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleonLoadBloc609); 

                	newLeafNode(otherlv_13, grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_13());
                
            otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleonLoadBloc621); 

                	newLeafNode(otherlv_14, grammarAccess.getOnLoadBlocAccess().getScopeKeyword_14());
                
            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleonLoadBloc633); 

                	newLeafNode(otherlv_15, grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_15());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:334:1: ( (lv_scope_16_0= ruleScopeType ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:335:1: (lv_scope_16_0= ruleScopeType )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:335:1: (lv_scope_16_0= ruleScopeType )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:336:3: lv_scope_16_0= ruleScopeType
            {
             
            	        newCompositeNode(grammarAccess.getOnLoadBlocAccess().getScopeScopeTypeParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleScopeType_in_ruleonLoadBloc654);
            lv_scope_16_0=ruleScopeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnLoadBlocRule());
            	        }
                   		set(
                   			current, 
                   			"scope",
                    		lv_scope_16_0, 
                    		"ScopeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleonLoadBloc666); 

                	newLeafNode(otherlv_17, grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_17());
                
            otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleonLoadBloc678); 

                	newLeafNode(otherlv_18, grammarAccess.getOnLoadBlocAccess().getCompatMicroKeyword_18());
                
            otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleonLoadBloc690); 

                	newLeafNode(otherlv_19, grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_19());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:364:1: ( ( (lv_compactMicro_20_0= 'true' ) ) | otherlv_21= 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:364:2: ( (lv_compactMicro_20_0= 'true' ) )
                    {
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:364:2: ( (lv_compactMicro_20_0= 'true' ) )
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:365:1: (lv_compactMicro_20_0= 'true' )
                    {
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:365:1: (lv_compactMicro_20_0= 'true' )
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:366:3: lv_compactMicro_20_0= 'true'
                    {
                    lv_compactMicro_20_0=(Token)match(input,23,FOLLOW_23_in_ruleonLoadBloc709); 

                            newLeafNode(lv_compactMicro_20_0, grammarAccess.getOnLoadBlocAccess().getCompactMicroTrueKeyword_20_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnLoadBlocRule());
                    	        }
                           		setWithLastConsumed(current, "compactMicro", lv_compactMicro_20_0, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:380:7: otherlv_21= 'false'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleonLoadBloc740); 

                        	newLeafNode(otherlv_21, grammarAccess.getOnLoadBlocAccess().getFalseKeyword_20_1());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_18_in_ruleonLoadBloc753); 

                	newLeafNode(otherlv_22, grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_21());
                
            otherlv_23=(Token)match(input,14,FOLLOW_14_in_ruleonLoadBloc765); 

                	newLeafNode(otherlv_23, grammarAccess.getOnLoadBlocAccess().getRightCurlyBracketKeyword_22());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleonLoadBloc"


    // $ANTLR start "entryRuleBloc"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:400:1: entryRuleBloc returns [EObject current=null] : iv_ruleBloc= ruleBloc EOF ;
    public final EObject entryRuleBloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloc = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:401:2: (iv_ruleBloc= ruleBloc EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:402:2: iv_ruleBloc= ruleBloc EOF
            {
             newCompositeNode(grammarAccess.getBlocRule()); 
            pushFollow(FOLLOW_ruleBloc_in_entryRuleBloc801);
            iv_ruleBloc=ruleBloc();

            state._fsp--;

             current =iv_ruleBloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBloc811); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBloc"


    // $ANTLR start "ruleBloc"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:409:1: ruleBloc returns [EObject current=null] : (otherlv_0= 'bloc #' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_directives_3_0= ruleDirective ) )* otherlv_4= '}' ) ;
    public final EObject ruleBloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_directives_3_0 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:412:28: ( (otherlv_0= 'bloc #' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_directives_3_0= ruleDirective ) )* otherlv_4= '}' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:413:1: (otherlv_0= 'bloc #' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_directives_3_0= ruleDirective ) )* otherlv_4= '}' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:413:1: (otherlv_0= 'bloc #' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_directives_3_0= ruleDirective ) )* otherlv_4= '}' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:413:3: otherlv_0= 'bloc #' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_directives_3_0= ruleDirective ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleBloc848); 

                	newLeafNode(otherlv_0, grammarAccess.getBlocAccess().getBlocKeyword_0());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:417:1: ( (lv_name_1_0= RULE_INT ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:418:1: (lv_name_1_0= RULE_INT )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:418:1: (lv_name_1_0= RULE_INT )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:419:3: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBloc865); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBlocAccess().getNameINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBlocRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBloc882); 

                	newLeafNode(otherlv_2, grammarAccess.getBlocAccess().getLeftCurlyBracketKeyword_2());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:439:1: ( (lv_directives_3_0= ruleDirective ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:440:1: (lv_directives_3_0= ruleDirective )
            	    {
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:440:1: (lv_directives_3_0= ruleDirective )
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:441:3: lv_directives_3_0= ruleDirective
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlocAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDirective_in_ruleBloc903);
            	    lv_directives_3_0=ruleDirective();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlocRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"directives",
            	            		lv_directives_3_0, 
            	            		"Directive");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleBloc916); 

                	newLeafNode(otherlv_4, grammarAccess.getBlocAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBloc"


    // $ANTLR start "entryRuleDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:469:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:470:2: (iv_ruleDirective= ruleDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:471:2: iv_ruleDirective= ruleDirective EOF
            {
             newCompositeNode(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_ruleDirective_in_entryRuleDirective952);
            iv_ruleDirective=ruleDirective();

            state._fsp--;

             current =iv_ruleDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirective962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:478:1: ruleDirective returns [EObject current=null] : (otherlv_0= 'dir' (this_intDirective_1= ruleintDirective | this_strDirective_2= rulestrDirective | this_varDirective_3= rulevarDirective | this_conditionnalDirective_4= ruleconditionnalDirective ) otherlv_5= ';' ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject this_intDirective_1 = null;

        EObject this_strDirective_2 = null;

        EObject this_varDirective_3 = null;

        EObject this_conditionnalDirective_4 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:481:28: ( (otherlv_0= 'dir' (this_intDirective_1= ruleintDirective | this_strDirective_2= rulestrDirective | this_varDirective_3= rulevarDirective | this_conditionnalDirective_4= ruleconditionnalDirective ) otherlv_5= ';' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:482:1: (otherlv_0= 'dir' (this_intDirective_1= ruleintDirective | this_strDirective_2= rulestrDirective | this_varDirective_3= rulevarDirective | this_conditionnalDirective_4= ruleconditionnalDirective ) otherlv_5= ';' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:482:1: (otherlv_0= 'dir' (this_intDirective_1= ruleintDirective | this_strDirective_2= rulestrDirective | this_varDirective_3= rulevarDirective | this_conditionnalDirective_4= ruleconditionnalDirective ) otherlv_5= ';' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:482:3: otherlv_0= 'dir' (this_intDirective_1= ruleintDirective | this_strDirective_2= rulestrDirective | this_varDirective_3= rulevarDirective | this_conditionnalDirective_4= ruleconditionnalDirective ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDirective999); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectiveAccess().getDirKeyword_0());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:486:1: (this_intDirective_1= ruleintDirective | this_strDirective_2= rulestrDirective | this_varDirective_3= rulevarDirective | this_conditionnalDirective_4= ruleconditionnalDirective )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt6=1;
                }
                break;
            case 40:
            case 41:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==27) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==RULE_ID) ) {
                        alt6=3;
                    }
                    else if ( (LA6_6==RULE_STRING) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==30) ) {
                    alt6=4;
                }
                else if ( (LA6_4==27) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 32:
            case 33:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:487:5: this_intDirective_1= ruleintDirective
                    {
                     
                            newCompositeNode(grammarAccess.getDirectiveAccess().getIntDirectiveParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleintDirective_in_ruleDirective1022);
                    this_intDirective_1=ruleintDirective();

                    state._fsp--;

                     
                            current = this_intDirective_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:497:5: this_strDirective_2= rulestrDirective
                    {
                     
                            newCompositeNode(grammarAccess.getDirectiveAccess().getStrDirectiveParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulestrDirective_in_ruleDirective1049);
                    this_strDirective_2=rulestrDirective();

                    state._fsp--;

                     
                            current = this_strDirective_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:507:5: this_varDirective_3= rulevarDirective
                    {
                     
                            newCompositeNode(grammarAccess.getDirectiveAccess().getVarDirectiveParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_rulevarDirective_in_ruleDirective1076);
                    this_varDirective_3=rulevarDirective();

                    state._fsp--;

                     
                            current = this_varDirective_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:517:5: this_conditionnalDirective_4= ruleconditionnalDirective
                    {
                     
                            newCompositeNode(grammarAccess.getDirectiveAccess().getConditionnalDirectiveParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleconditionnalDirective_in_ruleDirective1103);
                    this_conditionnalDirective_4=ruleconditionnalDirective();

                    state._fsp--;

                     
                            current = this_conditionnalDirective_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDirective1115); 

                	newLeafNode(otherlv_5, grammarAccess.getDirectiveAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleconditionnalDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:537:1: entryRuleconditionnalDirective returns [EObject current=null] : iv_ruleconditionnalDirective= ruleconditionnalDirective EOF ;
    public final EObject entryRuleconditionnalDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditionnalDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:538:2: (iv_ruleconditionnalDirective= ruleconditionnalDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:539:2: iv_ruleconditionnalDirective= ruleconditionnalDirective EOF
            {
             newCompositeNode(grammarAccess.getConditionnalDirectiveRule()); 
            pushFollow(FOLLOW_ruleconditionnalDirective_in_entryRuleconditionnalDirective1151);
            iv_ruleconditionnalDirective=ruleconditionnalDirective();

            state._fsp--;

             current =iv_ruleconditionnalDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditionnalDirective1161); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconditionnalDirective"


    // $ANTLR start "ruleconditionnalDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:546:1: ruleconditionnalDirective returns [EObject current=null] : (this_ifDirective_0= ruleifDirective | this_waitDirective_1= rulewaitDirective | this_lockDirective_2= rulelockDirective ) ;
    public final EObject ruleconditionnalDirective() throws RecognitionException {
        EObject current = null;

        EObject this_ifDirective_0 = null;

        EObject this_waitDirective_1 = null;

        EObject this_lockDirective_2 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:549:28: ( (this_ifDirective_0= ruleifDirective | this_waitDirective_1= rulewaitDirective | this_lockDirective_2= rulelockDirective ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:550:1: (this_ifDirective_0= ruleifDirective | this_waitDirective_1= rulewaitDirective | this_lockDirective_2= rulelockDirective )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:550:1: (this_ifDirective_0= ruleifDirective | this_waitDirective_1= rulewaitDirective | this_lockDirective_2= rulelockDirective )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:551:5: this_ifDirective_0= ruleifDirective
                    {
                     
                            newCompositeNode(grammarAccess.getConditionnalDirectiveAccess().getIfDirectiveParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleifDirective_in_ruleconditionnalDirective1208);
                    this_ifDirective_0=ruleifDirective();

                    state._fsp--;

                     
                            current = this_ifDirective_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:561:5: this_waitDirective_1= rulewaitDirective
                    {
                     
                            newCompositeNode(grammarAccess.getConditionnalDirectiveAccess().getWaitDirectiveParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulewaitDirective_in_ruleconditionnalDirective1235);
                    this_waitDirective_1=rulewaitDirective();

                    state._fsp--;

                     
                            current = this_waitDirective_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:571:5: this_lockDirective_2= rulelockDirective
                    {
                     
                            newCompositeNode(grammarAccess.getConditionnalDirectiveAccess().getLockDirectiveParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulelockDirective_in_ruleconditionnalDirective1262);
                    this_lockDirective_2=rulelockDirective();

                    state._fsp--;

                     
                            current = this_lockDirective_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditionnalDirective"


    // $ANTLR start "entryRulestrDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:587:1: entryRulestrDirective returns [EObject current=null] : iv_rulestrDirective= rulestrDirective EOF ;
    public final EObject entryRulestrDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestrDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:588:2: (iv_rulestrDirective= rulestrDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:589:2: iv_rulestrDirective= rulestrDirective EOF
            {
             newCompositeNode(grammarAccess.getStrDirectiveRule()); 
            pushFollow(FOLLOW_rulestrDirective_in_entryRulestrDirective1297);
            iv_rulestrDirective=rulestrDirective();

            state._fsp--;

             current =iv_rulestrDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestrDirective1307); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestrDirective"


    // $ANTLR start "rulestrDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:596:1: rulestrDirective returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulestrDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:599:28: ( ( ( (lv_name_0_0= ruleStringDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:600:1: ( ( (lv_name_0_0= ruleStringDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:600:1: ( ( (lv_name_0_0= ruleStringDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:600:2: ( (lv_name_0_0= ruleStringDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:600:2: ( (lv_name_0_0= ruleStringDirective ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:601:1: (lv_name_0_0= ruleStringDirective )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:601:1: (lv_name_0_0= ruleStringDirective )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:602:3: lv_name_0_0= ruleStringDirective
            {
             
            	        newCompositeNode(grammarAccess.getStrDirectiveAccess().getNameStringDirectiveParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStringDirective_in_rulestrDirective1353);
            lv_name_0_0=ruleStringDirective();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStrDirectiveRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"StringDirective");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulestrDirective1365); 

                	newLeafNode(otherlv_1, grammarAccess.getStrDirectiveAccess().getColonKeyword_1());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:622:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:623:1: (lv_value_2_0= RULE_STRING )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:623:1: (lv_value_2_0= RULE_STRING )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:624:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulestrDirective1382); 

            			newLeafNode(lv_value_2_0, grammarAccess.getStrDirectiveAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStrDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestrDirective"


    // $ANTLR start "entryRuleintDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:648:1: entryRuleintDirective returns [EObject current=null] : iv_ruleintDirective= ruleintDirective EOF ;
    public final EObject entryRuleintDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleintDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:649:2: (iv_ruleintDirective= ruleintDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:650:2: iv_ruleintDirective= ruleintDirective EOF
            {
             newCompositeNode(grammarAccess.getIntDirectiveRule()); 
            pushFollow(FOLLOW_ruleintDirective_in_entryRuleintDirective1423);
            iv_ruleintDirective=ruleintDirective();

            state._fsp--;

             current =iv_ruleintDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleintDirective1433); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleintDirective"


    // $ANTLR start "ruleintDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:657:1: ruleintDirective returns [EObject current=null] : ( ( (lv_name_0_0= ruleIntegerDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleintDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:660:28: ( ( ( (lv_name_0_0= ruleIntegerDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:661:1: ( ( (lv_name_0_0= ruleIntegerDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:661:1: ( ( (lv_name_0_0= ruleIntegerDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:661:2: ( (lv_name_0_0= ruleIntegerDirective ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:661:2: ( (lv_name_0_0= ruleIntegerDirective ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:662:1: (lv_name_0_0= ruleIntegerDirective )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:662:1: (lv_name_0_0= ruleIntegerDirective )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:663:3: lv_name_0_0= ruleIntegerDirective
            {
             
            	        newCompositeNode(grammarAccess.getIntDirectiveAccess().getNameIntegerDirectiveParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntegerDirective_in_ruleintDirective1479);
            lv_name_0_0=ruleIntegerDirective();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntDirectiveRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"IntegerDirective");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleintDirective1491); 

                	newLeafNode(otherlv_1, grammarAccess.getIntDirectiveAccess().getColonKeyword_1());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:683:1: ( (lv_value_2_0= RULE_INT ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:684:1: (lv_value_2_0= RULE_INT )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:684:1: (lv_value_2_0= RULE_INT )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:685:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleintDirective1508); 

            			newLeafNode(lv_value_2_0, grammarAccess.getIntDirectiveAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleintDirective"


    // $ANTLR start "entryRulevarDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:709:1: entryRulevarDirective returns [EObject current=null] : iv_rulevarDirective= rulevarDirective EOF ;
    public final EObject entryRulevarDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:710:2: (iv_rulevarDirective= rulevarDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:711:2: iv_rulevarDirective= rulevarDirective EOF
            {
             newCompositeNode(grammarAccess.getVarDirectiveRule()); 
            pushFollow(FOLLOW_rulevarDirective_in_entryRulevarDirective1549);
            iv_rulevarDirective=rulevarDirective();

            state._fsp--;

             current =iv_rulevarDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevarDirective1559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevarDirective"


    // $ANTLR start "rulevarDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:718:1: rulevarDirective returns [EObject current=null] : ( ( (lv_name_0_0= 'VAR' ) ) otherlv_1= ':' ( (lv_left_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= RULE_ID ) ) ) ;
    public final EObject rulevarDirective() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_left_2_0=null;
        Token otherlv_3=null;
        Token lv_right_4_0=null;

         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:721:28: ( ( ( (lv_name_0_0= 'VAR' ) ) otherlv_1= ':' ( (lv_left_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= RULE_ID ) ) ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:722:1: ( ( (lv_name_0_0= 'VAR' ) ) otherlv_1= ':' ( (lv_left_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= RULE_ID ) ) )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:722:1: ( ( (lv_name_0_0= 'VAR' ) ) otherlv_1= ':' ( (lv_left_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= RULE_ID ) ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:722:2: ( (lv_name_0_0= 'VAR' ) ) otherlv_1= ':' ( (lv_left_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= RULE_ID ) )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:722:2: ( (lv_name_0_0= 'VAR' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:723:1: (lv_name_0_0= 'VAR' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:723:1: (lv_name_0_0= 'VAR' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:724:3: lv_name_0_0= 'VAR'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_rulevarDirective1602); 

                    newLeafNode(lv_name_0_0, grammarAccess.getVarDirectiveAccess().getNameVARKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDirectiveRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "VAR");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulevarDirective1627); 

                	newLeafNode(otherlv_1, grammarAccess.getVarDirectiveAccess().getColonKeyword_1());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:741:1: ( (lv_left_2_0= RULE_ID ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:742:1: (lv_left_2_0= RULE_ID )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:742:1: (lv_left_2_0= RULE_ID )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:743:3: lv_left_2_0= RULE_ID
            {
            lv_left_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevarDirective1644); 

            			newLeafNode(lv_left_2_0, grammarAccess.getVarDirectiveAccess().getLeftIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"left",
                    		lv_left_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulevarDirective1661); 

                	newLeafNode(otherlv_3, grammarAccess.getVarDirectiveAccess().getEqualsSignKeyword_3());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:763:1: ( (lv_right_4_0= RULE_ID ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:764:1: (lv_right_4_0= RULE_ID )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:764:1: (lv_right_4_0= RULE_ID )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:765:3: lv_right_4_0= RULE_ID
            {
            lv_right_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevarDirective1678); 

            			newLeafNode(lv_right_4_0, grammarAccess.getVarDirectiveAccess().getRightIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"right",
                    		lv_right_4_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevarDirective"


    // $ANTLR start "entryRuleifDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:789:1: entryRuleifDirective returns [EObject current=null] : iv_ruleifDirective= ruleifDirective EOF ;
    public final EObject entryRuleifDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleifDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:790:2: (iv_ruleifDirective= ruleifDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:791:2: iv_ruleifDirective= ruleifDirective EOF
            {
             newCompositeNode(grammarAccess.getIfDirectiveRule()); 
            pushFollow(FOLLOW_ruleifDirective_in_entryRuleifDirective1719);
            iv_ruleifDirective=ruleifDirective();

            state._fsp--;

             current =iv_ruleifDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleifDirective1729); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleifDirective"


    // $ANTLR start "ruleifDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:798:1: ruleifDirective returns [EObject current=null] : ( ( (lv_name_0_0= 'IF' ) ) otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleoperator ) ) ( (lv_right_4_0= RULE_ID ) ) otherlv_5= ')' (otherlv_6= '{' )? ( (lv_directives_7_0= ruleDirective ) )* (otherlv_8= '}' )? ) ;
    public final EObject ruleifDirective() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_left_2_0=null;
        Token lv_right_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        EObject lv_directives_7_0 = null;


         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:801:28: ( ( ( (lv_name_0_0= 'IF' ) ) otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleoperator ) ) ( (lv_right_4_0= RULE_ID ) ) otherlv_5= ')' (otherlv_6= '{' )? ( (lv_directives_7_0= ruleDirective ) )* (otherlv_8= '}' )? ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:802:1: ( ( (lv_name_0_0= 'IF' ) ) otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleoperator ) ) ( (lv_right_4_0= RULE_ID ) ) otherlv_5= ')' (otherlv_6= '{' )? ( (lv_directives_7_0= ruleDirective ) )* (otherlv_8= '}' )? )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:802:1: ( ( (lv_name_0_0= 'IF' ) ) otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleoperator ) ) ( (lv_right_4_0= RULE_ID ) ) otherlv_5= ')' (otherlv_6= '{' )? ( (lv_directives_7_0= ruleDirective ) )* (otherlv_8= '}' )? )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:802:2: ( (lv_name_0_0= 'IF' ) ) otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleoperator ) ) ( (lv_right_4_0= RULE_ID ) ) otherlv_5= ')' (otherlv_6= '{' )? ( (lv_directives_7_0= ruleDirective ) )* (otherlv_8= '}' )?
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:802:2: ( (lv_name_0_0= 'IF' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:803:1: (lv_name_0_0= 'IF' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:803:1: (lv_name_0_0= 'IF' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:804:3: lv_name_0_0= 'IF'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleifDirective1772); 

                    newLeafNode(lv_name_0_0, grammarAccess.getIfDirectiveAccess().getNameIFKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIfDirectiveRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "IF");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleifDirective1797); 

                	newLeafNode(otherlv_1, grammarAccess.getIfDirectiveAccess().getLeftParenthesisKeyword_1());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:821:1: ( (lv_left_2_0= RULE_ID ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:822:1: (lv_left_2_0= RULE_ID )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:822:1: (lv_left_2_0= RULE_ID )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:823:3: lv_left_2_0= RULE_ID
            {
            lv_left_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleifDirective1814); 

            			newLeafNode(lv_left_2_0, grammarAccess.getIfDirectiveAccess().getLeftIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIfDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"left",
                    		lv_left_2_0, 
                    		"ID");
            	    

            }


            }

            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:839:2: ( (lv_operator_3_0= ruleoperator ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:840:1: (lv_operator_3_0= ruleoperator )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:840:1: (lv_operator_3_0= ruleoperator )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:841:3: lv_operator_3_0= ruleoperator
            {
             
            	        newCompositeNode(grammarAccess.getIfDirectiveAccess().getOperatorOperatorParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleoperator_in_ruleifDirective1840);
            lv_operator_3_0=ruleoperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfDirectiveRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:857:2: ( (lv_right_4_0= RULE_ID ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:858:1: (lv_right_4_0= RULE_ID )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:858:1: (lv_right_4_0= RULE_ID )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:859:3: lv_right_4_0= RULE_ID
            {
            lv_right_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleifDirective1857); 

            			newLeafNode(lv_right_4_0, grammarAccess.getIfDirectiveAccess().getRightIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIfDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"right",
                    		lv_right_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleifDirective1874); 

                	newLeafNode(otherlv_5, grammarAccess.getIfDirectiveAccess().getRightParenthesisKeyword_5());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:879:1: (otherlv_6= '{' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:879:3: otherlv_6= '{'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleifDirective1887); 

                        	newLeafNode(otherlv_6, grammarAccess.getIfDirectiveAccess().getLeftCurlyBracketKeyword_6());
                        

                    }
                    break;

            }

            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:883:3: ( (lv_directives_7_0= ruleDirective ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:884:1: (lv_directives_7_0= ruleDirective )
            	    {
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:884:1: (lv_directives_7_0= ruleDirective )
            	    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:885:3: lv_directives_7_0= ruleDirective
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfDirectiveAccess().getDirectivesDirectiveParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDirective_in_ruleifDirective1910);
            	    lv_directives_7_0=ruleDirective();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfDirectiveRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"directives",
            	            		lv_directives_7_0, 
            	            		"Directive");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:901:3: (otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:901:5: otherlv_8= '}'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleifDirective1924); 

                        	newLeafNode(otherlv_8, grammarAccess.getIfDirectiveAccess().getRightCurlyBracketKeyword_8());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleifDirective"


    // $ANTLR start "entryRulewaitDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:913:1: entryRulewaitDirective returns [EObject current=null] : iv_rulewaitDirective= rulewaitDirective EOF ;
    public final EObject entryRulewaitDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewaitDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:914:2: (iv_rulewaitDirective= rulewaitDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:915:2: iv_rulewaitDirective= rulewaitDirective EOF
            {
             newCompositeNode(grammarAccess.getWaitDirectiveRule()); 
            pushFollow(FOLLOW_rulewaitDirective_in_entryRulewaitDirective1962);
            iv_rulewaitDirective=rulewaitDirective();

            state._fsp--;

             current =iv_rulewaitDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewaitDirective1972); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewaitDirective"


    // $ANTLR start "rulewaitDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:922:1: rulewaitDirective returns [EObject current=null] : ( ( (lv_name_0_0= 'WAIT' ) ) otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject rulewaitDirective() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:925:28: ( ( ( (lv_name_0_0= 'WAIT' ) ) otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:926:1: ( ( (lv_name_0_0= 'WAIT' ) ) otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:926:1: ( ( (lv_name_0_0= 'WAIT' ) ) otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:926:2: ( (lv_name_0_0= 'WAIT' ) ) otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:926:2: ( (lv_name_0_0= 'WAIT' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:927:1: (lv_name_0_0= 'WAIT' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:927:1: (lv_name_0_0= 'WAIT' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:928:3: lv_name_0_0= 'WAIT'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_32_in_rulewaitDirective2015); 

                    newLeafNode(lv_name_0_0, grammarAccess.getWaitDirectiveAccess().getNameWAITKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaitDirectiveRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "WAIT");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulewaitDirective2040); 

                	newLeafNode(otherlv_1, grammarAccess.getWaitDirectiveAccess().getLeftParenthesisKeyword_1());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:945:1: ( (lv_time_2_0= RULE_INT ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:946:1: (lv_time_2_0= RULE_INT )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:946:1: (lv_time_2_0= RULE_INT )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:947:3: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulewaitDirective2057); 

            			newLeafNode(lv_time_2_0, grammarAccess.getWaitDirectiveAccess().getTimeINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaitDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_rulewaitDirective2074); 

                	newLeafNode(otherlv_3, grammarAccess.getWaitDirectiveAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewaitDirective"


    // $ANTLR start "entryRulelockDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:975:1: entryRulelockDirective returns [EObject current=null] : iv_rulelockDirective= rulelockDirective EOF ;
    public final EObject entryRulelockDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelockDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:976:2: (iv_rulelockDirective= rulelockDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:977:2: iv_rulelockDirective= rulelockDirective EOF
            {
             newCompositeNode(grammarAccess.getLockDirectiveRule()); 
            pushFollow(FOLLOW_rulelockDirective_in_entryRulelockDirective2110);
            iv_rulelockDirective=rulelockDirective();

            state._fsp--;

             current =iv_rulelockDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelockDirective2120); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelockDirective"


    // $ANTLR start "rulelockDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:984:1: rulelockDirective returns [EObject current=null] : ( ( (lv_name_0_0= 'LOCK' ) ) otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject rulelockDirective() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_variable_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:987:28: ( ( ( (lv_name_0_0= 'LOCK' ) ) otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:988:1: ( ( (lv_name_0_0= 'LOCK' ) ) otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:988:1: ( ( (lv_name_0_0= 'LOCK' ) ) otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ')' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:988:2: ( (lv_name_0_0= 'LOCK' ) ) otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:988:2: ( (lv_name_0_0= 'LOCK' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:989:1: (lv_name_0_0= 'LOCK' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:989:1: (lv_name_0_0= 'LOCK' )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:990:3: lv_name_0_0= 'LOCK'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_33_in_rulelockDirective2163); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLockDirectiveAccess().getNameLOCKKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLockDirectiveRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "LOCK");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulelockDirective2188); 

                	newLeafNode(otherlv_1, grammarAccess.getLockDirectiveAccess().getLeftParenthesisKeyword_1());
                
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1007:1: ( (lv_variable_2_0= RULE_ID ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1008:1: (lv_variable_2_0= RULE_ID )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1008:1: (lv_variable_2_0= RULE_ID )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1009:3: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelockDirective2205); 

            			newLeafNode(lv_variable_2_0, grammarAccess.getLockDirectiveAccess().getVariableIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLockDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_rulelockDirective2222); 

                	newLeafNode(otherlv_3, grammarAccess.getLockDirectiveAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelockDirective"


    // $ANTLR start "entryRuleoperator"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1037:1: entryRuleoperator returns [String current=null] : iv_ruleoperator= ruleoperator EOF ;
    public final String entryRuleoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperator = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1038:2: (iv_ruleoperator= ruleoperator EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1039:2: iv_ruleoperator= ruleoperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator2259);
            iv_ruleoperator=ruleoperator();

            state._fsp--;

             current =iv_ruleoperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator2270); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1046:1: ruleoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1049:28: ( (kw= '==' | kw= '!=' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1050:1: (kw= '==' | kw= '!=' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1050:1: (kw= '==' | kw= '!=' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            else if ( (LA11_0==35) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1051:2: kw= '=='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleoperator2308); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1058:2: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleoperator2327); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRuleIntegerDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1071:1: entryRuleIntegerDirective returns [String current=null] : iv_ruleIntegerDirective= ruleIntegerDirective EOF ;
    public final String entryRuleIntegerDirective() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1072:2: (iv_ruleIntegerDirective= ruleIntegerDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1073:2: iv_ruleIntegerDirective= ruleIntegerDirective EOF
            {
             newCompositeNode(grammarAccess.getIntegerDirectiveRule()); 
            pushFollow(FOLLOW_ruleIntegerDirective_in_entryRuleIntegerDirective2368);
            iv_ruleIntegerDirective=ruleIntegerDirective();

            state._fsp--;

             current =iv_ruleIntegerDirective.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDirective2379); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerDirective"


    // $ANTLR start "ruleIntegerDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1080:1: ruleIntegerDirective returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'EMOTE' | kw= 'DIRECTION' | kw= 'MOVEMENT' | kw= 'GOTO' ) ;
    public final AntlrDatatypeRuleToken ruleIntegerDirective() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1083:28: ( (kw= 'EMOTE' | kw= 'DIRECTION' | kw= 'MOVEMENT' | kw= 'GOTO' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1084:1: (kw= 'EMOTE' | kw= 'DIRECTION' | kw= 'MOVEMENT' | kw= 'GOTO' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1084:1: (kw= 'EMOTE' | kw= 'DIRECTION' | kw= 'MOVEMENT' | kw= 'GOTO' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 38:
                {
                alt12=3;
                }
                break;
            case 39:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1085:2: kw= 'EMOTE'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleIntegerDirective2417); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerDirectiveAccess().getEMOTEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1092:2: kw= 'DIRECTION'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleIntegerDirective2436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerDirectiveAccess().getDIRECTIONKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1099:2: kw= 'MOVEMENT'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleIntegerDirective2455); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerDirectiveAccess().getMOVEMENTKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1106:2: kw= 'GOTO'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleIntegerDirective2474); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerDirectiveAccess().getGOTOKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerDirective"


    // $ANTLR start "entryRuleStringDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1119:1: entryRuleStringDirective returns [String current=null] : iv_ruleStringDirective= ruleStringDirective EOF ;
    public final String entryRuleStringDirective() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringDirective = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1120:2: (iv_ruleStringDirective= ruleStringDirective EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1121:2: iv_ruleStringDirective= ruleStringDirective EOF
            {
             newCompositeNode(grammarAccess.getStringDirectiveRule()); 
            pushFollow(FOLLOW_ruleStringDirective_in_entryRuleStringDirective2515);
            iv_ruleStringDirective=ruleStringDirective();

            state._fsp--;

             current =iv_ruleStringDirective.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDirective2526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringDirective"


    // $ANTLR start "ruleStringDirective"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1128:1: ruleStringDirective returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CHAT' | kw= 'EFFET' | kw= 'VAR' | kw= 'IF' ) ;
    public final AntlrDatatypeRuleToken ruleStringDirective() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1131:28: ( (kw= 'CHAT' | kw= 'EFFET' | kw= 'VAR' | kw= 'IF' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1132:1: (kw= 'CHAT' | kw= 'EFFET' | kw= 'VAR' | kw= 'IF' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1132:1: (kw= 'CHAT' | kw= 'EFFET' | kw= 'VAR' | kw= 'IF' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt13=1;
                }
                break;
            case 41:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1133:2: kw= 'CHAT'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleStringDirective2564); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringDirectiveAccess().getCHATKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1140:2: kw= 'EFFET'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleStringDirective2583); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringDirectiveAccess().getEFFETKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1147:2: kw= 'VAR'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleStringDirective2602); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringDirectiveAccess().getVARKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1154:2: kw= 'IF'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleStringDirective2621); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringDirectiveAccess().getIFKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringDirective"


    // $ANTLR start "entryRuleScopeType"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1167:1: entryRuleScopeType returns [String current=null] : iv_ruleScopeType= ruleScopeType EOF ;
    public final String entryRuleScopeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScopeType = null;


        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1168:2: (iv_ruleScopeType= ruleScopeType EOF )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1169:2: iv_ruleScopeType= ruleScopeType EOF
            {
             newCompositeNode(grammarAccess.getScopeTypeRule()); 
            pushFollow(FOLLOW_ruleScopeType_in_entryRuleScopeType2662);
            iv_ruleScopeType=ruleScopeType();

            state._fsp--;

             current =iv_ruleScopeType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeType2673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopeType"


    // $ANTLR start "ruleScopeType"
    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1176:1: ruleScopeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TO_MAP' | kw= 'TO_TARGET' | kw= 'TO_SUBZONE' | kw= 'TO_ZONE' | kw= 'TO_SUPERZONE' | kw= 'TO_ALL' ) ;
    public final AntlrDatatypeRuleToken ruleScopeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1179:28: ( (kw= 'TO_MAP' | kw= 'TO_TARGET' | kw= 'TO_SUBZONE' | kw= 'TO_ZONE' | kw= 'TO_SUPERZONE' | kw= 'TO_ALL' ) )
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1180:1: (kw= 'TO_MAP' | kw= 'TO_TARGET' | kw= 'TO_SUBZONE' | kw= 'TO_ZONE' | kw= 'TO_SUPERZONE' | kw= 'TO_ALL' )
            {
            // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1180:1: (kw= 'TO_MAP' | kw= 'TO_TARGET' | kw= 'TO_SUBZONE' | kw= 'TO_ZONE' | kw= 'TO_SUPERZONE' | kw= 'TO_ALL' )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt14=1;
                }
                break;
            case 43:
                {
                alt14=2;
                }
                break;
            case 44:
                {
                alt14=3;
                }
                break;
            case 45:
                {
                alt14=4;
                }
                break;
            case 46:
                {
                alt14=5;
                }
                break;
            case 47:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1181:2: kw= 'TO_MAP'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleScopeType2711); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScopeTypeAccess().getTO_MAPKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1188:2: kw= 'TO_TARGET'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleScopeType2730); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScopeTypeAccess().getTO_TARGETKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1195:2: kw= 'TO_SUBZONE'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleScopeType2749); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScopeTypeAccess().getTO_SUBZONEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1202:2: kw= 'TO_ZONE'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleScopeType2768); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScopeTypeAccess().getTO_ZONEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1209:2: kw= 'TO_SUPERZONE'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleScopeType2787); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScopeTypeAccess().getTO_SUPERZONEKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../macroSDK/src-gen/macroscipting/parser/antlr/internal/InternalMacro.g:1216:2: kw= 'TO_ALL'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleScopeType2806); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScopeTypeAccess().getTO_ALLKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopeType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleonLoadBloc_in_ruleDomain131 = new BitSet(new long[]{0x0000000002000802L});
    public static final BitSet FOLLOW_ruleBloc_in_ruleDomain152 = new BitSet(new long[]{0x0000000002000802L});
    public static final BitSet FOLLOW_ruleClass_in_ruleDomain174 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClass258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass275 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleClass293 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleClass_in_ruleClass314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClass328 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClass340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleonLoadBloc_in_entryRuleonLoadBloc376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleonLoadBloc386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleonLoadBloc423 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleonLoadBloc435 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleonLoadBloc447 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleonLoadBloc459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleonLoadBloc476 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleonLoadBloc493 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleonLoadBloc505 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleonLoadBloc517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleonLoadBloc534 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleonLoadBloc551 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleonLoadBloc563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleonLoadBloc575 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleonLoadBloc592 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleonLoadBloc609 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleonLoadBloc621 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleonLoadBloc633 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleScopeType_in_ruleonLoadBloc654 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleonLoadBloc666 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleonLoadBloc678 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleonLoadBloc690 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleonLoadBloc709 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24_in_ruleonLoadBloc740 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleonLoadBloc753 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleonLoadBloc765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBloc_in_entryRuleBloc801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBloc811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBloc848 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBloc865 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBloc882 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_ruleDirective_in_ruleBloc903 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_14_in_ruleBloc916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_entryRuleDirective952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirective962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDirective999 = new BitSet(new long[]{0x000003F330000000L});
    public static final BitSet FOLLOW_ruleintDirective_in_ruleDirective1022 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulestrDirective_in_ruleDirective1049 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulevarDirective_in_ruleDirective1076 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleconditionnalDirective_in_ruleDirective1103 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDirective1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditionnalDirective_in_entryRuleconditionnalDirective1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditionnalDirective1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifDirective_in_ruleconditionnalDirective1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewaitDirective_in_ruleconditionnalDirective1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelockDirective_in_ruleconditionnalDirective1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestrDirective_in_entryRulestrDirective1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestrDirective1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDirective_in_rulestrDirective1353 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulestrDirective1365 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulestrDirective1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleintDirective_in_entryRuleintDirective1423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleintDirective1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDirective_in_ruleintDirective1479 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleintDirective1491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleintDirective1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevarDirective_in_entryRulevarDirective1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevarDirective1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulevarDirective1602 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulevarDirective1627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevarDirective1644 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulevarDirective1661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevarDirective1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifDirective_in_entryRuleifDirective1719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleifDirective1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleifDirective1772 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleifDirective1797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleifDirective1814 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleoperator_in_ruleifDirective1840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleifDirective1857 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleifDirective1874 = new BitSet(new long[]{0x0000000004006002L});
    public static final BitSet FOLLOW_13_in_ruleifDirective1887 = new BitSet(new long[]{0x0000000004004002L});
    public static final BitSet FOLLOW_ruleDirective_in_ruleifDirective1910 = new BitSet(new long[]{0x0000000004004002L});
    public static final BitSet FOLLOW_14_in_ruleifDirective1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewaitDirective_in_entryRulewaitDirective1962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewaitDirective1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulewaitDirective2015 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulewaitDirective2040 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulewaitDirective2057 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulewaitDirective2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelockDirective_in_entryRulelockDirective2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelockDirective2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulelockDirective2163 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulelockDirective2188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelockDirective2205 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulelockDirective2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator2259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleoperator2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleoperator2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDirective_in_entryRuleIntegerDirective2368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDirective2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleIntegerDirective2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIntegerDirective2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleIntegerDirective2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleIntegerDirective2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDirective_in_entryRuleStringDirective2515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDirective2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleStringDirective2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleStringDirective2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStringDirective2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStringDirective2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeType_in_entryRuleScopeType2662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeType2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleScopeType2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleScopeType2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleScopeType2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleScopeType2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleScopeType2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleScopeType2806 = new BitSet(new long[]{0x0000000000000002L});

}